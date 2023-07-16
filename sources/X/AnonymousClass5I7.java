package X;

/* renamed from: X.5I7  reason: invalid class name */
public final class AnonymousClass5I7 extends AnonymousClass0Sf {
    public static final AnonymousClass5I7 A04;
    public static final AnonymousClass5I7 A05;
    public final float A00;
    public final float A01;
    public final float A02;
    public final C145068jm A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5I7) {
                AnonymousClass5I7 r5 = (AnonymousClass5I7) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || !C18180wK.A1W(Float.compare(this.A02, r5.A02)) || !C18180wK.A1W(Float.compare(this.A01, r5.A01)) || !C18180wK.A1W(Float.compare(this.A00, r5.A00))) {
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
        A04 = new AnonymousClass5I7(new AnonymousClass7V9(f, f2, f, f2), (float) 72, (float) 56, (float) 64);
        A05 = new AnonymousClass5I7(new AnonymousClass7V9(f, f2, f, f2), (float) 60, (float) 44, (float) 52);
    }

    public final int hashCode() {
        return C86144wL.A03(C86104wH.A05(C86104wH.A05(C18210wN.A04(this.A03), this.A02), this.A01), this.A00);
    }

    public AnonymousClass5I7(C145068jm r1, float f, float f2, float f3) {
        this.A03 = r1;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
    }
}
