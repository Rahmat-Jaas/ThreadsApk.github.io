package X;

/* renamed from: X.7B6  reason: invalid class name */
public final class AnonymousClass7B6 {
    public static Integer A01(int i) {
        if (i == 0) {
            return AnonymousClass006.A00;
        }
        if (i == 1) {
            return AnonymousClass006.A01;
        }
        if (i == 2) {
            return AnonymousClass006.A0C;
        }
        if (i == 3) {
            return AnonymousClass006.A0N;
        }
        throw C18190wL.A0a(AnonymousClass00U.A0J(I17.A00(44), i));
    }

    public static final int A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 3;
        }
    }

    public static String A02(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "LEFT";
            case 1:
                return "TOP";
            case 2:
                return "RIGHT";
            default:
                return "BOTTOM";
        }
    }
}
