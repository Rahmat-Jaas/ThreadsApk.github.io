package X;

/* renamed from: X.5um  reason: invalid class name and case insensitive filesystem */
public final class C94355um extends AnonymousClass2FS {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C94355um) {
                C94355um r5 = (C94355um) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A01, r5.A01) || this.A0A != r5.A0A || !C04220Ms.A0I(this.A05, r5.A05) || this.A09 != r5.A09 || !C04220Ms.A0I(this.A04, r5.A04) || this.A08 != r5.A08 || !C04220Ms.A0I(this.A00, r5.A00) || this.A07 != r5.A07 || this.A06 != r5.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A01, AnonymousClass0wJ.A07(this.A03, C18180wK.A03(this.A02)));
        boolean z = this.A0A;
        int i = 1;
        if (z) {
            z = true;
        }
        int A073 = AnonymousClass0wJ.A07(this.A05, (A072 + (z ? 1 : 0)) * 31);
        boolean z2 = this.A09;
        if (z2) {
            z2 = true;
        }
        int A074 = AnonymousClass0wJ.A07(this.A04, (A073 + (z2 ? 1 : 0)) * 31);
        boolean z3 = this.A08;
        if (z3) {
            z3 = true;
        }
        int A075 = AnonymousClass0wJ.A07(this.A00, (A074 + (z3 ? 1 : 0)) * 31);
        boolean z4 = this.A07;
        if (z4) {
            z4 = true;
        }
        int i2 = (A075 + (z4 ? 1 : 0)) * 31;
        if (!this.A06) {
            i = 0;
        }
        return i2 + i;
    }

    public C94355um(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AnonymousClass0wJ.A1O(str, str2);
        C18190wL.A1S(str3, 3, str4);
        C86114wI.A1I(str5, 7, str6);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A0A = z;
        this.A05 = str4;
        this.A09 = z2;
        this.A04 = str5;
        this.A08 = z3;
        this.A00 = str6;
        this.A07 = z4;
        this.A06 = z5;
    }
}
