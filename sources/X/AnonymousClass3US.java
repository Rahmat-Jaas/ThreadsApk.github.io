package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3US  reason: invalid class name */
public final class AnonymousClass3US {
    public final C13330nS A00;
    public final String A01;

    public static void A00(AnonymousClass0A3 r2, AnonymousClass3US r3, String str) {
        r2.A0T("event", str);
        r2.A0T("entry_point", r3.A01);
        r2.A0T("component", "toggle");
    }

    public final void A01(String str, Boolean bool) {
        USLEBaseShape0S0000000 A0K = USLEBaseShape0S0000000.A0K(this.A00);
        A00(A0K, this, str);
        C18190wL.A1I(A0K, "ig_message_settings");
        A0K.A0Q("attempted_toggle_value", bool);
        A0K.A0T("message_controls_settings_version", "v2");
        A0K.A1J("Eligible For Toggle But No Toggle Value");
        A0K.A0T("error_identifier", "UNEXPECTED_VALUE");
        A0K.Bb4();
    }

    public AnonymousClass3US(C11630kW r2, UserSession userSession, String str) {
        this.A00 = C13330nS.A01(r2, userSession);
        this.A01 = str;
    }
}
