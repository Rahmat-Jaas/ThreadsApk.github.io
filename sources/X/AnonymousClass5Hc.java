package X;

/* renamed from: X.5Hc  reason: invalid class name */
public final class AnonymousClass5Hc extends AnonymousClass0Sf {
    public final int A00;
    public final C57943Dd A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public AnonymousClass5Hc(C57943Dd r2, String str, String str2, String str3, String str4, int i, boolean z) {
        C86104wH.A1P(str, 1, r2);
        this.A04 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A05 = str3;
        this.A03 = str4;
        this.A06 = z;
        this.A01 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Hc) {
                AnonymousClass5Hc r5 = (AnonymousClass5Hc) obj;
                if (!C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A02, r5.A02) || this.A00 != r5.A00 || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A03, r5.A03) || this.A06 != r5.A06 || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A032 = C18180wK.A03(this.A04);
        int A07 = AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A05, (AnonymousClass0wJ.A07(this.A02, A032) + this.A00) * 31));
        boolean z = this.A06;
        if (z) {
            z = true;
        }
        return C18220wO.A06(this.A01, (A07 + (z ? 1 : 0)) * 31);
    }
}
