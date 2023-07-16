package X;

import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: X.2Kx  reason: invalid class name and case insensitive filesystem */
public final class C34792Kx {
    public static C32165H8c A00(C11630kW r6, UserSession userSession, Integer num, Collection collection, Collection collection2) {
        String str;
        JSONArray A0i = C18250wR.A0i();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C18210wN.A1R(it, A0i);
        }
        JSONArray A0i2 = C18250wR.A0i();
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            C18210wN.A1R(it2, A0i2);
        }
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("friendships/set_besties/");
        switch (num.intValue()) {
            case 0:
                str = "audience_dialog";
                break;
            case 1:
                str = "audience_manager";
                break;
            case 2:
                str = "profile_actions";
                break;
            default:
                str = "netego_unit";
                break;
        }
        A0N.A0O("source", str);
        A0N.A0O(IgFragmentActivity.MODULE_KEY, r6.getModuleName());
        A0N.A0R("block_on_empty_thread_creation", false);
        C18240wQ.A18(A0N);
        A0N.A0Q("add", A0i.toString());
        A0N.A0Q("remove", A0i2.toString());
        return C18190wL.A0Q(A0N);
    }
}
