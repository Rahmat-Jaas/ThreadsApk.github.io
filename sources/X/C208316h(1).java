package X;

/* renamed from: X.16h  reason: invalid class name and case insensitive filesystem */
public final class C208316h extends AnonymousClass0Sf {
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C208316h) {
                C208316h r5 = (C208316h) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && C04220Ms.A0I(this.A00, r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A02;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z2 = this.A01;
        if (z2) {
            z2 = true;
        }
        return C18210wN.A05(this.A00, (i + (z2 ? 1 : 0)) * 31);
    }

    public C208316h(String str, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = str;
    }
}
