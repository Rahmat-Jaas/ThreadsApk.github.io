package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.2Ct  reason: invalid class name and case insensitive filesystem */
public final class C32672Ct {
    public static final void A00(UserSession userSession, String str, String str2, String str3, String str4, Map map) {
        Long l;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(new C15720rm("fb_story_to_ig_story_mentions"), userSession), "xav_navigable_mentions"), 2928);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T("event", str);
            if (str2 != null) {
                l = AnonymousClass4n2.A02(str2);
            } else {
                l = null;
            }
            A0I.A0S("ig_userid", l);
            A0I.A0T("mentioned_type", str3);
            A0I.A0T("ig_story_id", str4);
            C18200wM.A1J(A0I, map);
        }
    }
}
