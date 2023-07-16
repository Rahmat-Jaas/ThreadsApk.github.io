package X;

/* renamed from: X.16o  reason: invalid class name and case insensitive filesystem */
public final class C209016o extends AnonymousClass0Sf {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C209016o) {
                C209016o r5 = (C209016o) obj;
                if (!(this.A04 == r5.A04 && this.A00 == r5.A00 && this.A03 == r5.A03 && this.A01 == r5.A01 && C04220Ms.A0I(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A04;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (((z ? 1 : 0) * true) + this.A00) * 31;
        if (!this.A03) {
            i = 0;
        }
        return ((((i2 + i) * 31) + this.A01) * 31) + AnonymousClass0wJ.A06(this.A02);
    }

    public C209016o(String str, int i, int i2, boolean z, boolean z2) {
        this.A04 = z;
        this.A00 = i;
        this.A03 = z2;
        this.A01 = i2;
        this.A02 = str;
    }
}
