package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3Nr  reason: invalid class name and case insensitive filesystem */
public final class C60103Nr {
    public static final boolean A00(UserSession userSession, User user) {
        Boolean BUs;
        C04220Ms.A0B(userSession, 0);
        User A0Y = AnonymousClass0wJ.A0Y(userSession);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36327962965977327L) && user.A2u() && (BUs = A0Y.A05.BUs()) != null && BUs.booleanValue()) {
            return false;
        }
        if (C19573AyZ.A06(userSession, user)) {
            return true;
        }
        if (user.A0e() != C169839tz.PrivacyStatusPrivate || C23527Ctp.A00(userSession).A0N(user)) {
            return !user.BRq();
        }
        return false;
    }

    public static final boolean A01(User user) {
        String Ak1;
        String A0v;
        if (!user.A2v()) {
            return false;
        }
        if (user.A34() || (Ak1 = user.Ak1()) == null || Ak1.length() == 0 || (A0v = user.A0v()) == null || A0v.length() == 0) {
            return true;
        }
        return false;
    }
}
