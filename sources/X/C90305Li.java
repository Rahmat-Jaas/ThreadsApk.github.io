package X;

import com.instagram.api.schemas.LineType;

/* renamed from: X.5Li  reason: invalid class name and case insensitive filesystem */
public final class C90305Li extends AnonymousClass0Sf implements C146628mY {
    public final LineType A00;
    public final C970267q A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final Object A0B = C100156Mf.A00(this, "tombstone");

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90305Li) {
                C90305Li r5 = (C90305Li) obj;
                if (!(C04220Ms.A0I(this.A04, r5.A04) && C04220Ms.A0I(this.A05, r5.A05) && C04220Ms.A0I(this.A02, r5.A02) && this.A09 == r5.A09 && this.A0A == r5.A0A && this.A08 == r5.A08 && C04220Ms.A0I(this.A03, r5.A03) && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A07 == r5.A07 && this.A06 == r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B2L() {
        return this.A02;
    }

    public final String B7K() {
        return this.A03;
    }

    public final String BGL() {
        return this.A04;
    }

    public final String BGO() {
        return this.A05;
    }

    public final C970267q BIh() {
        return this.A01;
    }

    public final boolean BSX() {
        return this.A09;
    }

    public final boolean BWz() {
        return false;
    }

    public final boolean BZW() {
        return false;
    }

    public final Object getKey() {
        return this.A0B;
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A02, AnonymousClass0wJ.A07(this.A05, C18180wK.A03(this.A04)));
        boolean z = this.A09;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A072 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A0A;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A08;
        if (z3) {
            z3 = true;
        }
        int A052 = AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A05(this.A01, (((i3 + (z3 ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31));
        boolean z4 = this.A07;
        if (z4) {
            z4 = true;
        }
        int i4 = (A052 + (z4 ? 1 : 0)) * 31;
        if (!this.A06) {
            i = 0;
        }
        return i4 + i;
    }

    public C90305Li(LineType lineType, C970267q r3, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A04 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A09 = z;
        this.A0A = z2;
        this.A08 = z3;
        this.A03 = str4;
        this.A01 = r3;
        this.A00 = lineType;
        this.A07 = z4;
        this.A06 = z5;
    }
}
