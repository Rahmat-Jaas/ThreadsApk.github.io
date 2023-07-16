package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.C02220Ah;

public class KtLambdaShape1S1102000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public String A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S1102000_I2(Object obj, String str, int i, int i2, int i3) {
        super(2);
        this.A04 = i3;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00e4, code lost:
        r13.CuJ();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r32, java.lang.Object r33) {
        /*
            r31 = this;
            r2 = r31
            r13 = r32
            int r0 = r2.A04
            r1 = r33
            switch(r0) {
                case 0: goto L_0x00e9;
                case 1: goto L_0x004d;
                case 2: goto L_0x0023;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.8nY r5 = X.C86104wH.A0H(r13, r1)
            java.lang.String r4 = r2.A03
            java.lang.Object r3 = r2.A02
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            int r0 = r2.A00
            int r1 = X.C115796vv.A00(r0)
            int r0 = r2.A01
            X.C101166Qd.A00(r5, r3, r4, r1, r0)
        L_0x0020:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0023:
            X.8nY r13 = (X.C147188nY) r13
            int r0 = X.AnonymousClass0wJ.A04(r1)
            r1 = r0 & 11
            r0 = 2
            if (r1 != r0) goto L_0x0034
            boolean r0 = r13.BCM()
            if (r0 != 0) goto L_0x00e4
        L_0x0034:
            X.7If r1 = X.AnonymousClass7J9.A04(r13)
            r0 = -1532240986(0xffffffffa4abdba6, float:-7.453153E-17)
            r7 = 1
            java.lang.String r4 = r2.A03
            int r5 = r2.A00
            int r6 = r2.A01
            java.lang.Object r3 = r2.A02
            kotlin.jvm.internal.KtLambdaShape1S1102000_I2 r2 = new kotlin.jvm.internal.KtLambdaShape1S1102000_I2
            r2.<init>(r3, r4, r5, r6, r7)
            X.AnonymousClass7JR.A04(r13, r1, r2, r0)
            goto L_0x0020
        L_0x004d:
            X.8nY r13 = (X.C147188nY) r13
            int r0 = X.AnonymousClass0wJ.A04(r1)
            r0 = r0 & 11
            r6 = 2
            if (r0 != r6) goto L_0x005e
            boolean r0 = r13.BCM()
            if (r0 != 0) goto L_0x00e4
        L_0x005e:
            X.8p4 r9 = X.AnonymousClass7J3.A02
            X.8cu r8 = X.AnonymousClass7KV.A04
            X.7Wm r4 = androidx.compose.ui.Modifier.A00
            r0 = 16
            androidx.compose.ui.Modifier r3 = X.AnonymousClass7K4.A08(r4, r0)
            java.lang.String r5 = r2.A03
            int r7 = r2.A00
            int r0 = r2.A01
            java.lang.Object r1 = r2.A02
            X.6hM r1 = (X.C107816hM) r1
            X.8ly r12 = X.C147188nY.A0e(r9, r13, r8)
            java.lang.Object r11 = X.C147188nY.A0p(r13)
            java.lang.Object r10 = X.C147188nY.A0n(r13)
            java.lang.Object r9 = X.C147188nY.A0m(r13)
            X.0ZU r8 = X.AnonymousClass74X.A00
            X.0YM r2 = X.C98236Es.A00(r3)
            r3 = r13
            X.7W3 r3 = (X.AnonymousClass7W3) r3
            X.C147188nY.A0w(r13, r3, r8)
            r20 = 0
            X.AnonymousClass7W3.A0a(r13, r3, r12, r11)
            X.AnonymousClass7KP.A07(r13, r10, r9, r2)
            X.7VA r9 = X.AnonymousClass7VA.A00
            r2 = -1976841206(0xffffffff8a2bcc0a, float:-8.271726E-33)
            r13.Cvb(r2)
            r15 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r2 = 1
            androidx.compose.ui.Modifier r14 = r9.DB5(r4, r8, r2)
            r26 = 0
            r8 = 805306368(0x30000000, float:4.656613E-10)
            int r7 = r7 >> 3
            r23 = r7 & 14
            r23 = r23 | r8
            r24 = 6
            r25 = 2556(0x9fc, float:3.582E-42)
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r5
            r21 = r2
            r22 = r6
            r28 = r26
            r30 = r20
            X.AnonymousClass7I9.A02(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30)
            X.6uo r6 = X.AnonymousClass6QP.A00(r13, r0)
            r0 = 20
            androidx.compose.ui.Modifier r5 = X.AnonymousClass7Kq.A0F(r4, r0)
            long r0 = r1.A01
            r8 = 440(0x1b8, float:6.17E-43)
            r4 = r13
            r7 = r15
            r9 = r20
            r10 = r0
            X.C1190173e.A00(r4, r5, r6, r7, r8, r9, r10)
            X.AnonymousClass7W3.A0v(r3, r2)
            goto L_0x0020
        L_0x00e4:
            r13.CuJ()
            goto L_0x0020
        L_0x00e9:
            X.8nY r5 = X.C86104wH.A0H(r13, r1)
            java.lang.String r4 = r2.A03
            java.lang.Object r3 = r2.A02
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            int r0 = r2.A00
            int r1 = X.C115796vv.A00(r0)
            int r0 = r2.A01
            X.C100046Lt.A00(r5, r3, r4, r1, r0)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape1S1102000_I2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
