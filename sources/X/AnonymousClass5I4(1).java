package X;

/* renamed from: X.5I4  reason: invalid class name */
public final class AnonymousClass5I4 extends AnonymousClass0Sf {
    public static final AnonymousClass5I4 A03;
    public static final AnonymousClass5I4 A04;
    public final float A00;
    public final float A01;
    public final C145068jm A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5I4) {
                AnonymousClass5I4 r5 = (AnonymousClass5I4) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C18180wK.A1W(Float.compare(this.A01, r5.A01)) || !C18180wK.A1W(Float.compare(this.A00, r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    static {
        float f = (float) 16;
        float f2 = (float) 0;
        float f3 = (float) 60;
        A03 = new AnonymousClass5I4(new AnonymousClass7V9(f, f2, f, f2), (float) 82, f3);
        A04 = new AnonymousClass5I4(new AnonymousClass7V9(f, f2, f, f2), f3, (float) 36);
    }

    public final int hashCode() {
        return C86144wL.A03(C86104wH.A05(C18210wN.A04(this.A02), this.A01), this.A00);
    }

    public AnonymousClass5I4(C145068jm r1, float f, float f2) {
        this.A02 = r1;
        this.A01 = f;
        this.A00 = f2;
    }
}
