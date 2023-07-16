package X;

import com.instagram.user.model.User;

/* renamed from: X.16f  reason: invalid class name and case insensitive filesystem */
public final class C208116f extends AnonymousClass0Sf {
    public final String A00;
    public final User A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C208116f) {
                C208116f r5 = (C208116f) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A04(this.A01) + AnonymousClass0wJ.A06(this.A00);
    }

    public C208116f(User user, String str) {
        this.A01 = user;
        this.A00 = str;
    }
}
