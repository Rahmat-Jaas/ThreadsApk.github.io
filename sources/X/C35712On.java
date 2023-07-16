package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.2On  reason: invalid class name and case insensitive filesystem */
public final class C35712On {
    public static void A00(AnonymousClass29S r4, AnonymousClass296 r5, C318629g r6, AnonymousClass2A6 r7, UserSession userSession, String str, Map map) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "fx_growth_identity_syncing"), 684);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0O(r4, "event_name");
            if (r5 == null) {
                r5 = AnonymousClass296.FX_UNKNOWN;
            }
            A0I.A0O(r5, "entry_point");
            A0I.A0O(r7, "flow_type");
            A0I.A0S("initiator_account_id", AnonymousClass0wJ.A0d(userSession.getUserId()));
            A0I.A0O(C317028q.INSTAGRAM, "initiator_account_type");
            A0I.A0O(r6, "origin");
            A0I.A0T("from_value", (String) null);
            A0I.A0T("to_value", str);
            A0I.A0V("additional_info", map);
            A0I.Bb4();
        }
    }
}
