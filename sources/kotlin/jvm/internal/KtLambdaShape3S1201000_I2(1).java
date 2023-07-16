package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape3S1201000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S1201000_I2(String str, AnonymousClass0ZU r3, AnonymousClass0ZU r4, int i, int i2) {
        super(2);
        this.A04 = i2;
        this.A03 = str;
        if (7 - i2 != 0) {
            this.A02 = r3;
            this.A01 = r4;
        } else {
            this.A01 = r3;
            this.A02 = r4;
        }
        this.A00 = i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x02c6, code lost:
        r0.CuJ();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r42, java.lang.Object r43) {
        /*
            r41 = this;
            r5 = r41
            r0 = r42
            int r1 = r5.A04
            r2 = r43
            switch(r1) {
                case 0: goto L_0x02fd;
                case 1: goto L_0x02e4;
                case 2: goto L_0x02cb;
                case 3: goto L_0x0136;
                case 4: goto L_0x010b;
                case 5: goto L_0x00cf;
                case 6: goto L_0x00b6;
                case 7: goto L_0x009d;
                case 8: goto L_0x0085;
                case 9: goto L_0x006d;
                case 10: goto L_0x0055;
                case 11: goto L_0x003d;
                case 12: goto L_0x0025;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.8nY r4 = X.C86104wH.A0H(r0, r2)
            java.lang.String r3 = r5.A03
            java.lang.Object r2 = r5.A02
            X.0ZU r2 = (X.AnonymousClass0ZU) r2
            java.lang.Object r1 = r5.A01
            X.0ZU r1 = (X.AnonymousClass0ZU) r1
            int r0 = r5.A00
            int r0 = X.C115796vv.A00(r0)
            X.C101726Sj.A00(r4, r3, r2, r1, r0)
        L_0x0022:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0025:
            X.8nY r4 = X.C86104wH.A0H(r0, r2)
            java.lang.String r3 = r5.A03
            java.lang.Object r2 = r5.A02
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.Object r1 = r5.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            int r0 = r5.A00
            int r0 = X.C115796vv.A00(r0)
            X.C101206Qh.A00(r4, r2, r3, r1, r0)
            goto L_0x0022
        L_0x003d:
            X.8nY r4 = X.C86104wH.A0H(r0, r2)
            java.lang.String r3 = r5.A03
            java.lang.Object r2 = r5.A01
            X.672 r2 = (X.AnonymousClass672) r2
            java.lang.Object r1 = r5.A02
            X.21p r1 = (X.C305121p) r1
            int r0 = r5.A00
            int r0 = X.C115796vv.A00(r0)
            X.AnonymousClass7Hx.A03(r4, r2, r1, r3, r0)
            goto L_0x0022
        L_0x0055:
            X.8nY r4 = X.C86104wH.A0H(r0, r2)
            java.lang.String r3 = r5.A03
            java.lang.Object r2 = r5.A02
            X.8ew r2 = (X.C142488ew) r2
            java.lang.Object r1 = r5.A01
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = r5.A00
            int r0 = X.C115796vv.A00(r0)
            X.C121737Hu.A02(r4, r1, r2, r3, r0)
            goto L_0x0022
        L_0x006d:
            X.8nY r4 = X.C86104wH.A0H(r0, r2)
            java.lang.String r3 = r5.A03
            java.lang.Object r2 = r5.A01
            X.6uo r2 = (X.C115286uo) r2
            java.lang.Object r1 = r5.A02
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = r5.A00
            int r0 = X.C115796vv.A00(r0)
            X.C117876zO.A00(r4, r1, r2, r3, r0)
            goto L_0x0022
        L_0x0085:
            X.8nY r4 = X.C86104wH.A0H(r0, r2)
            java.lang.String r3 = r5.A03
            java.lang.Object r2 = r5.A02
            X.0ZU r2 = (X.AnonymousClass0ZU) r2
            java.lang.Object r1 = r5.A01
            X.0ZU r1 = (X.AnonymousClass0ZU) r1
            int r0 = r5.A00
            int r0 = X.C115796vv.A00(r0)
            X.C122107Kg.A0C(r4, r3, r2, r1, r0)
            goto L_0x0022
        L_0x009d:
            X.8nY r4 = X.C86104wH.A0H(r0, r2)
            java.lang.String r3 = r5.A03
            java.lang.Object r2 = r5.A01
            X.0ZU r2 = (X.AnonymousClass0ZU) r2
            java.lang.Object r1 = r5.A02
            X.0ZU r1 = (X.AnonymousClass0ZU) r1
            int r0 = r5.A00
            int r0 = X.C115796vv.A00(r0)
            X.AnonymousClass7JX.A05(r4, r3, r2, r1, r0)
            goto L_0x0022
        L_0x00b6:
            X.8nY r4 = X.C86104wH.A0H(r0, r2)
            java.lang.String r3 = r5.A03
            java.lang.Object r2 = r5.A01
            X.6uo r2 = (X.C115286uo) r2
            java.lang.Object r1 = r5.A02
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = r5.A00
            int r0 = X.C115796vv.A00(r0)
            X.AnonymousClass7BY.A01(r4, r1, r2, r3, r0)
            goto L_0x0022
        L_0x00cf:
            X.8nY r0 = (X.C147188nY) r0
            int r1 = X.AnonymousClass0wJ.A04(r2)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x00e0
            boolean r1 = r0.BCM()
            if (r1 != 0) goto L_0x02c6
        L_0x00e0:
            r4 = 1
            X.534 r3 = X.AnonymousClass6YR.A00
            X.7KB r1 = X.C120537Bh.A00(r0)
            long r1 = r1.A0w
            float r1 = X.AnonymousClass7KE.A00(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            X.7DS[] r2 = X.AnonymousClass7DS.A01(r3, r1, r4)
            r1 = 964419751(0x397be0a7, float:2.4020915E-4)
            java.lang.Object r6 = r5.A01
            java.lang.Object r7 = r5.A02
            int r9 = r5.A00
            java.lang.String r8 = r5.A03
            r10 = 4
            kotlin.jvm.internal.KtLambdaShape3S1201000_I2 r5 = new kotlin.jvm.internal.KtLambdaShape3S1201000_I2
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.String) r8, (int) r9, (int) r10)
            X.AnonymousClass7JR.A05(r0, r5, r2, r1)
            goto L_0x0022
        L_0x010b:
            X.8nY r0 = (X.C147188nY) r0
            int r1 = X.AnonymousClass0wJ.A04(r2)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x011c
            boolean r1 = r0.BCM()
            if (r1 != 0) goto L_0x02c6
        L_0x011c:
            X.7If r2 = X.AnonymousClass7J9.A04(r0)
            r1 = -1591491622(0xffffffffa123c3da, float:-5.5485756E-19)
            java.lang.Object r6 = r5.A01
            java.lang.Object r7 = r5.A02
            int r9 = r5.A00
            java.lang.String r8 = r5.A03
            r10 = 3
            kotlin.jvm.internal.KtLambdaShape3S1201000_I2 r5 = new kotlin.jvm.internal.KtLambdaShape3S1201000_I2
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.String) r8, (int) r9, (int) r10)
            X.AnonymousClass7JR.A04(r0, r2, r5, r1)
            goto L_0x0022
        L_0x0136:
            X.8nY r0 = (X.C147188nY) r0
            int r1 = X.AnonymousClass0wJ.A04(r2)
            r2 = r1 & 11
            r22 = 2
            r1 = r22
            if (r2 != r1) goto L_0x014a
            boolean r1 = r0.BCM()
            if (r1 != 0) goto L_0x02c6
        L_0x014a:
            java.lang.Object r10 = r5.A01
            X.67U r10 = (X.AnonymousClass67U) r10
            java.lang.Object r9 = r5.A02
            X.66v r9 = (X.C968266v) r9
            java.lang.String r1 = r5.A03
            r21 = r1
            X.7Wm r12 = androidx.compose.ui.Modifier.A01(r0)
            androidx.compose.ui.Alignment r3 = X.AnonymousClass7KV.A0E
            r20 = 1
            r1 = 0
            r2 = r20
            X.8ly r15 = X.C120767Cj.A00(r0, r3, r2)
            X.534 r14 = X.C147188nY.A0a(r0)
            java.lang.Object r6 = r0.AEA(r14)
            X.534 r13 = X.AnonymousClass7DE.A07
            java.lang.Object r5 = r0.AEA(r13)
            X.534 r11 = X.AnonymousClass7DE.A0B
            java.lang.Object r4 = r0.AEA(r11)
            X.0ZU r8 = X.AnonymousClass74X.A00
            X.0YM r3 = X.C98236Es.A00(r12)
            r2 = r0
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            X.C147188nY.A0w(r0, r2, r8)
            r2.A0T = r1
            X.0YP r7 = X.AnonymousClass74X.A03
            X.0YP r19 = X.AnonymousClass7Ak.A00(r0, r15, r6, r7)
            X.0YP r6 = X.AnonymousClass74X.A02
            X.0YP r5 = X.AnonymousClass7Ak.A01(r0, r5, r6)
            java.lang.Integer r18 = X.AnonymousClass7KP.A05(r0, r4, r5, r3)
            r4 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.Cvb(r4)
            r3 = 501340512(0x1de1d960, float:5.9781765E-21)
            r0.Cvb(r3)
            r3 = 52
            float r3 = (float) r3
            r24 = 0
            androidx.compose.ui.Modifier r15 = X.AnonymousClass7Kq.A07(r12, r3)
            r3 = 16
            androidx.compose.ui.Modifier r17 = X.AnonymousClass7K4.A08(r15, r3)
            X.8p4 r15 = X.AnonymousClass7J3.A02
            X.8cu r3 = X.AnonymousClass7KV.A04
            X.8ly r16 = X.C147188nY.A0e(r15, r0, r3)
            java.lang.Object r15 = X.C147188nY.A0s(r0, r14)
            java.lang.Object r13 = r0.AEA(r13)
            java.lang.Object r14 = r0.AEA(r11)
            X.0YM r11 = X.C98236Es.A00(r17)
            X.C147188nY.A0w(r0, r2, r8)
            r2.A0T = r1
            r8 = r16
            X.AnonymousClass7Ak.A02(r0, r8, r7)
            r7 = r19
            X.AnonymousClass7Ak.A02(r0, r15, r7)
            X.7KP r6 = X.AnonymousClass7KP.A03(r0, r13, r14, r6, r5)
            r5 = r18
            r11.invoke(r6, r0, r5)
            r0.Cvb(r4)
            X.7VA r5 = X.AnonymousClass7VA.A00
            r4 = -1642572348(0xffffffff9e1855c4, float:-8.064549E-21)
            int r7 = X.C147188nY.A07(r0, r10, r4)
            r6 = 3
            if (r7 == r1) goto L_0x02ae
            r4 = 12
            r5 = 4
            r3 = r20
            if (r7 == r3) goto L_0x025c
            r3 = r22
            if (r7 == r3) goto L_0x020f
            r3 = -2113641062(0xffffffff8204659a, float:-9.726987E-38)
            r0.Cvb(r3)
            X.AnonymousClass7W3.A0w(r2, r1)
        L_0x0205:
            r0 = r20
            X.AnonymousClass7W3.A0v(r2, r0)
            X.AnonymousClass7W3.A0v(r2, r0)
            goto L_0x0022
        L_0x020f:
            r3 = -2113641625(0xffffffff82046367, float:-9.726355E-38)
            r0.Cvb(r3)
            r3 = 2131232266(0x7f08060a, float:1.8080636E38)
            X.6uo r6 = X.AnonymousClass6QP.A00(r0, r3)
            float r3 = (float) r5
            androidx.compose.ui.Modifier r3 = X.AnonymousClass7K4.A06(r12, r3, r1)
            androidx.compose.ui.Modifier r5 = X.AnonymousClass7Kq.A0F(r3, r4)
            long r10 = X.AnonymousClass7BW.A00(r0, r10, r9)
            r8 = 440(0x1b8, float:6.17E-43)
            r4 = r0
            r7 = r24
            r9 = r1
            X.C1190173e.A00(r4, r5, r6, r7, r8, r9, r10)
            r3 = 2131822052(0x7f1105e4, float:1.9276865E38)
            java.lang.String r29 = X.AnonymousClass7JS.A01(r0, r3)
            r36 = 0
            r33 = 805306368(0x30000000, float:4.656613E-10)
            r34 = 6
            r35 = 2558(0x9fe, float:3.585E-42)
            r23 = r0
            r25 = r7
            r26 = r7
            r27 = r7
            r28 = r7
            r30 = r1
            r31 = r20
            r32 = r22
            r38 = r36
            r40 = r1
            X.AnonymousClass7I9.A02(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40)
            X.AnonymousClass7W3.A0w(r2, r1)
            goto L_0x0205
        L_0x025c:
            r3 = -2113642244(0xffffffff820460fc, float:-9.725662E-38)
            r0.Cvb(r3)
            r3 = 2131232549(0x7f080725, float:1.808121E38)
            X.6uo r6 = X.AnonymousClass6QP.A00(r0, r3)
            float r3 = (float) r5
            androidx.compose.ui.Modifier r3 = X.AnonymousClass7K4.A06(r12, r3, r1)
            androidx.compose.ui.Modifier r5 = X.AnonymousClass7Kq.A0F(r3, r4)
            long r10 = X.AnonymousClass7BW.A00(r0, r10, r9)
            r8 = 440(0x1b8, float:6.17E-43)
            r4 = r0
            r7 = r24
            r9 = r1
            X.C1190173e.A00(r4, r5, r6, r7, r8, r9, r10)
            if (r21 != 0) goto L_0x0288
            r3 = 2131822017(0x7f1105c1, float:1.9276794E38)
            java.lang.String r21 = X.AnonymousClass7JS.A01(r0, r3)
        L_0x0288:
            r36 = 0
            r33 = 805306368(0x30000000, float:4.656613E-10)
            r34 = 6
            r35 = 2558(0x9fe, float:3.585E-42)
            r23 = r0
            r25 = r7
            r26 = r7
            r27 = r7
            r28 = r7
            r29 = r21
            r30 = r1
            r31 = r20
            r32 = r22
            r38 = r36
            r40 = r1
            X.AnonymousClass7I9.A02(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40)
            X.AnonymousClass7W3.A0w(r2, r1)
            goto L_0x0205
        L_0x02ae:
            r4 = -2113642503(0xffffffff82045ff9, float:-9.725371E-38)
            r0.Cvb(r4)
            androidx.compose.ui.Modifier r5 = r5.A00(r3, r12)
            X.5HL r4 = X.C101296Qq.A00(r0)
            int r3 = r1 << r6
            X.AnonymousClass6MF.A00(r0, r5, r4, r3, r1)
            X.AnonymousClass7W3.A0w(r2, r1)
            goto L_0x0205
        L_0x02c6:
            r0.CuJ()
            goto L_0x0022
        L_0x02cb:
            X.8nY r4 = X.C86104wH.A0H(r0, r2)
            java.lang.String r3 = r5.A03
            java.lang.Object r2 = r5.A02
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.Object r1 = r5.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            int r0 = r5.A00
            int r0 = X.C115796vv.A00(r0)
            X.AnonymousClass7BU.A02(r4, r2, r3, r1, r0)
            goto L_0x0022
        L_0x02e4:
            X.8nY r4 = X.C86104wH.A0H(r0, r2)
            java.lang.Object r3 = r5.A02
            com.instagram.base.activity.IgFragmentActivity r3 = (com.instagram.base.activity.IgFragmentActivity) r3
            java.lang.String r2 = r5.A03
            java.lang.Object r1 = r5.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            int r0 = r5.A00
            int r0 = X.C115796vv.A00(r0)
            X.AnonymousClass7BU.A01(r4, r3, r2, r1, r0)
            goto L_0x0022
        L_0x02fd:
            X.8nY r4 = X.C86104wH.A0H(r0, r2)
            java.lang.Object r3 = r5.A02
            com.instagram.base.activity.IgFragmentActivity r3 = (com.instagram.base.activity.IgFragmentActivity) r3
            java.lang.String r2 = r5.A03
            java.lang.Object r1 = r5.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            int r0 = r5.A00
            int r0 = X.C115796vv.A00(r0)
            X.AnonymousClass7BU.A00(r4, r3, r2, r1, r0)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape3S1201000_I2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S1201000_I2(Object obj, Object obj2, String str, int i, int i2) {
        super(2);
        this.A04 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
        this.A03 = str;
    }
}
