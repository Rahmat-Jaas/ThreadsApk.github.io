package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4Fw  reason: invalid class name and case insensitive filesystem */
public final class C70724Fw implements C82884qQ {
    public final UserSession A00;

    public final boolean CW4(C58743Gz r4) {
        UserSession userSession = this.A00;
        C62813an A01 = C62813an.A01(userSession);
        String userId = userSession.getUserId();
        if (!A01.A07(userId) || C62813an.A00(A01, userId) <= 0) {
            return false;
        }
        return true;
    }

    public C70724Fw(UserSession userSession) {
        this.A00 = userSession;
    }
}
