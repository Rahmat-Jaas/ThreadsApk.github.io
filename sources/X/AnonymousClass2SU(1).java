package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2SU  reason: invalid class name */
public final class AnonymousClass2SU {
    public static final C309223m A00(UserSession userSession, User user) {
        AnonymousClass0wJ.A1N(userSession, user);
        if (C18250wR.A1J(userSession, user.getId())) {
            return C309223m.SELF;
        }
        if (C23527Ctp.A00(userSession).A0L(user) == C23894D0g.FollowStatusFollowing) {
            return C309223m.FOLLOWING;
        }
        return C309223m.NOT_FOLLOWING;
    }
}
