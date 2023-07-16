package X;

/* renamed from: X.16n  reason: invalid class name and case insensitive filesystem */
public final class C208916n extends AnonymousClass0Sf {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C208916n) {
                C208916n r5 = (C208916n) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || this.A03 != r5.A03 || this.A04 != r5.A04 || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A06 = AnonymousClass0wJ.A06(this.A00) * 31;
        boolean z = this.A03;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A06 + (z ? 1 : 0)) * 31;
        if (!this.A04) {
            i = 0;
        }
        return ((((i2 + i) * 31) + AnonymousClass0wJ.A06(this.A01)) * 31) + C18200wM.A09(this.A02);
    }

    public C208916n(String str, String str2, String str3, boolean z, boolean z2) {
        this.A00 = str;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = str2;
        this.A02 = str3;
    }
}
