package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.2zY  reason: invalid class name and case insensitive filesystem */
public final class C54502zY {
    public static void A00(C021209x r4, UserSession userSession, User user, String str, String str2, String str3) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        C18190wL.A1U(A0y);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) r4, "ig_wellbeing_mention_controls_action"), 1517);
        A0I.A0S("actor_ig_userid", Long.valueOf(userSession.getUserId()));
        A0I.A0T("entrypoint", str);
        C18210wN.A1A(A0I, str2);
        C18190wL.A1I(A0I, str3);
        A0I.A0Q("is_user_mentionable_value_consistent", C18180wK.A0Y());
        A0I.A1h(A0y);
        if (user != null) {
            A0I.A0S("ig_userid", Long.valueOf(user.getId()));
            A0I.A0Q("is_user_mentionable", Boolean.valueOf(user.A3V()));
            A0I.A0Q(I17.A00(113), Boolean.valueOf(C23527Ctp.A00(userSession).A0N(user)));
        }
        A0I.Bb4();
    }
}
