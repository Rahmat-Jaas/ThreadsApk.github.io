package X;

/* renamed from: X.5uk  reason: invalid class name and case insensitive filesystem */
public final class C94335uk extends AnonymousClass2FS {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C94335uk) {
                C94335uk r5 = (C94335uk) obj;
                if (!"funding failure".equals("funding failure") || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A05, r5.A05) || this.A00 != r5.A00 || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C94335uk(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A07 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A05 = str4;
        this.A00 = i;
        this.A02 = str5;
        this.A01 = str6;
        this.A03 = str7;
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A06, AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A07(this.A07, 1181165945)));
        return ((AnonymousClass0wJ.A07(this.A02, (AnonymousClass0wJ.A07(this.A05, A072) + this.A00) * 31) + AnonymousClass0wJ.A06(this.A01)) * 31) + C18200wM.A09(this.A03);
    }
}
