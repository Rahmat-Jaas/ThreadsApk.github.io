package X;

/* renamed from: X.19P  reason: invalid class name */
public final class AnonymousClass19P extends AnonymousClass0Sf implements C81664oA {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass19P) {
                AnonymousClass19P r5 = (AnonymousClass19P) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A00;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true * 31;
        if (!this.A01) {
            i = 0;
        }
        return i2 + i;
    }

    public AnonymousClass19P(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
