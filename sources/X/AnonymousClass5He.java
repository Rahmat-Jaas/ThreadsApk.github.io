package X;

/* renamed from: X.5He  reason: invalid class name */
public final class AnonymousClass5He extends AnonymousClass0Sf {
    public final long A00;
    public final C25515Dn3 A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public AnonymousClass5He(C25515Dn3 dn3, Integer num, String str, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        C04220Ms.A0B(dn3, 1);
        this.A01 = dn3;
        this.A00 = j;
        this.A03 = str;
        this.A02 = num;
        this.A04 = z;
        this.A07 = z2;
        this.A06 = z3;
        this.A05 = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5He) {
                AnonymousClass5He r8 = (AnonymousClass5He) obj;
                if (!(C04220Ms.A0I(this.A01, r8.A01) && this.A00 == r8.A00 && C04220Ms.A0I(this.A03, r8.A03) && C04220Ms.A0I(this.A02, r8.A02) && this.A04 == r8.A04 && this.A07 == r8.A07 && this.A06 == r8.A06 && this.A05 == r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A062 = (((C86104wH.A06(C18210wN.A04(this.A01), this.A00) + AnonymousClass0wJ.A06(this.A03)) * 31) + C18200wM.A07(this.A02)) * 31;
        boolean z = this.A04;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A062 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A07;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A06;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        if (!this.A05) {
            i = 0;
        }
        return i4 + i;
    }
}
