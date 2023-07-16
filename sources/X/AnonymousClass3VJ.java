package X;

import java.util.Arrays;

/* renamed from: X.3VJ  reason: invalid class name */
public final class AnonymousClass3VJ {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;

    public AnonymousClass3VJ() {
        this.A0C = false;
        this.A0B = false;
        this.A0A = null;
        this.A08 = null;
        this.A00 = null;
        this.A05 = null;
        this.A07 = null;
        this.A06 = null;
        this.A02 = null;
        this.A04 = null;
        this.A01 = null;
        this.A03 = null;
        this.A09 = null;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnonymousClass3VJ r4 = (AnonymousClass3VJ) obj;
        return C32622Co.A00(Boolean.valueOf(this.A0C), Boolean.valueOf(r4.A0C)) && C32622Co.A00(Boolean.valueOf(this.A0B), Boolean.valueOf(r4.A0B)) && C32622Co.A00(this.A0A, r4.A0A) && C32622Co.A00(this.A08, r4.A08) && C32622Co.A00(this.A00, r4.A00) && C32622Co.A00(this.A05, r4.A05) && C32622Co.A00(this.A07, r4.A07) && C32622Co.A00(this.A06, r4.A06) && C32622Co.A00(this.A02, r4.A02) && C32622Co.A00(this.A04, r4.A04) && C32622Co.A00(this.A01, r4.A01) && C32622Co.A00(this.A03, r4.A03) && C32622Co.A00(this.A09, r4.A09);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0B), this.A0A, this.A08, this.A00, this.A05, this.A07, this.A06, this.A02, this.A04, this.A01, this.A03, this.A09});
    }

    public AnonymousClass3VJ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2) {
        this.A0C = z;
        this.A0B = z2;
        this.A0A = str;
        this.A08 = str2;
        this.A00 = str3;
        this.A05 = str4;
        this.A07 = str5;
        this.A06 = str6;
        this.A02 = str7;
        this.A04 = str8;
        this.A01 = str9;
        this.A03 = str10;
        this.A09 = str11;
    }
}
