package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3EY  reason: invalid class name */
public final class AnonymousClass3EY {
    public final C13330nS A00;

    public AnonymousClass3EY(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = C13330nS.A02(userSession);
    }

    public final void A00(AnonymousClass294 r3) {
        C04220Ms.A0B(r3, 0);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "ig_dogfooding_first_event"), 1170);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0O(r3, "event_name");
            A0I.Bb4();
        }
    }
}
