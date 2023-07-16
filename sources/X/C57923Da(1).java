package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3Da  reason: invalid class name and case insensitive filesystem */
public final class C57923Da {
    public final C61593Uj A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        C61593Uj r0 = C61593Uj.A03;
        if (r0 == null) {
            synchronized (this) {
                r0 = C61593Uj.A03;
                if (r0 == null) {
                    r0 = new C61593Uj(userSession);
                    C61593Uj.A03 = r0;
                }
            }
        }
        return r0;
    }
}
