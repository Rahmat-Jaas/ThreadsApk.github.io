package X;

/* renamed from: X.0iD  reason: invalid class name and case insensitive filesystem */
public final class C10360iD {
    public static String A00(int i) {
        if (i == 1) {
            return "INIT_HIGH_PRI_BG_THREAD_MARKER";
        }
        if (i == 11) {
            return "INIT_POST_CHROME_ANDROID";
        }
        if (i == 22) {
            return "INIT_POST_CHROME_ANDROID_WATCHDOG";
        }
        if (i == 29) {
            return "INIT_TIME_SPENT_BACKGROUND_BR_WAIT_TIME";
        }
        if (i == 6292) {
            return "INIT_APP_INIT";
        }
        if (i == 8221) {
            return "INIT_TEST_APP_START";
        }
        if (i == 25) {
            return "INIT_TIME_SPENT_FOREGROUND_BR_WAIT_TIME";
        }
        if (i == 26) {
            return "INIT_POST_CHROME_ANDROID_STALL_FOREGROUND_SESSION";
        }
        switch (i) {
            case 5:
                return "INIT_NON_CRITICAL_AFTER_UI_LOADED";
            case 6:
                return "INIT_NON_CRITICAL_AFTER_COLD_START";
            case 7:
                return "INIT_COLD_START";
            case 8:
                return "INIT_WARM_START";
            case 9:
                return "INIT_HOT_START";
            default:
                switch (i) {
                    case 18:
                        return "INIT_POST_CHROME_ANDROID_STALL";
                    case 19:
                        return "INIT_POST_CHROME_ANDROID_SHORT";
                    case 20:
                        return "INIT_POST_CHROME_ANDROID_SHORT_STALL";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
