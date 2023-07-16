package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5N2  reason: invalid class name */
public final class AnonymousClass5N2 extends AnonymousClass0Sf implements C21453Bua {
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final String A02;

    public AnonymousClass5N2(ImageUrl imageUrl, ImageUrl imageUrl2, String str) {
        C18180wK.A1P(imageUrl, 1, str);
        this.A00 = imageUrl;
        this.A01 = imageUrl2;
        this.A02 = str;
    }

    public final AnonymousClass5N2 D71() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5N2) {
                AnonymousClass5N2 r5 = (AnonymousClass5N2) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A02, (C18210wN.A04(this.A00) + AnonymousClass0wJ.A03(this.A01)) * 31);
    }
}
