package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.5KX  reason: invalid class name */
public final class AnonymousClass5KX extends AnonymousClass0Sf implements C144088ho {
    public final ImageUrl A00;
    public final User A01;
    public final String A02;
    public final String A03;

    public final AnonymousClass5KX Cy9(C112176p7 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5KX) {
                AnonymousClass5KX r5 = (AnonymousClass5KX) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass0wJ.A06(this.A02) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + C18200wM.A07(this.A01);
    }

    public AnonymousClass5KX(ImageUrl imageUrl, User user, String str, String str2) {
        this.A02 = str;
        this.A00 = imageUrl;
        this.A03 = str2;
        this.A01 = user;
    }
}
