package X;

import com.instagram.user.model.User;

/* renamed from: X.1ou  reason: invalid class name and case insensitive filesystem */
public final class C25781ou extends C35142Mg {
    public final User A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25781ou) {
                C25781ou r5 = (C25781ou) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A04 = (C18210wN.A04(this.A00) + AnonymousClass0wJ.A06(this.A01)) * 31;
        boolean z = this.A02;
        if (z) {
            z = true;
        }
        return A04 + (z ? 1 : 0);
    }

    public C25781ou(User user, String str, boolean z) {
        this.A00 = user;
        this.A01 = str;
        this.A02 = z;
    }
}
