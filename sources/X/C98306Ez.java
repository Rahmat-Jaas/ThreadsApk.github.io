package X;

/* renamed from: X.6Ez  reason: invalid class name and case insensitive filesystem */
public final class C98306Ez {
    public static String A00(Integer num) {
        if (num == null) {
            return "null";
        }
        switch (num.intValue()) {
            case 1:
                return "LookaheadMeasuring";
            case 2:
                return "LayingOut";
            case 3:
                return "LookaheadLayingOut";
            case 4:
                return "Idle";
            default:
                return "Measuring";
        }
    }
}
