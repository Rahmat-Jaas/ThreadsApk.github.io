package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape3S1400000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S1400000_I2(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        super(1);
        this.A05 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A04 = str;
        this.A00 = obj4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0061, code lost:
        if (r4 != null) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A05
            switch(r0) {
                case 0: goto L_0x01a4;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x015c;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x00e6;
                case 7: goto L_0x00a4;
                case 8: goto L_0x01c8;
                case 9: goto L_0x0076;
                case 10: goto L_0x0059;
                case 11: goto L_0x0050;
                case 12: goto L_0x0050;
                case 13: goto L_0x0059;
                case 14: goto L_0x0033;
                case 15: goto L_0x0033;
                default: goto L_0x0005;
            }
        L_0x0005:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r14 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r14
            X.5DV r2 = new X.5DV
            r2.<init>()
            java.lang.String r0 = r13.A04
            X.C86134wK.A1G(r2, r0)
            java.lang.Object r1 = r13.A01
            X.0V3 r1 = (X.AnonymousClass0V3) r1
            java.lang.String r0 = "discount"
            r2.A06(r1, r0)
            java.lang.Object r1 = r13.A00
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = "applied_discounts"
            r2.A0B(r0, r1)
            java.lang.Object r0 = r13.A03
            com.fbpay.logging.LoggingContext r0 = (com.fbpay.logging.LoggingContext) r0
            X.AnonymousClass7Hr.A04(r2, r0)
            X.C86114wI.A1C(r14, r2)
            java.lang.Object r0 = r13.A02
            X.C86114wI.A1G(r14, r0)
            return r14
        L_0x0033:
            android.view.View r2 = X.C86124wJ.A0L(r14)
            java.lang.Object r1 = r13.A00
            X.Bzr r1 = (X.C21766Bzr) r1
            java.lang.Object r5 = r13.A01
            java.util.List r5 = (java.util.List) r5
            java.lang.String r4 = r13.A04
            java.lang.Object r3 = r13.A02
            com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo r3 = (com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo) r3
            java.lang.Object r0 = r13.A03
            X.9oQ r0 = (X.C166899oQ) r0
            boolean r6 = r0.A04
            r1.CES(r2, r3, r4, r5, r6)
            goto L_0x0159
        L_0x0050:
            android.view.View r5 = X.C86124wJ.A0L(r14)
            java.lang.Object r4 = r13.A00
            X.8lr r4 = (X.C146228lr) r4
            goto L_0x0063
        L_0x0059:
            android.view.View r5 = X.C86124wJ.A0L(r14)
            java.lang.Object r4 = r13.A00
            X.8lr r4 = (X.C146228lr) r4
            if (r4 == 0) goto L_0x0159
        L_0x0063:
            java.lang.String r3 = r13.A04
            java.lang.Object r2 = r13.A01
            java.lang.Object r1 = r13.A02
            java.lang.Object r0 = r13.A03
            com.instagram.shopping.model.destination.home.ProductFeedHeader r0 = (com.instagram.shopping.model.destination.home.ProductFeedHeader) r0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r0 = X.AnonymousClass7IA.A00(r0, r2, r1)
            r4.C1F(r5, r0, r3, r3)
            goto L_0x0159
        L_0x0076:
            X.ARA r14 = (X.ARA) r14
            r0 = 0
            X.C04220Ms.A0B(r14, r0)
            java.lang.Object r4 = r13.A03
            X.AxL r4 = (X.C19498AxL) r4
            X.C19498AxL.A02(r14, r4)
            java.lang.Object r3 = r13.A00
            X.BKU r3 = (X.BKU) r3
            java.lang.String r2 = X.C86154wM.A0m(r3)
            java.lang.Object r0 = r13.A01
            com.instagram.model.shopping.Product r0 = (com.instagram.model.shopping.Product) r0
            com.instagram.model.shopping.ProductDetailsProductItemDict r0 = r0.A00
            java.lang.String r1 = r0.A0j
            X.C04220Ms.A06(r1)
            java.lang.String r0 = r13.A04
            X.C19498AxL.A01(r3, r4, r2, r1, r0)
            java.lang.Object r0 = r13.A02
            X.Afv r0 = (X.C18464Afv) r0
            r0.A00()
            goto L_0x0159
        L_0x00a4:
            r0 = 0
            X.C04220Ms.A0B(r14, r0)
            java.lang.Object r4 = r13.A00
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r1 = r13.A04
            r4.put(r1, r14)
            java.lang.Object r0 = r13.A03
            java.util.Set r0 = (java.util.Set) r0
            r0.remove(r1)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0159
            java.lang.Object r3 = r13.A02
            X.0YY r3 = (X.AnonymousClass0YY) r3
            java.lang.Object r0 = r13.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r1 = r0.iterator()
        L_0x00ce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r4.get(r0)
            if (r0 == 0) goto L_0x00ce
            r2.add(r0)
            goto L_0x00ce
        L_0x00e2:
            r3.invoke(r2)
            goto L_0x0159
        L_0x00e6:
            r0 = 0
            X.C04220Ms.A0B(r14, r0)
            X.7ke r2 = X.AnonymousClass7JJ.A00()
            java.lang.Object r3 = r13.A03
            X.58M r3 = (X.AnonymousClass58M) r3
            com.fbpay.logging.LoggingContext r5 = r3.A0v()
            java.lang.Object r0 = r13.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = (com.facebookpay.paymentmethod.model.PaymentMethod) r0
            long r11 = X.C86164wN.A0A(r0)
            X.LcE r4 = r0.Aam()
            java.lang.Object r0 = r13.A00
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r0 = (com.facebookpay.expresscheckout.models.ECPPaymentResponseParams) r0
            java.lang.String r0 = r0.A0A
            java.util.List r8 = X.C18180wK.A0n(r0)
            X.58K r0 = r3.A1S
            java.util.List r1 = r0.A07()
            X.588 r0 = r3.A1N
            java.util.List r0 = r0.A03()
            java.util.List r9 = X.AnonymousClass00J.A0V(r0, r1)
            java.lang.Object r0 = r13.A02
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            java.lang.Throwable r1 = r0.A02
            boolean r0 = r1 instanceof X.C1373788i
            if (r0 == 0) goto L_0x012f
            r0 = r1
            X.88i r0 = (X.C1373788i) r0
            if (r0 == 0) goto L_0x012f
            java.lang.String r7 = r0.A02
            if (r7 != 0) goto L_0x0131
        L_0x012f:
            java.lang.String r7 = ""
        L_0x0131:
            X.587 r0 = r3.A1O
            java.util.LinkedHashMap r10 = X.AnonymousClass7Kr.A07(r0)
            X.C86114wI.A1P(r1, r10)
            java.lang.String r6 = r13.A04
            X.AnonymousClass0wJ.A1Q(r4, r6)
            r0 = 5
            X.C04220Ms.A0B(r7, r0)
            X.09x r1 = r2.A00
            java.lang.String r0 = "client_submit_ecppaymentcontainer_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 399(0x18f, float:5.59E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            X.8Jh r3 = new X.8Jh
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            X.C128957ke.A04(r0, r5, r3)
        L_0x0159:
            kotlin.Unit r14 = kotlin.Unit.A00
            return r14
        L_0x015c:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r14 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r14
            X.5Cr r2 = new X.5Cr
            r2.<init>()
            java.lang.Object r0 = r13.A01
            X.LcE r0 = (X.C40307LcE) r0
            if (r0 == 0) goto L_0x016f
            X.Lce r0 = X.AnonymousClass7Kr.A03(r0)
            if (r0 != 0) goto L_0x0171
        L_0x016f:
            X.Lce r0 = X.C40324Lce.A03
        L_0x0171:
            X.C86164wN.A1B(r0, r2)
            java.lang.Object r0 = r13.A03
            com.fbpay.logging.LoggingContext r0 = (com.fbpay.logging.LoggingContext) r0
            X.AnonymousClass7Hr.A04(r2, r0)
            java.lang.String r1 = r13.A04
            X.C86124wJ.A1K(r2, r1)
            java.lang.String r0 = "edit_card"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0190
            java.lang.String r0 = "selected_credential"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x019b
        L_0x0190:
            java.lang.Object r1 = r13.A00
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x019b
            java.lang.String r0 = "credential_id"
            r2.A09(r0, r1)
        L_0x019b:
            X.C86114wI.A1C(r14, r2)
            java.lang.Object r0 = r13.A02
            X.C86114wI.A1G(r14, r0)
            return r14
        L_0x01a4:
            java.lang.Object r4 = r13.A02
            X.54n r4 = (X.C877854n) r4
            android.view.WindowManager r1 = r4.A0A
            android.view.WindowManager$LayoutParams r0 = r4.A09
            r1.addView(r4, r0)
            java.lang.Object r3 = r13.A01
            X.0ZU r3 = (X.AnonymousClass0ZU) r3
            java.lang.Object r2 = r13.A03
            X.78v r2 = (X.C1201478v) r2
            java.lang.String r1 = r13.A04
            java.lang.Object r0 = r13.A00
            X.69J r0 = (X.AnonymousClass69J) r0
            r4.A0A(r0, r2, r1, r3)
            r0 = 14
            com.facebook.redex.IDxEResultShape438S0100000_2_I2 r14 = new com.facebook.redex.IDxEResultShape438S0100000_2_I2
            r14.<init>(r4, r0)
            return r14
        L_0x01c8:
            java.lang.Object r3 = r13.A03
            X.0i6 r3 = (X.C10300i6) r3
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36318230570799369(0x81073d000b1109, double:3.0311334825252924E-306)
            boolean r2 = X.C63803iN.A0E(r2, r3, r0)
            java.lang.Object r1 = r13.A01
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            com.instagram.model.direct.DirectShareTarget r0 = new com.instagram.model.direct.DirectShareTarget
            if (r2 == 0) goto L_0x01e9
            r0.<init>((com.instagram.user.model.User) r1)
            java.lang.String r0 = "enqueueGroupProfileAdminInvite"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x01e9:
            r0.<init>((com.instagram.user.model.User) r1)
            java.lang.Object r1 = r13.A00
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131828103(0x7f111d87, float:1.9289137E38)
            r1.getString(r0)
            java.lang.String r0 = "enqueueProfileShare"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape3S1400000_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
