package X;

/* renamed from: X.16y  reason: invalid class name and case insensitive filesystem */
public final class C209816y extends AnonymousClass0Sf {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C209816y(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C04220Ms.A0B(str, 1);
        C18210wN.A1M(str3, 7, str4);
        this.A00 = str;
        this.A04 = z;
        this.A05 = z2;
        this.A01 = str2;
        this.A06 = z3;
        this.A07 = z4;
        this.A02 = str3;
        this.A03 = str4;
        this.A08 = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C209816y) {
                C209816y r5 = (C209816y) obj;
                if (!(C04220Ms.A0I(this.A00, r5.A00) && this.A04 == r5.A04 && this.A05 == r5.A05 && C04220Ms.A0I(this.A01, r5.A01) && this.A06 == r5.A06 && this.A07 == r5.A07 && C04220Ms.A0I(this.A02, r5.A02) && C04220Ms.A0I(this.A03, r5.A03) && this.A08 == r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A032 = C18180wK.A03(this.A00);
        boolean z = this.A04;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A032 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A05;
        if (z2) {
            z2 = true;
        }
        int A062 = (((i2 + (z2 ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A01)) * 31;
        boolean z3 = this.A06;
        if (z3) {
            z3 = true;
        }
        int i3 = (A062 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.A07;
        if (z4) {
            z4 = true;
        }
        int A072 = AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A02, (i3 + (z4 ? 1 : 0)) * 31));
        if (!this.A08) {
            i = 0;
        }
        return A072 + i;
    }
}
