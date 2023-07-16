package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4Fz  reason: invalid class name and case insensitive filesystem */
public final class C70754Fz implements C82884qQ {
    public final UserSession A00;

    public final boolean CW4(C58743Gz r3) {
        C04620Ok r0 = C06810aP.A01;
        UserSession userSession = this.A00;
        if (!C59623Lo.A01(r0.A01(userSession))) {
            return false;
        }
        H8D A002 = C60883Qx.A00(userSession);
        C04220Ms.A06(A002);
        synchronized (A002) {
        }
        throw C18210wN.A0W("get");
    }

    public C70754Fz(UserSession userSession) {
        this.A00 = userSession;
    }
}
