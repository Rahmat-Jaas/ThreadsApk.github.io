package X;

/* renamed from: X.6Si  reason: invalid class name and case insensitive filesystem */
public final class C101716Si {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "LOADING";
                break;
            case 2:
                str = "ERROR";
                break;
            default:
                str = "IDLE";
                break;
        }
        return C86144wL.A0B(str, intValue);
    }
}
