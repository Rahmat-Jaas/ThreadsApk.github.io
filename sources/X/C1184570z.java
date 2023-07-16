package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.70z  reason: invalid class name and case insensitive filesystem */
public final class C1184570z {
    public static final void A00(AnonymousClass1R8 r4, UserSession userSession) {
        AnonymousClass33E r0 = r4.A00;
        if (r0 == null) {
            C18250wR.A0m();
            throw null;
        }
        User user = r0.A00;
        C84664te A0J = user.A0J();
        if (A0J != null) {
            AnonymousClass3LY.A00(userSession).CWx(new C131337rn(C23937D1z.GROUP_PROFILE_MEMBERS, C18210wN.A03(user.A0n())));
            AnonymousClass3LY.A00(userSession).CWx(new C131337rn(C23937D1z.GROUP_PROFILE_ADMINS, A0J.Axu()));
            AnonymousClass3LY.A00(userSession).CWx(new C131337rn(C23937D1z.GROUP_PROFILE_BLOCKED, A0J.Axw()));
        }
    }

    public static final void A01(UserSession userSession, User user) {
        AnonymousClass3LY.A00(userSession).CWx(new C131227rc(C23932D1u.A02, user.getId()));
    }
}
