package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4Fp  reason: invalid class name and case insensitive filesystem */
public final class C70654Fp implements C82884qQ {
    public final UserSession A00;

    public final boolean CW4(C58743Gz r4) {
        C04620Ok r0 = C06810aP.A01;
        UserSession userSession = this.A00;
        if (C18200wM.A0a(userSession, r0) != C169839tz.PrivacyStatusPublic || !AnonymousClass2MS.A00(userSession)) {
            return false;
        }
        return true;
    }

    public C70654Fp(UserSession userSession) {
        this.A00 = userSession;
    }
}
