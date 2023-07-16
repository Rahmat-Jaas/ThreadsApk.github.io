package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.fbpay.logging.LoggingContext;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape0S1300100_I2;
import kotlin.jvm.internal.KtLambdaShape0S1500100_I2;
import kotlin.jvm.internal.KtLambdaShape0S2310000_I2;
import kotlin.jvm.internal.KtLambdaShape3S1200000_I2;
import kotlin.jvm.internal.KtLambdaShape3S1300000_I2;

/* renamed from: X.7ke  reason: invalid class name and case insensitive filesystem */
public final class C128957ke implements C143688h9 {
    public final C021209x A00;
    public final QuickPerformanceLogger A01;

    public static C021209x A00(C128957ke r1, Object obj) {
        C04220Ms.A0B(obj, 1);
        return r1.A00;
    }

    public static final void A04(C021409z r1, LoggingContext loggingContext, AnonymousClass0YY r3) {
        if (AnonymousClass0wJ.A1U((AnonymousClass0A3) r1) && !loggingContext.A05) {
            AnonymousClass6D4.A00 = loggingContext.A02;
            AnonymousClass6XW.A00 = "ecp";
            ((AnonymousClass0A1) r3.invoke(r1)).Bb4();
        }
    }

    public final void A09(C40307LcE lcE, LoggingContext loggingContext, String str, List list, List list2, Map map, long j) {
        AnonymousClass0wJ.A1Q(lcE, str);
        A04(C18180wK.A0I(C86104wH.A0K(this.A00, "client_submit_ecppaymentcontainer_init"), 400), loggingContext, new KtLambdaShape0S1500100_I2(lcE, loggingContext, str, list2, list, map, j));
        this.A01.markerPoint(223884226, "CONTAINER_SUBMISSION_INIT");
    }

    public final void A0C(LoggingContext loggingContext, Long l, String str, Map map) {
        A04(C18180wK.A0I(C86104wH.A0K(A00(this, str), "client_load_shippingaddress_success"), 363), loggingContext, new KtLambdaShape3S1300000_I2(loggingContext, l, str, map, 19));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        throw X.C18190wL.A0a(X.AnonymousClass00U.A0L("Invalid event name: ", r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0c79, code lost:
        if (X.C04220Ms.A0I(r5, "edit_phone") == false) goto L_0x0cb2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0c8c, code lost:
        r3 = X.C18180wK.A0I(r1, r0);
        r5 = X.AnonymousClass7Kr.A06(r2);
        r4 = new X.AnonymousClass5Cp();
        X.AnonymousClass7Hr.A04(r4, r9);
        X.C86124wJ.A1K(r4, r5);
        r4.A04(X.AnonymousClass7Kr.A02(r5), "contact_type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0cae, code lost:
        if (X.C04220Ms.A0I(r5, "edit_email") != false) goto L_0x0cb8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0cb0, code lost:
        r6 = "edit_phone";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0cb6, code lost:
        if (X.C04220Ms.A0I(r5, r6) == false) goto L_0x0ccb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0cbc, code lost:
        if (X.AnonymousClass7Kr.A0E(r2) == false) goto L_0x0ccb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0cbe, code lost:
        r1 = java.lang.Long.valueOf(X.AnonymousClass7Kr.A00(r2));
        r0 = "contact_id";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0cc8, code lost:
        r4.A09(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0ccf, code lost:
        if (X.AnonymousClass0wJ.A1U(r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0cd1, code lost:
        X.C86114wI.A1C(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0cd8, code lost:
        if (X.AnonymousClass7Kr.A0F(r2) == false) goto L_0x0ce1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0cda, code lost:
        r3.A1g(X.AnonymousClass7Kr.A0A(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0ce1, code lost:
        r3.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0ce4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bb8(java.lang.String r18, java.util.Map r19) {
        /*
            r17 = this;
            r0 = 0
            r4 = r18
            X.C04220Ms.A0B(r4, r0)
            r1 = r19
            if (r19 == 0) goto L_0x0cff
            java.lang.String r0 = "logging_context"
            java.lang.Object r9 = r1.get(r0)
            if (r9 == 0) goto L_0x0cfa
            com.fbpay.logging.LoggingContext r9 = (com.fbpay.logging.LoggingContext) r9
            boolean r0 = r9.A05
            if (r0 != 0) goto L_0x0cf9
            java.util.Set r0 = r9.A03
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0cf9
            java.lang.String r7 = r9.A02
            X.AnonymousClass6D4.A00 = r7
            X.6BP r6 = X.AnonymousClass6BP.A02
            java.lang.String r0 = "ecp"
            X.AnonymousClass6XW.A00 = r0
            java.util.Set r8 = r9.A04
            java.util.LinkedHashMap r2 = X.C18220wO.A0y()
            java.util.Iterator r5 = X.AnonymousClass0wJ.A0z(r1)
        L_0x0034:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0056
            java.util.Map$Entry r0 = X.C18180wK.A0o(r5)
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r8.contains(r3)
            if (r0 == 0) goto L_0x0052
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = ""
        L_0x0052:
            r2.put(r3, r1)
            goto L_0x0034
        L_0x0056:
            int r1 = r4.hashCode()
            r0 = r17
            switch(r1) {
                case -2082718594: goto L_0x0c7c;
                case -2010088065: goto L_0x0c2f;
                case -1952555357: goto L_0x0c1e;
                case -1908011720: goto L_0x0bed;
                case -1780133084: goto L_0x0bba;
                case -1535326856: goto L_0x0b66;
                case -1436325711: goto L_0x0b31;
                case -1402887998: goto L_0x0b02;
                case -1227870331: goto L_0x0ab9;
                case -1222211672: goto L_0x0a5f;
                case -1163521053: goto L_0x0a2c;
                case -1087737056: goto L_0x09f5;
                case -1029748718: goto L_0x09c2;
                case -859606767: goto L_0x0981;
                case -611547970: goto L_0x094a;
                case -573578433: goto L_0x0919;
                case -545346713: goto L_0x08e0;
                case -471261953: goto L_0x08a9;
                case -448490126: goto L_0x0872;
                case -423810144: goto L_0x0816;
                case -277602436: goto L_0x0790;
                case -277500562: goto L_0x072c;
                case -158857220: goto L_0x06f5;
                case -133110930: goto L_0x06c6;
                case -110730897: goto L_0x0693;
                case -85271377: goto L_0x0656;
                case -64452579: goto L_0x061f;
                case 292863669: goto L_0x05f0;
                case 491541880: goto L_0x059c;
                case 680865129: goto L_0x0563;
                case 738211679: goto L_0x0517;
                case 903681348: goto L_0x04e0;
                case 1011441652: goto L_0x04b1;
                case 1130110473: goto L_0x047e;
                case 1190396159: goto L_0x0417;
                case 1272361701: goto L_0x0398;
                case 1317866292: goto L_0x034c;
                case 1419293762: goto L_0x031b;
                case 1493876315: goto L_0x02e8;
                case 1520567506: goto L_0x02b0;
                case 1530986045: goto L_0x027d;
                case 1775753377: goto L_0x0248;
                case 1775855251: goto L_0x0213;
                case 1807001853: goto L_0x01e0;
                case 1833286085: goto L_0x01a9;
                case 1882193773: goto L_0x0173;
                case 1970065401: goto L_0x0142;
                case 2044086485: goto L_0x00f9;
                case 2098064162: goto L_0x00c9;
                case 2098166036: goto L_0x0099;
                case 2128639703: goto L_0x006a;
                default: goto L_0x005f;
            }
        L_0x005f:
            java.lang.String r0 = "Invalid event name: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r4)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x006a:
            java.lang.String r5 = "user_remove_credential_enter"
            boolean r1 = r4.equals(r5)
            if (r1 == 0) goto L_0x005f
            X.5Cr r4 = A01(r2)
            X.AnonymousClass7Hr.A04(r4, r9)
            java.lang.String r3 = X.AnonymousClass7Kr.A05(r2)
            java.lang.String r1 = "target_name"
            A06(r4, r1, r3, r2)
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r5)
            r0 = 2885(0xb45, float:4.043E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.C86114wI.A1C(r3, r4)
            goto L_0x0cd4
        L_0x0099:
            java.lang.String r3 = "client_load_contact_init"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 259(0x103, float:3.63E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.5Cp r1 = new X.5Cp
            r1.<init>()
            X.AnonymousClass7Hr.A04(r1, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A06(r2)
            X.C86124wJ.A1K(r1, r0)
            A05(r1, r3, r2)
            r3.Bb4()
            return
        L_0x00c9:
            java.lang.String r3 = "client_load_contact_fail"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 258(0x102, float:3.62E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.5Cp r1 = new X.5Cp
            r1.<init>()
            X.AnonymousClass7Hr.A04(r1, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A06(r2)
            X.C86124wJ.A1K(r1, r0)
            A05(r1, r3, r2)
            r3.Bb4()
            return
        L_0x00f9:
            java.lang.String r8 = "user_click_fbpayui_atomic"
            boolean r1 = r4.equals(r8)
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = "component_logging_data"
            java.lang.Object r5 = r2.get(r1)
            if (r5 == 0) goto L_0x0ce5
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r5 = (com.facebookpay.expresscheckout.logging.ComponentLoggingData) r5
            X.5DE r4 = new X.5DE
            r4.<init>()
            java.lang.String r3 = r5.A00
            java.lang.String r1 = "context_component_name"
            r4.A0A(r1, r3)
            X.AnonymousClass7Hr.A04(r4, r9)
            java.lang.String r1 = r5.A01
            X.C86134wK.A1G(r4, r1)
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r8)
            r0 = 2847(0xb1f, float:3.99E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x0cf9
            java.lang.String r0 = X.AnonymousClass7C6.A00()
            r1.A0T(r0, r7)
            X.C86104wH.A1G(r6, r1)
            A05(r4, r1, r2)
            r1.Bb4()
            return
        L_0x0142:
            java.lang.String r3 = "user_remove_credential_submit"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 2887(0xb47, float:4.046E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r4)
            if (r0 == 0) goto L_0x0cf9
            X.5Cr r3 = A01(r2)
            X.AnonymousClass7Hr.A04(r3, r9)
            java.lang.String r1 = X.AnonymousClass7Kr.A05(r2)
            java.lang.String r0 = "target_name"
            A06(r3, r0, r1, r2)
            A05(r3, r4, r2)
            r4.Bb4()
            return
        L_0x0173:
            java.lang.String r3 = "client_add_credential_success"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 178(0xb2, float:2.5E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r4)
            if (r0 == 0) goto L_0x0cf9
            X.5Cr r3 = A01(r2)
            X.AnonymousClass7Hr.A04(r3, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A06(r2)
            X.C86124wJ.A1K(r3, r0)
            long r0 = X.AnonymousClass7Kr.A00(r2)
            X.C86164wN.A1D(r3, r0)
            A05(r3, r4, r2)
            r4.Bb4()
            return
        L_0x01a9:
            java.lang.String r5 = "client_edit_credential_fail"
            boolean r1 = r4.equals(r5)
            if (r1 == 0) goto L_0x005f
            X.5Cr r4 = new X.5Cr
            r4.<init>()
            X.Lce r1 = X.C40324Lce.A02
            X.C86164wN.A1B(r1, r4)
            X.AnonymousClass7Hr.A04(r4, r9)
            java.lang.String r3 = X.AnonymousClass7Kr.A06(r2)
            java.lang.String r1 = "view_name"
            A06(r4, r1, r3, r2)
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r5)
            r0 = 223(0xdf, float:3.12E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x0cf9
            A05(r4, r1, r2)
            r1.Bb4()
            return
        L_0x01e0:
            java.lang.String r3 = "user_click_contactdetails_atomic"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 2829(0xb0d, float:3.964E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.5Co r1 = new X.5Co
            r1.<init>()
            X.C86104wH.A1K(r1, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A05(r2)
            X.C86134wK.A1G(r1, r0)
            X.AnonymousClass7Hr.A03(r1, r9)
            A05(r1, r3, r2)
            r3.Bb4()
            return
        L_0x0213:
            java.lang.String r3 = "client_load_credential_init"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 262(0x106, float:3.67E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.5Cr r1 = new X.5Cr
            r1.<init>()
            X.Lce r0 = X.C40324Lce.A03
            X.C86164wN.A1B(r0, r1)
            X.AnonymousClass7Hr.A04(r1, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A06(r2)
            X.C86124wJ.A1K(r1, r0)
            A05(r1, r3, r2)
            r3.Bb4()
            return
        L_0x0248:
            java.lang.String r3 = "client_load_credential_fail"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 261(0x105, float:3.66E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.5Cr r1 = new X.5Cr
            r1.<init>()
            X.Lce r0 = X.C40324Lce.A03
            X.C86164wN.A1B(r0, r1)
            X.AnonymousClass7Hr.A04(r1, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A06(r2)
            X.C86124wJ.A1K(r1, r0)
            A05(r1, r3, r2)
            r3.Bb4()
            return
        L_0x027d:
            java.lang.String r3 = "client_add_credentialdetails_success"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 180(0xb4, float:2.52E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.5Cq r1 = new X.5Cq
            r1.<init>()
            X.C86104wH.A1K(r1, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A06(r2)
            X.C86124wJ.A1K(r1, r0)
            X.AnonymousClass7Hr.A03(r1, r9)
            A05(r1, r3, r2)
            r3.Bb4()
            return
        L_0x02b0:
            java.lang.String r3 = "client_add_contact_success"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 174(0xae, float:2.44E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            java.lang.String r5 = X.AnonymousClass7Kr.A06(r2)
            X.5Cp r4 = new X.5Cp
            r4.<init>()
            X.AnonymousClass7Hr.A04(r4, r9)
            X.C86124wJ.A1K(r4, r5)
            X.6B8 r1 = X.AnonymousClass7Kr.A02(r5)
            java.lang.String r0 = "contact_type"
            r4.A04(r1, r0)
            java.lang.String r0 = "add_email"
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 != 0) goto L_0x0cb8
            java.lang.String r6 = "add_phone"
            goto L_0x0cb2
        L_0x02e8:
            java.lang.String r1 = "user_remove_credential_cancel"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x005f
            X.09x r1 = r0.A00
            java.lang.String r0 = "user_remove_credential_exit"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 2886(0xb46, float:4.044E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r4)
            if (r0 == 0) goto L_0x0cf9
            X.5Cr r3 = A01(r2)
            X.AnonymousClass7Hr.A04(r3, r9)
            java.lang.String r1 = X.AnonymousClass7Kr.A05(r2)
            java.lang.String r0 = "target_name"
            A06(r3, r0, r1, r2)
            A05(r3, r4, r2)
            r4.Bb4()
            return
        L_0x031b:
            java.lang.String r5 = "client_remove_credential_success"
            boolean r1 = r4.equals(r5)
            if (r1 == 0) goto L_0x005f
            X.5Cr r4 = A01(r2)
            X.AnonymousClass7Hr.A04(r4, r9)
            java.lang.String r3 = X.AnonymousClass7Kr.A06(r2)
            java.lang.String r1 = "view_name"
            A06(r4, r1, r3, r2)
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r5)
            r0 = 385(0x181, float:5.4E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x0cf9
            A05(r4, r1, r2)
            r1.Bb4()
            return
        L_0x034c:
            java.lang.String r3 = "client_load_fbpayui_init"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 304(0x130, float:4.26E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r5)
            if (r0 == 0) goto L_0x0cf9
            java.lang.String r0 = "component_logging_data"
            java.lang.Object r4 = r2.get(r0)
            if (r4 == 0) goto L_0x0cea
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r4 = (com.facebookpay.expresscheckout.logging.ComponentLoggingData) r4
            java.lang.String r0 = X.AnonymousClass7C6.A00()
            r5.A0T(r0, r7)
            X.C86104wH.A1G(r6, r5)
            X.5DE r3 = new X.5DE
            r3.<init>()
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "context_component_name"
            r3.A0A(r0, r1)
            X.AnonymousClass7Hr.A04(r3, r9)
            java.lang.String r0 = r4.A01
            X.C86124wJ.A1K(r3, r0)
            X.C86134wK.A1G(r3, r0)
            A05(r3, r5, r2)
            r5.Bb4()
            return
        L_0x0398:
            java.lang.String r1 = "submit_payment_container_success"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = "CREDENTIAL_ID"
            java.lang.Object r3 = r2.get(r1)
            boolean r1 = r3 instanceof java.lang.Long
            r10 = 0
            if (r1 == 0) goto L_0x0415
            java.lang.Number r3 = (java.lang.Number) r3
        L_0x03ad:
            java.lang.String r1 = "CREDENTIAL_TYPE"
            java.lang.Object r8 = r2.get(r1)
            boolean r1 = r8 instanceof X.C40307LcE
            if (r1 == 0) goto L_0x0413
            X.LcE r8 = (X.C40307LcE) r8
        L_0x03b9:
            java.lang.String r1 = "APPLIED_DISCOUNTS"
            java.lang.Object r12 = r2.get(r1)
            boolean r1 = r12 instanceof java.util.List
            if (r1 == 0) goto L_0x03c7
            java.util.List r12 = (java.util.List) r12
            if (r12 != 0) goto L_0x03c9
        L_0x03c7:
            X.0ZV r12 = X.AnonymousClass0ZV.A00
        L_0x03c9:
            java.lang.String r1 = "CONTAINER_IDS"
            java.lang.Object r11 = r2.get(r1)
            boolean r1 = r11 instanceof java.util.List
            if (r1 == 0) goto L_0x0411
            java.util.List r11 = (java.util.List) r11
        L_0x03d5:
            java.lang.String r1 = "VIEW_NAME"
            java.lang.Object r2 = r2.get(r1)
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L_0x03e2
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
        L_0x03e2:
            if (r8 == 0) goto L_0x0cf9
            if (r3 == 0) goto L_0x0cf9
            if (r10 == 0) goto L_0x0cf9
            long r14 = r3.longValue()
            r13 = 0
            X.AnonymousClass0wJ.A1Q(r8, r10)
            X.09x r2 = r0.A00
            java.lang.String r1 = "client_submit_ecppaymentcontainer_success"
            X.0A2 r2 = X.C86104wH.A0K(r2, r1)
            r1 = 401(0x191, float:5.62E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r2, r1)
            kotlin.jvm.internal.KtLambdaShape0S1500100_I2 r7 = new kotlin.jvm.internal.KtLambdaShape0S1500100_I2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            A04(r1, r9, r7)
            com.facebook.quicklog.QuickPerformanceLogger r2 = r0.A01
            r1 = 223884226(0xd5833c2, float:6.662244E-31)
            java.lang.String r0 = "CONTAINER_SUBMISSION_SUCCESS"
            r2.markerPoint(r1, r0)
            return
        L_0x0411:
            r11 = r10
            goto L_0x03d5
        L_0x0413:
            r8 = r10
            goto L_0x03b9
        L_0x0415:
            r3 = r10
            goto L_0x03ad
        L_0x0417:
            java.lang.String r3 = "user_click_ecpentry_atomic"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 2839(0xb17, float:3.978E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r4)
            if (r0 == 0) goto L_0x0cf9
            java.lang.String r0 = X.AnonymousClass7C6.A00()
            r4.A0T(r0, r7)
            java.lang.String r0 = "product_type"
            r4.A0O(r6, r0)
            java.lang.String r3 = "platform"
            java.lang.Object r1 = r2.get(r3)
            boolean r0 = r1 instanceof X.AnonymousClass28E
            if (r0 == 0) goto L_0x044b
            X.28E r1 = (X.AnonymousClass28E) r1
            if (r1 != 0) goto L_0x044d
        L_0x044b:
            X.28E r1 = X.AnonymousClass28E.ANDROID
        L_0x044d:
            java.lang.String r1 = r1.name()
            java.util.Locale r0 = java.util.Locale.US
            X.C04220Ms.A08(r0)
            java.lang.String r0 = X.C18220wO.A0u(r0, r1)
            X.28E r0 = X.AnonymousClass28E.valueOf(r0)
            r4.A0O(r0, r3)
            java.lang.Long r1 = X.C18200wM.A0c()
            java.lang.String r0 = "actual_event_time"
            r4.A0S(r0, r1)
            X.5D1 r1 = new X.5D1
            r1.<init>()
            X.AnonymousClass7Hr.A04(r1, r9)
            java.lang.String r0 = "ecp_checkout"
            X.C86134wK.A1G(r1, r0)
            A05(r1, r4, r2)
            r4.Bb4()
            return
        L_0x047e:
            java.lang.String r3 = "client_add_contactdetails_fail"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 175(0xaf, float:2.45E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.5Co r1 = new X.5Co
            r1.<init>()
            X.C86104wH.A1K(r1, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A06(r2)
            X.C86124wJ.A1K(r1, r0)
            X.AnonymousClass7Hr.A03(r1, r9)
            A05(r1, r3, r2)
            r3.Bb4()
            return
        L_0x04b1:
            java.lang.String r3 = "client_add_credential_fail"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 177(0xb1, float:2.48E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.5Cr r1 = A01(r2)
            X.AnonymousClass7Hr.A04(r1, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A06(r2)
            X.C86124wJ.A1K(r1, r0)
            A05(r1, r3, r2)
            r3.Bb4()
            return
        L_0x04e0:
            java.lang.String r5 = "client_remove_contact_fail"
            boolean r1 = r4.equals(r5)
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = X.AnonymousClass7Kr.A06(r2)
            X.5Cp r3 = new X.5Cp
            r3.<init>()
            X.AnonymousClass7Hr.A04(r3, r9)
            X.C86124wJ.A1K(r3, r1)
            X.6B8 r1 = X.AnonymousClass7Kr.A02(r1)
            A02(r1, r3, r2)
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r5)
            r0 = 382(0x17e, float:5.35E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x0cf9
            A05(r3, r1, r2)
            r1.Bb4()
            return
        L_0x0517:
            java.lang.String r3 = "client_load_fbpayui_success"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 305(0x131, float:4.27E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r5)
            if (r0 == 0) goto L_0x0cf9
            java.lang.String r0 = "component_logging_data"
            java.lang.Object r4 = r2.get(r0)
            if (r4 == 0) goto L_0x0cef
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r4 = (com.facebookpay.expresscheckout.logging.ComponentLoggingData) r4
            java.lang.String r0 = X.AnonymousClass7C6.A00()
            r5.A0T(r0, r7)
            X.C86104wH.A1G(r6, r5)
            X.5DE r3 = new X.5DE
            r3.<init>()
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "context_component_name"
            r3.A0A(r0, r1)
            X.AnonymousClass7Hr.A04(r3, r9)
            java.lang.String r0 = r4.A01
            X.C86124wJ.A1K(r3, r0)
            X.C86134wK.A1G(r3, r0)
            A05(r3, r5, r2)
            r5.Bb4()
            return
        L_0x0563:
            java.lang.String r3 = "user_add_contact_submit"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 2808(0xaf8, float:3.935E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r4)
            if (r0 == 0) goto L_0x0cf9
            java.lang.String r0 = X.AnonymousClass7Kr.A05(r2)
            X.5Cp r3 = new X.5Cp
            r3.<init>()
            X.AnonymousClass7Hr.A04(r3, r9)
            X.C86134wK.A1G(r3, r0)
            X.6B8 r1 = X.AnonymousClass7Kr.A01(r0)
            java.lang.String r0 = "contact_type"
            r3.A04(r1, r0)
            A05(r3, r4, r2)
            r4.Bb4()
            return
        L_0x059c:
            java.lang.String r3 = "user_edit_contact_enter"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 2864(0xb30, float:4.013E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r5)
            if (r0 == 0) goto L_0x0cf9
            java.lang.String r4 = X.AnonymousClass7Kr.A05(r2)
            X.5Cp r3 = new X.5Cp
            r3.<init>()
            X.AnonymousClass7Hr.A04(r3, r9)
            X.C86134wK.A1G(r3, r4)
            X.6B8 r1 = X.AnonymousClass7Kr.A01(r4)
            java.lang.String r0 = "contact_type"
            r3.A04(r1, r0)
            java.lang.String r0 = "edit_name"
            boolean r0 = X.C04220Ms.A0I(r4, r0)
            if (r0 != 0) goto L_0x05e9
            boolean r0 = X.AnonymousClass7Kr.A0E(r2)
            if (r0 == 0) goto L_0x05e9
            long r0 = X.AnonymousClass7Kr.A00(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "contact_id"
            r3.A09(r0, r1)
        L_0x05e9:
            A05(r3, r5, r2)
            r5.Bb4()
            return
        L_0x05f0:
            java.lang.String r3 = "user_click_contact_atomic"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 2828(0xb0c, float:3.963E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            java.lang.String r5 = X.AnonymousClass7Kr.A05(r2)
            X.5Cp r4 = new X.5Cp
            r4.<init>()
            X.AnonymousClass7Hr.A04(r4, r9)
            X.C86134wK.A1G(r4, r5)
            java.lang.String r0 = "select_existing_email"
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 != 0) goto L_0x0cb8
            java.lang.String r6 = "select_existing_phone"
            goto L_0x0cb2
        L_0x061f:
            java.lang.String r5 = "client_remove_contact_success"
            boolean r1 = r4.equals(r5)
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = X.AnonymousClass7Kr.A06(r2)
            X.5Cp r3 = new X.5Cp
            r3.<init>()
            X.AnonymousClass7Hr.A04(r3, r9)
            X.C86124wJ.A1K(r3, r1)
            X.6B8 r1 = X.AnonymousClass7Kr.A02(r1)
            A02(r1, r3, r2)
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r5)
            r0 = 383(0x17f, float:5.37E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x0cf9
            A05(r3, r1, r2)
            r1.Bb4()
            return
        L_0x0656:
            java.lang.String r3 = "client_add_contact_fail"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 173(0xad, float:2.42E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r4)
            if (r0 == 0) goto L_0x0cf9
            X.5Cp r3 = new X.5Cp
            r3.<init>()
            X.AnonymousClass7Hr.A04(r3, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A06(r2)
            X.C86124wJ.A1K(r3, r0)
            java.lang.String r0 = X.AnonymousClass7Kr.A06(r2)
            X.6B8 r1 = X.AnonymousClass7Kr.A02(r0)
            java.lang.String r0 = "contact_type"
            r3.A04(r1, r0)
            A05(r3, r4, r2)
            r4.Bb4()
            return
        L_0x0693:
            java.lang.String r3 = "client_add_shippingaddressdetails_fail"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 199(0xc7, float:2.79E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.5DZ r1 = new X.5DZ
            r1.<init>()
            X.C86104wH.A1K(r1, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A06(r2)
            X.C86124wJ.A1K(r1, r0)
            X.AnonymousClass7Hr.A03(r1, r9)
            A05(r1, r3, r2)
            r3.Bb4()
            return
        L_0x06c6:
            java.lang.String r3 = "user_add_credential_submit"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 2811(0xafb, float:3.939E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.5Cr r1 = A01(r2)
            X.AnonymousClass7Hr.A04(r1, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A05(r2)
            X.C86134wK.A1G(r1, r0)
            A05(r1, r3, r2)
            r3.Bb4()
            return
        L_0x06f5:
            java.lang.String r5 = "client_edit_credential_success"
            boolean r1 = r4.equals(r5)
            if (r1 == 0) goto L_0x005f
            X.5Cr r4 = new X.5Cr
            r4.<init>()
            X.Lce r1 = X.C40324Lce.A02
            X.C86164wN.A1B(r1, r4)
            X.AnonymousClass7Hr.A04(r4, r9)
            java.lang.String r3 = X.AnonymousClass7Kr.A06(r2)
            java.lang.String r1 = "view_name"
            A06(r4, r1, r3, r2)
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r5)
            r0 = 224(0xe0, float:3.14E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x0cf9
            A05(r4, r1, r2)
            r1.Bb4()
            return
        L_0x072c:
            java.lang.String r1 = "submit_payment_container_init"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = "CREDENTIAL_ID"
            java.lang.Object r7 = r2.get(r1)
            boolean r1 = r7 instanceof java.lang.Long
            r6 = 0
            if (r1 == 0) goto L_0x078e
            java.lang.Number r7 = (java.lang.Number) r7
        L_0x0741:
            java.lang.String r1 = "CREDENTIAL_TYPE"
            java.lang.Object r5 = r2.get(r1)
            boolean r1 = r5 instanceof X.C40307LcE
            if (r1 == 0) goto L_0x078c
            X.LcE r5 = (X.C40307LcE) r5
        L_0x074d:
            java.lang.String r1 = "APPLIED_DISCOUNTS"
            java.lang.Object r4 = r2.get(r1)
            boolean r1 = r4 instanceof java.util.List
            if (r1 == 0) goto L_0x075b
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x075d
        L_0x075b:
            X.0ZV r4 = X.AnonymousClass0ZV.A00
        L_0x075d:
            java.lang.String r1 = "CONTAINER_IDS"
            java.lang.Object r3 = r2.get(r1)
            boolean r1 = r3 instanceof java.util.List
            if (r1 == 0) goto L_0x078a
            java.util.List r3 = (java.util.List) r3
        L_0x0769:
            java.lang.String r1 = "VIEW_NAME"
            java.lang.Object r2 = r2.get(r1)
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L_0x0776
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
        L_0x0776:
            if (r5 == 0) goto L_0x0cf9
            if (r7 == 0) goto L_0x0cf9
            if (r6 == 0) goto L_0x0cf9
            long r14 = r7.longValue()
            r13 = 0
            r7 = r0
            r8 = r5
            r10 = r6
            r11 = r4
            r12 = r3
            r7.A09(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x078a:
            r3 = r6
            goto L_0x0769
        L_0x078c:
            r5 = r6
            goto L_0x074d
        L_0x078e:
            r7 = r6
            goto L_0x0741
        L_0x0790:
            java.lang.String r1 = "submit_payment_container_fail"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = "CREDENTIAL_ID"
            java.lang.Object r3 = r2.get(r1)
            boolean r1 = r3 instanceof java.lang.Long
            r10 = 0
            if (r1 == 0) goto L_0x0814
            java.lang.Number r3 = (java.lang.Number) r3
        L_0x07a5:
            java.lang.String r1 = "CREDENTIAL_TYPE"
            java.lang.Object r8 = r2.get(r1)
            boolean r1 = r8 instanceof X.C40307LcE
            if (r1 == 0) goto L_0x0812
            X.LcE r8 = (X.C40307LcE) r8
        L_0x07b1:
            java.lang.String r1 = "APPLIED_DISCOUNTS"
            java.lang.Object r13 = r2.get(r1)
            boolean r1 = r13 instanceof java.util.List
            if (r1 == 0) goto L_0x07bf
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L_0x07c1
        L_0x07bf:
            X.0ZV r13 = X.AnonymousClass0ZV.A00
        L_0x07c1:
            java.lang.String r1 = "CONTAINER_IDS"
            java.lang.Object r12 = r2.get(r1)
            boolean r1 = r12 instanceof java.util.List
            if (r1 == 0) goto L_0x0810
            java.util.List r12 = (java.util.List) r12
        L_0x07cd:
            r1 = 48
            java.lang.String r1 = X.C18170wI.A00(r1)
            java.lang.Object r11 = r2.get(r1)
            boolean r1 = r11 instanceof java.lang.String
            if (r1 == 0) goto L_0x080e
            java.lang.String r11 = (java.lang.String) r11
        L_0x07dd:
            java.lang.String r1 = "VIEW_NAME"
            java.lang.Object r2 = r2.get(r1)
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L_0x07ea
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
        L_0x07ea:
            if (r8 == 0) goto L_0x0cf9
            if (r3 == 0) goto L_0x0cf9
            if (r11 == 0) goto L_0x0cf9
            if (r10 == 0) goto L_0x0cf9
            long r15 = r3.longValue()
            r14 = 0
            X.09x r1 = r0.A00
            java.lang.String r0 = "client_submit_ecppaymentcontainer_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 399(0x18f, float:5.59E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            X.8Jh r7 = new X.8Jh
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            A04(r0, r9, r7)
            return
        L_0x080e:
            r11 = r10
            goto L_0x07dd
        L_0x0810:
            r12 = r10
            goto L_0x07cd
        L_0x0812:
            r8 = r10
            goto L_0x07b1
        L_0x0814:
            r3 = r10
            goto L_0x07a5
        L_0x0816:
            java.lang.String r3 = "client_load_credential_success"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 263(0x107, float:3.69E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            java.lang.String r5 = X.AnonymousClass7Kr.A06(r2)
            X.5Cr r4 = new X.5Cr
            r4.<init>()
            java.lang.String r0 = "CREDENTIAL_TYPE"
            java.lang.Object r1 = r2.get(r0)
            boolean r0 = r1 instanceof X.C40307LcE
            if (r0 == 0) goto L_0x0841
            X.LcE r1 = (X.C40307LcE) r1
            if (r1 != 0) goto L_0x0843
        L_0x0841:
            X.LcE r1 = X.C40307LcE.A02
        L_0x0843:
            X.Lce r0 = X.AnonymousClass7Kr.A03(r1)
            X.C86164wN.A1B(r0, r4)
            X.AnonymousClass7Hr.A04(r4, r9)
            X.C86124wJ.A1K(r4, r5)
            java.lang.String r0 = "edit_card"
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 != 0) goto L_0x0860
            java.lang.String r0 = "selected_credential"
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 == 0) goto L_0x0ccb
        L_0x0860:
            boolean r0 = X.AnonymousClass7Kr.A0E(r2)
            if (r0 == 0) goto L_0x0ccb
            long r0 = X.AnonymousClass7Kr.A00(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "credential_id"
            goto L_0x0cc8
        L_0x0872:
            java.lang.String r5 = "user_remove_contact_enter"
            boolean r1 = r4.equals(r5)
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = X.AnonymousClass7Kr.A05(r2)
            X.5Cp r3 = new X.5Cp
            r3.<init>()
            X.AnonymousClass7Hr.A04(r3, r9)
            X.C86134wK.A1G(r3, r1)
            X.6B8 r1 = X.AnonymousClass7Kr.A01(r1)
            A02(r1, r3, r2)
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r5)
            r0 = 2883(0xb43, float:4.04E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x0cf9
            A05(r3, r1, r2)
            r1.Bb4()
            return
        L_0x08a9:
            java.lang.String r5 = "user_edit_credential_submit"
            boolean r1 = r4.equals(r5)
            if (r1 == 0) goto L_0x005f
            X.5Cr r4 = new X.5Cr
            r4.<init>()
            X.Lce r1 = X.C40324Lce.A02
            X.C86164wN.A1B(r1, r4)
            X.AnonymousClass7Hr.A04(r4, r9)
            java.lang.String r3 = X.AnonymousClass7Kr.A05(r2)
            java.lang.String r1 = "target_name"
            A06(r4, r1, r3, r2)
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r5)
            r0 = 2867(0xb33, float:4.018E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x0cf9
            A05(r4, r1, r2)
            r1.Bb4()
            return
        L_0x08e0:
            java.lang.String r3 = "user_add_contact_enter"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 2807(0xaf7, float:3.933E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r4)
            if (r0 == 0) goto L_0x0cf9
            java.lang.String r0 = X.AnonymousClass7Kr.A05(r2)
            X.5Cp r3 = new X.5Cp
            r3.<init>()
            X.AnonymousClass7Hr.A04(r3, r9)
            X.C86134wK.A1G(r3, r0)
            X.6B8 r1 = X.AnonymousClass7Kr.A01(r0)
            java.lang.String r0 = "contact_type"
            r3.A04(r1, r0)
            A05(r3, r4, r2)
            r4.Bb4()
            return
        L_0x0919:
            java.lang.String r5 = "client_remove_credential_fail"
            boolean r1 = r4.equals(r5)
            if (r1 == 0) goto L_0x005f
            X.5Cr r4 = A01(r2)
            X.AnonymousClass7Hr.A04(r4, r9)
            java.lang.String r3 = X.AnonymousClass7Kr.A06(r2)
            java.lang.String r1 = "view_name"
            A06(r4, r1, r3, r2)
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r5)
            r0 = 384(0x180, float:5.38E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x0cf9
            A05(r4, r1, r2)
            r1.Bb4()
            return
        L_0x094a:
            java.lang.String r3 = "user_remove_contact_submit"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 2884(0xb44, float:4.041E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            java.lang.String r0 = X.AnonymousClass7Kr.A05(r2)
            X.5Cp r1 = new X.5Cp
            r1.<init>()
            X.AnonymousClass7Hr.A04(r1, r9)
            X.C86134wK.A1G(r1, r0)
            X.6B8 r0 = X.AnonymousClass7Kr.A01(r0)
            A02(r0, r1, r2)
            A05(r1, r3, r2)
            r3.Bb4()
            return
        L_0x0981:
            java.lang.String r5 = "user_edit_credential_enter"
            boolean r1 = r4.equals(r5)
            if (r1 == 0) goto L_0x005f
            X.5Cr r4 = new X.5Cr
            r4.<init>()
            X.Lce r1 = X.C40324Lce.A02
            X.C86164wN.A1B(r1, r4)
            X.AnonymousClass7Hr.A04(r4, r9)
            java.lang.String r3 = X.AnonymousClass7Kr.A05(r2)
            java.lang.String r1 = "target_name"
            A06(r4, r1, r3, r2)
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r5)
            r0 = 2866(0xb32, float:4.016E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x0cf9
            java.lang.String r0 = X.AnonymousClass7C6.A00()
            r1.A0T(r0, r7)
            X.C86104wH.A1G(r6, r1)
            A05(r4, r1, r2)
            r1.Bb4()
            return
        L_0x09c2:
            java.lang.String r3 = "client_add_shippingaddressdetails_success"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 200(0xc8, float:2.8E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.5DZ r1 = new X.5DZ
            r1.<init>()
            X.C86104wH.A1K(r1, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A06(r2)
            X.C86124wJ.A1K(r1, r0)
            X.AnonymousClass7Hr.A03(r1, r9)
            A05(r1, r3, r2)
            r3.Bb4()
            return
        L_0x09f5:
            java.lang.String r3 = "user_remove_contact_cancel"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 2882(0xb42, float:4.039E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            java.lang.String r0 = X.AnonymousClass7Kr.A05(r2)
            X.5Cp r1 = new X.5Cp
            r1.<init>()
            X.AnonymousClass7Hr.A04(r1, r9)
            X.C86134wK.A1G(r1, r0)
            X.6B8 r0 = X.AnonymousClass7Kr.A01(r0)
            A02(r0, r1, r2)
            A05(r1, r3, r2)
            r3.Bb4()
            return
        L_0x0a2c:
            java.lang.String r3 = "user_click_shippingaddressdetails_atomic"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 2857(0xb29, float:4.004E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.5DZ r1 = new X.5DZ
            r1.<init>()
            X.C86104wH.A1K(r1, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A05(r2)
            X.C86134wK.A1G(r1, r0)
            X.AnonymousClass7Hr.A03(r1, r9)
            A05(r1, r3, r2)
            r3.Bb4()
            return
        L_0x0a5f:
            java.lang.String r3 = "user_click_credential_atomic"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 2830(0xb0e, float:3.966E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            java.lang.String r5 = X.AnonymousClass7Kr.A05(r2)
            X.5Cr r4 = new X.5Cr
            r4.<init>()
            java.lang.String r0 = "CREDENTIAL_TYPE"
            java.lang.Object r1 = r2.get(r0)
            boolean r0 = r1 instanceof X.C40307LcE
            if (r0 == 0) goto L_0x0a8a
            X.LcE r1 = (X.C40307LcE) r1
            if (r1 != 0) goto L_0x0a8c
        L_0x0a8a:
            X.LcE r1 = X.C40307LcE.A02
        L_0x0a8c:
            X.Lce r0 = X.AnonymousClass7Kr.A03(r1)
            X.C86164wN.A1B(r0, r4)
            X.AnonymousClass7Hr.A04(r4, r9)
            X.C86134wK.A1G(r4, r5)
            java.lang.String r0 = "add_payment_info"
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 != 0) goto L_0x0aae
            boolean r0 = X.AnonymousClass7Kr.A0E(r2)
            if (r0 == 0) goto L_0x0aae
            long r0 = X.AnonymousClass7Kr.A00(r2)
            X.C86164wN.A1D(r4, r0)
        L_0x0aae:
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.C86114wI.A1C(r3, r4)
            goto L_0x0cd4
        L_0x0ab9:
            java.lang.String r3 = "user_focus_fbpayui_atomic"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 2877(0xb3d, float:4.032E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r5)
            if (r0 == 0) goto L_0x0cf9
            java.lang.String r0 = "component_logging_data"
            java.lang.Object r4 = r2.get(r0)
            if (r4 == 0) goto L_0x0cf4
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r4 = (com.facebookpay.expresscheckout.logging.ComponentLoggingData) r4
            java.lang.String r0 = X.AnonymousClass7C6.A00()
            r5.A0T(r0, r7)
            X.C86104wH.A1G(r6, r5)
            X.5DE r3 = new X.5DE
            r3.<init>()
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "context_component_name"
            r3.A0A(r0, r1)
            X.AnonymousClass7Hr.A04(r3, r9)
            java.lang.String r0 = r4.A01
            X.C86134wK.A1G(r3, r0)
            A05(r3, r5, r2)
            r5.Bb4()
            return
        L_0x0b02:
            java.lang.String r3 = "user_add_credential_enter"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 2809(0xaf9, float:3.936E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.5Cr r1 = A01(r2)
            X.AnonymousClass7Hr.A04(r1, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A05(r2)
            X.C86134wK.A1G(r1, r0)
            A05(r1, r3, r2)
            r3.Bb4()
            return
        L_0x0b31:
            java.lang.String r1 = "client_add_credentialdetails_atomic"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x005f
            X.09x r1 = r0.A00
            java.lang.String r0 = "user_click_credentialdetails_atomic"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 2831(0xb0f, float:3.967E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.5Cq r1 = new X.5Cq
            r1.<init>()
            X.C86104wH.A1K(r1, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A05(r2)
            X.C86134wK.A1G(r1, r0)
            X.AnonymousClass7Hr.A03(r1, r9)
            A05(r1, r3, r2)
            r3.Bb4()
            return
        L_0x0b66:
            java.lang.String r3 = "user_edit_contact_submit"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 2865(0xb31, float:4.015E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r5)
            if (r0 == 0) goto L_0x0cf9
            java.lang.String r4 = X.AnonymousClass7Kr.A05(r2)
            X.5Cp r3 = new X.5Cp
            r3.<init>()
            X.AnonymousClass7Hr.A04(r3, r9)
            X.C86134wK.A1G(r3, r4)
            X.6B8 r1 = X.AnonymousClass7Kr.A01(r4)
            java.lang.String r0 = "contact_type"
            r3.A04(r1, r0)
            java.lang.String r0 = "edit_name_save"
            boolean r0 = X.C04220Ms.A0I(r4, r0)
            if (r0 != 0) goto L_0x0bb3
            boolean r0 = X.AnonymousClass7Kr.A0E(r2)
            if (r0 == 0) goto L_0x0bb3
            long r0 = X.AnonymousClass7Kr.A00(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "contact_id"
            r3.A09(r0, r1)
        L_0x0bb3:
            A05(r3, r5, r2)
            r5.Bb4()
            return
        L_0x0bba:
            java.lang.String r3 = "client_add_credentialdetails_fail"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 179(0xb3, float:2.51E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.5Cq r1 = new X.5Cq
            r1.<init>()
            X.C86104wH.A1K(r1, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A06(r2)
            X.C86124wJ.A1K(r1, r0)
            X.AnonymousClass7Hr.A03(r1, r9)
            A05(r1, r3, r2)
            r3.Bb4()
            return
        L_0x0bed:
            java.lang.String r3 = "client_add_contactdetails_success"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 176(0xb0, float:2.47E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.5Co r1 = new X.5Co
            r1.<init>()
            X.C86104wH.A1K(r1, r9)
            java.lang.String r0 = X.AnonymousClass7Kr.A06(r2)
            X.C86124wJ.A1K(r1, r0)
            X.AnonymousClass7Hr.A03(r1, r9)
            X.C86114wI.A1C(r3, r1)
            goto L_0x0cd4
        L_0x0c1e:
            java.lang.String r3 = "client_edit_contact_success"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 222(0xde, float:3.11E-43)
            goto L_0x0c8c
        L_0x0c2f:
            java.lang.String r3 = "client_load_contact_success"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 260(0x104, float:3.64E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            java.lang.String r5 = X.AnonymousClass7Kr.A06(r2)
            X.5Cp r4 = new X.5Cp
            r4.<init>()
            X.AnonymousClass7Hr.A04(r4, r9)
            X.C86124wJ.A1K(r4, r5)
            java.lang.String r6 = "selected_contact"
            boolean r0 = X.C04220Ms.A0I(r5, r6)
            if (r0 != 0) goto L_0x0c6b
            java.lang.String r0 = "nux_contact"
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 != 0) goto L_0x0c6b
            X.6B8 r1 = X.AnonymousClass7Kr.A02(r5)
            java.lang.String r0 = "contact_type"
            r4.A04(r1, r0)
        L_0x0c6b:
            java.lang.String r0 = "edit_email"
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 != 0) goto L_0x0cb8
            java.lang.String r0 = "edit_phone"
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 != 0) goto L_0x0cb8
            goto L_0x0cb2
        L_0x0c7c:
            java.lang.String r3 = "client_edit_contact_fail"
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x005f
            X.09x r0 = r0.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r3)
            r0 = 221(0xdd, float:3.1E-43)
        L_0x0c8c:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            java.lang.String r5 = X.AnonymousClass7Kr.A06(r2)
            X.5Cp r4 = new X.5Cp
            r4.<init>()
            X.AnonymousClass7Hr.A04(r4, r9)
            X.C86124wJ.A1K(r4, r5)
            X.6B8 r1 = X.AnonymousClass7Kr.A02(r5)
            java.lang.String r0 = "contact_type"
            r4.A04(r1, r0)
            java.lang.String r0 = "edit_email"
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 != 0) goto L_0x0cb8
            java.lang.String r6 = "edit_phone"
        L_0x0cb2:
            boolean r0 = X.C04220Ms.A0I(r5, r6)
            if (r0 == 0) goto L_0x0ccb
        L_0x0cb8:
            boolean r0 = X.AnonymousClass7Kr.A0E(r2)
            if (r0 == 0) goto L_0x0ccb
            long r0 = X.AnonymousClass7Kr.A00(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "contact_id"
        L_0x0cc8:
            r4.A09(r0, r1)
        L_0x0ccb:
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0cf9
            X.C86114wI.A1C(r3, r4)
        L_0x0cd4:
            boolean r0 = X.AnonymousClass7Kr.A0F(r2)
            if (r0 == 0) goto L_0x0ce1
            java.util.Map r0 = X.AnonymousClass7Kr.A0A(r2)
            r3.A1g(r0)
        L_0x0ce1:
            r3.Bb4()
            return
        L_0x0ce5:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0cea:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0cef:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0cf4:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0cf9:
            return
        L_0x0cfa:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0cff:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128957ke.Bb8(java.lang.String, java.util.Map):void");
    }

    public static AnonymousClass5Cr A01(Map map) {
        C40307LcE lcE;
        AnonymousClass5Cr r2 = new AnonymousClass5Cr();
        Object obj = map.get("CREDENTIAL_TYPE");
        if (!(obj instanceof C40307LcE) || (lcE = (C40307LcE) obj) == null) {
            lcE = C40307LcE.A02;
        }
        r2.A04(AnonymousClass7Kr.A03(lcE), "credential_type");
        return r2;
    }

    public static void A02(C021109v r1, AnonymousClass0V3 r2, Map map) {
        r2.A04(r1, "contact_type");
        if (AnonymousClass7Kr.A0E(map)) {
            r2.A09("contact_id", Long.valueOf(AnonymousClass7Kr.A00(map)));
        }
    }

    public static void A03(C021409z r1, LoggingContext loggingContext, Object obj, String str, int i) {
        A04(r1, loggingContext, new KtLambdaShape3S1200000_I2(loggingContext, obj, str, i));
    }

    public static void A05(AnonymousClass0V3 r1, USLEBaseShape0S0000000 uSLEBaseShape0S0000000, Map map) {
        uSLEBaseShape0S0000000.A0P(r1, "event_payload");
        if (AnonymousClass7Kr.A0F(map)) {
            uSLEBaseShape0S0000000.A1g(AnonymousClass7Kr.A0A(map));
        }
    }

    public final void A07(AnonymousClass6B4 r8, LoggingContext loggingContext, Map map) {
        C04220Ms.A0B(r8, 2);
        A04(C18180wK.A0I(C86104wH.A0K(this.A00, "user_click_ecpautofill_atomic"), 2834), loggingContext, new KtLambdaShape3S1300000_I2((Object) r8, (Object) map, (Object) loggingContext, "shipping_address_suggestion", 5));
    }

    public final void A08(AnonymousClass6B4 r8, LoggingContext loggingContext, Map map) {
        C04220Ms.A0B(r8, 2);
        A04(C18180wK.A0I(C86104wH.A0K(this.A00, "client_load_ecpautofill_success"), 273), loggingContext, new KtLambdaShape3S1300000_I2((Object) r8, (Object) map, (Object) loggingContext, "nux_checkout", 15));
    }

    public final void A0A(C40307LcE lcE, LoggingContext loggingContext, Map map, long j) {
        boolean A1X = C18240wQ.A1X(lcE);
        A04(C18180wK.A0I(C86104wH.A0K(this.A00, "client_add_ecppaymentcontainer_fail"), 185), loggingContext, new KtLambdaShape0S1300100_I2(loggingContext, lcE, map, "checkout", A1X ? 1 : 0, j));
    }

    public final void A0B(LoggingContext loggingContext, Long l, String str, Map map) {
        A04(C18180wK.A0I(C86104wH.A0K(this.A00, "user_click_shippingaddress_atomic"), 2856), loggingContext, new KtLambdaShape3S1300000_I2(loggingContext, l, str, map, 7));
    }

    public final void A0D(LoggingContext loggingContext, Long l, Map map) {
        A04(C18180wK.A0I(C86104wH.A0K(this.A00, "user_remove_shippingaddress_cancel"), 2889), loggingContext, new KtLambdaShape3S1300000_I2(loggingContext, l, "remove_shipping_address_cancel", map, 22));
    }

    public final void A0E(LoggingContext loggingContext, Long l, Map map) {
        A04(C18180wK.A0I(C86104wH.A0K(this.A00, "user_remove_shippingaddress_enter"), 2890), loggingContext, new KtLambdaShape3S1300000_I2(loggingContext, l, "remove_shipping_address", map, 23));
    }

    public final void A0F(LoggingContext loggingContext, Long l, Map map) {
        A04(C18180wK.A0I(C86104wH.A0K(this.A00, "user_remove_shippingaddress_submit"), 2891), loggingContext, new KtLambdaShape3S1300000_I2(loggingContext, l, "remove_shipping_address_save", map, 25));
    }

    public final void A0G(LoggingContext loggingContext, String str, List list, Map map, boolean z) {
        Map map2 = map;
        A04(C18180wK.A0I(C86104wH.A0K(this.A00, "client_load_ecpcheckoutcomponent_init"), 280), loggingContext, new KtLambdaShape0S2310000_I2(loggingContext, map2, list, str, "checkout", 2, z));
    }

    public final void A0H(LoggingContext loggingContext, String str, Map map) {
        A03(C18180wK.A0I(C86104wH.A0K(this.A00, "user_click_ecpcheckout_exit"), 2837), loggingContext, map, str, 13);
    }

    public final void A0I(LoggingContext loggingContext, String str, Map map) {
        A03(C18180wK.A0I(C86104wH.A0K(this.A00, "client_load_ecpcheckout_init"), 277), loggingContext, map, str, 27);
    }

    public C128957ke(C021209x r1, QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = r1;
        this.A01 = quickPerformanceLogger;
    }

    public static void A06(AnonymousClass0V3 r2, String str, String str2, Map map) {
        r2.A0A(str, str2);
        if (AnonymousClass7Kr.A0E(map)) {
            r2.A09("credential_id", Long.valueOf(AnonymousClass7Kr.A00(map)));
        }
    }

    public final void A0J(LoggingContext loggingContext, String str, Map map) {
        A03(C18180wK.A0I(C86104wH.A0K(A00(this, str), "client_load_ecpotc_init"), 290), loggingContext, map, str, 33);
    }
}
