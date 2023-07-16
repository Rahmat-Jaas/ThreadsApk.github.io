package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.5Ho  reason: invalid class name and case insensitive filesystem */
public final class C89925Ho extends AnonymousClass0Sf {
    public final int A00;
    public final C970567t A01;
    public final ImageUrl A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final AnonymousClass8s2 A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C89925Ho(C970567t r2, ImageUrl imageUrl, Integer num, String str, String str2, String str3, String str4, List list, AnonymousClass8s2 r10, int i, boolean z, boolean z2, boolean z3) {
        C86104wH.A1P(str, 1, num);
        C04220Ms.A0B(r2, 8);
        this.A05 = str;
        this.A04 = str2;
        this.A02 = imageUrl;
        this.A08 = list;
        this.A0B = z;
        this.A00 = i;
        this.A03 = num;
        this.A01 = r2;
        this.A09 = r10;
        this.A07 = str3;
        this.A06 = str4;
        this.A0A = z2;
        this.A0C = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89925Ho) {
                C89925Ho r5 = (C89925Ho) obj;
                if (!C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A08, r5.A08) || this.A0B != r5.A0B || this.A00 != r5.A00 || this.A03 != r5.A03 || this.A01 != r5.A01 || !C04220Ms.A0I(this.A09, r5.A09) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A06, r5.A06) || this.A0A != r5.A0A || this.A0C != r5.A0C) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A032 = C18180wK.A03(this.A05);
        int A052 = AnonymousClass0wJ.A05(this.A08, (AnonymousClass0wJ.A07(this.A04, A032) + AnonymousClass0wJ.A03(this.A02)) * 31);
        boolean z = this.A0B;
        int i = 1;
        if (z) {
            z = true;
        }
        int A053 = (((AnonymousClass0wJ.A05(this.A09, AnonymousClass0wJ.A05(this.A01, (((((A052 + (z ? 1 : 0)) * 31) + this.A00) * 31) + AnonymousClass6NL.A00(this.A03)) * 31)) + AnonymousClass0wJ.A06(this.A07)) * 31) + C18200wM.A09(this.A06)) * 31;
        boolean z2 = this.A0A;
        if (z2) {
            z2 = true;
        }
        int i2 = (A053 + (z2 ? 1 : 0)) * 31;
        if (!this.A0C) {
            i = 0;
        }
        return i2 + i;
    }
}
