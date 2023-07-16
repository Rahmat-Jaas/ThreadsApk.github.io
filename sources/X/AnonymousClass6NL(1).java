package X;

/* renamed from: X.6NL  reason: invalid class name */
public final class AnonymousClass6NL {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "LOADING";
                break;
            case 2:
                str = "SUCCESS";
                break;
            case 3:
                str = "ERROR";
                break;
            default:
                str = "UNINITIALIZED";
                break;
        }
        return C86144wL.A0B(str, intValue);
    }
}
