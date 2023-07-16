package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.service.session.UserSession;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.391  reason: invalid class name */
public final class AnonymousClass391 {
    public final C28161tl A00;
    public final Set A01;

    public AnonymousClass391(UserSession userSession) {
        HashSet A0u = C18200wM.A0u();
        this.A01 = A0u;
        C28161tl A012 = AnonymousClass3WS.A01(userSession);
        this.A00 = A012;
        try {
            String A0j = C18200wM.A0j(A012.A01);
            if (A0j != null && A0j.length() > 0) {
                String[] A1b = C18190wL.A1b(A0j, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
                A0u.addAll(C06750aI.A17(Arrays.copyOf(A1b, A1b.length)));
            }
        } catch (Exception e) {
            AnonymousClass0LU.A0E("SearchBlacklistStore", "Error reading to hidden entries.  Clearing results.", e);
            C18180wK.A0u(C28161tl.A02(this.A00), "blacklist_search_ids");
        }
    }
}
