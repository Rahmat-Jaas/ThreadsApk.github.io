package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2N8  reason: invalid class name */
public final class AnonymousClass2N8 {
    public static BKU A00(BKU bku, UserSession userSession, String str) {
        User A0P;
        if (bku != null) {
            BKN bkn = bku.A0f;
            if (!(bkn.A4Y == null || bku.A2Z(userSession) != null || (A0P = C18210wN.A0P(userSession, str)) == null)) {
                bkn.A1i = A0P;
                return C19462Awj.A01(userSession).A03(bku);
            }
        }
        return bku;
    }
}
