package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.6vm  reason: invalid class name and case insensitive filesystem */
public final class C115706vm {
    public static final void A01(C147298p7 r2, LazyListState lazyListState, C147188nY r4, int i) {
        int i2;
        r4.Cvd(3173830);
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r4, r2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r4, lazyListState);
        }
        if ((i2 & 91) == 18 && r4.BCM()) {
            r4.CuJ();
        } else if (r2.getItemCount() > 0) {
            lazyListState.A05(r2);
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            C147178nW.A04(AKE, lazyListState, r2, i, 6);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: X.8Xy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: X.7YE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: X.7YE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v5, resolved type: X.8Xy} */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r13v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x027e, code lost:
        r18 = r12.Cx6(r0);
        X.C04220Ms.A0B(r18, 0);
        X.C04220Ms.A0B(r11, 2);
        X.C04220Ms.A0B(r6, 4);
        r4.Cvb(-62057177);
        r17 = X.AnonymousClass7DE.A07;
        r15 = (X.AnonymousClass69J) r4.AEA(r17);
        r0 = X.C147188nY.A0y(r4, r5);
        r14 = r9.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a9, code lost:
        if (r0 != false) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02ab, code lost:
        if (r14 != r10) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02ad, code lost:
        r14 = new X.AnonymousClass7VU(r5);
        r9.A14(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02b5, code lost:
        X.AnonymousClass7W3.A0w(r9, false);
        r14 = (X.AnonymousClass7VU) r14;
        r13 = 0;
        r16 = new java.lang.Object[]{r14, r11, r20, r15, r6};
        r4.Cvb(-568225417);
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02c8, code lost:
        r12 = X.C147188nY.A12(r4, r16[r13], r12);
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02d2, code lost:
        if (r13 < 5) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02d4, code lost:
        r13 = r9.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02d8, code lost:
        if (r12 != false) goto L_0x02dc;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02da, code lost:
        if (r13 != r10) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02dc, code lost:
        r29 = new X.AnonymousClass7YE(r6, r11, r14, r15, r26);
        r9.A14(r29);
        r29 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02f0, code lost:
        X.AnonymousClass7W3.A0w(r9, false);
        r10 = r18.Cx6((androidx.compose.ui.Modifier) r13);
        X.AnonymousClass7W3.A0w(r9, false);
        X.C04220Ms.A0B(r10, 0);
        X.C04220Ms.A0B(r21, r24);
        r14 = r10.Cx6(r21.Aep());
        r9 = r4.AEA(r17);
        X.C04220Ms.A0B(r9, 0);
        r16 = !r64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x031d, code lost:
        if (r9 != X.AnonymousClass69J.Rtl) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0321, code lost:
        if (r6 == r19) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0323, code lost:
        r16 = !r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0325, code lost:
        X.C97996Dt.A00(r7, r5.A0B, r4, androidx.compose.foundation.gestures.ScrollableKt.A00(r21, r50, r6, r5, r5.A07, r14, r42, r16), r8, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0341, code lost:
        r0 = X.AnonymousClass6a5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0345, code lost:
        r6 = X.C967266l.Horizontal;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x021d, code lost:
        if (r8 == r10) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x021f, code lost:
        r29 = new X.C140818Xy(r49, r48, r47, r11, r13, r7, r5, r46, r45, r28, r25, r26);
        r9.A14(r29);
        r29 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0241, code lost:
        X.AnonymousClass7W3.A0w(r9, false);
        r8 = (X.AnonymousClass0YP) r8;
        X.AnonymousClass7W3.A0w(r9, false);
        A01(r7, r5, r4, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x024c, code lost:
        if (r65 == false) goto L_0x0345;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x024e, code lost:
        r6 = X.C967266l.Vertical;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0250, code lost:
        r12 = X.C98026Dw.A00(r6, r7, r12, r4, r44.Cx6(r5.A0J).Cx6(r5.A08), r42, r26);
        X.C04220Ms.A0B(r12, 0);
        X.C04220Ms.A0B(r6, r24);
        r19 = X.C967266l.Vertical;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x027a, code lost:
        if (r6 != r19) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x027c, code lost:
        r0 = X.AnonymousClass6a5.A02;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C142708fS r50, X.C145048jk r51, X.C145058jl r52, X.C145068jm r53, androidx.compose.foundation.lazy.LazyListState r54, X.C147188nY r55, X.C142878fk r56, X.C141758cu r57, androidx.compose.ui.Modifier r58, X.AnonymousClass0YY r59, int r60, int r61, int r62, int r63, boolean r64, boolean r65, boolean r66) {
        /*
            r28 = r60
            r46 = r56
            r48 = r52
            r45 = r57
            r49 = r51
            r1 = 0
            r44 = r58
            r5 = r54
            r0 = r44
            boolean r24 = X.AnonymousClass0wJ.A1Z(r0, r5)
            r23 = 2
            r47 = r53
            r2 = r23
            r0 = r47
            X.C04220Ms.A0B(r0, r2)
            r22 = 5
            r2 = r22
            r0 = r50
            X.C04220Ms.A0B(r0, r2)
            r0 = 620764179(0x25001c13, float:1.1111742E-16)
            r4 = r55
            r4.Cvd(r0)
            r2 = r63
            r0 = r63 & 1
            r3 = r61
            if (r0 == 0) goto L_0x03ff
            r6 = r61 | 6
        L_0x003b:
            r0 = r63 & 2
            if (r0 == 0) goto L_0x03f4
            r6 = r6 | 48
        L_0x0041:
            r0 = r63 & 4
            r13 = 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x03e7
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r0 = r63 & 8
            r26 = r64
            if (r0 == 0) goto L_0x03da
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0051:
            r7 = r63 & 16
            r0 = 57344(0xe000, float:8.0356E-41)
            r25 = r65
            if (r7 == 0) goto L_0x03cd
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x005c:
            r7 = r63 & 32
            r0 = 458752(0x70000, float:6.42848E-40)
            if (r7 == 0) goto L_0x03c1
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x0064:
            r6 = r6 | r0
        L_0x0065:
            r7 = r63 & 64
            r0 = 3670016(0x380000, float:5.142788E-39)
            r42 = r66
            if (r7 == 0) goto L_0x03b1
            r0 = 1572864(0x180000, float:2.204052E-39)
        L_0x006f:
            r6 = r6 | r0
        L_0x0070:
            r7 = r2 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x039f
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0076:
            r6 = r6 | r0
        L_0x0077:
            r8 = r2 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x038d
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x007d:
            r6 = r6 | r0
        L_0x007e:
            r9 = r2 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x037b
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0084:
            r6 = r6 | r0
        L_0x0085:
            r10 = r2 & 1024(0x400, float:1.435E-42)
            r27 = r62
            if (r10 == 0) goto L_0x0369
            r12 = r62 | 6
        L_0x008d:
            r11 = r2 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x035c
            r12 = r12 | 48
        L_0x0093:
            r0 = r2 & 4096(0x1000, float:5.74E-42)
            r43 = r59
            if (r0 == 0) goto L_0x0349
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x009b:
            r13 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r13 = r13 & r6
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 != r0) goto L_0x00e2
            r12 = r12 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r12 != r0) goto L_0x00e2
            boolean r0 = r4.BCM()
            if (r0 == 0) goto L_0x00e2
            r4.CuJ()
        L_0x00b3:
            X.8nW r1 = r4.AKE()
            if (r1 == 0) goto L_0x00e1
            X.8U8 r0 = new X.8U8
            r12 = r46
            r13 = r45
            r14 = r44
            r15 = r43
            r16 = r28
            r17 = r3
            r18 = r27
            r19 = r2
            r20 = r26
            r21 = r25
            r22 = r42
            r6 = r0
            r7 = r50
            r8 = r49
            r9 = r48
            r10 = r47
            r11 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.AnonymousClass7WO.A00(r1, r0)
        L_0x00e1:
            return
        L_0x00e2:
            if (r7 == 0) goto L_0x00e6
            r28 = 0
        L_0x00e6:
            r0 = 0
            if (r8 == 0) goto L_0x00eb
            r46 = r0
        L_0x00eb:
            if (r9 == 0) goto L_0x00ef
            r48 = r0
        L_0x00ef:
            if (r10 == 0) goto L_0x00f3
            r45 = r0
        L_0x00f3:
            if (r11 == 0) goto L_0x00f7
            r49 = r0
        L_0x00f7:
            X.8lZ r21 = X.C115666vi.A00(r4)
            r0 = 1939491467(0x739a4a8b, float:2.4448414E31)
            r4.Cvb(r0)
            r0 = r43
            X.4oM r14 = X.C115806vw.A01(r4, r0)
            boolean r0 = X.C147188nY.A0y(r4, r5)
            r9 = r4
            X.7W3 r9 = (X.AnonymousClass7W3) r9
            java.lang.Object r7 = r9.A13()
            if (r0 != 0) goto L_0x0118
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r7 != r0) goto L_0x0121
        L_0x0118:
            r0 = 16
            kotlin.jvm.internal.KtLambdaShape20S0100000_I2 r7 = X.C86154wM.A12(r5, r0)
            r9.A14(r7)
        L_0x0121:
            X.0ZU r8 = X.AnonymousClass7W3.A09(r9, r7, r1)
            X.4ZY r7 = X.AnonymousClass4ZY.A00
            X.4ZZ r0 = X.AnonymousClass4ZZ.A00
            X.4oM r10 = X.C98036Dx.A00(r4, r8, r7, r0)
            r8 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r0 = X.C147188nY.A10(r4, r10, r5, r8)
            java.lang.Object r7 = r9.A13()
            if (r0 != 0) goto L_0x013e
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r7 != r0) goto L_0x0159
        L_0x013e:
            X.7VG r13 = new X.7VG
            r13.<init>()
            kotlin.jvm.internal.KtLambdaShape4S0400000_I2 r11 = new kotlin.jvm.internal.KtLambdaShape4S0400000_I2
            r12 = r24
            r15 = r10
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            X.7Wf r0 = X.C123267Wf.A01(r11)
            X.7Vc r7 = new X.7Vc
            r7.<init>(r0)
            r9.A14(r7)
        L_0x0159:
            X.AnonymousClass7W3.A0w(r9, r1)
            X.7Vc r7 = (X.C123047Vc) r7
            X.AnonymousClass7W3.A0w(r9, r1)
            r0 = 596174919(0x2388e847, float:1.4843523E-17)
            r4.Cvb(r0)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r25)
            boolean r0 = X.C147188nY.A0z(r4, r5, r8)
            boolean r0 = X.C147188nY.A11(r4, r14, r0)
            java.lang.Object r12 = r9.A13()
            if (r0 != 0) goto L_0x017d
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r12 != r0) goto L_0x0187
        L_0x017d:
            X.7Vj r12 = new X.7Vj
            r0 = r25
            r12.<init>(r5, r0)
            r9.A14(r12)
        L_0x0187:
            X.AnonymousClass7W3.A0w(r9, r1)
            X.8lw r12 = (X.C146268lw) r12
            X.AnonymousClass7W3.A0w(r9, r1)
            r13 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            java.lang.Object r11 = X.C147188nY.A0r(r4, r9, r13)
            java.lang.Object r10 = X.AnonymousClass7GN.A00
            if (r11 != r10) goto L_0x01a2
            X.6b4 r11 = new X.6b4
            r11.<init>()
            r9.A14(r11)
        L_0x01a2:
            X.AnonymousClass7W3.A0w(r9, r1)
            X.6b4 r11 = (X.C103996b4) r11
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            r4.Cvb(r0)
            java.lang.Object r0 = X.C147188nY.A0r(r4, r9, r13)
            java.lang.Object r0 = X.C86104wH.A0b(r4, r9, r0, r10, r0)
            X.4qz r15 = X.AnonymousClass7WN.A00(r9, r0)
            boolean r0 = X.C147188nY.A0z(r4, r5, r8)
            boolean r0 = X.C147188nY.A11(r4, r14, r0)
            java.lang.Object r13 = r9.A13()
            if (r0 != 0) goto L_0x01c9
            if (r13 != r10) goto L_0x01d3
        L_0x01c9:
            X.7Dn r13 = new X.7Dn
            r0 = r25
            r13.<init>(r15, r0)
            r9.A14(r13)
        L_0x01d3:
            X.AnonymousClass7W3.A0w(r9, r1)
            X.7Dn r13 = (X.C120987Dn) r13
            X.8pE r0 = r5.A0G
            r0.CrC(r13)
            r15 = r6 & 112(0x70, float:1.57E-43)
            r0 = -966179815(0xffffffffc6694419, float:-14929.024)
            r4.Cvb(r0)
            r8 = 10
            r6 = 0
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r26)
            r17 = 4
            r30 = r11
            r31 = r47
            r32 = r20
            r33 = r14
            r34 = r46
            r35 = r45
            r36 = r49
            r37 = r48
            r38 = r13
            r29 = r5
            java.lang.Object[] r16 = new java.lang.Object[]{r29, r30, r31, r32, r33, r34, r35, r36, r37, r38}
            r0 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r4.Cvb(r0)
            r0 = 0
        L_0x020d:
            r14 = r16[r6]
            boolean r0 = X.C147188nY.A12(r4, r14, r0)
            int r6 = r6 + 1
            if (r6 < r8) goto L_0x020d
            java.lang.Object r8 = r9.A13()
            if (r0 != 0) goto L_0x021f
            if (r8 != r10) goto L_0x0241
        L_0x021f:
            X.8Xy r8 = new X.8Xy
            r29 = r8
            r30 = r49
            r31 = r48
            r32 = r47
            r33 = r11
            r34 = r13
            r35 = r7
            r36 = r5
            r37 = r46
            r38 = r45
            r39 = r28
            r40 = r25
            r41 = r26
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r9.A14(r8)
        L_0x0241:
            X.AnonymousClass7W3.A0w(r9, r1)
            X.0YP r8 = (X.AnonymousClass0YP) r8
            X.AnonymousClass7W3.A0w(r9, r1)
            A01(r7, r5, r4, r15)
            if (r65 == 0) goto L_0x0345
            X.66l r6 = X.C967266l.Vertical
        L_0x0250:
            X.8pP r13 = r5.A0J
            r0 = r44
            androidx.compose.ui.Modifier r13 = r0.Cx6(r13)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r0 = r5.A08
            androidx.compose.ui.Modifier r33 = r13.Cx6(r0)
            r29 = r6
            r30 = r7
            r31 = r12
            r32 = r4
            r34 = r42
            r35 = r26
            androidx.compose.ui.Modifier r12 = X.C98026Dw.A00(r29, r30, r31, r32, r33, r34, r35)
            X.C04220Ms.A0B(r12, r1)
            r0 = r24
            X.C04220Ms.A0B(r6, r0)
            X.66l r19 = X.C967266l.Vertical
            r0 = r19
            if (r6 != r0) goto L_0x0341
            androidx.compose.ui.Modifier r0 = X.AnonymousClass6a5.A02
        L_0x027e:
            androidx.compose.ui.Modifier r18 = r12.Cx6(r0)
            r0 = r18
            X.C04220Ms.A0B(r0, r1)
            r0 = r23
            X.C04220Ms.A0B(r11, r0)
            r0 = r17
            X.C04220Ms.A0B(r6, r0)
            r0 = -62057177(0xfffffffffc4d1527, float:-4.2593995E36)
            r4.Cvb(r0)
            X.534 r17 = X.AnonymousClass7DE.A07
            r0 = r17
            java.lang.Object r15 = r4.AEA(r0)
            X.69J r15 = (X.AnonymousClass69J) r15
            boolean r0 = X.C147188nY.A0y(r4, r5)
            java.lang.Object r14 = r9.A13()
            if (r0 != 0) goto L_0x02ad
            if (r14 != r10) goto L_0x02b5
        L_0x02ad:
            X.7VU r14 = new X.7VU
            r14.<init>(r5)
            r9.A14(r14)
        L_0x02b5:
            X.AnonymousClass7W3.A0w(r9, r1)
            X.7VU r14 = (X.AnonymousClass7VU) r14
            r13 = 0
            r0 = r20
            java.lang.Object[] r16 = new java.lang.Object[]{r14, r11, r0, r15, r6}
            r0 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r4.Cvb(r0)
            r12 = 0
        L_0x02c8:
            r0 = r16[r13]
            boolean r12 = X.C147188nY.A12(r4, r0, r12)
            int r13 = r13 + 1
            r0 = r22
            if (r13 < r0) goto L_0x02c8
            java.lang.Object r13 = r9.A13()
            if (r12 != 0) goto L_0x02dc
            if (r13 != r10) goto L_0x02f0
        L_0x02dc:
            X.7YE r13 = new X.7YE
            r29 = r13
            r30 = r6
            r31 = r11
            r32 = r14
            r33 = r15
            r34 = r26
            r29.<init>(r30, r31, r32, r33, r34)
            r9.A14(r13)
        L_0x02f0:
            X.AnonymousClass7W3.A0w(r9, r1)
            androidx.compose.ui.Modifier r13 = (androidx.compose.ui.Modifier) r13
            r0 = r18
            androidx.compose.ui.Modifier r10 = r0.Cx6(r13)
            X.AnonymousClass7W3.A0w(r9, r1)
            X.C04220Ms.A0B(r10, r1)
            r9 = r21
            r0 = r24
            X.C04220Ms.A0B(r9, r0)
            androidx.compose.ui.Modifier r0 = r21.Aep()
            androidx.compose.ui.Modifier r14 = r10.Cx6(r0)
            r0 = r17
            java.lang.Object r9 = r4.AEA(r0)
            X.C04220Ms.A0B(r9, r1)
            r16 = r64 ^ 1
            X.69J r0 = X.AnonymousClass69J.Rtl
            if (r9 != r0) goto L_0x0325
            r0 = r19
            if (r6 == r0) goto L_0x0325
            r16 = r16 ^ 1
        L_0x0325:
            X.8p3 r0 = r5.A07
            r9 = r21
            r10 = r50
            r11 = r6
            r12 = r5
            r13 = r0
            r15 = r42
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.gestures.ScrollableKt.A00(r9, r10, r11, r12, r13, r14, r15, r16)
            X.6o6 r0 = r5.A0B
            r9 = r7
            r10 = r0
            r11 = r4
            r13 = r8
            r14 = r1
            r15 = r1
            X.C97996Dt.A00(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00b3
        L_0x0341:
            androidx.compose.ui.Modifier r0 = X.AnonymousClass6a5.A01
            goto L_0x027e
        L_0x0345:
            X.66l r6 = X.C967266l.Horizontal
            goto L_0x0250
        L_0x0349:
            r0 = r27
            r0 = r0 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x009b
            r0 = r43
            boolean r0 = r4.ACa(r0)
            if (r0 != 0) goto L_0x0359
            r13 = 128(0x80, float:1.794E-43)
        L_0x0359:
            r12 = r12 | r13
            goto L_0x009b
        L_0x035c:
            r0 = r62 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0093
            r0 = r49
            int r0 = X.C147188nY.A08(r4, r0)
            r12 = r12 | r0
            goto L_0x0093
        L_0x0369:
            r0 = r62 & 14
            if (r0 != 0) goto L_0x0377
            r0 = r45
            int r0 = X.C147188nY.A0F(r4, r0)
            r12 = r62 | r0
            goto L_0x008d
        L_0x0377:
            r12 = r27
            goto L_0x008d
        L_0x037b:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r61 & r0
            if (r0 != 0) goto L_0x0085
            r0 = r48
            boolean r0 = r4.ACY(r0)
            int r0 = X.C86104wH.A02(r0)
            goto L_0x0084
        L_0x038d:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r61 & r0
            if (r0 != 0) goto L_0x007e
            r0 = r46
            boolean r0 = r4.ACY(r0)
            int r0 = X.C86104wH.A03(r0)
            goto L_0x007d
        L_0x039f:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r61 & r0
            if (r0 != 0) goto L_0x0077
            r0 = r28
            boolean r0 = r4.ACW(r0)
            int r0 = X.C86104wH.A04(r0)
            goto L_0x0076
        L_0x03b1:
            r0 = r61 & r0
            if (r0 != 0) goto L_0x0070
            r0 = r42
            boolean r0 = r4.ACZ(r0)
            int r0 = X.C86104wH.A01(r0)
            goto L_0x006f
        L_0x03c1:
            r0 = r61 & r0
            if (r0 != 0) goto L_0x0065
            r0 = r50
            int r0 = X.C147188nY.A0K(r4, r0)
            goto L_0x0064
        L_0x03cd:
            r0 = r61 & r0
            if (r0 != 0) goto L_0x005c
            r0 = r25
            int r0 = X.C147188nY.A0P(r4, r0)
            r6 = r6 | r0
            goto L_0x005c
        L_0x03da:
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0051
            r0 = r26
            int r0 = X.C147188nY.A0O(r4, r0)
            r6 = r6 | r0
            goto L_0x0051
        L_0x03e7:
            r0 = r3 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0049
            r0 = r47
            int r0 = X.C147188nY.A0H(r4, r0)
            r6 = r6 | r0
            goto L_0x0049
        L_0x03f4:
            r0 = r61 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0041
            int r0 = X.C147188nY.A0G(r4, r5)
            r6 = r6 | r0
            goto L_0x0041
        L_0x03ff:
            r0 = r61 & 14
            if (r0 != 0) goto L_0x040d
            r0 = r44
            int r6 = X.C147188nY.A0F(r4, r0)
            r6 = r6 | r61
            goto L_0x003b
        L_0x040d:
            r6 = r3
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115706vm.A00(X.8fS, X.8jk, X.8jl, X.8jm, androidx.compose.foundation.lazy.LazyListState, X.8nY, X.8fk, X.8cu, androidx.compose.ui.Modifier, X.0YY, int, int, int, int, boolean, boolean, boolean):void");
    }
}
