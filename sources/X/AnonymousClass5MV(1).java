package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5MV  reason: invalid class name */
public final class AnonymousClass5MV extends AnonymousClass0Sf implements C146798ms {
    public final ImageUrl A00;
    public final ImageUrl A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5MV) {
                AnonymousClass5MV r5 = (AnonymousClass5MV) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18210wN.A04(this.A00));
    }

    public AnonymousClass5MV(ImageUrl imageUrl, ImageUrl imageUrl2) {
        this.A00 = imageUrl;
        this.A01 = imageUrl2;
    }
}
