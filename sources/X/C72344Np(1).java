package X;

import java.io.Serializable;

/* renamed from: X.4Np  reason: invalid class name and case insensitive filesystem */
public final class C72344Np implements Serializable {
    public int A00 = 0;
    public int A01 = 1;
    public long A02 = 0;
    public Integer A03 = AnonymousClass006.A00;
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A = false;

    public final boolean equals(Object obj) {
        C72344Np r6;
        if (!(obj instanceof C72344Np) || (r6 = (C72344Np) obj) == null) {
            return false;
        }
        if (this == r6) {
            return true;
        }
        if (this.A00 == r6.A00 && this.A02 == r6.A02 && this.A04.equals(r6.A04) && this.A0A == r6.A0A && this.A01 == r6.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str;
        int A052 = C18210wN.A05(this.A04, C18220wO.A06(Long.valueOf(this.A02), (2173 + this.A00) * 53) * 53) * 53;
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        int A053 = C18210wN.A05("", (((A052 + i) * 53) + this.A01) * 53) * 53;
        Integer num = this.A03;
        switch (num.intValue()) {
            case 1:
                str = "FROM_NUMBER_WITH_IDD";
                break;
            case 2:
                str = "FROM_NUMBER_WITHOUT_PLUS_SIGN";
                break;
            case 3:
                str = "FROM_DEFAULT_COUNTRY";
                break;
            default:
                str = "FROM_NUMBER_WITH_PLUS_SIGN";
                break;
        }
        return (C18210wN.A05("", (A053 + str.hashCode() + num.intValue()) * 53) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Country Code: ");
        A0s.append(this.A00);
        A0s.append(" National Number: ");
        A0s.append(this.A02);
        if (this.A08 && this.A0A) {
            A0s.append(" Leading Zero(s): true");
        }
        if (this.A09) {
            A0s.append(" Number of leading zeros: ");
            A0s.append(this.A01);
        }
        if (this.A07) {
            A0s.append(" Extension: ");
            A0s.append(this.A04);
        }
        return A0s.toString();
    }
}
