package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.C02220Ah;

public class KtLambdaShape0S1011000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public String A01;
    public boolean A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1011000_I2(int i, int i2, String str, boolean z) {
        super(2);
        this.A03 = i2;
        this.A01 = str;
        this.A02 = z;
        this.A00 = i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r41, java.lang.Object r42) {
        /*
            r40 = this;
            r2 = r40
            r0 = r41
            int r3 = r2.A03
            X.8nY r0 = (X.C147188nY) r0
            int r1 = X.AnonymousClass0wJ.A04(r42)
            switch(r3) {
                case 0: goto L_0x003a;
                case 1: goto L_0x013a;
                default: goto L_0x000f;
            }
        L_0x000f:
            r3 = r1 & 11
            r1 = 2
            if (r3 != r1) goto L_0x001a
            boolean r1 = r0.BCM()
            if (r1 != 0) goto L_0x0175
        L_0x001a:
            java.lang.String r6 = r2.A01
            boolean r5 = r2.A02
            r1 = 14
            float r4 = (float) r1
            r8 = 0
            int r1 = r2.A00
            int r3 = r1 >> 3
            r1 = r3 & 14
            r2 = r1 | 384(0x180, float:5.38E-43)
            r1 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r1
            r12 = 8
            r7 = r0
            r9 = r6
            r10 = r4
            r11 = r2
            r13 = r5
            X.C100416Nf.A00(r7, r8, r9, r10, r11, r12, r13)
        L_0x0037:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x003a:
            r3 = r1 & 11
            r21 = 2
            r1 = r21
            if (r3 != r1) goto L_0x0048
            boolean r1 = r0.BCM()
            if (r1 != 0) goto L_0x0175
        L_0x0048:
            boolean r1 = r2.A02
            r20 = r1
            java.lang.String r1 = r2.A01
            r28 = r1
            int r1 = r2.A00
            r19 = r1
            X.7Wm r14 = androidx.compose.ui.Modifier.A01(r0)
            androidx.compose.ui.Alignment r1 = X.AnonymousClass7KV.A0E
            r9 = 1
            X.8ly r15 = X.C120767Cj.A00(r0, r1, r9)
            r13 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            X.534 r12 = X.C147188nY.A0b(r0, r13)
            java.lang.Object r4 = r0.AEA(r12)
            X.534 r11 = X.AnonymousClass7DE.A07
            java.lang.Object r3 = r0.AEA(r11)
            X.534 r10 = X.AnonymousClass7DE.A0B
            java.lang.Object r2 = r0.AEA(r10)
            X.0ZU r8 = X.AnonymousClass74X.A00
            X.0YM r1 = X.C98236Es.A00(r14)
            r7 = r0
            X.7W3 r7 = (X.AnonymousClass7W3) r7
            X.C147188nY.A0w(r0, r7, r8)
            r6 = 0
            r7.A0T = r6
            X.0YP r5 = X.AnonymousClass74X.A03
            X.0YP r18 = X.AnonymousClass7Ak.A00(r0, r15, r4, r5)
            X.0YP r4 = X.AnonymousClass74X.A02
            X.0YP r3 = X.AnonymousClass7Ak.A01(r0, r3, r4)
            java.lang.Integer r17 = X.AnonymousClass7KP.A05(r0, r2, r3, r1)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.Cvb(r2)
            X.7V3 r15 = X.AnonymousClass7V3.A00
            r1 = -589366211(0xffffffffdcdefc3d, float:-5.0211827E17)
            r0.Cvb(r1)
            r1 = 1211894839(0x483c0c37, float:192560.86)
            r0.Cvb(r1)
            if (r20 == 0) goto L_0x00b6
            androidx.compose.ui.Modifier r15 = X.AnonymousClass7KV.A01(r15, r14)
            X.5HL r1 = X.C101296Qq.A00(r0)
            X.AnonymousClass6MF.A00(r0, r15, r1, r6, r6)
        L_0x00b6:
            X.AnonymousClass7W3.A0w(r7, r6)
            r1 = 52
            float r1 = (float) r1
            r23 = 0
            r16 = 0
            androidx.compose.ui.Modifier r15 = X.AnonymousClass7Kq.A07(r14, r1)
            r1 = 16
            androidx.compose.ui.Modifier r15 = X.AnonymousClass7K4.A08(r15, r1)
            if (r20 == 0) goto L_0x00d2
            r1 = r16
            androidx.compose.ui.Modifier r14 = X.AnonymousClass6EV.A00(r14, r1)
        L_0x00d2:
            androidx.compose.ui.Modifier r15 = r15.Cx6(r14)
            X.8p4 r14 = X.AnonymousClass7J3.A02
            X.8cu r1 = X.AnonymousClass7KV.A04
            X.8ly r1 = X.C147188nY.A0e(r14, r0, r1)
            java.lang.Object r12 = X.C147188nY.A0t(r0, r12, r13)
            java.lang.Object r11 = r0.AEA(r11)
            java.lang.Object r13 = r0.AEA(r10)
            X.0YM r10 = X.C98236Es.A00(r15)
            X.C147188nY.A0w(r0, r7, r8)
            r7.A0T = r6
            X.AnonymousClass7Ak.A02(r0, r1, r5)
            r1 = r18
            X.AnonymousClass7Ak.A02(r0, r12, r1)
            X.7KP r3 = X.AnonymousClass7KP.A03(r0, r11, r13, r4, r3)
            r1 = r17
            r10.invoke(r3, r0, r1)
            r0.Cvb(r2)
            r1 = -577560743(0xffffffffdd931f59, float:-1.32516124E18)
            r0.Cvb(r1)
            r35 = 0
            r2 = 805306368(0x30000000, float:4.656613E-10)
            int r1 = r19 >> 3
            r32 = r1 & 14
            r32 = r32 | r2
            r33 = 6
            r34 = 2558(0x9fe, float:3.585E-42)
            r22 = r0
            r24 = r23
            r25 = r23
            r26 = r23
            r27 = r23
            r29 = r6
            r30 = r9
            r31 = r21
            r37 = r35
            r39 = r6
            X.AnonymousClass7I9.A02(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39)
            X.AnonymousClass7W3.A0v(r7, r9)
            X.AnonymousClass7W3.A0v(r7, r9)
            goto L_0x0037
        L_0x013a:
            r3 = r1 & 11
            r1 = 2
            if (r3 != r1) goto L_0x0145
            boolean r1 = r0.BCM()
            if (r1 != 0) goto L_0x0175
        L_0x0145:
            r7 = 0
            X.7If r3 = X.AnonymousClass7J9.A00(r0)
            r12 = 0
            r1 = 17
            long r14 = X.AnonymousClass7Hi.A03(r1)
            r9 = 0
            r11 = 262141(0x3fffd, float:3.67338E-40)
            X.7If r8 = new X.7If
            r10 = r9
            r16 = r12
            r8.<init>(r9, r10, r11, r12, r14, r16)
            X.7If r6 = r3.A01(r8)
            r5 = 2032906371(0x792bb083, float:5.571643E34)
            boolean r4 = r2.A02
            java.lang.String r3 = r2.A01
            int r2 = r2.A00
            kotlin.jvm.internal.KtLambdaShape0S1011000_I2 r1 = new kotlin.jvm.internal.KtLambdaShape0S1011000_I2
            r1.<init>(r2, r7, r3, r4)
            X.AnonymousClass7JR.A04(r0, r6, r1, r5)
            goto L_0x0037
        L_0x0175:
            r0.CuJ()
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape0S1011000_I2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
