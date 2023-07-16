package X;

/* renamed from: X.5L0  reason: invalid class name */
public final class AnonymousClass5L0 extends AnonymousClass0Sf implements L0T {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public final AnonymousClass5L0 D04() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5L0) {
                AnonymousClass5L0 r5 = (AnonymousClass5L0) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A02, r5.A02) || this.A01 != r5.A01 || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int Afi() {
        return this.A00;
    }

    public final int BDI() {
        return this.A01;
    }

    public final String BK7() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((this.A00 * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + this.A01) * 31) + C18200wM.A09(this.A03);
    }

    public AnonymousClass5L0(int i, String str, int i2, String str2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
        this.A03 = str2;
    }
}
