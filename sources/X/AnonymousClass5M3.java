package X;

import com.instagram.user.model.User;

/* renamed from: X.5M3  reason: invalid class name */
public final class AnonymousClass5M3 extends AnonymousClass0Sf implements C144448iW {
    public final User A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5M3) {
                AnonymousClass5M3 r5 = (AnonymousClass5M3) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String As4() {
        return this.A01;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18180wK.A03(this.A01));
    }

    public AnonymousClass5M3(User user, String str) {
        this.A01 = str;
        this.A00 = user;
    }
}
