package X;

/* renamed from: X.5HO  reason: invalid class name */
public final class AnonymousClass5HO extends AnonymousClass0Sf {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5HO) {
                AnonymousClass5HO r5 = (AnonymousClass5HO) obj;
                if (!(this.A03 == r5.A03 && this.A01 == r5.A01 && C04220Ms.A0I(this.A00, r5.A00) && this.A02 == r5.A02)) {
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
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.A01;
        if (z2) {
            z2 = true;
        }
        int A06 = (((i2 + (z2 ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A00)) * 31;
        if (!this.A02) {
            i = 0;
        }
        return A06 + i;
    }

    public AnonymousClass5HO(boolean z, String str, boolean z2, boolean z3) {
        this.A03 = z;
        this.A01 = z2;
        this.A00 = str;
        this.A02 = z3;
    }
}
