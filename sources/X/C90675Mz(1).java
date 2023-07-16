package X;

import com.instagram.user.model.User;

/* renamed from: X.5Mz  reason: invalid class name and case insensitive filesystem */
public final class C90675Mz extends AnonymousClass0Sf implements C145618kn {
    public final User A00;
    public final String A01;

    public final C90675Mz D6f(C112176p7 r1) {
        return this;
    }

    public final C90675Mz D6g(C144028hi r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90675Mz) {
                C90675Mz r5 = (C90675Mz) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, C18210wN.A04(this.A00));
    }

    public C90675Mz(User user, String str) {
        AnonymousClass0wJ.A1O(user, str);
        this.A00 = user;
        this.A01 = str;
    }
}
