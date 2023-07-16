package X;

/* renamed from: X.2Nx  reason: invalid class name */
public final class AnonymousClass2Nx {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CORRECT_WITH_OVERRIDE";
            case 2:
                return "NEEDS_OVERRIDE";
            case 3:
                return "CANNOT_FIND";
            default:
                return "CORRECT";
        }
    }
}
