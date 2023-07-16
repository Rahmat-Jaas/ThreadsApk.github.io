package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55;

/* renamed from: X.3yx  reason: invalid class name and case insensitive filesystem */
public final class C67153yx implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C67153yx.class);
    public static final String __redex_internal_original_name = "BKBloksFxActionUpdateClientServiceCacheImpl";

    public static final Object A00(AnonymousClass601 r18, C63893iY r19) {
        IllegalStateException illegalStateException;
        AnonymousClass3VZ r1;
        AnonymousClass601 r4 = r18;
        C63893iY r3 = r19;
        boolean A1Z = AnonymousClass0wJ.A1Z(r3, r4);
        Object A0B = C63893iY.A0B(r3, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
        Iterable<Map> iterable = (Iterable) A0B;
        C109326jp A0R = C18190wL.A0R(r3.A00, A1Z ? 1 : 0);
        UserSession A02 = C05030Qo.A02(C63913ic.A0F(r4));
        try {
            C04220Ms.A0B(iterable, 0);
            int A0N = AnonymousClass4WK.A0N(C02260Al.A0z(iterable, 10));
            if (A0N < 16) {
                A0N = 16;
            }
            LinkedHashMap A0v = C18190wL.A0v(A0N);
            for (Map map : iterable) {
                Object obj = map.get("service_name");
                if (!(obj instanceof String) || !(!AnonymousClass8bQ.A0n((CharSequence) obj))) {
                    illegalStateException = C18180wK.A0a("Check failed.");
                } else {
                    if (C04220Ms.A0I(map.keySet(), C18250wR.A0c("service_name"))) {
                        r1 = null;
                    } else {
                        Object obj2 = map.get("service_status");
                        boolean z = true;
                        if (!(obj2 instanceof String) || !(!AnonymousClass8bQ.A0n((CharSequence) obj2))) {
                            z = false;
                        }
                        if (z) {
                            Object obj3 = map.get("identity_mapping_with_obid");
                            if (obj3 instanceof Map) {
                                Object obj4 = map.get("extra_client_cache_data");
                                if (obj4 instanceof Map) {
                                    String str = (String) obj2;
                                    Map map2 = (Map) obj3;
                                    ArrayList A0w = C18220wO.A0w(map2);
                                    Iterator A0z = AnonymousClass0wJ.A0z(map2);
                                    while (A0z.hasNext()) {
                                        Map.Entry A0o = C18180wK.A0o(A0z);
                                        Object key = A0o.getKey();
                                        Object value = A0o.getValue();
                                        if (!(key instanceof Long)) {
                                            illegalStateException = C18180wK.A0a("Check failed.");
                                        } else if (value instanceof Map) {
                                            String valueOf = String.valueOf(C18190wL.A08(key));
                                            Map map3 = (Map) value;
                                            ArrayList A0w2 = C18220wO.A0w(map3);
                                            Iterator A0z2 = AnonymousClass0wJ.A0z(map3);
                                            while (A0z2.hasNext()) {
                                                Map.Entry A0o2 = C18180wK.A0o(A0z2);
                                                Object value2 = A0o2.getValue();
                                                C04220Ms.A0C(value2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                                                Map map4 = (Map) value2;
                                                String valueOf2 = String.valueOf(A0o2.getKey());
                                                Object obj5 = map4.get("identity_type");
                                                C04220Ms.A0C(obj5, "null cannot be cast to non-null type kotlin.String");
                                                Object obj6 = map4.get("obfuscated_identity_id");
                                                C04220Ms.A0C(obj6, "null cannot be cast to non-null type kotlin.String");
                                                A0w2.add(new AnonymousClass3VW(valueOf2, (String) obj5, (String) obj6));
                                            }
                                            A0w.add(new AnonymousClass3VT(valueOf, A0w2));
                                        } else {
                                            illegalStateException = C18180wK.A0a("Check failed.");
                                        }
                                    }
                                    HashMap A0y = AnonymousClass0wJ.A0y();
                                    Iterator A0z3 = AnonymousClass0wJ.A0z((Map) obj4);
                                    while (A0z3.hasNext()) {
                                        Map.Entry A0o3 = C18180wK.A0o(A0z3);
                                        Object key2 = A0o3.getKey();
                                        C04220Ms.A0C(key2, "null cannot be cast to non-null type kotlin.String");
                                        Object value3 = A0o3.getValue();
                                        C04220Ms.A0C(value3, "null cannot be cast to non-null type kotlin.String");
                                        A0y.put(key2, value3);
                                    }
                                    r1 = new AnonymousClass3VZ(str, A0y, A0w, 8);
                                } else {
                                    illegalStateException = C18180wK.A0a("Check failed.");
                                }
                            } else {
                                illegalStateException = C18180wK.A0a("Check failed.");
                            }
                        } else {
                            illegalStateException = C18180wK.A0a("Check failed.");
                        }
                    }
                    A0v.put(obj, r1);
                }
                throw illegalStateException;
            }
            C04220Ms.A0B(A02, 0);
            ((AnonymousClass49R) A02.A01(AnonymousClass49R.class, new KtLambdaShape75S0100000_I2_55(A02, 38))).A04(A00, "ig_android_fx_bloks", A0v);
        } catch (IllegalStateException e) {
            C30967GcS.A03("bk.fx.action.UpdateClientServiceCache", e);
        }
        C63913ic.A0K(r4, A0R, C63893iY.A01);
        return null;
    }
}
