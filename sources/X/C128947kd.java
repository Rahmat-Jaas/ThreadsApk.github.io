package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7kd  reason: invalid class name and case insensitive filesystem */
public final class C128947kd implements C143688h9 {
    public static final Set A03;
    public final C021209x A00;
    public final Map A01 = Collections.synchronizedMap(AnonymousClass0wJ.A0y());
    public final C03700Kj A02 = AnonymousClass0IY.A00;

    public static String A00(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, Object obj, String str) {
        uSLEBaseShape0S0000000.A0T(I17.A00(62), "payflows");
        uSLEBaseShape0S0000000.A0T("event_type", DexOptimization.OPT_KEY_CLIENT);
        if (str.startsWith("payflows_")) {
            str = str.substring(9);
        }
        uSLEBaseShape0S0000000.A0T("event_name", str);
        uSLEBaseShape0S0000000.A0T(OptSvcAnalyticsStore.LOGGING_KEY_CLIENT_TIME, String.valueOf(System.currentTimeMillis()));
        uSLEBaseShape0S0000000.A00.A6J("logging_service_id", Integer.valueOf(obj.hashCode()));
        return AnonymousClass7C5.A00(21, 10, 59);
    }

    public static void A01(AnonymousClass0A3 r2, String str, String str2, Map map) {
        r2.A0T("flow_name", str);
        r2.A0T("context_id", str2);
        r2.A0T("flow_step", (String) map.get("flow_step"));
    }

    public static void A03(AnonymousClass0A3 r2, Map map) {
        Boolean bool = (Boolean) map.get("is_free");
        if (bool != null) {
            r2.A0Q("is_free", bool);
        }
    }

    public static void A04(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, String str, String str2, Map map) {
        uSLEBaseShape0S0000000.A0T("external_session_id", C122037Js.A02(map));
        uSLEBaseShape0S0000000.A0T("flow_name", str);
        uSLEBaseShape0S0000000.A0T("context_id", str2);
        uSLEBaseShape0S0000000.A0T("flow_step", (String) map.get("flow_step"));
        uSLEBaseShape0S0000000.A0T("source", C122037Js.A04(map));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0368, code lost:
        r2.A0T("paymod_extra_data", X.C18210wN.A0g("paymod_extra_data", r7));
        A02(r2, "product", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03a1, code lost:
        A02(r2, "other_profile_id", r7);
        A03(r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03a7, code lost:
        A02(r2, "order_id", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03aa, code lost:
        r2.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008d, code lost:
        throw X.C86134wK.A0s("Event name not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0203, code lost:
        r2 = X.C18180wK.A0I(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x020b, code lost:
        if (X.AnonymousClass0wJ.A1U(r2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x020d, code lost:
        r2.A0T(A00(r2, r12, r11), r10);
        r10 = X.C122037Js.A02(r7);
        r0 = "external_session_id";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02c9, code lost:
        r2.A0T("paymod_extra_data", X.C18210wN.A0g("paymod_extra_data", r7));
        A02(r2, "product", r7);
        A02(r2, "other_profile_id", r7);
        A03(r2, r7);
        A02(r2, "order_id", r7);
        A02(r2, com.facebook.proxygen.TraceFieldType.RequestID, r7);
        A02(r2, r14, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0319, code lost:
        r2 = X.C18180wK.A0I(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0321, code lost:
        if (X.AnonymousClass0wJ.A1U(r2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0323, code lost:
        r0 = A00(r2, r12, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0327, code lost:
        r2.A0T(r0, r10);
        A01(r2, r1, r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x032d, code lost:
        r2.A0T("paymod_extra_data", X.C18210wN.A0g("paymod_extra_data", r7));
        A02(r2, "product", r7);
        A02(r2, "other_profile_id", r7);
        A03(r2, r7);
        A02(r2, "order_id", r7);
        A02(r2, com.facebook.proxygen.TraceFieldType.RequestID, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bb8(java.lang.String r19, java.util.Map r20) {
        /*
            r18 = this;
            r11 = r19
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            r7 = r20
            if (r20 == 0) goto L_0x03bd
            java.lang.String r10 = X.C122037Js.A03(r7)
            java.lang.String r1 = "logger_data"
            boolean r0 = r7.containsKey(r1)
            if (r0 == 0) goto L_0x03ae
            java.lang.Object r0 = X.C86104wH.A0h(r1, r7)
            com.fbpay.logging.FBPayLoggerData r0 = (com.fbpay.logging.FBPayLoggerData) r0
            java.lang.String r1 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x03ae
        L_0x0024:
            X.C04220Ms.A06(r10)
            X.C04220Ms.A06(r1)
            r12 = r18
            java.util.Map r3 = r12.A01
            java.lang.Object r2 = r3.get(r10)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L_0x0044
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            java.util.Map r2 = java.util.Collections.synchronizedMap(r0)
            X.C04220Ms.A05(r3)
            r3.put(r10, r2)
        L_0x0044:
            X.C04220Ms.A0A(r2)
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L_0x0058
            java.util.UUID r0 = X.C03480Iw.A00()
            java.lang.String r0 = X.C18190wL.A0n(r0)
            r2.put(r1, r0)
        L_0x0058:
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x03b8
            java.lang.String r9 = X.C18220wO.A0r(r1, r2)
            int r2 = r11.hashCode()
            r0 = 1283(0x503, float:1.798E-42)
            java.lang.String r17 = X.C18170wI.A00(r0)
            java.lang.String r15 = "payment_method_type"
            r0 = 65
            java.lang.String r14 = X.C28174Ezk.A00(r0)
            java.lang.String r8 = "request_id"
            java.lang.String r13 = "is_free"
            java.lang.String r6 = "order_id"
            java.lang.String r5 = "other_profile_id"
            java.lang.String r16 = "client"
            java.lang.String r4 = "product"
            java.lang.String r3 = "paymod_extra_data"
            java.lang.String r0 = "flow_step"
            switch(r2) {
                case -2069540782: goto L_0x008e;
                case -1750659727: goto L_0x00a0;
                case -1707157727: goto L_0x00b2;
                case -1153899393: goto L_0x0103;
                case -1036136787: goto L_0x0153;
                case -248724288: goto L_0x0189;
                case -248622414: goto L_0x01f3;
                case -206583570: goto L_0x021c;
                case -110738306: goto L_0x0265;
                case 877038630: goto L_0x0277;
                case 903267432: goto L_0x029c;
                case 1408383900: goto L_0x02e4;
                case 1427019923: goto L_0x0309;
                case 1632514231: goto L_0x0344;
                case 1831776224: goto L_0x0373;
                default: goto L_0x0087;
            }
        L_0x0087:
            java.lang.String r0 = "Event name not supported"
            java.lang.UnsupportedOperationException r0 = X.C86134wK.A0s(r0)
            throw r0
        L_0x008e:
            java.lang.String r2 = "payflows_back_click"
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L_0x0087
            X.09x r0 = r12.A00
            X.0A2 r2 = X.C86104wH.A0K(r0, r2)
            r0 = 2473(0x9a9, float:3.465E-42)
            goto L_0x0203
        L_0x00a0:
            java.lang.String r2 = "payflows_field_focus"
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L_0x0087
            X.09x r0 = r12.A00
            X.0A2 r2 = X.C86104wH.A0K(r0, r2)
            r0 = 2480(0x9b0, float:3.475E-42)
            goto L_0x0203
        L_0x00b2:
            java.lang.String r2 = "payflows_success"
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L_0x0087
            X.09x r0 = r12.A00
            X.0A2 r2 = X.C86104wH.A0K(r0, r2)
            r0 = 2484(0x9b4, float:3.481E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x03ad
            java.lang.String r0 = A00(r2, r12, r11)
            r2.A0T(r0, r10)
            A04(r2, r1, r9, r7)
            java.lang.String r0 = X.C18210wN.A0g(r3, r7)
            r2.A0T(r3, r0)
            A02(r2, r4, r7)
            A02(r2, r5, r7)
            java.lang.Object r0 = r7.get(r13)
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = r0.toString()
            r2.A0T(r13, r0)
        L_0x00f0:
            A02(r2, r6, r7)
            A02(r2, r8, r7)
            A02(r2, r14, r7)
            A02(r2, r15, r7)
            r0 = r17
            A02(r2, r0, r7)
            goto L_0x03aa
        L_0x0103:
            java.lang.String r2 = "payflows_timeout"
            boolean r1 = r11.equals(r2)
            if (r1 == 0) goto L_0x0087
            X.09x r1 = r12.A00
            X.0A2 r2 = X.C86104wH.A0K(r1, r2)
            r1 = 2486(0x9b6, float:3.484E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r1)
            boolean r1 = X.AnonymousClass0wJ.A1U(r2)
            if (r1 == 0) goto L_0x03ad
            java.lang.String r1 = "payflows_"
            boolean r1 = r11.startsWith(r1)
            if (r1 == 0) goto L_0x012b
            r1 = 9
            java.lang.String r11 = r11.substring(r1)
        L_0x012b:
            java.lang.String r1 = "event_name"
            r2.A0T(r1, r11)
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = java.lang.String.valueOf(r8)
            java.lang.String r1 = "client_time"
            r2.A0T(r1, r5)
            X.AnonymousClass7C5.A01(r2, r10)
            java.lang.String r1 = X.C18210wN.A0g(r0, r7)
            r2.A0T(r0, r1)
            java.lang.String r0 = X.C18210wN.A0g(r3, r7)
            r2.A0T(r3, r0)
            A02(r2, r4, r7)
            goto L_0x03a7
        L_0x0153:
            java.lang.String r2 = "payflows_done_click"
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L_0x0087
            X.09x r0 = r12.A00
            X.0A2 r2 = X.C86104wH.A0K(r0, r2)
            r0 = 2478(0x9ae, float:3.472E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x03ad
            java.lang.String r0 = A00(r2, r12, r11)
            r2.A0T(r0, r10)
            A01(r2, r1, r9, r7)
            java.lang.String r0 = X.C18210wN.A0g(r3, r7)
            r2.A0T(r3, r0)
            A02(r2, r4, r7)
            A02(r2, r5, r7)
            A03(r2, r7)
            goto L_0x03aa
        L_0x0189:
            java.lang.String r2 = "payflows_fail"
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L_0x0087
            X.09x r0 = r12.A00
            X.0A2 r2 = X.C86104wH.A0K(r0, r2)
            r0 = 2479(0x9af, float:3.474E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            X.0A2 r13 = r2.A00
            boolean r0 = r13.isSampled()
            if (r0 == 0) goto L_0x03ad
            java.lang.String r0 = A00(r2, r12, r11)
            r2.A0T(r0, r10)
            A04(r2, r1, r9, r7)
            java.lang.String r0 = X.C18210wN.A0g(r3, r7)
            r2.A0T(r3, r0)
            A02(r2, r4, r7)
            A02(r2, r5, r7)
            A03(r2, r7)
            A02(r2, r6, r7)
            A02(r2, r8, r7)
            A02(r2, r14, r7)
            A02(r2, r15, r7)
            r0 = r17
            A02(r2, r0, r7)
            java.lang.String r1 = "error_code"
            java.lang.Object r0 = r7.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x01dd
            r13.A6J(r1, r0)
        L_0x01dd:
            java.lang.String r3 = "error_stacktrace"
            java.lang.String r1 = X.C18210wN.A0g(r3, r7)
            if (r1 == 0) goto L_0x01ee
            int r0 = r1.length()
            if (r0 == 0) goto L_0x01ee
            r2.A1J(r1)
        L_0x01ee:
            A02(r2, r3, r7)
            goto L_0x03aa
        L_0x01f3:
            java.lang.String r2 = "payflows_init"
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L_0x0087
            X.09x r0 = r12.A00
            X.0A2 r2 = X.C86104wH.A0K(r0, r2)
            r0 = 2481(0x9b1, float:3.477E-42)
        L_0x0203:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x03ad
            java.lang.String r0 = A00(r2, r12, r11)
            r2.A0T(r0, r10)
            java.lang.String r10 = X.C122037Js.A02(r7)
            java.lang.String r0 = "external_session_id"
            goto L_0x0327
        L_0x021c:
            java.lang.String r2 = "payflows_terms_click"
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L_0x0087
            X.09x r0 = r12.A00
            X.0A2 r2 = X.C86104wH.A0K(r0, r2)
            r0 = 2485(0x9b5, float:3.482E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x03ad
            java.lang.String r8 = "event_type"
            r0 = r16
            r2.A0T(r8, r0)
            java.lang.String r0 = "payflows_"
            boolean r0 = r11.startsWith(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 9
            java.lang.String r11 = r11.substring(r0)
        L_0x024b:
            java.lang.String r0 = "event_name"
            r2.A0T(r0, r11)
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r11)
            java.lang.String r0 = "client_time"
            r2.A0T(r0, r8)
            X.AnonymousClass7C5.A01(r2, r10)
            A01(r2, r1, r9, r7)
            goto L_0x0368
        L_0x0265:
            java.lang.String r2 = "payflows_redirect"
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L_0x0087
            X.09x r0 = r12.A00
            X.0A2 r2 = X.C86104wH.A0K(r0, r2)
            r0 = 2482(0x9b2, float:3.478E-42)
            goto L_0x0319
        L_0x0277:
            java.lang.String r2 = "payflows_click"
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L_0x0087
            X.09x r0 = r12.A00
            X.0A2 r2 = X.C86104wH.A0K(r0, r2)
            r0 = 2475(0x9ab, float:3.468E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x03ad
            java.lang.String r0 = A00(r2, r12, r11)
            r2.A0T(r0, r10)
            A04(r2, r1, r9, r7)
            goto L_0x02c9
        L_0x029c:
            java.lang.String r2 = "payflows_save_click"
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L_0x0087
            X.09x r0 = r12.A00
            X.0A2 r2 = X.C86104wH.A0K(r0, r2)
            r0 = 2483(0x9b3, float:3.48E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x03ad
            java.lang.String r0 = A00(r2, r12, r11)
            r2.A0T(r0, r10)
            java.lang.String r10 = X.C122037Js.A02(r7)
            java.lang.String r0 = "external_session_id"
            r2.A0T(r0, r10)
            A01(r2, r1, r9, r7)
        L_0x02c9:
            java.lang.String r0 = X.C18210wN.A0g(r3, r7)
            r2.A0T(r3, r0)
            A02(r2, r4, r7)
            A02(r2, r5, r7)
            A03(r2, r7)
            A02(r2, r6, r7)
            A02(r2, r8, r7)
            A02(r2, r14, r7)
            goto L_0x03aa
        L_0x02e4:
            java.lang.String r2 = "payflows_cancel"
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L_0x0087
            X.09x r0 = r12.A00
            X.0A2 r2 = X.C86104wH.A0K(r0, r2)
            r0 = 2474(0x9aa, float:3.467E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x03ad
            java.lang.String r0 = A00(r2, r12, r11)
            r2.A0T(r0, r10)
            A04(r2, r1, r9, r7)
            goto L_0x032d
        L_0x0309:
            java.lang.String r2 = "payflows_custom"
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L_0x0087
            X.09x r0 = r12.A00
            X.0A2 r2 = X.C86104wH.A0K(r0, r2)
            r0 = 2476(0x9ac, float:3.47E-42)
        L_0x0319:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x03ad
            java.lang.String r0 = A00(r2, r12, r11)
        L_0x0327:
            r2.A0T(r0, r10)
            A01(r2, r1, r9, r7)
        L_0x032d:
            java.lang.String r0 = X.C18210wN.A0g(r3, r7)
            r2.A0T(r3, r0)
            A02(r2, r4, r7)
            A02(r2, r5, r7)
            A03(r2, r7)
            A02(r2, r6, r7)
            A02(r2, r8, r7)
            goto L_0x03aa
        L_0x0344:
            java.lang.String r2 = "payflows_api_init"
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L_0x0087
            X.09x r0 = r12.A00
            X.0A2 r2 = X.C86104wH.A0K(r0, r2)
            r0 = 2472(0x9a8, float:3.464E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x03ad
            java.lang.String r0 = A00(r2, r12, r11)
            r2.A0T(r0, r10)
            A04(r2, r1, r9, r7)
        L_0x0368:
            java.lang.String r0 = X.C18210wN.A0g(r3, r7)
            r2.A0T(r3, r0)
            A02(r2, r4, r7)
            goto L_0x03a1
        L_0x0373:
            java.lang.String r2 = "payflows_display"
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L_0x0087
            X.09x r0 = r12.A00
            X.0A2 r2 = X.C86104wH.A0K(r0, r2)
            r0 = 2477(0x9ad, float:3.471E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x03ad
            java.lang.String r0 = A00(r2, r12, r11)
            r2.A0T(r0, r10)
            A04(r2, r1, r9, r7)
            java.lang.String r0 = X.C18210wN.A0g(r3, r7)
            r2.A0T(r3, r0)
            A02(r2, r4, r7)
        L_0x03a1:
            A02(r2, r5, r7)
            A03(r2, r7)
        L_0x03a7:
            A02(r2, r6, r7)
        L_0x03aa:
            r2.Bb4()
        L_0x03ad:
            return
        L_0x03ae:
            java.lang.String r0 = "flow_name"
            java.lang.Object r1 = X.C86104wH.A0h(r0, r7)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0024
        L_0x03b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x03bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128947kd.Bb8(java.lang.String, java.util.Map):void");
    }

    static {
        HashSet A0u = C18200wM.A0u();
        A03 = A0u;
        A0u.add("payflows_back_click");
        A0u.add("payflows_cancel");
        A0u.add("payflows_click");
        A0u.add("payflows_custom");
        A0u.add("payflows_done_click");
        A0u.add("payflows_fail");
        A0u.add("payflows_field_focus");
        A0u.add("payflows_init");
        A0u.add("payflows_display");
        A0u.add("payflows_api_init");
        A0u.add("payflows_redirect");
        A0u.add("payflows_save_click");
        A0u.add("payflows_success");
        A0u.add("payflows_terms_click");
        A0u.add("payflows_timeout");
    }

    public C128947kd(C021209x r2) {
        this.A00 = r2;
    }

    public static void A02(AnonymousClass0A3 r2, String str, Map map) {
        String str2 = (String) map.get(str);
        if (str2 != null && str2.length() != 0) {
            r2.A0T(str, str2);
        }
    }
}
