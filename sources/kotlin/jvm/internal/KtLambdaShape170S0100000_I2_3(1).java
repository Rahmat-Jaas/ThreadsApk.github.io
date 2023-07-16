package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.C02220Ah;

public class KtLambdaShape170S0100000_I2_3 extends C02220Ah implements AnonymousClass0YP {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape170S0100000_I2_3(Object obj, int i) {
        super(2);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01c8, code lost:
        if (r5 == r2) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01e8, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01eb, code lost:
        if (r2 == null) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0329, code lost:
        r0.CuJ();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r43, java.lang.Object r44) {
        /*
            r42 = this;
            r7 = r42
            r5 = r44
            r0 = r43
            int r1 = r7.A01
            switch(r1) {
                case 0: goto L_0x0361;
                case 1: goto L_0x0349;
                case 2: goto L_0x032d;
                case 3: goto L_0x02f9;
                case 4: goto L_0x02ea;
                case 5: goto L_0x028e;
                case 6: goto L_0x027c;
                case 7: goto L_0x022c;
                case 8: goto L_0x020a;
                case 9: goto L_0x0020;
                case 10: goto L_0x01ad;
                default: goto L_0x000b;
            }
        L_0x000b:
            r1 = 1
            X.C04220Ms.A0B(r5, r1)
            java.lang.Object r4 = r7.A00
            X.0YP[] r4 = (X.AnonymousClass0YP[]) r4
            int r3 = r4.length
            r2 = 0
        L_0x0015:
            if (r2 >= r3) goto L_0x0371
            r1 = r4[r2]
            java.lang.Object r0 = r1.invoke(r0, r5)
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0020:
            X.8nY r0 = (X.C147188nY) r0
            int r1 = X.AnonymousClass0wJ.A04(r5)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x0031
            boolean r1 = r0.BCM()
            if (r1 != 0) goto L_0x0329
        L_0x0031:
            java.lang.Object r2 = r7.A00
            X.5wt r2 = (X.AnonymousClass5wt) r2
            X.6lo r1 = r2.A00
            if (r1 == 0) goto L_0x01a8
            X.BKU r1 = r1.A01
            X.BKN r1 = r1.A0f
            com.instagram.user.model.User r1 = r1.A1i
            r21 = r1
            if (r1 == 0) goto L_0x01a8
            X.0Ok r3 = X.C06810aP.A01
            X.0Oa r1 = r2.A02
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r1)
            com.instagram.user.model.User r20 = r3.A01(r1)
            X.8fk r3 = X.AnonymousClass7KV.A00
            X.7Wm r19 = androidx.compose.ui.Modifier.A00(r0)
            X.8jl r1 = X.AnonymousClass7J3.A07
            r40 = 48
            X.8ly r8 = X.AnonymousClass72M.A00(r1, r0, r3)
            r15 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            X.534 r14 = X.C147188nY.A0b(r0, r15)
            java.lang.Object r7 = r0.AEA(r14)
            X.534 r13 = X.AnonymousClass7DE.A07
            java.lang.Object r6 = r0.AEA(r13)
            X.534 r12 = X.AnonymousClass7DE.A0B
            java.lang.Object r5 = r0.AEA(r12)
            X.0ZU r11 = X.AnonymousClass74X.A00
            X.0YM r4 = X.C98236Es.A00(r19)
            r1 = r0
            X.7W3 r1 = (X.AnonymousClass7W3) r1
            X.C147188nY.A0w(r0, r1, r11)
            r18 = 0
            r3 = r18
            r1.A0T = r3
            X.0YP r10 = X.AnonymousClass74X.A03
            X.0YP r17 = X.AnonymousClass7Ak.A00(r0, r8, r7, r10)
            X.0YP r9 = X.AnonymousClass74X.A02
            X.0YP r8 = X.AnonymousClass7Ak.A01(r0, r6, r9)
            java.lang.Integer r16 = X.AnonymousClass7KP.A05(r0, r5, r8, r4)
            r7 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.Cvb(r7)
            r3 = 1575752067(0x5dec1183, float:2.12631516E18)
            r0.Cvb(r3)
            r3 = 36
            float r3 = (float) r3
            r4 = r3
            r3 = 18
            float r3 = (float) r3
            r22 = r3
            r25 = 0
            r3 = r18
            float r6 = (float) r3
            r5 = r19
            r3 = r22
            androidx.compose.ui.Modifier r3 = X.AnonymousClass7K4.A05(r5, r6, r4, r6, r3)
            X.8ly r4 = X.AnonymousClass7KV.A06(r0)
            java.lang.Object r6 = X.C147188nY.A0t(r0, r14, r15)
            java.lang.Object r13 = r0.AEA(r13)
            java.lang.Object r12 = r0.AEA(r12)
            X.0YM r5 = X.C98236Es.A00(r3)
            X.C147188nY.A0w(r0, r1, r11)
            r3 = r18
            r1.A0T = r3
            X.AnonymousClass7Ak.A02(r0, r4, r10)
            r3 = r17
            X.AnonymousClass7Ak.A02(r0, r6, r3)
            X.7KP r4 = X.AnonymousClass7KP.A03(r0, r13, r12, r9, r8)
            r3 = r16
            r5.invoke(r4, r0, r3)
            r0.Cvb(r7)
            r3 = 37389471(0x23a849f, float:1.3703182E-37)
            r0.Cvb(r3)
            r3 = -1815594274(0xffffffff93c83ade, float:-5.0545145E-27)
            r0.Cvb(r3)
            r3 = 1
            r5 = r20
            r4 = r21
            com.instagram.user.model.User[] r4 = new com.instagram.user.model.User[]{r5, r4}
            java.util.List r4 = X.C06750aI.A17(r4)
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0w(r4)
            java.util.Iterator r6 = r4.iterator()
        L_0x0108:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x0123
            com.instagram.user.model.User r4 = X.C18220wO.A0c(r6)
            com.instagram.common.typedurl.ImageUrl r4 = r4.B4M()
            X.6uo r5 = X.C120577Bm.A01(r0, r4)
            X.61f r4 = new X.61f
            r4.<init>(r5)
            r7.add(r4)
            goto L_0x0108
        L_0x0123:
            r4 = r18
            X.AnonymousClass7W3.A0w(r1, r4)
            r4 = 8
            X.AnonymousClass70W.A01(r0, r7, r4)
            X.AnonymousClass7W3.A0v(r1, r3)
            X.8jm r5 = r2.A01
            r4 = r19
            androidx.compose.ui.Modifier r23 = X.AnonymousClass7K4.A02(r5, r4)
            r4 = 2131100092(0x7f0601bc, float:1.7812556E38)
            long r35 = X.AnonymousClass6FG.A00(r0, r4)
            r4 = 2131826753(0x7f111841, float:1.92864E38)
            java.lang.String r28 = X.AnonymousClass7JS.A01(r0, r4)
            X.7J9 r4 = X.C120537Bh.A02(r0)
            X.7If r4 = r4.A05
            r6 = 3
            r37 = 0
            X.7Ee r27 = X.C121117Ee.A01(r6)
            r34 = 1976(0x7b8, float:2.769E-42)
            r22 = r0
            r24 = r4
            r26 = r25
            r29 = r18
            r30 = r18
            r31 = r18
            r32 = r18
            r33 = r18
            r39 = r18
            X.AnonymousClass7I9.A02(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39)
            r4 = r19
            androidx.compose.ui.Modifier r23 = X.AnonymousClass7K4.A02(r5, r4)
            r4 = 2131100109(0x7f0601cd, float:1.781259E38)
            long r35 = X.AnonymousClass6FG.A00(r0, r4)
            r5 = 2131826752(0x7f111840, float:1.9286397E38)
            java.lang.String r4 = r21.BK7()
            java.lang.String r28 = X.AnonymousClass7JS.A02(r0, r4, r5)
            X.7If r24 = X.AnonymousClass7J9.A02(r0)
            X.7Ee r27 = X.C121117Ee.A01(r6)
            X.AnonymousClass7I9.A02(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39)
            androidx.compose.ui.Modifier r37 = androidx.compose.ui.Modifier.A04(r19)
            r5 = 29
            kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21 r4 = new kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21
            r4.<init>(r2, r5)
            r41 = 4
            r36 = r0
            r38 = r4
            r39 = r25
            X.C1191773v.A00(r36, r37, r38, r39, r40, r41)
            X.AnonymousClass7W3.A0v(r1, r3)
            goto L_0x036f
        L_0x01a8:
            X.AnonymousClass5wt.A00(r2)
            goto L_0x036f
        L_0x01ad:
            int r4 = X.AnonymousClass0wJ.A04(r0)
            X.8sH r5 = (X.C148848sH) r5
            r3 = r4
            X.8fF r1 = r5.Aqq()
            java.lang.Object r0 = r7.A00
            X.Egl r0 = (X.C27233Egl) r0
            X.Ew2 r0 = r0.A03
            X.8sH r2 = r0.AOA(r1)
            X.868 r0 = X.C148838sG.A00
            if (r1 == r0) goto L_0x01d1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r2) goto L_0x01cc
        L_0x01ca:
            int r3 = r4 + 1
        L_0x01cc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        L_0x01d1:
            X.8sG r5 = (X.C148838sG) r5
        L_0x01d3:
            if (r5 == 0) goto L_0x01e8
            if (r5 == r2) goto L_0x01e9
            boolean r0 = r5 instanceof X.C27399Emr
            if (r0 == 0) goto L_0x01e9
            X.EfE r5 = (X.C27178EfE) r5
            java.lang.Object r0 = r5._parentHandle
            X.8sM r0 = (X.C148898sM) r0
            if (r0 == 0) goto L_0x01e8
            X.8sG r5 = r0.Azz()
            goto L_0x01d3
        L_0x01e8:
            r5 = 0
        L_0x01e9:
            if (r5 != r2) goto L_0x01ee
            if (r2 != 0) goto L_0x01ca
            goto L_0x01cc
        L_0x01ee:
            java.lang.String r0 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            r1.append(r5)
            java.lang.String r0 = ", expected child of "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            java.lang.String r0 = X.C18180wK.A0i(r0, r1)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x020a:
            X.AnonymousClass0wJ.A1N(r0, r5)
            r1 = 467(0x1d3, float:6.54E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x036f
            java.lang.Object r0 = r7.A00
            X.CUf r0 = (X.C22323CUf) r0
            X.0Oa r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.57Q r0 = (X.AnonymousClass57Q) r0
            X.4wE r0 = r0.A03
            r0.CrC(r5)
            goto L_0x036f
        L_0x022c:
            int r6 = X.AnonymousClass0wJ.A04(r0)
            boolean r5 = X.AnonymousClass0wJ.A1X(r5)
            java.lang.Object r0 = r7.A00
            X.CUf r0 = (X.C22323CUf) r0
            X.0Oa r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.57Q r0 = (X.AnonymousClass57Q) r0
            X.4wE r4 = r0.A04
            java.lang.Object r1 = r4.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            java.util.ArrayList r3 = X.C18200wM.A0s(r1)
            java.util.Iterator r2 = r3.iterator()
        L_0x0254:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x027a
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0011000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0011000_I2) r0
            int r0 = r0.A00
            if (r0 != r6) goto L_0x0254
        L_0x0265:
            int r2 = r3.indexOf(r1)
            r3.get(r2)
            r1 = 5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0011000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0011000_I2
            r0.<init>(r6, r5, r1)
            r3.set(r2, r0)
            r4.CrC(r3)
            goto L_0x036f
        L_0x027a:
            r1 = 0
            goto L_0x0265
        L_0x027c:
            r0 = 1
            X.C04220Ms.A0B(r5, r0)
            X.060 r0 = X.AnonymousClass060.ON_PAUSE
            if (r5 != r0) goto L_0x036f
            java.lang.Object r1 = r7.A00
            X.8pE r1 = (X.C147368pE) r1
            r0 = 0
            r1.CrC(r0)
            goto L_0x036f
        L_0x028e:
            X.8nY r0 = (X.C147188nY) r0
            int r1 = X.AnonymousClass0wJ.A04(r5)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x029f
            boolean r1 = r0.BCM()
            if (r1 != 0) goto L_0x0329
        L_0x029f:
            java.lang.Object r10 = r7.A00
            X.CTp r10 = (X.CTp) r10
            X.0Oa r1 = r10.A05
            java.lang.Object r9 = r1.getValue()
            X.C88 r9 = (X.C88) r9
            r1 = 6
            kotlin.jvm.internal.KtLambdaShape134S0100000_I2_114 r8 = new kotlin.jvm.internal.KtLambdaShape134S0100000_I2_114
            r8.<init>(r10, r1)
            r1 = 28
            kotlin.jvm.internal.IDxRImplShape184S0000000_4_I2 r7 = new kotlin.jvm.internal.IDxRImplShape184S0000000_4_I2
            r7.<init>(r10, r1)
            r2 = 8
            kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21 r6 = new kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21
            r6.<init>(r10, r2)
            X.8DX r5 = new X.8DX
            r5.<init>(r10)
            r1 = 7
            kotlin.jvm.internal.KtLambdaShape134S0100000_I2_114 r4 = new kotlin.jvm.internal.KtLambdaShape134S0100000_I2_114
            r4.<init>(r10, r1)
            kotlin.jvm.internal.KtLambdaShape134S0100000_I2_114 r3 = new kotlin.jvm.internal.KtLambdaShape134S0100000_I2_114
            r3.<init>(r10, r2)
            r2 = 9
            kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21 r1 = new kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21
            r1.<init>(r10, r2)
            r19 = 32776(0x8008, float:4.5929E-41)
            r10 = r0
            r11 = r9
            r12 = r8
            r13 = r7
            r14 = r4
            r15 = r3
            r16 = r6
            r17 = r1
            r18 = r5
            X.AnonymousClass7KL.A08(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x036f
        L_0x02ea:
            android.view.View r0 = (android.view.View) r0
            X.C13 r5 = (X.C13) r5
            X.AnonymousClass0wJ.A1N(r0, r5)
            java.lang.Object r1 = r7.A00
            X.BKU r1 = (X.BKU) r1
            r5.Ca6(r0, r1)
            goto L_0x036f
        L_0x02f9:
            X.8nY r0 = (X.C147188nY) r0
            int r1 = X.AnonymousClass0wJ.A04(r5)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x030a
            boolean r1 = r0.BCM()
            if (r1 != 0) goto L_0x0329
        L_0x030a:
            java.lang.Object r3 = r7.A00
            java.util.Map r3 = (java.util.Map) r3
            java.util.Set r1 = r3.keySet()
            java.util.List r4 = X.AnonymousClass00J.A0N(r1)
            r2 = 30
            kotlin.jvm.internal.KtLambdaShape165S0100000_I2_20 r1 = new kotlin.jvm.internal.KtLambdaShape165S0100000_I2_20
            r1.<init>(r3, r2)
            r3 = 0
            r7 = 8
            r8 = 12
            r2 = r0
            r5 = r1
            r6 = r3
            X.AnonymousClass7Hw.A04(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x036f
        L_0x0329:
            r0.CuJ()
            goto L_0x036f
        L_0x032d:
            com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo r0 = (com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo) r0
            java.lang.String r5 = (java.lang.String) r5
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.Object r1 = r7.A00
            X.9Pd r1 = (X.AnonymousClass9Pd) r1
            X.8vN r1 = X.AnonymousClass9Pd.A04(r1)
            X.0Oa r1 = r1.A0T
            java.lang.Object r1 = r1.getValue()
            X.C0t r1 = (X.C21794C0t) r1
            r1.C7b(r0, r5)
            goto L_0x036f
        L_0x0349:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r0
            X.BKU r5 = (X.BKU) r5
            X.AnonymousClass0wJ.A1N(r0, r5)
            java.lang.Object r1 = r7.A00
            X.9TG r1 = (X.AnonymousClass9TG) r1
            com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment r2 = r1.A04
            X.At4 r1 = r2.A0A
            r1.A00(r5)
            X.At4 r1 = r2.A0A
            r1.A01(r0)
            goto L_0x036f
        L_0x0361:
            android.view.View r0 = (android.view.View) r0
            java.lang.String r5 = (java.lang.String) r5
            X.AnonymousClass0wJ.A1N(r0, r5)
            java.lang.Object r0 = r7.A00
            X.Dl3 r0 = (X.C25403Dl3) r0
            X.C25403Dl3.A00(r0)
        L_0x036f:
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x0371:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape170S0100000_I2_3.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
