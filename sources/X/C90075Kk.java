package X;

/* renamed from: X.5Kk  reason: invalid class name and case insensitive filesystem */
public final class C90075Kk extends AnonymousClass0Sf implements C144198hz {
    public final boolean A00;
    public final boolean A01;

    public final C90075Kk Cyu() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90075Kk) {
                C90075Kk r5 = (C90075Kk) obj;
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
        int i2 = (z ? 1 : 0) * true;
        if (!this.A01) {
            i = 0;
        }
        return i2 + i;
    }

    public C90075Kk(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
