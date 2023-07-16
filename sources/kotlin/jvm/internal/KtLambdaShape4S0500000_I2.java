package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape4S0500000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape4S0500000_I2(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(1);
        this.A05 = i;
        this.A00 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
        this.A02 = obj5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x02e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r6 = r19
            int r1 = r0.A05
            switch(r1) {
                case 0: goto L_0x0049;
                case 1: goto L_0x00c4;
                case 2: goto L_0x00fc;
                case 3: goto L_0x0166;
                case 4: goto L_0x0009;
                case 5: goto L_0x0009;
                case 6: goto L_0x0009;
                case 7: goto L_0x01a4;
                case 8: goto L_0x01cd;
                case 9: goto L_0x01f6;
                case 10: goto L_0x0248;
                case 11: goto L_0x0280;
                case 12: goto L_0x02a8;
                case 13: goto L_0x0321;
                case 14: goto L_0x0351;
                case 15: goto L_0x0391;
                case 16: goto L_0x03ad;
                default: goto L_0x0009;
            }
        L_0x0009:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r6 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r6
            X.5D2 r4 = new X.5D2
            r4.<init>()
            java.lang.Object r3 = r0.A03
            com.fbpay.logging.LoggingContext r3 = (com.fbpay.logging.LoggingContext) r3
            X.C86104wH.A1K(r4, r3)
            java.lang.Object r2 = r0.A00
            X.6B5 r2 = (X.AnonymousClass6B5) r2
            java.lang.String r1 = "ecp_handle_checkout_event_request_type"
            r4.A04(r2, r1)
            X.AnonymousClass7Hr.A03(r4, r3)
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x002e
            java.lang.String r1 = "discounts_to_apply"
            r4.A0B(r1, r2)
        L_0x002e:
            java.lang.Object r2 = r0.A04
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x0039
            java.lang.String r1 = "order_id"
            r4.A09(r1, r2)
        L_0x0039:
            X.6BP r1 = X.AnonymousClass6BP.A00(r6, r3)
            X.C86104wH.A1G(r1, r6)
            X.C86114wI.A1C(r6, r4)
            java.lang.Object r0 = r0.A02
            X.C86114wI.A1G(r6, r0)
            return r6
        L_0x0049:
            X.8pX r6 = (X.C147558pX) r6
            r12 = 0
            X.C04220Ms.A0B(r6, r12)
            r6.AIq()
            java.lang.Object r1 = r0.A00
            X.7JH r1 = (X.AnonymousClass7JH) r1
            java.lang.Object r1 = X.AnonymousClass7JH.A01(r1)
            float r2 = X.C18240wQ.A00(r1)
            r4 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r11 = X.AnonymousClass8bI.A01(r2, r4, r1)
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x03dc
            java.lang.Object r3 = r0.A02
            X.8nB r3 = (X.C146978nB) r3
            java.lang.Object r1 = r0.A04
            X.7HD r1 = (X.AnonymousClass7HD) r1
            long r1 = r1.A00
            int r1 = X.C86104wH.A07(r1)
            int r2 = r3.CVm(r1)
            java.lang.Object r1 = r0.A03
            X.6qu r1 = (X.C113196qu) r1
            X.7Gf r1 = X.C147368pE.A00(r1)
            if (r1 == 0) goto L_0x00be
            X.7AW r1 = r1.A02
            X.7F6 r5 = r1.A0A(r2)
        L_0x008b:
            float r1 = X.AnonymousClass6ZI.A00
            float r10 = r6.CxL(r1)
            float r4 = r5.A01
            r1 = 2
            float r1 = (float) r1
            float r3 = r10 / r1
            float r4 = r4 + r3
            long r1 = r6.BCH()
            float r2 = X.AnonymousClass7JK.A02(r1)
            float r2 = r2 - r3
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x00a6
            r4 = r2
        L_0x00a6:
            float r1 = r5.A03
            long r14 = X.C86104wH.A0C(r4, r1)
            float r1 = r5.A00
            long r16 = X.C86104wH.A0C(r4, r1)
            java.lang.Object r7 = r0.A01
            X.6nD r7 = (X.C111366nD) r7
            r8 = 0
            r13 = 3
            r9 = r8
            r6.AJ2(r7, r8, r9, r10, r11, r12, r13, r14, r16)
            goto L_0x03dc
        L_0x00be:
            X.7F6 r5 = new X.7F6
            r5.<init>(r4, r4, r4, r4)
            goto L_0x008b
        L_0x00c4:
            X.7Zx r6 = (X.C123917Zx) r6
            r1 = 0
            X.C04220Ms.A0B(r6, r1)
            java.lang.Object r2 = r0.A03
            X.0Mo r2 = (X.C04180Mo) r2
            r1 = 1
            r2.A00 = r1
            java.lang.Object r4 = r0.A01
            java.util.List r4 = (java.util.List) r4
            int r2 = r4.indexOf(r6)
            r1 = -1
            if (r2 == r1) goto L_0x00f9
            java.lang.Object r3 = r0.A02
            X.0MZ r3 = (X.AnonymousClass0MZ) r3
            int r1 = r3.A00
            int r2 = r2 + 1
            java.util.List r1 = r4.subList(r1, r2)
            r3.A00 = r2
        L_0x00ea:
            java.lang.Object r3 = r0.A04
            X.7KG r3 = (X.AnonymousClass7KG) r3
            X.7AO r2 = r6.A03
            java.lang.Object r0 = r0.A00
            android.os.Bundle r0 = (android.os.Bundle) r0
            X.AnonymousClass7KG.A00(r0, r6, r3, r2, r1)
            goto L_0x03dc
        L_0x00f9:
            X.0ZV r1 = X.AnonymousClass0ZV.A00
            goto L_0x00ea
        L_0x00fc:
            X.LyC r6 = (X.C41173LyC) r6
            r1 = 0
            X.C04220Ms.A0B(r6, r1)
            int r2 = r6.A00
            java.lang.Object r1 = r0.A04
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase r1 = (com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase) r1
            X.8mi r5 = r1.A0B
            if (r2 != 0) goto L_0x0136
            java.lang.Object r4 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2) r4
            java.lang.String r3 = r4.A01
            java.lang.Object r1 = r0.A03
            com.android.billingclient.api.Purchase r1 = (com.android.billingclient.api.Purchase) r1
            org.json.JSONObject r2 = r1.A02
            java.lang.String r1 = "orderId"
            java.lang.String r2 = r2.optString(r1)
            java.lang.Object r1 = r0.A02
            java.util.Map r1 = (java.util.Map) r1
            r5.AL8(r3, r2, r1)
            java.lang.Object r0 = r0.A00
            X.6cF r0 = (X.C104706cF) r0
            if (r0 == 0) goto L_0x03dc
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase r0 = r0.A00
            X.8k9 r0 = r0.A04
            if (r0 == 0) goto L_0x03dc
            r0.CDw(r4)
            goto L_0x03dc
        L_0x0136:
            java.lang.Object r2 = r0.A03
            com.android.billingclient.api.Purchase r2 = (com.android.billingclient.api.Purchase) r2
            java.lang.String r7 = X.C98816Ha.A00(r2)
            java.lang.Object r1 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2) r1
            java.lang.String r8 = r1.A01
            org.json.JSONObject r2 = r2.A02
            java.lang.String r1 = "orderId"
            java.lang.String r9 = r2.optString(r1)
            java.lang.Object r10 = r0.A02
            java.util.Map r10 = (java.util.Map) r10
            r5.AL6(r6, r7, r8, r9, r10)
            java.lang.Object r0 = r0.A00
            X.6cF r0 = (X.C104706cF) r0
            if (r0 == 0) goto L_0x03dc
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase r0 = r0.A00
            X.8k9 r1 = r0.A04
            if (r1 == 0) goto L_0x03dc
            X.Lbs r0 = X.C40289Lbs.CONSUME_FAILURE
            r1.CDt(r0)
            goto L_0x03dc
        L_0x0166:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r6 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r6
            X.5D5 r3 = new X.5D5
            r3.<init>()
            java.lang.Object r2 = r0.A04
            com.fbpay.logging.LoggingContext r2 = (com.fbpay.logging.LoggingContext) r2
            X.C86104wH.A1K(r3, r2)
            java.lang.Object r1 = r0.A02
            X.LcE r1 = (X.C40307LcE) r1
            X.Lce r1 = X.AnonymousClass7Kr.A03(r1)
            X.C86164wN.A1B(r1, r3)
            X.AnonymousClass7Hr.A03(r3, r2)
            java.lang.String r1 = "checkout"
            X.C86134wK.A1G(r3, r1)
            java.lang.Object r2 = r0.A00
            java.util.List r2 = (java.util.List) r2
            java.lang.String r1 = "applied_discounts"
            r3.A0B(r1, r2)
            java.lang.Object r2 = r0.A01
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x019b
            java.lang.String r1 = "credential_id"
            r3.A09(r1, r2)
        L_0x019b:
            X.C86114wI.A1C(r6, r3)
            java.lang.Object r0 = r0.A03
            X.C86114wI.A1G(r6, r0)
            return r6
        L_0x01a4:
            java.lang.Object r1 = r0.A04
            X.74p r1 = (X.C1193274p) r1
            X.C1193274p.A00(r1)
            java.lang.Object r1 = r0.A02
            X.74p r1 = (X.C1193274p) r1
            X.C1193274p.A00(r1)
            java.lang.Object r1 = r0.A00
            X.74p r1 = (X.C1193274p) r1
            X.C1193274p.A00(r1)
            java.lang.Object r2 = r0.A03
            X.Acd r2 = (X.C18266Acd) r2
            java.lang.Float r1 = X.C86124wJ.A0g()
            r2.A00(r1)
            java.lang.Object r0 = r0.A01
            X.Acd r0 = (X.C18266Acd) r0
            r0.A00(r1)
            goto L_0x03dc
        L_0x01cd:
            java.lang.Object r1 = r0.A01
            X.74p r1 = (X.C1193274p) r1
            X.M0S.A00()
            java.lang.Object r2 = r1.A00
            android.os.Handler r2 = (android.os.Handler) r2
            java.lang.Object r1 = r0.A02
            X.74p r1 = (X.C1193274p) r1
            X.M0S.A00()
            java.lang.Object r1 = r1.A00
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2.removeCallbacks(r1)
            java.lang.Object r1 = r0.A03
            X.74p r1 = (X.C1193274p) r1
            X.C1193274p.A00(r1)
            java.lang.Object r4 = r0.A00
            X.Lu1 r4 = (X.Lu1) r4
            java.lang.Object r5 = r0.A04
            X.9ER r5 = (X.AnonymousClass9ER) r5
            goto L_0x023d
        L_0x01f6:
            java.lang.Object r6 = r0.A03
            X.74p r6 = (X.C1193274p) r6
            X.C1193274p.A00(r6)
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r1)
            java.lang.Object r5 = r0.A04
            X.9ER r5 = (X.AnonymousClass9ER) r5
            java.lang.Object r4 = r0.A00
            X.Lu1 r4 = (X.Lu1) r4
            long r1 = r5.A02
            r3.setDuration(r1)
            r2 = 3
            com.facebook.redex.IDxUListenerShape146S0200000_2_I2 r1 = new com.facebook.redex.IDxUListenerShape146S0200000_2_I2
            r1.<init>((int) r2, (java.lang.Object) r4, (java.lang.Object) r5)
            r3.addUpdateListener(r1)
            X.M0S.A00()
            r6.A00 = r3
            java.lang.Object r1 = r0.A01
            X.74p r1 = (X.C1193274p) r1
            X.M0S.A00()
            java.lang.Object r3 = r1.A00
            android.os.Handler r3 = (android.os.Handler) r3
            java.lang.Object r0 = r0.A02
            X.74p r0 = (X.C1193274p) r0
            X.M0S.A00()
            java.lang.Object r2 = r0.A00
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            long r0 = r5.A03
            r3.postDelayed(r2, r0)
        L_0x023d:
            int r0 = r5.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A00(r0)
            goto L_0x03dc
        L_0x0248:
            r13 = r6
            X.BMe r13 = (X.C20061BMe) r13
            r3 = 0
            X.C04220Ms.A0B(r13, r3)
            java.lang.Object r7 = r0.A00
            X.BKU r7 = (X.BKU) r7
            java.lang.Object r8 = r0.A01
            X.BKU r8 = (X.BKU) r8
            java.lang.Object r10 = r0.A03
            X.BMj r10 = (X.C20066BMj) r10
            java.lang.Object r2 = r0.A04
            X.Aef r2 = (X.C18391Aef) r2
            X.C3w r1 = r2.A00
            X.C13 r12 = r1.Aul()
            java.lang.Object r9 = r0.A02
            X.C2o r9 = (X.C21839C2o) r9
            com.instagram.service.session.UserSession r11 = r2.A02
            X.C04220Ms.A0B(r7, r3)
            X.AnonymousClass0wJ.A1O(r8, r10)
            r0 = 3
            X.C18190wL.A1S(r12, r0, r9)
            com.instagram.ui.bottomsheet.intf.IDxCListenerShape180S0100000_3_I2 r14 = new com.instagram.ui.bottomsheet.intf.IDxCListenerShape180S0100000_3_I2
            r14.<init>(r13, r0)
            X.9Jz r6 = new X.9Jz
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            return r6
        L_0x0280:
            X.AK6 r6 = (X.AK6) r6
            r1 = 0
            X.C04220Ms.A0B(r6, r1)
            android.view.View r2 = r6.A00
            java.lang.Object r1 = r0.A03
            X.B5b r1 = (X.B5b) r1
            X.7wo r4 = new X.7wo
            r4.<init>(r2, r6, r1)
            java.lang.Object r1 = r0.A04
            X.9Ea r1 = (X.C154839Ea) r1
            X.C3G r3 = r1.A01
            java.lang.Object r2 = r0.A00
            com.instagram.model.reels.Reel r2 = (com.instagram.model.reels.Reel) r2
            java.lang.Object r1 = r0.A02
            X.BKU r1 = (X.BKU) r1
            java.lang.Object r0 = r0.A01
            X.BMj r0 = (X.C20066BMj) r0
            r3.Bpl(r1, r0, r2, r4)
            goto L_0x03dc
        L_0x02a8:
            X.AP0 r6 = (X.AP0) r6
            r1 = 0
            X.C04220Ms.A0B(r6, r1)
            android.view.MotionEvent r3 = r6.A00
            java.lang.Object r4 = r0.A04
            X.9Ea r4 = (X.C154839Ea) r4
            X.C04220Ms.A05(r3)
            int r1 = r3.getAction()
            boolean r1 = X.C18180wK.A1W(r1)
            r5 = 0
            if (r1 == 0) goto L_0x02ec
            java.lang.Object r1 = r0.A01
            X.9BI r1 = (X.AnonymousClass9BI) r1
            X.L2L r1 = r1.A0A
            if (r1 != 0) goto L_0x02ec
            java.lang.Object r1 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1210000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1210000_I2) r1
            if (r1 == 0) goto L_0x02f1
            java.lang.Object r0 = r1.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2) r0
            java.lang.Object r1 = r0.A02
            X.0YY r1 = (X.AnonymousClass0YY) r1
            X.C2o r0 = r4.A00
            java.lang.String r0 = X.C18230wP.A0n(r0)
        L_0x02de:
            java.lang.Object r1 = r1.invoke(r0)
        L_0x02e2:
            android.view.View$OnTouchListener r1 = (android.view.View.OnTouchListener) r1
            if (r1 == 0) goto L_0x02ec
            android.view.View r0 = r6.A01
            boolean r5 = r1.onTouch(r0, r3)
        L_0x02ec:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            return r6
        L_0x02f1:
            java.lang.Object r1 = r0.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4120000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4120000_I2) r1
            if (r1 == 0) goto L_0x0308
            java.lang.Object r0 = r1.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r0
            java.lang.Object r2 = r0.A01
            X.0YP r2 = (X.AnonymousClass0YP) r2
            X.C3G r1 = r4.A01
            X.C2o r0 = r4.A00
            java.lang.Object r1 = r2.invoke(r1, r0)
            goto L_0x02e2
        L_0x0308:
            java.lang.Object r0 = r0.A03
            X.9Bd r0 = (X.C154259Bd) r0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r0 = r0.A04
            java.lang.Object r0 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1210000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1210000_I2) r0
            java.lang.Object r0 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2) r0
            java.lang.Object r1 = r0.A02
            X.0YY r1 = (X.AnonymousClass0YY) r1
            X.C2o r0 = r4.A00
            java.lang.String r0 = r0.getModuleName()
            goto L_0x02de
        L_0x0321:
            X.1R8 r6 = (X.AnonymousClass1R8) r6
            r4 = 0
            X.C04220Ms.A0B(r6, r4)
            java.lang.Object r3 = r0.A00
            android.content.Context r3 = (android.content.Context) r3
            r2 = 0
            r1 = 2131828058(0x7f111d5a, float:1.9289046E38)
            X.C63813iO.A03(r3, r2, r1, r4)
            java.lang.Object r2 = r0.A04
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            X.C1184570z.A00(r6, r2)
            java.lang.Object r1 = r0.A03
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.C1184570z.A01(r2, r1)
            java.lang.Object r2 = r0.A01
            X.EHB r2 = (X.EHB) r2
            java.lang.Object r1 = r0.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.CUH r0 = r2.A00
            X.CW6 r0 = r0.A09
            r0.A0B(r1)
            goto L_0x03dc
        L_0x0351:
            X.1R8 r6 = (X.AnonymousClass1R8) r6
            r4 = 0
            X.C04220Ms.A0B(r6, r4)
            java.lang.Object r3 = r0.A00
            android.content.Context r3 = (android.content.Context) r3
            r2 = 0
            r1 = 2131834761(0x7f113789, float:1.9302641E38)
            X.C63813iO.A03(r3, r2, r1, r4)
            java.lang.Object r2 = r0.A04
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            X.C1184570z.A00(r6, r2)
            java.lang.Object r1 = r0.A03
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.C1184570z.A01(r2, r1)
            java.lang.Object r1 = r0.A01
            X.EHB r1 = (X.EHB) r1
            java.lang.Object r2 = r0.A02
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            X.CUH r1 = r1.A00
            X.CW6 r0 = r1.A09
            r0.A0B(r2)
            com.instagram.service.session.UserSession r0 = r1.A04
            boolean r0 = X.C19573AyZ.A06(r0, r2)
            if (r0 == 0) goto L_0x03dc
            androidx.fragment.app.FragmentActivity r0 = r1.getActivity()
            if (r0 == 0) goto L_0x03dc
            X.C18180wK.A12(r1)
            goto L_0x03dc
        L_0x0391:
            android.view.View r2 = X.C86124wJ.A0L(r6)
            java.lang.Object r1 = r0.A01
            X.C3g r1 = (X.C21855C3g) r1
            java.lang.Object r5 = r0.A00
            X.9Ai r5 = (X.C154069Ai) r5
            java.lang.Object r6 = r0.A04
            X.23S r6 = (X.AnonymousClass23S) r6
            java.lang.Object r3 = r0.A02
            com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo r3 = (com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo) r3
            java.lang.Object r4 = r0.A03
            com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo r4 = (com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo) r4
            r1.Ca9(r2, r3, r4, r5, r6)
            goto L_0x03dc
        L_0x03ad:
            java.lang.Object r2 = r0.A04
            X.9F7 r2 = (X.AnonymousClass9F7) r2
            boolean r1 = r2.A07
            if (r1 != 0) goto L_0x03df
            X.Lu1 r1 = r2.A01
            java.lang.Object r1 = r1.A02
            boolean r1 = X.AnonymousClass0wJ.A1X(r1)
            if (r1 == 0) goto L_0x03df
            java.lang.Object r3 = r0.A00
            X.Acd r3 = (X.C18266Acd) r3
            java.lang.String r1 = r2.A04
            if (r1 == 0) goto L_0x03f2
            int r1 = android.graphics.Color.parseColor(r1)
        L_0x03cb:
            java.lang.Object r0 = r0.A02
            X.Lu1 r0 = (X.Lu1) r0
            java.lang.Object r0 = r0.A02
            float r0 = X.C18240wQ.A00(r0)
            X.C56 r0 = X.AnonymousClass9F7.A00(r0, r1)
            r3.A00(r0)
        L_0x03dc:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        L_0x03df:
            java.lang.Object r1 = r0.A01
            X.74p r1 = (X.C1193274p) r1
            X.C1193274p.A00(r1)
            java.lang.Object r3 = r0.A00
            X.Acd r3 = (X.C18266Acd) r3
            java.lang.Object r2 = r0.A03
            X.B5b r2 = (X.B5b) r2
            r1 = 2131100241(0x7f060251, float:1.7812858E38)
            goto L_0x03f9
        L_0x03f2:
            java.lang.Object r2 = r0.A03
            X.B5b r2 = (X.B5b) r2
            r1 = 2131099740(0x7f06005c, float:1.7811842E38)
        L_0x03f9:
            int r1 = X.C19556AyH.A02(r2, r1)
            goto L_0x03cb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape4S0500000_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
