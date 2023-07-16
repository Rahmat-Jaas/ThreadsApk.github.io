package X;

import com.instagram.user.model.User;

/* renamed from: X.5N1  reason: invalid class name */
public final class AnonymousClass5N1 extends AnonymousClass0Sf implements C144908jU {
    public final User A00;
    public final String A01;
    public final String A02;

    public AnonymousClass5N1(User user, String str, String str2) {
        C18180wK.A1P(str, 1, str2);
        this.A01 = str;
        this.A00 = user;
        this.A02 = str2;
    }

    public final AnonymousClass5N1 D6z(C112176p7 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5N1) {
                AnonymousClass5N1 r5 = (AnonymousClass5N1) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A02, (C18180wK.A03(this.A01) + AnonymousClass0wJ.A03(this.A00)) * 31);
    }
}
