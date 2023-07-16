package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.1sF  reason: invalid class name and case insensitive filesystem */
public final class C27271sF extends AnonymousClass494 {
    public final SharedPreferences A00 = C08340dC.A01("direct_share_sheet");
    public final UserSession A01;

    public C27271sF(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
    }
}
