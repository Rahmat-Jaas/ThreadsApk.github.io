package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.48x  reason: invalid class name */
public final class AnonymousClass48x implements AnonymousClass0i4 {
    public boolean A00;
    public final UserSession A01;

    public AnonymousClass48x(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final boolean A00() {
        UserSession userSession = this.A01;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A06;
        if (C63803iN.A0E(r2, userSession, 36317517605506873L) || !this.A00 || !C63803iN.A0E(r2, userSession, 36317517605572410L)) {
            return false;
        }
        return true;
    }

    public final void onSessionWillEnd() {
        this.A01.A03(AnonymousClass48x.class);
    }
}
