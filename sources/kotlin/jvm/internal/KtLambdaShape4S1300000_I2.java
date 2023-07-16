package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape4S1300000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape4S1300000_I2(Object obj, Object obj2, Object obj3, String str, int i) {
        super(0);
        this.A04 = i;
        this.A01 = obj;
        this.A00 = obj2;
        this.A02 = obj3;
        this.A03 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0164, code lost:
        X.C19454Awb.A01(r5, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0167, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x02f0, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0020, code lost:
        return new X.C18385AeZ(r2, (X.C21839C2o) r1, r3, r0.A03);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x02cf;
                case 1: goto L_0x02c8;
                case 2: goto L_0x0287;
                case 3: goto L_0x0229;
                case 4: goto L_0x020e;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01c3;
                case 7: goto L_0x01af;
                case 8: goto L_0x0168;
                case 9: goto L_0x0144;
                case 10: goto L_0x00fc;
                case 11: goto L_0x00e7;
                case 12: goto L_0x00d2;
                case 13: goto L_0x00bd;
                case 14: goto L_0x00a8;
                case 15: goto L_0x0093;
                case 16: goto L_0x007e;
                case 17: goto L_0x0053;
                case 18: goto L_0x0035;
                case 19: goto L_0x0021;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.A02
            X.AaC r1 = (X.C18122AaC) r1
            android.view.View r1 = r1.A01
            android.content.Context r2 = X.C18190wL.A0A(r1)
            java.lang.Object r3 = r0.A01
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            java.lang.Object r1 = r0.A00
        L_0x0017:
            X.C2o r1 = (X.C21839C2o) r1
            java.lang.String r0 = r0.A03
            X.AeZ r6 = new X.AeZ
            r6.<init>(r2, r1, r3, r0)
            return r6
        L_0x0021:
            java.lang.Object r2 = r0.A00
            android.content.Context r2 = (android.content.Context) r2
            r1 = 92
            java.lang.String r1 = X.C18170wI.A00(r1)
            X.C04220Ms.A0C(r2, r1)
            java.lang.Object r3 = r0.A02
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            java.lang.Object r1 = r0.A01
            goto L_0x0017
        L_0x0035:
            java.lang.Object r1 = r0.A01
            com.instagram.shopping.model.destination.home.ProductFeedHeader r1 = (com.instagram.shopping.model.destination.home.ProductFeedHeader) r1
            com.instagram.shopping.model.destination.home.ShoppingHomeTapTarget r1 = r1.A00
            com.instagram.shopping.model.destination.home.ShoppingHomeTapTarget$RichDestinationButton r1 = r1.A00
            if (r1 == 0) goto L_0x02ee
            X.As6 r4 = r1.A00
            if (r4 == 0) goto L_0x02ee
            java.lang.Object r3 = r0.A00
            X.C2P r3 = (X.C2P) r3
            java.lang.Object r2 = r0.A02
            X.65D r2 = (X.AnonymousClass65D) r2
            java.lang.String r1 = r0.A03
            r0 = 0
            r3.C7a(r0, r2, r4, r1)
            goto L_0x02ee
        L_0x0053:
            java.lang.Object r2 = r0.A02
            X.65B r2 = (X.AnonymousClass65B) r2
            X.AnonymousClass65B.A03(r2)
            X.Ah2 r3 = r2.A03
            java.lang.Object r1 = r0.A01
            X.9CN r1 = (X.AnonymousClass9CN) r1
            java.lang.Long r1 = r1.A02
            java.lang.String r5 = java.lang.String.valueOf(r1)
            java.lang.Object r4 = r0.A00
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r4 = (com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus) r4
            X.C2W r1 = r2.A04
            java.lang.String r6 = X.C86124wJ.A0x(r1)
            java.lang.String r7 = X.C86104wH.A0t(r1, r6)
            X.C04220Ms.A0A(r7)
            java.lang.String r8 = r0.A03
            r3.A03(r4, r5, r6, r7, r8)
            goto L_0x02ee
        L_0x007e:
            java.lang.Object r1 = r0.A02
            X.CpF r1 = (X.C23267CpF) r1
            X.H8C r3 = r1.A00
            java.lang.Object r2 = r0.A01
            com.instagram.pendingmedia.model.PendingMedia r2 = (com.instagram.pendingmedia.model.PendingMedia) r2
            java.lang.String r1 = r0.A03
            java.lang.Object r0 = r0.A00
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r3.A1S(r2, r1, r0)
            goto L_0x02ee
        L_0x0093:
            java.lang.Object r1 = r0.A02
            X.CpF r1 = (X.C23267CpF) r1
            X.H8C r3 = r1.A00
            java.lang.Object r2 = r0.A01
            com.instagram.pendingmedia.model.PendingMedia r2 = (com.instagram.pendingmedia.model.PendingMedia) r2
            java.lang.String r1 = r0.A03
            java.lang.Object r0 = r0.A00
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r3.A1R(r2, r1, r0)
            goto L_0x02ee
        L_0x00a8:
            java.lang.Object r1 = r0.A02
            X.CpF r1 = (X.C23267CpF) r1
            X.H8C r3 = r1.A00
            java.lang.Object r2 = r0.A00
            com.instagram.pendingmedia.model.PendingMedia r2 = (com.instagram.pendingmedia.model.PendingMedia) r2
            java.lang.String r1 = r0.A03
            java.lang.Object r0 = r0.A01
            java.util.Map r0 = (java.util.Map) r0
            r3.A1T(r2, r1, r0)
            goto L_0x02ee
        L_0x00bd:
            java.lang.Object r1 = r0.A02
            X.CpF r1 = (X.C23267CpF) r1
            X.H8C r3 = r1.A00
            java.lang.Object r2 = r0.A01
            com.instagram.pendingmedia.model.PendingMedia r2 = (com.instagram.pendingmedia.model.PendingMedia) r2
            java.lang.String r1 = r0.A03
            java.lang.Object r0 = r0.A00
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r3.A1Q(r2, r1, r0)
            goto L_0x02ee
        L_0x00d2:
            java.lang.Object r1 = r0.A02
            X.CpF r1 = (X.C23267CpF) r1
            X.H8C r3 = r1.A00
            java.lang.Object r2 = r0.A01
            com.instagram.pendingmedia.model.PendingMedia r2 = (com.instagram.pendingmedia.model.PendingMedia) r2
            java.lang.String r1 = r0.A03
            java.lang.Object r0 = r0.A00
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r3.A1P(r2, r1, r0)
            goto L_0x02ee
        L_0x00e7:
            java.lang.Object r1 = r0.A02
            X.CpF r1 = (X.C23267CpF) r1
            X.H8C r3 = r1.A00
            java.lang.Object r2 = r0.A01
            com.instagram.pendingmedia.model.PendingMedia r2 = (com.instagram.pendingmedia.model.PendingMedia) r2
            java.lang.String r1 = r0.A03
            java.lang.Object r0 = r0.A00
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r3.A1O(r2, r1, r0)
            goto L_0x02ee
        L_0x00fc:
            X.Awb r4 = X.C19454Awb.A05
            java.lang.Object r3 = r0.A02
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            java.lang.Object r2 = r0.A00
            X.0kW r2 = (X.C11630kW) r2
            r1 = 3
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.C04220Ms.A0C(r2, r1)
            X.C2o r2 = (X.C21839C2o) r2
            r4.A02(r2, r3)
            java.lang.String r5 = r0.A03
            java.lang.Object r3 = r0.A01
            X.BKU r3 = (X.BKU) r3
            X.BKN r0 = r3.A0f
            java.lang.String r4 = r0.A4Y
            X.C04220Ms.A06(r4)
            java.lang.String r1 = r0.A4Y
            r0 = 766(0x2fe, float:1.073E-42)
            java.lang.String r0 = X.I17.A00(r0)
            kotlin.Pair r2 = X.C18180wK.A0p(r0, r1)
            java.lang.Boolean r1 = X.C18180wK.A0Y()
            r0 = 729(0x2d9, float:1.022E-42)
            java.lang.String r0 = X.I17.A00(r0)
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            java.util.Map r0 = X.AnonymousClass4WJ.A0G(r2, r0)
            java.lang.String r0 = X.C19454Awb.A00(r3, r5, r0)
            r6 = 0
            goto L_0x0164
        L_0x0144:
            X.Awb r3 = X.C19454Awb.A05
            java.lang.Object r2 = r0.A01
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.Object r1 = r0.A00
            X.C2o r1 = (X.C21839C2o) r1
            r3.A02(r1, r2)
            java.lang.String r5 = r0.A03
            java.lang.Object r1 = r0.A02
            X.BKU r1 = (X.BKU) r1
            java.lang.String r4 = X.C86154wM.A0m(r1)
            r6 = 0
            java.util.Map r0 = X.AnonymousClass4WJ.A0A()
            java.lang.String r0 = X.C19454Awb.A00(r1, r5, r0)
        L_0x0164:
            X.C19454Awb.A01(r5, r4, r0)
            return r6
        L_0x0168:
            X.3Vz r16 = X.C36622Sa.A00()
            java.lang.Object r3 = r0.A01
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            java.lang.Object r2 = r0.A00
            X.601 r2 = (X.AnonymousClass601) r2
            r1 = 0
            X.C04220Ms.A0B(r2, r1)
            X.0kW r18 = X.C63913ic.A0A(r2)
            java.lang.Object r2 = r0.A02
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.String r1 = r0.A03
            java.util.Locale r0 = java.util.Locale.US
            X.C04220Ms.A08(r0)
            java.lang.String r0 = X.C18220wO.A0u(r0, r1)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r20 = com.instagram.quickpromotion.intf.QuickPromotionSlot.valueOf(r0)
            X.C36622Sa.A00()
            r4 = 0
            X.4Gh r9 = new X.4Gh
            r9.<init>(r2, r1)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r14 = r4
            r15 = r4
            X.3GL r19 = X.C61403Th.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r21 = r2
            r17 = r3
            X.1u1 r6 = r16.A03(r17, r18, r19, r20, r21)
            return r6
        L_0x01af:
            java.lang.String r3 = r0.A03
            java.lang.Object r2 = r0.A00
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r1 = r0.A02
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2) r0
            X.7tF r6 = new X.7tF
            r6.<init>(r2, r0, r1, r3)
            return r6
        L_0x01c3:
            java.lang.Object r2 = r0.A00
            java.util.HashMap r2 = (java.util.HashMap) r2
            r1 = 926(0x39e, float:1.298E-42)
            java.lang.String r1 = X.C18170wI.A00(r1)
            X.3iE r3 = X.C63743iE.A02(r1, r2)
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.A02
            X.0i6 r1 = (X.C10300i6) r1
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r1)
            java.lang.String r0 = r0.A03
            r1.A0S = r0
            r3.A0C(r2, r1)
            goto L_0x02ee
        L_0x01e6:
            java.lang.Object r3 = r0.A02
            X.5Lw r3 = (X.C90405Lw) r3
            X.8ej r2 = r3.A00
            X.7p6 r1 = X.AnonymousClass7p6.A00
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            if (r1 == 0) goto L_0x01ff
            java.lang.Object r1 = r0.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.String r0 = r3.A04
        L_0x01fa:
            r1.invoke(r0)
            goto L_0x02ee
        L_0x01ff:
            X.7p7 r1 = X.AnonymousClass7p7.A00
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            if (r1 == 0) goto L_0x02ee
            java.lang.Object r1 = r0.A01
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.String r0 = r0.A03
            goto L_0x01fa
        L_0x020e:
            java.lang.Object r3 = r0.A02
            X.0YM r3 = (X.AnonymousClass0YM) r3
            java.lang.String r2 = r0.A03
            java.lang.Object r1 = r0.A01
            X.8nL r1 = (X.C147068nL) r1
            java.lang.String r1 = r1.getId()
            java.lang.Object r0 = r0.A00
            X.8pE r0 = (X.C147368pE) r0
            java.lang.Object r0 = r0.getValue()
            r3.invoke(r2, r1, r0)
            goto L_0x02ee
        L_0x0229:
            X.7ke r2 = X.AnonymousClass7JJ.A00()
            java.lang.Object r4 = r0.A02
            X.58M r4 = (X.AnonymousClass58M) r4
            com.fbpay.logging.LoggingContext r6 = r4.A0v()
            java.lang.Object r1 = r0.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r1 = (com.facebookpay.paymentmethod.model.PaymentMethod) r1
            long r11 = X.C86164wN.A0A(r1)
            X.LcE r5 = r1.Aam()
            java.lang.Object r1 = r0.A00
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r1 = (com.facebookpay.expresscheckout.models.ECPPaymentResponseParams) r1
            java.lang.String r1 = r1.A0A
            java.util.List r8 = X.C18180wK.A0n(r1)
            X.58K r1 = r4.A1S
            java.util.List r3 = r1.A07()
            X.588 r1 = r4.A1N
            java.util.List r1 = r1.A03()
            java.util.List r9 = X.AnonymousClass00J.A0V(r1, r3)
            X.587 r1 = r4.A1O
            java.util.LinkedHashMap r10 = X.AnonymousClass7Kr.A07(r1)
            java.lang.String r7 = r0.A03
            X.AnonymousClass0wJ.A1Q(r5, r7)
            X.09x r1 = r2.A00
            java.lang.String r0 = "client_submit_ecppaymentcontainer_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 401(0x191, float:5.62E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            kotlin.jvm.internal.KtLambdaShape0S1500100_I2 r4 = new kotlin.jvm.internal.KtLambdaShape0S1500100_I2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.C128957ke.A04(r0, r6, r4)
            com.facebook.quicklog.QuickPerformanceLogger r2 = r2.A01
            r1 = 223884226(0xd5833c2, float:6.662244E-31)
            java.lang.String r0 = "CONTAINER_SUBMISSION_SUCCESS"
            r2.markerPoint(r1, r0)
            goto L_0x02ee
        L_0x0287:
            X.7ke r2 = X.AnonymousClass7JJ.A00()
            java.lang.Object r3 = r0.A01
            com.fbpay.logging.LoggingContext r3 = (com.fbpay.logging.LoggingContext) r3
            java.lang.Object r1 = r0.A00
            java.util.List r5 = X.C18180wK.A0n(r1)
            java.lang.String r6 = r0.A03
            java.lang.String r1 = "PRE_WARM"
            boolean r9 = X.C04220Ms.A0I(r6, r1)
            java.lang.Object r0 = r0.A02
            X.7DP r0 = (X.AnonymousClass7DP) r0
            java.util.LinkedHashMap r4 = X.C18220wO.A0y()
            if (r0 == 0) goto L_0x02aa
            X.AnonymousClass7Kr.A0B(r0, r4)
        L_0x02aa:
            java.lang.String r7 = "checkout"
            r0 = 0
            int r8 = X.C86124wJ.A07(r0, r3, r6)
            X.09x r1 = r2.A00
            java.lang.String r0 = "client_load_ecpcheckoutcomponent_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 281(0x119, float:3.94E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            kotlin.jvm.internal.KtLambdaShape0S2310000_I2 r2 = new kotlin.jvm.internal.KtLambdaShape0S2310000_I2
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.C128957ke.A04(r0, r3, r2)
            goto L_0x02ee
        L_0x02c8:
            java.lang.Object r0 = r0.A01
            X.C18240wQ.A1G(r0)
            r6 = 0
            return r6
        L_0x02cf:
            java.lang.Object r1 = r0.A02
            java.util.List r5 = X.C18180wK.A0n(r1)
            java.lang.Object r4 = r0.A01
            X.M5i r4 = (X.C41250M5i) r4
            java.lang.String r3 = r0.A03
            java.lang.Integer r1 = X.AnonymousClass006.A01
            X.M1T r2 = new X.M1T
            r2.<init>(r4, r1, r3, r5)
            java.lang.Object r1 = r0.A00
            X.MAx r1 = (X.C41303MAx) r1
            X.MRJ r0 = new X.MRJ
            r0.<init>(r1, r2)
            r0.run()
        L_0x02ee:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape4S1300000_I2.invoke():java.lang.Object");
    }
}
