package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.DexOptimization;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Eg  reason: invalid class name */
public final class AnonymousClass3Eg {
    public final C13330nS A00;

    public AnonymousClass3Eg(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = C13330nS.A02(userSession);
    }

    public final void A00(long j, String str) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "ig_smb_sensitive_event"), 1432);
        A0I.A0S("ig_userid", Long.valueOf(j));
        A0I.A0T("product", "network_call");
        C18190wL.A1I(A0I, "diversity_info_gql_success");
        C18210wN.A1A(A0I, "success");
        A0I.A0T("event_source", DexOptimization.OPT_KEY_CLIENT);
        C18210wN.A1B(A0I, str);
        A0I.Bb4();
    }
}
