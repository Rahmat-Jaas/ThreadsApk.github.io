package X;

/* renamed from: X.5Hk  reason: invalid class name and case insensitive filesystem */
public final class C89885Hk extends AnonymousClass0Sf {
    public long A00;
    public long A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89885Hk) {
                C89885Hk r8 = (C89885Hk) obj;
                if (this.A02 != r8.A02 || !C04220Ms.A0I(this.A06, r8.A06) || !C04220Ms.A0I(this.A08, r8.A08) || !C04220Ms.A0I(this.A09, r8.A09) || this.A03 != r8.A03 || this.A00 != r8.A00 || !C04220Ms.A0I(this.A07, r8.A07) || this.A04 != r8.A04 || this.A01 != r8.A01 || !C04220Ms.A0I(this.A05, r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A05, C86104wH.A06(C86104wH.A06(AnonymousClass0wJ.A07(this.A07, C86104wH.A06(C86104wH.A06(AnonymousClass0wJ.A07(this.A09, AnonymousClass0wJ.A07(this.A08, AnonymousClass0wJ.A07(this.A06, this.A02 * 31))), this.A03), this.A00)), this.A04), this.A01));
    }

    public C89885Hk(String str, String str2, String str3, String str4, String str5, int i, long j, long j2, long j3, long j4) {
        AnonymousClass0wJ.A1Q(str, str2);
        C86104wH.A1P(str3, 4, str4);
        C04220Ms.A0B(str5, 10);
        this.A02 = i;
        this.A06 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A03 = j;
        this.A00 = j2;
        this.A07 = str4;
        this.A04 = j3;
        this.A01 = j4;
        this.A05 = str5;
    }
}
