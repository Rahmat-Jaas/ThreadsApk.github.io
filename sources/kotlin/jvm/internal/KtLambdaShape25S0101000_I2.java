package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.C02220Ah;

public class KtLambdaShape25S0101000_I2 extends C02220Ah implements AnonymousClass0YM {
    public int A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape25S0101000_I2(Object obj, int i, int i2) {
        super(3);
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01bb, code lost:
        r5.CuJ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02a6, code lost:
        r2 = (X.AnonymousClass7WO) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r15 = this;
            r6 = r16
            r7 = r18
            r5 = r17
            int r0 = r15.A02
            switch(r0) {
                case 0: goto L_0x02b6;
                case 1: goto L_0x0267;
                case 2: goto L_0x023a;
                case 3: goto L_0x0212;
                case 4: goto L_0x01c0;
                case 5: goto L_0x0179;
                case 6: goto L_0x0132;
                case 7: goto L_0x0106;
                case 8: goto L_0x00be;
                case 9: goto L_0x0061;
                default: goto L_0x000b;
            }
        L_0x000b:
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            X.8nY r4 = X.C86104wH.A0H(r5, r7)
            r3 = 0
            X.C04220Ms.A0B(r6, r3)
            r0 = -2042415763(0xffffffff8643356d, float:-3.6714675E-35)
            r4.Cvb(r0)
            java.lang.Object r0 = r15.A01
            X.8fV r0 = (X.C142738fV) r0
            X.4oM r0 = X.C97856Df.A00(r0, r4)
            boolean r1 = X.C86104wH.A1X(r0)
            X.7KB r0 = X.C120537Bh.A00(r4)
            if (r1 == 0) goto L_0x005e
            long r1 = r0.A0e
        L_0x002f:
            X.53m r0 = new X.53m
            r0.<init>(r1)
            X.4oM r2 = X.C115806vw.A01(r4, r0)
            boolean r0 = X.C147188nY.A0y(r4, r2)
            X.7W3 r4 = (X.AnonymousClass7W3) r4
            java.lang.Object r1 = r4.A13()
            if (r0 != 0) goto L_0x0048
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x0052
        L_0x0048:
            r0 = 25
            kotlin.jvm.internal.KtLambdaShape156S0100000_I2_11 r1 = new kotlin.jvm.internal.KtLambdaShape156S0100000_I2_11
            r1.<init>(r2, r0)
            r4.A14(r1)
        L_0x0052:
            X.0YY r0 = X.AnonymousClass7W3.A0B(r4, r1, r3)
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.Modifier.A08(r6, r0)
            X.AnonymousClass7W3.A0w(r4, r3)
            return r0
        L_0x005e:
            long r1 = r0.A0m
            goto L_0x002f
        L_0x0061:
            X.8nY r5 = (X.C147188nY) r5
            int r0 = X.AnonymousClass0wJ.A04(r7)
            r1 = r0 & 81
            r0 = 16
            if (r1 != r0) goto L_0x0073
            boolean r0 = r5.BCM()
            if (r0 != 0) goto L_0x01bb
        L_0x0073:
            r0 = 2131233204(0x7f0809b4, float:1.8082539E38)
            r7 = 0
            X.6uo r4 = X.AnonymousClass6QP.A00(r5, r0)
            r8 = 0
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
            r0 = 12
            androidx.compose.ui.Modifier r10 = X.AnonymousClass7Kq.A0F(r1, r0)
            X.7W3 r6 = X.C147188nY.A0Y(r5)
            java.lang.Object r0 = r6.A13()
            java.lang.Object r3 = X.AnonymousClass7GN.A00
            java.lang.Object r9 = X.C86144wL.A0f(r6, r0, r3)
            X.AnonymousClass7W3.A0w(r6, r7)
            X.8p3 r9 = (X.C147258p3) r9
            X.799 r11 = X.AnonymousClass799.A00(r7)
            java.lang.Object r2 = r15.A01
            boolean r1 = X.C147188nY.A0y(r5, r2)
            java.lang.Object r0 = r6.A13()
            if (r1 != 0) goto L_0x00a9
            if (r0 != r3) goto L_0x00af
        L_0x00a9:
            r0 = 31
            kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16 r0 = X.AnonymousClass7W3.A0K(r6, r2, r0)
        L_0x00af:
            X.0ZU r13 = X.AnonymousClass7W3.A09(r6, r0, r7)
            r14 = 1
            r12 = r8
            androidx.compose.ui.Modifier r0 = X.AnonymousClass7HZ.A00(r8, r9, r10, r11, r12, r13, r14)
            X.C86124wJ.A1G(r5, r0, r4)
            goto L_0x02f1
        L_0x00be:
            X.8nY r5 = (X.C147188nY) r5
            int r0 = X.AnonymousClass0wJ.A04(r7)
            r1 = r0 & 81
            r0 = 16
            if (r1 != r0) goto L_0x00d0
            boolean r0 = r5.BCM()
            if (r0 != 0) goto L_0x01bb
        L_0x00d0:
            java.lang.Object r3 = r15.A01
            boolean r0 = X.C147188nY.A0y(r5, r3)
            r2 = r5
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            java.lang.Object r1 = r2.A13()
            if (r0 != 0) goto L_0x00e3
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x00ed
        L_0x00e3:
            r0 = 9
            kotlin.jvm.internal.IDxRImplShape182S0000000_2_I2 r1 = new kotlin.jvm.internal.IDxRImplShape182S0000000_2_I2
            r1.<init>(r3, r0)
            r2.A14(r1)
        L_0x00ed:
            r3 = 0
            X.0ZU r2 = X.AnonymousClass7W3.A09(r2, r1, r3)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.Modifier.A04(r0)
            r0 = 120(0x78, float:1.68E-43)
            float r0 = (float) r0
            androidx.compose.ui.Modifier r1 = X.AnonymousClass7Kq.A08(r1, r0)
            r0 = 48
            X.AnonymousClass6MB.A00(r5, r1, r2, r0, r3)
            goto L_0x02f1
        L_0x0106:
            X.8nY r2 = X.C86104wH.A0H(r5, r7)
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            java.lang.Object r0 = r15.A01
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r3 = 0
            X.6uo r6 = X.C120577Bm.A01(r2, r0)
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
            r0 = 3
            androidx.compose.ui.Modifier r1 = X.AnonymousClass7Kq.A03(r3, r1, r0)
            r0 = 50
            float r0 = (float) r0
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7G5.A02(r1, r0)
            r9 = 0
            r10 = 56
            r11 = 120(0x78, float:1.68E-43)
            r5 = r3
            r7 = r3
            r8 = r3
            X.C97846Dc.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x02f1
        L_0x0132:
            X.8nY r5 = (X.C147188nY) r5
            int r0 = X.AnonymousClass0wJ.A04(r7)
            r1 = r0 & 81
            r0 = 16
            if (r1 != r0) goto L_0x0144
            boolean r0 = r5.BCM()
            if (r0 != 0) goto L_0x01bb
        L_0x0144:
            java.lang.Object r3 = r15.A01
            boolean r0 = X.C147188nY.A0y(r5, r3)
            r2 = r5
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            java.lang.Object r1 = r2.A13()
            if (r0 != 0) goto L_0x0157
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x0160
        L_0x0157:
            r0 = 5
            kotlin.jvm.internal.IDxRImplShape182S0000000_2_I2 r1 = new kotlin.jvm.internal.IDxRImplShape182S0000000_2_I2
            r1.<init>(r3, r0)
            r2.A14(r1)
        L_0x0160:
            r3 = 0
            X.0ZU r2 = X.AnonymousClass7W3.A09(r2, r1, r3)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.Modifier.A04(r0)
            r0 = 120(0x78, float:1.68E-43)
            float r0 = (float) r0
            androidx.compose.ui.Modifier r1 = X.AnonymousClass7Kq.A08(r1, r0)
            r0 = 48
            X.AnonymousClass6MB.A00(r5, r1, r2, r0, r3)
            goto L_0x02f1
        L_0x0179:
            X.8nY r5 = (X.C147188nY) r5
            int r0 = X.AnonymousClass0wJ.A04(r7)
            r1 = r0 & 81
            r0 = 16
            if (r1 != r0) goto L_0x018b
            boolean r0 = r5.BCM()
            if (r0 != 0) goto L_0x01bb
        L_0x018b:
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            r7 = 0
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.Modifier.A04(r0)
            X.799 r4 = X.AnonymousClass799.A00(r7)
            java.lang.Object r3 = r15.A01
            boolean r0 = X.C147188nY.A0y(r5, r3)
            r2 = r5
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            java.lang.Object r1 = r2.A13()
            if (r0 != 0) goto L_0x01a9
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x01ae
        L_0x01a9:
            r0 = 2
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r1 = X.AnonymousClass7W3.A0J(r2, r3, r0)
        L_0x01ae:
            X.0ZU r0 = X.AnonymousClass7W3.A08(r2, r1, r7)
            androidx.compose.ui.Modifier r0 = X.AnonymousClass7HZ.A01(r6, r4, r0)
            X.AnonymousClass7Bb.A00(r5, r0, r7)
            goto L_0x02f1
        L_0x01bb:
            r5.CuJ()
            goto L_0x02f1
        L_0x01c0:
            X.8nY r9 = X.C86104wH.A0H(r5, r7)
            X.7Wm r10 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.Modifier.A05(r10)
            r0 = 24
            androidx.compose.ui.Modifier r2 = X.AnonymousClass7K4.A08(r1, r0)
            androidx.compose.ui.Alignment r0 = X.AnonymousClass7KV.A06
            java.lang.Object r8 = r15.A01
            X.57M r8 = (X.AnonymousClass57M) r8
            int r7 = r15.A00
            X.8ly r6 = X.C147188nY.A0h(r9, r0)
            java.lang.Object r5 = X.C147188nY.A0p(r9)
            java.lang.Object r4 = X.C147188nY.A0n(r9)
            java.lang.Object r3 = X.C147188nY.A0m(r9)
            X.0ZU r1 = X.AnonymousClass74X.A00
            X.0YM r0 = X.C98236Es.A00(r2)
            r2 = r9
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            X.C147188nY.A0w(r9, r2, r1)
            X.AnonymousClass7W3.A0a(r9, r2, r6, r5)
            X.AnonymousClass7KP.A07(r9, r4, r3, r0)
            r0 = -436422758(0xffffffffe5fcb79a, float:-1.491779E23)
            r9.Cvb(r0)
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.Modifier.A04(r10)
            int r0 = r7 >> 18
            r0 = r0 & 14
            r0 = r0 | 48
            X.AnonymousClass7In.A03(r9, r1, r8, r0)
            X.AnonymousClass7W3.A0f(r2)
            goto L_0x02f1
        L_0x0212:
            X.8nY r1 = X.C86104wH.A0H(r5, r7)
            java.lang.Object r6 = r15.A01
            X.0ZU r6 = (X.AnonymousClass0ZU) r6
            r0 = 2131233204(0x7f0809b4, float:1.8082539E38)
            X.6uo r3 = X.AnonymousClass6QP.A00(r1, r0)
            r0 = 2131821973(0x7f110595, float:1.9276704E38)
            java.lang.String r5 = X.AnonymousClass7JS.A01(r1, r0)
            r2 = 0
            X.5I3 r4 = X.AnonymousClass5I3.A02
            int r0 = r15.A00
            int r0 = r0 >> 9
            r0 = r0 & 14
            r7 = r0 | 64
            r8 = 8
            X.AnonymousClass6M8.A00(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x02f1
        L_0x023a:
            X.8nY r5 = X.C86104wH.A0H(r5, r7)
            r4 = 0
            X.C04220Ms.A0B(r6, r4)
            java.lang.Object r3 = r15.A01
            X.0ZU r3 = (X.AnonymousClass0ZU) r3
            X.7Wm r2 = androidx.compose.ui.Modifier.A00
            X.687 r1 = X.AnonymousClass687.Middle
            r0 = 6
            androidx.compose.ui.Modifier r2 = X.AnonymousClass73T.A00(r5, r2, r1, r0, r4)
            X.6hH r0 = X.C103106Xv.A00
            float r1 = r0.A00
            r0 = 8
            float r0 = (float) r0
            float r1 = r1 - r0
            float r0 = (float) r4
            androidx.compose.ui.Modifier r1 = X.AnonymousClass7K4.A05(r2, r1, r0, r0, r0)
            int r0 = r15.A00
            int r0 = r0 >> 27
            r0 = r0 & 14
            X.AnonymousClass6MT.A00(r5, r1, r3, r0, r4)
            goto L_0x02f1
        L_0x0267:
            X.7Ks r5 = (X.C122137Ks) r5
            X.8fg r7 = (X.C142838fg) r7
            r3 = 1
            X.AnonymousClass0wJ.A1M(r5, r3, r7)
            java.lang.Object r4 = r15.A01
            boolean r0 = r4 instanceof X.C145728kz
            if (r0 == 0) goto L_0x028c
            r2 = r7
            X.7WI r2 = (X.AnonymousClass7WI) r2
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.util.List r1 = r2.A02
            int r0 = r1.lastIndexOf(r4)
            if (r0 < 0) goto L_0x029c
            r1.remove(r0)
            java.util.Set r0 = r2.A05
            r0.remove(r4)
        L_0x028c:
            int r0 = r15.A00
            java.lang.Object r2 = r5.A0I(r0, r4)
            boolean r0 = r2 instanceof X.C145728kz
            if (r0 == 0) goto L_0x02a2
            X.8kz r2 = (X.C145728kz) r2
            r7.ANW(r2)
            goto L_0x02f1
        L_0x029c:
            java.util.List r0 = r2.A03
            r0.add(r4)
            goto L_0x028c
        L_0x02a2:
            boolean r0 = r2 instanceof X.AnonymousClass7WO
            if (r0 == 0) goto L_0x02f1
            X.7WO r2 = (X.AnonymousClass7WO) r2
            X.7W5 r1 = r2.A03
            if (r1 == 0) goto L_0x02f1
            r0 = 0
            r2.A03 = r0
            r2.A04 = r0
            r2.A05 = r0
            r1.A04 = r3
            goto L_0x02f1
        L_0x02b6:
            X.8mL r6 = (X.C146498mL) r6
            X.7Ks r5 = (X.C122137Ks) r5
            boolean r1 = X.AnonymousClass0wJ.A1Y(r6, r5)
            java.lang.Object r0 = r15.A01
            X.6b8 r0 = (X.C104036b8) r0
            X.C04220Ms.A0B(r0, r1)
            int r1 = r0.A00
            if (r1 >= 0) goto L_0x02ce
            int r0 = X.C122137Ks.A00(r5)
            int r1 = r1 + r0
        L_0x02ce:
            int r3 = X.C122137Ks.A01(r5, r1)
            int[] r1 = r5.A0E
            boolean r0 = X.C121627Hb.A04(r3, r1)
            if (r0 == 0) goto L_0x02f4
            java.lang.Object[] r2 = r5.A0F
            int r1 = X.C122137Ks.A03(r5, r1, r3)
            int r0 = r5.A0B
            if (r1 < r0) goto L_0x02e7
            int r0 = r5.A09
            int r1 = r1 + r0
        L_0x02e7:
            r1 = r2[r1]
        L_0x02e9:
            r6.D8Y()
            int r0 = r15.A00
            r6.BQW(r0, r1)
        L_0x02f1:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x02f4:
            r1 = 0
            goto L_0x02e9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape25S0101000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
