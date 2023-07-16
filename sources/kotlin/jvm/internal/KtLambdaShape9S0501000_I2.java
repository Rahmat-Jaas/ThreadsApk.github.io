package kotlin.jvm.internal;

import X.AnonymousClass0YC;
import X.C02220Ah;

public class KtLambdaShape9S0501000_I2 extends C02220Ah implements AnonymousClass0YC {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape9S0501000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        super(4);
        this.A06 = i2;
        this.A01 = obj;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A00 = i;
        this.A02 = obj5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x008a, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0246, code lost:
        X.AnonymousClass7W3.A0z(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x027b, code lost:
        r10.CuJ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0282, code lost:
        r10.CuJ();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r33, java.lang.Object r34, java.lang.Object r35, java.lang.Object r36) {
        /*
            r32 = this;
            r0 = r32
            r10 = r35
            int r1 = r0.A06
            r6 = r33
            r3 = r34
            r2 = r36
            switch(r1) {
                case 0: goto L_0x0167;
                case 1: goto L_0x008b;
                default: goto L_0x000f;
            }
        L_0x000f:
            X.8nY r14 = X.C86104wH.A0H(r10, r2)
            r13 = 0
            boolean r12 = X.AnonymousClass0wJ.A1Z(r6, r3)
            java.lang.Object r8 = r0.A01
            X.06E r8 = (X.AnonymousClass06E) r8
            java.lang.Object r7 = r0.A04
            X.7p0 r7 = (X.AnonymousClass7p0) r7
            java.lang.Object r15 = r0.A05
            X.8pE r15 = (X.C147368pE) r15
            java.lang.Object r11 = r0.A02
            r1 = 37
            kotlin.jvm.internal.KtLambdaShape33S0100000_I2_13 r9 = new kotlin.jvm.internal.KtLambdaShape33S0100000_I2_13
            r9.<init>(r11, r1)
            r1 = 48
            kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6 r6 = new kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6
            r6.<init>(r11, r1)
            r1 = 49
            kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6 r5 = new kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6
            r5.<init>(r11, r1)
            r1 = 38
            kotlin.jvm.internal.KtLambdaShape33S0100000_I2_13 r4 = new kotlin.jvm.internal.KtLambdaShape33S0100000_I2_13
            r4.<init>(r11, r1)
            kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7 r26 = X.C86164wN.A0t(r11, r13)
            r1 = 39
            kotlin.jvm.internal.KtLambdaShape33S0100000_I2_13 r3 = new kotlin.jvm.internal.KtLambdaShape33S0100000_I2_13
            r3.<init>(r11, r1)
            java.lang.Object r2 = r0.A03
            X.0YY r2 = (X.AnonymousClass0YY) r2
            r10 = 40
            kotlin.jvm.internal.KtLambdaShape33S0100000_I2_13 r1 = new kotlin.jvm.internal.KtLambdaShape33S0100000_I2_13
            r1.<init>(r11, r10)
            kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7 r28 = X.C86164wN.A0t(r11, r12)
            r16 = 0
            int r0 = r0.A00
            int r10 = r0 >> 6
            r10 = r10 & 896(0x380, float:1.256E-42)
            r29 = r10 | 8
            r10 = 1879048192(0x70000000, float:1.58456325E29)
            int r0 = r0 << 9
            r0 = r0 & r10
            r29 = r29 | r0
            r31 = 12288(0x3000, float:1.7219E-41)
            r19 = r16
            r27 = r2
            r30 = r13
            r23 = r1
            r24 = r6
            r25 = r5
            r21 = r4
            r22 = r3
            r20 = r9
            r18 = r7
            r17 = r8
            X.AnonymousClass7GG.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x0088:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x008b:
            int r4 = X.AnonymousClass0wJ.A04(r3)
            X.8nY r10 = (X.C147188nY) r10
            int r3 = X.AnonymousClass0wJ.A04(r2)
            r1 = 0
            X.C04220Ms.A0B(r6, r1)
            r2 = r3 & 14
            if (r2 != 0) goto L_0x0164
            int r2 = X.C147188nY.A0F(r10, r6)
            r5 = r3 | r2
        L_0x00a3:
            r2 = r3 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x00ac
            int r2 = X.C147188nY.A04(r10, r4)
            r5 = r5 | r2
        L_0x00ac:
            r3 = r5 & 731(0x2db, float:1.024E-42)
            r2 = 146(0x92, float:2.05E-43)
            if (r3 != r2) goto L_0x00b8
            boolean r2 = r10.BCM()
            if (r2 != 0) goto L_0x0282
        L_0x00b8:
            java.lang.Object r2 = r0.A02
            java.lang.Object r4 = X.C86124wJ.A0p(r2, r4)
            r3 = r5 & 14
            X.5Hf r4 = (X.AnonymousClass5Hf) r4
            r2 = 524636480(0x1f455140, float:4.178358E-20)
            r10.Cvb(r2)
            r2 = r3 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x00d1
            int r2 = X.C147188nY.A08(r10, r4)
            r3 = r3 | r2
        L_0x00d1:
            r3 = r3 & 721(0x2d1, float:1.01E-42)
            r2 = 144(0x90, float:2.02E-43)
            if (r3 != r2) goto L_0x00dd
            boolean r2 = r10.BCM()
            if (r2 != 0) goto L_0x027b
        L_0x00dd:
            com.instagram.common.typedurl.ImageUrl r13 = r4.A00
            java.lang.String r14 = r4.A04
            java.lang.String r15 = r4.A02
            java.lang.Object r7 = r0.A04
            X.8fX r7 = (X.C142758fX) r7
            X.7Wm r6 = androidx.compose.ui.Modifier.A00
            r3 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r2 = 1
            androidx.compose.ui.Modifier r11 = r7.DB5(r6, r5, r2)
            boolean r8 = r4.A06
            X.5I4 r12 = X.AnonymousClass5I4.A04
            r7 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r10.Cvb(r7)
            java.lang.Object r6 = r0.A03
            boolean r2 = r10.ACY(r6)
            boolean r2 = X.C147188nY.A12(r10, r4, r2)
            r5 = r10
            X.7W3 r5 = (X.AnonymousClass7W3) r5
            java.lang.Object r9 = r5.A13()
            if (r2 != 0) goto L_0x0112
            java.lang.Object r2 = X.AnonymousClass7GN.A00
            if (r9 != r2) goto L_0x0118
        L_0x0112:
            r2 = 28
            kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3 r9 = X.AnonymousClass7W3.A0E(r5, r4, r6, r2)
        L_0x0118:
            X.0ZU r16 = X.AnonymousClass7W3.A08(r5, r9, r1)
            boolean r2 = X.C147188nY.A10(r10, r6, r4, r7)
            java.lang.Object r7 = r5.A13()
            if (r2 != 0) goto L_0x012a
            java.lang.Object r2 = X.AnonymousClass7GN.A00
            if (r7 != r2) goto L_0x0130
        L_0x012a:
            r2 = 43
            kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2 r7 = X.AnonymousClass7W3.A0L(r5, r6, r4, r2)
        L_0x0130:
            X.0YY r17 = X.AnonymousClass7W3.A0B(r5, r7, r1)
            r6 = 1390038681(0x52da4e99, float:4.6881076E11)
            java.lang.Object r2 = r0.A05
            java.lang.Object r7 = r0.A01
            r5 = 4
            kotlin.jvm.internal.KtLambdaShape14S0300000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape14S0300000_I2
            r0.<init>(r5, r2, r7, r4)
            X.8sI r18 = X.AnonymousClass7JR.A00(r10, r0, r6)
            r20 = 48
            r21 = 224(0xe0, float:3.14E-43)
            r19 = r1
            r22 = r8
            r23 = r1
            r24 = r1
            r25 = r1
            X.AnonymousClass6MG.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            kotlin.Unit r6 = kotlin.Unit.A00
            r5 = 21
            kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r2, (X.C146958n9) r3, (int) r5)
            X.AnonymousClass7K5.A05(r10, r6, r0)
            goto L_0x0246
        L_0x0164:
            r5 = r3
            goto L_0x00a3
        L_0x0167:
            int r5 = X.AnonymousClass0wJ.A04(r3)
            X.8nY r10 = (X.C147188nY) r10
            int r3 = X.AnonymousClass0wJ.A04(r2)
            r1 = 0
            X.C04220Ms.A0B(r6, r1)
            r2 = r3 & 14
            if (r2 != 0) goto L_0x027f
            int r2 = X.C147188nY.A0F(r10, r6)
            r4 = r3 | r2
        L_0x017f:
            r2 = r3 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0188
            int r2 = X.C147188nY.A04(r10, r5)
            r4 = r4 | r2
        L_0x0188:
            r3 = r4 & 731(0x2db, float:1.024E-42)
            r2 = 146(0x92, float:2.05E-43)
            if (r3 != r2) goto L_0x0194
            boolean r2 = r10.BCM()
            if (r2 != 0) goto L_0x0282
        L_0x0194:
            java.lang.Object r2 = r0.A03
            java.lang.Object r3 = X.C86124wJ.A0p(r2, r5)
            r2 = r4 & 14
            r4 = 1252388342(0x4aa5edf6, float:5437179.0)
            r10.Cvb(r4)
            r4 = r2 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x01ab
            int r4 = X.C147188nY.A08(r10, r3)
            r2 = r2 | r4
        L_0x01ab:
            r5 = r2 & 721(0x2d1, float:1.01E-42)
            r4 = 144(0x90, float:2.02E-43)
            if (r5 != r4) goto L_0x01b7
            boolean r4 = r10.BCM()
            if (r4 != 0) goto L_0x027b
        L_0x01b7:
            java.lang.Object r4 = r0.A01
            X.0YY r4 = (X.AnonymousClass0YY) r4
            java.lang.Object r4 = r4.invoke(r3)
            float r21 = X.C18240wQ.A00(r4)
            java.lang.Object r4 = r0.A04
            X.0YY r4 = (X.AnonymousClass0YY) r4
            java.lang.Object r12 = r4.invoke(r3)
            java.lang.String r12 = (java.lang.String) r12
            r4 = -532339544(0xffffffffe04524a8, float:-5.6822655E19)
            r10.Cvb(r4)
            java.lang.Object r7 = r0.A05
            if (r7 != 0) goto L_0x024b
            r8 = 0
        L_0x01d8:
            X.7W3 r6 = X.AnonymousClass7W3.A04(r10, r1)
            java.lang.String r4 = "post"
            java.lang.String r13 = X.AnonymousClass00U.A0L(r4, r12)
            X.7Wm r11 = androidx.compose.ui.Modifier.A00
            if (r8 == 0) goto L_0x0200
            X.799 r9 = X.AnonymousClass799.A00(r1)
            r4 = 1739080125(0x67a841bd, float:1.5891405E24)
            r10.Cvb(r4)
            r7 = 1
            r4 = 2
            kotlin.jvm.internal.IDxLambdaShape13S0210000_2_I2 r5 = new kotlin.jvm.internal.IDxLambdaShape13S0210000_2_I2
            r5.<init>(r4, r8, r9, r7)
            X.0YY r4 = androidx.compose.ui.platform.InspectableValueKt.A00
            androidx.compose.ui.Modifier r11 = X.C120417Am.A02(r11, r4, r5)
            X.AnonymousClass7W3.A0w(r6, r1)
        L_0x0200:
            r4 = 8
            float r7 = (float) r4
            boolean r4 = X.C147188nY.A0y(r10, r8)
            java.lang.Object r5 = r6.A13()
            if (r4 != 0) goto L_0x0211
            java.lang.Object r4 = X.AnonymousClass7GN.A00
            if (r5 != r4) goto L_0x0217
        L_0x0211:
            r4 = 48
            kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12 r5 = X.AnonymousClass7W3.A0G(r6, r8, r4)
        L_0x0217:
            X.0ZU r14 = X.AnonymousClass7W3.A08(r6, r5, r1)
            X.7Tu r8 = X.AnonymousClass74O.A03
            X.7Tu r9 = X.AnonymousClass74O.A02
            r15 = 0
            r4 = -1948713830(0xffffffff8bd8fc9a, float:-8.3580246E-32)
            java.lang.Object r6 = r0.A02
            int r5 = r0.A00
            r24 = 2
            kotlin.jvm.internal.KtLambdaShape0S0202001_I2 r0 = new kotlin.jvm.internal.KtLambdaShape0S0202001_I2
            r19 = r6
            r20 = r3
            r22 = r2
            r23 = r5
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            X.8sI r16 = X.AnonymousClass7JR.A00(r10, r0, r4)
            r18 = 100666368(0x6000c00, float:2.408294E-35)
            r19 = 128(0x80, float:1.794E-43)
            r17 = r7
            X.AnonymousClass74O.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0246:
            X.AnonymousClass7W3.A0z(r10, r1)
            goto L_0x0088
        L_0x024b:
            r4 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r4 = X.C147188nY.A10(r10, r7, r12, r4)
            r6 = r10
            X.7W3 r6 = (X.AnonymousClass7W3) r6
            java.lang.Object r5 = r6.A13()
            if (r4 != 0) goto L_0x025f
            java.lang.Object r4 = X.AnonymousClass7GN.A00
            if (r5 != r4) goto L_0x0265
        L_0x025f:
            r4 = 16
            kotlin.jvm.internal.KtLambdaShape4S1100000_I2 r5 = X.AnonymousClass7W3.A0N(r6, r7, r12, r4)
        L_0x0265:
            X.0ZU r14 = X.AnonymousClass7W3.A08(r6, r5, r1)
            r19 = 15
            r15 = 0
            r13 = r10
            r16 = r15
            r17 = r15
            r18 = r15
            r20 = r1
            X.774 r8 = X.AnonymousClass70U.A01(r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x01d8
        L_0x027b:
            r10.CuJ()
            goto L_0x0246
        L_0x027f:
            r4 = r3
            goto L_0x017f
        L_0x0282:
            r10.CuJ()
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape9S0501000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
