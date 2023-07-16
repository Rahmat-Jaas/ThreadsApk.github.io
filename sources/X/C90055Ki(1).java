package X;

/* renamed from: X.5Ki  reason: invalid class name and case insensitive filesystem */
public final class C90055Ki extends AnonymousClass0Sf implements C144178hx {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public C90055Ki(Integer num, Integer num2, String str, String str2) {
        C04220Ms.A0B(str2, 4);
        this.A00 = num;
        this.A02 = str;
        this.A01 = num2;
        this.A03 = str2;
    }

    public final C90055Ki Cym() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90055Ki) {
                C90055Ki r5 = (C90055Ki) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A03, ((((AnonymousClass0wJ.A03(this.A00) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + C18200wM.A07(this.A01)) * 31);
    }
}
