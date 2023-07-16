package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.C02220Ah;

public class KtLambdaShape172S0100000_I2_1 extends C02220Ah implements AnonymousClass0YM {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape172S0100000_I2_1(Object obj, int i) {
        super(3);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0215, code lost:
        r7.CuJ();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
        /*
            r25 = this;
            r3 = r25
            r6 = r28
            r4 = r26
            r7 = r27
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x01ef;
                case 1: goto L_0x01cf;
                case 2: goto L_0x0183;
                case 3: goto L_0x0173;
                case 4: goto L_0x0151;
                case 5: goto L_0x012a;
                case 6: goto L_0x00ff;
                case 7: goto L_0x00ea;
                case 8: goto L_0x00ce;
                case 9: goto L_0x00b0;
                case 10: goto L_0x0064;
                case 11: goto L_0x0027;
                default: goto L_0x000d;
            }
        L_0x000d:
            boolean r2 = X.AnonymousClass0wJ.A1X(r7)
            java.lang.Object r0 = r3.A00
            X.57h r0 = (X.C882457h) r0
            X.56r r1 = r0.A01
            java.lang.Object r0 = r1.A08()
            if (r0 == 0) goto L_0x021a
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2050000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2050000_I2) r0
            r0.A03 = r2
            r1.A0G(r0)
        L_0x0024:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0027:
            X.8nY r7 = (X.C147188nY) r7
            int r0 = X.AnonymousClass0wJ.A04(r6)
            r1 = r0 & 81
            r0 = 16
            if (r1 != r0) goto L_0x0039
            boolean r0 = r7.BCM()
            if (r0 != 0) goto L_0x0215
        L_0x0039:
            X.534 r0 = X.AnonymousClass7DE.A02
            java.lang.Object r2 = r7.AEA(r0)
            java.lang.Object r0 = r3.A00
            X.4oM r0 = (X.C81784oM) r0
            X.8nV r2 = (X.C147168nV) r2
            java.lang.Object r0 = r0.getValue()
            X.7JK r0 = (X.AnonymousClass7JK) r0
            long r0 = r0.A00
            long r4 = r2.CxF(r0)
            X.7Wm r3 = androidx.compose.ui.Modifier.A00
            r2 = 0
            float r1 = X.AnonymousClass7HB.A01(r4)
            float r0 = X.AnonymousClass7HB.A00(r4)
            androidx.compose.ui.Modifier r0 = X.AnonymousClass7Kq.A0D(r3, r1, r0)
            X.C115686vk.A01(r7, r0, r2)
            goto L_0x0024
        L_0x0064:
            X.8nY r7 = (X.C147188nY) r7
            int r0 = X.AnonymousClass0wJ.A04(r6)
            r14 = 0
            X.C04220Ms.A0B(r4, r14)
            r0 = r0 & 81
            r2 = 16
            if (r0 != r2) goto L_0x007a
            boolean r0 = r7.BCM()
            if (r0 != 0) goto L_0x0215
        L_0x007a:
            java.lang.Object r0 = r3.A00
            X.65g r0 = (X.C965165g) r0
            boolean r1 = r0.A06
            r0 = 2131831837(0x7f112c1d, float:1.929671E38)
            if (r1 == 0) goto L_0x0088
            r0 = 2131831836(0x7f112c1c, float:1.9296709E38)
        L_0x0088:
            java.lang.String r13 = X.AnonymousClass7JS.A01(r7, r0)
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
            float r0 = (float) r2
            androidx.compose.ui.Modifier r8 = X.AnonymousClass7K4.A06(r1, r0, r14)
            X.7If r9 = X.AnonymousClass7J9.A04(r7)
            long r20 = X.AnonymousClass7KB.A03(r7)
            r22 = 0
            r10 = 0
            r17 = 48
            r19 = 2040(0x7f8, float:2.859E-42)
            r11 = r10
            r12 = r10
            r15 = r14
            r16 = r14
            r18 = r14
            r24 = r14
            X.AnonymousClass7I9.A02(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r24)
            goto L_0x0024
        L_0x00b0:
            X.8nY r7 = (X.C147188nY) r7
            int r0 = X.AnonymousClass0wJ.A04(r6)
            r1 = r0 & 81
            r0 = 16
            if (r1 != r0) goto L_0x00c2
            boolean r0 = r7.BCM()
            if (r0 != 0) goto L_0x0215
        L_0x00c2:
            java.lang.Object r0 = r3.A00
            X.65g r0 = (X.C965165g) r0
            int r1 = r0.A00
            r0 = 0
            X.AnonymousClass7KL.A02(r7, r1, r0)
            goto L_0x0024
        L_0x00ce:
            X.8nY r7 = (X.C147188nY) r7
            int r0 = X.AnonymousClass0wJ.A04(r6)
            r1 = r0 & 81
            r0 = 16
            if (r1 != r0) goto L_0x00e0
            boolean r0 = r7.BCM()
            if (r0 != 0) goto L_0x0215
        L_0x00e0:
            java.lang.Object r1 = r3.A00
            X.8fC r1 = (X.C142548fC) r1
            r0 = 0
            X.AnonymousClass7KL.A06(r7, r1, r0)
            goto L_0x0024
        L_0x00ea:
            float r4 = X.C18240wQ.A00(r4)
            float r2 = X.C18240wQ.A00(r7)
            float r1 = X.C18240wQ.A00(r6)
            java.lang.Object r0 = r3.A00
            X.EQx r0 = (X.C26682EQx) r0
            X.C26682EQx.A06(r0, r4, r2, r1)
            goto L_0x0024
        L_0x00ff:
            X.8nY r7 = (X.C147188nY) r7
            int r0 = X.AnonymousClass0wJ.A04(r6)
            r1 = r0 & 81
            r0 = 16
            if (r1 != r0) goto L_0x0111
            boolean r0 = r7.BCM()
            if (r0 != 0) goto L_0x0215
        L_0x0111:
            java.lang.Object r0 = r3.A00
            X.3Dd r0 = (X.C57943Dd) r0
            java.lang.String r10 = X.AnonymousClass70M.A01(r7, r0)
            r8 = 0
            X.671 r9 = X.AnonymousClass671.Mini
            r15 = 0
            r13 = 384(0x180, float:5.38E-43)
            r14 = 122(0x7a, float:1.71E-43)
            r11 = r8
            r12 = r8
            r16 = r15
            X.C101176Qe.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0024
        L_0x012a:
            boolean r0 = X.AnonymousClass0wJ.A1X(r7)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r3.A00
            X.CA6 r0 = (X.CA6) r0
            X.4wE r6 = r0.A08
        L_0x0136:
            java.lang.Object r5 = r6.getValue()
            r0 = r5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2020000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2020000_I2) r0
            r4 = 1
            java.lang.String r3 = r0.A00
            java.lang.String r2 = r0.A01
            boolean r1 = r0.A03
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2020000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2020000_I2
            r0.<init>(r3, r2, r1, r4)
            boolean r0 = r6.ADi(r5, r0)
            if (r0 == 0) goto L_0x0136
            goto L_0x0024
        L_0x0151:
            boolean r11 = X.AnonymousClass0wJ.A1X(r4)
            X.DsH r7 = (X.C25803DsH) r7
            int r10 = X.AnonymousClass0wJ.A04(r6)
            r0 = 1
            X.C04220Ms.A0B(r7, r0)
            java.lang.Object r8 = r3.A00
            X.CAs r8 = (X.C21982CAs) r8
            X.4qz r1 = X.AnonymousClass3J5.A00(r8)
            r9 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0212000_I2 r6 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0212000_I2
            r6.<init>(r7, r8, r9, r10, r11)
            r0 = 3
            X.C25237DiI.A00(r9, r9, r6, r1, r0)
            goto L_0x0024
        L_0x0173:
            java.lang.Object r1 = r3.A00
            X.10U r1 = (X.AnonymousClass10U) r1
            X.4wE r0 = r1.A07
            r0.CrC(r4)
            X.4wE r0 = r1.A08
            r0.CrC(r7)
            goto L_0x0024
        L_0x0183:
            android.view.View r4 = (android.view.View) r4
            int r1 = X.AnonymousClass0wJ.A04(r7)
            X.C2y r6 = (X.C2y) r6
            r0 = 0
            X.AnonymousClass0wJ.A1M(r4, r0, r6)
            java.lang.Object r0 = r3.A00
            X.CUk r0 = (X.CUk) r0
            X.0Oa r0 = r0.A02
            java.lang.Object r5 = r0.getValue()
            X.AXe r5 = (X.C18036AXe) r5
            X.6ei r3 = new X.6ei
            r3.<init>(r1)
            java.lang.String r2 = r6.AXA()
            r1 = 95
            X.9Mq r0 = r6.AUN()
            if (r0 == 0) goto L_0x01cd
            java.lang.String r0 = r0.A0Q
        L_0x01ae:
            java.lang.String r0 = X.AnonymousClass00U.A0N(r2, r0, r1)
            X.Jix r2 = X.C37284Jnx.A00(r6, r3, r0)
            X.9aP r0 = r5.A01
            r2.A01(r0)
            X.AqN r0 = r5.A02
            X.BGa r0 = r0.A01
            r2.A01(r0)
            X.GbW r1 = r5.A00
            X.Jnx r0 = r2.A02()
            r1.A03(r4, r0)
            goto L_0x0024
        L_0x01cd:
            r0 = 0
            goto L_0x01ae
        L_0x01cf:
            X.8nY r7 = (X.C147188nY) r7
            int r0 = X.AnonymousClass0wJ.A04(r6)
            r1 = r0 & 81
            r0 = 16
            if (r1 != r0) goto L_0x01e1
            boolean r0 = r7.BCM()
            if (r0 != 0) goto L_0x0215
        L_0x01e1:
            java.lang.Object r1 = r3.A00
            r0 = 31
            kotlin.jvm.internal.KtLambdaShape77S0100000_I2_57 r1 = X.C86164wN.A12(r1, r0)
            r0 = 0
            X.C121927Iv.A04(r7, r1, r0)
            goto L_0x0024
        L_0x01ef:
            X.8nY r7 = (X.C147188nY) r7
            int r0 = X.AnonymousClass0wJ.A04(r6)
            r1 = r0 & 81
            r0 = 16
            if (r1 != r0) goto L_0x0201
            boolean r0 = r7.BCM()
            if (r0 != 0) goto L_0x0215
        L_0x0201:
            java.lang.Object r0 = r3.A00
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.6uo r9 = X.AnonymousClass73J.A00(r0, r7)
            r8 = 0
            long r13 = X.AnonymousClass7KE.A06
            r11 = 3128(0xc38, float:4.383E-42)
            r12 = 4
            r10 = r8
            X.C1190173e.A00(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0024
        L_0x0215:
            r7.CuJ()
            goto L_0x0024
        L_0x021a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape172S0100000_I2_1.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
