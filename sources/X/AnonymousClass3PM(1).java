package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3PM  reason: invalid class name */
public final class AnonymousClass3PM {
    public static void A00(Context context, C63873iU r10, UserSession userSession, User user, String str, String str2, boolean z, boolean z2, boolean z3) {
        User user2 = user;
        String id = user.getId();
        UserSession userSession2 = userSession;
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("friendships/mute_posts_or_story_from_follow/");
        A0N.A0O("container_module", str2);
        boolean z4 = z;
        if (z) {
            A0N.A0O("target_posts_author_id", id);
        }
        boolean z5 = z2;
        if (z2) {
            A0N.A0O("target_reel_author_id", id);
        }
        if (str != null) {
            A0N.A0O("media_id", str);
        }
        C32165H8c A0T = C18180wK.A0T(A0N, C22081Th.class, AnonymousClass3PJ.class);
        A0T.A00 = new C24351hx(context, r10, AnonymousClass3LY.A00(userSession), userSession2, user2, z4, z5, z3);
        C31155GhB.A03(A0T);
    }

    public static void A01(C63873iU r8, UserSession userSession, User user, String str, boolean z, boolean z2) {
        User user2 = user;
        String id = user.getId();
        UserSession userSession2 = userSession;
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("friendships/unmute_posts_or_story_from_follow/");
        A0N.A0O("container_module", str);
        boolean z3 = z;
        if (z) {
            A0N.A0O("target_posts_author_id", id);
        }
        boolean z4 = z2;
        if (z2) {
            A0N.A0O("target_reel_author_id", id);
        }
        C32165H8c A0T = C18180wK.A0T(A0N, C22081Th.class, AnonymousClass3PJ.class);
        A0T.A00 = new C24321hu(r8, AnonymousClass3LY.A00(userSession), userSession2, user2, z3, z4);
        C31155GhB.A03(A0T);
    }
}
