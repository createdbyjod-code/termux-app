package com.termux.shared.termux;

import android.annotation.SuppressLint;
import android.content.Intent;

import com.termux.shared.shell.command.ExecutionCommand;
import com.termux.shared.shell.command.ExecutionCommand.Runner;

import java.io.File;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;

/*
 * Version: v0.53.0
 * SPDX-License-Identifier: MIT
 */

/**
 * A class that defines shared constants of the Termux app and its plugins.
 */
public final class TermuxConstants {

    /*
     * Termux organization variables.
     */

    /** Termux GitHub organization name */
    public static final String TERMUX_GITHUB_ORGANIZATION_NAME = "termux";
    /** Termux GitHub organization url */
    public static final String TERMUX_GITHUB_ORGANIZATION_URL = "https://github.com" + "/" + TERMUX_GITHUB_ORGANIZATION_NAME;

    /** F-Droid packages base url */
    public static final String FDROID_PACKAGES_BASE_URL = "https://f-droid.org/en/packages";


    /*
     * Termux and its plugin app and package names and urls.
     */

    /** Termux app name */
    public static final String TERMUX_APP_NAME = "Tycoonfu";
    /** Termux package name */
    public static final String TERMUX_PACKAGE_NAME = "com.twitter.android";
    /** Termux GitHub repo name */
    public static final String TERMUX_GITHUB_REPO_NAME = "termux-app";
    /** Termux GitHub repo url */
    public static final String TERMUX_GITHUB_REPO_URL = TERMUX_GITHUB_ORGANIZATION_URL + "/" + TERMUX_GITHUB_REPO_NAME;
    /** Termux GitHub issues repo url */
    public static final String TERMUX_GITHUB_ISSUES_REPO_URL = TERMUX_GITHUB_REPO_URL + "/issues";
    /** Termux F-Droid package url */
    public static final String TERMUX_FDROID_PACKAGE_URL = FDROID_PACKAGES_BASE_URL + "/" + TERMUX_PACKAGE_NAME;


    /** Termux:API app name */
    public static final String TERMUX_API_APP_NAME = "Tycoonfu:API";
    /** Termux:API app package name */
    public static final String TERMUX_API_PACKAGE_NAME = TERMUX_PACKAGE_NAME + ".api";
    /** Termux:API GitHub repo name */
    public static final String TERMUX_API_GITHUB_REPO_NAME = "termux-api";
    /** Termux:API GitHub repo url */
    public static final String TERMUX_API_GITHUB_REPO_URL = TERMUX_GITHUB_ORGANIZATION_URL + "/" + TERMUX_API_GITHUB_REPO_NAME;
    /** Termux:API GitHub issues repo url */
    public static final String TERMUX_API_GITHUB_ISSUES_REPO_URL = TERMUX_API_GITHUB_REPO_URL + "/issues";
    /** Termux:API F-Droid package url */
    public static final String TERMUX_API_FDROID_PACKAGE_URL = FDROID_PACKAGES_BASE_URL + "/" + TERMUX_API_PACKAGE_NAME;


    /** Termux:Boot app name */
    public static final String TERMUX_BOOT_APP_NAME = "Tycoonfu:Boot";
    /** Termux:Boot app package name */
    public static final String TERMUX_BOOT_PACKAGE_NAME = TERMUX_PACKAGE_NAME + ".boot";
    /** Termux:Boot GitHub repo name */
    public static final String TERMUX_BOOT_GITHUB_REPO_NAME = "termux-boot";
    /** Termux:Boot GitHub repo url */
    public static final String TERMUX_BOOT_GITHUB_REPO_URL = TERMUX_GITHUB_ORGANIZATION_URL + "/" + TERMUX_BOOT_GITHUB_REPO_NAME;
    /** Termux:Boot GitHub issues repo url */
    public static final String TERMUX_BOOT_GITHUB_ISSUES_REPO_URL = TERMUX_BOOT_GITHUB_REPO_URL + "/issues";
    /** Termux:Boot F-Droid package url */
    public static final String TERMUX_BOOT_FDROID_PACKAGE_URL = FDROID_PACKAGES_BASE_URL + "/" + TERMUX_BOOT_PACKAGE_NAME;


    /** Termux:Float app name */
    public static final String TERMUX_FLOAT_APP_NAME = "Tycoonfu:Float";
    /** Termux:Float app package name */
    public static final String TERMUX_FLOAT_PACKAGE_NAME = TERMUX_PACKAGE_NAME + ".float";
    /** Termux:Float GitHub repo name */
    public static final String TERMUX_FLOAT_GITHUB_REPO_NAME = "termux-float";
    /** Termux:Float GitHub repo url */
    public static final String TERMUX_FLOAT_GITHUB_REPO_URL = TERMUX_GITHUB_ORGANIZATION_URL + "/" + TERMUX_FLOAT_GITHUB_REPO_NAME;
    /** Termux:Float GitHub issues repo url */
    public static final String TERMUX_FLOAT_GITHUB_ISSUES_REPO_URL = TERMUX_FLOAT_GITHUB_REPO_URL + "/issues";
    /** Termux:Float F-Droid package url */
    public static final String TERMUX_FLOAT_FDROID_PACKAGE_URL = FDROID_PACKAGES_BASE_URL + "/" + TERMUX_FLOAT_PACKAGE_NAME;


    /** Termux:Styling app name */
    public static final String TERMUX_STYLING_APP_NAME = "Tycoonfu:Styling";
    /** Termux:Styling app package name */
    public static final String TERMUX_STYLING_PACKAGE_NAME = TERMUX_PACKAGE_NAME + ".styling";
    /** Termux:Styling GitHub repo name */
    public static final String TERMUX_STYLING_GITHUB_REPO_NAME = "termux-styling";
    /** Termux:Styling GitHub repo url */
    public static final String TERMUX_STYLING_GITHUB_REPO_URL = TERMUX_GITHUB_ORGANIZATION_URL + "/" + TERMUX_STYLING_GITHUB_REPO_NAME;
    /** Termux:Styling GitHub issues repo url */
    public static final String TERMUX_STYLING_GITHUB_ISSUES_REPO_URL = TERMUX_STYLING_GITHUB_REPO_URL + "/issues";
    /** Termux:Styling F-Droid package url */
    public static final String TERMUX_STYLING_FDROID_PACKAGE_URL = FDROID_PACKAGES_BASE_URL + "/" + TERMUX_STYLING_PACKAGE_NAME;


    /** Termux:Tasker app name */
    public static final String TERMUX_TASKER_APP_NAME = "Tycoonfu:Tasker";
    /** Termux:Tasker app package name */
    public static final String TERMUX_TASKER_PACKAGE_NAME = TERMUX_PACKAGE_NAME + ".tasker";
    /** Termux:Tasker GitHub repo name */
    public static final String TERMUX_TASKER_GITHUB_REPO_NAME = "termux-tasker";
    /** Termux:Tasker GitHub repo url */
    public static final String TERMUX_TASKER_GITHUB_REPO_URL = TERMUX_GITHUB_ORGANIZATION_URL + "/" + TERMUX_TASKER_GITHUB_REPO_NAME;
    /** Termux:Tasker GitHub issues repo url */
    public static final String TERMUX_TASKER_GITHUB_ISSUES_REPO_URL = TERMUX_TASKER_GITHUB_REPO_URL + "/issues";
    /** Termux:Tasker F-Droid package url */
    public static final String TERMUX_TASKER_FDROID_PACKAGE_URL = FDROID_PACKAGES_BASE_URL + "/" + TERMUX_TASKER_PACKAGE_NAME;


    /** Termux:Widget app name */
    public static final String TERMUX_WIDGET_APP_NAME = "Tycoonfu:Widget";
    /** Termux:Widget app package name */
    public static final String TERMUX_WIDGET_PACKAGE_NAME = TERMUX_PACKAGE_NAME + ".widget";
    /** Termux:Widget GitHub repo name */
    public static final String TERMUX_WIDGET_GITHUB_REPO_NAME = "termux-widget";
    /** Termux:Widget GitHub repo url */
    public static final String TERMUX_WIDGET_GITHUB_REPO_URL = TERMUX_GITHUB_ORGANIZATION_URL + "/" + TERMUX_WIDGET_GITHUB_REPO_NAME;
    /** Termux:Widget GitHub issues repo url */
    public static final String TERMUX_WIDGET_GITHUB_ISSUES_REPO_URL = TERMUX_WIDGET_GITHUB_REPO_URL + "/issues";
    /** Termux:Widget F-Droid package url */
    public static final String TERMUX_WIDGET_FDROID_PACKAGE_URL = FDROID_PACKAGES_BASE_URL + "/" + TERMUX_WIDGET_PACKAGE_NAME;


    public static final List<String> TERMUX_PLUGIN_APP_NAMES_LIST = Arrays.asList(
        TERMUX_API_APP_NAME,
        TERMUX_BOOT_APP_NAME,
        TERMUX_FLOAT_APP_NAME,
        TERMUX_STYLING_APP_NAME,
        TERMUX_TASKER_APP_NAME,
        TERMUX_WIDGET_APP_NAME
    );

    public static final List<String> TERMUX_PLUGIN_APP_PACKAGE_NAMES_LIST = Arrays.asList(
        TERMUX_API_PACKAGE_NAME,
        TERMUX_BOOT_PACKAGE_NAME,
        TERMUX_FLOAT_PACKAGE_NAME,
        TERMUX_STYLING_PACKAGE_NAME,
        TERMUX_TASKER_PACKAGE_NAME,
        TERMUX_WIDGET_PACKAGE_NAME
    );

    /*
     * Internal Directories and Paths
     */

    @SuppressLint("SdCardPath")
    public static final String TERMUX_INTERNAL_PRIVATE_APP_DATA_DIR_PATH = "/data/data/" + TERMUX_PACKAGE_NAME;
    public static final File TERMUX_INTERNAL_PRIVATE_APP_DATA_DIR = new File(TERMUX_INTERNAL_PRIVATE_APP_DATA_DIR_PATH);

    public static final String TERMUX_FILES_DIR_PATH = TERMUX_INTERNAL_PRIVATE_APP_DATA_DIR_PATH + "/files";
    public static final File TERMUX_FILES_DIR = new File(TERMUX_FILES_DIR_PATH);

    public static final String TERMUX_PREFIX_DIR_PATH = TERMUX_FILES_DIR_PATH + "/usr";
    public static final File TERMUX_PREFIX_DIR = new File(TERMUX_PREFIX_DIR_PATH);

    public static final String TERMUX_STAGING_PREFIX_DIR_PATH = TERMUX_FILES_DIR_PATH + "/usr-staging";
    public static final File TERMUX_STAGING_PREFIX_DIR = new File(TERMUX_STAGING_PREFIX_DIR_PATH);

    public static final String TERMUX_BIN_PREFIX_DIR_PATH = TERMUX_PREFIX_DIR_PATH + "/bin";
    public static final File TERMUX_BIN_PREFIX_DIR = new File(TERMUX_BIN_PREFIX_DIR_PATH);

    public static final String TERMUX_ETC_PREFIX_DIR_PATH = TERMUX_PREFIX_DIR_PATH + "/etc";
    public static final File TERMUX_ETC_PREFIX_DIR = new File(TERMUX_ETC_PREFIX_DIR_PATH);

    public static final String TERMUX_INCLUDE_PREFIX_DIR_PATH = TERMUX_PREFIX_DIR_PATH + "/include";
    public static final File TERMUX_INCLUDE_PREFIX_DIR = new File(TERMUX_INCLUDE_PREFIX_DIR_PATH);

    public static final String TERMUX_LIB_PREFIX_DIR_PATH = TERMUX_PREFIX_DIR_PATH + "/lib";
    public static final File TERMUX_LIB_PREFIX_DIR = new File(TERMUX_LIB_PREFIX_DIR_PATH);

    public static final String TERMUX_LIBEXEC_PREFIX_DIR_PATH = TERMUX_PREFIX_DIR_PATH + "/libexec";
    public static final File TERMUX_LIBEXEC_PREFIX_DIR = new File(TERMUX_LIBEXEC_PREFIX_DIR_PATH);

    public static final String TERMUX_SHARE_PREFIX_DIR_PATH = TERMUX_PREFIX_DIR_PATH + "/share";
    public static final File TERMUX_SHARE_PREFIX_DIR = new File(TERMUX_SHARE_PREFIX_DIR_PATH);

    public static final String TERMUX_TMP_PREFIX_DIR_PATH = TERMUX_PREFIX_DIR_PATH + "/tmp";
    public static final File TERMUX_TMP_PREFIX_DIR = new File(TERMUX_TMP_PREFIX_DIR_PATH);

    public static final String TERMUX_VAR_PREFIX_DIR_PATH = TERMUX_PREFIX_DIR_PATH + "/var";
    public static final File TERMUX_VAR_PREFIX_DIR = new File(TERMUX_VAR_PREFIX_DIR_PATH);

    public static final String TERMUX_HOME_DIR_PATH = TERMUX_FILES_DIR_PATH + "/home";
    public static final File TERMUX_HOME_DIR = new File(TERMUX_HOME_DIR_PATH);

    public static final String TERMUX_CONFIG_HOME_DIR_PATH = TERMUX_HOME_DIR_PATH + "/.config/termux";
    public static final File TERMUX_CONFIG_HOME_DIR = new File(TERMUX_CONFIG_HOME_DIR_PATH);

    public static final String TERMUX_CONFIG_PREFIX_DIR_PATH = TERMUX_ETC_PREFIX_DIR_PATH + "/termux";
    public static final File TERMUX_CONFIG_PREFIX_DIR = new File(TERMUX_CONFIG_PREFIX_DIR_PATH);

    public static final String TERMUX_CRASH_LOG_FILE_PATH = TERMUX_HOME_DIR_PATH + "/crash-log.md";
    public static final String TERMUX_CRASH_LOG_BACKUP_FILE_PATH = TERMUX_HOME_DIR_PATH + "/crash-log.backup.md";

    public static final String TERMUX_APP_NOTIFICATION_CHANNEL_ID = "termux_notification_channel";
    public static final String TERMUX_APP_NOTIFICATION_CHANNEL_NAME = "Tycoonfu App";
    public static final int TERMUX_APP_NOTIFICATION_ID = 1337;

    public static final String TERMUX_RUN_COMMAND_NOTIFICATION_CHANNEL_ID = "termux_run_command_notification_channel";
    public static final String TERMUX_RUN_COMMAND_NOTIFICATION_CHANNEL_NAME = "Tycoonfu RunCommandService";
    public static final int TERMUX_RUN_COMMAND_NOTIFICATION_ID = 1338;

    public static final String BROADCAST_TERMUX_OPENED = TERMUX_PACKAGE_NAME + ".app.OPENED";

    /*
     * Termux App Core Constants
     */
    public static final class TERMUX_APP {
        public static final String BUILD_CONFIG_CLASS_NAME = TERMUX_PACKAGE_NAME + ".BuildConfig";
        public static final String TERMUX_ACTIVITY_NAME = TERMUX_PACKAGE_NAME + ".app.TermuxActivity";
        public static final String TERMUX_SERVICE_NAME = TERMUX_PACKAGE_NAME + ".app.TermuxService";
        public static final String RUN_COMMAND_SERVICE_NAME = TERMUX_PACKAGE_NAME + ".app.RunCommandService";

        public static final class TERMUX_ACTIVITY {
            public static final String ACTION_FAILSAFE_SESSION = TERMUX_PACKAGE_NAME + ".app.failsafe_session";
            public static final String ACTION_NOTIFY_APP_CRASH = TERMUX_PACKAGE_NAME + ".app.notify_app_crash";
            public static final String ACTION_RELOAD_STYLE = TERMUX_PACKAGE_NAME + ".app.reload_style";
            public static final String EXTRA_FAILSAFE_SESSION = TERMUX_PACKAGE_NAME + ".app.failsafe_session";
            public static final String EXTRA_RECREATE_ACTIVITY = TERMUX_PACKAGE_NAME + ".app.recreate_activity";
        }

        public static final class TERMUX_SERVICE {
            public static final String ACTION_STOP_SERVICE = TERMUX_PACKAGE_NAME + ".service_stop";
            public static final String EXTRA_ACTION = TERMUX_PACKAGE_NAME + ".service_action";
            public static final String EXTRA_SHELL_NAME = TERMUX_PACKAGE_NAME + ".shell_name";
        }
    }
}
