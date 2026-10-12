package com.termux.shared.termux;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.termux.shared.R;
import com.termux.shared.android.AndroidUtils;
import com.termux.shared.data.DataUtils;
import com.termux.shared.file.FileUtils;
import com.termux.shared.reflection.ReflectionUtils;
import com.termux.shared.shell.command.runner.app.AppShell;
import com.termux.shared.termux.file.TermuxFileUtils;
import com.termux.shared.logger.Logger;
import com.termux.shared.markdown.MarkdownUtils;
import com.termux.shared.shell.command.ExecutionCommand;
import com.termux.shared.errors.Error;
import com.termux.shared.android.PackageUtils;
import com.termux.shared.termux.TermuxConstants.TERMUX_APP;
import com.termux.shared.termux.shell.command.environment.TermuxShellEnvironment;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.regex.Pattern;

public class TermuxUtils {

    public enum AppInfoMode {
        TERMUX_PACKAGE,
        TERMUX_AND_PLUGIN_PACKAGE,
        TERMUX_AND_PLUGIN_PACKAGES,
        TERMUX_PLUGIN_PACKAGES,
        TERMUX_AND_CALLING_PACKAGE,
    }

    private static final String LOG_TAG = "TermuxUtils";

    public static Context getTermuxPackageContext(@NonNull Context context) {
        if (context.getPackageName().equals(TermuxConstants.TERMUX_PACKAGE_NAME)) {
            return context;
        }
        Context pkgContext = PackageUtils.getContextForPackage(context, TermuxConstants.TERMUX_PACKAGE_NAME);
        return pkgContext != null ? pkgContext : context;
    }

    public static Context getTermuxPackageContextWithCode(@NonNull Context context) {
        if (context.getPackageName().equals(TermuxConstants.TERMUX_PACKAGE_NAME)) {
            return context;
        }
        Context pkgContext = PackageUtils.getContextForPackage(context, TermuxConstants.TERMUX_PACKAGE_NAME, Context.CONTEXT_INCLUDE_CODE);
        return pkgContext != null ? pkgContext : context;
    }

    public static Context getTermuxAPIPackageContext(@NonNull Context context) {
        return PackageUtils.getContextForPackage(context, TermuxConstants.TERMUX_API_PACKAGE_NAME);
    }

    public static Context getTermuxBootPackageContext(@NonNull Context context) {
        return PackageUtils.getContextForPackage(context, TermuxConstants.TERMUX_BOOT_PACKAGE_NAME);
    }

    public static Context getTermuxFloatPackageContext(@NonNull Context context) {
        return PackageUtils.getContextForPackage(context, TermuxConstants.TERMUX_FLOAT_PACKAGE_NAME);
    }

    public static Context getTermuxStylingPackageContext(@NonNull Context context) {
        return PackageUtils.getContextForPackage(context, TermuxConstants.TERMUX_STYLING_PACKAGE_NAME);
    }

    public static Context getTermuxTaskerPackageContext(@NonNull Context context) {
        return PackageUtils.getContextForPackage(context, TermuxConstants.TERMUX_TASKER_PACKAGE_NAME);
    }

    public static Context getTermuxWidgetPackageContext(@NonNull Context context) {
        return PackageUtils.getContextForPackage(context, TermuxConstants.TERMUX_WIDGET_PACKAGE_NAME);
    }

    public static Context getContextForPackageOrExitApp(@NonNull Context context, String packageName,
                                                        final boolean exitAppOnError) {
        return PackageUtils.getContextForPackageOrExitApp(context, packageName, exitAppOnError, TermuxConstants.TERMUX_GITHUB_REPO_URL);
    }

    public static String isTermuxAppInstalled(@NonNull final Context context) {
        return PackageUtils.isAppInstalled(context, TermuxConstants.TERMUX_APP_NAME, TermuxConstants.TERMUX_PACKAGE_NAME);
    }

    public static String isTermuxAPIAppInstalled(@NonNull final Context context) {
        return PackageUtils.isAppInstalled(context, TermuxConstants.TERMUX_API_APP_NAME, TermuxConstants.TERMUX_API_PACKAGE_NAME);
    }

    public static String isTermuxAppAccessible(@NonNull final Context currentPackageContext) {
        String errmsg = isTermuxAppInstalled(currentPackageContext);
        if (errmsg == null) {
            Context termuxPackageContext = TermuxUtils.getTermuxPackageContext(currentPackageContext);
            if (termuxPackageContext == null)
                errmsg = currentPackageContext.getString(R.string.error_termux_app_package_context_not_accessible);

            if (errmsg == null) {
                Error error = TermuxFileUtils.isTermuxPrefixDirectoryAccessible(false, false);
                if (error != null)
                    errmsg = currentPackageContext.getString(R.string.error_termux_prefix_dir_path_not_accessible,
                        PackageUtils.getAppNameForPackage(currentPackageContext));
            }
        }

        if (errmsg != null)
            return errmsg + " " + currentPackageContext.getString(R.string.msg_termux_app_required_by_app,
                PackageUtils.getAppNameForPackage(currentPackageContext));
        else
            return null;
    }

    public static Object getTermuxAppAPKBuildConfigClassField(@NonNull Context currentPackageContext,
                                                              @NonNull String fieldName) {
        return getTermuxAppAPKClassField(currentPackageContext, TERMUX_APP.BUILD_CONFIG_CLASS_NAME, fieldName);
    }

    public static Object getTermuxAppAPKClassField(@NonNull Context currentPackageContext,
                                                   @NonNull String clazzName, @NonNull String fieldName) {
        try {
            Context termuxPackageContext = TermuxUtils.getTermuxPackageContextWithCode(currentPackageContext);
            if (termuxPackageContext == null)
                return null;

            Class<?> clazz = termuxPackageContext.getClassLoader().loadClass(clazzName);
            return ReflectionUtils.invokeField(clazz, fieldName, null).value;
        } catch (Exception e) {
            Logger.logStackTraceWithMessage(LOG_TAG, "Failed to get \"" + fieldName + "\" value from \"" + clazzName + "\" class", e);
            return null;
        }
    }

    public static boolean isUriDataForTermuxOrPluginPackage(@NonNull Uri data) {
        return data.toString().equals("package:" + TermuxConstants.TERMUX_PACKAGE_NAME) ||
            data.toString().startsWith("package:" + TermuxConstants.TERMUX_PACKAGE_NAME + ".");
    }

    public static boolean isUriDataForTermuxPluginPackage(@NonNull Uri data) {
        return data.toString().startsWith("package:" + TermuxConstants.TERMUX_PACKAGE_NAME + ".");
    }

    public static void sendTermuxOpenedBroadcast(@NonNull Context context) {
        Intent broadcast = new Intent(TermuxConstants.BROADCAST_TERMUX_OPENED);
        List<ResolveInfo> matches = context.getPackageManager().queryBroadcastReceivers(broadcast, 0);

        for (ResolveInfo info : matches) {
            Intent explicitBroadcast = new Intent(broadcast);
            ComponentName cname = new ComponentName(info.activityInfo.applicationInfo.packageName,
                info.activityInfo.name);
            explicitBroadcast.setComponent(cname);
            context.sendBroadcast(explicitBroadcast);
        }
    }

    public static String getAppInfoMarkdownString(final Context currentPackageContext, final AppInfoMode appInfoMode) {
        return getAppInfoMarkdownString(currentPackageContext, appInfoMode, null);
    }

    public static String getAppInfoMarkdownString(final Context currentPackageContext, final AppInfoMode appInfoMode, @Nullable String callingPackageName) {
        if (appInfoMode == null) return null;

        StringBuilder appInfo = new StringBuilder();
        switch (appInfoMode) {
            case TERMUX_PACKAGE:
                return getAppInfoMarkdownString(currentPackageContext, false);

            case TERMUX_AND_PLUGIN_PACKAGE:
                return getAppInfoMarkdownString(currentPackageContext, true);

            case TERMUX_AND_PLUGIN_PACKAGES:
                appInfo.append(TermuxUtils.getAppInfoMarkdownString(currentPackageContext, false));

                String termuxPluginAppsInfo =  TermuxUtils.getTermuxPluginAppsInfoMarkdownString(currentPackageContext);
                if (termuxPluginAppsInfo != null)
                    appInfo.append("\n\n").append(termuxPluginAppsInfo);
                return appInfo.toString();

            case TERMUX_PLUGIN_PACKAGES:
                return TermuxUtils.getTermuxPluginAppsInfoMarkdownString(currentPackageContext);

            case TERMUX_AND_CALLING_PACKAGE:
                appInfo.append(TermuxUtils.getAppInfoMarkdownString(currentPackageContext, false));
                if (!DataUtils.isNullOrEmpty(callingPackageName)) {
                    String callingPackageAppInfo = null;
                    if (TermuxConstants.TERMUX_PLUGIN_APP_PACKAGE_NAMES_LIST.contains(callingPackageName)) {
                        Context termuxPluginAppContext = PackageUtils.getContextForPackage(currentPackageContext, callingPackageName);
                        if (termuxPluginAppContext != null)
                            appInfo.append(getAppInfoMarkdownString(termuxPluginAppContext, false));
                        else
                            callingPackageAppInfo = AndroidUtils.getAppInfoMarkdownString(currentPackageContext, callingPackageName);
                    } else {
                        callingPackageAppInfo = AndroidUtils.getAppInfoMarkdownString(currentPackageContext, callingPackageName);
                    }

                    if (callingPackageAppInfo != null) {
                        ApplicationInfo applicationInfo = PackageUtils.getApplicationInfoForPackage(currentPackageContext, callingPackageName);
                        if (applicationInfo != null) {
                            appInfo.append("\n\n## ").append(PackageUtils.getAppNameForPackage(currentPackageContext, applicationInfo)).append(" App Info\n");
                            appInfo.append(callingPackageAppInfo);
                            appInfo.append("\n##\n");
                        }
                    }
                }
                return appInfo.toString();

            default:
                return null;
        }
    }

    public static String getAppInfoMarkdownString(final Context currentPackageContext, boolean returnMarkdown) {
        return PackageUtils.getAppInfoMarkdownString(currentPackageContext, returnMarkdown);
    }

    public static String getTermuxPluginAppsInfoMarkdownString(final Context currentPackageContext) {
        if (currentPackageContext == null) return "null";
        StringBuilder markdownString = new StringBuilder();
        List<String> termuxPluginAppPackageNamesList = TermuxConstants.TERMUX_PLUGIN_APP_PACKAGE_NAMES_LIST;
        for (int i = 0; i < termuxPluginAppPackageNamesList.size(); i++) {
            String packageName = termuxPluginAppPackageNamesList.get(i);
            Context termuxPluginAppContext = PackageUtils.getContextForPackage(currentPackageContext, packageName);
            if (termuxPluginAppContext != null) {
                if (i != 0) markdownString.append("\n\n");
                markdownString.append(getAppInfoMarkdownString(termuxPluginAppContext, false));
            }
        }
        return markdownString.toString();
    }
    }
