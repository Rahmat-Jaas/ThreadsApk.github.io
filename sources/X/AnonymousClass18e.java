package X;

import com.instagram.user.model.User;

/* renamed from: X.18e  reason: invalid class name */
public final class AnonymousClass18e extends AnonymousClass0Sf implements C81294nY {
    public final AnonymousClass18R A00;
    public final User A01;
    public final Boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18e) {
                AnonymousClass18e r5 = (AnonymousClass18e) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass0wJ.A03(this.A00) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + C18200wM.A07(this.A01);
    }

    public AnonymousClass18e(AnonymousClass18R r1, User user, Boolean bool) {
        this.A00 = r1;
        this.A02 = bool;
        this.A01 = user;
    }
}
