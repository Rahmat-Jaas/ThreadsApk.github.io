package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.C02220Ah;

public class KtLambdaShape2S0211000_I2 extends C02220Ah implements AnonymousClass0YM {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S0211000_I2(Object obj, Object obj2, int i, int i2, boolean z) {
        super(3);
        this.A04 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A03 = z;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cb, code lost:
        if ((!X.C63803iN.A0E(X.AnonymousClass0TJ.A05, r4, 36323281451622146L)) == false) goto L_0x00cd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            r19 = this;
            r2 = r19
            r9 = r21
            int r0 = r2.A04
            r1 = r20
            if (r0 == 0) goto L_0x0081
            X.8nY r9 = (X.C147188nY) r9
            int r0 = X.AnonymousClass0wJ.A04(r22)
            r3 = 0
            X.C04220Ms.A0B(r1, r3)
            r1 = r0 & 81
            r0 = 16
            if (r1 != r0) goto L_0x0020
            boolean r0 = r9.BCM()
            if (r0 != 0) goto L_0x018d
        L_0x0020:
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r2.A01
            X.D0g r0 = (X.C23894D0g) r0
            int r6 = r0.ordinal()
            r5 = 3
            r4 = 1
            r1 = 4
            if (r6 == r1) goto L_0x007d
            r0 = 2131827656(0x7f111bc8, float:1.928823E38)
            if (r6 == r5) goto L_0x0039
            r0 = 2131827652(0x7f111bc4, float:1.9288223E38)
        L_0x0039:
            java.lang.String r13 = X.AnonymousClass7JS.A01(r9, r0)
            if (r6 == r1) goto L_0x0072
            if (r6 == r5) goto L_0x0072
            r0 = -1489247170(0xffffffffa73be43e, float:-2.6075194E-15)
            r9.Cvb(r0)
            X.8m5 r12 = X.AnonymousClass70Q.A00(r9)
        L_0x004b:
            X.AnonymousClass7W3.A0z(r9, r3)
            X.7Wm r4 = androidx.compose.ui.Modifier.A00
            r0 = 112(0x70, float:1.57E-43)
            float r1 = (float) r0
            r0 = 32
            float r0 = (float) r0
            androidx.compose.ui.Modifier r10 = X.AnonymousClass7Kq.A0D(r4, r1, r0)
            java.lang.Object r14 = r2.A02
            X.0ZU r14 = (X.AnonymousClass0ZU) r14
            r8 = 0
            int r0 = r2.A00
            r0 = r0 & 14
            r15 = r0 | 384(0x180, float:5.38E-43)
            r16 = 216(0xd8, float:3.03E-43)
            r11 = r8
            r17 = r3
            r18 = r3
            X.AnonymousClass70P.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x006f:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0072:
            r0 = -1489247228(0xffffffffa73be404, float:-2.607507E-15)
            r9.Cvb(r0)
            X.8m5 r12 = X.AnonymousClass70Q.A01(r9, r4, r3)
            goto L_0x004b
        L_0x007d:
            r0 = 2131827666(0x7f111bd2, float:1.9288251E38)
            goto L_0x0039
        L_0x0081:
            X.8nY r9 = (X.C147188nY) r9
            int r0 = X.AnonymousClass0wJ.A04(r22)
            r7 = 0
            X.C04220Ms.A0B(r1, r7)
            r1 = r0 & 81
            r0 = 16
            if (r1 != r0) goto L_0x0097
            boolean r0 = r9.BCM()
            if (r0 != 0) goto L_0x018d
        L_0x0097:
            java.lang.Object r1 = r2.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            int r0 = r2.A00
            int r0 = r0 >> 6
            X.C86104wH.A1S(r9, r1, r0)
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x006f
            X.534 r0 = X.AnonymousClass7DA.A00
            java.lang.Object r0 = r9.AEA(r0)
            android.content.res.Configuration r0 = (android.content.res.Configuration) r0
            int r1 = r0.screenWidthDp
            r0 = 320(0x140, float:4.48E-43)
            if (r1 >= r0) goto L_0x00cd
            java.lang.Object r4 = X.AnonymousClass7CZ.A01(r9)
            X.0i6 r4 = (X.C10300i6) r4
            X.C04220Ms.A0B(r4, r7)
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36323281451622146(0x810bd500001f02, double:3.034327679895881E-306)
            boolean r0 = X.C63803iN.A0E(r3, r4, r0)
            r1 = r0 ^ 1
            r0 = 1
            if (r1 != 0) goto L_0x00ce
        L_0x00cd:
            r0 = 0
        L_0x00ce:
            r5 = 1157296644(0x44faf204, float:2007.563)
            if (r0 == 0) goto L_0x0115
            r0 = 498313054(0x1db3a75e, float:4.755396E-21)
            r9.Cvb(r0)
            r0 = 2131232817(0x7f080831, float:1.8081754E38)
            X.6uo r4 = X.AnonymousClass6QP.A00(r9, r0)
            X.7Wm r3 = androidx.compose.ui.Modifier.A00
            java.lang.Object r2 = r2.A02
            boolean r1 = X.C147188nY.A0z(r9, r2, r5)
            r6 = r9
            X.7W3 r6 = (X.AnonymousClass7W3) r6
            java.lang.Object r0 = r6.A13()
            if (r1 != 0) goto L_0x00f5
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r0 != r1) goto L_0x00fe
        L_0x00f5:
            r1 = 6
            kotlin.jvm.internal.IDxRImplShape181S0000000_1_I2 r0 = new kotlin.jvm.internal.IDxRImplShape181S0000000_1_I2
            r0.<init>(r2, r1)
            r6.A14(r0)
        L_0x00fe:
            X.0ZU r0 = X.AnonymousClass7W3.A08(r6, r0, r7)
            androidx.compose.ui.Modifier r1 = X.AnonymousClass7HZ.A03(r3, r0, r7)
            r0 = 2131830410(0x7f11268a, float:1.9293817E38)
            java.lang.String r0 = X.AnonymousClass7JS.A01(r9, r0)
            X.AnonymousClass7KB.A07(r9, r1, r4, r0)
        L_0x0110:
            X.AnonymousClass7W3.A0w(r6, r7)
            goto L_0x006f
        L_0x0115:
            r0 = 498313437(0x1db3a8dd, float:4.7555506E-21)
            X.7Wm r8 = androidx.compose.ui.Modifier.A02(r9, r0)
            r0 = 4
            float r1 = (float) r0
            float r0 = (float) r7
            androidx.compose.ui.Modifier r3 = X.AnonymousClass7K4.A05(r8, r1, r0, r0, r0)
            java.lang.Object r2 = r2.A02
            boolean r1 = X.C147188nY.A0z(r9, r2, r5)
            r6 = r9
            X.7W3 r6 = (X.AnonymousClass7W3) r6
            java.lang.Object r0 = r6.A13()
            if (r1 != 0) goto L_0x0136
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r0 != r1) goto L_0x013f
        L_0x0136:
            r1 = 7
            kotlin.jvm.internal.IDxRImplShape181S0000000_1_I2 r0 = new kotlin.jvm.internal.IDxRImplShape181S0000000_1_I2
            r0.<init>(r2, r1)
            r6.A14(r0)
        L_0x013f:
            X.0ZU r0 = X.AnonymousClass7W3.A08(r6, r0, r7)
            androidx.compose.ui.Modifier r1 = X.AnonymousClass7HZ.A03(r3, r0, r7)
            r0 = 28
            androidx.compose.ui.Modifier r0 = X.AnonymousClass7Kq.A0F(r1, r0)
            X.8ly r5 = X.AnonymousClass7KV.A07(r9, r7)
            java.lang.Object r4 = X.C147188nY.A0p(r9)
            java.lang.Object r3 = X.C147188nY.A0n(r9)
            java.lang.Object r2 = X.C147188nY.A0m(r9)
            X.0ZU r1 = X.AnonymousClass74X.A00
            X.0YM r0 = X.C98236Es.A00(r0)
            X.C147188nY.A0w(r9, r6, r1)
            X.AnonymousClass7W3.A0a(r9, r6, r5, r4)
            X.AnonymousClass7KP.A07(r9, r3, r2, r0)
            X.7V3 r1 = X.AnonymousClass7V3.A00
            r0 = 1930844303(0x7316588f, float:1.1911632E31)
            r9.Cvb(r0)
            r0 = 2131233902(0x7f080c6e, float:1.8083955E38)
            X.6uo r2 = X.AnonymousClass6QP.A00(r9, r0)
            androidx.compose.ui.Modifier r1 = X.AnonymousClass7KV.A01(r1, r8)
            r0 = 2131826195(0x7f111613, float:1.9285268E38)
            java.lang.String r0 = X.AnonymousClass7JS.A01(r9, r0)
            X.AnonymousClass7KB.A07(r9, r1, r2, r0)
            X.AnonymousClass7W3.A0f(r6)
            goto L_0x0110
        L_0x018d:
            r9.CuJ()
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape2S0211000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
