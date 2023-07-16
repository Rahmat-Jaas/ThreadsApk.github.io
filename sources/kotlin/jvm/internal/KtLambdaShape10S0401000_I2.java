package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.C02220Ah;

public class KtLambdaShape10S0401000_I2 extends C02220Ah implements AnonymousClass0YM {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape10S0401000_I2(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(3);
        this.A05 = i2;
        this.A03 = obj;
        this.A04 = obj2;
        this.A01 = obj3;
        this.A00 = i;
        this.A02 = obj4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        X.AnonymousClass7W3.A0w(r12, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0349, code lost:
        r12.CuJ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        return kotlin.Unit.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            r27 = this;
            r0 = r27
            r4 = r28
            r12 = r29
            int r1 = r0.A05
            r2 = r30
            switch(r1) {
                case 0: goto L_0x02fa;
                case 1: goto L_0x026d;
                case 2: goto L_0x01d8;
                case 3: goto L_0x0157;
                case 4: goto L_0x00c4;
                case 5: goto L_0x0064;
                default: goto L_0x000d;
            }
        L_0x000d:
            int r3 = X.AnonymousClass0wJ.A04(r4)
            X.8nY r12 = (X.C147188nY) r12
            int r2 = X.AnonymousClass0wJ.A04(r2)
            r1 = r2 & 14
            if (r1 != 0) goto L_0x0062
            int r1 = X.C147188nY.A03(r12, r3)
            r1 = r1 | r2
        L_0x0020:
            r2 = r1 & 91
            r1 = 18
            if (r2 != r1) goto L_0x002c
            boolean r1 = r12.BCM()
            if (r1 != 0) goto L_0x0349
        L_0x002c:
            if (r3 != 0) goto L_0x0052
            r1 = 599017409(0x23b447c1, float:1.9546028E-17)
            r12.Cvb(r1)
            java.lang.Object r3 = r0.A04
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r0.A03
            com.instagram.api.schemas.ProfileTheme r2 = (com.instagram.api.schemas.ProfileTheme) r2
            java.lang.Object r1 = r0.A01
            X.0YY r1 = (X.AnonymousClass0YY) r1
            int r0 = r0.A00
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | 72
            X.C122077Ka.A06(r12, r2, r3, r1, r0)
        L_0x0049:
            X.7W3 r12 = (X.AnonymousClass7W3) r12
            r6 = 0
        L_0x004c:
            X.AnonymousClass7W3.A0w(r12, r6)
        L_0x004f:
            kotlin.Unit r5 = kotlin.Unit.A00
        L_0x0051:
            return r5
        L_0x0052:
            r1 = 599017480(0x23b44808, float:1.9546146E-17)
            r12.Cvb(r1)
            java.lang.Object r1 = r0.A02
            X.F6t r1 = (X.F6t) r1
            r0 = 8
            X.C120607Br.A02(r12, r1, r0)
            goto L_0x0049
        L_0x0062:
            r1 = r2
            goto L_0x0020
        L_0x0064:
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            boolean r17 = X.AnonymousClass0wJ.A1X(r2)
            r1 = 0
            X.C04220Ms.A0B(r4, r1)
            java.lang.Object r13 = r0.A03
            X.97l r13 = (X.AnonymousClass97l) r13
            if (r13 == 0) goto L_0x00c2
            java.lang.Object r14 = r0.A04
            X.C00 r14 = (X.C00) r14
            int r1 = r0.A00
            java.lang.Object r15 = r0.A01
            X.8lO r15 = (X.C145958lO) r15
            X.7RM r11 = new X.7RM
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L_0x0085:
            java.lang.Object r0 = r0.A02
            X.98U r0 = (X.AnonymousClass98U) r0
            java.lang.String r0 = r0.A06
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x0353
            android.text.SpannableStringBuilder r5 = X.C18200wM.A0E(r0)
            if (r13 == 0) goto L_0x0051
            java.lang.String r1 = r13.A09
            java.lang.String r0 = " "
            r5.append(r0)
            if (r1 == 0) goto L_0x034e
            r5.append(r1)
            r0 = 2
            com.facebook.redex.IDxCSpanShape5S0200000_1_I2 r3 = new com.facebook.redex.IDxCSpanShape5S0200000_1_I2
            r3.<init>(r0, r4, r11)
            java.lang.String r0 = r5.toString()
            int r2 = X.AnonymousClass2C6.A00(r0)
            int r0 = X.AnonymousClass2C6.A00(r1)
            int r2 = r2 - r0
            java.lang.String r0 = r5.toString()
            int r1 = X.AnonymousClass2C6.A00(r0)
            r0 = 33
            r5.setSpan(r3, r2, r1, r0)
            return r5
        L_0x00c2:
            r11 = 0
            goto L_0x0085
        L_0x00c4:
            X.8nY r13 = X.C86104wH.A0H(r12, r2)
            java.lang.Object r1 = r0.A01
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            java.lang.Object r5 = r0.A02
            X.0YP r5 = (X.AnonymousClass0YP) r5
            java.lang.Object r15 = r0.A03
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r15 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r15
            java.lang.Object r4 = r0.A04
            X.56U r4 = (X.AnonymousClass56U) r4
            int r7 = r0.A00
            int r0 = r7 >> 9
            r11 = r0 & 14
            X.8ly r10 = X.AnonymousClass7KV.A05(r13)
            int r0 = r11 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            java.lang.Object r9 = X.C147188nY.A0p(r13)
            java.lang.Object r8 = X.C147188nY.A0n(r13)
            java.lang.Object r2 = X.C147188nY.A0m(r13)
            X.0ZU r6 = X.AnonymousClass74X.A00
            X.0YM r1 = X.C98236Es.A00(r1)
            int r0 = r0 << 9
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r3 = 6
            r0 = r0 | 6
            r12 = r13
            X.7W3 r12 = (X.AnonymousClass7W3) r12
            X.C147188nY.A0w(r13, r12, r6)
            r6 = 0
            X.AnonymousClass7W3.A0a(r13, r12, r10, r9)
            X.AnonymousClass7KP.A08(r13, r8, r2, r1, r0)
            X.7V5 r8 = X.AnonymousClass7V5.A00
            int r11 = r11 >> r3
            r0 = r11 & 112(0x70, float:1.57E-43)
            r1 = r0 | 6
            r0 = -1680436460(0xffffffff9bd69314, float:-3.5498377E-22)
            r13.Cvb(r0)
            r0 = r1 & 14
            if (r0 != 0) goto L_0x0122
            int r0 = X.C147188nY.A0F(r13, r8)
            r1 = r1 | r0
        L_0x0122:
            r1 = r1 & 91
            r0 = 18
            if (r1 != r0) goto L_0x0139
            boolean r0 = r13.BCM()
            if (r0 == 0) goto L_0x0139
            r13.CuJ()
        L_0x0131:
            X.AnonymousClass7W3.A0w(r12, r6)
            X.AnonymousClass7W3.A0d(r12)
            goto L_0x004c
        L_0x0139:
            X.7Wm r2 = androidx.compose.ui.Modifier.A00
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1
            androidx.compose.ui.Modifier r14 = r8.DB5(r2, r1, r0)
            r0 = r7 & 14
            r0 = r0 | 576(0x240, float:8.07E-43)
            r18 = r0
            r16 = r4
            r17 = r5
            X.AnonymousClass7Hs.A02(r13, r14, r15, r16, r17, r18)
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.Modifier.A04(r2)
            X.AnonymousClass7Hs.A00(r13, r0, r3)
            goto L_0x0131
        L_0x0157:
            X.8nY r12 = (X.C147188nY) r12
            int r1 = X.AnonymousClass0wJ.A04(r2)
            r5 = 0
            X.C04220Ms.A0B(r4, r5)
            r2 = r1 & 81
            r1 = 16
            if (r2 != r1) goto L_0x016d
            boolean r1 = r12.BCM()
            if (r1 != 0) goto L_0x0349
        L_0x016d:
            java.lang.Object r1 = r0.A04
            X.8mY r1 = (X.C146628mY) r1
            X.67q r15 = r1.BIh()
            r6 = r1
            X.5Li r6 = (X.C90305Li) r6
            boolean r4 = r6.A0A
            boolean r22 = r1.BSX()
            boolean r3 = r6.A08
            boolean r2 = r6.A07
            boolean r1 = r6.A06
            com.instagram.api.schemas.LineType r14 = r6.A00
            java.lang.Object r9 = r0.A01
            java.lang.Object r8 = r0.A03
            r10 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r6 = X.C147188nY.A10(r12, r9, r8, r10)
            r7 = r12
            X.7W3 r7 = (X.AnonymousClass7W3) r7
            java.lang.Object r11 = r7.A13()
            if (r6 != 0) goto L_0x019e
            java.lang.Object r6 = X.AnonymousClass7GN.A00
            if (r11 != r6) goto L_0x01a4
        L_0x019e:
            r6 = 16
            kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3 r11 = X.AnonymousClass7W3.A0E(r7, r9, r8, r6)
        L_0x01a4:
            X.0ZU r16 = X.AnonymousClass7W3.A08(r7, r11, r5)
            java.lang.Object r9 = r0.A02
            boolean r0 = X.C147188nY.A10(r12, r9, r8, r10)
            java.lang.Object r6 = r7.A13()
            if (r0 != 0) goto L_0x01b8
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r6 != r0) goto L_0x01be
        L_0x01b8:
            r0 = 17
            kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3 r6 = X.AnonymousClass7W3.A0E(r7, r9, r8, r0)
        L_0x01be:
            X.0ZU r17 = X.AnonymousClass7W3.A08(r7, r6, r5)
            r13 = 0
            r20 = 1536(0x600, float:2.152E-42)
            r18 = r5
            r19 = r5
            r21 = r4
            r23 = r3
            r24 = r2
            r25 = r1
            r26 = r5
            X.C100296Mt.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x004f
        L_0x01d8:
            X.8nY r11 = X.C86104wH.A0H(r12, r2)
            java.lang.Object r3 = r0.A01
            X.6m7 r3 = (X.C110696m7) r3
            java.lang.String r1 = r3.A02
            r10 = 1
            boolean r19 = X.AnonymousClass0wJ.A1W(r1)
            java.lang.Object r2 = r0.A02
            X.0YY r2 = (X.AnonymousClass0YY) r2
            r5 = 1157296644(0x44faf204, float:2007.563)
            boolean r1 = X.C147188nY.A0z(r11, r2, r5)
            r7 = r11
            X.7W3 r7 = (X.AnonymousClass7W3) r7
            java.lang.Object r4 = r7.A13()
            if (r1 != 0) goto L_0x01ff
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r4 != r1) goto L_0x0205
        L_0x01ff:
            r1 = 40
            kotlin.jvm.internal.KtLambdaShape31S0100000_I2_11 r4 = X.AnonymousClass7W3.A0F(r7, r2, r1)
        L_0x0205:
            r1 = 0
            X.0ZU r13 = X.AnonymousClass7W3.A08(r7, r4, r1)
            java.lang.Object r6 = r0.A03
            boolean r4 = X.C147188nY.A0z(r11, r6, r5)
            java.lang.Object r5 = r7.A13()
            if (r4 != 0) goto L_0x021a
            java.lang.Object r4 = X.AnonymousClass7GN.A00
            if (r5 != r4) goto L_0x0220
        L_0x021a:
            r4 = 41
            kotlin.jvm.internal.KtLambdaShape31S0100000_I2_11 r5 = X.AnonymousClass7W3.A0F(r7, r6, r4)
        L_0x0220:
            X.0ZU r14 = X.AnonymousClass7W3.A08(r7, r5, r1)
            X.7Wm r12 = androidx.compose.ui.Modifier.A00
            if (r19 == 0) goto L_0x0249
            r4 = 500(0x1f4, float:7.0E-43)
            float r8 = (float) r4
            r6 = 2143289344(0x7fc00000, float:NaN)
            boolean r4 = androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled
            if (r4 == 0) goto L_0x026a
            r4 = 5
            kotlin.jvm.internal.KtLambdaShape0S0000002_I2 r5 = new kotlin.jvm.internal.KtLambdaShape0S0000002_I2
            r5.<init>(r4, r6, r8)
        L_0x0237:
            X.55A r4 = new X.55A
            r7 = r6
            r9 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.Modifier r4 = r12.Cx6(r4)
            X.C04220Ms.A0B(r4, r1)
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.Modifier.A04(r4)
        L_0x0249:
            r4 = 1899635516(0x713a233c, float:9.217089E29)
            java.lang.Object r0 = r0.A04
            androidx.compose.animation.core.MutableTransitionState r0 = (androidx.compose.animation.core.MutableTransitionState) r0
            X.8RI r15 = new X.8RI
            r17 = r3
            r18 = r2
            r20 = r19
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20)
            X.8sI r15 = X.AnonymousClass7JR.A00(r11, r15, r4)
            r16 = 3072(0xc00, float:4.305E-42)
            r17 = r1
            X.AnonymousClass6ML.A00(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x004f
        L_0x026a:
            X.0YY r5 = androidx.compose.ui.platform.InspectableValueKt.A00
            goto L_0x0237
        L_0x026d:
            X.8jq r4 = (X.C145108jq) r4
            X.8nY r8 = X.C86104wH.A0H(r12, r2)
            r13 = 0
            X.C04220Ms.A0B(r4, r13)
            java.lang.Object r7 = r0.A01
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            X.7W3 r5 = X.C147188nY.A0Z(r8, r2)
            java.lang.Object r3 = r5.A13()
            java.lang.Object r6 = X.AnonymousClass7GN.A00
            if (r3 != r6) goto L_0x0296
            r1 = 18
            kotlin.jvm.internal.KtLambdaShape20S0100000_I2 r1 = X.C86154wM.A12(r7, r1)
            X.6rp r3 = new X.6rp
            r3.<init>(r4, r1)
            r5.A14(r3)
        L_0x0296:
            X.AnonymousClass7W3.A0w(r5, r13)
            X.6rp r3 = (X.C113626rp) r3
            java.lang.Object r10 = X.C147188nY.A0r(r8, r5, r2)
            if (r10 != r6) goto L_0x02ae
            X.7Y8 r1 = new X.7Y8
            r1.<init>(r3)
            X.76a r10 = new X.76a
            r10.<init>(r1)
            r5.A14(r10)
        L_0x02ae:
            X.AnonymousClass7W3.A0w(r5, r13)
            X.76a r10 = (X.C1195976a) r10
            java.lang.Object r4 = r0.A04
            X.6o6 r4 = (X.C111656o6) r4
            r1 = -1523808544(0xffffffffa52c86e0, float:-1.4964319E-16)
            r8.Cvb(r1)
            if (r4 == 0) goto L_0x02cd
            int r1 = r0.A00
            int r1 = r1 >> 6
            r1 = r1 & 14
            r2 = r1 | 64
            r1 = 512(0x200, float:7.175E-43)
            r2 = r2 | r1
            X.C98016Dv.A00(r3, r4, r8, r10, r2)
        L_0x02cd:
            X.AnonymousClass7W3.A0w(r5, r13)
            java.lang.Object r9 = r0.A03
            androidx.compose.ui.Modifier r9 = (androidx.compose.ui.Modifier) r9
            java.lang.Object r2 = r0.A02
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r1 = X.C147188nY.A10(r8, r3, r2, r1)
            java.lang.Object r11 = r5.A13()
            if (r1 != 0) goto L_0x02e5
            if (r11 != r6) goto L_0x02ea
        L_0x02e5:
            r1 = 3
            kotlin.jvm.internal.KtLambdaShape48S0200000_I2 r11 = X.AnonymousClass7W3.A0M(r5, r3, r2, r1)
        L_0x02ea:
            X.AnonymousClass7W3.A0w(r5, r13)
            X.0YP r11 = (X.AnonymousClass0YP) r11
            int r0 = r0.A00
            r0 = r0 & 112(0x70, float:1.57E-43)
            r12 = r0 | 8
            X.C115906w6.A00(r8, r9, r10, r11, r12, r13)
            goto L_0x004f
        L_0x02fa:
            X.8cS r4 = (X.AnonymousClass8cS) r4
            X.8nY r12 = (X.C147188nY) r12
            int r6 = X.AnonymousClass0wJ.A04(r2)
            int r1 = X.C86124wJ.A0G(r4, r6)
            if (r1 != 0) goto L_0x030d
            int r1 = X.C147188nY.A0F(r12, r4)
            r6 = r6 | r1
        L_0x030d:
            r2 = r6 & 91
            r1 = 18
            if (r2 != r1) goto L_0x0319
            boolean r1 = r12.BCM()
            if (r1 != 0) goto L_0x0349
        L_0x0319:
            java.lang.Object r3 = r0.A02
            java.lang.Object r5 = r0.A04
            java.lang.Object r2 = r0.A03
            X.7Tz r2 = (X.C122827Tz) r2
            r1 = 3
            kotlin.jvm.internal.KtLambdaShape10S0300000_I2 r1 = X.C86154wM.A0y(r3, r5, r2, r1)
            r3 = r6 & 14
            X.AnonymousClass7K5.A04(r12, r4, r1)
            java.util.Map r2 = r2.A05
            r1 = r4
            X.7Tg r1 = (X.C122637Tg) r1
            X.8pE r1 = r1.A01
            r2.put(r5, r1)
            java.lang.Object r1 = r0.A01
            X.0YC r1 = (X.AnonymousClass0YC) r1
            int r0 = r0.A00
            int r0 = r0 >> 9
            r0 = r0 & 896(0x380, float:1.256E-42)
            r3 = r3 | r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.invoke(r4, r5, r12, r0)
            goto L_0x004f
        L_0x0349:
            r12.CuJ()
            goto L_0x004f
        L_0x034e:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r2)
            throw r0
        L_0x0353:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape10S0401000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
