package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5wN  reason: invalid class name */
public final class AnonymousClass5wN extends AnonymousClass6NY {
    public final ImageUrl A00;
    public final boolean A01;

    public AnonymousClass5wN(ImageUrl imageUrl, boolean z) {
        C04220Ms.A0B(imageUrl, 1);
        this.A00 = imageUrl;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5wN) {
                AnonymousClass5wN r5 = (AnonymousClass5wN) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A04 = C18210wN.A04(this.A00);
        boolean z = this.A01;
        if (z) {
            z = true;
        }
        return A04 + (z ? 1 : 0);
    }
}
