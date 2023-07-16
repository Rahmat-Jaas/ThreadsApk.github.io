package X;

import com.instagram.api.schemas.LineType;

/* renamed from: X.5Lh  reason: invalid class name and case insensitive filesystem */
public final class C90295Lh extends AnonymousClass0Sf implements C146628mY {
    public final int A00;
    public final LineType A01;
    public final C970267q A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final AnonymousClass8s2 A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public /* synthetic */ C90295Lh(LineType lineType, C970267q r3, String str, String str2, String str3, String str4, AnonymousClass8s2 r8, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C04220Ms.A0B(r8, 6);
        C04220Ms.A0B(r3, 13);
        this.A05 = str;
        this.A06 = str2;
        this.A03 = str3;
        this.A09 = z;
        this.A00 = i;
        this.A07 = r8;
        this.A0B = z2;
        this.A01 = lineType;
        this.A08 = z3;
        this.A04 = str4;
        this.A0A = z4;
        this.A02 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90295Lh) {
                C90295Lh r5 = (C90295Lh) obj;
                if (!(C04220Ms.A0I(this.A05, r5.A05) && C04220Ms.A0I(this.A06, r5.A06) && C04220Ms.A0I(this.A03, r5.A03) && this.A09 == r5.A09 && this.A00 == r5.A00 && C04220Ms.A0I(this.A07, r5.A07) && this.A0B == r5.A0B && this.A01 == r5.A01 && this.A08 == r5.A08 && C04220Ms.A0I(this.A04, r5.A04) && this.A0A == r5.A0A && this.A02 == r5.A02)) {
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
        return this.A09;
    }

    public final boolean BWz() {
        return this.A0A;
    }

    public final boolean BZW() {
        return false;
    }

    public final Object getKey() {
        return C100156Mf.A00(this, "likes");
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A06, C18180wK.A03(this.A05));
        int A052 = AnonymousClass0wJ.A05(this.A07, (((AnonymousClass0wJ.A07(this.A03, A072) + (C86164wN.A1S(this.A09) ? 1 : 0)) * 31) + this.A00) * 31);
        boolean z = this.A0B;
        if (z) {
            z = true;
        }
        int A053 = AnonymousClass0wJ.A05(this.A01, (A052 + (z ? 1 : 0)) * 31);
        boolean z2 = this.A08;
        if (z2) {
            z2 = true;
        }
        return C18220wO.A06(this.A02, (((((A053 + (z2 ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + (C86164wN.A1S(this.A0A) ? 1 : 0)) * 31 * 31);
    }
}
