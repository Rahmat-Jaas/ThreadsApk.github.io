package kotlin.jvm.internal;

import X.AnonymousClass0YC;
import X.C02220Ah;

public class KtLambdaShape13S0401000_I2 extends C02220Ah implements AnonymousClass0YC {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape13S0401000_I2(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(4);
        this.A05 = i2;
        this.A02 = obj;
        this.A04 = obj2;
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1} */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03c5, code lost:
        if (r5 == X.AnonymousClass7GN.A00) goto L_0x03c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0463, code lost:
        if (r5 == X.AnonymousClass7GN.A00) goto L_0x0465;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
        /*
            r33 = this;
            r8 = r33
            r15 = r36
            int r0 = r8.A05
            r6 = r34
            if (r0 == 0) goto L_0x02b8
            int r4 = X.AnonymousClass0wJ.A04(r35)
            X.8nY r15 = (X.C147188nY) r15
            int r3 = X.AnonymousClass0wJ.A04(r37)
            r1 = 0
            X.C04220Ms.A0B(r6, r1)
            r0 = r3 & 14
            if (r0 != 0) goto L_0x02b5
            int r2 = X.C147188nY.A0F(r15, r6)
            r2 = r2 | r3
        L_0x0021:
            r0 = r3 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x002a
            int r0 = X.C147188nY.A04(r15, r4)
            r2 = r2 | r0
        L_0x002a:
            r2 = r2 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r2 != r0) goto L_0x0036
            boolean r0 = r15.BCM()
            if (r0 != 0) goto L_0x0482
        L_0x0036:
            java.lang.Object r0 = r8.A01
            java.lang.Object r4 = X.C86124wJ.A0p(r0, r4)
            X.8f4 r4 = (X.AnonymousClass8f4) r4
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.Modifier.A05(r0)
            boolean r0 = r4 instanceof X.C133357vZ
            if (r0 == 0) goto L_0x0070
            r0 = -895881239(0xffffffffca99efe9, float:-5044212.5)
            r15.Cvb(r0)
            java.lang.Object r6 = r8.A04
            X.57s r6 = (X.C883557s) r6
            com.instagram.service.session.UserSession r5 = r6.A03
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r3 = 36318230572568868(0x81073d00261124, double:3.031133483644331E-306)
            boolean r4 = X.C63803iN.A0E(r0, r5, r3)
            r0 = 35
            kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56 r3 = new kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56
            r3.<init>(r6, r0)
            r0 = 6
            X.C121917Iu.A05(r15, r2, r3, r0, r4)
            X.AnonymousClass7W3.A0z(r15, r1)
        L_0x006d:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0070:
            boolean r0 = r4 instanceof X.C133437vh
            if (r0 == 0) goto L_0x008b
            r0 = -895880975(0xffffffffca99f0f1, float:-5044344.5)
            r15.Cvb(r0)
            java.lang.Object r4 = r8.A04
            r0 = 36
            kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56 r3 = new kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56
            r3.<init>(r4, r0)
            r0 = 6
            X.C121917Iu.A04(r15, r2, r3, r0)
            X.AnonymousClass7W3.A0z(r15, r1)
            goto L_0x006d
        L_0x008b:
            boolean r0 = r4 instanceof X.C133457vj
            r3 = 1157296644(0x44faf204, float:2007.563)
            if (r0 == 0) goto L_0x00cf
            r0 = -895880766(0xffffffffca99f1c2, float:-5044449.0)
            r15.Cvb(r0)
            r0 = 2131828098(0x7f111d82, float:1.9289127E38)
            java.lang.String r9 = X.AnonymousClass7JS.A01(r15, r0)
            r15.Cvb(r3)
            java.lang.Object r6 = r8.A02
            boolean r0 = r15.ACY(r6)
            r5 = r15
            X.7W3 r5 = (X.AnonymousClass7W3) r5
            java.lang.Object r3 = r5.A13()
            if (r0 != 0) goto L_0x00b5
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r3 != r0) goto L_0x00bb
        L_0x00b5:
            r0 = 37
            kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56 r3 = X.AnonymousClass7W3.A0P(r5, r6, r0)
        L_0x00bb:
            X.0ZU r10 = X.AnonymousClass7W3.A08(r5, r3, r1)
            X.7vj r4 = (X.C133457vj) r4
            int r0 = r4.A00
            r12 = 6
            r7 = r15
            r8 = r2
            r11 = r0
            r13 = r1
            X.C121917Iu.A02(r7, r8, r9, r10, r11, r12, r13)
            X.AnonymousClass7W3.A0w(r5, r1)
            goto L_0x006d
        L_0x00cf:
            boolean r0 = r4 instanceof X.C133447vi
            if (r0 == 0) goto L_0x0111
            r0 = -895880420(0xffffffffca99f31c, float:-5044622.0)
            r15.Cvb(r0)
            r0 = 2131828097(0x7f111d81, float:1.9289125E38)
            java.lang.String r9 = X.AnonymousClass7JS.A01(r15, r0)
            r15.Cvb(r3)
            java.lang.Object r6 = r8.A02
            boolean r0 = r15.ACY(r6)
            r5 = r15
            X.7W3 r5 = (X.AnonymousClass7W3) r5
            java.lang.Object r3 = r5.A13()
            if (r0 != 0) goto L_0x00f6
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r3 != r0) goto L_0x00fc
        L_0x00f6:
            r0 = 38
            kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56 r3 = X.AnonymousClass7W3.A0P(r5, r6, r0)
        L_0x00fc:
            X.0ZU r10 = X.AnonymousClass7W3.A08(r5, r3, r1)
            X.7vi r4 = (X.C133447vi) r4
            int r0 = r4.A00
            r12 = 6
            r7 = r15
            r8 = r2
            r11 = r0
            r13 = r1
            X.C121917Iu.A02(r7, r8, r9, r10, r11, r12, r13)
            X.AnonymousClass7W3.A0w(r5, r1)
            goto L_0x006d
        L_0x0111:
            boolean r0 = r4 instanceof X.C133427vg
            if (r0 == 0) goto L_0x014a
            r0 = -895880070(0xffffffffca99f47a, float:-5044797.0)
            r15.Cvb(r0)
            r0 = 2131828096(0x7f111d80, float:1.9289123E38)
            java.lang.String r6 = X.AnonymousClass7JS.A01(r15, r0)
            r15.Cvb(r3)
            java.lang.Object r5 = r8.A02
            boolean r0 = r15.ACY(r5)
            r4 = r15
            X.7W3 r4 = (X.AnonymousClass7W3) r4
            java.lang.Object r3 = r4.A13()
            if (r0 != 0) goto L_0x0138
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r3 != r0) goto L_0x013e
        L_0x0138:
            r0 = 39
            kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56 r3 = X.AnonymousClass7W3.A0P(r4, r5, r0)
        L_0x013e:
            X.0ZU r0 = X.AnonymousClass7W3.A08(r4, r3, r1)
            X.C121917Iu.A01(r15, r2, r6, r0)
            X.AnonymousClass7W3.A0w(r4, r1)
            goto L_0x006d
        L_0x014a:
            boolean r0 = r4 instanceof X.C133407ve
            if (r0 == 0) goto L_0x0183
            r0 = -895879773(0xffffffffca99f5a3, float:-5044945.5)
            r15.Cvb(r0)
            r0 = 2131830258(0x7f1125f2, float:1.9293508E38)
            java.lang.String r6 = X.AnonymousClass7JS.A01(r15, r0)
            r15.Cvb(r3)
            java.lang.Object r5 = r8.A02
            boolean r0 = r15.ACY(r5)
            r4 = r15
            X.7W3 r4 = (X.AnonymousClass7W3) r4
            java.lang.Object r3 = r4.A13()
            if (r0 != 0) goto L_0x0171
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r3 != r0) goto L_0x0177
        L_0x0171:
            r0 = 40
            kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56 r3 = X.AnonymousClass7W3.A0P(r4, r5, r0)
        L_0x0177:
            X.0ZU r0 = X.AnonymousClass7W3.A08(r4, r3, r1)
            X.C121917Iu.A01(r15, r2, r6, r0)
            X.AnonymousClass7W3.A0w(r4, r1)
            goto L_0x006d
        L_0x0183:
            boolean r0 = r4 instanceof X.C133387vc
            if (r0 == 0) goto L_0x01bc
            r0 = -895879487(0xffffffffca99f6c1, float:-5045088.5)
            r15.Cvb(r0)
            r0 = 2131828074(0x7f111d6a, float:1.9289079E38)
            java.lang.String r6 = X.AnonymousClass7JS.A01(r15, r0)
            r15.Cvb(r3)
            java.lang.Object r5 = r8.A02
            boolean r0 = r15.ACY(r5)
            r4 = r15
            X.7W3 r4 = (X.AnonymousClass7W3) r4
            java.lang.Object r3 = r4.A13()
            if (r0 != 0) goto L_0x01aa
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r3 != r0) goto L_0x01b0
        L_0x01aa:
            r0 = 41
            kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56 r3 = X.AnonymousClass7W3.A0P(r4, r5, r0)
        L_0x01b0:
            X.0ZU r0 = X.AnonymousClass7W3.A08(r4, r3, r1)
            X.C121917Iu.A01(r15, r2, r6, r0)
            X.AnonymousClass7W3.A0w(r4, r1)
            goto L_0x006d
        L_0x01bc:
            boolean r0 = r4 instanceof X.C133417vf
            if (r0 == 0) goto L_0x01f5
            r0 = -895879195(0xffffffffca99f7e5, float:-5045234.5)
            r15.Cvb(r0)
            r0 = 2131827628(0x7f111bac, float:1.9288174E38)
            java.lang.String r6 = X.AnonymousClass7JS.A01(r15, r0)
            r15.Cvb(r3)
            java.lang.Object r5 = r8.A02
            boolean r0 = r15.ACY(r5)
            r4 = r15
            X.7W3 r4 = (X.AnonymousClass7W3) r4
            java.lang.Object r3 = r4.A13()
            if (r0 != 0) goto L_0x01e3
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r3 != r0) goto L_0x01e9
        L_0x01e3:
            r0 = 42
            kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56 r3 = X.AnonymousClass7W3.A0P(r4, r5, r0)
        L_0x01e9:
            X.0ZU r0 = X.AnonymousClass7W3.A08(r4, r3, r1)
            X.C121917Iu.A01(r15, r2, r6, r0)
            X.AnonymousClass7W3.A0w(r4, r1)
            goto L_0x006d
        L_0x01f5:
            boolean r0 = r4 instanceof X.C133397vd
            if (r0 == 0) goto L_0x022e
            r0 = -895878914(0xffffffffca99f8fe, float:-5045375.0)
            r15.Cvb(r0)
            r0 = 2131827589(0x7f111b85, float:1.9288095E38)
            java.lang.String r6 = X.AnonymousClass7JS.A01(r15, r0)
            r15.Cvb(r3)
            java.lang.Object r5 = r8.A02
            boolean r0 = r15.ACY(r5)
            r4 = r15
            X.7W3 r4 = (X.AnonymousClass7W3) r4
            java.lang.Object r3 = r4.A13()
            if (r0 != 0) goto L_0x021c
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r3 != r0) goto L_0x0222
        L_0x021c:
            r0 = 43
            kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56 r3 = X.AnonymousClass7W3.A0P(r4, r5, r0)
        L_0x0222:
            X.0ZU r0 = X.AnonymousClass7W3.A08(r4, r3, r1)
            X.C121917Iu.A01(r15, r2, r6, r0)
            X.AnonymousClass7W3.A0w(r4, r1)
            goto L_0x006d
        L_0x022e:
            boolean r0 = r4 instanceof X.C133377vb
            if (r0 == 0) goto L_0x0271
            r0 = -895878615(0xffffffffca99fa29, float:-5045524.5)
            r15.Cvb(r0)
            r0 = 2131828071(0x7f111d67, float:1.9289073E38)
            java.lang.String r18 = X.AnonymousClass7JS.A01(r15, r0)
            X.67b r17 = X.C968867b.Destructive
            r15.Cvb(r3)
            java.lang.Object r5 = r8.A03
            boolean r0 = r15.ACY(r5)
            r4 = r15
            X.7W3 r4 = (X.AnonymousClass7W3) r4
            java.lang.Object r3 = r4.A13()
            if (r0 != 0) goto L_0x0257
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r3 != r0) goto L_0x025d
        L_0x0257:
            r0 = 33
            kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56 r3 = X.AnonymousClass7W3.A0P(r4, r5, r0)
        L_0x025d:
            X.0ZU r19 = X.AnonymousClass7W3.A08(r4, r3, r1)
            r20 = 3456(0xd80, float:4.843E-42)
            r21 = 16
            r22 = r1
            r16 = r2
            X.C101156Qc.A00(r15, r16, r17, r18, r19, r20, r21, r22)
            X.AnonymousClass7W3.A0w(r4, r1)
            goto L_0x006d
        L_0x0271:
            boolean r0 = r4 instanceof X.C133367va
            if (r0 == 0) goto L_0x02aa
            r0 = -895878297(0xffffffffca99fb67, float:-5045683.5)
            r15.Cvb(r0)
            r0 = 2131828065(0x7f111d61, float:1.928906E38)
            java.lang.String r6 = X.AnonymousClass7JS.A01(r15, r0)
            r15.Cvb(r3)
            java.lang.Object r5 = r8.A02
            boolean r0 = r15.ACY(r5)
            r4 = r15
            X.7W3 r4 = (X.AnonymousClass7W3) r4
            java.lang.Object r3 = r4.A13()
            if (r0 != 0) goto L_0x0298
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r3 != r0) goto L_0x029e
        L_0x0298:
            r0 = 34
            kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56 r3 = X.AnonymousClass7W3.A0P(r4, r5, r0)
        L_0x029e:
            X.0ZU r0 = X.AnonymousClass7W3.A08(r4, r3, r1)
            X.C121917Iu.A01(r15, r2, r6, r0)
            X.AnonymousClass7W3.A0w(r4, r1)
            goto L_0x006d
        L_0x02aa:
            r0 = -895878075(0xffffffffca99fc45, float:-5045794.5)
            r15.Cvb(r0)
            X.AnonymousClass7W3.A0z(r15, r1)
            goto L_0x006d
        L_0x02b5:
            r2 = r3
            goto L_0x0021
        L_0x02b8:
            int r2 = X.AnonymousClass0wJ.A04(r35)
            X.8nY r15 = (X.C147188nY) r15
            int r3 = X.AnonymousClass0wJ.A04(r37)
            r1 = 0
            X.C04220Ms.A0B(r6, r1)
            r0 = r3 & 14
            r5 = 2
            if (r0 != 0) goto L_0x047f
            int r0 = X.C147188nY.A0F(r15, r6)
            r4 = r3 | r0
        L_0x02d1:
            r0 = r3 & 112(0x70, float:1.57E-43)
            r6 = 32
            if (r0 != 0) goto L_0x02dc
            int r0 = X.C147188nY.A04(r15, r2)
            r4 = r4 | r0
        L_0x02dc:
            r3 = r4 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r3 != r0) goto L_0x02e8
            boolean r0 = r15.BCM()
            if (r0 != 0) goto L_0x0482
        L_0x02e8:
            java.lang.Object r0 = r8.A02
            java.lang.Object r0 = X.C86124wJ.A0p(r0, r2)
            r3 = r4 & 14
            r4 = r4 & 112(0x70, float:1.57E-43)
            r4 = r4 | r3
            X.5Hr r0 = (X.C89955Hr) r0
            r3 = -1529574925(0xffffffffa4d489f3, float:-9.217404E-17)
            r15.Cvb(r3)
            r3 = r4 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x047c
            boolean r3 = r15.ACW(r2)
            if (r3 != 0) goto L_0x0307
            r6 = 16
        L_0x0307:
            r6 = r6 | r4
        L_0x0308:
            r3 = r4 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0479
            int r3 = X.C147188nY.A0H(r15, r0)
            r3 = r3 | r6
        L_0x0311:
            r4 = r3 & 5841(0x16d1, float:8.185E-42)
            r3 = 1168(0x490, float:1.637E-42)
            if (r4 != r3) goto L_0x0325
            boolean r3 = r15.BCM()
            if (r3 == 0) goto L_0x0325
            r15.CuJ()
        L_0x0320:
            X.AnonymousClass7W3.A0z(r15, r1)
            goto L_0x006d
        L_0x0325:
            if (r0 == 0) goto L_0x0320
            X.D1k r3 = r0.A03
            int r4 = r3.ordinal()
            r30 = 0
            r13 = 1
            r3 = 4
            if (r4 == r3) goto L_0x03de
            if (r4 == r5) goto L_0x03de
            r3 = 16
            if (r4 == r3) goto L_0x0343
            r0 = -1839206435(0xffffffff925fefdd, float:-7.0662047E-28)
            r15.Cvb(r0)
        L_0x033f:
            X.AnonymousClass7W3.A0z(r15, r1)
            goto L_0x0320
        L_0x0343:
            r3 = -1839208085(0xffffffff925fe96b, float:-7.0654103E-28)
            r15.Cvb(r3)
            X.8s2 r14 = r0.A0F
            X.8s2 r12 = r0.A0D
            X.8s2 r11 = r0.A0C
            com.instagram.common.typedurl.ImageUrl r10 = r0.A02
            java.lang.String r7 = r0.A0A
            java.lang.Double r6 = r0.A05
            X.8s2 r5 = r0.A0E
            X.CKc r4 = r0.A01
            X.7Wm r3 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.Modifier.A04(r3)
            X.8Nl r3 = X.C139308Nl.A00
            androidx.compose.ui.Modifier r16 = X.AnonymousClass6FI.A00(r9, r3, r13)
            java.lang.Object r3 = r8.A04
            X.56Y r3 = (X.AnonymousClass56Y) r3
            java.lang.Object r9 = r8.A01
            java.lang.Object r8 = r8.A03
            r18 = 8
            kotlin.jvm.internal.KtLambdaShape4S0400000_I2 r25 = new kotlin.jvm.internal.KtLambdaShape4S0400000_I2
            r17 = r25
            r19 = r9
            r20 = r0
            r21 = r8
            r22 = r3
            r17.<init>(r18, r19, r20, r21, r22)
            kotlin.jvm.internal.KtLambdaShape21S0301000_I2 r26 = new kotlin.jvm.internal.KtLambdaShape21S0301000_I2
            r17 = r26
            r18 = r2
            r19 = r1
            r20 = r3
            r21 = r0
            r22 = r9
            r17.<init>(r18, r19, r20, r21, r22)
            r27 = 16777800(0x1000248, float:2.3511524E-38)
            r8 = 1618982084(0x607fb4c4, float:7.370227E19)
            r28 = r1
            r29 = r1
            r23 = r11
            r24 = r5
            r22 = r12
            r21 = r14
            r20 = r7
            r19 = r6
            r18 = r10
            r17 = r4
            X.C100096Ly.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            kotlin.Unit r7 = kotlin.Unit.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r4 = X.C147188nY.A10(r15, r3, r4, r8)
            boolean r4 = X.C147188nY.A12(r15, r0, r4)
            r6 = r15
            X.7W3 r6 = (X.AnonymousClass7W3) r6
            java.lang.Object r5 = r6.A13()
            if (r4 != 0) goto L_0x03c7
            java.lang.Object r4 = X.AnonymousClass7GN.A00
            if (r5 != r4) goto L_0x03d9
        L_0x03c7:
            r32 = 29
            kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1 r5 = new kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1
            r27 = r5
            r28 = r0
            r29 = r3
            r31 = r2
            r27.<init>(r28, r29, r30, r31, r32)
            r6.A14(r5)
        L_0x03d9:
            X.AnonymousClass7W3.A0b(r15, r6, r5, r7, r1)
            goto L_0x033f
        L_0x03de:
            r3 = -1839210683(0xffffffff925fdf45, float:-7.0641594E-28)
            r15.Cvb(r3)
            X.8s2 r14 = r0.A0F
            X.8s2 r10 = r0.A0D
            X.8s2 r9 = r0.A0C
            com.instagram.common.typedurl.ImageUrl r7 = r0.A02
            java.lang.String r6 = r0.A0A
            java.lang.Double r5 = r0.A05
            X.8s2 r4 = r0.A0E
            java.lang.Object r3 = r8.A04
            X.56Y r3 = (X.AnonymousClass56Y) r3
            java.lang.Object r11 = r8.A01
            android.content.Context r11 = (android.content.Context) r11
            java.lang.Object r8 = r8.A03
            kotlin.jvm.internal.KtLambdaShape11S0401000_I2 r25 = new kotlin.jvm.internal.KtLambdaShape11S0401000_I2
            r16 = r25
            r17 = r3
            r18 = r11
            r19 = r8
            r20 = r0
            r21 = r2
            r22 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.CKc r8 = r0.A01
            X.7Wm r12 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r13 = androidx.compose.ui.Modifier.A04(r12)
            X.8Nk r12 = X.C139298Nk.A00
            androidx.compose.ui.Modifier r16 = X.AnonymousClass6FI.A00(r13, r12, r1)
            X.8YT r12 = new X.8YT
            r12.<init>(r11, r0, r3)
            r11 = 487955397(0x1d159bc5, float:1.9800517E-21)
            X.8sI r26 = X.AnonymousClass7JR.A00(r15, r12, r11)
            r28 = 6
            r27 = 134218312(0x8000248, float:3.852128E-34)
            r29 = r1
            r23 = r9
            r24 = r4
            r22 = r10
            r21 = r14
            r20 = r6
            r19 = r5
            r18 = r7
            r17 = r8
            X.C100066Lv.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            kotlin.Unit r7 = kotlin.Unit.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4 = 1618982084(0x607fb4c4, float:7.370227E19)
            boolean r4 = X.C147188nY.A0z(r15, r3, r4)
            boolean r4 = X.C147188nY.A11(r15, r5, r4)
            boolean r4 = X.C147188nY.A12(r15, r0, r4)
            r6 = r15
            X.7W3 r6 = (X.AnonymousClass7W3) r6
            java.lang.Object r5 = r6.A13()
            if (r4 != 0) goto L_0x0465
            java.lang.Object r4 = X.AnonymousClass7GN.A00
            if (r5 != r4) goto L_0x0474
        L_0x0465:
            r11 = 0
            r13 = 28
            kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1 r5 = new kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1
            r8 = r5
            r9 = r0
            r10 = r3
            r12 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            r6.A14(r5)
        L_0x0474:
            X.AnonymousClass7W3.A0b(r15, r6, r5, r7, r1)
            goto L_0x033f
        L_0x0479:
            r3 = r6
            goto L_0x0311
        L_0x047c:
            r6 = r4
            goto L_0x0308
        L_0x047f:
            r4 = r3
            goto L_0x02d1
        L_0x0482:
            r15.CuJ()
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape13S0401000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
