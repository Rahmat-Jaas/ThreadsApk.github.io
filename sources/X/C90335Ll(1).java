package X;

import com.instagram.api.schemas.LineType;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5Ll  reason: invalid class name and case insensitive filesystem */
public final class C90335Ll extends AnonymousClass0Sf implements C146628mY {
    public final LineType A00;
    public final C970267q A01;
    public final ImageUrl A02;
    public final C23894D0g A03;
    public final Double A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public C90335Ll(LineType lineType, C970267q r3, ImageUrl imageUrl, C23894D0g d0g, Double d, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        C04220Ms.A0B(str, 1);
        C18180wK.A1S(str4, str5, d0g);
        C04220Ms.A0B(r3, 12);
        C04220Ms.A0B(lineType, 13);
        this.A09 = str;
        this.A0A = str2;
        this.A06 = str3;
        this.A0C = z;
        this.A02 = imageUrl;
        this.A05 = str4;
        this.A0B = str5;
        this.A03 = d0g;
        this.A0J = z2;
        this.A04 = d;
        this.A07 = str6;
        this.A01 = r3;
        this.A00 = lineType;
        this.A0D = z3;
        this.A0K = z4;
        this.A0L = z5;
        this.A0G = z6;
        this.A0I = z7;
        this.A0F = z8;
        this.A0E = z9;
        this.A08 = str7;
        this.A0H = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90335Ll) {
                C90335Ll r5 = (C90335Ll) obj;
                if (!(C04220Ms.A0I(this.A09, r5.A09) && C04220Ms.A0I(this.A0A, r5.A0A) && C04220Ms.A0I(this.A06, r5.A06) && this.A0C == r5.A0C && C04220Ms.A0I(this.A02, r5.A02) && C04220Ms.A0I(this.A05, r5.A05) && C04220Ms.A0I(this.A0B, r5.A0B) && this.A03 == r5.A03 && this.A0J == r5.A0J && C04220Ms.A0I(this.A04, r5.A04) && C04220Ms.A0I(this.A07, r5.A07) && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A0D == r5.A0D && this.A0K == r5.A0K && this.A0L == r5.A0L && this.A0G == r5.A0G && this.A0I == r5.A0I && this.A0F == r5.A0F && this.A0E == r5.A0E && C04220Ms.A0I(this.A08, r5.A08) && this.A0H == r5.A0H)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B2L() {
        return this.A06;
    }

    public final String B7K() {
        return this.A07;
    }

    public final String BGL() {
        return this.A09;
    }

    public final String BGO() {
        return this.A0A;
    }

    public final C970267q BIh() {
        return this.A01;
    }

    public final boolean BSX() {
        return this.A0C;
    }

    public final boolean BWz() {
        return this.A0G;
    }

    public final boolean BZW() {
        return this.A0I;
    }

    public final Object getKey() {
        return C100156Mf.A00(this, "header");
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A06, AnonymousClass0wJ.A07(this.A0A, C18180wK.A03(this.A09)));
        boolean z = this.A0C;
        int i = 1;
        if (z) {
            z = true;
        }
        int A052 = AnonymousClass0wJ.A05(this.A03, AnonymousClass0wJ.A07(this.A0B, AnonymousClass0wJ.A07(this.A05, AnonymousClass0wJ.A05(this.A02, (A072 + (z ? 1 : 0)) * 31))));
        boolean z2 = this.A0J;
        if (z2) {
            z2 = true;
        }
        int A053 = AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A05(this.A01, (((((A052 + (z2 ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31));
        boolean z3 = this.A0D;
        if (z3) {
            z3 = true;
        }
        int i2 = (A053 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.A0K;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.A0L;
        if (z5) {
            z5 = true;
        }
        int i4 = (((((i3 + (z5 ? 1 : 0)) * 31) + (C86164wN.A1S(this.A0G) ? 1 : 0)) * 31) + (C86164wN.A1S(this.A0I) ? 1 : 0)) * 31;
        boolean z6 = this.A0F;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.A0E;
        if (z7) {
            z7 = true;
        }
        int A092 = (((i5 + (z7 ? 1 : 0)) * 31) + C18200wM.A09(this.A08)) * 31;
        if (!this.A0H) {
            i = 0;
        }
        return A092 + i;
    }
}
