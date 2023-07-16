package X;

/* renamed from: X.7YO  reason: invalid class name */
public abstract class AnonymousClass7YO implements C145128jt {
    public String A00;
    public final int[] A01 = new int[2];

    public final String A02() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        C04220Ms.A0E("text");
        throw null;
    }

    public final int[] A03(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.A01;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public static int A01(AnonymousClass7YO r0) {
        return r0.A02().length();
    }
}
