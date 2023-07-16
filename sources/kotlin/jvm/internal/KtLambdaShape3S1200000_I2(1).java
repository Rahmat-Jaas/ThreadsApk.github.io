package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape3S1200000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S1200000_I2(Object obj, Object obj2, String str, int i) {
        super(1);
        this.A03 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A00 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0061, code lost:
        X.C86104wH.A1K(r2, r1);
        X.C86124wJ.A1K(r2, r4.A02);
        r1 = X.AnonymousClass7Hr.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b6, code lost:
        r1 = (com.fbpay.logging.LoggingContext) r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ba, code lost:
        X.AnonymousClass7Hr.A04(r2, r1);
        r1 = r4.A02;
        r0 = "target_name";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00da, code lost:
        if (r1 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00dc, code lost:
        r2.A06(r1, "logging_policy");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f2, code lost:
        X.AnonymousClass7Hr.A04(r2, (com.fbpay.logging.LoggingContext) r4.A01);
        r1 = r4.A02;
        r0 = "view_name";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0131, code lost:
        X.AnonymousClass7Hr.A04(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0143, code lost:
        r1 = r4.A02;
        r0 = "target_name";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0147, code lost:
        r2.A0A(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x014a, code lost:
        X.C86114wI.A1C(r5, r2);
        X.C86114wI.A1G(r5, r4.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0152, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        X.AnonymousClass7Hr.A04(r2, (com.fbpay.logging.LoggingContext) r4.A01);
        r1 = r4.A02;
        r0 = "view_name";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01ca, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r2.A0A(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        X.C86114wI.A1C(r5, r2);
        X.C86114wI.A1G(r5, r4.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.A03
            switch(r0) {
                case 0: goto L_0x019b;
                case 1: goto L_0x0189;
                case 2: goto L_0x0177;
                case 3: goto L_0x0165;
                case 4: goto L_0x0153;
                case 5: goto L_0x00c3;
                case 6: goto L_0x00c3;
                case 7: goto L_0x00af;
                case 8: goto L_0x00a6;
                case 9: goto L_0x00af;
                case 10: goto L_0x0093;
                case 11: goto L_0x0093;
                case 12: goto L_0x008b;
                case 13: goto L_0x008b;
                case 14: goto L_0x0135;
                case 15: goto L_0x011f;
                case 16: goto L_0x0113;
                case 17: goto L_0x00fe;
                case 18: goto L_0x0083;
                case 19: goto L_0x0083;
                case 20: goto L_0x0076;
                case 21: goto L_0x0076;
                case 22: goto L_0x00c3;
                case 23: goto L_0x00c3;
                case 24: goto L_0x00eb;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x0005;
                case 28: goto L_0x0005;
                case 29: goto L_0x00e3;
                case 30: goto L_0x006e;
                case 31: goto L_0x006e;
                case 32: goto L_0x004f;
                case 33: goto L_0x004f;
                case 34: goto L_0x0043;
                case 35: goto L_0x0043;
                case 36: goto L_0x0043;
                case 37: goto L_0x003b;
                case 38: goto L_0x003b;
                case 39: goto L_0x003b;
                case 40: goto L_0x0033;
                case 41: goto L_0x0033;
                case 42: goto L_0x0033;
                case 43: goto L_0x002b;
                case 44: goto L_0x002b;
                case 45: goto L_0x0023;
                case 46: goto L_0x0023;
                case 47: goto L_0x0023;
                case 48: goto L_0x00a6;
                case 49: goto L_0x00a6;
                default: goto L_0x0005;
            }
        L_0x0005:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5Cy r2 = new X.5Cy
            r2.<init>()
        L_0x000c:
            java.lang.Object r0 = r4.A01
            com.fbpay.logging.LoggingContext r0 = (com.fbpay.logging.LoggingContext) r0
            X.AnonymousClass7Hr.A04(r2, r0)
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "view_name"
        L_0x0017:
            r2.A0A(r0, r1)
        L_0x001a:
            X.C86114wI.A1C(r5, r2)
            java.lang.Object r0 = r4.A00
            X.C86114wI.A1G(r5, r0)
            return r5
        L_0x0023:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5DU r2 = new X.5DU
            r2.<init>()
            goto L_0x000c
        L_0x002b:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5DT r2 = new X.5DT
            r2.<init>()
            goto L_0x000c
        L_0x0033:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5DO r2 = new X.5DO
            r2.<init>()
            goto L_0x000c
        L_0x003b:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5DI r2 = new X.5DI
            r2.<init>()
            goto L_0x000c
        L_0x0043:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5DB r2 = new X.5DB
            r2.<init>()
            java.lang.Object r1 = r4.A01
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
            goto L_0x0061
        L_0x004f:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            java.lang.Object r1 = r4.A01
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
            X.6BP r0 = X.AnonymousClass6BP.A00(r5, r1)
            X.C86104wH.A1G(r0, r5)
            X.5D3 r2 = new X.5D3
            r2.<init>()
        L_0x0061:
            X.C86104wH.A1K(r2, r1)
            java.lang.String r0 = r4.A02
            X.C86124wJ.A1K(r2, r0)
            X.5Cb r1 = X.AnonymousClass7Hr.A00(r1)
            goto L_0x00dc
        L_0x006e:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5DA r2 = new X.5DA
            r2.<init>()
            goto L_0x000c
        L_0x0076:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5Cr r2 = new X.5Cr
            r2.<init>()
            X.Lce r0 = X.C40324Lce.A03
            X.C86164wN.A1B(r0, r2)
            goto L_0x000c
        L_0x0083:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5Cp r2 = new X.5Cp
            r2.<init>()
            goto L_0x000c
        L_0x008b:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5Cy r2 = new X.5Cy
            r2.<init>()
            goto L_0x00b6
        L_0x0093:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            java.lang.Object r1 = r4.A01
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
            X.6BP r0 = X.AnonymousClass6BP.A00(r5, r1)
            X.C86104wH.A1G(r0, r5)
            X.5Cm r2 = new X.5Cm
            r2.<init>()
            goto L_0x00ba
        L_0x00a6:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5Da r2 = new X.5Da
            r2.<init>()
            goto L_0x000c
        L_0x00af:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5Da r2 = new X.5Da
            r2.<init>()
        L_0x00b6:
            java.lang.Object r1 = r4.A01
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
        L_0x00ba:
            X.AnonymousClass7Hr.A04(r2, r1)
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "target_name"
            goto L_0x0017
        L_0x00c3:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5D9 r2 = new X.5D9
            r2.<init>()
            java.lang.Object r1 = r4.A01
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
            X.C86104wH.A1K(r2, r1)
            java.lang.String r0 = r4.A02
            X.C86124wJ.A1K(r2, r0)
            X.5Cb r1 = X.AnonymousClass7Hr.A00(r1)
            if (r1 == 0) goto L_0x001a
        L_0x00dc:
            java.lang.String r0 = "logging_policy"
            r2.A06(r1, r0)
            goto L_0x001a
        L_0x00e3:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5Cz r2 = new X.5Cz
            r2.<init>()
            goto L_0x00f2
        L_0x00eb:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5Cw r2 = new X.5Cw
            r2.<init>()
        L_0x00f2:
            java.lang.Object r0 = r4.A01
            com.fbpay.logging.LoggingContext r0 = (com.fbpay.logging.LoggingContext) r0
            X.AnonymousClass7Hr.A04(r2, r0)
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "view_name"
            goto L_0x0147
        L_0x00fe:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5DT r2 = new X.5DT
            r2.<init>()
            java.lang.Object r0 = r4.A01
            com.fbpay.logging.LoggingContext r0 = (com.fbpay.logging.LoggingContext) r0
            X.AnonymousClass7Hr.A04(r2, r0)
            java.lang.String r1 = r4.A02
            if (r1 == 0) goto L_0x014a
            java.lang.String r0 = "autofill_service"
            goto L_0x0147
        L_0x0113:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5DO r2 = new X.5DO
            r2.<init>()
            java.lang.Object r1 = r4.A01
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
            goto L_0x0131
        L_0x011f:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            java.lang.Object r1 = r4.A01
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
            X.6BP r0 = X.AnonymousClass6BP.A00(r5, r1)
            X.C86104wH.A1G(r0, r5)
            X.5D1 r2 = new X.5D1
            r2.<init>()
        L_0x0131:
            X.AnonymousClass7Hr.A04(r2, r1)
            goto L_0x0143
        L_0x0135:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5D0 r2 = new X.5D0
            r2.<init>()
            java.lang.Object r0 = r4.A01
            com.fbpay.logging.LoggingContext r0 = (com.fbpay.logging.LoggingContext) r0
            X.C86104wH.A1K(r2, r0)
        L_0x0143:
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "target_name"
        L_0x0147:
            r2.A0A(r0, r1)
        L_0x014a:
            X.C86114wI.A1C(r5, r2)
            java.lang.Object r0 = r4.A00
            X.C86114wI.A1G(r5, r0)
            return r5
        L_0x0153:
            X.8mi r3 = X.C86104wH.A0N(r5)
            java.lang.String r2 = r4.A02
            java.lang.Object r1 = r4.A00
            X.LyC r1 = (X.C41173LyC) r1
            java.lang.Object r0 = r4.A01
            java.util.Map r0 = (java.util.Map) r0
            r3.CYI(r1, r2, r0)
            goto L_0x01c8
        L_0x0165:
            X.8mi r3 = X.C86104wH.A0N(r5)
            java.lang.String r2 = r4.A02
            java.lang.Object r1 = r4.A00
            X.LyC r1 = (X.C41173LyC) r1
            java.lang.Object r0 = r4.A01
            java.util.Map r0 = (java.util.Map) r0
            r3.CWE(r1, r2, r0)
            goto L_0x01c8
        L_0x0177:
            X.8mi r3 = X.C86104wH.A0N(r5)
            java.lang.Object r2 = r4.A01
            X.Lbs r2 = (X.C40289Lbs) r2
            java.lang.String r1 = r4.A02
            java.lang.Object r0 = r4.A00
            java.util.Map r0 = (java.util.Map) r0
            r3.AL9(r2, r1, r0)
            goto L_0x01c8
        L_0x0189:
            X.8mi r3 = X.C86104wH.A0N(r5)
            java.lang.Object r2 = r4.A01
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r1 = r4.A02
            java.lang.Object r0 = r4.A00
            java.util.Map r0 = (java.util.Map) r0
            r3.AGA(r1, r2, r0)
            goto L_0x01c8
        L_0x019b:
            X.8mv r3 = X.C86124wJ.A0Q(r5)
            java.lang.String r1 = r4.A02
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.77Z r0 = X.C103986b3.A0G
            r3.ChN(r0, r1)
            java.lang.Object r2 = r4.A00
            X.6b7 r2 = (X.C104026b7) r2
            androidx.compose.material.SwipeableV2State r0 = r2.A00
            X.8pE r0 = r0.A06
            java.lang.Object r1 = r0.getValue()
            X.66m r0 = X.C967366m.Open
            if (r1 != r0) goto L_0x01c8
            java.lang.Object r1 = r4.A01
            r0 = 12
            kotlin.jvm.internal.KtLambdaShape16S0200000_I2 r2 = X.C86164wN.A0v(r2, r1, r0)
            r1 = 0
            X.77Z r0 = X.C103976b2.A04
            X.C146828mv.A00(r0, r3, r1, r2)
        L_0x01c8:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape3S1200000_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
