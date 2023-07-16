package X;

import android.content.SharedPreferences;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.1n4  reason: invalid class name */
public final class AnonymousClass1n4 extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1n4(C697249u r3) {
        super("maybeLogOneTapStatus", 377);
        this.A00 = r3;
    }

    public final void loggedRun() {
        String str;
        UserSession userSession = this.A00.A06;
        SharedPreferences A04 = C28161tl.A04(userSession);
        long j = A04.getLong("last_one_tap_status_logged_date", 0);
        if (j == 0 || C18240wQ.A09(j) > 604800000) {
            String userId = userSession.getUserId();
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "sso_status"), 2738);
            if (C63533hk.A02(userSession).A0I(userId)) {
                str = "YES";
            } else {
                str = "NO";
            }
            A0I.A0T("enabled", str);
            A0I.A0S("enable_igid", AnonymousClass0wJ.A0d(userId));
            C18210wN.A1C(A0I, "sso_status");
            AnonymousClass0wJ.A12(A04.edit(), "last_one_tap_status_logged_date", System.currentTimeMillis());
        }
    }
}
