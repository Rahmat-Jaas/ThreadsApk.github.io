package X;

/* renamed from: X.5ul  reason: invalid class name and case insensitive filesystem */
public final class C94345ul extends AnonymousClass2FS {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C94345ul(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C18210wN.A1M(str3, 4, str7);
        this.A02 = str;
        this.A06 = str2;
        this.A01 = str3;
        this.A07 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A03 = str7;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C94345ul) {
                C94345ul r5 = (C94345ul) obj;
                if (!"gifting failure".equals("gifting failure") || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A05, AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A07(this.A07, AnonymousClass0wJ.A07(this.A01, AnonymousClass0wJ.A07(this.A06, AnonymousClass0wJ.A07(this.A02, -890099868))))))) + this.A00;
    }
}
