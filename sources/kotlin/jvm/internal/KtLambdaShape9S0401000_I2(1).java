package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.C02220Ah;

public class KtLambdaShape9S0401000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape9S0401000_I2(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(2);
        this.A05 = i2;
        this.A04 = obj;
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002a, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x03c3, code lost:
        X.AnonymousClass7W3.A0w(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x03c6, code lost:
        X.AnonymousClass7W3.A0w(r1, r2);
        X.AnonymousClass7W3.A0w(r1, r2);
        X.AnonymousClass7W3.A0e(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r33, java.lang.Object r34) {
        /*
            r32 = this;
            r1 = r32
            r0 = r33
            int r2 = r1.A05
            r3 = r34
            switch(r2) {
                case 0: goto L_0x0436;
                case 1: goto L_0x0406;
                case 2: goto L_0x03eb;
                case 3: goto L_0x02d9;
                case 4: goto L_0x02ba;
                case 5: goto L_0x029b;
                case 6: goto L_0x002b;
                case 7: goto L_0x0162;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.8nY r3 = X.C86104wH.A0H(r0, r3)
            java.lang.Object r2 = r1.A02
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            java.lang.Object r5 = r1.A01
            X.76o r5 = (X.C1197176o) r5
            java.lang.Object r4 = r1.A04
            X.6bS r4 = (X.C104236bS) r4
            java.lang.Object r6 = r1.A03
            X.0YY r6 = (X.AnonymousClass0YY) r6
            int r0 = r1.A00
            int r7 = X.C115796vv.A00(r0)
            X.C121927Iv.A00(r2, r3, r4, r5, r6, r7)
        L_0x0028:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x002b:
            X.8nY r0 = (X.C147188nY) r0
            int r2 = X.AnonymousClass0wJ.A04(r3)
            r3 = r2 & 11
            r2 = 2
            if (r3 != r2) goto L_0x003c
            boolean r2 = r0.BCM()
            if (r2 != 0) goto L_0x051c
        L_0x003c:
            X.7Wm r14 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r2 = X.AnonymousClass7FI.A02(r14)
            androidx.compose.ui.Modifier r6 = X.AnonymousClass7FI.A01(r2)
            java.lang.Object r12 = r1.A02
            int r2 = r1.A00
            r21 = r2
            java.lang.Object r2 = r1.A01
            r20 = r2
            r2 = r20
            X.0YP r2 = (X.AnonymousClass0YP) r2
            r20 = r2
            java.lang.Object r2 = r1.A04
            r19 = r2
            r2 = r19
            X.56U r2 = (X.AnonymousClass56U) r2
            r19 = r2
            java.lang.Object r9 = r1.A03
            X.4oM r9 = (X.C81784oM) r9
            X.8jl r3 = X.C147188nY.A0V(r0)
            X.8fk r1 = X.AnonymousClass7KV.A02
            r2 = 0
            X.8ly r15 = X.AnonymousClass72M.A00(r3, r0, r1)
            X.534 r11 = X.C147188nY.A0a(r0)
            java.lang.Object r5 = r0.AEA(r11)
            X.534 r10 = X.AnonymousClass7DE.A07
            java.lang.Object r4 = r0.AEA(r10)
            X.534 r8 = X.AnonymousClass7DE.A0B
            java.lang.Object r13 = r0.AEA(r8)
            X.0ZU r7 = X.AnonymousClass74X.A00
            X.0YM r3 = X.C98236Es.A00(r6)
            r1 = r0
            X.7W3 r1 = (X.AnonymousClass7W3) r1
            X.C147188nY.A0w(r0, r1, r7)
            r1.A0T = r2
            X.0YP r6 = X.AnonymousClass74X.A03
            X.0YP r18 = X.AnonymousClass7Ak.A00(r0, r15, r5, r6)
            X.0YP r5 = X.AnonymousClass74X.A02
            X.0YP r4 = X.AnonymousClass7Ak.A01(r0, r4, r5)
            java.lang.Integer r17 = X.AnonymousClass7KP.A05(r0, r13, r4, r3)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.Cvb(r3)
            X.7V5 r16 = X.AnonymousClass7V5.A00
            r13 = -2046223814(0xffffffff86091a3a, float:-2.5786104E-35)
            r0.Cvb(r13)
            X.698 r24 = X.AnonymousClass698.Up
            androidx.compose.ui.Modifier r23 = androidx.compose.ui.Modifier.A04(r14)
            boolean r15 = X.C147188nY.A0y(r0, r12)
            java.lang.Object r13 = r1.A13()
            if (r15 != 0) goto L_0x00c3
            java.lang.Object r15 = X.AnonymousClass7GN.A00
            if (r13 != r15) goto L_0x00c9
        L_0x00c3:
            r13 = 30
            kotlin.jvm.internal.KtLambdaShape33S0100000_I2_13 r13 = X.AnonymousClass7W3.A0H(r1, r12, r13)
        L_0x00c9:
            X.0ZU r25 = X.AnonymousClass7W3.A08(r1, r13, r2)
            X.0YP r26 = X.C103726ad.A00
            r12 = 0
            r28 = 3462(0xd86, float:4.851E-42)
            r29 = 112(0x70, float:1.57E-43)
            r22 = r0
            r27 = r12
            r30 = r2
            r31 = r2
            X.AnonymousClass6M2.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r13 = r9.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r13 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r13
            java.lang.Object r15 = r13.A00
            java.lang.Integer r13 = X.AnonymousClass006.A0Y
            if (r15 != r13) goto L_0x013f
            r9 = -645953166(0xffffffffd97f8972, float:-4.49545261E15)
            r0.Cvb(r9)
            androidx.compose.ui.Modifier r15 = androidx.compose.ui.Modifier.A05(r14)
            r9 = 16
            float r13 = (float) r9
            float r9 = (float) r2
            androidx.compose.ui.Modifier r15 = X.AnonymousClass7K4.A04(r15, r9, r13)
            X.8ly r13 = X.AnonymousClass7KV.A07(r0, r2)
            java.lang.Object r9 = X.C147188nY.A0s(r0, r11)
            java.lang.Object r10 = r0.AEA(r10)
            java.lang.Object r11 = r0.AEA(r8)
            X.0YM r8 = X.C98236Es.A00(r15)
            X.C147188nY.A0w(r0, r1, r7)
            r1.A0T = r2
            X.AnonymousClass7Ak.A02(r0, r13, r6)
            r6 = r18
            X.AnonymousClass7Ak.A02(r0, r9, r6)
            X.7KP r5 = X.AnonymousClass7KP.A03(r0, r10, r11, r5, r4)
            r4 = r17
            r8.invoke(r5, r0, r4)
            r0.Cvb(r3)
            X.7V3 r4 = X.AnonymousClass7V3.A00
            r3 = -1718369287(0xffffffff9993c3f9, float:-1.5278596E-23)
            r0.Cvb(r3)
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7KV.A01(r4, r14)
            r3 = 2
            X.AnonymousClass6MF.A00(r0, r4, r12, r2, r3)
            X.AnonymousClass7W3.A0f(r1)
            goto L_0x03c3
        L_0x013f:
            r3 = -645952995(0xffffffffd97f8a1d, float:-4.49549851E15)
            java.lang.Object r6 = X.C147188nY.A0u(r0, r9, r3)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r6
            r5 = 1065353216(0x3f800000, float:1.0)
            r4 = 1
            r3 = r16
            androidx.compose.ui.Modifier r5 = r3.DB5(r14, r5, r4)
            int r3 = r21 >> 3
            r3 = r3 & 14
            r3 = r3 | 576(0x240, float:8.07E-43)
            r4 = r0
            r7 = r19
            r8 = r20
            r9 = r3
            X.AnonymousClass7Hs.A01(r4, r5, r6, r7, r8, r9)
            goto L_0x03c3
        L_0x0162:
            X.8nY r0 = (X.C147188nY) r0
            int r2 = X.AnonymousClass0wJ.A04(r3)
            r2 = r2 & 11
            r7 = 2
            if (r2 != r7) goto L_0x0173
            boolean r2 = r0.BCM()
            if (r2 != 0) goto L_0x051c
        L_0x0173:
            X.7Wm r5 = androidx.compose.ui.Modifier.A00
            r16 = 0
            r2 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.Modifier.A05(r5)
            java.lang.Object r10 = r1.A02
            X.0ZU r10 = (X.AnonymousClass0ZU) r10
            int r11 = r1.A00
            java.lang.Object r9 = r1.A04
            X.56z r9 = (X.C881656z) r9
            java.lang.Object r4 = r1.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r6 = r1.A03
            X.8ly r15 = X.AnonymousClass7KV.A05(r0)
            java.lang.Object r14 = X.C147188nY.A0p(r0)
            java.lang.Object r13 = X.C147188nY.A0n(r0)
            java.lang.Object r12 = X.C147188nY.A0m(r0)
            X.0ZU r8 = X.AnonymousClass74X.A00
            X.0YM r3 = X.C98236Es.A00(r3)
            r1 = r0
            X.7W3 r1 = (X.AnonymousClass7W3) r1
            X.C147188nY.A0w(r0, r1, r8)
            X.AnonymousClass7W3.A0a(r0, r1, r15, r14)
            X.AnonymousClass7KP.A07(r0, r13, r12, r3)
            r3 = -299583787(0xffffffffee24b6d5, float:-1.2744143E28)
            r0.Cvb(r3)
            X.698 r19 = X.AnonymousClass698.Up
            r8 = 1
            X.54z r3 = X.AnonymousClass7Kq.A02
            androidx.compose.ui.Modifier r18 = r5.Cx6(r3)
            X.0YP r21 = X.AnonymousClass6Y6.A00
            r12 = 3
            int r11 = r11 << r12
            r11 = r11 & 112(0x70, float:1.57E-43)
            r11 = r11 | 3462(0xd86, float:4.851E-42)
            r24 = 112(0x70, float:1.57E-43)
            r17 = r0
            r20 = r10
            r22 = r16
            r23 = r11
            r25 = r2
            r26 = r2
            X.AnonymousClass6M2.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.util.List r9 = r9.A00
            java.util.Iterator r12 = r9.iterator()
        L_0x01dc:
            boolean r9 = r12.hasNext()
            if (r9 == 0) goto L_0x03c6
            java.lang.Object r9 = r12.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2 r9 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2) r9
            java.lang.Object r9 = r9.A00
            int r9 = X.AnonymousClass0wJ.A04(r9)
            if (r9 == r2) goto L_0x0270
            if (r9 == r8) goto L_0x0245
            if (r9 == r7) goto L_0x01fe
            r9 = 71375903(0x4411c1f, float:2.2699954E-36)
            r0.Cvb(r9)
            X.AnonymousClass7W3.A0w(r1, r2)
            goto L_0x01dc
        L_0x01fe:
            r9 = 71375183(0x441194f, float:2.2698662E-36)
            r0.Cvb(r9)
            r9 = 2131822055(0x7f1105e7, float:1.927687E38)
            java.lang.String r17 = X.AnonymousClass7JS.A01(r0, r9)
            java.lang.String r10 = X.C10380iF.A02(r4)
            X.C04220Ms.A06(r10)
            java.lang.String r9 = "utf-8"
            java.lang.String r9 = java.net.URLEncoder.encode(r10, r9)     // Catch:{ Exception -> 0x0219 }
            goto L_0x021a
        L_0x0219:
            r9 = 0
        L_0x021a:
            java.lang.Object[] r11 = new java.lang.Object[]{r9}
            java.lang.String r10 = "https://facebook.com/legal/thirdpartynotices/?fbsn=barcelona_for_android&fbav=%s"
            r9 = r16
            java.lang.String r21 = java.lang.String.format(r9, r10, r11)
            androidx.compose.ui.Modifier r15 = r5.Cx6(r3)
            kotlin.jvm.internal.KtLambdaShape2S2200000_I2 r18 = new kotlin.jvm.internal.KtLambdaShape2S2200000_I2
            r22 = r17
            r23 = r8
            r19 = r4
            r20 = r6
            r18.<init>((java.lang.Object) r19, (java.lang.Object) r20, (java.lang.String) r21, (java.lang.String) r22, (int) r23)
            r19 = 3456(0xd80, float:4.843E-42)
            r20 = 16
            r14 = r0
            r21 = r2
            X.C100536Nr.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            X.AnonymousClass7W3.A0w(r1, r2)
            goto L_0x01dc
        L_0x0245:
            r9 = 71374657(0x4411741, float:2.2697719E-36)
            r0.Cvb(r9)
            r9 = 2131822218(0x7f11068a, float:1.9277201E38)
            java.lang.String r11 = X.AnonymousClass7JS.A01(r0, r9)
            androidx.compose.ui.Modifier r15 = r5.Cx6(r3)
            r10 = 17
            kotlin.jvm.internal.KtLambdaShape5S1200000_I2 r9 = new kotlin.jvm.internal.KtLambdaShape5S1200000_I2
            r9.<init>(r4, r6, r11, r10)
            r19 = 3456(0xd80, float:4.843E-42)
            r20 = 16
            r14 = r0
            r17 = r11
            r18 = r9
            r21 = r2
            X.C100536Nr.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            X.AnonymousClass7W3.A0w(r1, r2)
            goto L_0x01dc
        L_0x0270:
            r9 = 71374126(0x441152e, float:2.2696766E-36)
            r0.Cvb(r9)
            r9 = 2131822116(0x7f110624, float:1.9276994E38)
            java.lang.String r11 = X.AnonymousClass7JS.A01(r0, r9)
            androidx.compose.ui.Modifier r15 = r5.Cx6(r3)
            r10 = 16
            kotlin.jvm.internal.KtLambdaShape5S1200000_I2 r9 = new kotlin.jvm.internal.KtLambdaShape5S1200000_I2
            r9.<init>(r4, r6, r11, r10)
            r19 = 3456(0xd80, float:4.843E-42)
            r14 = r0
            r17 = r11
            r18 = r9
            r20 = r10
            r21 = r2
            X.C100536Nr.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            X.AnonymousClass7W3.A0w(r1, r2)
            goto L_0x01dc
        L_0x029b:
            X.8nY r2 = X.C86104wH.A0H(r0, r3)
            java.lang.Object r6 = r1.A02
            X.0YP r6 = (X.AnonymousClass0YP) r6
            java.lang.Object r4 = r1.A03
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r4
            java.lang.Object r5 = r1.A04
            X.56U r5 = (X.AnonymousClass56U) r5
            java.lang.Object r3 = r1.A01
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            int r0 = r1.A00
            int r7 = X.C115796vv.A00(r0)
            X.AnonymousClass7Hs.A02(r2, r3, r4, r5, r6, r7)
            goto L_0x0028
        L_0x02ba:
            X.8nY r2 = X.C86104wH.A0H(r0, r3)
            java.lang.Object r6 = r1.A02
            X.0YP r6 = (X.AnonymousClass0YP) r6
            java.lang.Object r4 = r1.A03
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r4
            java.lang.Object r5 = r1.A04
            X.56U r5 = (X.AnonymousClass56U) r5
            java.lang.Object r3 = r1.A01
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            int r0 = r1.A00
            int r7 = X.C115796vv.A00(r0)
            X.AnonymousClass7Hs.A01(r2, r3, r4, r5, r6, r7)
            goto L_0x0028
        L_0x02d9:
            X.8nY r0 = (X.C147188nY) r0
            int r2 = X.AnonymousClass0wJ.A04(r3)
            r3 = r2 & 11
            r2 = 2
            if (r3 != r2) goto L_0x02ea
            boolean r2 = r0.BCM()
            if (r2 != 0) goto L_0x051c
        L_0x02ea:
            X.7Wm r14 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r15 = X.AnonymousClass7FI.A02(r14)
            java.lang.Object r11 = r1.A02
            java.lang.Object r6 = r1.A03
            X.4oM r6 = (X.C81784oM) r6
            java.lang.Object r5 = r1.A04
            java.lang.Object r12 = r1.A01
            X.8jl r3 = X.C147188nY.A0V(r0)
            X.8fk r1 = X.AnonymousClass7KV.A02
            r2 = 0
            X.8ly r13 = X.AnonymousClass72M.A00(r3, r0, r1)
            X.534 r10 = X.C147188nY.A0a(r0)
            java.lang.Object r9 = r0.AEA(r10)
            java.lang.Object r8 = X.C147188nY.A0n(r0)
            java.lang.Object r7 = X.C147188nY.A0m(r0)
            X.0ZU r4 = X.AnonymousClass74X.A00
            X.0YM r3 = X.C98236Es.A00(r15)
            r1 = r0
            X.7W3 r1 = (X.AnonymousClass7W3) r1
            X.C147188nY.A0w(r0, r1, r4)
            X.AnonymousClass7W3.A0a(r0, r1, r13, r9)
            X.AnonymousClass7KP.A07(r0, r8, r7, r3)
            X.7V5 r16 = X.AnonymousClass7V5.A00
            r3 = 256343411(0xf477d73, float:9.835618E-30)
            r0.Cvb(r3)
            X.698 r19 = X.AnonymousClass698.Cancel
            r15 = 1
            r27 = 0
            X.54z r9 = X.AnonymousClass7Kq.A02
            androidx.compose.ui.Modifier r3 = r14.Cx6(r9)
            r8 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.Modifier r13 = X.AnonymousClass6EU.A00(r3, r8)
            long r3 = X.AnonymousClass7KB.A00(r0)
            X.8fo r7 = X.C102746Wj.A00
            androidx.compose.ui.Modifier r18 = X.C115656vh.A01(r13, r7, r3)
            boolean r3 = X.C147188nY.A0y(r0, r11)
            java.lang.Object r4 = r1.A13()
            if (r3 != 0) goto L_0x0358
            java.lang.Object r3 = X.AnonymousClass7GN.A00
            if (r4 != r3) goto L_0x035e
        L_0x0358:
            r3 = 45
            kotlin.jvm.internal.KtLambdaShape31S0100000_I2_11 r4 = X.AnonymousClass7W3.A0F(r1, r11, r3)
        L_0x035e:
            X.0ZU r20 = X.AnonymousClass7W3.A08(r1, r4, r2)
            X.0YP r21 = X.C103136Xy.A00
            r11 = 2133069588(0x7f240f14, float:2.1807168E38)
            r4 = 3
            kotlin.jvm.internal.KtLambdaShape13S0300000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape13S0300000_I2
            r3.<init>(r4, r6, r12, r5)
            X.8sI r22 = X.AnonymousClass7JR.A00(r0, r3, r11)
            r23 = 27654(0x6c06, float:3.8752E-41)
            r24 = 96
            r17 = r0
            r25 = r2
            r26 = r2
            X.AnonymousClass6M2.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.8nV r10 = X.C147188nY.A0k(r0, r10)
            r4 = 4
            float r3 = (float) r4
            int r10 = r10.CfL(r3)
            java.lang.Object r3 = r6.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0220000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0220000_I2) r3
            java.lang.Object r11 = r3.A01
            X.7os r3 = X.AnonymousClass7os.A00
            boolean r3 = X.C04220Ms.A0I(r11, r3)
            if (r3 != 0) goto L_0x03d1
            java.lang.Object r3 = r6.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0220000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0220000_I2) r3
            java.lang.Object r3 = r3.A01
            boolean r3 = r3 instanceof X.C130187or
            if (r3 != 0) goto L_0x03d1
            r3 = 1058568773(0x3f187a45, float:0.5956157)
            r0.Cvb(r3)
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.Modifier.A05(r14)
            androidx.compose.ui.Modifier r25 = X.C115826vy.A01(r3, r7)
            r6 = 5
            kotlin.jvm.internal.KtLambdaShape23S0101000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape23S0101000_I2
            r3.<init>(r10, r6, r5)
            r28 = 48
            r24 = r0
            r26 = r3
            r29 = r4
            X.C1191773v.A00(r24, r25, r26, r27, r28, r29)
        L_0x03c3:
            X.AnonymousClass7W3.A0w(r1, r2)
        L_0x03c6:
            X.AnonymousClass7W3.A0w(r1, r2)
            X.AnonymousClass7W3.A0w(r1, r2)
            X.AnonymousClass7W3.A0e(r1)
            goto L_0x0028
        L_0x03d1:
            r3 = 1058568255(0x3f18783f, float:0.5955848)
            r0.Cvb(r3)
            r3 = 24
            kotlin.jvm.internal.KtLambdaShape5S0300000_I2 r5 = X.C86154wM.A15(r12, r5, r6, r3)
            androidx.compose.ui.Modifier r4 = r14.Cx6(r9)
            r3 = r16
            androidx.compose.ui.Modifier r3 = r3.DB5(r4, r8, r15)
            X.AnonymousClass7BX.A02(r0, r3, r5, r2, r2)
            goto L_0x03c3
        L_0x03eb:
            X.8nY r3 = X.C86104wH.A0H(r0, r3)
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            java.lang.Object r2 = r1.A04
            X.7WY r2 = (X.AnonymousClass7WY) r2
            java.lang.Object r4 = r1.A01
            java.lang.Object r5 = r1.A02
            java.lang.Object r6 = r1.A03
            int r0 = r1.A00
            r7 = r0 | 1
            r2.A06(r3, r4, r5, r6, r7)
            goto L_0x0028
        L_0x0406:
            X.8nY r0 = (X.C147188nY) r0
            int r2 = X.AnonymousClass0wJ.A04(r3)
            r3 = r2 & 11
            r2 = 2
            if (r3 != r2) goto L_0x0417
            boolean r2 = r0.BCM()
            if (r2 != 0) goto L_0x051c
        L_0x0417:
            r4 = 1
            X.534 r3 = X.AnonymousClass72S.A00
            java.lang.Object r2 = r1.A04
            X.7DS[] r3 = X.AnonymousClass7DS.A01(r3, r2, r4)
            r2 = 935424596(0x37c17254, float:2.3060631E-5)
            java.lang.Object r9 = r1.A03
            java.lang.Object r8 = r1.A02
            java.lang.Object r7 = r1.A01
            int r5 = r1.A00
            r6 = 4
            kotlin.jvm.internal.KtLambdaShape18S0301000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape18S0301000_I2
            r4.<init>(r5, r6, r7, r8, r9)
            X.AnonymousClass7JR.A05(r0, r4, r3, r2)
            goto L_0x0028
        L_0x0436:
            X.8nY r0 = (X.C147188nY) r0
            int r2 = X.AnonymousClass0wJ.A04(r3)
            r3 = r2 & 11
            r2 = 2
            if (r3 != r2) goto L_0x0447
            boolean r2 = r0.BCM()
            if (r2 != 0) goto L_0x051c
        L_0x0447:
            java.lang.Object r11 = r1.A04
            X.6vT r11 = (X.C115556vT) r11
            java.lang.Object r2 = r1.A01
            r5 = 1
            kotlin.jvm.internal.KtLambdaShape171S0100000_I2 r9 = X.C86164wN.A0w(r2, r5)
            java.lang.Object r4 = r1.A03
            int r7 = r1.A00
            r3 = r7 & 14
            r2 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r0.Cvb(r2)
            X.8cW r12 = X.C103866ar.A02
            r6 = r3 & 14
            int r3 = r3 << 3
            r2 = r3 & 896(0x380, float:1.256E-42)
            r6 = r6 | r2
            int r10 = X.C86134wK.A05(r3, r6)
            r2 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r0.Cvb(r2)
            java.lang.Object r2 = androidx.compose.animation.core.MutableTransitionState.A00(r11)
            r8 = -438678252(0xffffffffe5da4d14, float:-1.2886222E23)
            r0.Cvb(r8)
            boolean r2 = X.C04220Ms.A0I(r2, r4)
            float r2 = X.C86164wN.A01(r2)
            r3 = r0
            X.7W3 r3 = (X.AnonymousClass7W3) r3
            r6 = 0
            X.AnonymousClass7W3.A0w(r3, r6)
            java.lang.Float r14 = java.lang.Float.valueOf(r2)
            X.8pE r2 = r11.A06
            java.lang.Object r2 = r2.getValue()
            r0.Cvb(r8)
            boolean r2 = X.C04220Ms.A0I(r2, r4)
            float r2 = X.C86164wN.A01(r2)
            X.AnonymousClass7W3.A0w(r3, r6)
            java.lang.Float r15 = java.lang.Float.valueOf(r2)
            X.8pE r2 = r11.A04
            java.lang.Object r8 = r2.getValue()
            int r2 = r10 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r10 = r9.invoke(r8, r0, r2)
            X.8oz r10 = (X.C147218oz) r10
            java.lang.String r16 = "FloatAnimation"
            r13 = r0
            X.4oM r10 = X.AnonymousClass7FH.A03(r10, r11, r12, r13, r14, r15, r16)
            X.AnonymousClass7W3.A0w(r3, r6)
            X.AnonymousClass7W3.A0w(r3, r6)
            X.7Wm r9 = androidx.compose.ui.Modifier.A00
            boolean r2 = X.C147188nY.A0y(r0, r10)
            java.lang.Object r8 = r3.A13()
            if (r2 != 0) goto L_0x04d7
            java.lang.Object r2 = X.AnonymousClass7GN.A00
            if (r8 != r2) goto L_0x04df
        L_0x04d7:
            r2 = 5
            kotlin.jvm.internal.KtLambdaShape145S0100000_I2 r8 = X.C86144wL.A16(r10, r2)
            r3.A14(r8)
        L_0x04df:
            X.0YY r2 = X.AnonymousClass7W3.A0B(r3, r8, r6)
            androidx.compose.ui.Modifier r12 = X.C115876w3.A01(r9, r2)
            java.lang.Object r11 = r1.A02
            X.0YM r11 = (X.AnonymousClass0YM) r11
            X.8ly r10 = X.AnonymousClass7KV.A07(r0, r6)
            java.lang.Object r9 = X.C147188nY.A0p(r0)
            java.lang.Object r8 = X.C147188nY.A0n(r0)
            java.lang.Object r6 = X.C147188nY.A0m(r0)
            X.0ZU r2 = X.AnonymousClass74X.A00
            X.0YM r1 = X.C98236Es.A00(r12)
            X.C147188nY.A0w(r0, r3, r2)
            X.AnonymousClass7W3.A0a(r0, r3, r10, r9)
            X.AnonymousClass7KP.A07(r0, r8, r6, r1)
            r1 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r0.Cvb(r1)
            int r1 = r7 >> 9
            r1 = r1 & 112(0x70, float:1.57E-43)
            X.C86104wH.A1R(r4, r0, r11, r1)
            X.AnonymousClass7W3.A0v(r3, r5)
            goto L_0x0028
        L_0x051c:
            r0.CuJ()
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape9S0401000_I2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
