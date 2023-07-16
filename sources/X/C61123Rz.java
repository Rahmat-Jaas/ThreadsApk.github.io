package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.3Rz  reason: invalid class name and case insensitive filesystem */
public final class C61123Rz {
    public final C13330nS A00;

    public static final void A00(C61123Rz r2, String str, Map map) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r2.A00, "instagram_debug_telemetry"), 1783);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T("tag", "pending_action_store");
            A0I.A0T("type", str);
            A0I.A0V("data", map);
            A0I.Bb4();
        }
    }

    public C61123Rz(UserSession userSession) {
        this.A00 = C13330nS.A02(userSession);
    }
}
