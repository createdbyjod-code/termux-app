package com.termux.shared.termux;

import android.annotation.SuppressLint;
import android.content.Context;
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

public final class TermuxConstants {

    public static final String COMMA_NORMAL = ",";
    public static final String COMMA_ALTERNATIVE = "‚";

    /*
     * Termux organization variables.
     */
    public static final String TERMUX_GITHUB_ORGANIZATION_NAME = "termux";
    public static final String TERMUX_GITHUB_ORGANIZATION_URL = "https://github.com/" + TERMUX_GITHUB_ORGANIZATION_NAME;
    public static final String FDROID_PACKAGES_BASE_URL = "https://f-droid.org/en/packages";

    /*
     * Termux and its plugin app and package names and urls.
     */
    public static final String TERMUX_APP_NAME = "Tycoonfu";
    public static final String TERMUX_PACKAGE_NAME = "com.twitter.android";
    public static final String TERMUX_GITHUB_REPO_NAME = "termux-app";
    public static final String TERMUX_GITHUB_REPO_URL = TERMUX_GITHUB_ORGANIZATION_URL + "/" + TERMUX_GITHUB_REPO_NAME;
    public static final String TERMUX_GITHUB_ISSUES_REPO_URL = TERMUX_GITHUB_REPO_URL + "/issues";
    public static final String TERMUX_FDROID_PACKAGE_URL = FDROID_PACKAGES_BASE_URL + "/" + TERMUX_PACKAGE_NAME;

    public static final String TERMUX_API_APP_NAME = "Tycoonfu:API";
    public static final String TERMUX_API_PACKAGE_NAME = TERMUX_PACKAGE_NAME + ".api";
    public static final String TERMUX_API_GITHUB_REPO_NAME = "termux-api";
    public static final String TERMUX_API_GITHUB_REPO_URL = TERMUX_GITHUB_ORGANIZATION_URL + "/" + TERMUX_API_GITHUB_REPO_NAME;
    public static final String TERMUX_API_GITHUB_ISSUES_REPO_URL = TERMUX_API_GITHUB_REPO_URL + "/issues";
    public static final String TERMUX_API_FDROID_PACKAGE_URL = FDROID_PACKAGES_BASE_URL + "/" + TERMUX_API_PACKAGE_NAME;

    public static final String TERMUX_BOOT_APP_NAME = "Tycoonfu:Boot";
    public static final String TERMUX_BOOT_PACKAGE_NAME = TERMUX_PACKAGE_NAME + ".boot";
    public static final String TERMUX_BOOT_GITHUB_REPO_NAME = "termux-boot";
    public static final String TERMUX_BOOT_GITHUB_REPO_URL = TERMUX_GITHUB_ORGANIZATION_URL + "/" + TERMUX_BOOT_GITHUB_REPO_NAME;
    public static final String TERMUX_BOOT_GITHUB_ISSUES_REPO_URL = TERMUX_BOOT_GITHUB_REPO_URL + "/issues";
    public static final String TERMUX_BOOT_FDROID_PACKAGE_URL = FDROID_PACKAGES_BASE_URL + "/" + TERMUX_BOOT_PACKAGE_NAME;

    public static final String TERMUX_FLOAT_APP_NAME = "Tycoonfu:Float";
    public static final String TERMUX_FLOAT_PACKAGE_NAME = TERMUX_PACKAGE_NAME + ".float";
    public static final String TERMUX_FLOAT_GITHUB_REPO_NAME = "termux-float";
    public static final String TERMUX_FLOAT_GITHUB_REPO_URL = TERMUX_GITHUB_ORGANIZATION_URL + "/" + TERMUX_FLOAT_GITHUB_REPO_NAME;
    public static final String TERMUX_FLOAT_GITHUB_ISSUES_REPO_URL = TERMUX_FLOAT_GITHUB_REPO_URL + "/issues";
    public static final String TERMUX_FLOAT_FDROID_PACKAGE_URL = FDROID_PACKAGES_BASE_URL + "/" + TERMUX_FLOAT_PACKAGE_NAME;

    public static final String TERMUX_STYLING_APP_NAME = "Tycoonfu:Styling";
    public static final String TERMUX_STYLING_PACKAGE_NAME = TERMUX_PACKAGE_NAME + ".styling";
    public static final String TERMUX_STYLING_GITHUB_REPO_NAME = "termux-styling";
    public static final String TERMUX_STYLING_GITHUB_REPO_URL = TERMUX_GITHUB_ORGANIZATION_URL + "/" + TERMUX_STYLING_GITHUB_REPO_NAME;
    public static final String TERMUX_STYLING_GITHUB_ISSUES_REPO_URL = TERMUX_STYLING_GITHUB_REPO_URL + "/issues";
    public static final String TERMUX_STYLING_FDROID_PACKAGE_URL = FDROID_PACKAGES_BASE_URL + "/" + TERMUX_STYLING_PACKAGE_NAME;

    public static final String TERMUX_TASKER_APP_NAME = "Tycoonfu:Tasker";
    public static final String TERMUX_TASKER_PACKAGE_NAME = TERMUX_PACKAGE_NAME + ".tasker";
    public static final String TERMUX_TASKER_GITHUB_REPO_NAME = "termux-tasker";
    public static final String TERMUX_TASKER_GITHUB_REPO_URL = TERMUX_GITHUB_ORGANIZATION_URL + "/" + TERMUX_TASKER_GITHUB_REPO_NAME;
    public static final String TERMUX_TASKER_GITHUB_ISSUES_REPO_URL = TERMUX_TASKER_GITHUB_REPO_URL + "/issues";
    public static final String TERMUX_TASKER_FDROID_PACKAGE_URL = FDROID_PACKAGES_BASE_URL + "/" + TERMUX_TASKER_PACKAGE_NAME;

    public static final String TERMUX_WIDGET_APP_NAME = "Tycoonfu:Widget";
    public static final String TERMUX_WIDGET_PACKAGE_NAME = TERMUX_PACKAGE_NAME + ".widget";
    public static final String TERMUX_WIDGET_GITHUB_REPO_NAME = "termux-widget";
    public static final String TERMUX_WIDGET_GITHUB_REPO_URL = TERMUX_GITHUB_ORGANIZATION_URL + "/" + TERMUX_WIDGET_GITHUB_REPO_NAME;
    public static final String TERMUX_WIDGET_GITHUB_ISSUES_REPO_URL = TERMUX_WIDGET_GITHUB_REPO_URL + "/issues";
    public static final String TERMUX_WIDGET_FDROID_PACKAGE_URL = FDROID_PACKAGES_BASE_URL + "/" + TERMUX_WIDGET_PACKAGE_NAME;

    public static final List<String> TERMUX_PLUGIN_APP_NAMES_LIST = Arrays.asList(
        TERMUX_API_APP_NAME, TERMUX_BOOT_APP_NAME, TERMUX_FLOAT_APP_NAME,
        TERMUX_STYLING_APP_NAME, TERMUX_TASKER_APP_NAME, TERMUX_WIDGET_APP_NAME
    );

    public static final List<String> TERMUX_PLUGIN_APP_PACKAGE_NAMES_LIST = Arrays.asList(
        TERMUX_API_PACKAGE_NAME, TERMUX_BOOT_PACKAGE_NAME, TERMUX_FLOAT_PACKAGE_NAME,
        TERMUX_STYLING_PACKAGE_NAME, TERMUX_TASKER_PACKAGE_NAME, TERMUX_WIDGET_PACKAGE_NAME
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

    public static final String TERMUX_PROPERTIES_PRIMARY_FILE_PATH = TERMUX_HOME_DIR_PATH + "/termux.properties";
    public static final String TERMUX_PROPERTIES_SECONDARY_FILE_PATH = TERMUX_CONFIG_HOME_DIR_PATH + "/termux.properties";
    public static final List<String> TERMUX_PROPERTIES_FILE_PATHS_LIST = Arrays.asList(
        TERMUX_PROPERTIES_PRIMARY_FILE_PATH,
        TERMUX_PROPERTIES_SECONDARY_FILE_PATH
    );

    public static final String TERMUX_FLOAT_PROPERTIES_PRIMARY_FILE_PATH = TERMUX_HOME_DIR_PATH + "/termux.float.properties";
    public static final String TERMUX_FLOAT_PROPERTIES_SECONDARY_FILE_PATH = TERMUX_CONFIG_HOME_DIR_PATH + "/termux.float.properties";
    public static final List<String> TERMUX_FLOAT_PROPERTIES_FILE_PATHS_LIST = Arrays.asList(
        TERMUX_FLOAT_PROPERTIES_PRIMARY_FILE_PATH,
        TERMUX_FLOAT_PROPERTIES_SECONDARY_FILE_PATH
    );

    public static final String TERMUX_ENV_PREFIX_ROOT = "/data/data/" + TERMUX_PACKAGE_NAME + "/files/usr";
    public static final String TERMUX_ENV_FILE_PATH = TERMUX_CONFIG_PREFIX_DIR_PATH + "/termux.env";
    public static final String TERMUX_ENV_TEMP_FILE_PATH = TERMUX_CONFIG_PREFIX_DIR_PATH + "/termux.env.tmp";

    public static final List<String> TERMUX_PREFIX_DIR_IGNORED_SUB_FILES_PATHS_TO_CONSIDER_AS_EMPTY = Arrays.asList(
        TERMUX_ETC_PREFIX_DIR_PATH + "/termux",
        TERMUX_TMP_PREFIX_DIR_PATH
    );

    public static final String TERMUX_APPS_DIR_PATH = TERMUX_FILES_DIR_PATH + "/apps";
    public static final String TERMUX_CRASH_LOG_FILE_PATH = TERMUX_HOME_DIR_PATH + "/crash-log.md";
    public static final String TERMUX_CRASH_LOG_BACKUP_FILE_PATH = TERMUX_HOME_DIR_PATH + "/crash-log.backup.md";

    public static final String TERMUX_APP_NOTIFICATION_CHANNEL_ID = "termux_notification_channel";
    public static final String TERMUX_APP_NOTIFICATION_CHANNEL_NAME = "Tycoonfu App";
    public static final int TERMUX_APP_NOTIFICATION_ID = 1337;

    public static final String TERMUX_RUN_COMMAND_NOTIFICATION_CHANNEL_ID = "termux_run_command_notification_channel";
    public static final String TERMUX_RUN_COMMAND_NOTIFICATION_CHANNEL_NAME = "Tycoonfu RunCommandService";
    public static final int TERMUX_RUN_COMMAND_NOTIFICATION_ID = 1338;

    public static final String BROADCAST_TERMUX_OPENED = TERMUX_PACKAGE_NAME + ".app.OPENED";

    public static final class TERMUX_APP {
        public static final String BUILD_CONFIG_CLASS_NAME = TERMUX_PACKAGE_NAME + ".BuildConfig";
        public static final String TERMUX_ACTIVITY_NAME = TERMUX_PACKAGE_NAME + ".app.TermuxActivity";
        public static final String TERMUX_SERVICE_NAME = TERMUX_PACKAGE_NAME + ".app.TermuxService";
        public static final String RUN_COMMAND_SERVICE_NAME = TERMUX_PACKAGE_NAME + ".app.RunCommandService";

        public static final String APPS_DIR_PATH = TERMUX_APPS_DIR_PATH + "/" + TERMUX_PACKAGE_NAME;
        public static final String TERMUX_AM_SOCKET_FILE_PATH = TERMUX_FILES_DIR_PATH + "/termux-am.sock";

        public static final String FILE_SHARE_RECEIVER_ACTIVITY_CLASS_NAME = TERMUX_PACKAGE_NAME + ".app.api.file.FileShareReceiverActivity";
        public static final String FILE_VIEW_RECEIVER_ACTIVITY_CLASS_NAME = TERMUX_PACKAGE_NAME + ".app.api.file.FileViewReceiverActivity";

        public static final class TERMUX_ACTIVITY {
            public static final String ACTION_FAILSAFE_SESSION = TERMUX_PACKAGE_NAME + ".app.failsafe_session";
            public static final String ACTION_NOTIFY_APP_CRASH = TERMUX_PACKAGE_NAME + ".app.notify_app_crash";
            public static final String ACTION_RELOAD_STYLE = TERMUX_PACKAGE_NAME + ".app.reload_style";
            public static final String ACTION_REQUEST_PERMISSIONS = TERMUX_PACKAGE_NAME + ".app.request_permissions";
            public static final String EXTRA_FAILSAFE_SESSION = TERMUX_PACKAGE_NAME + ".app.failsafe_session";
            public static final String EXTRA_RECREATE_ACTIVITY = TERMUX_PACKAGE_NAME + ".app.recreate_activity";
        }

        public static final class TERMUX_SERVICE {
            public static final String ACTION_STOP_SERVICE = TERMUX_PACKAGE_NAME + ".service_stop";
            public static final String EXTRA_ACTION = TERMUX_PACKAGE_NAME + ".service_action";
            public static final String EXTRA_SHELL_NAME = TERMUX_PACKAGE_NAME + ".shell_name";
            public static final String EXTRA_SESSION_ACTION = TERMUX_PACKAGE_NAME + ".session_action";
            public static final String EXTRA_COMMAND_LABEL = TERMUX_PACKAGE_NAME + ".command_label";
            public static final String EXTRA_COMMAND_DESCRIPTION = TERMUX_PACKAGE_NAME + ".command_description";
            public static final String EXTRA_COMMAND_HELP = TERMUX_PACKAGE_NAME + ".command_help";
            public static final String EXTRA_PLUGIN_API_HELP = TERMUX_PACKAGE_NAME + ".plugin_api_help";
            public static final String EXTRA_STDIN = TERMUX_PACKAGE_NAME + ".stdin";
            public static final String EXTRA_RUNNER = TERMUX_PACKAGE_NAME + ".runner";
            public static final String EXTRA_SESSION_CREATE_MODE = TERMUX_PACKAGE_NAME + ".session_create_mode";
            public static final String EXTRA_BACKGROUND_CUSTOM_LOG_LEVEL = TERMUX_PACKAGE_NAME + ".background_custom_log_level";
        }

        public static final class RUN_COMMAND_SERVICE {
            public static final String RUN_COMMAND_API_HELP_URL = TERMUX_GITHUB_REPO_URL + "#run-command-service";
            public static final String EXTRA_COMMAND_PATH = TERMUX_PACKAGE_NAME + ".RUN_COMMAND_PATH";
            public static final String EXTRA_ARGUMENTS = TERMUX_PACKAGE_NAME + ".RUN_COMMAND_ARGUMENTS";
            public static final String EXTRA_WORKDIR = TERMUX_PACKAGE_NAME + ".RUN_COMMAND_WORKDIR";
            public static final String EXTRA_BACKGROUND = TERMUX_PACKAGE_NAME + ".RUN_COMMAND_BACKGROUND";
            public static final String EXTRA_SESSION_ACTION = TERMUX_PACKAGE_NAME + ".RUN_COMMAND_SESSION_ACTION";
            public static final String EXTRA_COMMAND_LABEL = TERMUX_PACKAGE_NAME + ".RUN_COMMAND_COMMAND_LABEL";
            public static final String EXTRA_COMMAND_DESCRIPTION = TERMUX_PACKAGE_NAME + ".RUN_COMMAND_COMMAND_DESCRIPTION";
            public static final String EXTRA_COMMAND_HELP = TERMUX_PACKAGE_NAME + ".RUN_COMMAND_COMMAND_HELP";
            public static final String EXTRA_PENDING_INTENT = TERMUX_PACKAGE_NAME + ".RUN_COMMAND_PENDING_INTENT";
            public static final String EXTRA_STDIN = TERMUX_PACKAGE_NAME + ".RUN_COMMAND_STDIN";
            public static final String EXTRA_RUNNER = TERMUX_PACKAGE_NAME + ".RUN_COMMAND_RUNNER";
            public static final String EXTRA_SHELL_NAME = TERMUX_PACKAGE_NAME + ".RUN_COMMAND_SHELL_NAME";
            public static final String EXTRA_SHELL_CREATE_MODE = TERMUX_PACKAGE_NAME + ".RUN_COMMAND_SHELL_CREATE_MODE";
            public static final String EXTRA_BACKGROUND_CUSTOM_LOG_LEVEL = TERMUX_PACKAGE_NAME + ".RUN_COMMAND_BACKGROUND_CUSTOM_LOG_LEVEL";
        }
    }

    public static final class TERMUX_API_APP {
        public static final String TERMUX_API_ACTIVITY_NAME = TERMUX_API_PACKAGE_NAME + ".TermuxApiActivity";
        public static final String DEFAULT_PREFERENCES_FILE_BASENAME_WITHOUT_EXTENSION = TERMUX_API_PACKAGE_NAME + "_preferences";
    }

    public static final class TERMUX_BOOT_APP {
        public static final String DEFAULT_PREFERENCES_FILE_BASENAME_WITHOUT_EXTENSION = TERMUX_BOOT_PACKAGE_NAME + "_preferences";
    }

    public static final class TERMUX_FLOAT_APP {
        public static final String TERMUX_FLOAT_SERVICE_NAME = TERMUX_FLOAT_PACKAGE_NAME + ".TermuxFloatService";
        public static final String DEFAULT_PREFERENCES_FILE_BASENAME_WITHOUT_EXTENSION = TERMUX_FLOAT_PACKAGE_NAME + "_preferences";
    }

    public static final class TERMUX_STYLING_APP {
        public static final String DEFAULT_PREFERENCES_FILE_BASENAME_WITHOUT_EXTENSION = TERMUX_STYLING_PACKAGE_NAME + "_preferences";
    }

    public static final class TERMUX_TASKER_APP {
        public static final String TERMUX_TASKER_ACTIVITY_NAME = TERMUX_TASKER_PACKAGE_NAME + ".TermuxTaskerActivity";
        public static final String DEFAULT_PREFERENCES_FILE_BASENAME_WITHOUT_EXTENSION = TERMUX_TASKER_PACKAGE_NAME + "_preferences";
    }

    public static final class TERMUX_WIDGET_APP {
        public static final String TERMUX_WIDGET_ACTIVITY_NAME = TERMUX_WIDGET_PACKAGE_NAME + ".TermuxWidgetActivity";
        public static final String DEFAULT_PREFERENCES_FILE_BASENAME_WITHOUT_EXTENSION = TERMUX_WIDGET_PACKAGE_NAME + "_preferences";
    }

    // TermuxPluginUtils lines 212-218 ke exact constants
    public static final String TERMUX_API_APPLICATION_NAME = TERMUX_API_APP_NAME;
    public static final String TERMUX_BOOT_APPLICATION_NAME = TERMUX_BOOT_APP_NAME;
    public static final String TERMUX_FLOAT_APPLICATION_NAME = TERMUX_FLOAT_APP_NAME;
    public static final String TERMUX_STYLING_APPLICATION_NAME = TERMUX_STYLING_APP_NAME;
    public static final String TERMUX_TASKER_APPLICATION_NAME = TERMUX_TASKER_APP_NAME;
    public static final String TERMUX_WIDGET_APPLICATION_NAME = TERMUX_WIDGET_APP_NAME;
}

