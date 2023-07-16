package X;

/* renamed from: X.5HT  reason: invalid class name */
public final class AnonymousClass5HT extends AnonymousClass0Sf {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass0ZU A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5HT) {
                AnonymousClass5HT r5 = (AnonymousClass5HT) obj;
                if (!(this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01 && C04220Ms.A0I(this.A03, r5.A03) && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A05 = AnonymousClass0wJ.A05(this.A03, ((((this.A02 * 31) + this.A00) * 31) + this.A01) * 31);
        boolean z = this.A04;
        if (z) {
            z = true;
        }
        return A05 + (z ? 1 : 0);
    }

    public AnonymousClass5HT(AnonymousClass0ZU r1, int i, int i2, int i3, boolean z) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = r1;
        this.A04 = z;
    }
}
