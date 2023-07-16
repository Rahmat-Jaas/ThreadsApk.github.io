package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2qk  reason: invalid class name and case insensitive filesystem */
public final class C49042qk {
    public static boolean A00(UserSession userSession, User user) {
        if (user.A0n() == null || user.A0n().intValue() < 10) {
            return false;
        }
        C696949q A03 = AnonymousClass3Zs.A03(userSession);
        D2R d2r = D2R.A1m;
        if (((long) C18190wL.A04(A03.A01(d2r), "review_followers_prompt_last_time_shown")) + 7776000 > System.currentTimeMillis() / 1000) {
            return false;
        }
        AnonymousClass0wJ.A11(AnonymousClass3Zs.A03(userSession).A01(d2r).edit(), "review_followers_prompt_last_time_shown", (int) (System.currentTimeMillis() / 1000));
        return true;
    }
}
