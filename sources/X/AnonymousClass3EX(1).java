package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3EX  reason: invalid class name */
public final class AnonymousClass3EX {
    public final C13330nS A00;

    public AnonymousClass3EX(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = C13330nS.A02(userSession);
    }

    public final void A00(C319229m r3) {
        C04220Ms.A0B(r3, 0);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "dogfooding_rageshake_event"), 563);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0O(r3, "event_type");
            A0I.Bb4();
        }
    }
}
