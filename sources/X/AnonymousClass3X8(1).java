package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.DexOptimization;
import com.instagram.service.session.UserSession;

/* renamed from: X.3X8  reason: invalid class name */
public final class AnonymousClass3X8 {
    public static final AnonymousClass3X8 A00 = new AnonymousClass3X8();

    public static final void A00(C11630kW r4, UserSession userSession, String str) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r4, userSession), "ig_smb_sensitive_event"), 1432);
        A0I.A0S("ig_userid", AnonymousClass0wJ.A0d(userSession.getUserId()));
        A0I.A0T("product", "support_diversity_business_sticker_produce");
        C18190wL.A1I(A0I, "support_diversity_business_sticker_tray");
        C18210wN.A1A(A0I, str);
        A0I.A0T("event_source", DexOptimization.OPT_KEY_CLIENT);
        A0I.Bb4();
    }
}
