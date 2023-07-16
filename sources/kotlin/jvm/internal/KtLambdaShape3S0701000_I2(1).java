package kotlin.jvm.internal;

import X.AnonymousClass0YC;
import X.C02220Ah;

public class KtLambdaShape3S0701000_I2 extends C02220Ah implements AnonymousClass0YC {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S0701000_I2(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        super(4);
        this.A08 = i2;
        this.A02 = obj;
        this.A06 = obj2;
        this.A07 = obj3;
        this.A00 = i;
        this.A04 = obj4;
        this.A01 = obj5;
        this.A03 = obj6;
        this.A05 = obj7;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r33, java.lang.Object r34, java.lang.Object r35, java.lang.Object r36) {
        /*
            r32 = this;
            r1 = r32
            r14 = r35
            int r0 = r1.A08
            int r5 = X.AnonymousClass0wJ.A04(r34)
            r4 = r33
            X.8nY r14 = (X.C147188nY) r14
            int r3 = X.AnonymousClass0wJ.A04(r36)
            switch(r0) {
                case 0: goto L_0x028e;
                case 1: goto L_0x007e;
                default: goto L_0x0015;
            }
        L_0x0015:
            int r0 = X.C86124wJ.A0G(r4, r3)
            if (r0 != 0) goto L_0x007c
            int r2 = X.C147188nY.A0F(r14, r4)
            r2 = r2 | r3
        L_0x0020:
            r0 = r3 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0029
            int r0 = X.C147188nY.A04(r14, r5)
            r2 = r2 | r0
        L_0x0029:
            r2 = r2 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r2 != r0) goto L_0x0035
            boolean r0 = r14.BCM()
            if (r0 != 0) goto L_0x0564
        L_0x0035:
            java.lang.Object r0 = r1.A01
            java.lang.Object r8 = X.C86124wJ.A0p(r0, r5)
            X.8jY r8 = (X.C144948jY) r8
            java.lang.Object r7 = r1.A03
            X.0YY r7 = (X.AnonymousClass0YY) r7
            java.lang.Object r15 = r1.A02
            X.8jX r15 = (X.C144938jX) r15
            java.lang.Object r6 = r1.A04
            X.8jX r6 = (X.C144938jX) r6
            java.lang.Object r5 = r1.A05
            X.8jX r5 = (X.C144938jX) r5
            java.lang.Object r4 = r1.A06
            X.8jX r4 = (X.C144938jX) r4
            java.lang.Object r3 = r1.A07
            X.0YY r3 = (X.AnonymousClass0YY) r3
            int r2 = r1.A00
            r0 = r2 & 112(0x70, float:1.57E-43)
            r1 = r0 | 8
            r0 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r0
            r0 = r2 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r0
            int r22 = X.C86114wI.A04(r2, r1)
            r0 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r0
            r22 = r22 | r2
            r19 = r8
            r20 = r7
            r21 = r3
            r17 = r5
            r18 = r4
            r16 = r6
            X.C121937Iw.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x0079:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x007c:
            r2 = r3
            goto L_0x0020
        L_0x007e:
            r2 = 0
            X.C04220Ms.A0B(r4, r2)
            r0 = r3 & 14
            if (r0 != 0) goto L_0x028b
            int r0 = X.C147188nY.A0F(r14, r4)
            r4 = r3 | r0
        L_0x008c:
            r0 = r3 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0095
            int r0 = X.C147188nY.A04(r14, r5)
            r4 = r4 | r0
        L_0x0095:
            r3 = r4 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r3 != r0) goto L_0x00a1
            boolean r0 = r14.BCM()
            if (r0 != 0) goto L_0x0564
        L_0x00a1:
            java.lang.Object r0 = r1.A02
            java.lang.Object r3 = X.C86124wJ.A0p(r0, r5)
            r10 = r4 & 14
            X.8it r3 = (X.C144678it) r3
            r0 = -475037932(0xffffffffe3af7f14, float:-6.4746743E21)
            r14.Cvb(r0)
            r0 = r10 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x00ba
            int r0 = X.C147188nY.A08(r14, r3)
            r10 = r10 | r0
        L_0x00ba:
            r4 = r10 & 721(0x2d1, float:1.01E-42)
            r0 = 144(0x90, float:2.02E-43)
            if (r4 != r0) goto L_0x00cd
            boolean r0 = r14.BCM()
            if (r0 == 0) goto L_0x00cd
            r14.CuJ()
        L_0x00c9:
            X.AnonymousClass7W3.A0z(r14, r2)
            goto L_0x0079
        L_0x00cd:
            java.lang.Object r0 = r1.A06
            java.util.Set r0 = (java.util.Set) r0
            boolean r24 = r0.contains(r3)
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            X.7W3 r0 = X.C147188nY.A0Z(r14, r6)
            java.lang.Object r4 = r0.A13()
            java.lang.Object r5 = X.AnonymousClass7GN.A00
            java.lang.Object r12 = X.C86144wL.A0f(r0, r4, r5)
            X.AnonymousClass7W3.A0w(r0, r2)
            X.8p3 r12 = (X.C147258p3) r12
            boolean r4 = r3 instanceof X.AnonymousClass5MX
            if (r4 == 0) goto L_0x0287
            X.8jm r11 = X.C103826an.A04
        L_0x00f1:
            java.lang.Object r4 = X.C147188nY.A0r(r14, r0, r6)
            if (r4 != r5) goto L_0x0101
            r6 = 0
            X.76A r4 = new X.76A
            r4.<init>(r6, r6, r6)
            androidx.compose.runtime.ParcelableSnapshotMutableState r4 = X.AnonymousClass7WR.A00(r0, r4)
        L_0x0101:
            X.AnonymousClass7W3.A0w(r0, r2)
            X.8pE r4 = (X.C147368pE) r4
            r6 = 1366155426(0x516de0a2, float:6.3854748E10)
            X.534 r7 = X.C147188nY.A0b(r14, r6)
            X.8nV r6 = X.C147188nY.A0k(r14, r7)
            r9 = r11
            X.7V9 r9 = (X.AnonymousClass7V9) r9
            float r8 = r9.A02
            float r21 = r6.CxL(r8)
            float r8 = X.C103606Zv.A00
            float r6 = r6.CxL(r8)
            r13 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r13
            float r21 = r21 + r6
            X.AnonymousClass7W3.A0w(r0, r2)
            r6 = 596147613(0x23887d9d, float:1.4798349E-17)
            java.lang.Object r6 = X.C147188nY.A0t(r14, r7, r6)
            X.8nV r6 = (X.C147168nV) r6
            float r9 = r9.A01
            float r22 = r6.CxL(r9)
            float r6 = r6.CxL(r8)
            float r6 = r6 / r13
            float r22 = r22 + r6
            X.AnonymousClass7W3.A0w(r0, r2)
            r6 = -592369286(0xffffffffdcb1297a, float:-3.98933399E17)
            java.lang.Object r7 = X.C147188nY.A0t(r14, r7, r6)
            X.8nV r7 = (X.C147168nV) r7
            X.534 r6 = X.AnonymousClass7DA.A00
            java.lang.Object r6 = r14.AEA(r6)
            android.content.res.Configuration r6 = (android.content.res.Configuration) r6
            int r6 = r6.screenWidthDp
            float r6 = (float) r6
            float r23 = r7.CxL(r6)
            X.AnonymousClass7W3.A0w(r0, r2)
            java.lang.Object r9 = r1.A07
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r8 = r1.A04
            X.0YY r8 = (X.AnonymousClass0YY) r8
            java.lang.Object r7 = r1.A01
            X.4qz r7 = (X.C83224qz) r7
            java.lang.Object r6 = r1.A03
            androidx.compose.foundation.lazy.LazyListState r6 = (androidx.compose.foundation.lazy.LazyListState) r6
            X.8Jl r15 = new X.8Jl
            r19 = r8
            r20 = r7
            r17 = r4
            r18 = r9
            r16 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r6 = 482946852(0x1cc92f24, float:1.331325E-21)
            r14.Cvb(r6)
            int r8 = r9.intValue()
            if (r8 == r2) goto L_0x027a
            r7 = 1
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            if (r8 == r7) goto L_0x0245
            r7 = 2
            if (r8 == r7) goto L_0x0210
            r7 = 3
            if (r8 != r7) goto L_0x0569
            r7 = 1170421316(0x45c33644, float:6246.783)
            X.7Wm r18 = androidx.compose.ui.Modifier.A02(r14, r7)
            boolean r22 = r3.Afe()
            r7 = 1
            r16 = 0
            X.799 r19 = X.AnonymousClass799.A00(r7)
            boolean r7 = X.C147188nY.A10(r14, r15, r3, r6)
            java.lang.Object r6 = r0.A13()
            if (r7 != 0) goto L_0x01b1
            if (r6 != r5) goto L_0x01bb
        L_0x01b1:
            r7 = 47
            kotlin.jvm.internal.KtLambdaShape43S0200000_I2_4 r6 = new kotlin.jvm.internal.KtLambdaShape43S0200000_I2_4
            r6.<init>(r7, r15, r3)
            r0.A14(r6)
        L_0x01bb:
            X.0YY r20 = X.AnonymousClass7W3.A0A(r0, r6, r2)
            r17 = r12
            r21 = r24
            androidx.compose.ui.Modifier r6 = X.AnonymousClass6E2.A00(r16, r17, r18, r19, r20, r21, r22)
        L_0x01c7:
            X.AnonymousClass7W3.A0w(r0, r2)
        L_0x01ca:
            X.AnonymousClass7W3.A0w(r0, r2)
            androidx.compose.ui.Modifier r8 = X.AnonymousClass7K4.A02(r11, r6)
            boolean r7 = X.C147188nY.A0y(r14, r4)
            java.lang.Object r6 = r0.A13()
            if (r7 != 0) goto L_0x01dd
            if (r6 != r5) goto L_0x01e7
        L_0x01dd:
            r5 = 27
            kotlin.jvm.internal.KtLambdaShape156S0100000_I2_11 r6 = new kotlin.jvm.internal.KtLambdaShape156S0100000_I2_11
            r6.<init>(r4, r5)
            r0.A14(r6)
        L_0x01e7:
            X.0YY r0 = X.AnonymousClass7W3.A0B(r0, r6, r2)
            androidx.compose.ui.Modifier r20 = X.C98246Et.A00(r8, r0)
            boolean r25 = r3.Afe()
            r4 = 1877685713(0x6feb35d1, float:1.4558807E29)
            java.lang.Object r1 = r1.A05
            X.0YY r1 = (X.AnonymousClass0YY) r1
            X.8YX r0 = new X.8YX
            r0.<init>(r3, r1, r10)
            X.8sI r21 = X.AnonymousClass7JR.A00(r14, r0, r4)
            r22 = 24624(0x6030, float:3.4506E-41)
            r18 = r12
            r19 = r14
            r23 = r2
            X.C121417Fv.A00(r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x00c9
        L_0x0210:
            r7 = 1170421005(0x45c3350d, float:6246.6313)
            X.7Wm r18 = androidx.compose.ui.Modifier.A02(r14, r7)
            boolean r22 = r3.Afe()
            r7 = 3
            r16 = 0
            X.799 r19 = X.AnonymousClass799.A00(r7)
            boolean r7 = X.C147188nY.A10(r14, r15, r3, r6)
            java.lang.Object r6 = r0.A13()
            if (r7 != 0) goto L_0x022e
            if (r6 != r5) goto L_0x0238
        L_0x022e:
            r7 = 10
            kotlin.jvm.internal.KtLambdaShape24S0200000_I2_8 r6 = new kotlin.jvm.internal.KtLambdaShape24S0200000_I2_8
            r6.<init>((X.C144678it) r3, (X.AnonymousClass0YY) r15, (int) r7)
            r0.A14(r6)
        L_0x0238:
            X.0ZU r20 = X.AnonymousClass7W3.A08(r0, r6, r2)
            r17 = r12
            r21 = r24
            androidx.compose.ui.Modifier r6 = X.AnonymousClass6E1.A00(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x01c7
        L_0x0245:
            r7 = 1170420732(0x45c333fc, float:6246.498)
            X.7Wm r18 = androidx.compose.ui.Modifier.A02(r14, r7)
            r16 = 0
            boolean r22 = r3.Afe()
            X.799 r19 = X.AnonymousClass799.A00(r2)
            boolean r7 = X.C147188nY.A10(r14, r15, r3, r6)
            java.lang.Object r6 = r0.A13()
            if (r7 != 0) goto L_0x0262
            if (r6 != r5) goto L_0x026c
        L_0x0262:
            r7 = 9
            kotlin.jvm.internal.KtLambdaShape24S0200000_I2_8 r6 = new kotlin.jvm.internal.KtLambdaShape24S0200000_I2_8
            r6.<init>((X.C144678it) r3, (X.AnonymousClass0YY) r15, (int) r7)
            r0.A14(r6)
        L_0x026c:
            X.0ZU r21 = X.AnonymousClass7W3.A08(r0, r6, r2)
            r17 = r12
            r20 = r16
            androidx.compose.ui.Modifier r6 = X.AnonymousClass7HZ.A00(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x01c7
        L_0x027a:
            r6 = 1170420664(0x45c333b8, float:6246.465)
            r14.Cvb(r6)
            X.AnonymousClass7W3.A0w(r0, r2)
            X.7Wm r6 = androidx.compose.ui.Modifier.A00
            goto L_0x01ca
        L_0x0287:
            X.8jm r11 = X.C103826an.A03
            goto L_0x00f1
        L_0x028b:
            r4 = r3
            goto L_0x008c
        L_0x028e:
            r2 = 0
            X.C04220Ms.A0B(r4, r2)
            r0 = r3 & 14
            if (r0 != 0) goto L_0x0561
            int r0 = X.C147188nY.A0F(r14, r4)
            r4 = r3 | r0
        L_0x029c:
            r0 = r3 & 112(0x70, float:1.57E-43)
            r6 = 16
            if (r0 != 0) goto L_0x02a7
            int r0 = X.C147188nY.A04(r14, r5)
            r4 = r4 | r0
        L_0x02a7:
            r3 = r4 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r3 != r0) goto L_0x02b3
            boolean r0 = r14.BCM()
            if (r0 != 0) goto L_0x0564
        L_0x02b3:
            java.lang.Object r0 = r1.A02
            java.lang.Object r3 = X.C86124wJ.A0p(r0, r5)
            r4 = r4 & 14
            X.8iV r3 = (X.C144438iV) r3
            r0 = -739969637(0xffffffffd3e4f59b, float:-1.96674624E12)
            r14.Cvb(r0)
            r0 = r4 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x02cc
            int r0 = X.C147188nY.A08(r14, r3)
            r4 = r4 | r0
        L_0x02cc:
            r4 = r4 & 721(0x2d1, float:1.01E-42)
            r0 = 144(0x90, float:2.02E-43)
            if (r4 != r0) goto L_0x02e0
            boolean r0 = r14.BCM()
            if (r0 == 0) goto L_0x02e0
            r14.CuJ()
        L_0x02db:
            X.AnonymousClass7W3.A0z(r14, r2)
            goto L_0x0079
        L_0x02e0:
            r0 = 6
            boolean r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2.A00(r0, r3)
            r11 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r17 = 0
            r18 = 0
            if (r0 == 0) goto L_0x0356
            r0 = -298836887(0xffffffffee301c69, float:-1.3625927E28)
            X.7Wm r6 = androidx.compose.ui.Modifier.A02(r14, r0)
            X.54z r4 = X.AnonymousClass7Kq.A02
            androidx.compose.ui.Modifier r0 = r6.Cx6(r4)
            X.8ly r10 = X.AnonymousClass7KV.A05(r14)
            java.lang.Object r9 = X.C147188nY.A0q(r14, r5)
            java.lang.Object r8 = X.C147188nY.A0n(r14)
            java.lang.Object r7 = X.C147188nY.A0m(r14)
            X.0ZU r1 = X.AnonymousClass74X.A00
            X.0YM r5 = X.C98236Es.A00(r0)
            r0 = r14
            X.7W3 r0 = (X.AnonymousClass7W3) r0
            X.C147188nY.A0w(r14, r0, r1)
            X.AnonymousClass7W3.A0a(r14, r0, r10, r9)
            X.7KP r1 = X.AnonymousClass7KP.A01(r14, r8, r7)
            X.C86104wH.A1R(r1, r14, r5, r2)
            r14.Cvb(r11)
            r1 = -167284343(0xfffffffff6077189, float:-6.867801E32)
            r14.Cvb(r1)
            r21 = 0
            r20 = 7
            r16 = r14
            r19 = r2
            X.AnonymousClass70V.A01(r16, r17, r18, r19, r20, r21)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2) r3
            java.lang.String r1 = r3.A00
            androidx.compose.ui.Modifier r4 = r6.Cx6(r4)
            r9 = 48
            r10 = 124(0x7c, float:1.74E-43)
            r3 = r14
            r5 = r17
            r6 = r1
            r7 = r5
            r8 = r5
            r11 = r2
            r12 = r2
            X.C101176Qe.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.AnonymousClass7W3.A0f(r0)
        L_0x0352:
            X.AnonymousClass7W3.A0w(r0, r2)
            goto L_0x02db
        L_0x0356:
            boolean r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2.A00(r2, r3)
            if (r0 == 0) goto L_0x037f
            r0 = -298836544(0xffffffffee301dc0, float:-1.3626332E28)
            r14.Cvb(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2) r3
            java.lang.String r1 = r3.A00
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.Modifier.A04(r0)
            r9 = 48
            r10 = 124(0x7c, float:1.74E-43)
            r3 = r14
            r5 = r17
            r6 = r5
            r7 = r5
            r8 = r1
            r11 = r2
            r12 = r2
            X.C117676z4.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x037b:
            r0 = r14
            X.7W3 r0 = (X.AnonymousClass7W3) r0
            goto L_0x0352
        L_0x037f:
            boolean r0 = r3 instanceof X.C210418q
            if (r0 == 0) goto L_0x044d
            r0 = -298836311(0xffffffffee301ea9, float:-1.3626607E28)
            X.7Wm r9 = androidx.compose.ui.Modifier.A02(r14, r0)
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.Modifier.A04(r9)
            float r0 = (float) r6
            float r8 = (float) r2
            androidx.compose.ui.Modifier r0 = X.AnonymousClass7K4.A04(r4, r0, r8)
            X.8ly r12 = X.AnonymousClass7KV.A06(r14)
            java.lang.Object r10 = X.C147188nY.A0q(r14, r5)
            java.lang.Object r7 = X.C147188nY.A0n(r14)
            java.lang.Object r6 = X.C147188nY.A0m(r14)
            X.0ZU r4 = X.AnonymousClass74X.A00
            X.0YM r5 = X.C98236Es.A00(r0)
            r0 = r14
            X.7W3 r0 = (X.AnonymousClass7W3) r0
            X.C147188nY.A0w(r14, r0, r4)
            X.AnonymousClass7W3.A0a(r14, r0, r12, r10)
            X.7KP r4 = X.AnonymousClass7KP.A01(r14, r7, r6)
            X.C86104wH.A1R(r4, r14, r5, r2)
            r14.Cvb(r11)
            X.7VA r7 = X.AnonymousClass7VA.A00
            r4 = -300268353(0xffffffffee1a44bf, float:-1.193595E28)
            r14.Cvb(r4)
            X.18q r3 = (X.C210418q) r3
            java.lang.String r6 = r3.A01
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1
            androidx.compose.ui.Modifier r7 = r7.DB5(r9, r4, r5)
            r4 = 8
            androidx.compose.ui.Modifier r15 = X.AnonymousClass7K4.A06(r7, r8, r4)
            java.lang.Integer r7 = r3.A00
            r3 = 822441474(0x31057602, float:1.9421127E-9)
            r14.Cvb(r3)
            int r3 = r7.intValue()
            if (r3 == r2) goto L_0x0443
            if (r3 == r5) goto L_0x0439
            r3 = -624363332(0xffffffffdac8f8bc, float:-2.82842408E16)
            X.7KB r3 = X.C120537Bh.A01(r14, r3)
            long r3 = r3.A0A
        L_0x03ef:
            X.AnonymousClass7W3.A0w(r0, r2)
            X.AnonymousClass7W3.A0w(r0, r2)
            X.7If r16 = X.AnonymousClass7J9.A03(r14)
            r26 = 2040(0x7f8, float:2.859E-42)
            r29 = 0
            r18 = r17
            r19 = r17
            r20 = r6
            r21 = r2
            r22 = r2
            r23 = r2
            r24 = r2
            r25 = r2
            r27 = r3
            r31 = r2
            X.AnonymousClass7I9.A02(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31)
            java.lang.Integer r3 = X.AnonymousClass006.A00
            if (r7 == r3) goto L_0x0434
            java.lang.Object r4 = r1.A01
            java.lang.Object r3 = r1.A06
            r1 = 22
            kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4 r21 = X.C86164wN.A0y(r4, r3, r1)
            X.8mH r19 = X.AnonymousClass7BV.A00(r14)
            r22 = 262192(0x40030, float:3.67409E-40)
            r23 = 220(0xdc, float:3.08E-43)
            java.lang.String r20 = "Update"
            r15 = r17
            r16 = r14
            X.AnonymousClass6M6.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x0434:
            X.AnonymousClass7W3.A0v(r0, r5)
            goto L_0x0352
        L_0x0439:
            r3 = -624363416(0xffffffffdac8f868, float:-2.82840605E16)
            X.7KB r3 = X.C120537Bh.A01(r14, r3)
            long r3 = r3.A0K
            goto L_0x03ef
        L_0x0443:
            r3 = -624363495(0xffffffffdac8f819, float:-2.82838908E16)
            X.7KB r3 = X.C120537Bh.A01(r14, r3)
            long r3 = r3.A0t
            goto L_0x03ef
        L_0x044d:
            r0 = 3
            boolean r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2.A00(r0, r3)
            if (r0 == 0) goto L_0x04a0
            r0 = -298835125(0xffffffffee30234b, float:-1.3628007E28)
            r14.Cvb(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2) r3
            java.lang.String r6 = r3.A00
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.Modifier.A04(r0)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r14.Cvb(r0)
            java.lang.Object r4 = r1.A04
            boolean r1 = r14.ACY(r4)
            r0 = r14
            X.7W3 r0 = (X.AnonymousClass7W3) r0
            java.lang.Object r3 = r0.A13()
            if (r1 != 0) goto L_0x047d
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r3 != r1) goto L_0x0485
        L_0x047d:
            r1 = 5
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r3 = X.C86154wM.A14(r4, r1)
            r0.A14(r3)
        L_0x0485:
            X.0ZU r1 = X.AnonymousClass7W3.A09(r0, r3, r2)
            androidx.compose.ui.Modifier r15 = X.AnonymousClass7HZ.A03(r5, r1, r2)
            r21 = 124(0x7c, float:1.74E-43)
            r16 = r17
            r18 = r17
            r19 = r6
            r20 = r2
            r22 = r2
            r23 = r2
            X.C117676z4.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0352
        L_0x04a0:
            r0 = 1
            boolean r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2.A00(r0, r3)
            if (r0 == 0) goto L_0x04d8
            r0 = -298834818(0xffffffffee30247e, float:-1.362837E28)
            r14.Cvb(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2) r3
            java.lang.String r4 = r3.A00
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.Modifier.A04(r0)
            java.lang.Object r3 = r1.A01
            java.lang.Object r1 = r1.A06
            r0 = 23
            kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4 r0 = X.C86164wN.A0y(r3, r1, r0)
        L_0x04c1:
            androidx.compose.ui.Modifier r15 = X.AnonymousClass7HZ.A03(r5, r0, r2)
            r21 = 124(0x7c, float:1.74E-43)
            r16 = r17
            r18 = r17
            r19 = r4
            r20 = r2
            r22 = r2
            r23 = r2
            X.C117676z4.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x037b
        L_0x04d8:
            r0 = 5
            boolean r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2.A00(r0, r3)
            if (r0 == 0) goto L_0x04f4
            r0 = -298834047(0xffffffffee302781, float:-1.362928E28)
            r14.Cvb(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2) r3
            java.lang.String r4 = r3.A00
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.Modifier.A04(r0)
            java.lang.Object r0 = r1.A03
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            goto L_0x04c1
        L_0x04f4:
            r0 = 4
            boolean r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2.A00(r0, r3)
            if (r0 == 0) goto L_0x0516
            r0 = -298833738(0xffffffffee3028b6, float:-1.3629645E28)
            r14.Cvb(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2) r3
            java.lang.String r4 = r3.A00
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.Modifier.A04(r0)
            java.lang.Object r3 = r1.A07
            java.lang.Object r1 = r1.A06
            r0 = 24
            kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4 r0 = X.C86164wN.A0y(r1, r3, r0)
            goto L_0x04c1
        L_0x0516:
            r0 = 2
            boolean r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2.A00(r0, r3)
            if (r0 == 0) goto L_0x0559
            r0 = -298833377(0xffffffffee302a1f, float:-1.3630071E28)
            r14.Cvb(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2) r3
            java.lang.String r5 = r3.A00
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r16 = androidx.compose.ui.Modifier.A04(r0)
            java.lang.Object r0 = r1.A05
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0010000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0010000_I2) r0
            boolean r4 = r0.A00
            java.lang.Object r3 = r1.A07
            r0 = 10
            kotlin.jvm.internal.KtLambdaShape153S0100000_I2_8 r1 = new kotlin.jvm.internal.KtLambdaShape153S0100000_I2_8
            r1.<init>(r3, r0)
            X.7op r0 = new X.7op
            r0.<init>(r1, r4)
            r21 = 48
            r22 = 60
            r15 = r14
            r18 = r0
            r19 = r17
            r20 = r5
            r23 = r2
            r24 = r2
            X.C117676z4.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x037b
        L_0x0559:
            r0 = -298832970(0xffffffffee302bb6, float:-1.3630551E28)
            r14.Cvb(r0)
            goto L_0x037b
        L_0x0561:
            r4 = r3
            goto L_0x029c
        L_0x0564:
            r14.CuJ()
            goto L_0x0079
        L_0x0569:
            r1 = 1170410102(0x45c30a76, float:6241.3076)
            r14.Cvb(r1)
            X.AnonymousClass7W3.A0w(r0, r2)
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape3S0701000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
