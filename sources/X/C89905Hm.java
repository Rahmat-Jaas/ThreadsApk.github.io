package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.5Hm  reason: invalid class name and case insensitive filesystem */
public final class C89905Hm extends AnonymousClass0Sf {
    public final ImageUrl A00;
    public final C23894D0g A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89905Hm) {
                C89905Hm r5 = (C89905Hm) obj;
                if (!C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A00, r5.A00) || this.A0A != r5.A0A || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A06, r5.A06) || this.A07 != r5.A07 || this.A01 != r5.A01 || this.A09 != r5.A09 || this.A08 != r5.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = (AnonymousClass0wJ.A07(this.A05, C18180wK.A03(this.A04)) + AnonymousClass0wJ.A03(this.A00)) * 31;
        boolean z = this.A0A;
        int i = 1;
        if (z) {
            z = true;
        }
        int A062 = (((((((A072 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A06)) * 31;
        boolean z2 = this.A07;
        if (z2) {
            z2 = true;
        }
        int A073 = (((A062 + (z2 ? 1 : 0)) * 31) + C18200wM.A07(this.A01)) * 31;
        boolean z3 = this.A09;
        if (z3) {
            z3 = true;
        }
        int i2 = (A073 + (z3 ? 1 : 0)) * 31;
        if (!this.A08) {
            i = 0;
        }
        return i2 + i;
    }

    public C89905Hm(ImageUrl imageUrl, C23894D0g d0g, String str, String str2, String str3, String str4, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A04 = str;
        this.A05 = str2;
        this.A00 = imageUrl;
        this.A0A = z;
        this.A02 = str3;
        this.A03 = str4;
        this.A06 = list;
        this.A07 = z2;
        this.A01 = d0g;
        this.A09 = z3;
        this.A08 = z4;
    }
}
