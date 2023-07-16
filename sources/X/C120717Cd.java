package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.7Cd  reason: invalid class name and case insensitive filesystem */
public final class C120717Cd {
    public static final C120717Cd A00 = new C120717Cd();

    public static final void A00(C11630kW r1, UserSession userSession, String str) {
        Long A02;
        AnonymousClass0wJ.A1M(userSession, 0, str);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r1, userSession), "profile_link_viewed"), 2515);
        if (AnonymousClass0wJ.A1U(A0I) && (A02 = AnonymousClass4n2.A02(str)) != null) {
            A0I.A0S("profile_owner_id", A02);
            A0I.Bb4();
        }
    }
}
