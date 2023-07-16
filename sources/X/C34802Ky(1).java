package X;

import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: X.2Ky  reason: invalid class name and case insensitive filesystem */
public final class C34802Ky {
    public static final C32165H8c A00(C11630kW r6, UserSession userSession, Collection collection, Collection collection2) {
        C04220Ms.A0B(userSession, 0);
        AnonymousClass0wJ.A1O(r6, collection);
        C04220Ms.A0B(collection2, 3);
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
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0J("friendships/update_feed_favorites/");
        A0O.A0O(IgFragmentActivity.MODULE_KEY, r6.getModuleName());
        A0O.A0R("block_on_empty_thread_creation", false);
        A0O.A0B(AnonymousClass1S4.class, AnonymousClass3LP.class);
        A0O.A0Q("add", A0i.toString());
        A0O.A0Q("remove", A0i2.toString());
        return C18190wL.A0Q(A0O);
    }
}
