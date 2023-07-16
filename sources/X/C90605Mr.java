package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5Mr  reason: invalid class name and case insensitive filesystem */
public final class C90605Mr extends AnonymousClass0Sf implements C21351Bsw {
    public final ImageUrl A00;
    public final String A01;

    public C90605Mr(ImageUrl imageUrl, String str) {
        C04220Ms.A0B(str, 2);
        this.A00 = imageUrl;
        this.A01 = str;
    }

    public final C90605Mr D5A() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90605Mr) {
                C90605Mr r5 = (C90605Mr) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, AnonymousClass0wJ.A03(this.A00) * 31);
    }
}
