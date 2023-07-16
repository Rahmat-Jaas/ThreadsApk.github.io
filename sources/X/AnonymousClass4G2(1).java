package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4G2  reason: invalid class name */
public final class AnonymousClass4G2 implements C82884qQ {
    public final UserSession A00;

    public final boolean CW4(C58743Gz r4) {
        C04620Ok r0 = C06810aP.A01;
        UserSession userSession = this.A00;
        if (C18200wM.A0a(userSession, r0) != C169839tz.PrivacyStatusPublic || !C548530j.A00.A05(userSession)) {
            return false;
        }
        return true;
    }

    public AnonymousClass4G2(UserSession userSession) {
        this.A00 = userSession;
    }
}
