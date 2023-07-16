package X;

import com.facebook.proxygen.TraceFieldType;
import com.fbpay.logging.LoggingContext;
import java.util.List;
import java.util.Map;

/* renamed from: X.7kb  reason: invalid class name and case insensitive filesystem */
public final class C128927kb implements C143688h9 {
    public final C021209x A00;

    public static final AnonymousClass5DJ A00(LoggingContext loggingContext, Map map) {
        AnonymousClass5DJ r2 = new AnonymousClass5DJ();
        C86104wH.A1K(r2, loggingContext);
        String A0r = C18220wO.A0r("PARTNER_ID", map);
        String str = "";
        if (A0r == null) {
            A0r = str;
        }
        r2.A0A("partner_id", A0r);
        String A0r2 = C18220wO.A0r("PARTNER_MERCHANT_ID", map);
        if (A0r2 == null) {
            A0r2 = str;
        }
        r2.A0A("partner_merchant_id", A0r2);
        String A0r3 = C18220wO.A0r("MERCHANT_REQUEST_ID", map);
        if (A0r3 != null) {
            str = A0r3;
        }
        r2.A0A("merchant_request_id", str);
        C89135Cb A002 = AnonymousClass7Hr.A00(loggingContext);
        if (A002 != null) {
            r2.A06(A002, "logging_policy");
            r2.A07("cache_available", (Boolean) map.get("CACHE_AVAILABLE"));
            C86124wJ.A1K(r2, "ecp_checkout");
            Object obj = map.get("TARGET_NAME");
            if (obj != null && (obj instanceof String)) {
                C86134wK.A1G(r2, (String) obj);
            }
            Object obj2 = map.get("CACHE_AVAILABLE");
            if (obj2 != null && (obj2 instanceof Boolean)) {
                r2.A07("cache_available", (Boolean) obj2);
            }
            Object obj3 = map.get("AD_ID");
            if (obj3 != null && (obj3 instanceof String)) {
                r2.A09("ad_id", AnonymousClass4n2.A02(C18210wN.A0f(obj3)));
            }
            Object obj4 = map.get("INITIATOR");
            if (obj4 != null && (obj4 instanceof String)) {
                r2.A0A("initiator", (String) obj4);
            }
            return r2;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final AnonymousClass5DM A01(LoggingContext loggingContext, Map map) {
        String str;
        AnonymousClass5DM r2 = new AnonymousClass5DM();
        String A0r = C18220wO.A0r("PARTNER_ID", map);
        String str2 = "";
        if (A0r == null) {
            A0r = str2;
        }
        r2.A0A("partner_id", A0r);
        String A0r2 = C18220wO.A0r("PARTNER_MERCHANT_ID", map);
        if (A0r2 == null) {
            A0r2 = str2;
        }
        r2.A0A("partner_merchant_id", A0r2);
        String A0r3 = C18220wO.A0r("MERCHANT_REQUEST_ID", map);
        if (A0r3 == null) {
            A0r3 = str2;
        }
        r2.A0A("merchant_request_id", A0r3);
        C89135Cb A002 = AnonymousClass7Hr.A00(loggingContext);
        if (A002 != null) {
            r2.A06(A002, "logging_policy");
            C86124wJ.A1K(r2, "ecp_checkout");
            String A0r4 = C18220wO.A0r("ERROR_CODE", map);
            if (A0r4 == null) {
                A0r4 = str2;
            }
            r2.A0A(TraceFieldType.ErrorCode, A0r4);
            r2.A07("retryable", Boolean.valueOf(C18210wN.A1T((Boolean) map.get("RETRYABLE"))));
            String A0r5 = C18220wO.A0r("TYPED_CONTAINER_ID", map);
            if (A0r5 != null) {
                str2 = A0r5;
            }
            r2.A0A("typed_container_id", str2);
            A04(r2, map);
            Object obj = map.get("CONTAINER_TYPE");
            if ((obj instanceof String) && (str = (String) obj) != null) {
                r2.A0A("container_type", str);
            }
            return r2;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final AnonymousClass5DN A02(LoggingContext loggingContext, Map map) {
        AnonymousClass5DN r2 = new AnonymousClass5DN();
        String A0r = C18220wO.A0r("PARTNER_ID", map);
        String str = "";
        if (A0r == null) {
            A0r = str;
        }
        r2.A0A("partner_id", A0r);
        String A0r2 = C18220wO.A0r("PARTNER_MERCHANT_ID", map);
        if (A0r2 == null) {
            A0r2 = str;
        }
        r2.A0A("partner_merchant_id", A0r2);
        String A0r3 = C18220wO.A0r("MERCHANT_REQUEST_ID", map);
        if (A0r3 == null) {
            A0r3 = str;
        }
        r2.A0A("merchant_request_id", A0r3);
        C89135Cb A002 = AnonymousClass7Hr.A00(loggingContext);
        if (A002 != null) {
            r2.A06(A002, "logging_policy");
            C86124wJ.A1K(r2, "ecp_checkout");
            Object obj = map.get("PROACTIVE_CHECKOUT");
            C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.Boolean");
            r2.A07("proactive_checkout", (Boolean) obj);
            String A0r4 = C18220wO.A0r("ERROR_CODE", map);
            if (A0r4 != null) {
                str = A0r4;
            }
            r2.A0A(TraceFieldType.ErrorCode, str);
            List list = (List) map.get("PAYMENT_OPTIONS");
            if (list == null) {
                list = AnonymousClass0ZV.A00;
            }
            r2.A0B(AnonymousClass000.A00(1319), list);
            A04(r2, map);
            return r2;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static Long A03(AnonymousClass0A3 r4, LoggingContext loggingContext, Map map) {
        r4.A0T(AnonymousClass7C6.A01(0, 10, 62), loggingContext.A02);
        r4.A0O(AnonymousClass6BP.A02, "product_type");
        r4.A0O(AnonymousClass28E.ANDROID, "platform");
        Object obj = map.get("REQUEST_TIMESTAMP");
        C04220Ms.A0C(obj, C18170wI.A00(29));
        return (Long) obj;
    }

    public static void A04(AnonymousClass0V3 r2, Map map) {
        Long l;
        Object obj = map.get("PRODUCT_ID");
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            r2.A09("product_id", l);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x029a, code lost:
        r5.A0A("merchant_request_id", r1);
        r1 = X.AnonymousClass7Hr.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a3, code lost:
        if (r1 == null) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02a5, code lost:
        r5.A06(r1, "logging_policy");
        X.C86124wJ.A1K(r5, "ecp_checkout");
        r1 = (java.util.List) r8.get("CHANGED_FIELDS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02b7, code lost:
        if (r1 != null) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02b9, code lost:
        r1 = X.AnonymousClass0ZV.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02bb, code lost:
        r5.A0B("changed_fields", r1);
        r0 = X.C18220wO.A0r("ERROR_CODE", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02c6, code lost:
        if (r0 == null) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02c8, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02c9, code lost:
        r5.A0A(com.facebook.proxygen.TraceFieldType.ErrorCode, r4);
        A04(r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02fb, code lost:
        X.C86114wI.A1C(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0311, code lost:
        r3 = X.C18180wK.A0I(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0319, code lost:
        if (X.AnonymousClass0wJ.A1U(r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x031b, code lost:
        r3.A0T(X.AnonymousClass7C6.A00(), r2.A02);
        X.C86104wH.A1G(X.AnonymousClass6BP.A02, r3);
        r4 = A02(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x032d, code lost:
        X.C86114wI.A1C(r3, r4);
        r0 = r8.get("EVENT_EXTRA");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0336, code lost:
        if (r0 == null) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0338, code lost:
        r0 = (java.util.Map) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x033a, code lost:
        r3.A1g(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x033d, code lost:
        r3.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0341, code lost:
        r0 = X.AnonymousClass4WJ.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x034a, code lost:
        throw X.AnonymousClass0wJ.A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x034f, code lost:
        throw X.AnonymousClass0wJ.A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b0, code lost:
        r3.A0S("actual_event_time", r1);
        r5 = A01(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010b, code lost:
        r3 = X.C18180wK.A0I(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0113, code lost:
        if (X.AnonymousClass0wJ.A1U(r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0115, code lost:
        r3.A0T(X.AnonymousClass7C6.A00(), r2.A02);
        X.C86104wH.A1G(X.AnonymousClass6BP.A02, r3);
        r4 = new X.AnonymousClass5DK();
        X.C86134wK.A1G(r4, "login_with_app");
        X.C86124wJ.A1K(r4, "login_with_app");
        r1 = X.AnonymousClass7Hr.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0134, code lost:
        if (r1 == null) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0136, code lost:
        r4.A06(r1, "logging_policy");
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0143, code lost:
        if (r8.containsKey("ERROR_CODE") == false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0145, code lost:
        r1 = X.C18220wO.A0r("ERROR_CODE", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0149, code lost:
        if (r1 != null) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014b, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x014c, code lost:
        r4.A0A(com.facebook.proxygen.TraceFieldType.ErrorCode, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0157, code lost:
        if (r8.containsKey("REDIRECTION_TYPE") == false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0159, code lost:
        r0 = X.C18220wO.A0r("REDIRECTION_TYPE", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015d, code lost:
        if (r0 == null) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015f, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0160, code lost:
        r4.A0A("redirection_type", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0165, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x016c, code lost:
        if (r8.containsKey("SESSION_TOKEN_AVAILABLE") == false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016e, code lost:
        r4.A07("session_token_available", java.lang.Boolean.valueOf(X.C18210wN.A1T((java.lang.Boolean) r8.get("SESSION_TOKEN_AVAILABLE"))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0187, code lost:
        if (r8.containsKey("USE_TEMP_TOKEN") == false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0189, code lost:
        r0 = (java.lang.Boolean) r8.get("USE_TEMP_TOKEN");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018f, code lost:
        if (r0 == null) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0191, code lost:
        r2 = r0.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0195, code lost:
        r4.A07("use_temp_token", java.lang.Boolean.valueOf(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019e, code lost:
        A04(r4, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e0, code lost:
        r3 = X.C18180wK.A0I(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e8, code lost:
        if (X.AnonymousClass0wJ.A1U(r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ea, code lost:
        r3.A0T(X.AnonymousClass7C6.A00(), r2.A02);
        X.C86104wH.A1G(X.AnonymousClass6BP.A02, r3);
        r4 = A00(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x025b, code lost:
        r3 = X.C18180wK.A0I(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0263, code lost:
        if (X.AnonymousClass0wJ.A1U(r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0265, code lost:
        r1 = A03(r3, r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0269, code lost:
        r3.A0S("actual_event_time", r1);
        r5 = new X.AnonymousClass5DL();
        r1 = X.C18220wO.A0r("PARTNER_ID", r8);
        r4 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x027b, code lost:
        if (r1 != null) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x027d, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x027e, code lost:
        r5.A0A("partner_id", r1);
        r1 = X.C18220wO.A0r("PARTNER_MERCHANT_ID", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0289, code lost:
        if (r1 != null) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x028b, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x028c, code lost:
        r5.A0A("partner_merchant_id", r1);
        r1 = X.C18220wO.A0r("MERCHANT_REQUEST_ID", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0297, code lost:
        if (r1 != null) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0299, code lost:
        r1 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bb8(java.lang.String r7, java.util.Map r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x0355
            java.lang.String r0 = "logging_context"
            java.lang.Object r2 = r8.get(r0)
            if (r2 == 0) goto L_0x0350
            com.fbpay.logging.LoggingContext r2 = (com.fbpay.logging.LoggingContext) r2
            if (r7 == 0) goto L_0x0015
            int r0 = r7.hashCode()
            switch(r0) {
                case -1732568701: goto L_0x02ff;
                case -1732466827: goto L_0x02d2;
                case -1621070634: goto L_0x0249;
                case -1620968760: goto L_0x0211;
                case -1483492565: goto L_0x01fe;
                case -308897551: goto L_0x01ce;
                case -308795677: goto L_0x01a3;
                case -106044262: goto L_0x00f9;
                case -105942388: goto L_0x00e6;
                case 437491958: goto L_0x00bb;
                case 437593832: goto L_0x0079;
                case 967462192: goto L_0x0065;
                case 1150809319: goto L_0x0051;
                case 1182280542: goto L_0x003d;
                case 1611633419: goto L_0x001c;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.String r0 = "Event name not supported in Offsite Logger"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x001c:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTHANDLED_SUCCESS"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.09x r1 = r6.A00
            java.lang.String r0 = "client_load_offsitepaymenthandled_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 331(0x14b, float:4.64E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0340
            java.lang.Long r1 = A03(r3, r2, r8)
            goto L_0x00b0
        L_0x003d:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTREQUEST_SUCCESS"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.09x r1 = r6.A00
            java.lang.String r0 = "client_load_offsitepaymentrequest_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 334(0x14e, float:4.68E-43)
            goto L_0x0311
        L_0x0051:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITELOGINWITHAPP_SUCCESS"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.09x r1 = r6.A00
            java.lang.String r0 = "client_load_offsiteloginwithapp_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 325(0x145, float:4.55E-43)
            goto L_0x010b
        L_0x0065:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEAVAILABILITY_SUCCESS"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.09x r1 = r6.A00
            java.lang.String r0 = "client_load_offsiteavailability_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 322(0x142, float:4.51E-43)
            goto L_0x01e0
        L_0x0079:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTHANDLED_INIT"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.09x r1 = r6.A00
            java.lang.String r0 = "client_load_offsitepaymenthandled_init"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 330(0x14a, float:4.62E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0340
            java.lang.String r1 = r2.A02
            java.lang.String r0 = X.AnonymousClass7C6.A00()
            r3.A0T(r0, r1)
            X.6BP r1 = X.AnonymousClass6BP.A02
            java.lang.String r0 = "product_type"
            r3.A0O(r1, r0)
            X.28E r1 = X.AnonymousClass28E.ANDROID
            java.lang.String r0 = "platform"
            r3.A0O(r1, r0)
            java.lang.Long r1 = X.C18200wM.A0c()
        L_0x00b0:
            java.lang.String r0 = "actual_event_time"
            r3.A0S(r0, r1)
            X.5DM r5 = A01(r2, r8)
            goto L_0x02fb
        L_0x00bb:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTHANDLED_FAIL"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.09x r1 = r6.A00
            java.lang.String r0 = "client_load_offsitepaymenthandled_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 329(0x149, float:4.61E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0340
            java.lang.Long r1 = A03(r3, r2, r8)
            java.lang.String r0 = "actual_event_time"
            r3.A0S(r0, r1)
            X.5DM r4 = A01(r2, r8)
            goto L_0x032d
        L_0x00e6:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITELOGINWITHAPP_INIT"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.09x r1 = r6.A00
            java.lang.String r0 = "client_load_offsiteloginwithapp_init"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 324(0x144, float:4.54E-43)
            goto L_0x010b
        L_0x00f9:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITELOGINWITHAPP_FAIL"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.09x r1 = r6.A00
            java.lang.String r0 = "client_load_offsiteloginwithapp_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 323(0x143, float:4.53E-43)
        L_0x010b:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0340
            java.lang.String r1 = r2.A02
            java.lang.String r0 = X.AnonymousClass7C6.A00()
            r3.A0T(r0, r1)
            X.6BP r0 = X.AnonymousClass6BP.A02
            X.C86104wH.A1G(r0, r3)
            X.5DK r4 = new X.5DK
            r4.<init>()
            java.lang.String r0 = "login_with_app"
            X.C86134wK.A1G(r4, r0)
            X.C86124wJ.A1K(r4, r0)
            X.5Cb r1 = X.AnonymousClass7Hr.A00(r2)
            if (r1 == 0) goto L_0x0346
            java.lang.String r0 = "logging_policy"
            r4.A06(r1, r0)
            java.lang.String r1 = "ERROR_CODE"
            boolean r0 = r8.containsKey(r1)
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0151
            java.lang.String r1 = X.C18220wO.A0r(r1, r8)
            if (r1 != 0) goto L_0x014c
            r1 = r2
        L_0x014c:
            java.lang.String r0 = "error_code"
            r4.A0A(r0, r1)
        L_0x0151:
            java.lang.String r1 = "REDIRECTION_TYPE"
            boolean r0 = r8.containsKey(r1)
            if (r0 == 0) goto L_0x0165
            java.lang.String r0 = X.C18220wO.A0r(r1, r8)
            if (r0 == 0) goto L_0x0160
            r2 = r0
        L_0x0160:
            java.lang.String r0 = "redirection_type"
            r4.A0A(r0, r2)
        L_0x0165:
            java.lang.String r1 = "SESSION_TOKEN_AVAILABLE"
            boolean r0 = r8.containsKey(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0181
            java.lang.Object r0 = r8.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = X.C18210wN.A1T(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "session_token_available"
            r4.A07(r0, r1)
        L_0x0181:
            java.lang.String r1 = "USE_TEMP_TOKEN"
            boolean r0 = r8.containsKey(r1)
            if (r0 == 0) goto L_0x019e
            java.lang.Object r0 = r8.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0195
            boolean r2 = r0.booleanValue()
        L_0x0195:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "use_temp_token"
            r4.A07(r0, r1)
        L_0x019e:
            A04(r4, r8)
            goto L_0x032d
        L_0x01a3:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEAVAILABILITY_INIT"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.09x r1 = r6.A00
            java.lang.String r0 = "client_load_offsiteavailability_init"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 321(0x141, float:4.5E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0340
            java.lang.Long r1 = A03(r3, r2, r8)
            java.lang.String r0 = "actual_event_time"
            r3.A0S(r0, r1)
            X.5DJ r5 = A00(r2, r8)
            goto L_0x02fb
        L_0x01ce:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEAVAILABILITY_FAIL"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.09x r1 = r6.A00
            java.lang.String r0 = "client_load_offsiteavailability_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 320(0x140, float:4.48E-43)
        L_0x01e0:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0340
            java.lang.String r1 = r2.A02
            java.lang.String r0 = X.AnonymousClass7C6.A00()
            r3.A0T(r0, r1)
            X.6BP r0 = X.AnonymousClass6BP.A02
            X.C86104wH.A1G(r0, r3)
            X.5DJ r4 = A00(r2, r8)
            goto L_0x032d
        L_0x01fe:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_SUCCESS"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.09x r1 = r6.A00
            java.lang.String r0 = "client_load_offsitepaymentdetailschanged_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 328(0x148, float:4.6E-43)
            goto L_0x025b
        L_0x0211:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_INIT"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.09x r1 = r6.A00
            java.lang.String r0 = "client_load_offsitepaymentdetailschanged_init"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 327(0x147, float:4.58E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0340
            java.lang.String r1 = r2.A02
            java.lang.String r0 = X.AnonymousClass7C6.A00()
            r3.A0T(r0, r1)
            X.6BP r1 = X.AnonymousClass6BP.A02
            java.lang.String r0 = "product_type"
            r3.A0O(r1, r0)
            X.28E r1 = X.AnonymousClass28E.ANDROID
            java.lang.String r0 = "platform"
            r3.A0O(r1, r0)
            java.lang.Long r1 = X.C18200wM.A0c()
            goto L_0x0269
        L_0x0249:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_FAIL"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.09x r1 = r6.A00
            java.lang.String r0 = "client_load_offsitepaymentdetailschanged_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 326(0x146, float:4.57E-43)
        L_0x025b:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0340
            java.lang.Long r1 = A03(r3, r2, r8)
        L_0x0269:
            java.lang.String r0 = "actual_event_time"
            r3.A0S(r0, r1)
            X.5DL r5 = new X.5DL
            r5.<init>()
            java.lang.String r0 = "PARTNER_ID"
            java.lang.String r1 = X.C18220wO.A0r(r0, r8)
            java.lang.String r4 = ""
            if (r1 != 0) goto L_0x027e
            r1 = r4
        L_0x027e:
            java.lang.String r0 = "partner_id"
            r5.A0A(r0, r1)
            java.lang.String r0 = "PARTNER_MERCHANT_ID"
            java.lang.String r1 = X.C18220wO.A0r(r0, r8)
            if (r1 != 0) goto L_0x028c
            r1 = r4
        L_0x028c:
            java.lang.String r0 = "partner_merchant_id"
            r5.A0A(r0, r1)
            java.lang.String r0 = "MERCHANT_REQUEST_ID"
            java.lang.String r1 = X.C18220wO.A0r(r0, r8)
            if (r1 != 0) goto L_0x029a
            r1 = r4
        L_0x029a:
            java.lang.String r0 = "merchant_request_id"
            r5.A0A(r0, r1)
            X.5Cb r1 = X.AnonymousClass7Hr.A00(r2)
            if (r1 == 0) goto L_0x034b
            java.lang.String r0 = "logging_policy"
            r5.A06(r1, r0)
            java.lang.String r0 = "ecp_checkout"
            X.C86124wJ.A1K(r5, r0)
            java.lang.String r0 = "CHANGED_FIELDS"
            java.lang.Object r1 = r8.get(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x02bb
            X.0ZV r1 = X.AnonymousClass0ZV.A00
        L_0x02bb:
            java.lang.String r0 = "changed_fields"
            r5.A0B(r0, r1)
            java.lang.String r0 = "ERROR_CODE"
            java.lang.String r0 = X.C18220wO.A0r(r0, r8)
            if (r0 == 0) goto L_0x02c9
            r4 = r0
        L_0x02c9:
            java.lang.String r0 = "error_code"
            r5.A0A(r0, r4)
            A04(r5, r8)
            goto L_0x02fb
        L_0x02d2:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTREQUEST_INIT"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.09x r1 = r6.A00
            java.lang.String r0 = "client_load_offsitepaymentrequest_init"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 333(0x14d, float:4.67E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0340
            java.lang.Long r1 = A03(r3, r2, r8)
            java.lang.String r0 = "actual_event_time"
            r3.A0S(r0, r1)
            X.5DN r5 = A02(r2, r8)
        L_0x02fb:
            X.C86114wI.A1C(r3, r5)
            goto L_0x033d
        L_0x02ff:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTREQUEST_FAIL"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.09x r1 = r6.A00
            java.lang.String r0 = "client_load_offsitepaymentrequest_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 332(0x14c, float:4.65E-43)
        L_0x0311:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0340
            java.lang.String r1 = r2.A02
            java.lang.String r0 = X.AnonymousClass7C6.A00()
            r3.A0T(r0, r1)
            X.6BP r0 = X.AnonymousClass6BP.A02
            X.C86104wH.A1G(r0, r3)
            X.5DN r4 = A02(r2, r8)
        L_0x032d:
            X.C86114wI.A1C(r3, r4)
            java.lang.String r0 = "EVENT_EXTRA"
            java.lang.Object r0 = r8.get(r0)
            if (r0 == 0) goto L_0x0341
            java.util.Map r0 = (java.util.Map) r0
        L_0x033a:
            r3.A1g(r0)
        L_0x033d:
            r3.Bb4()
        L_0x0340:
            return
        L_0x0341:
            java.util.Map r0 = X.AnonymousClass4WJ.A0A()
            goto L_0x033a
        L_0x0346:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x034b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0350:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0355:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128927kb.Bb8(java.lang.String, java.util.Map):void");
    }

    public C128927kb(C021209x r1) {
        this.A00 = r1;
    }
}
