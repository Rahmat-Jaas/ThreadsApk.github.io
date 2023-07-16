package X;

/* renamed from: X.5Hd  reason: invalid class name */
public final class AnonymousClass5Hd extends AnonymousClass0Sf {
    public final String A00;
    public final C38349KXb A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Hd) {
                AnonymousClass5Hd r5 = (AnonymousClass5Hd) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A04, r5.A04) || this.A05 != r5.A05 || this.A06 != r5.A06 || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = (AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A00, C18180wK.A03(this.A02))) + AnonymousClass0wJ.A06(this.A04)) * 31;
        boolean z = this.A05;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A07 + (z ? 1 : 0)) * 31;
        if (!this.A06) {
            i = 0;
        }
        return C18220wO.A06(this.A01, (i2 + i) * 31);
    }

    public AnonymousClass5Hd(C38349KXb kXb, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        AnonymousClass0wJ.A1Q(str2, str3);
        this.A02 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = z;
        this.A06 = z2;
        this.A01 = kXb;
    }
}
