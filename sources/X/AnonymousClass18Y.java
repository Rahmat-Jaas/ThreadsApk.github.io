package X;

/* renamed from: X.18Y  reason: invalid class name */
public final class AnonymousClass18Y extends AnonymousClass0Sf implements C82104p5 {
    public final float A00;
    public final int A01;
    public final String A02;

    public AnonymousClass18Y(String str, int i, float f) {
        C04220Ms.A0B(str, 3);
        this.A01 = i;
        this.A00 = f;
        this.A02 = str;
    }

    public final AnonymousClass18Y Czq() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18Y) {
                AnonymousClass18Y r5 = (AnonymousClass18Y) obj;
                if (!(this.A01 == r5.A01 && Float.compare(this.A00, r5.A00) == 0 && C04220Ms.A0I(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A02, ((this.A01 * 31) + Float.floatToIntBits(this.A00)) * 31);
    }
}
