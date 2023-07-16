package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.6jZ  reason: invalid class name and case insensitive filesystem */
public final class C109166jZ {
    public final long A00;
    public final C13330nS A01;
    public final String A02;

    public C109166jZ(C11630kW r3, UserSession userSession, String str) {
        C18180wK.A1P(userSession, 1, str);
        this.A02 = str;
        this.A01 = C13330nS.A01(r3, userSession);
        this.A00 = Long.parseLong(userSession.getUserId());
    }
}
