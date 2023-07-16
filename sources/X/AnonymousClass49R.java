package X;

import android.content.SharedPreferences;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.redex.IDxFCallbackShape113S0200000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl;
import com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.49R  reason: invalid class name */
public final class AnonymousClass49R implements AnonymousClass0i4 {
    public Map A00;
    public Map A01;
    public String A02;
    public Map A03;
    public final AnonymousClass49V A04;
    public final UserSession A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass49R(UserSession userSession) {
        this();
        C04220Ms.A0B(userSession, 1);
        this.A05 = userSession;
        this.A04 = (AnonymousClass49V) userSession.A01(AnonymousClass49V.class, new KtLambdaShape75S0100000_I2_55(userSession, 43));
        this.A01 = new LinkedHashMap(A02((List) null));
        this.A02 = "";
    }

    public final void A03(CallerContext callerContext, C83954sG r23, String str, List list, Map map) {
        PandoGraphQLRequest pandoGraphQLRequest;
        C31580Grx A012;
        CallerContext callerContext2 = callerContext;
        String str2 = str;
        boolean A1Z = AnonymousClass0wJ.A1Z(str2, callerContext2);
        List list2 = list;
        C04220Ms.A0B(list2, 2);
        if (A07()) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            Map map2 = map;
            Iterator it = map2.keySet().iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
                GraphQlCallInput.A05(A002, A0k, "key");
                GraphQlCallInput.A05(A002, C18220wO.A0r(A0k, map2), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                A0v.add(A002);
            }
            AnonymousClass49V r2 = this.A04;
            String str3 = callerContext2.A02;
            C04220Ms.A06(str3);
            r2.A04("service_manual_fetch_attempt", str2, list2, C63203gz.A03("caller_class", str3));
            AnonymousClass3VF r15 = new AnonymousClass3VF(callerContext2, this, r23, str2, list2);
            UserSession userSession = this.A05;
            if (C63793iM.A0E(userSession) && "".equals(this.A02)) {
                C31152Gh4 A003 = C60833Qr.A00(C10600ic.A00).A00("FX_CACHE_FDID_STORE");
                C04220Ms.A06(A003);
                String A0A = A003.A0A("fdid", "");
                C04220Ms.A06(A0A);
                this.A02 = A0A;
            }
            ImmutableList A0S = C18220wO.A0S(list2);
            String str4 = this.A02;
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0v);
            C04220Ms.A0B(userSession, 0);
            int i = 3;
            C04220Ms.A0B(str4, 3);
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            for (Object next : A0S) {
                if (AnonymousClass3R1.A00.contains(next)) {
                    A0v2.add(next);
                }
            }
            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) A0v2);
            boolean A0E = C63793iM.A0E(userSession);
            C67463zb A004 = C67463zb.A00();
            C67463zb A005 = C67463zb.A00();
            if (A0E) {
                A004.A05("family_device_id", str4);
                boolean z = true;
                A004.A06("service_names", copyOf2);
                if (copyOf2 == null) {
                    z = false;
                }
                A004.A05("caller_name", "fx_product_foundation_client_FXOnline_client_cache");
                A004.A06("custom_partner_params", copyOf);
                AnonymousClass7Ko.A0B(A1Z);
                AnonymousClass7Ko.A0B(z);
                pandoGraphQLRequest = new PandoGraphQLRequest(C63233h2.A04(A1Z), "FXAICServiceQuery", GraphQlCallInput.A03(A004), GraphQlCallInput.A03(A005), FXAICServiceQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fx_aic");
                pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0);
                A012 = AnonymousClass3WK.A01(userSession);
            } else {
                A004.A06("service_names", copyOf2);
                boolean A1W = AnonymousClass0wJ.A1W(copyOf2);
                A004.A05("caller_name", "fx_product_foundation_client_FXOnline_client_cache");
                A004.A06("custom_partner_params", copyOf);
                AnonymousClass7Ko.A0B(A1W);
                pandoGraphQLRequest = new PandoGraphQLRequest(C63233h2.A04(A1Z), "FxIGAccountsCenterServiceQuery", GraphQlCallInput.A03(A004), GraphQlCallInput.A03(A005), FxIGAccountsCenterServiceQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fx_accounts");
                pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0);
                A012 = AnonymousClass3WK.A01(userSession);
                i = 4;
            }
            A012.AMA(pandoGraphQLRequest, new IDxFCallbackShape113S0200000_1_I2(i, userSession, r15));
        }
    }

    public final synchronized void A05(String str) {
        C04220Ms.A0B(str, 0);
        C18180wK.A0u(C28161tl.A03(this.A05), AnonymousClass00U.A0L("fx_cal_account_center_service_", str));
        Map map = this.A00;
        if (map != null) {
            map.remove(str);
        }
    }

    public final synchronized void A06(List list) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            Map map = this.A01;
            AnonymousClass3VZ r0 = (AnonymousClass3VZ) map.get(A0k);
            if (r0 != null && System.currentTimeMillis() - r0.A00 > 86400000) {
                A05(A0k);
                A0v.add(A0k);
            }
            Object obj = A02(C18180wK.A0n(A0k)).get(A0k);
            if (obj == null) {
                map.remove(A0k);
            } else {
                map.put(A0k, obj);
            }
        }
        if (C18250wR.A1K(A0v)) {
            this.A04.A04("service_cache_eviction", "ig_android_service_cache_fx_internal", A0v, (Map) null);
        }
    }

    public final boolean A08(String str) {
        C04220Ms.A0B(str, 0);
        if (AnonymousClass0wJ.A1X(C18200wM.A0e())) {
            return C54732zv.A00(AnonymousClass006.A0C, C18210wN.A0a(), str);
        } else if (!AnonymousClass0wJ.A1X(C08960ea.A00(18301199245707919L).A01())) {
            return true;
        } else {
            String str2 = (String) C08960ea.A00(18864149199388832L).A01();
            if (str2 == null) {
                return false;
            }
            try {
                JSONArray jSONArray = new JSONArray(str2);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (str.equals(jSONArray.getString(i))) {
                        return true;
                    }
                }
                return false;
            } catch (JSONException unused) {
                return false;
            }
        }
    }

    public final void onSessionWillEnd() {
        UserSession userSession;
        synchronized (this) {
            userSession = this.A05;
            SharedPreferences A042 = C28161tl.A04(userSession);
            Iterator A0x = C18220wO.A0x(A042.getAll());
            while (A0x.hasNext()) {
                String A0k = C18180wK.A0k(A0x);
                C04220Ms.A04(A0k);
                if (C18220wO.A1V("fx_cal_account_center_service", 1, A0k)) {
                    C18180wK.A0u(A042.edit(), A0k);
                }
            }
            Map map = this.A00;
            if (map != null) {
                map.clear();
            }
        }
        this.A01.clear();
        userSession.A03(AnonymousClass49R.class);
    }

    public final Map A02(List list) {
        Set set;
        try {
            C28161tl A012 = AnonymousClass3WS.A01(this.A05);
            if (list != null) {
                set = AnonymousClass00J.A0c(list);
            } else {
                set = null;
            }
            HashMap A0y = AnonymousClass0wJ.A0y();
            SharedPreferences sharedPreferences = A012.A00;
            Iterator A0x = C18220wO.A0x(sharedPreferences.getAll());
            while (A0x.hasNext()) {
                String A0k = C18180wK.A0k(A0x);
                C04220Ms.A04(A0k);
                if (C18220wO.A1V("fx_cal_account_center_service", 1, A0k)) {
                    String substring = A0k.substring(30);
                    C04220Ms.A06(substring);
                    if (set == null || set.contains(substring)) {
                        A0y.put(substring, C18250wR.A0W(sharedPreferences, A0k));
                    }
                }
            }
            LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0N(A0y.size()));
            for (Map.Entry entry : A0y.entrySet()) {
                Object key = entry.getKey();
                AnonymousClass3VZ parseFromJson = C54662zo.parseFromJson(C18180wK.A0L(C18230wP.A0u(entry)));
                if (parseFromJson != null) {
                    A0v.put(key, parseFromJson);
                } else {
                    throw AnonymousClass0wJ.A0b();
                }
            }
            return A0v;
        } catch (IOException | IllegalStateException unused) {
            return AnonymousClass4To.A00();
        }
    }

    public final boolean A07() {
        return C63803iN.A0E(AnonymousClass0TJ.A05, this.A05, 36312715832263844L);
    }

    public final Map A00(CallerContext callerContext, String str, List list) {
        AnonymousClass0wJ.A1O(callerContext, list);
        if (!A07() || !A08(str)) {
            return AnonymousClass4To.A00();
        }
        AnonymousClass49V.A00(callerContext, this, str, list);
        Map map = this.A01;
        LinkedHashMap A0y = C18220wO.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            C18190wL.A1V(A0y, list, C18180wK.A0o(A0z));
        }
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0N(A0y.size()));
        Iterator it = A0y.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(it);
            Object key = A0o.getKey();
            List list2 = ((AnonymousClass3VZ) A0o.getValue()).A03;
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            for (Object next : list2) {
                String str2 = ((AnonymousClass3VT) next).A00;
                String A14 = C06810aP.A01.A01(this.A05).A14();
                if (A14 == null) {
                    A14 = "";
                }
                if (C04220Ms.A0I(str2, A14)) {
                    A0v2.add(next);
                }
            }
            A0v.put(key, A0v2);
        }
        return A0v;
    }

    public final Map A01(CallerContext callerContext, String str, List list) {
        AnonymousClass0wJ.A1O(callerContext, list);
        if (!A07() || !A08(str)) {
            return AnonymousClass4To.A00();
        }
        AnonymousClass49V.A00(callerContext, this, str, list);
        Map map = this.A01;
        LinkedHashMap A0y = C18220wO.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            C18190wL.A1V(A0y, list, C18180wK.A0o(A0z));
        }
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0N(A0y.size()));
        Iterator it = A0y.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(it);
            A0v.put(A0o.getKey(), ((AnonymousClass3VZ) A0o.getValue()).A01);
        }
        return A0v;
    }

    public final void A04(CallerContext callerContext, String str, Map map) {
        boolean A1Y = AnonymousClass0wJ.A1Y(str, callerContext);
        if (A07()) {
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                String A0p = C18200wM.A0p(A0o);
                AnonymousClass3VZ r6 = (AnonymousClass3VZ) A0o.getValue();
                if (r6 == null) {
                    A05(A0p);
                    this.A03.remove(A0p);
                } else {
                    synchronized (this) {
                        C04220Ms.A0B(A0p, A1Y ? 1 : 0);
                        StringWriter A0d = C18230wP.A0d();
                        MMp A0K = C18180wK.A0K(A0d);
                        A0K.A0d(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, r6.A01);
                        A0K.A0U("identity_mapping");
                        A0K.A0I();
                        for (AnonymousClass3VT r2 : r6.A03) {
                            if (r2 != null) {
                                A0K.A0J();
                                A0K.A0d("source_identity_id", r2.A00);
                                A0K.A0U("destination_identities");
                                A0K.A0I();
                                for (AnonymousClass3VW r22 : r2.A01) {
                                    if (r22 != null) {
                                        A0K.A0J();
                                        A0K.A0d("identity_id", r22.A00);
                                        A0K.A0d("identity_type", r22.A01);
                                        A0K.A0d("obfuscated_identity_id", r22.A02);
                                        A0K.A0G();
                                    }
                                }
                                A0K.A0F();
                                A0K.A0G();
                            }
                        }
                        A0K.A0F();
                        A0K.A0U("custom_data");
                        A0K.A0J();
                        Iterator A0u = C18190wL.A0u(r6.A02);
                        while (A0u.hasNext()) {
                            Map.Entry A0o2 = C18180wK.A0o(A0u);
                            A0K.A0U(C18200wM.A0p(A0o2));
                            if (A0o2.getValue() == null) {
                                A0K.A0H();
                            } else {
                                A0K.A0Y(C18230wP.A0u(A0o2));
                            }
                        }
                        A0K.A0G();
                        A0K.A0c("last_update_time_ms", r6.A00);
                        C18180wK.A0v(C28161tl.A03(this.A05), AnonymousClass00U.A0L("fx_cal_account_center_service_", A0p), C18180wK.A0h(A0K, A0d));
                    }
                    Map map2 = this.A03;
                    if (!map2.containsKey(A0p)) {
                        map2.put(A0p, C18220wO.A0y());
                    }
                    Map map3 = (Map) map2.get(A0p);
                    for (AnonymousClass3VT r0 : r6.A03) {
                        for (AnonymousClass3VW r02 : r0.A01) {
                            if (map3 != null) {
                                map3.put(r02.A02, new AnonymousClass3VS(r02.A00, r6.A00));
                            }
                        }
                    }
                }
                Object obj = A02(C18180wK.A0n(A0p)).get(A0p);
                Map map4 = this.A01;
                if (obj == null) {
                    map4.remove(A0p);
                } else {
                    map4.put(A0p, obj);
                }
            }
            AnonymousClass49V r3 = this.A04;
            String str2 = callerContext.A02;
            C04220Ms.A06(str2);
            r3.A04("service_cache_write", str, AnonymousClass00J.A0N(map.keySet()), C63203gz.A03("caller_class", str2));
        }
    }

    public AnonymousClass49R() {
        this.A03 = C18220wO.A0y();
    }
}
