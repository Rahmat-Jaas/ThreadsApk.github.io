package X;

import com.instagram.api.schemas.LineType;
import com.instagram.api.schemas.RepostRestrictedReason;

/* renamed from: X.5Lj  reason: invalid class name and case insensitive filesystem */
public final class C90315Lj extends AnonymousClass0Sf implements C146628mY {
    public final LineType A00;
    public final RepostRestrictedReason A01;
    public final C970267q A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final String A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90315Lj) {
                C90315Lj r5 = (C90315Lj) obj;
                if (!(C04220Ms.A0I(this.A05, r5.A05) && C04220Ms.A0I(this.A06, r5.A06) && C04220Ms.A0I(this.A03, r5.A03) && this.A0B == r5.A0B && this.A0C == r5.A0C && this.A0E == r5.A0E && this.A00 == r5.A00 && this.A0A == r5.A0A && this.A08 == r5.A08 && this.A09 == r5.A09 && this.A07 == r5.A07 && C04220Ms.A0I(this.A0G, r5.A0G) && this.A01 == r5.A01 && C04220Ms.A0I(this.A04, r5.A04) && this.A0D == r5.A0D && this.A0F == r5.A0F && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B2L() {
        return this.A03;
    }

    public final String B7K() {
        return this.A04;
    }

    public final String BGL() {
        return this.A05;
    }

    public final String BGO() {
        return this.A06;
    }

    public final C970267q BIh() {
        return this.A02;
    }

    public final boolean BSX() {
        return this.A0B;
    }

    public final boolean BWz() {
        return this.A0D;
    }

    public final boolean BZW() {
        return this.A0F;
    }

    public final Object getKey() {
        return C100156Mf.A00(this, "ufi");
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A06, C18180wK.A03(this.A05)));
        boolean z = this.A0B;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A072 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A0C;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A0E;
        if (z3) {
            z3 = true;
        }
        int A052 = AnonymousClass0wJ.A05(this.A00, (i3 + (z3 ? 1 : 0)) * 31);
        boolean z4 = this.A0A;
        if (z4) {
            z4 = true;
        }
        int i4 = (A052 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.A08;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.A09;
        if (z6) {
            z6 = true;
        }
        int i6 = (i5 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.A07;
        if (z7) {
            z7 = true;
        }
        int A062 = (((((((((i6 + (z7 ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A0G)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A09(this.A04)) * 31) + (C86164wN.A1S(this.A0D) ? 1 : 0)) * 31;
        if (!this.A0F) {
            i = 0;
        }
        return C18220wO.A06(this.A02, (A062 + i) * 31);
    }

    public C90315Lj(LineType lineType, RepostRestrictedReason repostRestrictedReason, C970267q r4, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        AnonymousClass0wJ.A1Q(str2, str3);
        C04220Ms.A0B(r4, 17);
        this.A05 = str;
        this.A06 = str2;
        this.A03 = str3;
        this.A0B = z;
        this.A0C = z2;
        this.A0E = z3;
        this.A00 = lineType;
        this.A0A = z4;
        this.A08 = z5;
        this.A09 = z6;
        this.A07 = z7;
        this.A0G = str4;
        this.A01 = repostRestrictedReason;
        this.A04 = str5;
        this.A0D = z8;
        this.A0F = z9;
        this.A02 = r4;
    }
}
