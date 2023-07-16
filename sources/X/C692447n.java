package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.47n  reason: invalid class name and case insensitive filesystem */
public final class C692447n implements C10390iG, AnonymousClass0i4 {
    public UserSession A00;

    public C692447n(UserSession userSession) {
        this.A00 = userSession;
        C691847d.A02(this);
    }

    public final void onAppBackgrounded() {
        int A03 = C14030oh.A03(-1484072957);
        C28161tl A01 = AnonymousClass3WS.A01(this.A00);
        AnonymousClass0wJ.A12(C28161tl.A02(A01), "reset_to_main_feed_background_time", System.currentTimeMillis());
        C14030oh.A0A(1363321405, A03);
    }

    public final void onAppForegrounded() {
        int A03 = C14030oh.A03(-1744535378);
        System.currentTimeMillis();
        C14030oh.A0A(1128201969, A03);
    }

    public final void onSessionWillEnd() {
        C691847d.A03(this);
    }
}
