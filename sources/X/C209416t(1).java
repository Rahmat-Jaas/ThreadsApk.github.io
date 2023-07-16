package X;

/* renamed from: X.16t  reason: invalid class name and case insensitive filesystem */
public final class C209416t extends AnonymousClass0Sf {
    public boolean A00;
    public final AnonymousClass21z A01;
    public final AnonymousClass20N A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C209416t) {
                C209416t r5 = (C209416t) obj;
                if (!(C04220Ms.A0I(this.A04, r5.A04) && C04220Ms.A0I(this.A03, r5.A03) && this.A00 == r5.A00 && this.A02 == r5.A02 && this.A05 == r5.A05 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass0wJ.A07(this.A03, C18180wK.A03(this.A04));
        boolean z = this.A00;
        int i = 1;
        if (z) {
            z = true;
        }
        int A052 = AnonymousClass0wJ.A05(this.A02, (A07 + (z ? 1 : 0)) * 31);
        if (!this.A05) {
            i = 0;
        }
        return C18220wO.A06(this.A01, (A052 + i) * 31);
    }

    public C209416t(AnonymousClass21z r2, AnonymousClass20N r3, String str, String str2, boolean z, boolean z2) {
        AnonymousClass0wJ.A1O(str, str2);
        C18230wP.A1R(r3, 4, r2);
        this.A04 = str;
        this.A03 = str2;
        this.A00 = z;
        this.A02 = r3;
        this.A05 = z2;
        this.A01 = r2;
    }
}
