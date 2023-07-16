package X;

/* renamed from: X.18R  reason: invalid class name */
public final class AnonymousClass18R extends AnonymousClass0Sf implements C81284nW {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18R) {
                AnonymousClass18R r5 = (AnonymousClass18R) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A04, AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A02, AnonymousClass0wJ.A07(this.A01, C18180wK.A03(this.A00)))));
    }

    public AnonymousClass18R(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass0wJ.A1O(str, str2);
        AnonymousClass0wJ.A1R(str3, str4);
        C04220Ms.A0B(str5, 5);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }
}
