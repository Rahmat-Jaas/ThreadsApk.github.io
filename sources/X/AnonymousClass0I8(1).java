package X;

/* renamed from: X.0I8  reason: invalid class name */
public final class AnonymousClass0I8 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "MEDIUM_SEVERITY";
            case 2:
                return "HIGH_SEVERITY";
            case 3:
                return "EXTREME_SEVERITY";
            case 4:
                return "CRASH_LIKE";
            case 5:
                return "FAIL_FUNCTIONAL";
            case 6:
                return "FAIL_CONTENT_CREATION";
            case 7:
                return "PRIVACY";
            case 8:
                return "LEGACY";
            case 9:
                return "LEGACY_FAIL_HARDER";
            default:
                return "LOGGING";
        }
    }
}
