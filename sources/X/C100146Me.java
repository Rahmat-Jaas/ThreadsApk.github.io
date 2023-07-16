package X;

/* renamed from: X.6Me  reason: invalid class name and case insensitive filesystem */
public final class C100146Me {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "Loaded";
                break;
            case 2:
                str = "Loading";
                break;
            case 3:
                str = "Error";
                break;
            default:
                str = "NotLoading";
                break;
        }
        return C86144wL.A0B(str, intValue);
    }
}
