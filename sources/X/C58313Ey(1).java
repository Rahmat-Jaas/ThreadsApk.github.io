package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Ey  reason: invalid class name and case insensitive filesystem */
public final class C58313Ey {
    public final C11630kW A00;
    public final C13330nS A01;

    public C58313Ey(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        C15720rm r0 = new C15720rm("CreatorMonetizationSupportInboxLogger");
        this.A00 = r0;
        this.A01 = C13330nS.A01(r0, userSession);
    }

    public final void A00(C315828e r3, AnonymousClass29T r4, String str) {
        AnonymousClass0wJ.A1N(r4, r3);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A01, "ig_creator_monetization_support_inbox"), 1155);
        A0I.A0O(r4, OptSvcAnalyticsStore.LOGGING_KEY_STEP);
        C18220wO.A1E(r3, A0I);
        A0I.A0T("client_extra", str);
        A0I.Bb4();
    }
}
