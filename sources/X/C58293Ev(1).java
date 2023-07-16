package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3Ev  reason: invalid class name and case insensitive filesystem */
public final class C58293Ev {
    public GJS A00;
    public final UserSession A01;

    public final void A00() {
        if (this.A00 == null) {
            this.A00 = new GJS(H89.A01(this.A01, "IgRxPresence").A03.A0E(C693248c.A00).A0H(GYG.A02("presence_instagram")));
        }
    }

    public C58293Ev(UserSession userSession) {
        this.A01 = userSession;
    }
}
