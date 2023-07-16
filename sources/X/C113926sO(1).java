package X;

/* renamed from: X.6sO  reason: invalid class name and case insensitive filesystem */
public final class C113926sO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18190wL.A1Y(this, obj)) {
                return false;
            }
            C113926sO r4 = (C113926sO) obj;
            if (!(this.A06 == r4.A06 && this.A05 == r4.A05 && this.A02 == r4.A02 && this.A03 == r4.A03 && this.A04 == r4.A04 && this.A00 == r4.A00 && this.A01 == r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((this.A06 ? 1 : 0) * true) + (this.A05 ? 1 : 0)) * 31) + this.A02) * 31) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0)) * 31) + this.A00) * 31) + this.A01) * 31) - 1) * 31) - 1;
    }

    public C113926sO(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = z;
        this.A05 = z2;
        this.A02 = i;
        this.A03 = z3;
        this.A04 = z4;
        this.A00 = i2;
        this.A01 = i3;
    }
}
