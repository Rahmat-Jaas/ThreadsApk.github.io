package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.49p  reason: invalid class name and case insensitive filesystem */
public final class C696849p implements AnonymousClass0i1 {
    public long A00;
    public final C90715dy A01;
    public final UserSession A02;

    public C696849p(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = AnonymousClass6JQ.A00(userSession);
    }

    public final void A00() {
        long j = this.A00;
        if (j != 0) {
            this.A01.flowEndCancel(j, "user_cancelled");
            this.A00 = 0;
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        A00();
    }
}
