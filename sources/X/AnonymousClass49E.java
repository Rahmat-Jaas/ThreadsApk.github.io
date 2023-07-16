package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.49E  reason: invalid class name */
public final class AnonymousClass49E implements AnonymousClass0i4 {
    public String A00;
    public final C13330nS A01;
    public final String A02;
    public final UserSession A03;

    public static String A00(C021109v r4, AnonymousClass0A3 r5, AnonymousClass49E r6, User user) {
        AnonymousClass29B r1;
        AnonymousClass29D r12;
        r5.A0O(r4, "event");
        String str = r6.A02;
        r5.A0T("actor_id", str);
        C23894D0g d0g = user.A03;
        if (C04220Ms.A0I(str, user.getId())) {
            r1 = AnonymousClass29B.SELF;
        } else if (d0g == null || d0g.ordinal() != 3) {
            r1 = AnonymousClass29B.NON_FOLLOWER;
        } else {
            r1 = AnonymousClass29B.FOLLOWER;
        }
        r5.A0O(r1, "follower_status");
        C307022o r13 = user.A02;
        if (C04220Ms.A0I(str, user.getId())) {
            r12 = AnonymousClass29D.SELF;
        } else if (r13.ordinal() == 4) {
            r12 = AnonymousClass29D.SUBSCRIBER;
        } else {
            r12 = AnonymousClass29D.NON_SUBSCRIBER;
        }
        r5.A0O(r12, "subscriber_status");
        r5.A0S("profile_user_igid", Long.valueOf(Long.parseLong(user.getId())));
        r5.A0V("extra", new HashMap());
        r5.A0Q("is_test_user", false);
        return r6.A00;
    }

    public final void onSessionWillEnd() {
        this.A03.A03(AnonymousClass49E.class);
    }

    public AnonymousClass49E(UserSession userSession) {
        this.A03 = userSession;
        this.A02 = userSession.getUserId();
        C10680ik r1 = new C10680ik(userSession);
        r1.A02 = "instagram_ibc_profile_actions";
        this.A01 = r1.A00();
    }
}
