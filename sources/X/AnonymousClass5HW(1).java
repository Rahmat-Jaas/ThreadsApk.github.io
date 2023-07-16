package X;

/* renamed from: X.5HW  reason: invalid class name */
public final class AnonymousClass5HW extends AnonymousClass0Sf {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5HW) {
                AnonymousClass5HW r8 = (AnonymousClass5HW) obj;
                if (!C04220Ms.A0I(this.A02, r8.A02) || !C04220Ms.A0I(this.A03, r8.A03) || this.A00 != r8.A00 || this.A01 != r8.A01 || !C04220Ms.A0I(this.A04, r8.A04) || !C04220Ms.A0I(this.A05, r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A05, AnonymousClass0wJ.A07(this.A04, C86104wH.A06((AnonymousClass0wJ.A07(this.A03, C18180wK.A03(this.A02)) + this.A00) * 31, this.A01)));
    }

    public AnonymousClass5HW(String str, String str2, String str3, String str4, int i, long j) {
        AnonymousClass0wJ.A1O(str, str2);
        C18230wP.A1R(str3, 5, str4);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A01 = j;
        this.A04 = str3;
        this.A05 = str4;
    }
}
