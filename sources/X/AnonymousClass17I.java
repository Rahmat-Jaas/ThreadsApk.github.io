package X;

/* renamed from: X.17I  reason: invalid class name */
public final class AnonymousClass17I extends AnonymousClass0Sf {
    public boolean A00;
    public final long A01;
    public final C57943Dd A02;
    public final C57943Dd A03;
    public final boolean A04;
    public final boolean A05;

    public AnonymousClass17I(C57943Dd r2, C57943Dd r3, long j, boolean z, boolean z2, boolean z3) {
        C04220Ms.A0B(r3, 3);
        this.A01 = j;
        this.A03 = r2;
        this.A02 = r3;
        this.A00 = z;
        this.A04 = z2;
        this.A05 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass17I) {
                AnonymousClass17I r8 = (AnonymousClass17I) obj;
                if (!(this.A01 == r8.A01 && C04220Ms.A0I(this.A03, r8.A03) && C04220Ms.A0I(this.A02, r8.A02) && this.A00 == r8.A00 && this.A04 == r8.A04 && this.A05 == r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052 = AnonymousClass0wJ.A05(this.A02, AnonymousClass0wJ.A05(this.A03, C18190wL.A02(this.A01) * 31));
        boolean z = this.A00;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A052 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A04;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        if (!this.A05) {
            i = 0;
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("DealItem(id=");
        A0s.append(this.A01);
        A0s.append(", title=");
        A0s.append(this.A03);
        A0s.append(", subtitle=");
        A0s.append(this.A02);
        A0s.append(", isSelected=");
        A0s.append(this.A00);
        A0s.append(", isEnabled=");
        A0s.append(this.A04);
        A0s.append(", showReelsBoostTooltip=");
        A0s.append(this.A05);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass17I() {
        this(AnonymousClass2LU.A00(""), AnonymousClass2LU.A00(""), -1, false, true, false);
    }
}
