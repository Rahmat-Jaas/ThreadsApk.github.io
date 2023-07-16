package X;

/* renamed from: X.5KD  reason: invalid class name */
public final class AnonymousClass5KD extends AnonymousClass0Sf implements C143308gV {
    public final double A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Integer A06 = AnonymousClass006.A0j;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5KD) {
                AnonymousClass5KD r7 = (AnonymousClass5KD) obj;
                if (Double.compare(this.A00, r7.A00) != 0 || !C04220Ms.A0I(this.A02, r7.A02) || !C04220Ms.A0I(this.A04, r7.A04) || !C04220Ms.A0I(this.A05, r7.A05) || !C04220Ms.A0I(this.A03, r7.A03) || !C04220Ms.A0I(this.A01, r7.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return "Prediction Score computed";
    }

    public final Integer AgJ() {
        return this.A06;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A05, AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A07(this.A02, C18190wL.A02(Double.doubleToLongBits(this.A00)) * 31)))));
    }

    public AnonymousClass5KD(String str, String str2, String str3, String str4, String str5, double d) {
        AnonymousClass0wJ.A1Q(str, str2);
        C18230wP.A1R(str4, 5, str5);
        this.A00 = d;
        this.A02 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A03 = str4;
        this.A01 = str5;
    }
}
