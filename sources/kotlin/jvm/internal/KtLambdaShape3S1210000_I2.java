package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape3S1210000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S1210000_I2(Object obj, Object obj2, String str, int i, boolean z) {
        super(1);
        this.A04 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = z;
        this.A00 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00da, code lost:
        r2.A07(r0, r1);
        X.AnonymousClass7Hr.A03(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00e0, code lost:
        X.C86114wI.A1C(r12, r2);
        X.C86114wI.A1G(r12, r11.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00e8, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x013d, code lost:
        return kotlin.Unit.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A04
            switch(r0) {
                case 0: goto L_0x0030;
                case 1: goto L_0x0056;
                case 2: goto L_0x006b;
                case 3: goto L_0x0095;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x00b8;
                case 7: goto L_0x00e9;
                case 8: goto L_0x0101;
                default: goto L_0x0005;
            }
        L_0x0005:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r12 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r12
            X.5DA r2 = new X.5DA
            r2.<init>()
            java.lang.Object r0 = r11.A01
            com.fbpay.logging.LoggingContext r0 = (com.fbpay.logging.LoggingContext) r0
            X.AnonymousClass7Hr.A04(r2, r0)
            java.lang.String r0 = r11.A02
            X.C86124wJ.A1K(r2, r0)
            boolean r0 = r11.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 952(0x3b8, float:1.334E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A07(r0, r1)
            X.C86114wI.A1C(r12, r2)
            java.lang.Object r0 = r11.A00
            X.C86114wI.A1G(r12, r0)
            return r12
        L_0x0030:
            X.86i r2 = X.AnonymousClass75O.A00(r12)
            boolean r0 = r11.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "enabled"
            r2.A01(r0, r1)
            java.lang.String r1 = r11.A02
            java.lang.String r0 = "onClickLabel"
            r2.A01(r0, r1)
            java.lang.Object r1 = r11.A01
            java.lang.String r0 = "role"
            r2.A01(r0, r1)
            java.lang.Object r1 = r11.A00
            java.lang.String r0 = "onClick"
            r2.A01(r0, r1)
            goto L_0x013b
        L_0x0056:
            X.8mi r4 = X.C86104wH.A0N(r12)
            java.lang.String r3 = r11.A02
            java.lang.Object r2 = r11.A01
            X.6p2 r2 = (X.C112126p2) r2
            java.lang.Object r1 = r11.A00
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r11.A03
            java.util.Map r12 = r4.Asy(r2, r3, r1, r0)
            return r12
        L_0x006b:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r12 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r12
            X.5Cn r2 = new X.5Cn
            r2.<init>()
            java.lang.Object r0 = r11.A01
            com.fbpay.logging.LoggingContext r0 = (com.fbpay.logging.LoggingContext) r0
            X.C86104wH.A1K(r2, r0)
            java.lang.String r1 = r11.A02
            if (r1 != 0) goto L_0x007f
            java.lang.String r1 = ""
        L_0x007f:
            java.lang.String r0 = "receiver_id"
            r2.A0A(r0, r1)
            boolean r0 = r11.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_ecp_available"
            r2.A07(r0, r1)
            java.lang.String r0 = "checkout_setup_mutation"
            X.C86124wJ.A1K(r2, r0)
            goto L_0x00e0
        L_0x0095:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r12 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r12
            java.lang.Object r3 = r11.A01
            com.fbpay.logging.LoggingContext r3 = (com.fbpay.logging.LoggingContext) r3
            X.6BP r0 = X.AnonymousClass6BP.A00(r12, r3)
            X.C86104wH.A1G(r0, r12)
            X.5D3 r2 = new X.5D3
            r2.<init>()
            X.C86104wH.A1K(r2, r3)
            java.lang.String r0 = r11.A02
            X.C86134wK.A1G(r2, r0)
            boolean r0 = r11.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "otc_toggle_state_on"
            goto L_0x00da
        L_0x00b8:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r12 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r12
            java.lang.Object r3 = r11.A01
            com.fbpay.logging.LoggingContext r3 = (com.fbpay.logging.LoggingContext) r3
            X.6BP r0 = X.AnonymousClass6BP.A00(r12, r3)
            X.C86104wH.A1G(r0, r12)
            X.5D3 r2 = new X.5D3
            r2.<init>()
            X.C86104wH.A1K(r2, r3)
            java.lang.String r0 = r11.A02
            X.C86124wJ.A1K(r2, r0)
            boolean r0 = r11.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_default_otc_toggle_state_on"
        L_0x00da:
            r2.A07(r0, r1)
            X.AnonymousClass7Hr.A03(r2, r3)
        L_0x00e0:
            X.C86114wI.A1C(r12, r2)
            java.lang.Object r0 = r11.A00
            X.C86114wI.A1G(r12, r0)
            return r12
        L_0x00e9:
            int r4 = X.AnonymousClass0wJ.A04(r12)
            java.lang.Object r0 = r11.A01
            com.instagram.api.tigon.IGTigonQuickPerformanceLogger r0 = (com.instagram.api.tigon.IGTigonQuickPerformanceLogger) r0
            X.01V r3 = r0.logger
            java.lang.Object r0 = r11.A00
            int r2 = r0.hashCode()
            java.lang.String r1 = r11.A02
            boolean r0 = r11.A03
            r3.markerAnnotate((int) r4, (int) r2, (java.lang.String) r1, (boolean) r0)
            goto L_0x013b
        L_0x0101:
            X.BKU r12 = (X.BKU) r12
            boolean r3 = r11.A03
            java.lang.Object r2 = r11.A01
            X.65B r2 = (X.AnonymousClass65B) r2
            if (r3 == 0) goto L_0x0141
            X.AnonymousClass65B.A02(r2)
        L_0x010e:
            X.C04220Ms.A07(r12)
            java.lang.Object r0 = r11.A00
            X.9CN r0 = (X.AnonymousClass9CN) r0
            java.lang.Long r1 = r0.A02
            java.lang.String r0 = java.lang.String.valueOf(r1)
            X.BKU r5 = X.C19564AyQ.A01(r12, r0)
            X.Ah2 r4 = r2.A03
            java.lang.String r7 = java.lang.String.valueOf(r1)
            if (r3 == 0) goto L_0x013e
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r6 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.APPROVED
        L_0x0129:
            X.C2W r0 = r2.A04
            java.lang.String r8 = X.C86124wJ.A0x(r0)
            java.lang.String r9 = X.C86104wH.A0t(r0, r8)
            X.C04220Ms.A0A(r9)
            java.lang.String r10 = r11.A02
            r4.A00(r5, r6, r7, r8, r9, r10)
        L_0x013b:
            kotlin.Unit r12 = kotlin.Unit.A00
            return r12
        L_0x013e:
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r6 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.DECLINED
            goto L_0x0129
        L_0x0141:
            X.C04220Ms.A07(r12)
            X.AnonymousClass65B.A00(r12, r2)
            goto L_0x010e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape3S1210000_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
