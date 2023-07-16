package X;

import android.text.TextUtils;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7kc  reason: invalid class name and case insensitive filesystem */
public final class C128937kc implements C143688h9 {
    public final C021209x A00;
    public final C143688h9 A01;

    public static AnonymousClass5Ck A00() {
        AnonymousClass5Ck r2 = new AnonymousClass5Ck();
        r2.A04(AnonymousClass6BC.PIN, "auth_factor_type");
        return r2;
    }

    public static AnonymousClass5Ck A01() {
        AnonymousClass5Ck r2 = new AnonymousClass5Ck();
        r2.A04(AnonymousClass6BC.CSC, "auth_factor_type");
        return r2;
    }

    public static AnonymousClass5Ck A02() {
        AnonymousClass5Ck r2 = new AnonymousClass5Ck();
        r2.A04(AnonymousClass6BC.PAYPAL_ACCESS_TOKEN, "auth_factor_type");
        return r2;
    }

    public static void A04(AnonymousClass0A2 r4, String str, String str2, int i) {
        USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = new USLEBaseShape0S0000000(r4, i);
        if (uSLEBaseShape0S0000000.A00.isSampled()) {
            uSLEBaseShape0S0000000.A0T(AnonymousClass7C5.A00(21, 10, 59), str);
            uSLEBaseShape0S0000000.A0O(AnonymousClass7BM.A00(str2), "product_type");
            uSLEBaseShape0S0000000.Bb4();
        }
    }

    public static void A05(AnonymousClass0A2 r5, String str, String str2, String str3, int i) {
        Long l;
        USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = new USLEBaseShape0S0000000(r5, i);
        if (uSLEBaseShape0S0000000.A00.isSampled()) {
            uSLEBaseShape0S0000000.A0T(AnonymousClass7C5.A00(21, 10, 59), str);
            uSLEBaseShape0S0000000.A0O(AnonymousClass7BM.A00(str2), "product_type");
            try {
                if (!TextUtils.isEmpty(str3)) {
                    str3.getClass();
                    l = Long.valueOf(str3);
                    uSLEBaseShape0S0000000.A0S("payment_credential_id", l);
                    uSLEBaseShape0S0000000.Bb4();
                }
            } catch (NumberFormatException e) {
                AnonymousClass0LU.A05(C121257Ff.class, "Unable to parse %s ", e, str3);
            }
            l = null;
            uSLEBaseShape0S0000000.A0S("payment_credential_id", l);
            uSLEBaseShape0S0000000.Bb4();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0480, code lost:
        r2 = X.C18180wK.A0I(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0488, code lost:
        if (X.AnonymousClass0wJ.A1U(r2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x048a, code lost:
        X.AnonymousClass7C5.A01(r2, r4);
        r2.A0O(X.AnonymousClass7BM.A00(r3), "product_type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x051b, code lost:
        r2.Bb8("payflows_display", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x051e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x053e, code lost:
        r2.Bb8("payflows_fail", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0541, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0546, code lost:
        r2.Bb8("payflows_init", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0549, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0569, code lost:
        r8.A04(r1, "view_name");
        r2 = X.C18180wK.A0I(r6.A03(r7, "client_verify_auth_success"), ch.boye.httpclientandroidlib.HttpStatus.SC_NOT_ACCEPTABLE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x057e, code lost:
        if (X.AnonymousClass0wJ.A1U(r2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0580, code lost:
        X.AnonymousClass7C5.A01(r2, r4);
        X.C86104wH.A1G(X.AnonymousClass7BM.A00(r3), r2);
        X.AnonymousClass7BM.A02(r8, r5);
        X.C86114wI.A1C(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x060b, code lost:
        r2 = X.C18180wK.A0I(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0613, code lost:
        if (X.AnonymousClass0wJ.A1U(r2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0615, code lost:
        X.AnonymousClass7C5.A01(r2, r4);
        X.C86104wH.A1G(X.AnonymousClass7BM.A00(r3), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0625, code lost:
        if (r5.containsKey("logging_context") == false) goto L_0x0770;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0627, code lost:
        r0 = (com.fbpay.logging.LoggingContext) r5.get("logging_context");
        X.C86104wH.A1K(r6, r0);
        r1 = X.AnonymousClass7Hr.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0634, code lost:
        if (r1 == null) goto L_0x0770;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0636, code lost:
        r6.A06(r1, "logging_policy");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x066b, code lost:
        r2.A04(r1, "view_name");
        r1 = X.C18180wK.A0I(X.C86104wH.A0K(r6, "user_click_auth_submit"), 2825);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0680, code lost:
        if (X.AnonymousClass0wJ.A1U(r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0682, code lost:
        X.AnonymousClass7C5.A01(r1, r4);
        X.C86104wH.A1G(X.AnonymousClass7BM.A00(r3), r1);
        X.AnonymousClass7BM.A02(r2, r5);
        X.C86114wI.A1C(r1, r2);
        r1.A1g(X.C121257Ff.A02(r5));
        r1.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x069c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x06b8, code lost:
        r2.A04(r1, "view_name");
        r1 = X.C18180wK.A0I(X.C86104wH.A0K(r6, "client_verify_auth_fail"), ch.boye.httpclientandroidlib.HttpStatus.SC_METHOD_NOT_ALLOWED);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x06cd, code lost:
        if (X.AnonymousClass0wJ.A1U(r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x06cf, code lost:
        X.AnonymousClass7C5.A01(r1, r4);
        X.C86104wH.A1G(X.AnonymousClass7BM.A00(r3), r1);
        X.AnonymousClass7BM.A02(r2, r5);
        X.C86114wI.A1C(r1, r2);
        r1.A1g(X.C121257Ff.A02(r5));
        r1.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x06e9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x072b, code lost:
        r2.Bb8("payflows_success", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x072e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0739, code lost:
        r2 = X.C18180wK.A0I(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0741, code lost:
        if (X.AnonymousClass0wJ.A1U(r2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0743, code lost:
        X.AnonymousClass7C5.A01(r2, r4);
        X.C86104wH.A1G(X.AnonymousClass7BM.A00(r3), r2);
        r6 = new X.C89325De();
        r0 = (java.lang.String) X.C86104wH.A0h("auth_view_name_key", r5);
        r1 = "view_name";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x075c, code lost:
        r6.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0765, code lost:
        if (r5.containsKey("logging_context") == false) goto L_0x0770;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0767, code lost:
        X.C86104wH.A1K(r6, (com.fbpay.logging.LoggingContext) r5.get("logging_context"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0770, code lost:
        X.C86114wI.A1C(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0773, code lost:
        r2.A1g(X.C121257Ff.A02(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x07c8, code lost:
        r2.A04(r1, "view_name");
        r1 = X.C18180wK.A0I(X.C86104wH.A0K(r6, "user_click_auth_atomic"), 2823);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x07dd, code lost:
        if (X.AnonymousClass0wJ.A1U(r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x07df, code lost:
        X.AnonymousClass7C5.A01(r1, r4);
        X.C86104wH.A1G(X.AnonymousClass7BM.A00(r3), r1);
        X.AnonymousClass7BM.A02(r2, r5);
        X.C86114wI.A1C(r1, r2);
        r1.A1g(X.C121257Ff.A02(r5));
        r1.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x07f9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0818, code lost:
        r1 = X.C18180wK.A0I(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0820, code lost:
        if (X.AnonymousClass0wJ.A1U(r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0822, code lost:
        X.AnonymousClass7C5.A01(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x083a, code lost:
        r2.A04(r1, "view_name");
        r1 = X.C18180wK.A0I(X.C86104wH.A0K(r6, "client_load_auth_success"), 257);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x084f, code lost:
        if (X.AnonymousClass0wJ.A1U(r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0851, code lost:
        X.AnonymousClass7C5.A01(r1, r4);
        X.C86104wH.A1G(X.AnonymousClass7BM.A00(r3), r1);
        X.AnonymousClass7BM.A02(r2, r5);
        X.C86114wI.A1C(r1, r2);
        r1.A1g(X.C121257Ff.A02(r5));
        r1.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x086b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0892, code lost:
        r6.A04(r1, "view_name");
        r1 = X.C18180wK.A0I(r2.A03(r7, "user_click_auth_exit"), 2824);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x08a7, code lost:
        if (X.AnonymousClass0wJ.A1U(r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x08a9, code lost:
        X.AnonymousClass7C5.A01(r1, r4);
        X.C86104wH.A1G(X.AnonymousClass7BM.A00(r3), r1);
        X.AnonymousClass7BM.A02(r6, r5);
        X.C86114wI.A1C(r1, r6);
        r1.A1g(X.C121257Ff.A02(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x08c0, code lost:
        r1.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x08c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0926, code lost:
        r2 = X.C18180wK.A0I(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x092e, code lost:
        if (X.AnonymousClass0wJ.A1U(r2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0930, code lost:
        X.AnonymousClass7C5.A01(r2, r4);
        X.C86104wH.A1G(X.AnonymousClass6BP.valueOf(r3), r2);
        r1 = new X.AnonymousClass5DP();
        r1.A0A("sec_type", "get_encryption_key");
        X.C86114wI.A1C(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0947, code lost:
        r2.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bb8(java.lang.String r18, java.util.Map r19) {
        /*
            r17 = this;
            r5 = r19
            r5.getClass()
            java.lang.String r4 = X.C122037Js.A03(r5)
            java.lang.String r1 = "logger_data"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x02a0
            java.lang.Object r0 = X.C86104wH.A0h(r1, r5)
            com.fbpay.logging.FBPayLoggerData r0 = (com.fbpay.logging.FBPayLoggerData) r0
            java.lang.String r3 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x02a0
        L_0x001f:
            r10 = r17
            X.8h9 r2 = r10.A01
            r0 = r2
            X.7kd r0 = (X.C128947kd) r0
            X.09x r7 = r0.A00
            r9 = r18
            int r0 = r9.hashCode()
            java.lang.String r8 = "auth_flows_dynamic_content_display"
            java.lang.String r1 = "auth_flows_local_content_display"
            r16 = -1
            switch(r0) {
                case -2083793875: goto L_0x0055;
                case -1928304214: goto L_0x0060;
                case -1758866292: goto L_0x006b;
                case -1756869445: goto L_0x0076;
                case -1436148427: goto L_0x0081;
                case -1341966846: goto L_0x008c;
                case -1340799109: goto L_0x0097;
                case -1291801157: goto L_0x00a2;
                case -1253423427: goto L_0x00ad;
                case -1206646458: goto L_0x00b8;
                case -1171064117: goto L_0x00c4;
                case -632237359: goto L_0x00d0;
                case -581361931: goto L_0x00dc;
                case -515133225: goto L_0x00e8;
                case -512598859: goto L_0x00f4;
                case -325463866: goto L_0x0100;
                case -302506921: goto L_0x010c;
                case -90731406: goto L_0x0116;
                case -59874324: goto L_0x0122;
                case 58333232: goto L_0x012e;
                case 88409299: goto L_0x013a;
                case 196680369: goto L_0x0146;
                case 238079149: goto L_0x0152;
                case 434863887: goto L_0x015e;
                case 434965761: goto L_0x016a;
                case 445985589: goto L_0x0176;
                case 446087463: goto L_0x0182;
                case 524264811: goto L_0x018e;
                case 562245913: goto L_0x0198;
                case 628213362: goto L_0x01a4;
                case 676601937: goto L_0x01b0;
                case 827296144: goto L_0x01bc;
                case 827398018: goto L_0x01c8;
                case 844442644: goto L_0x01d4;
                case 850635568: goto L_0x01e0;
                case 850737442: goto L_0x01ec;
                case 853729310: goto L_0x01f8;
                case 889983079: goto L_0x0204;
                case 898993015: goto L_0x0210;
                case 1075051593: goto L_0x021c;
                case 1134981461: goto L_0x0228;
                case 1242355852: goto L_0x0234;
                case 1290616588: goto L_0x0240;
                case 1295582546: goto L_0x024c;
                case 1610629737: goto L_0x0258;
                case 1706077836: goto L_0x0264;
                case 1813005513: goto L_0x0270;
                case 1932884837: goto L_0x027c;
                case 2079985833: goto L_0x0288;
                case 2093986803: goto L_0x0294;
                default: goto L_0x0037;
            }
        L_0x0037:
            java.lang.String r14 = "payflows_display"
            java.lang.String r13 = "payflows_fail"
            java.lang.String r12 = "payflows_success"
            java.lang.String r11 = "payflows_init"
            java.lang.String r6 = "get_encryption_key"
            java.lang.String r15 = "fetch_auth_flows_cache_content"
            java.lang.String r0 = "fetch_auth_flows_content"
            switch(r16) {
                case 0: goto L_0x02aa;
                case 1: goto L_0x02b6;
                case 2: goto L_0x02d7;
                case 3: goto L_0x02e9;
                case 4: goto L_0x02fe;
                case 5: goto L_0x030a;
                case 6: goto L_0x0316;
                case 7: goto L_0x0322;
                case 8: goto L_0x0351;
                case 9: goto L_0x0397;
                case 10: goto L_0x03b0;
                case 11: goto L_0x03c2;
                case 12: goto L_0x03e6;
                case 13: goto L_0x0402;
                case 14: goto L_0x0422;
                case 15: goto L_0x042e;
                case 16: goto L_0x0443;
                case 17: goto L_0x0449;
                case 18: goto L_0x046a;
                case 19: goto L_0x0476;
                case 20: goto L_0x0498;
                case 21: goto L_0x04b5;
                case 22: goto L_0x04f0;
                case 23: goto L_0x08c4;
                case 24: goto L_0x0915;
                case 25: goto L_0x050d;
                case 26: goto L_0x0512;
                case 27: goto L_0x0517;
                case 28: goto L_0x051f;
                case 29: goto L_0x091e;
                case 30: goto L_0x0534;
                case 31: goto L_0x053a;
                case 32: goto L_0x0542;
                case 33: goto L_0x054a;
                case 34: goto L_0x0592;
                case 35: goto L_0x05e8;
                case 36: goto L_0x063d;
                case 37: goto L_0x0649;
                case 38: goto L_0x069d;
                case 39: goto L_0x06ea;
                case 40: goto L_0x0712;
                case 41: goto L_0x0727;
                case 42: goto L_0x072f;
                case 43: goto L_0x077c;
                case 44: goto L_0x0791;
                case 45: goto L_0x07ae;
                case 46: goto L_0x07fa;
                case 47: goto L_0x080e;
                case 48: goto L_0x0827;
                case 49: goto L_0x086c;
                default: goto L_0x0048;
            }
        L_0x0048:
            java.lang.String r1 = "Event name "
            java.lang.String r0 = " is not supported!"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r1, r9, r0)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0055:
            java.lang.String r0 = "sso_access_token_generation_success"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 0
            goto L_0x0037
        L_0x0060:
            java.lang.String r0 = "fbpay_verify_paypal_success"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 1
            goto L_0x0037
        L_0x006b:
            java.lang.String r0 = "display_biometric_dialog"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 2
            goto L_0x0037
        L_0x0076:
            java.lang.String r0 = "fbpay_verify_pin_fail"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 3
            goto L_0x0037
        L_0x0081:
            java.lang.String r0 = "create_biometric"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 4
            goto L_0x0037
        L_0x008c:
            java.lang.String r0 = "fbpay_change_pin_click"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 5
            goto L_0x0037
        L_0x0097:
            java.lang.String r0 = "client_render_threeds_display"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 6
            goto L_0x0037
        L_0x00a2:
            java.lang.String r0 = "user_click_threeds_exit"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 7
            goto L_0x0037
        L_0x00ad:
            java.lang.String r0 = "client_verify_dynamic_auth_display"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 8
            goto L_0x0037
        L_0x00b8:
            java.lang.String r0 = "fbpay_verify_pin_success"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 9
            goto L_0x0037
        L_0x00c4:
            java.lang.String r0 = "verify_biometric_fail"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 10
            goto L_0x0037
        L_0x00d0:
            java.lang.String r0 = "fbpay_verify_cvv_confirm"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 11
            goto L_0x0037
        L_0x00dc:
            java.lang.String r0 = "forget_fb_password_click"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 12
            goto L_0x0037
        L_0x00e8:
            java.lang.String r0 = "fbpay_verify_pin_cancel"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 13
            goto L_0x0037
        L_0x00f4:
            java.lang.String r0 = "client_load_threeds_fail"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 14
            goto L_0x0037
        L_0x0100:
            java.lang.String r0 = "forget_pin_display"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 15
            goto L_0x0037
        L_0x010c:
            boolean r0 = r9.equals(r1)
            if (r0 == 0) goto L_0x0037
            r16 = 16
            goto L_0x0037
        L_0x0116:
            java.lang.String r0 = "verify_biometric"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 17
            goto L_0x0037
        L_0x0122:
            java.lang.String r0 = "fbpay_use_faceid_click"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 18
            goto L_0x0037
        L_0x012e:
            java.lang.String r0 = "fbpay_remove_biometric"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 19
            goto L_0x0037
        L_0x013a:
            java.lang.String r0 = "fbpay_verify_cvv_display"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 20
            goto L_0x0037
        L_0x0146:
            java.lang.String r0 = "client_load_dynamic_auth_success"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 21
            goto L_0x0037
        L_0x0152:
            java.lang.String r0 = "fbpay_verify_cvv_fail"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 22
            goto L_0x0037
        L_0x015e:
            java.lang.String r0 = "client_load_paysec_fail"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 23
            goto L_0x0037
        L_0x016a:
            java.lang.String r0 = "client_load_paysec_init"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 24
            goto L_0x0037
        L_0x0176:
            java.lang.String r0 = "fetch_auth_flows_cached_content_fail"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 25
            goto L_0x0037
        L_0x0182:
            java.lang.String r0 = "fetch_auth_flows_cached_content_init"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 26
            goto L_0x0037
        L_0x018e:
            boolean r0 = r9.equals(r8)
            if (r0 == 0) goto L_0x0037
            r16 = 27
            goto L_0x0037
        L_0x0198:
            java.lang.String r0 = "confirm_pin_display"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 28
            goto L_0x0037
        L_0x01a4:
            java.lang.String r0 = "client_load_paysec_success"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 29
            goto L_0x0037
        L_0x01b0:
            java.lang.String r0 = "fetch_auth_flows_content_success"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 30
            goto L_0x0037
        L_0x01bc:
            java.lang.String r0 = "fetch_auth_flows_content_fail"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 31
            goto L_0x0037
        L_0x01c8:
            java.lang.String r0 = "fetch_auth_flows_content_init"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 32
            goto L_0x0037
        L_0x01d4:
            java.lang.String r0 = "fbpay_verify_cvv_success"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 33
            goto L_0x0037
        L_0x01e0:
            java.lang.String r0 = "client_load_dynamic_auth_fail"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 34
            goto L_0x0037
        L_0x01ec:
            java.lang.String r0 = "client_load_dynamic_auth_init"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 35
            goto L_0x0037
        L_0x01f8:
            java.lang.String r0 = "fbpay_security_page_display"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 36
            goto L_0x0037
        L_0x0204:
            java.lang.String r0 = "fbpay_verify_paypal_confirm"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 37
            goto L_0x0037
        L_0x0210:
            java.lang.String r0 = "fbpay_verify_paypa_fail"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 38
            goto L_0x0037
        L_0x021c:
            java.lang.String r0 = "fbpay_verify_cvv_cancel"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 39
            goto L_0x0037
        L_0x0228:
            java.lang.String r0 = "create_pin_display"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 40
            goto L_0x0037
        L_0x0234:
            java.lang.String r0 = "fetch_auth_flows_cached_content_success"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 41
            goto L_0x0037
        L_0x0240:
            java.lang.String r0 = "client_load_threeds_success"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 42
            goto L_0x0037
        L_0x024c:
            java.lang.String r0 = "verify_pin_display"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 43
            goto L_0x0037
        L_0x0258:
            java.lang.String r0 = "fbpay_verify_paypal_display"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 44
            goto L_0x0037
        L_0x0264:
            java.lang.String r0 = "forget_pin_click"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 45
            goto L_0x0037
        L_0x0270:
            java.lang.String r0 = "reset_pin_screen_display"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 46
            goto L_0x0037
        L_0x027c:
            java.lang.String r0 = "fbpay_always_ask_for_pin_click"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 47
            goto L_0x0037
        L_0x0288:
            java.lang.String r0 = "reset_pin_confirm_display"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 48
            goto L_0x0037
        L_0x0294:
            java.lang.String r0 = "fbpay_verify_paypal_cancel"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            r16 = 49
            goto L_0x0037
        L_0x02a0:
            java.lang.String r0 = "flow_name"
            java.lang.Object r3 = X.C86104wH.A0h(r0, r5)
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x001f
        L_0x02aa:
            X.09x r1 = r10.A00
            java.lang.String r0 = "fbpay_sso_access_token_generation_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 622(0x26e, float:8.72E-43)
            goto L_0x0480
        L_0x02b6:
            X.09x r6 = r10.A00
            java.lang.String r0 = "FBPAY_AUTH_CREDENTIAL_ID"
            java.lang.Object r2 = X.C86104wH.A0h(r0, r5)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "fbpay_verify_paypal_success"
            X.0nS r6 = (X.C13330nS) r6
            X.0il r7 = r6.A00
            X.0A2 r1 = r6.A03(r7, r0)
            r0 = 633(0x279, float:8.87E-43)
            A05(r1, r4, r3, r2, r0)
            X.5Ck r8 = A02()
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_PAYPAL
            goto L_0x0569
        L_0x02d7:
            X.09x r6 = r10.A00
            X.5Ck r2 = new X.5Ck
            r2.<init>()
            X.6BC r1 = X.AnonymousClass6BC.BIO
            java.lang.String r0 = "auth_factor_type"
            r2.A04(r1, r0)
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_BIO
            goto L_0x083a
        L_0x02e9:
            X.09x r6 = r10.A00
            java.lang.String r0 = "fbpay_verify_pin_fail"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 635(0x27b, float:8.9E-43)
            A04(r1, r4, r3, r0)
            X.5Ck r2 = A00()
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_PIN
            goto L_0x06b8
        L_0x02fe:
            X.09x r1 = r10.A00
            java.lang.String r0 = "create_biometric"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 472(0x1d8, float:6.61E-43)
            goto L_0x0480
        L_0x030a:
            X.09x r1 = r10.A00
            java.lang.String r0 = "fbpay_change_pin_click"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 620(0x26c, float:8.69E-43)
            goto L_0x0818
        L_0x0316:
            X.09x r1 = r10.A00
            java.lang.String r0 = "client_render_threeds_display"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 394(0x18a, float:5.52E-43)
            goto L_0x0739
        L_0x0322:
            X.09x r1 = r10.A00
            java.lang.String r0 = "user_click_threeds_exit"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 2861(0xb2d, float:4.009E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x094a
            X.AnonymousClass7C5.A01(r2, r4)
            X.6BP r0 = X.AnonymousClass7BM.A00(r3)
            X.C86104wH.A1G(r0, r2)
            X.5De r6 = new X.5De
            r6.<init>()
            java.lang.String r0 = "auth_target_name_key"
            java.lang.Object r0 = X.C86104wH.A0h(r0, r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "target_name"
            goto L_0x075c
        L_0x0351:
            X.09x r2 = r10.A00
            java.util.List r7 = X.AnonymousClass7BM.A01(r5)
            X.5Cu r6 = new X.5Cu
            r6.<init>()
            X.6BJ r1 = X.AnonymousClass6BJ.DYNAMIC_AUTH
            java.lang.String r0 = "view_name"
            r6.A04(r1, r0)
            java.lang.String r0 = "dynamicauth_auth_factors"
            r6.A0B(r0, r7)
            java.lang.Object r1 = X.C18240wQ.A0b(r7)
            X.6BC r1 = (X.AnonymousClass6BC) r1
            java.lang.String r0 = "dynamicauth_auth_factor_type"
            r6.A04(r1, r0)
            int r0 = r7.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "dynamicauth_auth_count"
            r6.A0A(r0, r1)
            java.lang.String r0 = "DYNAMIC_AUTH_OPERATION_NAME"
            java.lang.Object r1 = X.C86104wH.A0h(r0, r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "dynamicauth_operation"
            r6.A0A(r0, r1)
            java.lang.String r0 = "client_verify_dynamicauth_display"
            X.0A2 r1 = X.C86104wH.A0K(r2, r0)
            r0 = 410(0x19a, float:5.75E-43)
            goto L_0x060b
        L_0x0397:
            X.09x r6 = r10.A00
            java.lang.String r0 = "fbpay_verify_pin_success"
            X.0nS r6 = (X.C13330nS) r6
            X.0il r7 = r6.A00
            X.0A2 r1 = r6.A03(r7, r0)
            r0 = 636(0x27c, float:8.91E-43)
            A04(r1, r4, r3, r0)
            X.5Ck r8 = A00()
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_PIN
            goto L_0x0569
        L_0x03b0:
            X.09x r6 = r10.A00
            X.5Ck r2 = new X.5Ck
            r2.<init>()
            X.6BC r1 = X.AnonymousClass6BC.BIO
            java.lang.String r0 = "auth_factor_type"
            r2.A04(r1, r0)
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_BIO
            goto L_0x06b8
        L_0x03c2:
            X.09x r6 = r10.A00
            java.lang.String r0 = "FBPAY_AUTH_CREDENTIAL_ID"
            java.lang.Object r2 = X.C86104wH.A0h(r0, r5)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "fbpay_verify_cvv_confirm"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 625(0x271, float:8.76E-43)
            A05(r1, r4, r3, r2, r0)
            X.5Ck r2 = A01()
            X.6BK r1 = X.AnonymousClass6BK.VERIFY_CVV_CONFIRM
            java.lang.String r0 = "target_name"
            r2.A04(r1, r0)
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_CVV
            goto L_0x066b
        L_0x03e6:
            X.09x r6 = r10.A00
            java.lang.String r0 = "forget_fb_password_click"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 665(0x299, float:9.32E-43)
            A04(r1, r4, r3, r0)
            X.5Ck r2 = A00()
            X.6BK r1 = X.AnonymousClass6BK.FORGET_PASSWORD_LINK
            java.lang.String r0 = "target_name"
            r2.A04(r1, r0)
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_RESET_PIN
            goto L_0x07c8
        L_0x0402:
            X.09x r2 = r10.A00
            java.lang.String r0 = "fbpay_verify_pin_cancel"
            X.0nS r2 = (X.C13330nS) r2
            X.0il r7 = r2.A00
            X.0A2 r1 = r2.A03(r7, r0)
            r0 = 634(0x27a, float:8.88E-43)
            A04(r1, r4, r3, r0)
            X.5Ck r6 = A00()
            X.6BK r1 = X.AnonymousClass6BK.VERIFY_PIN_CANCEL
            java.lang.String r0 = "target_name"
            r6.A04(r1, r0)
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_PIN
            goto L_0x0892
        L_0x0422:
            X.09x r1 = r10.A00
            java.lang.String r0 = "client_load_threeds_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 374(0x176, float:5.24E-43)
            goto L_0x0739
        L_0x042e:
            X.09x r6 = r10.A00
            java.lang.String r0 = "forget_pin_display"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 666(0x29a, float:9.33E-43)
            A04(r1, r4, r3, r0)
            X.5Ck r2 = A00()
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_FORGET_PIN
            goto L_0x083a
        L_0x0443:
            java.util.Map r0 = A03(r1, r5)
            goto L_0x051b
        L_0x0449:
            X.09x r6 = r10.A00
            java.lang.String r0 = "verify_biometric"
            X.0nS r6 = (X.C13330nS) r6
            X.0il r7 = r6.A00
            X.0A2 r1 = r6.A03(r7, r0)
            r0 = 2895(0xb4f, float:4.057E-42)
            A04(r1, r4, r3, r0)
            X.5Ck r8 = new X.5Ck
            r8.<init>()
            X.6BC r1 = X.AnonymousClass6BC.BIO
            java.lang.String r0 = "auth_factor_type"
            r8.A04(r1, r0)
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_BIO
            goto L_0x0569
        L_0x046a:
            X.09x r1 = r10.A00
            java.lang.String r0 = "fbpay_use_faceid_click"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 623(0x26f, float:8.73E-43)
            goto L_0x0818
        L_0x0476:
            X.09x r1 = r10.A00
            java.lang.String r0 = "remove_biometric"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 2626(0xa42, float:3.68E-42)
        L_0x0480:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x094a
            X.AnonymousClass7C5.A01(r2, r4)
            X.6BP r1 = X.AnonymousClass7BM.A00(r3)
            java.lang.String r0 = "product_type"
            r2.A0O(r1, r0)
            goto L_0x0947
        L_0x0498:
            X.09x r6 = r10.A00
            java.lang.String r0 = "FBPAY_AUTH_CREDENTIAL_ID"
            java.lang.Object r2 = X.C86104wH.A0h(r0, r5)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "fbpay_verify_cvv_display"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 626(0x272, float:8.77E-43)
            A05(r1, r4, r3, r2, r0)
            X.5Ck r2 = A01()
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_CVV
            goto L_0x083a
        L_0x04b5:
            X.09x r7 = r10.A00
            java.util.List r2 = X.AnonymousClass7BM.A01(r5)
            X.5Cu r6 = new X.5Cu
            r6.<init>()
            X.6BJ r1 = X.AnonymousClass6BJ.DYNAMIC_AUTH
            java.lang.String r0 = "view_name"
            r6.A04(r1, r0)
            java.lang.String r0 = "dynamicauth_auth_factors"
            r6.A0B(r0, r2)
            int r0 = r2.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "dynamicauth_auth_count"
            r6.A0A(r0, r1)
            java.lang.String r0 = "DYNAMIC_AUTH_OPERATION_NAME"
            java.lang.Object r1 = X.C86104wH.A0h(r0, r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "dynamicauth_operation"
            r6.A0A(r0, r1)
            java.lang.String r0 = "client_load_dynamicauth_success"
            X.0A2 r1 = X.C86104wH.A0K(r7, r0)
            r0 = 268(0x10c, float:3.76E-43)
            goto L_0x060b
        L_0x04f0:
            X.09x r6 = r10.A00
            java.lang.String r0 = "FBPAY_AUTH_CREDENTIAL_ID"
            java.lang.Object r2 = X.C86104wH.A0h(r0, r5)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "fbpay_verify_cvv_fail"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 627(0x273, float:8.79E-43)
            A05(r1, r4, r3, r2, r0)
            X.5Ck r2 = A01()
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_CVV
            goto L_0x06b8
        L_0x050d:
            java.util.Map r0 = A03(r15, r5)
            goto L_0x053e
        L_0x0512:
            java.util.Map r0 = A03(r15, r5)
            goto L_0x0546
        L_0x0517:
            java.util.Map r0 = A03(r8, r5)
        L_0x051b:
            r2.Bb8(r14, r0)
            return
        L_0x051f:
            X.09x r6 = r10.A00
            java.lang.String r0 = "confirm_pin_display"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 457(0x1c9, float:6.4E-43)
            A04(r1, r4, r3, r0)
            X.5Ck r2 = A00()
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_CONFIRM_PIN
            goto L_0x083a
        L_0x0534:
            java.util.Map r0 = A03(r0, r5)
            goto L_0x072b
        L_0x053a:
            java.util.Map r0 = A03(r0, r5)
        L_0x053e:
            r2.Bb8(r13, r0)
            return
        L_0x0542:
            java.util.Map r0 = A03(r0, r5)
        L_0x0546:
            r2.Bb8(r11, r0)
            return
        L_0x054a:
            X.09x r6 = r10.A00
            java.lang.String r0 = "FBPAY_AUTH_CREDENTIAL_ID"
            java.lang.Object r2 = X.C86104wH.A0h(r0, r5)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "fbpay_verify_cvv_success"
            X.0nS r6 = (X.C13330nS) r6
            X.0il r7 = r6.A00
            X.0A2 r1 = r6.A03(r7, r0)
            r0 = 628(0x274, float:8.8E-43)
            A05(r1, r4, r3, r2, r0)
            X.5Ck r8 = A01()
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_CVV
        L_0x0569:
            java.lang.String r0 = "view_name"
            r8.A04(r1, r0)
            java.lang.String r0 = "client_verify_auth_success"
            X.0A2 r1 = r6.A03(r7, r0)
            r0 = 406(0x196, float:5.69E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x094a
            X.AnonymousClass7C5.A01(r2, r4)
            X.6BP r0 = X.AnonymousClass7BM.A00(r3)
            X.C86104wH.A1G(r0, r2)
            X.AnonymousClass7BM.A02(r8, r5)
            X.C86114wI.A1C(r2, r8)
            goto L_0x0773
        L_0x0592:
            X.09x r2 = r10.A00
            java.util.List r7 = X.AnonymousClass7BM.A01(r5)
            X.5Cu r6 = new X.5Cu
            r6.<init>()
            X.6BJ r1 = X.AnonymousClass6BJ.DYNAMIC_AUTH
            java.lang.String r0 = "view_name"
            r6.A04(r1, r0)
            java.lang.String r0 = "dynamicauth_auth_factors"
            r6.A0B(r0, r7)
            int r0 = r7.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "dynamicauth_auth_count"
            r6.A0A(r0, r1)
            java.lang.String r0 = "DYNAMIC_AUTH_ERROR_CODE"
            java.lang.Object r0 = X.C86104wH.A0h(r0, r5)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "dynamicauth_error_code"
            r6.A0A(r0, r1)
            java.lang.String r0 = "DYNAMIC_AUTH_ERROR_MESSAGE"
            java.lang.Object r1 = X.C86104wH.A0h(r0, r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "dynamicauth_error_message"
            r6.A0A(r0, r1)
            java.lang.String r0 = "DYNAMIC_AUTH_OPERATION_NAME"
            java.lang.Object r1 = X.C86104wH.A0h(r0, r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "dynamicauth_operation"
            r6.A0A(r0, r1)
            java.lang.String r0 = "client_load_dynamicauth_fail"
            X.0A2 r1 = X.C86104wH.A0K(r2, r0)
            r0 = 266(0x10a, float:3.73E-43)
            goto L_0x060b
        L_0x05e8:
            X.09x r2 = r10.A00
            X.5Cu r6 = new X.5Cu
            r6.<init>()
            X.6BJ r1 = X.AnonymousClass6BJ.DYNAMIC_AUTH
            java.lang.String r0 = "view_name"
            r6.A04(r1, r0)
            java.lang.String r0 = "DYNAMIC_AUTH_OPERATION_NAME"
            java.lang.Object r1 = X.C86104wH.A0h(r0, r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "dynamicauth_operation"
            r6.A0A(r0, r1)
            java.lang.String r0 = "client_load_dynamicauth_init"
            X.0A2 r1 = X.C86104wH.A0K(r2, r0)
            r0 = 267(0x10b, float:3.74E-43)
        L_0x060b:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x094a
            X.AnonymousClass7C5.A01(r2, r4)
            X.6BP r0 = X.AnonymousClass7BM.A00(r3)
            X.C86104wH.A1G(r0, r2)
            java.lang.String r1 = "logging_context"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x0770
            java.lang.Object r0 = r5.get(r1)
            com.fbpay.logging.LoggingContext r0 = (com.fbpay.logging.LoggingContext) r0
            X.C86104wH.A1K(r6, r0)
            X.5Cb r1 = X.AnonymousClass7Hr.A00(r0)
            if (r1 == 0) goto L_0x0770
            java.lang.String r0 = "logging_policy"
            r6.A06(r1, r0)
            goto L_0x0770
        L_0x063d:
            X.09x r1 = r10.A00
            java.lang.String r0 = "fbpay_security_page_display"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 621(0x26d, float:8.7E-43)
            goto L_0x0818
        L_0x0649:
            X.09x r6 = r10.A00
            java.lang.String r0 = "FBPAY_AUTH_CREDENTIAL_ID"
            java.lang.Object r2 = X.C86104wH.A0h(r0, r5)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "fbpay_verify_paypal_confirm"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 631(0x277, float:8.84E-43)
            A05(r1, r4, r3, r2, r0)
            X.5Ck r2 = A02()
            X.6BK r1 = X.AnonymousClass6BK.VERIFY_PAYPAL_CONFIRM
            java.lang.String r0 = "target_name"
            r2.A04(r1, r0)
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_PAYPAL
        L_0x066b:
            java.lang.String r0 = "view_name"
            r2.A04(r1, r0)
            java.lang.String r0 = "user_click_auth_submit"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 2825(0xb09, float:3.959E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x094a
            X.AnonymousClass7C5.A01(r1, r4)
            X.6BP r0 = X.AnonymousClass7BM.A00(r3)
            X.C86104wH.A1G(r0, r1)
            X.AnonymousClass7BM.A02(r2, r5)
            X.C86114wI.A1C(r1, r2)
            java.util.Map r0 = X.C121257Ff.A02(r5)
            r1.A1g(r0)
            r1.Bb4()
            return
        L_0x069d:
            X.09x r6 = r10.A00
            java.lang.String r0 = "FBPAY_AUTH_CREDENTIAL_ID"
            java.lang.Object r2 = X.C86104wH.A0h(r0, r5)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "fbpay_verify_paypa_fail"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 629(0x275, float:8.81E-43)
            A05(r1, r4, r3, r2, r0)
            X.5Ck r2 = A02()
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_PAYPAL
        L_0x06b8:
            java.lang.String r0 = "view_name"
            r2.A04(r1, r0)
            java.lang.String r0 = "client_verify_auth_fail"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 405(0x195, float:5.68E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x094a
            X.AnonymousClass7C5.A01(r1, r4)
            X.6BP r0 = X.AnonymousClass7BM.A00(r3)
            X.C86104wH.A1G(r0, r1)
            X.AnonymousClass7BM.A02(r2, r5)
            X.C86114wI.A1C(r1, r2)
            java.util.Map r0 = X.C121257Ff.A02(r5)
            r1.A1g(r0)
            r1.Bb4()
            return
        L_0x06ea:
            X.09x r2 = r10.A00
            java.lang.String r0 = "FBPAY_AUTH_CREDENTIAL_ID"
            java.lang.Object r6 = X.C86104wH.A0h(r0, r5)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "fbpay_verify_cvv_cancel"
            X.0nS r2 = (X.C13330nS) r2
            X.0il r7 = r2.A00
            X.0A2 r1 = r2.A03(r7, r0)
            r0 = 624(0x270, float:8.74E-43)
            A05(r1, r4, r3, r6, r0)
            X.5Ck r6 = A01()
            X.6BK r1 = X.AnonymousClass6BK.VERIFY_CVV_CANCEL
            java.lang.String r0 = "target_name"
            r6.A04(r1, r0)
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_CVV
            goto L_0x0892
        L_0x0712:
            X.09x r6 = r10.A00
            java.lang.String r0 = "create_pin_display"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 473(0x1d9, float:6.63E-43)
            A04(r1, r4, r3, r0)
            X.5Ck r2 = A00()
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_CREATE_PIN
            goto L_0x083a
        L_0x0727:
            java.util.Map r0 = A03(r15, r5)
        L_0x072b:
            r2.Bb8(r12, r0)
            return
        L_0x072f:
            X.09x r1 = r10.A00
            java.lang.String r0 = "client_load_threeds_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 375(0x177, float:5.25E-43)
        L_0x0739:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x094a
            X.AnonymousClass7C5.A01(r2, r4)
            X.6BP r0 = X.AnonymousClass7BM.A00(r3)
            X.C86104wH.A1G(r0, r2)
            X.5De r6 = new X.5De
            r6.<init>()
            java.lang.String r0 = "auth_view_name_key"
            java.lang.Object r0 = X.C86104wH.A0h(r0, r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "view_name"
        L_0x075c:
            r6.A0A(r1, r0)
            java.lang.String r1 = "logging_context"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x0770
            java.lang.Object r0 = r5.get(r1)
            com.fbpay.logging.LoggingContext r0 = (com.fbpay.logging.LoggingContext) r0
            X.C86104wH.A1K(r6, r0)
        L_0x0770:
            X.C86114wI.A1C(r2, r6)
        L_0x0773:
            java.util.Map r0 = X.C121257Ff.A02(r5)
            r2.A1g(r0)
            goto L_0x0947
        L_0x077c:
            X.09x r6 = r10.A00
            java.lang.String r0 = "verify_pin_display"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 2896(0xb50, float:4.058E-42)
            A04(r1, r4, r3, r0)
            X.5Ck r2 = A00()
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_PIN
            goto L_0x083a
        L_0x0791:
            X.09x r6 = r10.A00
            java.lang.String r0 = "FBPAY_AUTH_CREDENTIAL_ID"
            java.lang.Object r2 = X.C86104wH.A0h(r0, r5)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "fbpay_verify_paypal_display"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 632(0x278, float:8.86E-43)
            A05(r1, r4, r3, r2, r0)
            X.5Ck r2 = A02()
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_PAYPAL
            goto L_0x083a
        L_0x07ae:
            X.09x r6 = r10.A00
            java.lang.String r0 = "forgot_pin_click"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 668(0x29c, float:9.36E-43)
            A04(r1, r4, r3, r0)
            X.5Ck r2 = A00()
            X.6BK r1 = X.AnonymousClass6BK.FORGET_PIN_LINK
            java.lang.String r0 = "target_name"
            r2.A04(r1, r0)
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_PIN
        L_0x07c8:
            java.lang.String r0 = "view_name"
            r2.A04(r1, r0)
            java.lang.String r0 = "user_click_auth_atomic"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 2823(0xb07, float:3.956E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x094a
            X.AnonymousClass7C5.A01(r1, r4)
            X.6BP r0 = X.AnonymousClass7BM.A00(r3)
            X.C86104wH.A1G(r0, r1)
            X.AnonymousClass7BM.A02(r2, r5)
            X.C86114wI.A1C(r1, r2)
            java.util.Map r0 = X.C121257Ff.A02(r5)
            r1.A1g(r0)
            r1.Bb4()
            return
        L_0x07fa:
            X.09x r6 = r10.A00
            java.lang.String r0 = "reset_pin_screen_display"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 2640(0xa50, float:3.7E-42)
            A04(r1, r4, r3, r0)
            X.5Ck r2 = A00()
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_RESET_PIN
            goto L_0x083a
        L_0x080e:
            X.09x r1 = r10.A00
            java.lang.String r0 = "fbpay_always_ask_for_pin_click"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 619(0x26b, float:8.67E-43)
        L_0x0818:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x094a
            X.AnonymousClass7C5.A01(r1, r4)
            goto L_0x08c0
        L_0x0827:
            X.09x r6 = r10.A00
            java.lang.String r0 = "reset_pin_confirm_display"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 2639(0xa4f, float:3.698E-42)
            A04(r1, r4, r3, r0)
            X.5Ck r2 = A00()
            X.6BJ r1 = X.AnonymousClass6BJ.RESET_PIN_CONFIRM
        L_0x083a:
            java.lang.String r0 = "view_name"
            r2.A04(r1, r0)
            java.lang.String r0 = "client_load_auth_success"
            X.0A2 r1 = X.C86104wH.A0K(r6, r0)
            r0 = 257(0x101, float:3.6E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x094a
            X.AnonymousClass7C5.A01(r1, r4)
            X.6BP r0 = X.AnonymousClass7BM.A00(r3)
            X.C86104wH.A1G(r0, r1)
            X.AnonymousClass7BM.A02(r2, r5)
            X.C86114wI.A1C(r1, r2)
            java.util.Map r0 = X.C121257Ff.A02(r5)
            r1.A1g(r0)
            r1.Bb4()
            return
        L_0x086c:
            X.09x r2 = r10.A00
            java.lang.String r0 = "FBPAY_AUTH_CREDENTIAL_ID"
            java.lang.Object r6 = X.C86104wH.A0h(r0, r5)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "fbpay_verify_paypal_cancel"
            X.0nS r2 = (X.C13330nS) r2
            X.0il r7 = r2.A00
            X.0A2 r1 = r2.A03(r7, r0)
            r0 = 630(0x276, float:8.83E-43)
            A05(r1, r4, r3, r6, r0)
            X.5Ck r6 = A02()
            X.6BK r1 = X.AnonymousClass6BK.VERIFY_PAYPAL_CANCEL
            java.lang.String r0 = "target_name"
            r6.A04(r1, r0)
            X.6BJ r1 = X.AnonymousClass6BJ.FBPAY_VERIFY_PAYPAL
        L_0x0892:
            java.lang.String r0 = "view_name"
            r6.A04(r1, r0)
            java.lang.String r0 = "user_click_auth_exit"
            X.0A2 r1 = r2.A03(r7, r0)
            r0 = 2824(0xb08, float:3.957E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x094a
            X.AnonymousClass7C5.A01(r1, r4)
            X.6BP r0 = X.AnonymousClass7BM.A00(r3)
            X.C86104wH.A1G(r0, r1)
            X.AnonymousClass7BM.A02(r6, r5)
            X.C86114wI.A1C(r1, r6)
            java.util.Map r0 = X.C121257Ff.A02(r5)
            r1.A1g(r0)
        L_0x08c0:
            r1.Bb4()
            return
        L_0x08c4:
            java.lang.String r0 = "client_load_paysec_fail"
            X.0A2 r1 = X.C86104wH.A0K(r7, r0)
            r0 = 346(0x15a, float:4.85E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x094a
            X.AnonymousClass7C5.A01(r2, r4)
            X.6BP r0 = X.AnonymousClass6BP.valueOf(r3)
            X.C86104wH.A1G(r0, r2)
            X.5DP r1 = new X.5DP
            r1.<init>()
            java.lang.String r0 = "sec_type"
            r1.A0A(r0, r6)
            X.C86114wI.A1C(r2, r1)
            java.lang.String r0 = "error_message"
            java.lang.Object r0 = X.C86104wH.A0h(r0, r5)
            java.lang.String r0 = (java.lang.String) r0
            r2.A1J(r0)
            java.lang.String r1 = "error_code"
            java.lang.Object r0 = X.C86104wH.A0h(r1, r5)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r2.A0T(r1, r0)
            java.lang.String r1 = "error_stacktrace"
            java.lang.Object r0 = X.C86104wH.A0h(r1, r5)
            java.lang.String r0 = (java.lang.String) r0
            r2.A0T(r1, r0)
            goto L_0x0947
        L_0x0915:
            java.lang.String r0 = "client_load_paysec_init"
            X.0A2 r1 = X.C86104wH.A0K(r7, r0)
            r0 = 347(0x15b, float:4.86E-43)
            goto L_0x0926
        L_0x091e:
            java.lang.String r0 = "client_load_paysec_success"
            X.0A2 r1 = X.C86104wH.A0K(r7, r0)
            r0 = 348(0x15c, float:4.88E-43)
        L_0x0926:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x094a
            X.AnonymousClass7C5.A01(r2, r4)
            X.6BP r0 = X.AnonymousClass6BP.valueOf(r3)
            X.C86104wH.A1G(r0, r2)
            X.5DP r1 = new X.5DP
            r1.<init>()
            java.lang.String r0 = "sec_type"
            r1.A0A(r0, r6)
            X.C86114wI.A1C(r2, r1)
        L_0x0947:
            r2.Bb4()
        L_0x094a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128937kc.Bb8(java.lang.String, java.util.Map):void");
    }

    public C128937kc(C021209x r1, C143688h9 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static Map A03(String str, Map map) {
        HashMap A0j = C86164wN.A0j(map);
        A0j.put("flow_step", str);
        return Collections.unmodifiableMap(A0j);
    }
}
