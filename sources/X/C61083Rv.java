package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Rv  reason: invalid class name and case insensitive filesystem */
public final class C61083Rv {
    public final C13330nS A00;

    public static final void A00(AnonymousClass29Z r2, C61083Rv r3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r3.A00, "direct_welcome_message_events"), 555);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18220wO.A1E(r2, A0I);
            A0I.A0Q(I17.A00(619), bool);
            A0I.A0Q("has_emoji", bool3);
            A0I.A0Q("has_message_content", bool2);
            A0I.A1J(str2);
            A0I.A0T("source", str);
            A0I.A0Q("is_default_content", bool4);
            A0I.Bb4();
        }
    }

    public C61083Rv(C11630kW r2, UserSession userSession) {
        this.A00 = C13330nS.A01(r2, userSession);
    }
}
