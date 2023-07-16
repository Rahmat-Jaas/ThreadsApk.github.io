package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5Lw  reason: invalid class name and case insensitive filesystem */
public final class C90405Lw extends AnonymousClass0Sf implements AnonymousClass8iS {
    public final C142358ej A00;
    public final C142368ek A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90405Lw) {
                C90405Lw r5 = (C90405Lw) obj;
                if (!C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02) || this.A07 != r5.A07 || !C04220Ms.A0I(this.A01, r5.A01) || this.A06 != r5.A06 || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Aqm() {
        return this.A04;
    }

    public final int hashCode() {
        int A052 = AnonymousClass0wJ.A05(this.A02, AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A05, C18180wK.A03(this.A04))));
        boolean z = this.A07;
        int i = 1;
        if (z) {
            z = true;
        }
        int A053 = AnonymousClass0wJ.A05(this.A01, (A052 + (z ? 1 : 0)) * 31);
        if (!this.A06) {
            i = 0;
        }
        return C18220wO.A06(this.A00, (A053 + i) * 31);
    }

    public C90405Lw(C142358ej r2, C142368ek r3, ImageUrl imageUrl, String str, String str2, String str3, boolean z, boolean z2) {
        AnonymousClass0wJ.A1O(str, str2);
        C18230wP.A1R(str3, 3, r3);
        C04220Ms.A0B(r2, 8);
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A02 = imageUrl;
        this.A07 = z;
        this.A01 = r3;
        this.A06 = z2;
        this.A00 = r2;
    }
}
