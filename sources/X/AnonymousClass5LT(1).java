package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5LT  reason: invalid class name */
public final class AnonymousClass5LT extends AnonymousClass0Sf implements C142298ed {
    public final int A00;
    public final ImageUrl A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5LT) {
                AnonymousClass5LT r5 = (AnonymousClass5LT) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.A02, this.A00 * 31) + AnonymousClass0wJ.A03(this.A01);
    }

    public AnonymousClass5LT(ImageUrl imageUrl, String str, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = imageUrl;
    }
}
