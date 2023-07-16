package X;

/* renamed from: X.5Ly  reason: invalid class name and case insensitive filesystem */
public final class C90425Ly extends AnonymousClass0Sf implements AnonymousClass8iT {
    public final C23894D0g A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90425Ly) {
                C90425Ly r5 = (C90425Ly) obj;
                if (!(C04220Ms.A0I(this.A01, r5.A01) && this.A02 == r5.A02 && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A05 == r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Object getKey() {
        return "action_buttons";
    }

    public final int hashCode() {
        int A032 = C18180wK.A03(this.A01);
        boolean z = this.A02;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A032 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A04;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A03;
        if (z3) {
            z3 = true;
        }
        int A033 = (((i3 + (z3 ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31;
        if (!this.A05) {
            i = 0;
        }
        return A033 + i;
    }

    public C90425Ly(C23894D0g d0g, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = str;
        this.A02 = z;
        this.A04 = z2;
        this.A03 = z3;
        this.A00 = d0g;
        this.A05 = z4;
    }
}
