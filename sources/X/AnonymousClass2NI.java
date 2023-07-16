package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.2NI  reason: invalid class name */
public final class AnonymousClass2NI {
    public static void A00(UserSession userSession, String str) {
        if (str != null) {
            SharedPreferences A04 = C28161tl.A04(userSession);
            C18180wK.A0u(A04.edit(), AnonymousClass00U.A0L("direct_thread_draft_", str));
            C18180wK.A0u(A04.edit(), AnonymousClass00U.A0L("direct_thread_draft_timestamp_", str));
        }
    }
}
