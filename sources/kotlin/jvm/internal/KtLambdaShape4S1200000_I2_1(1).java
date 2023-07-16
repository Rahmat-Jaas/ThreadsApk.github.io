package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape4S1200000_I2_1 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape4S1200000_I2_1(Object obj, Object obj2, String str, int i) {
        super(1);
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0511, code lost:
        r7 = r6.onTouch(r1.A01, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x051b, code lost:
        return java.lang.Boolean.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x05f2, code lost:
        if (r0.A02.length() > 0) goto L_0x05f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x068b, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x06f0, code lost:
        r3 = (com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000) r0.A00;
        r3.A0D((java.lang.String) r1.A00, "platform_trust_token");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0705, code lost:
        return r5.A00((X.C113806sA) r4, r3, r0.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0321, code lost:
        if (r6 != null) goto L_0x0511;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r32) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            int r2 = r0.A03
            switch(r2) {
                case 3: goto L_0x06d5;
                case 4: goto L_0x06c0;
                case 5: goto L_0x068c;
                case 6: goto L_0x0674;
                case 7: goto L_0x0604;
                case 8: goto L_0x05cc;
                case 9: goto L_0x05a7;
                case 10: goto L_0x0566;
                case 11: goto L_0x0545;
                case 12: goto L_0x051e;
                case 13: goto L_0x04d3;
                case 14: goto L_0x03c9;
                case 15: goto L_0x03aa;
                case 16: goto L_0x0391;
                case 17: goto L_0x0376;
                case 18: goto L_0x0325;
                case 19: goto L_0x02f5;
                case 20: goto L_0x02f5;
                case 21: goto L_0x02cd;
                case 22: goto L_0x0025;
                case 23: goto L_0x02a1;
                case 24: goto L_0x0230;
                case 25: goto L_0x021b;
                case 26: goto L_0x0208;
                case 27: goto L_0x01eb;
                case 28: goto L_0x01d0;
                case 29: goto L_0x010b;
                case 30: goto L_0x0093;
                case 31: goto L_0x005c;
                default: goto L_0x0009;
            }
        L_0x0009:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r1
            X.5Dd r3 = new X.5Dd
            r3.<init>()
            java.lang.Object r2 = r0.A01
            com.fbpay.logging.LoggingContext r2 = (com.fbpay.logging.LoggingContext) r2
            X.AnonymousClass7Hr.A04(r3, r2)
            java.lang.String r2 = r0.A02
            X.C86124wJ.A1K(r3, r2)
            X.C86114wI.A1C(r1, r3)
            java.lang.Object r0 = r0.A00
            X.C86114wI.A1G(r1, r0)
        L_0x0024:
            return r1
        L_0x0025:
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            r4 = 0
            X.C04220Ms.A0B(r5, r4)
            java.lang.Object r2 = r0.A00
            X.7yC r2 = (X.C134697yC) r2
            r1 = 0
            if (r2 == 0) goto L_0x003c
            boolean r2 = r2.A03(r5)
            if (r2 == 0) goto L_0x003c
            X.22n r1 = X.C306922n.USER_ID
            return r1
        L_0x003c:
            java.lang.String r3 = r0.A02
            int r2 = r3.length()
            if (r2 == 0) goto L_0x004d
            boolean r2 = X.AnonymousClass8bP.A0j(r5, r3, r4)
            if (r2 == 0) goto L_0x004d
            X.22n r1 = X.C306922n.SESSION_TOKEN
            return r1
        L_0x004d:
            java.lang.Object r0 = r0.A01
            X.7yC r0 = (X.C134697yC) r0
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.A03(r5)
            if (r0 == 0) goto L_0x0024
            X.22n r1 = X.C306922n.USERNAME
            return r1
        L_0x005c:
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            java.lang.Object r6 = r0.A01
            X.74p r6 = (X.C1193274p) r6
            X.M0S.A00()
            java.lang.Object r5 = r6.A00
            X.6fG r5 = (X.C106576fG) r5
            java.lang.String r4 = r0.A02
            X.C04220Ms.A0B(r4, r2)
            java.util.Map r3 = r5.A00
            java.lang.Object r2 = r3.get(r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x0080
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0689
        L_0x0080:
            java.lang.Object r0 = r0.A00
            X.C86134wK.A1L(r0, r1)
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            r3.put(r4, r0)
            X.M0S.A00()
            r6.A00 = r5
            goto L_0x0689
        L_0x0093:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1410000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1410000_I2) r1
            r10 = 0
            X.C04220Ms.A0B(r1, r10)
            java.lang.Object r5 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r5 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r5
            java.lang.String r6 = r0.A02
            java.lang.Object r4 = r0.A01
            X.7Jj r4 = (X.C121997Jj) r4
            r11 = 1
            X.C04220Ms.A0B(r5, r11)
            X.AnonymousClass0wJ.A1Q(r6, r4)
            java.lang.Object r3 = r1.A03
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r2 = r3.iterator()
            r9 = 0
        L_0x00b3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r2.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.C04220Ms.A0I(r0, r6)
            if (r0 != 0) goto L_0x00cb
            int r9 = r9 + 1
            goto L_0x00b3
        L_0x00ca:
            r9 = -1
        L_0x00cb:
            java.util.ArrayList r8 = X.C18200wM.A0s(r3)
            java.lang.Object r7 = r3.get(r9)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2 r7 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2) r7
            r6 = 0
            java.lang.String r3 = r5.A02
            java.lang.Object r0 = r5.A00
            java.util.HashMap r0 = (java.util.HashMap) r0
            X.C04220Ms.A0B(r3, r10)
            X.C04220Ms.A0B(r0, r11)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2
            r2.<init>((X.C121997Jj) r4, (java.lang.String) r3, (java.util.HashMap) r0)
            r0 = 479(0x1df, float:6.71E-43)
            X.93t r5 = new X.93t
            r5.<init>(r2, r0)
            java.lang.Object r4 = r7.A01
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedComponentType r4 = (com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedComponentType) r4
            java.lang.String r3 = r7.A03
            int r2 = r7.A00
            X.C04220Ms.A0B(r4, r10)
            X.C04220Ms.A0B(r3, r11)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2
            r0.<init>((X.C1533493t) r5, (com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedComponentType) r4, (java.lang.String) r3, (int) r2)
            r8.set(r9, r0)
            r0 = 62
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1410000_I2 r1 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1410000_I2.A00(r1, r6, r8, r0)
            return r1
        L_0x010b:
            X.93z r1 = (X.C1533793z) r1
            r11 = 0
            X.C04220Ms.A0B(r1, r11)
            java.lang.String r13 = r0.A02
            java.lang.Object r2 = r0.A01
            X.5z2 r2 = (X.AnonymousClass5z2) r2
            java.lang.Object r12 = r2.A00
            X.65D r12 = (X.AnonymousClass65D) r12
            X.9tu r10 = X.C169789tu.Idle
            r9 = 1
            X.AnonymousClass0wJ.A1M(r13, r9, r12)
            java.util.List r2 = r1.A08
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0w(r2)
            java.util.Iterator r16 = r2.iterator()
        L_0x012b:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x01af
            java.lang.Object r7 = r16.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r7 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r7
            java.lang.Object r2 = r7.A00
            X.5uG r2 = (X.AnonymousClass5uG) r2
            X.65D r2 = r2.A07
            if (r2 == 0) goto L_0x01aa
            java.lang.String r2 = r2.A03
            boolean r2 = X.C04220Ms.A0I(r2, r13)
            if (r2 != r9) goto L_0x01aa
            java.lang.Object r2 = r7.A00
            X.5uG r2 = (X.AnonymousClass5uG) r2
            X.65D r14 = r2.A07
            X.C04220Ms.A0A(r14)
            java.lang.Object r2 = r7.A00
            X.5uG r2 = (X.AnonymousClass5uG) r2
            java.util.ArrayList r4 = r14.A04
            java.util.ArrayList r3 = r12.A04
            java.util.List r3 = X.AnonymousClass00J.A0V(r3, r4)
            java.util.ArrayList r30 = X.C18200wM.A0s(r3)
            java.lang.String r6 = r12.A03
            com.instagram.shopping.model.destination.home.ProductFeedHeader r5 = r14.A02
            com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo r4 = r14.A01
            com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo r3 = r14.A00
            X.65D r25 = new X.65D
            r26 = r3
            r27 = r4
            r28 = r5
            r29 = r6
            r25.<init>(r26, r27, r28, r29, r30)
            X.65D r3 = r2.A06
            r17 = r3
            X.9oT r3 = r2.A02
            r20 = r3
            X.9oR r3 = r2.A03
            r21 = r3
            com.instagram.shopping.model.destination.home.MerchantPreviewSection r3 = r2.A04
            r22 = r3
            X.9oS r15 = r2.A05
            com.instagram.shopping.model.destination.home.ProductSection r14 = r2.A08
            X.65C r6 = r2.A0A
            X.9oQ r5 = r2.A09
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0100000_I2_1 r4 = r2.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1300000_I2 r3 = r2.A00
            X.5uG r2 = new X.5uG
            r23 = r15
            r24 = r17
            r26 = r14
            r27 = r5
            r28 = r6
            r17 = r2
            r18 = r3
            r19 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r7 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2.A00(r7, r2)
        L_0x01aa:
            r8.add(r7)
            goto L_0x012b
        L_0x01af:
            r12 = 0
            r20 = 8189(0x1ffd, float:1.1475E-41)
            r13 = r12
            r14 = r12
            r15 = r1
            r16 = r12
            r17 = r8
            r18 = r12
            r19 = r12
            r21 = r11
            r22 = r11
            X.93z r1 = X.C1533793z.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r0 = r0.A00
            com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo r0 = (com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo) r0
            java.lang.String r0 = r0.A04
            X.93z r1 = X.C19490AxD.A02(r10, r1, r0)
            return r1
        L_0x01d0:
            java.lang.String r2 = X.C18210wN.A0f(r1)
            java.lang.String r1 = r0.A02
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01df
            java.lang.Object r1 = r0.A01
            return r1
        L_0x01df:
            java.lang.Object r0 = r0.A00
            X.C2Q r0 = (X.C2Q) r0
            java.util.List r1 = r0.B9T(r2)
            X.C04220Ms.A06(r1)
            return r1
        L_0x01eb:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1100000_I2_1 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1100000_I2_1) r1
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            java.lang.String r4 = r0.A02
            java.lang.Object r3 = r0.A00
            r2 = 48
            kotlin.jvm.internal.KtLambdaShape164S0100000_I2_19 r0 = new kotlin.jvm.internal.KtLambdaShape164S0100000_I2_19
            r0.<init>(r3, r2)
            java.util.Map r2 = X.AnonymousClass8vI.A02(r1, r4, r0)
            r0 = 15
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1100000_I2_1 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1100000_I2_1
            r1.<init>((java.lang.String) r4, (int) r0, (java.util.Map) r2)
            return r1
        L_0x0208:
            android.view.View r3 = X.C86124wJ.A0L(r1)
            java.lang.Object r2 = r0.A00
            X.C2P r2 = (X.C2P) r2
            java.lang.String r1 = r0.A02
            java.lang.Object r0 = r0.A01
            X.65D r0 = (X.AnonymousClass65D) r0
            r2.C7Z(r3, r0, r1)
            goto L_0x0689
        L_0x021b:
            android.view.View r3 = X.C86124wJ.A0L(r1)
            java.lang.Object r2 = r0.A00
            X.C2P r2 = (X.C2P) r2
            java.lang.Object r1 = r0.A01
            X.65D r1 = (X.AnonymousClass65D) r1
            com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo r1 = r1.A00
            java.lang.String r0 = r0.A02
            r2.C7c(r3, r1, r0)
            goto L_0x0689
        L_0x0230:
            X.AhB r1 = (X.C18535AhB) r1
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            java.lang.Object r5 = r0.A00
            X.KRJ r5 = (X.KRJ) r5
            boolean r2 = r5.A03
            if (r2 == 0) goto L_0x029e
            java.lang.Integer r2 = X.AnonymousClass006.A00
        L_0x0240:
            int r2 = r2.intValue()
            if (r2 == 0) goto L_0x029b
            java.lang.String r3 = "off"
        L_0x0248:
            java.lang.String r2 = "camera_status"
            r1.A04(r2, r3)
            boolean r2 = r5.A04
            if (r2 == 0) goto L_0x0298
            java.lang.Integer r2 = X.AnonymousClass006.A00
        L_0x0253:
            int r2 = r2.intValue()
            if (r2 == 0) goto L_0x0295
            java.lang.String r3 = "off"
        L_0x025b:
            java.lang.String r2 = "microphone_status"
            r1.A04(r2, r3)
            java.lang.Object r4 = r0.A01
            X.AyU r4 = (X.C19568AyU) r4
            java.lang.Integer r2 = r4.A0L
            int r2 = r2.intValue()
            switch(r2) {
                case 0: goto L_0x0292;
                case 1: goto L_0x028f;
                default: goto L_0x026d;
            }
        L_0x026d:
            java.lang.String r3 = "backgrounded"
        L_0x026f:
            java.lang.String r2 = "screen_mode"
            r1.A04(r2, r3)
            java.lang.String r2 = r0.A02
            java.lang.String r0 = "action"
            r1.A04(r0, r2)
            java.lang.String r2 = r4.A0M
            r0 = 97
            java.lang.String r0 = X.I17.A00(r0)
            r1.A04(r0, r2)
            java.lang.String r2 = r5.A01
            java.lang.String r0 = "reason"
            r1.A04(r0, r2)
            goto L_0x0689
        L_0x028f:
            java.lang.String r3 = "minimized"
            goto L_0x026f
        L_0x0292:
            java.lang.String r3 = "full"
            goto L_0x026f
        L_0x0295:
            java.lang.String r3 = "on"
            goto L_0x025b
        L_0x0298:
            java.lang.Integer r2 = X.AnonymousClass006.A01
            goto L_0x0253
        L_0x029b:
            java.lang.String r3 = "on"
            goto L_0x0248
        L_0x029e:
            java.lang.Integer r2 = X.AnonymousClass006.A01
            goto L_0x0240
        L_0x02a1:
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            X.CQm r2 = X.C22255CQm.A00
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0689
            java.lang.Object r3 = r0.A01
            X.3ak r3 = (X.C62793ak) r3
            java.lang.String r4 = r0.A02
            java.lang.Object r0 = r0.A00
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r5 = r0.A00
            java.lang.String r5 = (java.lang.String) r5
            X.4qz r1 = X.AnonymousClass3J5.A00(r3)
            r6 = 0
            r7 = 12
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S2201000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S2201000_I2
            r2.<init>((java.lang.Object) r3, (java.lang.String) r4, (java.lang.String) r5, (X.C146958n9) r6, (int) r7)
            r0 = 3
            X.C25237DiI.A00(r6, r6, r2, r1, r0)
            goto L_0x0689
        L_0x02cd:
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r1 = (com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder) r1
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            java.lang.Object r5 = r0.A00
            java.lang.Object r4 = r0.A01
            java.lang.String r6 = r0.A02
            r7 = 0
            r8 = 15
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S1200000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S1200000_I2
            r3.<init>(r4, r5, r6, r7, r8)
            X.4Ej r2 = new X.4Ej
            r2.<init>(r3)
            X.3AQ r0 = new X.3AQ
            r0.<init>(r2)
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder.A00(r0, r1)
            X.4Ek r0 = X.AnonymousClass3XQ.A06
            r1.A03(r0)
            goto L_0x0689
        L_0x02f5:
            X.AP0 r1 = (X.AP0) r1
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            android.view.MotionEvent r5 = r1.A00
            java.lang.Object r6 = r0.A01
            X.9Ea r6 = (X.C154839Ea) r6
            X.C04220Ms.A05(r5)
            int r2 = r5.getAction()
            boolean r2 = X.C18180wK.A1W(r2)
            r7 = 0
            if (r2 == 0) goto L_0x0517
            X.C3G r4 = r6.A01
            java.lang.Object r3 = r0.A00
            X.BKU r3 = (X.BKU) r3
            java.lang.String r2 = r0.A02
            X.C2o r0 = r6.A00
            java.lang.String r0 = X.C18230wP.A0n(r0)
            android.view.View$OnTouchListener r6 = r4.CPg(r3, r2, r0)
            if (r6 == 0) goto L_0x0517
            goto L_0x0511
        L_0x0325:
            android.content.Context r1 = (android.content.Context) r1
            r3 = 0
            X.C04220Ms.A0B(r1, r3)
            java.lang.Object r2 = r0.A01
            X.Ari r2 = (X.C19166Ari) r2
            java.lang.Object r6 = r0.A00
            X.BKU r6 = (X.BKU) r6
            java.lang.String r7 = r0.A02
            X.BEu r5 = r2.A01
            X.BKN r2 = r6.A0f
            java.util.List r0 = r2.A5R
            if (r0 == 0) goto L_0x0374
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0374
            java.util.List r0 = r2.A5R
            java.lang.Object r4 = r0.get(r3)
            X.5L3 r4 = (X.AnonymousClass5L3) r4
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.List r0 = r4.A03
            java.util.Iterator r2 = r0.iterator()
        L_0x0355:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0367
            com.instagram.user.model.User r0 = X.C18220wO.A0c(r2)
            X.7xc r0 = X.C134397xc.A00(r0)
            r3.add(r0)
            goto L_0x0355
        L_0x0367:
            com.instagram.api.schemas.SocialContextType r0 = r4.A01
            r8 = r1
            r9 = r0
            r10 = r6
            r11 = r5
            r12 = r7
            r13 = r3
            android.graphics.drawable.Drawable r1 = X.C19894BEu.A00(r8, r9, r10, r11, r12, r13)
            return r1
        L_0x0374:
            r1 = 0
            return r1
        L_0x0376:
            X.5yt r1 = (X.C95115yt) r1
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            java.lang.Object r3 = r0.A01
            X.7Gw r3 = (X.C121577Gw) r3
            java.lang.String r4 = r0.A02
            java.lang.String r5 = r1.A00
            java.lang.Object r0 = r0.A00
            X.7kq r0 = (X.C129017kq) r0
            r1 = 0
            r2 = r1
            r6 = r1
            r7 = r1
            X.C121577Gw.A01(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0689
        L_0x0391:
            X.5yt r1 = (X.C95115yt) r1
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            java.lang.Object r2 = r0.A01
            X.7Gw r2 = (X.C121577Gw) r2
            java.lang.String r3 = r0.A02
            java.lang.String r4 = r1.A00
            java.lang.Object r0 = r0.A00
            X.7kq r0 = (X.C129017kq) r0
            r1 = 0
            r5 = r1
            X.C121577Gw.A02(r0, r1, r2, r3, r4, r5)
            goto L_0x0689
        L_0x03aa:
            X.5HY r1 = (X.AnonymousClass5HY) r1
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            java.lang.String r5 = r0.A02
            java.lang.Object r4 = r0.A00
            java.lang.Object r3 = r0.A01
            X.AnonymousClass0wJ.A1O(r5, r4)
            r0 = 3
            X.C04220Ms.A0B(r3, r0)
            r2 = 39
            kotlin.jvm.internal.KtLambdaShape43S0200000_I2_4 r0 = new kotlin.jvm.internal.KtLambdaShape43S0200000_I2_4
            r0.<init>(r2, r4, r3)
            X.5HY r1 = X.C121407Fu.A02(r1, r5, r0)
            return r1
        L_0x03c9:
            X.5HY r1 = (X.AnonymousClass5HY) r1
            r4 = 0
            X.C04220Ms.A0B(r1, r4)
            java.lang.Object r2 = r0.A01
            com.instagram.comments.mvvm.data.MediaCommentListRepository r2 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r2
            com.instagram.service.session.UserSession r6 = r2.A04
            java.lang.Object r2 = r0.A00
            X.92G r2 = (X.AnonymousClass92G) r2
            java.lang.String r2 = r2.A02
            java.lang.String r5 = r0.A02
            r3 = 2
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r20 = X.C18190wL.A0n(r0)
            boolean r23 = X.AnonymousClass0wJ.A1W(r5)
            com.instagram.user.model.User r15 = X.AnonymousClass0wJ.A0Y(r6)
            r14 = 0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r13 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2
            r13.<init>()
            java.lang.Integer r17 = X.AnonymousClass006.A0C
            java.lang.Integer r18 = X.AnonymousClass006.A01
            X.9S0 r12 = new X.9S0
            r16 = r14
            r19 = r14
            r21 = r5
            r22 = r2
            r24 = r4
            r25 = r4
            r26 = r4
            r27 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r5 == 0) goto L_0x0487
            java.util.List r0 = r1.A02
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x0419:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0464
            java.lang.Object r10 = r11.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r10 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r10
            java.lang.Object r0 = r10.A01
            X.9S0 r0 = (X.AnonymousClass9S0) r0
            java.lang.String r0 = r0.A08
            boolean r0 = X.C04220Ms.A0I(r0, r5)
            if (r0 == 0) goto L_0x0460
            java.lang.Object r9 = r10.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r9 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2) r9
            java.util.List r2 = X.C18180wK.A0n(r12)
            java.lang.Object r0 = r9.A02
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r8 = X.AnonymousClass00J.A0V(r0, r2)
            java.lang.Object r7 = r9.A01
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r0 = r9.A00
            X.5IG r0 = (X.AnonymousClass5IG) r0
            X.C04220Ms.A0B(r7, r4)
            X.C04220Ms.A0B(r0, r3)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2
            r2.<init>((X.AnonymousClass5IG) r0, (java.util.List) r7, (java.util.List) r8)
            java.lang.Object r0 = r10.A01
            X.9S0 r0 = (X.AnonymousClass9S0) r0
            X.C04220Ms.A0B(r0, r4)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r10 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r10.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2) r2, (X.AnonymousClass9S0) r0)
        L_0x0460:
            r6.add(r10)
            goto L_0x0419
        L_0x0464:
            java.util.UUID r2 = java.util.UUID.randomUUID()
            X.C04220Ms.A06(r2)
            java.lang.String r0 = r12.A08
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2 r5 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2
            r5.<init>((java.lang.String) r0, (java.util.UUID) r2)
            java.util.List r4 = r1.A03
            X.9Rz r3 = r1.A01
            boolean r2 = r1.A05
            boolean r0 = r1.A04
            X.5HY r1 = new X.5HY
            r7 = r1
            r8 = r5
            r9 = r3
            r10 = r6
            r11 = r4
            r12 = r2
            r13 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r1
        L_0x0487:
            X.0ZV r3 = X.AnonymousClass0ZV.A00
            java.lang.Integer r16 = X.AnonymousClass006.A00
            X.5IG r0 = new X.5IG
            r15 = r0
            r17 = r16
            r18 = r14
            r20 = r4
            r21 = r4
            r22 = r4
            r23 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2
            r2.<init>((X.AnonymousClass5IG) r0, (java.util.List) r3, (java.util.List) r3)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r0.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2) r2, (X.AnonymousClass9S0) r12)
            java.util.List r2 = X.C18180wK.A0n(r0)
            java.util.List r0 = r1.A03
            java.util.List r10 = X.AnonymousClass00J.A0V(r0, r2)
            java.util.UUID r2 = java.util.UUID.randomUUID()
            X.C04220Ms.A06(r2)
            java.lang.String r0 = r12.A08
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2 r5 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2
            r5.<init>((java.lang.String) r0, (java.util.UUID) r2)
            java.util.List r4 = r1.A02
            X.9Rz r3 = r1.A01
            boolean r2 = r1.A05
            boolean r0 = r1.A04
            X.5HY r1 = new X.5HY
            r6 = r1
            r7 = r5
            r8 = r3
            r9 = r4
            r11 = r2
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r1
        L_0x04d3:
            X.AP0 r1 = (X.AP0) r1
            r12 = 0
            X.C04220Ms.A0B(r1, r12)
            android.view.MotionEvent r5 = r1.A00
            X.C04220Ms.A05(r5)
            int r2 = r5.getAction()
            if (r2 != 0) goto L_0x051c
            java.lang.Object r3 = r0.A00
            X.BKU r3 = (X.BKU) r3
            java.util.List r2 = r3.A3H()
            boolean r2 = X.C18190wL.A1a(r2)
            if (r2 == 0) goto L_0x051c
            java.lang.Object r2 = r0.A01
            X.9FF r2 = (X.AnonymousClass9FF) r2
            X.B48 r2 = r2.A02
            java.lang.String r10 = r0.A02
            r0 = 1
            X.C04220Ms.A0B(r10, r0)
            androidx.fragment.app.FragmentActivity r7 = r2.A07
            com.instagram.service.session.UserSession r8 = r2.A0g
            com.instagram.user.model.User r0 = r3.A2Y()
            java.lang.String r11 = X.C86134wK.A0p(r0)
            java.lang.Integer r9 = X.AnonymousClass006.A0N
            X.9rG r6 = new X.9rG
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x0511:
            android.view.View r0 = r1.A01
            boolean r7 = r6.onTouch(r0, r5)
        L_0x0517:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            return r1
        L_0x051c:
            r7 = 0
            goto L_0x0517
        L_0x051e:
            boolean r1 = X.AnonymousClass0wJ.A1X(r1)
            java.lang.Object r3 = r0.A01
            X.Avm r3 = (X.C19404Avm) r3
            if (r1 == 0) goto L_0x0540
            X.062 r1 = r3.A04
            androidx.lifecycle.LifecycleCoroutineScopeImpl r1 = X.AnonymousClass3J3.A00(r1)
            r6 = 0
            java.lang.String r5 = r0.A02
            java.lang.Object r4 = r0.A00
            r7 = 34
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 3
            X.C25237DiI.A00(r6, r6, r2, r1, r0)
            goto L_0x0689
        L_0x0540:
            X.C19404Avm.A01(r3)
            goto L_0x0689
        L_0x0545:
            X.8mv r1 = (X.C146828mv) r1
            r3 = 0
            X.C04220Ms.A0B(r1, r3)
            java.lang.String r2 = r0.A02
            X.AnonymousClass7Aq.A02(r1, r2)
            X.AnonymousClass7Aq.A01(r1, r3)
            java.lang.Object r4 = r0.A01
            java.lang.Object r2 = r0.A00
            r0 = 35
            kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3 r3 = new kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3
            r3.<init>(r0, r2, r4)
            r2 = 0
            X.77Z r0 = X.C103976b2.A07
            X.C146828mv.A00(r0, r1, r2, r3)
            goto L_0x0689
        L_0x0566:
            int r2 = X.AnonymousClass0wJ.A04(r1)
            java.lang.Object r1 = r0.A00
            X.7yH r1 = (X.C134747yH) r1
            java.util.List r1 = r1.A07(r2, r2)
            java.lang.String r4 = r0.A02
            java.util.Iterator r3 = r1.iterator()
        L_0x0578:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x05a5
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.7HE r1 = (X.AnonymousClass7HE) r1
            java.lang.String r1 = r1.A03
            boolean r1 = X.C04220Ms.A0I(r1, r4)
            if (r1 == 0) goto L_0x0578
        L_0x058d:
            X.7HE r2 = (X.AnonymousClass7HE) r2
            if (r2 == 0) goto L_0x0689
            java.lang.Object r2 = r2.A02
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0689
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0689
            java.lang.Object r0 = r0.A01
            X.C86134wK.A1L(r0, r2)
            goto L_0x0689
        L_0x05a5:
            r2 = 0
            goto L_0x058d
        L_0x05a7:
            int r3 = X.AnonymousClass0wJ.A04(r1)
            java.lang.Object r2 = r0.A00
            X.7yH r2 = (X.C134747yH) r2
            java.lang.String r1 = "LEARN_MORE_SPAN"
            java.util.List r1 = r2.A08(r1, r3, r3)
            java.lang.Object r1 = X.AnonymousClass00J.A0D(r1)
            X.7HE r1 = (X.AnonymousClass7HE) r1
            if (r1 == 0) goto L_0x0689
            java.lang.Object r1 = r1.A02
            if (r1 == 0) goto L_0x0689
            java.lang.Object r1 = r0.A01
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.String r0 = r0.A02
            r1.invoke(r0)
            goto L_0x0689
        L_0x05cc:
            X.5J1 r1 = (X.AnonymousClass5J1) r1
            r4 = 0
            X.C04220Ms.A0B(r1, r4)
            java.lang.Object r5 = r0.A00
            X.7HD r5 = (X.AnonymousClass7HD) r5
            java.lang.Object r2 = r0.A01
            X.56Z r2 = (X.AnonymousClass56Z) r2
            X.4wE r2 = r2.A0D
            java.lang.Object r2 = r2.getValue()
            X.5IX r2 = (X.AnonymousClass5IX) r2
            java.util.List r2 = r2.A0B
            int r3 = r2.size()
            r2 = 1
            if (r3 > r2) goto L_0x05f4
            java.lang.String r0 = r0.A02
            int r0 = r0.length()
            r13 = 0
            if (r0 <= 0) goto L_0x05f5
        L_0x05f4:
            r13 = 1
        L_0x05f5:
            r6 = 0
            r11 = 1013(0x3f5, float:1.42E-42)
            r7 = r1
            r8 = r6
            r9 = r6
            r10 = r6
            r12 = r4
            r14 = r4
            r15 = r4
            X.5J1 r1 = X.AnonymousClass5J1.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r1
        L_0x0604:
            java.util.List r1 = (java.util.List) r1
            r4 = 0
            X.C04220Ms.A0B(r1, r4)
            java.lang.Object r6 = X.AnonymousClass00J.A0F(r1)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1410000_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1410000_I2) r6
            if (r6 == 0) goto L_0x0672
            java.lang.Object r3 = r6.A03
            X.BKU r3 = (X.BKU) r3
            if (r3 == 0) goto L_0x0672
            java.lang.Object r2 = r0.A01
            X.56Z r2 = (X.AnonymousClass56Z) r2
            com.instagram.service.session.UserSession r2 = r2.A09
            X.5Hp r11 = X.C100436Nh.A00(r3, r2)
        L_0x0622:
            java.lang.Object r5 = r0.A01
            X.56Z r5 = (X.AnonymousClass56Z) r5
            java.lang.String r3 = r0.A02
            java.lang.Object r0 = r0.A00
            X.5J1 r0 = (X.AnonymousClass5J1) r0
            r8 = 12
            kotlin.jvm.internal.KtLambdaShape6S0400000_I2 r7 = new kotlin.jvm.internal.KtLambdaShape6S0400000_I2
            r9 = r6
            r10 = r1
            r12 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            X.AnonymousClass56Z.A03(r5, r3, r7)
            if (r11 == 0) goto L_0x0653
            X.7HD r0 = r0.A00
            X.7yH r0 = r0.A01
            java.lang.String r2 = r0.A00
            java.lang.String r1 = r6.A04
            java.lang.String r0 = ""
            java.lang.String r2 = X.AnonymousClass8bQ.A0l(r2, r1, r0, r4)
            r1 = 14
            kotlin.jvm.internal.KtLambdaShape6S1000000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape6S1000000_I2
            r0.<init>(r2, r1)
            X.AnonymousClass56Z.A03(r5, r3, r0)
        L_0x0653:
            X.4qz r2 = X.AnonymousClass3J5.A00(r5)
            r4 = 0
            r1 = 14
            kotlin.coroutines.jvm.internal.KtSLambdaShape12S0100000_I2_1 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape12S0100000_I2_1
            r0.<init>(r5, r4, r1)
            r3 = 3
            X.C25237DiI.A00(r4, r4, r0, r2, r3)
            X.4qz r2 = X.AnonymousClass3J5.A00(r5)
            r1 = 15
            kotlin.coroutines.jvm.internal.KtSLambdaShape12S0100000_I2_1 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape12S0100000_I2_1
            r0.<init>(r5, r4, r1)
            X.C25237DiI.A00(r4, r4, r0, r2, r3)
            goto L_0x0689
        L_0x0672:
            r11 = 0
            goto L_0x0622
        L_0x0674:
            int r3 = X.AnonymousClass0wJ.A04(r1)
            java.lang.Object r1 = r0.A01
            com.instagram.api.tigon.IGTigonQuickPerformanceLogger r1 = (com.instagram.api.tigon.IGTigonQuickPerformanceLogger) r1
            X.01V r2 = r1.logger
            java.lang.Object r1 = r0.A00
            int r1 = r1.hashCode()
            java.lang.String r0 = r0.A02
            r2.markerPoint((int) r3, (int) r1, (java.lang.String) r0)
        L_0x0689:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        L_0x068c:
            X.7Kx r1 = (X.AnonymousClass7Kx) r1
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            r7 = 0
            if (r2 == 0) goto L_0x06b7
            X.7JJ r2 = X.AnonymousClass7Kz.A05()
            X.78m r2 = r2.A0C
            java.lang.Object r4 = r0.A00
            X.6mt r4 = (X.C111166mt) r4
            java.lang.Object r5 = X.AnonymousClass7Kx.A0D(r1)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = r0.A02
            java.lang.Object r0 = r0.A01
            X.57w r0 = (X.C883957w) r0
            X.587 r1 = r0.A0B
            r0 = 1
            com.facebookpay.otc.models.OtcInput r3 = r1.A02(r7, r0)
            X.M5J r1 = r2.A01(r3, r4, r5, r6, r7)
            return r1
        L_0x06b7:
            X.7Kx r0 = X.AnonymousClass7Kx.A05(r1, r7)
            X.56r r1 = X.C880856r.A04(r0)
            return r1
        L_0x06c0:
            X.79P r1 = (X.AnonymousClass79P) r1
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            java.lang.Object r2 = r0.A01
            X.7j4 r2 = (X.C128167j4) r2
            X.6oR r5 = r2.A03
            java.lang.Object r4 = r1.A01
            if (r4 != 0) goto L_0x06f0
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x06d5:
            X.79P r1 = (X.AnonymousClass79P) r1
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            java.lang.Object r2 = r0.A01
            X.7Dd r2 = (X.C120927Dd) r2
            X.0Oa r2 = r2.A02
            java.lang.Object r5 = r2.getValue()
            X.6oR r5 = (X.C111806oR) r5
            java.lang.Object r4 = r1.A01
            if (r4 != 0) goto L_0x06f0
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x06f0:
            X.6sA r4 = (X.C113806sA) r4
            java.lang.Object r3 = r0.A00
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r3 = (com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000) r3
            java.lang.Object r2 = r1.A00
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = "platform_trust_token"
            r3.A0D(r2, r1)
            java.lang.String r0 = r0.A02
            X.8kQ r1 = r5.A00(r4, r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1.invoke(java.lang.Object):java.lang.Object");
    }
}
