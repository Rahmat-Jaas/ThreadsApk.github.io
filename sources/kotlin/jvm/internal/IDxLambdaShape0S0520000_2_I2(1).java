package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.C02220Ah;

public class IDxLambdaShape0S0520000_2_I2 extends C02220Ah implements AnonymousClass0YM {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLambdaShape0S0520000_2_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z, boolean z2) {
        super(3);
        this.A07 = i;
        this.A02 = obj3;
        this.A04 = obj4;
        this.A06 = z;
        this.A01 = obj5;
        this.A00 = obj2;
        this.A03 = obj;
        this.A05 = z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.0YY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: X.0YY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: X.8Jp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: X.8Jp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v66, resolved type: kotlin.jvm.internal.KtLambdaShape1S0220000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v6, resolved type: kotlin.jvm.internal.KtLambdaShape1S0220000_I2} */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.0YY] */
    /* JADX WARNING: type inference failed for: r3v37, types: [X.0YY] */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0290, code lost:
        if (r9 != false) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02ba, code lost:
        if (r9 != false) goto L_0x02bc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
        /*
            r34 = this;
            r12 = r34
            r0 = r36
            int r1 = r12.A07
            r2 = r37
            if (r1 == 0) goto L_0x02f7
            int r4 = X.AnonymousClass0wJ.A04(r35)
            X.8nY r0 = (X.C147188nY) r0
            int r2 = X.AnonymousClass0wJ.A04(r2)
            r1 = r2 & 14
            r13 = 2
            if (r1 != 0) goto L_0x02f4
            int r1 = X.C147188nY.A03(r0, r4)
            r1 = r1 | r2
        L_0x001e:
            r2 = r1 & 91
            r1 = 18
            if (r2 != r1) goto L_0x0030
            boolean r1 = r0.BCM()
            if (r1 == 0) goto L_0x0030
            r0.CuJ()
        L_0x002d:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0030:
            java.lang.Object r1 = r12.A03
            java.lang.Object r1 = X.C86104wH.A0f(r1)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2) r1
            java.lang.Object r1 = r1.A01
            X.8s2 r1 = (X.AnonymousClass8s2) r1
            java.lang.Object r6 = r1.get(r4)
            X.8eh r6 = (X.C142338eh) r6
            java.lang.Object r3 = r12.A00
            r1 = r0
            X.7W3 r1 = (X.AnonymousClass7W3) r1
            java.lang.Object r7 = r1.A13()
            java.lang.Object r5 = X.AnonymousClass7GN.A00
            if (r7 != r5) goto L_0x005c
            kotlin.jvm.internal.KtLambdaShape24S0101000_I2 r2 = new kotlin.jvm.internal.KtLambdaShape24S0101000_I2
            r2.<init>(r4, r13, r3)
            X.7Wf r7 = new X.7Wf
            r7.<init>(r2)
            r1.A14(r7)
        L_0x005c:
            X.4oM r7 = (X.C81784oM) r7
            java.lang.Object r11 = r1.A13()
            r2 = 1065353216(0x3f800000, float:1.0)
            r31 = 0
            r21 = 0
            if (r11 != r5) goto L_0x0071
            X.7JH r11 = X.AnonymousClass6DU.A00(r2)
            r1.A14(r11)
        L_0x0071:
            java.lang.Object r10 = r1.A13()
            if (r10 != r5) goto L_0x008e
            long r2 = X.AnonymousClass7KC.A03
            X.7KC r8 = X.C86124wJ.A0O(r2)
            X.8cW r4 = X.C103866ar.A06
            X.C04220Ms.A0B(r4, r13)
            java.lang.String r3 = "Animatable"
            X.7JH r10 = new X.7JH
            r2 = r21
            r10.<init>(r4, r8, r2, r3)
            r1.A14(r10)
        L_0x008e:
            r2 = 773894976(0x2e20b340, float:3.6538994E-11)
            r0.Cvb(r2)
            r20 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2 = r20
            java.lang.Object r2 = X.C147188nY.A0r(r0, r1, r2)
            java.lang.Object r3 = X.C86104wH.A0b(r0, r1, r2, r5, r2)
            r2 = 0
            X.4qz r8 = X.AnonymousClass7WN.A00(r1, r3)
            r3 = r20
            java.lang.Object r9 = X.C147188nY.A0r(r0, r1, r3)
            if (r9 != r5) goto L_0x00b6
            X.6hL r9 = new X.6hL
            r9.<init>(r8)
            r1.A14(r9)
        L_0x00b6:
            X.AnonymousClass7W3.A0w(r1, r2)
            kotlin.jvm.internal.KtLambdaShape14S0300000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape14S0300000_I2
            r4.<init>(r13, r8, r10, r11)
            r3 = 1681419281(0x64386c11, float:1.3607952E22)
            r0.Cvb(r3)
            X.4oM r4 = X.C115806vw.A01(r0, r4)
            r3 = r20
            java.lang.Object r8 = X.C147188nY.A0r(r0, r1, r3)
            if (r8 != r5) goto L_0x00dd
            r3 = 3
            kotlin.jvm.internal.KtLambdaShape171S0100000_I2 r3 = X.C86164wN.A0w(r4, r3)
            X.7Ug r8 = new X.7Ug
            r8.<init>(r3)
            r1.A14(r8)
        L_0x00dd:
            X.AnonymousClass7W3.A0w(r1, r2)
            X.8cZ r8 = (X.AnonymousClass8cZ) r8
            X.AnonymousClass7W3.A0w(r1, r2)
            r3 = 407316196(0x184726e4, float:2.5739782E-24)
            r0.Cvb(r3)
            r3 = r8
            X.7Ug r3 = (X.C122867Ug) r3
            X.8pE r3 = r3.A02
            java.lang.Object r3 = r3.getValue()
            boolean r3 = X.AnonymousClass0wJ.A1X(r3)
            if (r3 != 0) goto L_0x0108
            kotlin.Unit r15 = kotlin.Unit.A00
            r14 = 10
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2
            r3 = r21
            r4.<init>((java.lang.Object) r11, (java.lang.Object) r10, (X.C146958n9) r3, (int) r14)
            X.AnonymousClass7K5.A05(r0, r15, r4)
        L_0x0108:
            X.AnonymousClass7W3.A0w(r1, r2)
            X.534 r3 = X.C120867Cw.A01
            java.lang.Object r14 = r0.AEA(r3)
            X.534 r19 = X.AnonymousClass7DE.A02
            r3 = r19
            X.8nV r4 = X.C147188nY.A0k(r0, r3)
            r3 = 500(0x1f4, float:7.0E-43)
            float r3 = (float) r3
            float r28 = r4.CxL(r3)
            X.7Wm r18 = androidx.compose.ui.Modifier.A00
            java.lang.Object r4 = r12.A04
            r3 = 1618982084(0x607fb4c4, float:7.370227E19)
            boolean r3 = X.C147188nY.A10(r0, r14, r6, r3)
            boolean r15 = X.C147188nY.A12(r0, r4, r3)
            java.lang.Object r3 = r1.A13()
            if (r15 != 0) goto L_0x0137
            if (r3 != r5) goto L_0x0140
        L_0x0137:
            r3 = 39
            kotlin.jvm.internal.KtLambdaShape10S0300000_I2 r3 = X.C86154wM.A0y(r6, r14, r4, r3)
            r1.A14(r3)
        L_0x0140:
            X.AnonymousClass7W3.A0w(r1, r2)
            r17 = 1
            r4 = r17
            X.C04220Ms.A0B(r9, r4)
            X.C04220Ms.A0B(r3, r13)
            kotlin.Unit r16 = kotlin.Unit.A00
            r15 = 36
            kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1 r14 = new kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1
            r4 = r21
            r14.<init>((java.lang.Object) r3, (java.lang.Object) r9, (X.C146958n9) r4, (int) r15)
            r4 = r18
            r3 = r16
            androidx.compose.ui.Modifier r15 = X.AnonymousClass7CA.A01(r4, r3, r14)
            r3 = 26
            kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12 r14 = new kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12
            r14.<init>(r8, r3)
            boolean r3 = X.C86164wN.A1Q(r2, r15)
            if (r3 == 0) goto L_0x02f0
            kotlin.jvm.internal.KtLambdaShape1S0220000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape1S0220000_I2
            r22 = r3
            r23 = r8
            r24 = r14
            r25 = r17
            r26 = r17
            r27 = r2
            r22.<init>(r23, r24, r25, r26, r27)
        L_0x017e:
            X.8YL r4 = new X.8YL
            r4.<init>(r8, r14)
            androidx.compose.ui.Modifier r14 = X.C120417Am.A02(r15, r3, r4)
            java.lang.Object r3 = r12.A01
            r4 = 1157296644(0x44faf204, float:2007.563)
            boolean r15 = X.C147188nY.A0z(r0, r3, r4)
            java.lang.Object r8 = r1.A13()
            if (r15 != 0) goto L_0x0198
            if (r8 != r5) goto L_0x019e
        L_0x0198:
            r8 = 27
            kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12 r8 = X.AnonymousClass7W3.A0G(r1, r3, r8)
        L_0x019e:
            X.AnonymousClass7W3.A0w(r1, r2)
            java.lang.Object r3 = r12.A02
            boolean r15 = X.C147188nY.A0z(r0, r3, r4)
            java.lang.Object r4 = r1.A13()
            if (r15 != 0) goto L_0x01af
            if (r4 != r5) goto L_0x01b9
        L_0x01af:
            r15 = 29
            kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6 r4 = new kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6
            r4.<init>(r3, r15)
            r1.A14(r4)
        L_0x01b9:
            X.AnonymousClass7W3.A0w(r1, r2)
            X.C04220Ms.A0B(r14, r2)
            r3 = r17
            X.C04220Ms.A0B(r8, r3)
            X.C04220Ms.A0B(r4, r13)
            r15 = 37
            kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1 r13 = new kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1
            r3 = r21
            r13.<init>((java.lang.Object) r4, (java.lang.Object) r8, (X.C146958n9) r3, (int) r15)
            r3 = r16
            androidx.compose.ui.Modifier r3 = X.AnonymousClass7CA.A01(r14, r3, r13)
            X.C04220Ms.A0B(r3, r2)
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.Modifier.A05(r3)
            r29 = 4
            kotlin.jvm.internal.KtLambdaShape0S0300001_I2 r3 = new kotlin.jvm.internal.KtLambdaShape0S0300001_I2
            r26 = r9
            r27 = r10
            r24 = r3
            r25 = r11
            r24.<init>((java.lang.Object) r25, (java.lang.Object) r26, (java.lang.Object) r27, (float) r28, (int) r29)
            androidx.compose.ui.Modifier r14 = X.C115876w3.A01(r4, r3)
            boolean r9 = r12.A05
            boolean r11 = r12.A06
            X.8ly r13 = X.AnonymousClass7KV.A07(r0, r2)
            r3 = r19
            java.lang.Object r12 = X.C147188nY.A0s(r0, r3)
            java.lang.Object r10 = X.C147188nY.A0n(r0)
            java.lang.Object r8 = X.C147188nY.A0m(r0)
            X.0ZU r4 = X.AnonymousClass74X.A00
            X.0YM r3 = X.C98236Es.A00(r14)
            X.C147188nY.A0w(r0, r1, r4)
            X.AnonymousClass7W3.A0a(r0, r1, r13, r12)
            X.AnonymousClass7KP.A07(r0, r10, r8, r3)
            X.7V3 r8 = X.AnonymousClass7V3.A00
            r3 = -508013794(0xffffffffe1b8531e, float:-4.2502377E20)
            r0.Cvb(r3)
            r10 = r6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2102000_I2 r10 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2102000_I2) r10
            int r4 = r10.A00
            if (r4 <= 0) goto L_0x02ec
            int r3 = r10.A01
            float r3 = (float) r3
            float r4 = (float) r4
            float r3 = r3 / r4
        L_0x0229:
            boolean r4 = r6 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2102000_I2
            if (r4 == 0) goto L_0x02e5
            int r4 = r10.A05
            if (r4 != r2) goto L_0x0282
            r4 = 1371904749(0x51c59aed, float:1.06088473E11)
            r0.Cvb(r4)
            java.lang.String r4 = r10.A04
            java.lang.String r9 = "viewer"
            java.lang.String r27 = X.AnonymousClass00U.A0L(r9, r4)
            X.7Tu r22 = X.AnonymousClass74O.A01
            X.7Tu r23 = X.AnonymousClass74O.A00
            r9 = r18
            androidx.compose.ui.Modifier r8 = X.AnonymousClass7KV.A01(r8, r9)
            androidx.compose.ui.Modifier r25 = X.C97876Dh.A00(r8, r3, r2)
            boolean r8 = X.C147188nY.A0y(r0, r7)
            java.lang.Object r3 = r1.A13()
            if (r8 != 0) goto L_0x0259
            if (r3 != r5) goto L_0x025f
        L_0x0259:
            r3 = 28
            kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12 r3 = X.AnonymousClass7W3.A0G(r1, r7, r3)
        L_0x025f:
            X.0ZU r29 = X.AnonymousClass7W3.A09(r1, r3, r2)
            r5 = -399013318(0xffffffffe8378a3a, float:-3.4669716E24)
            r3 = 7
            X.8sI r30 = X.AnonymousClass7JR.A01(r0, r6, r3, r5)
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r33 = 24
            r24 = r0
            r26 = r4
            r28 = r21
            X.AnonymousClass74O.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x0278:
            X.AnonymousClass7W3.A0w(r1, r2)
            r0 = r17
            X.AnonymousClass7W3.A0v(r1, r0)
            goto L_0x002d
        L_0x0282:
            r4 = 1371905527(0x51c59df7, float:1.06094846E11)
            r0.Cvb(r4)
            boolean r4 = X.C86104wH.A1X(r7)
            if (r4 == 0) goto L_0x0292
            r31 = 1
            if (r9 == 0) goto L_0x0294
        L_0x0292:
            r31 = 0
        L_0x0294:
            r4 = r20
            java.lang.Object r6 = X.C147188nY.A0r(r0, r1, r4)
            if (r6 != r5) goto L_0x02ab
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r11)
            X.7WR r5 = X.AnonymousClass7WR.A00
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            androidx.compose.runtime.ParcelableSnapshotMutableState r6 = X.C86104wH.A0I(r5, r6, r4)
            r1.A14(r6)
        L_0x02ab:
            X.AnonymousClass7W3.A0w(r1, r2)
            X.8pE r6 = (X.C147368pE) r6
            java.lang.Object r5 = r10.A02
            X.JXj r5 = (X.C36483JXj) r5
            r32 = r9 ^ 1
            if (r31 == 0) goto L_0x02bc
            r33 = 1
            if (r9 == 0) goto L_0x02be
        L_0x02bc:
            r33 = 0
        L_0x02be:
            java.lang.String r7 = r10.A03
            r4 = r18
            androidx.compose.ui.Modifier r4 = X.C97876Dh.A00(r4, r3, r2)
            X.C04220Ms.A0B(r4, r2)
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.Modifier.A04(r4)
            androidx.compose.ui.Modifier r24 = X.AnonymousClass7KV.A01(r8, r4)
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            r30 = 256(0x100, float:3.59E-43)
            r22 = r0
            r23 = r6
            r25 = r5
            r26 = r7
            r27 = r21
            r28 = r3
            X.C100356Mz.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0278
        L_0x02e5:
            r3 = 1371906221(0x51c5a0ad, float:1.06100531E11)
            r0.Cvb(r3)
            goto L_0x0278
        L_0x02ec:
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0229
        L_0x02f0:
            X.0YY r3 = androidx.compose.ui.platform.InspectableValueKt.A00
            goto L_0x017e
        L_0x02f4:
            r1 = r2
            goto L_0x001e
        L_0x02f7:
            X.8nY r1 = X.C86104wH.A0H(r0, r2)
            r0 = -629830927(0xffffffffda758af1, float:-1.72785342E16)
            r1.Cvb(r0)
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            r1.Cvb(r0)
            X.7W3 r14 = X.C147188nY.A0Y(r1)
            java.lang.Object r2 = r14.A13()
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            java.lang.Object r2 = X.C86104wH.A0b(r1, r14, r2, r0, r2)
            r13 = 0
            X.4qz r8 = X.AnonymousClass7WN.A00(r14, r2)
            r9 = 4
            r7 = 0
            java.lang.Object r11 = r12.A02
            X.66l r11 = (X.C967266l) r11
            r19 = 2
            java.lang.Object r6 = r12.A04
            X.8lv r6 = (X.C146258lv) r6
            boolean r5 = r12.A06
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            java.lang.Object[] r4 = X.C147188nY.A13(r1, r8, r11, r6, r2)
            r3 = 0
        L_0x0331:
            r2 = r4[r7]
            boolean r3 = X.C147188nY.A12(r1, r2, r3)
            int r7 = r7 + 1
            if (r7 < r9) goto L_0x0331
            java.lang.Object r4 = r14.A13()
            if (r3 != 0) goto L_0x0343
            if (r4 != r0) goto L_0x034b
        L_0x0343:
            X.7Y0 r4 = new X.7Y0
            r4.<init>(r11, r6, r8, r5)
            r14.A14(r4)
        L_0x034b:
            X.AnonymousClass7W3.A0w(r14, r13)
            X.7Y0 r4 = (X.AnonymousClass7Y0) r4
            X.7Wm r10 = androidx.compose.ui.Modifier.A00
            X.54w r2 = X.AnonymousClass72L.A00
            androidx.compose.ui.Modifier r7 = r10.Cx6(r2)
            X.8L2 r3 = X.AnonymousClass8L2.A00
            X.C04220Ms.A0B(r7, r13)
            r18 = 1
            androidx.compose.ui.focus.FocusPropertiesElement r2 = new androidx.compose.ui.focus.FocusPropertiesElement
            r2.<init>(r3)
            androidx.compose.ui.Modifier r3 = r7.Cx6(r2)
            X.C04220Ms.A0B(r3, r13)
            androidx.compose.ui.focus.FocusTargetModifierNode$FocusTargetModifierElement r2 = androidx.compose.ui.focus.FocusTargetModifierNode$FocusTargetModifierElement.A00
            androidx.compose.ui.Modifier r3 = r3.Cx6(r2)
            androidx.compose.ui.Modifier r2 = r4.A0A
            androidx.compose.ui.Modifier r17 = r3.Cx6(r2)
            java.lang.Object r9 = r12.A01
            X.8p3 r9 = (X.C147258p3) r9
            java.lang.Object r3 = r12.A00
            X.8fS r3 = (X.C142708fS) r3
            java.lang.Object r2 = r12.A03
            X.8lZ r2 = (X.C146058lZ) r2
            boolean r12 = r12.A05
            r4 = -2012025036(0xffffffff8812ef34, float:-4.421646E-34)
            r1.Cvb(r4)
            r4 = -1730186281(0xffffffff98df73d7, float:-5.7761117E-24)
            r1.Cvb(r4)
            if (r3 != 0) goto L_0x0397
            X.8fS r3 = X.C115666vi.A01(r1)
        L_0x0397:
            X.AnonymousClass7W3.A0w(r14, r13)
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            java.lang.Object r8 = X.C147188nY.A0r(r1, r14, r4)
            r7 = 0
            if (r8 != r0) goto L_0x03ad
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r8 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r8.<init>()
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = X.AnonymousClass7WR.A00(r14, r8)
        L_0x03ad:
            X.AnonymousClass7W3.A0w(r14, r13)
            X.8pE r8 = (X.C147368pE) r8
            androidx.compose.foundation.gestures.ScrollingLogic r15 = new androidx.compose.foundation.gestures.ScrollingLogic
            r20 = r15
            r21 = r2
            r22 = r3
            r23 = r11
            r24 = r6
            r25 = r8
            r26 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26)
            X.4oM r6 = X.C115806vw.A01(r1, r15)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r12)
            r2 = 1157296644(0x44faf204, float:2007.563)
            boolean r3 = X.C147188nY.A0z(r1, r3, r2)
            java.lang.Object r5 = r14.A13()
            if (r3 != 0) goto L_0x03dc
            if (r5 != r0) goto L_0x03e4
        L_0x03dc:
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1 r5 = new androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1
            r5.<init>(r6, r12)
            r14.A14(r5)
        L_0x03e4:
            X.AnonymousClass7W3.A0w(r14, r13)
            X.8lc r5 = (X.C146088lc) r5
            java.lang.Object r4 = X.C147188nY.A0r(r1, r14, r4)
            if (r4 != r0) goto L_0x03f7
            X.7UP r4 = new X.7UP
            r4.<init>(r6)
            r14.A14(r4)
        L_0x03f7:
            X.AnonymousClass7W3.A0w(r14, r13)
            X.7UP r4 = (X.AnonymousClass7UP) r4
            r3 = -1485272842(0xffffffffa77888f6, float:-3.449116E-15)
            r1.Cvb(r3)
            X.7UV r3 = X.AnonymousClass7UV.A00
            X.AnonymousClass7W3.A0w(r14, r13)
            X.8L8 r23 = X.AnonymousClass8L8.A00
            boolean r15 = X.C147188nY.A0z(r1, r6, r2)
            java.lang.Object r2 = r14.A13()
            if (r15 != 0) goto L_0x0415
            if (r2 != r0) goto L_0x041e
        L_0x0415:
            r2 = 15
            kotlin.jvm.internal.KtLambdaShape20S0100000_I2 r2 = X.C86154wM.A12(r6, r2)
            r14.A14(r2)
        L_0x041e:
            X.0ZU r16 = X.AnonymousClass7W3.A08(r14, r2, r13)
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r1 = X.C147188nY.A10(r1, r8, r6, r2)
            java.lang.Object r2 = r14.A13()
            if (r1 != 0) goto L_0x0431
            if (r2 != r0) goto L_0x0439
        L_0x0431:
            androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1 r2 = new androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1
            r2.<init>(r8, r6, r7)
            r14.A14(r2)
        L_0x0439:
            X.AnonymousClass7W3.A0w(r14, r13)
            X.0YM r2 = (X.AnonymousClass0YM) r2
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0000000_I2 r15 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0000000_I2
            r0 = r19
            r15.<init>(r0)
            r0 = r17
            X.C04220Ms.A0B(r0, r13)
            r1 = r18
            r0 = r16
            X.C18230wP.A1R(r4, r1, r0)
            r0 = 8
            boolean r0 = X.C86164wN.A1Q(r0, r2)
            if (r0 == 0) goto L_0x04b3
            X.8Jp r0 = new X.8Jp
            r22 = r16
            r24 = r15
            r25 = r2
            r26 = r12
            r27 = r13
            r19 = r4
            r20 = r11
            r21 = r9
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0470:
            X.8Z8 r1 = new X.8Z8
            r18 = r1
            r19 = r4
            r20 = r11
            r21 = r9
            r22 = r16
            r24 = r15
            r25 = r2
            r26 = r12
            r27 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2 = r17
            androidx.compose.ui.Modifier r2 = X.C120417Am.A02(r2, r0, r1)
            r1 = 9
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r0.<init>((java.lang.Object) r3, (java.lang.Object) r6, (X.C146958n9) r7, (int) r1)
            androidx.compose.ui.Modifier r1 = X.AnonymousClass7CA.A00(r2, r6, r3, r0)
            java.lang.Object r0 = r8.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher) r0
            androidx.compose.ui.Modifier r0 = X.C98186En.A00(r1, r5, r0)
            X.AnonymousClass7W3.A0w(r14, r13)
            if (r12 == 0) goto L_0x04a9
            X.7YD r10 = X.AnonymousClass7YD.A00
        L_0x04a9:
            androidx.compose.ui.Modifier r10 = (androidx.compose.ui.Modifier) r10
            androidx.compose.ui.Modifier r0 = r0.Cx6(r10)
            X.AnonymousClass7W3.A0w(r14, r13)
            return r0
        L_0x04b3:
            X.0YY r0 = androidx.compose.ui.platform.InspectableValueKt.A00
            goto L_0x0470
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDxLambdaShape0S0520000_2_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
