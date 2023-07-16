package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5HN  reason: invalid class name */
public final class AnonymousClass5HN extends AnonymousClass0Sf {
    public final long A00;
    public final ImageUrl A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5HN) {
                AnonymousClass5HN r8 = (AnonymousClass5HN) obj;
                if (this.A00 != r8.A00 || !C04220Ms.A0I(this.A01, r8.A01) || !C04220Ms.A0I(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A02, AnonymousClass0wJ.A05(this.A01, C18190wL.A02(this.A00) * 31));
    }

    public AnonymousClass5HN(ImageUrl imageUrl, String str, long j) {
        this.A00 = j;
        this.A01 = imageUrl;
        this.A02 = str;
    }
}
