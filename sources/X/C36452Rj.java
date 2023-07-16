package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Rj  reason: invalid class name and case insensitive filesystem */
public final class C36452Rj {
    public static C32165H8c A00(Context context, UserSession userSession, boolean z) {
        C09140ev r1 = C09140ev.A02;
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("nux/new_account_nux_seen/");
        C63383hO.A03(A0N, C09140ev.A00(context));
        C18180wK.A1J(A0N, userSession, "guid", r1.A05(context));
        A0N.A0R("is_fb4a_installed", z);
        AnonymousClass269.A09(A0N);
        return AnonymousClass0wJ.A0S(A0N);
    }
}
