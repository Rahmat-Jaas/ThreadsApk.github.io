package X;

import android.util.Pair;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.quickpromotion.sdk.IGFetcher;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4KC  reason: invalid class name */
public final class AnonymousClass4KC implements C07060ap {
    public static final C04530Oa A00 = AnonymousClass0OY.A01(AnonymousClass006.A00, C76514eD.A00);

    public static void A00(AnonymousClass0IB r14, C568338s r15, C560535p r16, UserSession userSession, C86034wA r18, int i) {
        C86034wA r3 = r18;
        UserSession userSession2 = userSession;
        C04220Ms.A0B(userSession2, 0);
        ImmutableSetMultimap immutableSetMultimap = r16.A00;
        if (immutableSetMultimap.isEmpty()) {
            AnonymousClass0LU.A0O("IGFetcherUserOperationPayload", "%s is not in experiment and will not retrieve via background fetch", userSession2.getUserId());
            ((C27178EfE) r3).A0M(new C568238r((C963064g) null, userSession2.getUserId()));
            return;
        }
        userSession2.getUserId();
        A00.getValue();
        JSONObject A0y = C18230wP.A0y();
        ImmutableMap immutableMap = immutableSetMultimap.A01;
        C04220Ms.A06(immutableMap);
        Iterator it = immutableMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(it);
            QuickPromotionSurface quickPromotionSurface = (QuickPromotionSurface) A0o.getKey();
            JSONArray A0i = C18250wR.A0i();
            for (Trigger trigger : (Collection) A0o.getValue()) {
                A0i.put(trigger.A01);
            }
            try {
                A0y.put(String.valueOf(quickPromotionSurface.A00), A0i);
            } catch (JSONException e) {
                AnonymousClass0LU.A0K("IGFetcherUserOperationPayload", "Failed to create %s parameters", e, "surfaces_to_triggers");
            }
        }
        String A0n = C18190wL.A0n(A0y);
        AnonymousClass3UU r6 = r15.A00;
        if (r6.A01.isEmpty()) {
            HashMap A0y2 = AnonymousClass0wJ.A0y();
            if (!immutableMap.isEmpty()) {
                Iterator it2 = immutableMap.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry A0o2 = C18180wK.A0o(it2);
                    Object key = A0o2.getKey();
                    Collection collection = (Collection) A0o2.getValue();
                    QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0W;
                    C04220Ms.A04(key);
                    List<C40337Lct> A01 = M5W.A01(quickPromotionSlot);
                    ArrayList A0t = C18200wM.A0t(A01);
                    for (C40337Lct lct : A01) {
                        QuickPromotionSurface quickPromotionSurface2 = lct.A00;
                        C04220Ms.A06(quickPromotionSurface2);
                        A0t.add(quickPromotionSurface2);
                    }
                    if (A0t.contains(key)) {
                        C04220Ms.A04(collection);
                        C04220Ms.A0B(quickPromotionSlot, 0);
                        Collection collection2 = (Collection) M5W.A00.get(quickPromotionSlot);
                        if (collection2 != null && !Collections.disjoint(collection2, collection)) {
                            Pair A002 = C25117Dg4.A00(userSession2);
                            if (A002 != null) {
                                A0y2.put("lat", String.valueOf(A002.first));
                                A0y2.put("lng", String.valueOf(A002.second));
                            }
                        }
                    }
                }
            }
            r6 = new AnonymousClass3UU(A0y2);
        }
        H1T A0O = AnonymousClass0wJ.A0O(userSession2);
        A0O.A0J("qp/batch_fetch/");
        ImmutableSet<QuickPromotionSurface> keySet = immutableMap.keySet();
        C04220Ms.A06(keySet);
        JSONObject A0y3 = C18230wP.A0y();
        try {
            for (QuickPromotionSurface quickPromotionSurface3 : keySet) {
                A0y3.put(String.valueOf(quickPromotionSurface3.A00), quickPromotionSurface3.A01);
            }
        } catch (JSONException e2) {
            AnonymousClass0LU.A0E(AnonymousClass0N8.A00(IGFetcher.class), "Failed to create surfaces_to_queries parameters", e2);
        }
        A0O.A0O("surfaces_to_queries", C18190wL.A0n(A0y3));
        A0O.A0O("vc_policy", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A0O.A0O(ClientCookie.VERSION_ATTR, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A0O.A0O("surfaces_to_triggers", A0n);
        A0O.A0O("scale", String.valueOf(i));
        A0O.A0R("is_sdk", true);
        ImmutableMap immutableMap2 = r6.A01;
        if (!immutableMap2.isEmpty()) {
            C04220Ms.A0C(immutableMap2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            A0O.A0O("trigger_context", new JSONObject(immutableMap2).toString());
        }
        C32165H8c A0T = C18180wK.A0T(A0O, C963064g.class, AnonymousClass3O1.class);
        A0T.A00 = new AnonymousClass1hM(r14, userSession2.getUserId(), r3);
        C31155GhB.A03(A0T);
    }
}
