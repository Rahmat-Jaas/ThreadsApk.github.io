package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.7Bb  reason: invalid class name */
public final class AnonymousClass7Bb {
    public static final void A00(C147188nY r28, Modifier modifier, int i) {
        int i2;
        Modifier modifier2 = modifier;
        C04220Ms.A0B(modifier2, 0);
        C147188nY r4 = r28;
        r4.Cvd(-948151694);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r4, modifier2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r4.BCM()) {
            String A01 = AnonymousClass7JS.A01(r4, 2131822016);
            Modifier A06 = AnonymousClass7K4.A06(modifier2, (float) 64, 10);
            long A00 = AnonymousClass7Hi.A00();
            AnonymousClass7I9.A02(r4, A06, AnonymousClass7J9.A03(r4).A01(new C121807If((C134817yQ) null, (C121117Ee) null, 196607, 0, 0, AnonymousClass7Hi.A03(19))), (C114236su) null, C134817yQ.A06, C121117Ee.A00(), A01, 0, 0, 0, 199680, 0, 1940, 0, A00, false);
        } else {
            r4.CuJ();
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            C147178nW.A02(AKE, modifier2, i3, 30);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C147188nY r29, androidx.compose.ui.Modifier r30, X.C134747yH r31, X.C121807If r32, java.lang.String r33, X.AnonymousClass0YY r34, int r35, int r36, int r37, int r38, boolean r39) {
        /*
            r28 = r35
            r23 = r39
            r24 = r32
            r27 = r36
            r25 = r30
            r6 = 0
            r11 = r31
            r10 = r33
            boolean r26 = X.AnonymousClass0wJ.A1Z(r11, r10)
            r0 = 7
            r9 = r34
            X.C04220Ms.A0B(r9, r0)
            r0 = 1687393641(0x64939569, float:2.17795E22)
            r12 = r29
            r12.Cvd(r0)
            r7 = r38
            r0 = r38 & 1
            r8 = r37
            if (r0 == 0) goto L_0x0274
            r0 = r37 | 6
        L_0x002b:
            r1 = r38 & 2
            if (r1 == 0) goto L_0x0269
            r0 = r0 | 48
        L_0x0031:
            r15 = r38 & 4
            if (r15 == 0) goto L_0x025c
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0037:
            r14 = r38 & 8
            if (r14 == 0) goto L_0x024f
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x003d:
            r2 = r38 & 16
            r1 = 57344(0xe000, float:8.0356E-41)
            if (r2 == 0) goto L_0x0242
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0046:
            r5 = r38 & 32
            r13 = 458752(0x70000, float:6.42848E-40)
            if (r5 == 0) goto L_0x0230
            r3 = 196608(0x30000, float:2.75506E-40)
        L_0x004e:
            r0 = r0 | r3
        L_0x004f:
            r4 = r38 & 64
            if (r4 == 0) goto L_0x021e
            r1 = 1572864(0x180000, float:2.204052E-39)
        L_0x0055:
            r0 = r0 | r1
        L_0x0056:
            r1 = r7 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x020e
            r1 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x005c:
            r0 = r0 | r1
        L_0x005d:
            r3 = 23967451(0x16db6db, float:4.3661218E-38)
            r3 = r3 & r0
            r1 = 4793490(0x492492, float:6.71711E-39)
            if (r3 != r1) goto L_0x0092
            boolean r1 = r12.BCM()
            if (r1 == 0) goto L_0x0092
            r12.CuJ()
        L_0x006f:
            X.8nW r1 = r12.AKE()
            if (r1 == 0) goto L_0x0091
            X.8T1 r0 = new X.8T1
            r12 = r0
            r13 = r25
            r14 = r11
            r15 = r24
            r16 = r10
            r17 = r9
            r18 = r28
            r19 = r27
            r20 = r8
            r21 = r7
            r22 = r23
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.AnonymousClass7WO.A00(r1, r0)
        L_0x0091:
            return
        L_0x0092:
            if (r15 == 0) goto L_0x0096
            X.7Wm r25 = androidx.compose.ui.Modifier.A00
        L_0x0096:
            if (r14 == 0) goto L_0x009a
            X.7If r24 = X.C121807If.A03
        L_0x009a:
            r1 = r23
            boolean r23 = X.C86154wM.A1Z(r2, r1)
            if (r5 == 0) goto L_0x00a4
            r28 = 1
        L_0x00a4:
            if (r4 == 0) goto L_0x00a9
            r27 = 2147483647(0x7fffffff, float:NaN)
        L_0x00a9:
            r5 = r12
            X.7W3 r5 = (X.AnonymousClass7W3) r5
            java.lang.Object r4 = r5.A13()
            java.lang.Object r3 = X.AnonymousClass7GN.A00
            r1 = 0
            if (r4 != r3) goto L_0x00b9
            androidx.compose.runtime.ParcelableSnapshotMutableState r4 = X.AnonymousClass7WR.A00(r5, r1)
        L_0x00b9:
            X.8pE r4 = (X.C147368pE) r4
            X.7Wm r22 = androidx.compose.ui.Modifier.A01(r12)
            androidx.compose.ui.Alignment r1 = X.AnonymousClass7KV.A0E
            X.8ly r14 = X.C120767Cj.A00(r12, r1, r6)
            X.534 r2 = X.C147188nY.A0a(r12)
            java.lang.Object r18 = r12.AEA(r2)
            java.lang.Object r17 = X.C147188nY.A0n(r12)
            java.lang.Object r16 = X.C147188nY.A0m(r12)
            X.0ZU r1 = X.AnonymousClass74X.A00
            X.0YM r15 = X.C98236Es.A00(r22)
            X.C147188nY.A0w(r12, r5, r1)
            r1 = r18
            X.AnonymousClass7W3.A0a(r12, r5, r14, r1)
            r14 = r17
            r1 = r16
            X.AnonymousClass7KP.A07(r12, r14, r1, r15)
            r1 = -2134703709(0xffffffff80c301a3, float:-1.7908509E-38)
            r12.Cvb(r1)
            boolean r14 = X.C147188nY.A0y(r12, r4)
            java.lang.Object r1 = r5.A13()
            if (r14 != 0) goto L_0x00fc
            if (r1 != r3) goto L_0x0102
        L_0x00fc:
            r1 = 31
            kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7 r1 = X.AnonymousClass7W3.A0D(r5, r4, r1)
        L_0x0102:
            X.0YY r33 = X.AnonymousClass7W3.A0A(r5, r1, r6)
            r15 = r0 & 14
            r21 = 1618982084(0x607fb4c4, float:7.370227E19)
            r1 = r21
            boolean r1 = X.C147188nY.A10(r12, r11, r10, r1)
            boolean r1 = X.C147188nY.A12(r12, r9, r1)
            java.lang.Object r14 = r5.A13()
            if (r1 != 0) goto L_0x011d
            if (r14 != r3) goto L_0x0127
        L_0x011d:
            r1 = 10
            kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1 r14 = new kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1
            r14.<init>(r11, r9, r10, r1)
            r5.A14(r14)
        L_0x0127:
            X.0YY r34 = X.AnonymousClass7W3.A0A(r5, r14, r6)
            int r1 = r0 >> 3
            int r14 = X.C86114wI.A03(r1, r15)
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r1
            int r37 = X.C86144wL.A04(r14, r0, r1, r13)
            r30 = r25
            r32 = r24
            r35 = r28
            r36 = r27
            r38 = r6
            r39 = r23
            X.AnonymousClass6E3.A00(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            java.lang.Object r4 = r4.getValue()
            X.7AW r4 = (X.AnonymousClass7AW) r4
            if (r4 == 0) goto L_0x0207
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            java.lang.Object r0 = X.C147188nY.A0r(r12, r5, r0)
            if (r0 != r3) goto L_0x0164
            int r0 = r11.length()
            java.util.List r0 = r11.A08(r10, r6, r0)
            r5.A14(r0)
        L_0x0164:
            X.AnonymousClass7W3.A0w(r5, r6)
            java.util.Iterator r20 = X.C86144wL.A0y(r0)
        L_0x016b:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x0207
            java.lang.Object r1 = r20.next()
            X.7HE r1 = (X.AnonymousClass7HE) r1
            int r14 = r1.A01
            int r13 = r1.A00
            X.7yH r0 = r11.subSequence(r14, r13)
            java.lang.String r0 = r0.A00
            r29 = r0
            X.7EK r0 = r4.A03
            X.8nF r0 = r0.A02(r14, r13)
            X.7X1 r0 = (X.AnonymousClass7X1) r0
            android.graphics.Path r14 = r0.A01
            android.graphics.RectF r13 = r0.A02
            r0 = r26
            r14.computeBounds(r13, r0)
            float r0 = r13.left
            r16 = r0
            float r0 = r13.top
            r19 = r0
            float r14 = r13.right
            float r13 = r13.bottom
            X.8nV r0 = X.C147188nY.A0k(r12, r2)
            r15 = r0
            r0 = r16
            float r18 = r15.CxD(r0)
            X.8nV r0 = X.C147188nY.A0k(r12, r2)
            r15 = r0
            r0 = r19
            float r17 = r15.CxD(r0)
            X.8nV r0 = X.C147188nY.A0k(r12, r2)
            float r14 = r14 - r16
            float r16 = r0.CxD(r14)
            X.8nV r0 = X.C147188nY.A0k(r12, r2)
            float r13 = r13 - r19
            float r14 = r0.CxD(r13)
            r15 = r22
            r13 = r18
            r0 = r17
            androidx.compose.ui.Modifier r13 = X.C97906Dk.A00(r15, r13, r0)
            r0 = r16
            androidx.compose.ui.Modifier r14 = X.AnonymousClass7Kq.A0D(r13, r0, r14)
            r13 = r29
            r0 = r21
            boolean r0 = X.C147188nY.A10(r12, r13, r9, r0)
            boolean r0 = X.C147188nY.A12(r12, r1, r0)
            java.lang.Object r15 = r5.A13()
            if (r0 != 0) goto L_0x01ee
            if (r15 != r3) goto L_0x01fa
        L_0x01ee:
            r13 = 11
            kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1 r15 = new kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1
            r0 = r29
            r15.<init>(r1, r9, r0, r13)
            r5.A14(r15)
        L_0x01fa:
            X.0YY r0 = X.AnonymousClass7W3.A0B(r5, r15, r6)
            androidx.compose.ui.Modifier r0 = X.AnonymousClass6FI.A00(r14, r0, r6)
            X.C120767Cj.A01(r12, r0, r6)
            goto L_0x016b
        L_0x0207:
            r0 = r26
            X.AnonymousClass7W3.A0v(r5, r0)
            goto L_0x006f
        L_0x020e:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r37
            if (r1 != 0) goto L_0x005d
            boolean r1 = r12.ACa(r9)
            int r1 = X.C86104wH.A04(r1)
            goto L_0x005c
        L_0x021e:
            r1 = 3670016(0x380000, float:5.142788E-39)
            r1 = r37 & r1
            if (r1 != 0) goto L_0x0056
            r1 = r27
            boolean r1 = r12.ACW(r1)
            int r1 = X.C86104wH.A01(r1)
            goto L_0x0055
        L_0x0230:
            r1 = r37 & r13
            if (r1 != 0) goto L_0x004f
            r1 = r28
            boolean r1 = r12.ACW(r1)
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r1 == 0) goto L_0x004e
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x004e
        L_0x0242:
            r1 = r37 & r1
            if (r1 != 0) goto L_0x0046
            r1 = r23
            int r1 = X.C147188nY.A0P(r12, r1)
            r0 = r0 | r1
            goto L_0x0046
        L_0x024f:
            r1 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x003d
            r1 = r24
            int r1 = X.C147188nY.A0I(r12, r1)
            r0 = r0 | r1
            goto L_0x003d
        L_0x025c:
            r1 = r8 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0037
            r1 = r25
            int r1 = X.C147188nY.A0H(r12, r1)
            r0 = r0 | r1
            goto L_0x0037
        L_0x0269:
            r1 = r37 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0031
            int r1 = X.C147188nY.A0G(r12, r10)
            r0 = r0 | r1
            goto L_0x0031
        L_0x0274:
            r0 = r37 & 14
            if (r0 != 0) goto L_0x0280
            int r0 = X.C147188nY.A0F(r12, r11)
            r0 = r0 | r37
            goto L_0x002b
        L_0x0280:
            r0 = r8
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Bb.A01(X.8nY, androidx.compose.ui.Modifier, X.7yH, X.7If, java.lang.String, X.0YY, int, int, int, int, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C147188nY r24, androidx.compose.ui.Modifier r25, X.AnonymousClass0ZU r26, X.AnonymousClass0ZU r27, X.AnonymousClass0YP r28, int r29, int r30, boolean r31, boolean r32, boolean r33) {
        /*
            r1 = r28
            r3 = r33
            r4 = r32
            r2 = r31
            r22 = 0
            r8 = r26
            r6 = r27
            boolean r23 = X.AnonymousClass0wJ.A1Z(r8, r6)
            r0 = 2
            r15 = r25
            X.C04220Ms.A0B(r15, r0)
            r0 = -293848290(0xffffffffee7c3b1e, float:-1.9515423E28)
            r14 = r24
            r14.Cvd(r0)
            r24 = r30
            r0 = r30 & 1
            r5 = r29
            if (r0 == 0) goto L_0x0106
            r0 = r29 | 6
        L_0x002a:
            r7 = r30 & 2
            if (r7 == 0) goto L_0x00fb
            r0 = r0 | 48
        L_0x0030:
            r7 = r30 & 4
            if (r7 == 0) goto L_0x00f0
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0036:
            r9 = r30 & 8
            if (r9 == 0) goto L_0x00e5
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x003c:
            r13 = r30 & 16
            if (r13 == 0) goto L_0x00d7
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0042:
            r12 = r30 & 32
            if (r12 == 0) goto L_0x00cb
            r7 = 196608(0x30000, float:2.75506E-40)
        L_0x0048:
            r0 = r0 | r7
        L_0x0049:
            r11 = r30 & 64
            if (r11 == 0) goto L_0x00bc
            r7 = 1572864(0x180000, float:2.204052E-39)
        L_0x004f:
            r0 = r0 | r7
        L_0x0050:
            r10 = 2995931(0x2db6db, float:4.198194E-39)
            r10 = r10 & r0
            r7 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r7) goto L_0x0083
            boolean r7 = r14.BCM()
            if (r7 == 0) goto L_0x0083
            r14.CuJ()
        L_0x0062:
            X.8nW r7 = r14.AKE()
            if (r7 == 0) goto L_0x0082
            X.8Sg r0 = new X.8Sg
            r18 = r0
            r19 = r15
            r20 = r8
            r21 = r6
            r22 = r1
            r23 = r5
            r25 = r2
            r26 = r4
            r27 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.AnonymousClass7WO.A00(r7, r0)
        L_0x0082:
            return
        L_0x0083:
            boolean r2 = X.C86154wM.A1Z(r9, r2)
            if (r13 == 0) goto L_0x008a
            r4 = 1
        L_0x008a:
            if (r12 == 0) goto L_0x008d
            r3 = 0
        L_0x008d:
            if (r11 == 0) goto L_0x0091
            X.0YP r1 = X.AnonymousClass30Q.A00
        L_0x0091:
            X.698 r16 = X.AnonymousClass698.Up
            r9 = 575186269(0x2248a55d, float:2.7192597E-18)
            X.8R3 r7 = new X.8R3
            r7.<init>(r6, r4, r2, r3)
            X.8sI r19 = X.AnonymousClass7JR.A00(r14, r7, r9)
            r20 = 1597446(0x186006, float:2.238499E-39)
            int r7 = r0 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r20 = r20 | r7
            r7 = r0 & 896(0x380, float:1.256E-42)
            r20 = r20 | r7
            int r0 = r0 >> 9
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r20 = r20 | r0
            r21 = 32
            r18 = r1
            r17 = r8
            X.AnonymousClass6M2.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0062
        L_0x00bc:
            r7 = 3670016(0x380000, float:5.142788E-39)
            r7 = r7 & r29
            if (r7 != 0) goto L_0x0050
            boolean r7 = r14.ACa(r1)
            int r7 = X.C86104wH.A01(r7)
            goto L_0x004f
        L_0x00cb:
            r7 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r29
            if (r7 != 0) goto L_0x0049
            int r7 = X.C147188nY.A0Q(r14, r3)
            goto L_0x0048
        L_0x00d7:
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r29
            if (r7 != 0) goto L_0x0042
            int r7 = X.C147188nY.A0P(r14, r4)
            r0 = r0 | r7
            goto L_0x0042
        L_0x00e5:
            r7 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x003c
            int r7 = X.C147188nY.A0O(r14, r2)
            r0 = r0 | r7
            goto L_0x003c
        L_0x00f0:
            r7 = r5 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0036
            int r7 = X.C147188nY.A0H(r14, r15)
            r0 = r0 | r7
            goto L_0x0036
        L_0x00fb:
            r7 = r29 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0030
            int r7 = X.C147188nY.A0A(r14, r6)
            r0 = r0 | r7
            goto L_0x0030
        L_0x0106:
            r0 = r29 & 14
            if (r0 != 0) goto L_0x0112
            int r0 = X.C147188nY.A09(r14, r8)
            r0 = r0 | r29
            goto L_0x002a
        L_0x0112:
            r0 = r5
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Bb.A02(X.8nY, androidx.compose.ui.Modifier, X.0ZU, X.0ZU, X.0YP, int, int, boolean, boolean, boolean):void");
    }
}
