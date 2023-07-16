package X;

/* renamed from: X.1oZ  reason: invalid class name */
public final class AnonymousClass1oZ extends AnonymousClass2MY {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1oZ) {
                AnonymousClass1oZ r5 = (AnonymousClass1oZ) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        boolean z = this.A01;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = (i + (z ? 1 : 0)) * 31;
        boolean z2 = this.A02;
        if (z2) {
            z2 = true;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A03;
        if (z3) {
            z3 = true;
        }
        int i5 = (i4 + (z3 ? 1 : 0)) * 31 * 31;
        if (!this.A04) {
            i2 = 0;
        }
        return i5 + i2;
    }

    public AnonymousClass1oZ(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.A00 = i;
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
        this.A04 = z4;
    }
}
