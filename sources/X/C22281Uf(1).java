package X;

/* renamed from: X.1Uf  reason: invalid class name and case insensitive filesystem */
public final class C22281Uf extends AnonymousClass2FS {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22281Uf) {
                C22281Uf r5 = (C22281Uf) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A02;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.A01;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A03;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        if (!this.A00) {
            i = 0;
        }
        return i4 + i;
    }

    public C22281Uf(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = z;
        this.A01 = z2;
        this.A03 = z3;
        this.A00 = z4;
    }
}
