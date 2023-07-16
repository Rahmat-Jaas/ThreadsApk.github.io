package X;

/* renamed from: X.6NW  reason: invalid class name */
public final class AnonymousClass6NW {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "Loading";
                break;
            case 2:
                str = "Idle";
                break;
            case 3:
                str = "Success";
                break;
            case 4:
                str = "Fail";
                break;
            default:
                str = "Uninitialized";
                break;
        }
        return C86144wL.A0B(str, intValue);
    }
}
