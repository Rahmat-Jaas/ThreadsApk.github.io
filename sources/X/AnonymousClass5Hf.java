package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5Hf  reason: invalid class name */
public final class AnonymousClass5Hf extends AnonymousClass0Sf {
    public final ImageUrl A00;
    public final C23894D0g A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Hf) {
                AnonymousClass5Hf r5 = (AnonymousClass5Hf) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00) || this.A06 != r5.A06 || this.A05 != r5.A05 || this.A01 != r5.A01 || this.A07 != r5.A07) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052 = AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A07(this.A02, AnonymousClass0wJ.A07(this.A04, C18180wK.A03(this.A03))));
        boolean z = this.A06;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A052 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A05;
        if (z2) {
            z2 = true;
        }
        int A053 = AnonymousClass0wJ.A05(this.A01, (i2 + (z2 ? 1 : 0)) * 31);
        if (!this.A07) {
            i = 0;
        }
        return A053 + i;
    }

    public AnonymousClass5Hf(ImageUrl imageUrl, C23894D0g d0g, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        AnonymousClass0wJ.A1O(str, str2);
        C86104wH.A1P(str3, 3, d0g);
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A00 = imageUrl;
        this.A06 = z;
        this.A05 = z2;
        this.A01 = d0g;
        this.A07 = z3;
    }
}
