package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.6Ts  reason: invalid class name and case insensitive filesystem */
public final class C102076Ts {
    public static final boolean A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        if (AnonymousClass7JZ.A01(userSession)) {
            return AnonymousClass7JZ.A05(userSession, "news");
        }
        if (!AnonymousClass7JZ.A02(userSession) || !AnonymousClass7JZ.A04(userSession)) {
            return false;
        }
        return true;
    }
}
