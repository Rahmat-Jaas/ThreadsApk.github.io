package X;

/* renamed from: X.16k  reason: invalid class name and case insensitive filesystem */
public final class C208616k extends AnonymousClass0Sf {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C208616k) {
                C208616k r5 = (C208616k) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A01;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        if (!this.A02) {
            i = 0;
        }
        return ((i2 + i) * 31) + this.A00;
    }

    public C208616k(boolean z, boolean z2, int i) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = i;
    }
}
