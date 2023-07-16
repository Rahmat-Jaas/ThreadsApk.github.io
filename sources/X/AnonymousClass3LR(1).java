package X;

import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.3LR  reason: invalid class name */
public final class AnonymousClass3LR {
    public static final void A00(C63873iU r5, UserSession userSession, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        String str6;
        C04220Ms.A0B(userSession, 0);
        C04220Ms.A0B(str, 1);
        AnonymousClass0wJ.A1Q(str2, str3);
        if (str4 != null) {
            StringBuilder A0r = C18200wM.A0r();
            A0r.append("stories/private_stories/");
            if (z) {
                A0r.append(str4);
                str6 = "/add_viewer/";
            } else {
                A0r.append(str4);
                str6 = "/remove_viewer/";
            }
            str5 = C18180wK.A0i(str6, A0r);
        } else if (z) {
            str5 = "stories/private_stories/add_member/";
        } else {
            str5 = "stories/private_stories/remove_member/";
        }
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0J(str5);
        C18250wR.A17(A0O, str3);
        A0O.A0O(IgFragmentActivity.MODULE_KEY, str);
        A0O.A0O("source", str2);
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, C85814vo.class, AnonymousClass3Za.class);
        if (r5 != null) {
            A0T.A00 = r5;
        }
        C31155GhB.A03(A0T);
    }

    public static final void A01(C63873iU r7, UserSession userSession, String str, String str2, List list) {
        String str3;
        C04220Ms.A0B(userSession, 0);
        C04220Ms.A0B(str, 2);
        JSONArray A0i = C18250wR.A0i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0i.put(((AnonymousClass395) it.next()).A01.getId());
        }
        if (str2 != null) {
            str3 = AnonymousClass00U.A0V("stories/private_stories/media/", str2, "/allowlist/edit/");
        } else {
            str3 = "stories/private_stories/bulk_update_members/";
        }
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0J(str3);
        A0O.A0O("added_user_ids", (String) null);
        A0O.A0O("removed_user_ids", A0i.toString());
        A0O.A0O(IgFragmentActivity.MODULE_KEY, "audience_selection");
        A0O.A0O("source", str);
        A0O.A0P("media_id", str2);
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, C85814vo.class, AnonymousClass3Za.class);
        if (r7 != null) {
            A0T.A00 = r7;
        }
        C31155GhB.A03(A0T);
    }
}
