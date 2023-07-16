package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.2zX  reason: invalid class name and case insensitive filesystem */
public final class C54492zX {
    public static final void A00(C11630kW r5, UserSession userSession, String str, String str2, String str3, String str4) {
        C18180wK.A1R(str2, str3);
        HashMap A0y = AnonymousClass0wJ.A0y();
        C18190wL.A1U(A0y);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r5, userSession), "instagram_wellbeing_self_remediation_action"), 2336);
        A0I.A0T("type", "block");
        C18190wL.A1I(A0I, str);
        A0I.A0S("actor_ig_userid", AnonymousClass0wJ.A0d(str2));
        A0I.A0S("target_ig_userid", AnonymousClass0wJ.A0d(str3));
        A0I.A0T("comment_id", str4);
        A0I.A0S("direct_thread_id", (Long) null);
        A0I.A0S("parent_comment_id", (Long) null);
        A0I.A0S("parent_media_id", (Long) null);
        C18250wR.A11(A0I, (String) null, A0y);
        A0I.Bb4();
    }
}
