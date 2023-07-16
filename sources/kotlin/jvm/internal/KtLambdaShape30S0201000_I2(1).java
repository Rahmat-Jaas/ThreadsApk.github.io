package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.C02220Ah;

public class KtLambdaShape30S0201000_I2 extends C02220Ah implements AnonymousClass0YM {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape30S0201000_I2(int i, int i2, Object obj, Object obj2) {
        super(3);
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r23, java.lang.Object r24, java.lang.Object r25) {
        /*
            r22 = this;
            r0 = r22
            r6 = r25
            r5 = r23
            r7 = r24
            int r1 = r0.A03
            switch(r1) {
                case 0: goto L_0x04a3;
                case 1: goto L_0x0478;
                case 2: goto L_0x0431;
                case 3: goto L_0x03c6;
                case 4: goto L_0x035d;
                case 5: goto L_0x0312;
                case 6: goto L_0x02cc;
                case 7: goto L_0x0249;
                case 8: goto L_0x0202;
                case 9: goto L_0x01bd;
                case 10: goto L_0x0170;
                case 11: goto L_0x0139;
                case 12: goto L_0x0110;
                case 13: goto L_0x00c5;
                case 14: goto L_0x0076;
                case 15: goto L_0x0035;
                default: goto L_0x000d;
            }
        L_0x000d:
            X.8nY r7 = (X.C147188nY) r7
            int r1 = X.AnonymousClass0wJ.A04(r6)
            r2 = r1 & 81
            r1 = 16
            if (r2 != r1) goto L_0x001f
            boolean r1 = r7.BCM()
            if (r1 != 0) goto L_0x04c8
        L_0x001f:
            java.lang.Object r2 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0112000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0112000_I2) r2
            java.lang.Object r1 = r0.A02
            X.0ZU r1 = (X.AnonymousClass0ZU) r1
            int r0 = r0.A00
            int r0 = r0 >> 15
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 8
            X.AnonymousClass7KL.A04(r7, r2, r1, r0)
        L_0x0032:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0035:
            X.8nY r7 = (X.C147188nY) r7
            int r1 = X.AnonymousClass0wJ.A04(r6)
            r1 = r1 & 81
            r13 = 16
            if (r1 != r13) goto L_0x0047
            boolean r1 = r7.BCM()
            if (r1 != 0) goto L_0x04c8
        L_0x0047:
            java.lang.Object r5 = r0.A02
            X.65g r5 = (X.C965165g) r5
            boolean r2 = r5.A07
            r1 = 0
            float r4 = (float) r1
            r3 = r4
            if (r2 == 0) goto L_0x0055
            r1 = 8
            float r4 = (float) r1
        L_0x0055:
            java.lang.String r9 = r5.A04
            java.lang.Object r11 = r0.A01
            X.0YY r11 = (X.AnonymousClass0YY) r11
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
            r6 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.Modifier.A04(r1)
            float r1 = (float) r13
            androidx.compose.ui.Modifier r8 = X.AnonymousClass7K4.A05(r2, r1, r4, r1, r3)
            r1 = 2131835293(0x7f11399d, float:1.930372E38)
            java.lang.String r10 = X.AnonymousClass7JS.A01(r7, r1)
            int r0 = r0.A00
            r12 = r0 & 112(0x70, float:1.57E-43)
            X.AnonymousClass70R.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0032
        L_0x0076:
            X.8nY r7 = (X.C147188nY) r7
            int r1 = X.AnonymousClass0wJ.A04(r6)
            r2 = r1 & 81
            r1 = 16
            if (r2 != r1) goto L_0x0088
            boolean r1 = r7.BCM()
            if (r1 != 0) goto L_0x04c8
        L_0x0088:
            java.lang.Object r1 = r0.A02
            if (r1 != 0) goto L_0x009b
            r0 = 225026775(0xd69a2d7, float:7.199468E-31)
            r7.Cvb(r0)
            r1 = 0
            r0 = 6
            X.C122077Ka.A04(r7, r1, r0)
        L_0x0097:
            X.AnonymousClass7W3.A0y(r7)
            goto L_0x0032
        L_0x009b:
            r1 = 225026817(0xd69a301, float:7.1994877E-31)
            r7.Cvb(r1)
            java.lang.Object r1 = r0.A01
            boolean r0 = X.C147188nY.A0y(r7, r1)
            r3 = r7
            X.7W3 r3 = (X.AnonymousClass7W3) r3
            java.lang.Object r2 = r3.A13()
            if (r0 != 0) goto L_0x00b4
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r2 != r0) goto L_0x00bc
        L_0x00b4:
            r0 = 3
            kotlin.jvm.internal.KtLambdaShape77S0100000_I2_57 r2 = X.C86164wN.A12(r1, r0)
            r3.A14(r2)
        L_0x00bc:
            r1 = 0
            X.0ZU r0 = X.AnonymousClass7W3.A09(r3, r2, r1)
            X.C122077Ka.A0B(r7, r0, r1)
            goto L_0x0097
        L_0x00c5:
            android.content.Context r5 = (android.content.Context) r5
            android.app.Activity r7 = (android.app.Activity) r7
            X.90z r6 = (X.C1526990z) r6
            r1 = 0
            X.AnonymousClass0wJ.A1M(r5, r1, r6)
            java.lang.Object r4 = r0.A02
            X.Aco r4 = (X.C18277Aco) r4
            java.lang.Object r3 = r0.A01
            X.BKU r3 = (X.BKU) r3
            int r2 = r0.A00
            boolean r0 = X.C19548Ay9.A00()
            if (r0 == 0) goto L_0x0032
            r0 = 2130970951(0x7f040947, float:1.7550627E38)
            int r1 = X.C121907Is.A01(r5, r0)
            int r1 = r1 + r2
            if (r7 == 0) goto L_0x010e
            int r0 = X.C31164GhX.A01(r7)
        L_0x00ed:
            int r1 = r1 + r0
            com.instagram.service.session.UserSession r0 = r4.A01
            android.util.Size r3 = X.C18731AkP.A00(r5, r3, r0, r1)
            if (r3 == 0) goto L_0x0032
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r2 = r6.A07
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = r3.getWidth()
            r1.width = r0
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = r3.getHeight()
            r1.height = r0
            goto L_0x0032
        L_0x010e:
            r0 = 0
            goto L_0x00ed
        L_0x0110:
            X.8ix r5 = (X.C144708ix) r5
            X.BMH r7 = (X.BMH) r7
            int r2 = X.AnonymousClass0wJ.A04(r6)
            X.AnonymousClass0wJ.A1N(r5, r7)
            java.lang.Object r1 = r0.A01
            X.BKU r1 = (X.BKU) r1
            X.BKU r8 = r1.A2E(r2)
            if (r8 == 0) goto L_0x0032
            X.C3w r1 = r5.AWo()
            X.C3D r6 = r1.AWn()
            java.lang.Object r10 = r0.A02
            X.BMj r10 = (X.C20066BMj) r10
            r9 = 0
            int r11 = r0.A00
            r6.CL2(r7, r8, r9, r10, r11)
            goto L_0x0032
        L_0x0139:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r7 = (java.lang.String) r7
            boolean r3 = X.AnonymousClass0wJ.A1X(r6)
            if (r5 == 0) goto L_0x0149
            int r1 = r5.length()
            if (r1 != 0) goto L_0x0154
        L_0x0149:
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            r1 = 2131823861(0x7f110cf5, float:1.9280534E38)
            java.lang.String r5 = r2.getString(r1)
        L_0x0154:
            X.C04220Ms.A09(r5)
            java.lang.Object r1 = r0.A02
            X.CDG r1 = (X.CDG) r1
            X.C8H r1 = r1.A07
            int r0 = r0.A00
            X.56r r2 = r1.A0B
            X.DTq r1 = new X.DTq
            r1.<init>(r5, r7, r0, r3)
            X.Dos r0 = new X.Dos
            r0.<init>(r1)
            r2.A0H(r0)
            goto L_0x0032
        L_0x0170:
            X.8nY r7 = (X.C147188nY) r7
            int r1 = X.AnonymousClass0wJ.A04(r6)
            r2 = r1 & 81
            r1 = 16
            if (r2 != r1) goto L_0x0182
            boolean r1 = r7.BCM()
            if (r1 != 0) goto L_0x04c8
        L_0x0182:
            java.lang.Object r1 = r0.A02
            X.5M1 r1 = (X.AnonymousClass5M1) r1
            X.5Hm r4 = r1.A00
            boolean r1 = r4.A09
            if (r1 != 0) goto L_0x0032
            X.D0g r3 = r4.A01
            boolean r2 = r4.A07
            boolean r1 = r4.A08
            X.68K r10 = X.AnonymousClass6MN.A00(r3, r2, r1)
            java.lang.Object r3 = r0.A01
            boolean r0 = X.C147188nY.A0y(r7, r3)
            r2 = r7
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            java.lang.Object r1 = r2.A13()
            if (r0 != 0) goto L_0x01a9
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x01af
        L_0x01a9:
            r0 = 40
            kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16 r1 = X.AnonymousClass7W3.A0K(r2, r3, r0)
        L_0x01af:
            r12 = 0
            X.0ZU r11 = X.AnonymousClass7W3.A08(r2, r1, r12)
            r8 = 0
            r13 = 12
            r9 = r8
            X.AnonymousClass6M7.A00(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0032
        L_0x01bd:
            X.8nY r7 = (X.C147188nY) r7
            int r1 = X.AnonymousClass0wJ.A04(r6)
            r2 = r1 & 81
            r1 = 16
            if (r2 != r1) goto L_0x01cf
            boolean r1 = r7.BCM()
            if (r1 != 0) goto L_0x04c8
        L_0x01cf:
            java.lang.Object r1 = r0.A02
            X.5Hm r1 = (X.C89905Hm) r1
            X.D0g r2 = r1.A01
            boolean r1 = r1.A07
            r12 = 0
            r8 = 0
            X.68K r10 = X.AnonymousClass6MN.A00(r2, r1, r12)
            java.lang.Object r3 = r0.A01
            boolean r0 = X.C147188nY.A0y(r7, r3)
            r2 = r7
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            java.lang.Object r1 = r2.A13()
            if (r0 != 0) goto L_0x01f0
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x01f6
        L_0x01f0:
            r0 = 33
            kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16 r1 = X.AnonymousClass7W3.A0K(r2, r3, r0)
        L_0x01f6:
            X.0ZU r11 = X.AnonymousClass7W3.A08(r2, r1, r12)
            r13 = 12
            r9 = r8
            X.AnonymousClass6M7.A00(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0032
        L_0x0202:
            X.8nY r7 = (X.C147188nY) r7
            int r1 = X.AnonymousClass0wJ.A04(r6)
            r2 = r1 & 81
            r1 = 16
            if (r2 != r1) goto L_0x0214
            boolean r1 = r7.BCM()
            if (r1 != 0) goto L_0x04c8
        L_0x0214:
            java.lang.Object r1 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r1
            java.lang.Object r2 = r1.A00
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            boolean r4 = X.C18180wK.A1Z(r2, r1)
            java.lang.Object r3 = r0.A02
            boolean r0 = X.C147188nY.A0y(r7, r3)
            r2 = r7
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            java.lang.Object r1 = r2.A13()
            if (r0 != 0) goto L_0x0233
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x0239
        L_0x0233:
            r0 = 19
            kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16 r1 = X.AnonymousClass7W3.A0K(r2, r3, r0)
        L_0x0239:
            r0 = 0
            X.0ZU r1 = X.AnonymousClass7W3.A09(r2, r1, r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.Modifier.A04(r0)
            X.C117686z5.A01(r7, r0, r1, r4)
            goto L_0x0032
        L_0x0249:
            X.8nY r6 = X.C86104wH.A0H(r7, r6)
            java.lang.Object r3 = r0.A01
            X.4oM r3 = (X.C81784oM) r3
            java.lang.Object r1 = r3.getValue()
            X.5Hq r1 = (X.C89945Hq) r1
            r8 = 0
            if (r1 == 0) goto L_0x025c
            java.lang.String r8 = r1.A07
        L_0x025c:
            java.lang.String r2 = "Required value was null."
            if (r8 == 0) goto L_0x04d2
            java.lang.Object r1 = r3.getValue()
            X.5Hq r1 = (X.C89945Hq) r1
            if (r1 == 0) goto L_0x04cd
            java.lang.String r9 = r1.A08
            java.lang.Object r1 = r3.getValue()
            X.5Hq r1 = (X.C89945Hq) r1
            r14 = 0
            r2 = 1
            if (r1 == 0) goto L_0x0279
            boolean r1 = r1.A0H
            if (r1 != r2) goto L_0x0279
            r14 = 1
        L_0x0279:
            java.lang.Object r4 = r0.A02
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r1 = X.C147188nY.A10(r6, r3, r4, r5)
            r2 = r6
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            java.lang.Object r0 = r2.A13()
            if (r1 != 0) goto L_0x028f
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r0 != r1) goto L_0x0297
        L_0x028f:
            r0 = 5
            kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4 r0 = X.C86164wN.A0y(r3, r4, r0)
            r2.A14(r0)
        L_0x0297:
            r12 = 0
            X.0ZU r10 = X.AnonymousClass7W3.A08(r2, r0, r12)
            boolean r1 = X.C147188nY.A10(r6, r3, r4, r5)
            java.lang.Object r0 = r2.A13()
            if (r1 != 0) goto L_0x02aa
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r0 != r1) goto L_0x02b2
        L_0x02aa:
            r0 = 6
            kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4 r0 = X.C86164wN.A0y(r3, r4, r0)
            r2.A14(r0)
        L_0x02b2:
            X.0ZU r11 = X.AnonymousClass7W3.A08(r2, r0, r12)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.Modifier.A04(r0)
            r0 = 12
            float r1 = (float) r0
            r0 = 16
            float r0 = (float) r0
            androidx.compose.ui.Modifier r7 = X.AnonymousClass7K4.A05(r2, r0, r1, r0, r0)
            r13 = r12
            X.C100406Ne.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0032
        L_0x02cc:
            X.8nY r4 = X.C86104wH.A0H(r7, r6)
            r12 = 0
            X.C04220Ms.A0B(r5, r12)
            java.lang.Object r5 = r0.A02
            X.8s2 r5 = (X.AnonymousClass8s2) r5
            X.7Wm r3 = androidx.compose.ui.Modifier.A00
            r1 = 8
            float r2 = (float) r1
            r8 = 0
            float r1 = (float) r12
            androidx.compose.ui.Modifier r7 = X.AnonymousClass7K4.A05(r3, r1, r2, r1, r1)
            java.lang.Object r6 = r0.A01
            boolean r1 = X.C147188nY.A0y(r4, r6)
            r3 = r4
            X.7W3 r3 = (X.AnonymousClass7W3) r3
            java.lang.Object r2 = r3.A13()
            if (r1 != 0) goto L_0x02f6
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r2 != r1) goto L_0x02fc
        L_0x02f6:
            r1 = 33
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r2 = X.AnonymousClass7W3.A0J(r3, r6, r1)
        L_0x02fc:
            X.0ZU r10 = X.AnonymousClass7W3.A08(r3, r2, r12)
            r11 = 15
            r9 = r8
            androidx.compose.ui.Modifier r1 = X.C117646z1.A00(r7, r8, r9, r10, r11, r12)
            int r0 = r0.A00
            int r0 = r0 >> 3
            r0 = r0 & 14
            X.C120847Cu.A00(r4, r1, r5, r0)
            goto L_0x0032
        L_0x0312:
            X.8nY r7 = (X.C147188nY) r7
            int r1 = X.AnonymousClass0wJ.A04(r6)
            r2 = r1 & 81
            r1 = 16
            if (r2 != r1) goto L_0x0324
            boolean r1 = r7.BCM()
            if (r1 != 0) goto L_0x04c8
        L_0x0324:
            java.lang.Object r1 = r0.A01
            java.lang.Object r1 = X.C86104wH.A0f(r1)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r1
            java.lang.Object r2 = r1.A00
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            boolean r4 = X.C18180wK.A1Z(r2, r1)
            java.lang.Object r3 = r0.A02
            boolean r0 = X.C147188nY.A0y(r7, r3)
            r2 = r7
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            java.lang.Object r1 = r2.A13()
            if (r0 != 0) goto L_0x0347
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x034d
        L_0x0347:
            r0 = 22
            kotlin.jvm.internal.KtLambdaShape33S0100000_I2_13 r1 = X.AnonymousClass7W3.A0H(r2, r3, r0)
        L_0x034d:
            r0 = 0
            X.0ZU r1 = X.AnonymousClass7W3.A09(r2, r1, r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.Modifier.A04(r0)
            X.C117686z5.A01(r7, r0, r1, r4)
            goto L_0x0032
        L_0x035d:
            X.8nY r7 = (X.C147188nY) r7
            int r2 = X.AnonymousClass0wJ.A04(r6)
            r1 = 0
            X.C04220Ms.A0B(r5, r1)
            r3 = r2 & 81
            r2 = 16
            if (r3 != r2) goto L_0x0373
            boolean r2 = r7.BCM()
            if (r2 != 0) goto L_0x04c8
        L_0x0373:
            java.lang.Object r4 = r0.A02
            X.8mY r4 = (X.C146628mY) r4
            r3 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2) r3
            java.lang.Object r2 = r3.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3200000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3200000_I2) r2
            java.lang.String r13 = r2.A02
            java.lang.Object r11 = r2.A00
            com.instagram.common.typedurl.ImageUrl r11 = (com.instagram.common.typedurl.ImageUrl) r11
            java.lang.Object r12 = r2.A01
            com.instagram.common.typedurl.ImageUrl r12 = (com.instagram.common.typedurl.ImageUrl) r12
            java.lang.String r14 = r2.A03
            java.lang.String r15 = r2.A04
            X.67q r10 = r4.BIh()
            java.lang.Object r9 = r3.A02
            com.instagram.api.schemas.LineType r9 = (com.instagram.api.schemas.LineType) r9
            boolean r2 = r3.A0A
            r8 = 0
            java.lang.Object r5 = r0.A01
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r0 = X.C147188nY.A10(r7, r5, r4, r0)
            r3 = r7
            X.7W3 r3 = (X.AnonymousClass7W3) r3
            java.lang.Object r6 = r3.A13()
            if (r0 != 0) goto L_0x03ad
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r6 != r0) goto L_0x03b3
        L_0x03ad:
            r0 = 10
            kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3 r6 = X.AnonymousClass7W3.A0E(r3, r5, r4, r0)
        L_0x03b3:
            X.0ZU r16 = X.AnonymousClass7W3.A08(r3, r6, r1)
            r20 = 1152(0x480, float:1.614E-42)
            r17 = r8
            r18 = r1
            r19 = r1
            r21 = r2
            X.C117776zE.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0032
        L_0x03c6:
            X.8nY r7 = (X.C147188nY) r7
            int r1 = X.AnonymousClass0wJ.A04(r6)
            r2 = r1 & 81
            r1 = 16
            if (r2 != r1) goto L_0x03d8
            boolean r1 = r7.BCM()
            if (r1 != 0) goto L_0x04c8
        L_0x03d8:
            java.lang.Object r2 = r0.A02
            X.8mY r2 = (X.C146628mY) r2
            r1 = r2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5240000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5240000_I2) r1
            java.lang.String r11 = r1.A04
            X.67q r10 = r2.BIh()
            java.lang.Object r9 = r1.A00
            com.instagram.api.schemas.LineType r9 = (com.instagram.api.schemas.LineType) r9
            boolean r2 = r1.A08
            java.lang.Object r4 = r0.A01
            r5 = 1157296644(0x44faf204, float:2007.563)
            boolean r0 = X.C147188nY.A0z(r7, r4, r5)
            r3 = r7
            X.7W3 r3 = (X.AnonymousClass7W3) r3
            java.lang.Object r1 = r3.A13()
            if (r0 != 0) goto L_0x0401
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x0407
        L_0x0401:
            r0 = 38
            kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6 r1 = X.AnonymousClass7W3.A0C(r3, r4, r0)
        L_0x0407:
            r15 = 0
            X.0YY r13 = X.AnonymousClass7W3.A0A(r3, r1, r15)
            boolean r0 = X.C147188nY.A0z(r7, r4, r5)
            java.lang.Object r1 = r3.A13()
            if (r0 != 0) goto L_0x041a
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x0420
        L_0x041a:
            r0 = 39
            kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6 r1 = X.AnonymousClass7W3.A0C(r3, r4, r0)
        L_0x0420:
            X.0YY r14 = X.AnonymousClass7W3.A0A(r3, r1, r15)
            r8 = 0
            r17 = 448(0x1c0, float:6.28E-43)
            r12 = r8
            r16 = r15
            r18 = r2
            X.C100276Mr.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0032
        L_0x0431:
            X.8nY r7 = (X.C147188nY) r7
            int r1 = X.AnonymousClass0wJ.A04(r6)
            r2 = r1 & 81
            r1 = 16
            if (r2 != r1) goto L_0x0443
            boolean r1 = r7.BCM()
            if (r1 != 0) goto L_0x04c8
        L_0x0443:
            java.lang.Object r1 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r1
            java.lang.Object r2 = r1.A00
            X.68G r1 = X.AnonymousClass68G.LOADING_MORE
            boolean r4 = X.C18180wK.A1Z(r2, r1)
            java.lang.Object r3 = r0.A02
            boolean r0 = X.C147188nY.A0y(r7, r3)
            r2 = r7
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            java.lang.Object r1 = r2.A13()
            if (r0 != 0) goto L_0x0462
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x0468
        L_0x0462:
            r0 = 11
            kotlin.jvm.internal.KtLambdaShape31S0100000_I2_11 r1 = X.AnonymousClass7W3.A0F(r2, r3, r0)
        L_0x0468:
            r0 = 0
            X.0ZU r1 = X.AnonymousClass7W3.A09(r2, r1, r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.Modifier.A04(r0)
            X.C117686z5.A01(r7, r0, r1, r4)
            goto L_0x0032
        L_0x0478:
            X.8mL r5 = (X.C146498mL) r5
            X.7Ks r7 = (X.C122137Ks) r7
            boolean r2 = X.AnonymousClass0wJ.A1Y(r5, r7)
            java.lang.Object r1 = r0.A01
            java.lang.Object r3 = X.C86144wL.A0j(r1)
            java.lang.Object r1 = r0.A02
            X.6b8 r1 = (X.C104036b8) r1
            X.C04220Ms.A0B(r1, r2)
            int r2 = r1.A00
            if (r2 >= 0) goto L_0x0496
            int r1 = X.C122137Ks.A00(r7)
            int r2 = r2 + r1
        L_0x0496:
            X.C122137Ks.A0D(r7, r3, r2)
            int r0 = r0.A00
            r5.BQd(r0, r3)
            r5.AIY(r3)
            goto L_0x0032
        L_0x04a3:
            X.8nY r7 = (X.C147188nY) r7
            int r1 = X.AnonymousClass0wJ.A04(r6)
            r2 = r1 & 81
            r1 = 16
            if (r2 != r1) goto L_0x04b5
            boolean r1 = r7.BCM()
            if (r1 != 0) goto L_0x04c8
        L_0x04b5:
            java.lang.Object r2 = r0.A02
            X.0YP r2 = (X.AnonymousClass0YP) r2
            java.lang.Object r1 = r0.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            int r0 = r0.A00
            int r0 = r0 >> 12
            r0 = r0 & 112(0x70, float:1.57E-43)
            X.AnonymousClass7IG.A03(r7, r2, r1, r0)
            goto L_0x0032
        L_0x04c8:
            r7.CuJ()
            goto L_0x0032
        L_0x04cd:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r2)
            throw r0
        L_0x04d2:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape30S0201000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
