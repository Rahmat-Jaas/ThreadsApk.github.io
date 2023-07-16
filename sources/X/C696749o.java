package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.49o  reason: invalid class name and case insensitive filesystem */
public final class C696749o implements AnonymousClass0i1 {
    public long A00;
    public final C90715dy A01;
    public final UserSession A02;

    public C696749o(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = AnonymousClass6JQ.A00(userSession);
    }

    public final void onUserSessionWillEnd(boolean z) {
        long j = this.A00;
        if (j != 0) {
            this.A01.flowEndCancel(j, "user_cancelled");
            this.A00 = 0;
        }
    }
}
