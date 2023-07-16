package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.5Hq  reason: invalid class name and case insensitive filesystem */
public final class C89945Hq extends AnonymousClass0Sf {
    public final ImageUrl A00;
    public final C23894D0g A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89945Hq) {
                C89945Hq r5 = (C89945Hq) obj;
                if (!C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A08, r5.A08) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A02, r5.A02) || this.A0H != r5.A0H || this.A01 != r5.A01 || this.A0B != r5.A0B || this.A0E != r5.A0E || this.A0G != r5.A0G || this.A0A != r5.A0A || this.A0F != r5.A0F || this.A0C != r5.A0C || !C04220Ms.A0I(this.A09, r5.A09) || this.A0D != r5.A0D) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A032 = C18180wK.A03(this.A07);
        int A052 = (((((((AnonymousClass0wJ.A05(this.A00, (AnonymousClass0wJ.A07(this.A08, A032) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31;
        boolean z = this.A0H;
        int i = 1;
        if (z) {
            z = true;
        }
        int A033 = (((A052 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31;
        boolean z2 = this.A0B;
        if (z2) {
            z2 = true;
        }
        int i2 = (A033 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A0E;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.A0G;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.A0A;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.A0F;
        if (z6) {
            z6 = true;
        }
        int i6 = (i5 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.A0C;
        if (z7) {
            z7 = true;
        }
        int A072 = (((i6 + (z7 ? 1 : 0)) * 31) + C18200wM.A07(this.A09)) * 31;
        if (!this.A0D) {
            i = 0;
        }
        return A072 + i;
    }

    public C89945Hq(ImageUrl imageUrl, C23894D0g d0g, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A07 = str;
        this.A08 = str2;
        this.A04 = str3;
        this.A00 = imageUrl;
        this.A03 = str4;
        this.A06 = str5;
        this.A05 = str6;
        this.A02 = num;
        this.A0H = z;
        this.A01 = d0g;
        this.A0B = z2;
        this.A0E = z3;
        this.A0G = z4;
        this.A0A = z5;
        this.A0F = z6;
        this.A0C = z7;
        this.A09 = list;
        this.A0D = z8;
    }
}
