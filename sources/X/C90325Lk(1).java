package X;

import com.facebook.common.dextricks.Constants;
import com.instagram.api.schemas.LineType;

/* renamed from: X.5Lk  reason: invalid class name and case insensitive filesystem */
public final class C90325Lk extends AnonymousClass0Sf implements C146628mY {
    public final int A00;
    public final int A01;
    public final LineType A02;
    public final C970267q A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final AnonymousClass8s2 A09;
    public final AnonymousClass8s2 A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90325Lk) {
                C90325Lk r5 = (C90325Lk) obj;
                if (!(C04220Ms.A0I(this.A07, r5.A07) && C04220Ms.A0I(this.A08, r5.A08) && C04220Ms.A0I(this.A04, r5.A04) && this.A0D == r5.A0D && this.A02 == r5.A02 && this.A00 == r5.A00 && C04220Ms.A0I(this.A0A, r5.A0A) && this.A0H == r5.A0H && this.A01 == r5.A01 && this.A0I == r5.A0I && this.A0C == r5.A0C && C04220Ms.A0I(this.A09, r5.A09) && this.A0B == r5.A0B && this.A0E == r5.A0E && C04220Ms.A0I(this.A05, r5.A05) && C04220Ms.A0I(this.A06, r5.A06) && this.A0F == r5.A0F && this.A0G == r5.A0G && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C90325Lk(LineType lineType, C970267q r5, String str, String str2, String str3, String str4, String str5, AnonymousClass8s2 r11, AnonymousClass8s2 r12, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        str4 = (i3 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? null : str4;
        boolean A1R = C18240wQ.A1R(65536 & i3, z7);
        boolean A1R2 = C18240wQ.A1R(131072 & i3, z8);
        r5 = (i3 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0 ? C970267q.POST : r5;
        AnonymousClass0wJ.A1Q(str2, str3);
        C04220Ms.A0B(r11, 7);
        C04220Ms.A0B(r12, 12);
        C04220Ms.A0B(r5, 19);
        this.A07 = str;
        this.A08 = str2;
        this.A04 = str3;
        this.A0D = z;
        this.A02 = lineType;
        this.A00 = i;
        this.A0A = r11;
        this.A0H = z2;
        this.A01 = i2;
        this.A0I = z3;
        this.A0C = z4;
        this.A09 = r12;
        this.A0B = z5;
        this.A0E = z6;
        this.A05 = str4;
        this.A06 = str5;
        this.A0F = A1R;
        this.A0G = A1R2;
        this.A03 = r5;
    }

    public final String B2L() {
        return this.A04;
    }

    public final String B7K() {
        return this.A06;
    }

    public final String BGL() {
        return this.A07;
    }

    public final String BGO() {
        return this.A08;
    }

    public final C970267q BIh() {
        return this.A03;
    }

    public final boolean BSX() {
        return this.A0D;
    }

    public final boolean BWz() {
        return this.A0F;
    }

    public final boolean BZW() {
        return this.A0G;
    }

    public final Object getKey() {
        return C100156Mf.A00(this, "collapsedchildcontent");
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A07(this.A08, C18180wK.A03(this.A07)));
        boolean z = this.A0D;
        int i = 1;
        if (z) {
            z = true;
        }
        LineType lineType = this.A02;
        int A052 = AnonymousClass0wJ.A05(this.A0A, (AnonymousClass0wJ.A05(lineType, (A072 + (z ? 1 : 0)) * 31) + this.A00) * 31);
        boolean z2 = this.A0H;
        if (z2) {
            z2 = true;
        }
        int i2 = (((A052 + (z2 ? 1 : 0)) * 31) + this.A01) * 31;
        boolean z3 = this.A0I;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.A0C;
        if (z4) {
            z4 = true;
        }
        int A053 = AnonymousClass0wJ.A05(this.A09, (i3 + (z4 ? 1 : 0)) * 31);
        boolean z5 = this.A0B;
        if (z5) {
            z5 = true;
        }
        int i4 = (A053 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.A0E;
        if (z6) {
            z6 = true;
        }
        int A062 = (((((((i4 + (z6 ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + C18200wM.A09(this.A06)) * 31) + (C86164wN.A1S(this.A0F) ? 1 : 0)) * 31;
        if (!this.A0G) {
            i = 0;
        }
        return C18220wO.A06(this.A03, (A062 + i) * 31);
    }
}
