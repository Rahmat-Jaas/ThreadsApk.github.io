package X;

/* renamed from: X.16s  reason: invalid class name and case insensitive filesystem */
public final class C209316s extends AnonymousClass0Sf {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final int A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C209316s) {
                C209316s r5 = (C209316s) obj;
                if (!(this.A03 == r5.A03 && this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A05 == r5.A05 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A03;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (((z ? 1 : 0) * true) + this.A00) * 31;
        boolean z2 = this.A02;
        if (z2) {
            z2 = true;
        }
        int i3 = (((i2 + (z2 ? 1 : 0)) * 31) + this.A01) * 31;
        if (!this.A05) {
            i = 0;
        }
        return ((i3 + i) * 31) + this.A04;
    }

    public C209316s(int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A00 = i;
        this.A02 = z2;
        this.A01 = i2;
        this.A05 = z3;
        this.A04 = i3;
    }
}
