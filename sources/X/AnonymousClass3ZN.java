package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3ZN  reason: invalid class name */
public abstract class AnonymousClass3ZN {
    public String A00 = "2.0";

    public final void A08(Integer num, String str, List list) {
        QuickPerformanceLogger quickPerformanceLogger;
        int i = 0;
        while (true) {
            List list2 = list;
            if (i < list2.size()) {
                C320229w r4 = C320229w.WRITE_FAILURE;
                Integer num2 = AnonymousClass006.A01;
                String A0p = C18190wL.A0p(list2, i);
                if (A0p == null) {
                    A0p = "";
                }
                A01(r4, num2, str, (String) null, A0p, C54712zt.A00(num), (String) null, "AccessLibrarySharedStorageManager", (Map) null, this);
                if (!(A03() == null || (quickPerformanceLogger = A03().A00) == null)) {
                    quickPerformanceLogger.markerEnd(857814589, 3);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static void A01(C320229w r3, Integer num, String str, String str2, String str3, String str4, String str5, String str6, Map map, AnonymousClass3ZN r12) {
        USLEBaseShape0S0000000 A0I;
        String str7;
        if (!(r12 instanceof C81114nB) && (A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(((C81124nC) r12).A00), "fx_access_library"), 683)) != null && AnonymousClass0wJ.A1U(A0I)) {
            C18220wO.A1D(r3, A0I);
            Class<AnonymousClass27S> cls = AnonymousClass27S.class;
            if (num.intValue() != 0) {
                str7 = "DEVICE_ITEM";
            } else {
                str7 = "ACCOUNT_ITEM";
            }
            A0I.A0O((AnonymousClass27S) C54722zu.A00(cls, str7), "item_type");
            A0I.A0O((AnonymousClass27Q) C54722zu.A00(AnonymousClass27Q.class, str2), "target_credential_source");
            A0I.A0O((AnonymousClass27P) C54722zu.A00(AnonymousClass27P.class, str), "target_app_source");
            A0I.A0O((AnonymousClass27R) C54722zu.A00(AnonymousClass27R.class, str3), "target_device_item_source");
            A0I.A0T(TraceFieldType.FailureReason, str4);
            A0I.A0T("event_session_id", str5);
            A0I.A0V("debug_test_data", map);
            A0I.A0T("version_id", r12.A00);
            A0I.A0T("log_location", str6);
            A0I.Bb4();
        }
    }

    public final C58153Eh A03() {
        if (this instanceof C81114nB) {
            return null;
        }
        return new C58153Eh(AnonymousClass01V.A0p);
    }

    public final void A04(Integer num, String str, String str2, String str3) {
        A01(C320229w.ACL_CHECK_FAILURE, AnonymousClass006.A00, str, str2, (String) null, C54712zt.A00(num), (String) null, str3, (Map) null, this);
    }

    public final void A05(Integer num, String str, String str2, String str3, Map map) {
        QuickPerformanceLogger quickPerformanceLogger;
        A01(C320229w.FETCH_FAILURE, AnonymousClass006.A00, str, str2, (String) null, C54712zt.A00(num), (String) null, str3, map, this);
        if (A03() != null && (quickPerformanceLogger = A03().A00) != null) {
            quickPerformanceLogger.markerEnd(857814189, 3);
        }
    }

    public final void A09(Integer num, String str, List list, List list2, Map map) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0t = C18220wO.A0t(it);
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    Map map2 = map;
                    A01(C320229w.FETCH_FAILURE, AnonymousClass006.A00, A0t, C18220wO.A0t(it2), (String) null, C54712zt.A00(num), C18210wN.A0g("waterfall_id", map2), str, map2, this);
                }
            }
        }
    }

    public final void A0D(String str, String str2, String str3, Map map) {
        A01(C320229w.FETCH_START, AnonymousClass006.A00, str, str2, (String) null, (String) null, (String) null, str3, map, this);
        if (A03() != null) {
            A03().A00(857814189, str, str2, str3);
        }
    }

    public final void A0E(String str, String str2, String str3, Map map) {
        QuickPerformanceLogger quickPerformanceLogger;
        A01(C320229w.FETCH_SUCCESS, AnonymousClass006.A00, str, str2, (String) null, (String) null, (String) null, str3, map, this);
        if (A03() != null && (quickPerformanceLogger = A03().A00) != null) {
            quickPerformanceLogger.markerEnd(857814189, 2);
        }
    }

    public static Map A00(String str, String str2, AnonymousClass3ZN r2) {
        return r2.A02(str, str2);
    }

    public final Map A02(String... strArr) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        int length = strArr.length;
        if (length % 2 != 1) {
            for (int i = 0; i < length; i += 2) {
                A0y.put(strArr[i], strArr[i + 1]);
            }
        }
        return A0y;
    }

    public final void A06(Integer num, String str, String str2, List list, Map map) {
        QuickPerformanceLogger quickPerformanceLogger;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = str;
                A01(C320229w.WRITE_FAILURE, AnonymousClass006.A00, str3, C18220wO.A0t(it), (String) null, C54712zt.A00(num), (String) null, str2, map, this);
                if (!(A03() == null || (quickPerformanceLogger = A03().A00) == null)) {
                    quickPerformanceLogger.markerEnd(857814589, 3);
                }
            }
        }
    }

    public final void A07(Integer num, String str, String str2, List list, Map map) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Map map2 = map;
                String str3 = str;
                A01(C320229w.REPLICATED_STORAGE_INIT_APP_REMOVE_FAILURE, AnonymousClass006.A00, str3, C18220wO.A0t(it), (String) null, C54712zt.A00(num), C18210wN.A0g("waterfall_id", map2), str2, map2, this);
            }
        }
    }

    public final void A0A(Integer num, String str, List list, List list2, Map map) {
        if (!list2.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0t = C18220wO.A0t(it);
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    Map map2 = map;
                    A01(C320229w.REPLICATED_STORAGE_TARGET_APP_FETCH_FAILURE, AnonymousClass006.A00, A0t, C18220wO.A0t(it2), (String) null, C54712zt.A00(num), C18210wN.A0g("waterfall_id", map2), str, map2, this);
                }
            }
        }
    }

    public final void A0B(Integer num, String str, List list, List list2, Map map) {
        if (!list2.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0t = C18220wO.A0t(it);
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    Map map2 = map;
                    A01(C320229w.REPLICATED_STORAGE_TARGET_APP_REMOVE_FAILURE, AnonymousClass006.A00, A0t, C18220wO.A0t(it2), (String) null, C54712zt.A00(num), C18210wN.A0g("waterfall_id", map2), str, map2, this);
                }
            }
        }
    }

    public final void A0C(Integer num, String str, List list, List list2, Map map) {
        if (!list2.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0t = C18220wO.A0t(it);
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    Map map2 = map;
                    A01(C320229w.REPLICATED_STORAGE_TARGET_APP_SAVE_FAILURE, AnonymousClass006.A00, A0t, C18220wO.A0t(it2), (String) null, C54712zt.A00(num), C18210wN.A0g("waterfall_id", map2), str, map2, this);
                }
            }
        }
    }

    public final void A0F(String str, String str2, List list, Map map) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = str;
                A01(C320229w.REPLICATED_STORAGE_INIT_APP_REMOVE_SUCCESS, AnonymousClass006.A00, str3, C18220wO.A0t(it), (String) null, (String) null, C18210wN.A0g("waterfall_id", map), str2, map, this);
            }
        }
    }
}
