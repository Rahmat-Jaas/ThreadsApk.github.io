package X;

/* renamed from: X.7V9  reason: invalid class name */
public final class AnonymousClass7V9 implements C145068jm {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public final float ABa(AnonymousClass69J r2) {
        C04220Ms.A0B(r2, 0);
        if (r2 == AnonymousClass69J.Ltr) {
            return this.A02;
        }
        return this.A01;
    }

    public final float ABe(AnonymousClass69J r2) {
        C04220Ms.A0B(r2, 0);
        if (r2 == AnonymousClass69J.Ltr) {
            return this.A01;
        }
        return this.A02;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass7V9)) {
            return false;
        }
        AnonymousClass7V9 r4 = (AnonymousClass7V9) obj;
        if (!C18180wK.A1W(Float.compare(this.A02, r4.A02)) || !C18180wK.A1W(Float.compare(this.A03, r4.A03)) || !C18180wK.A1W(Float.compare(this.A01, r4.A01)) || !C18180wK.A1W(Float.compare(this.A00, r4.A00))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86144wL.A03(C86104wH.A05(C86104wH.A05(C86134wK.A03(this.A02), this.A03), this.A01), this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("PaddingValues(start=");
        C134847yT.A02(A0s, this.A02);
        A0s.append(", top=");
        C134847yT.A02(A0s, this.A03);
        A0s.append(", end=");
        C134847yT.A02(A0s, this.A01);
        A0s.append(", bottom=");
        return C86104wH.A0y(C134847yT.A01(this.A00), A0s);
    }

    public AnonymousClass7V9(float f, float f2, float f3, float f4) {
        this.A02 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A00 = f4;
    }
}
