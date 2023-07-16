package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5Ko  reason: invalid class name and case insensitive filesystem */
public final class C90115Ko extends AnonymousClass0Sf implements C144228i2 {
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C90115Ko(ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3) {
        C04220Ms.A0B(str3, 5);
        this.A02 = str;
        this.A00 = imageUrl;
        this.A01 = imageUrl2;
        this.A03 = str2;
        this.A04 = str3;
    }

    public final C90115Ko Cz9() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90115Ko) {
                C90115Ko r5 = (C90115Ko) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A04, ((((((AnonymousClass0wJ.A06(this.A02) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A09(this.A03)) * 31);
    }
}
