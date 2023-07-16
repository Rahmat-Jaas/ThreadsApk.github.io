package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2sd  reason: invalid class name and case insensitive filesystem */
public final class C50212sd {
    public static boolean A00(UserSession userSession, User user) {
        Boolean BZ2;
        User A0Y = AnonymousClass0wJ.A0Y(userSession);
        C41840MeW meW = user.A05;
        if (meW.BZ2() != null && (BZ2 = meW.BZ2()) != null && !BZ2.booleanValue() && !A0Y.getId().equals(user.getId())) {
            return true;
        }
        if (A0Y.A0e() != C169839tz.PrivacyStatusPrivate || user.A3Q() || A0Y.getId().equals(user.getId()) || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36322160465222874L)) {
            return false;
        }
        return true;
    }
}
