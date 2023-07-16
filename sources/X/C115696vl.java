package X;

/* renamed from: X.6vl  reason: invalid class name and case insensitive filesystem */
public final class C115696vl {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r1 == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r10.ACY(r2) == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (r10.ACY(r6) == false) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C142708fS r22, X.C145048jk r23, X.C145068jm r24, androidx.compose.foundation.lazy.LazyListState r25, X.C147188nY r26, X.C141758cu r27, androidx.compose.ui.Modifier r28, X.AnonymousClass0YY r29, int r30, int r31, boolean r32, boolean r33) {
        /*
            r15 = r33
            r2 = r22
            r3 = r27
            r4 = r23
            r5 = r24
            r6 = r25
            r14 = r28
            r1 = 8
            r25 = r29
            r0 = r25
            X.C04220Ms.A0B(r0, r1)
            r0 = -1724297413(0xffffffff99394f3b, float:-9.580276E-24)
            r10 = r26
            r10.Cvd(r0)
            r8 = r31
            r21 = r31 & 1
            r9 = r30
            if (r21 == 0) goto L_0x01b5
            r11 = r30 | 6
        L_0x0029:
            r0 = r30 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x003c
            r0 = r31 & 2
            if (r0 != 0) goto L_0x0039
            boolean r1 = r10.ACY(r6)
            r0 = 32
            if (r1 != 0) goto L_0x003b
        L_0x0039:
            r0 = 16
        L_0x003b:
            r11 = r11 | r0
        L_0x003c:
            r20 = r31 & 4
            if (r20 == 0) goto L_0x01aa
            r11 = r11 | 384(0x180, float:5.38E-43)
        L_0x0042:
            r19 = r31 & 8
            r22 = r32
            if (r19 == 0) goto L_0x019d
            r11 = r11 | 3072(0xc00, float:4.305E-42)
        L_0x004a:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r30
            if (r0 != 0) goto L_0x0060
            r0 = r31 & 16
            if (r0 != 0) goto L_0x005d
            boolean r1 = r10.ACY(r4)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r1 != 0) goto L_0x005f
        L_0x005d:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x005f:
            r11 = r11 | r0
        L_0x0060:
            r18 = r31 & 32
            r13 = 458752(0x70000, float:6.42848E-40)
            if (r18 == 0) goto L_0x0193
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x0068:
            r11 = r11 | r0
        L_0x0069:
            r12 = 3670016(0x380000, float:5.142788E-39)
            r0 = r30 & r12
            if (r0 != 0) goto L_0x007e
            r0 = r31 & 64
            if (r0 != 0) goto L_0x007b
            boolean r1 = r10.ACY(r2)
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r1 != 0) goto L_0x007d
        L_0x007b:
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x007d:
            r11 = r11 | r0
        L_0x007e:
            r1 = r8 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0183
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0084:
            r11 = r11 | r0
        L_0x0085:
            r0 = r8 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0171
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x008b:
            r11 = r11 | r0
        L_0x008c:
            r7 = 191739611(0xb6db6db, float:4.5782105E-32)
            r7 = r7 & r11
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r7 != r0) goto L_0x00c9
            boolean r0 = r10.BCM()
            if (r0 == 0) goto L_0x00c9
            r10.CuJ()
            r7 = r22
        L_0x00a0:
            X.8nW r1 = r10.AKE()
            if (r1 == 0) goto L_0x00c8
            r26 = 1
            kotlin.jvm.internal.KtLambdaShape0S0722000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape0S0722000_I2
            r16 = r0
            r17 = r14
            r18 = r6
            r19 = r5
            r20 = r4
            r21 = r3
            r22 = r2
            r23 = r25
            r24 = r9
            r25 = r8
            r27 = r7
            r28 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r1.D9d(r0)
        L_0x00c8:
            return
        L_0x00c9:
            r10.CvD()
            r0 = r30 & 1
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0136
            boolean r0 = r10.Acj()
            if (r0 != 0) goto L_0x0136
            r10.CuJ()
            r0 = r31 & 2
            if (r0 == 0) goto L_0x00e5
            r11 = r11 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00e5:
            r0 = r31 & 16
            if (r0 == 0) goto L_0x00eb
            r11 = r11 & r16
        L_0x00eb:
            r0 = r31 & 64
            if (r0 == 0) goto L_0x00f1
            r11 = r11 & r17
        L_0x00f1:
            r7 = r22
        L_0x00f3:
            r10.AKA()
            r26 = 0
            r18 = 0
            r0 = r11 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            int r1 = X.C86114wI.A03(r11, r0)
            int r0 = r11 >> 3
            r13 = r13 & r0
            int r27 = X.C86144wL.A04(r1, r13, r0, r12)
            int r0 = r11 >> 15
            r28 = r0 & 14
            int r0 = r11 >> 9
            r0 = r0 & 112(0x70, float:1.57E-43)
            r28 = r28 | r0
            int r0 = r11 >> 18
            r0 = r0 & 896(0x380, float:1.256E-42)
            r28 = r28 | r0
            r29 = 896(0x380, float:1.256E-42)
            r21 = r10
            r22 = r18
            r23 = r3
            r24 = r14
            r30 = r7
            r31 = r26
            r32 = r15
            r16 = r2
            r17 = r4
            r19 = r5
            r20 = r6
            X.C115706vm.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x00a0
        L_0x0136:
            if (r21 == 0) goto L_0x013a
            X.7Wm r14 = androidx.compose.ui.Modifier.A00
        L_0x013a:
            r0 = r31 & 2
            r7 = 0
            if (r0 == 0) goto L_0x0146
            r0 = 3
            androidx.compose.foundation.lazy.LazyListState r6 = X.C97946Do.A00(r10, r7, r0)
            r11 = r11 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0146:
            if (r20 == 0) goto L_0x014e
            float r0 = (float) r7
            X.7V9 r5 = new X.7V9
            r5.<init>(r0, r0, r0, r0)
        L_0x014e:
            if (r19 != 0) goto L_0x0152
            r7 = r22
        L_0x0152:
            r0 = r31 & 16
            if (r0 == 0) goto L_0x015c
            if (r7 != 0) goto L_0x016e
            X.8jk r4 = X.AnonymousClass7J3.A01
        L_0x015a:
            r11 = r11 & r16
        L_0x015c:
            if (r18 == 0) goto L_0x0160
            X.8cu r3 = X.AnonymousClass7KV.A05
        L_0x0160:
            r0 = r31 & 64
            if (r0 == 0) goto L_0x016a
            X.8fS r2 = X.C115666vi.A01(r10)
            r11 = r11 & r17
        L_0x016a:
            if (r1 == 0) goto L_0x00f3
            r15 = 1
            goto L_0x00f3
        L_0x016e:
            X.8jk r4 = X.AnonymousClass7J3.A00
            goto L_0x015a
        L_0x0171:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r30
            if (r0 != 0) goto L_0x008c
            r0 = r25
            boolean r0 = r10.ACa(r0)
            int r0 = X.C86104wH.A03(r0)
            goto L_0x008b
        L_0x0183:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r30 & r0
            if (r0 != 0) goto L_0x0085
            boolean r0 = r10.ACZ(r15)
            int r0 = X.C86104wH.A04(r0)
            goto L_0x0084
        L_0x0193:
            r0 = r30 & r13
            if (r0 != 0) goto L_0x0069
            int r0 = X.C147188nY.A0K(r10, r3)
            goto L_0x0068
        L_0x019d:
            r0 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x004a
            r0 = r22
            int r0 = X.C147188nY.A0O(r10, r0)
            r11 = r11 | r0
            goto L_0x004a
        L_0x01aa:
            r0 = r9 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0042
            int r0 = X.C147188nY.A0H(r10, r5)
            r11 = r11 | r0
            goto L_0x0042
        L_0x01b5:
            r0 = r30 & 14
            if (r0 != 0) goto L_0x01c1
            int r11 = X.C147188nY.A0F(r10, r14)
            r11 = r11 | r30
            goto L_0x0029
        L_0x01c1:
            r11 = r9
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115696vl.A00(X.8fS, X.8jk, X.8jm, androidx.compose.foundation.lazy.LazyListState, X.8nY, X.8cu, androidx.compose.ui.Modifier, X.0YY, int, int, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r1 == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r10.ACY(r2) == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (r10.ACY(r13) == false) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C142708fS r22, X.C145058jl r23, X.C145068jm r24, androidx.compose.foundation.lazy.LazyListState r25, X.C147188nY r26, X.C142878fk r27, androidx.compose.ui.Modifier r28, X.AnonymousClass0YY r29, int r30, int r31, boolean r32, boolean r33) {
        /*
            r15 = r33
            r2 = r22
            r3 = r27
            r4 = r23
            r5 = r24
            r13 = r25
            r14 = r28
            r1 = 8
            r25 = r29
            r0 = r25
            X.C04220Ms.A0B(r0, r1)
            r0 = -740714857(0xffffffffd3d99697, float:-1.86906876E12)
            r10 = r26
            r10.Cvd(r0)
            r8 = r31
            r22 = r31 & 1
            r9 = r30
            if (r22 == 0) goto L_0x01b8
            r11 = r30 | 6
        L_0x0029:
            r0 = r30 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x003c
            r0 = r31 & 2
            if (r0 != 0) goto L_0x0039
            boolean r1 = r10.ACY(r13)
            r0 = 32
            if (r1 != 0) goto L_0x003b
        L_0x0039:
            r0 = 16
        L_0x003b:
            r11 = r11 | r0
        L_0x003c:
            r21 = r31 & 4
            if (r21 == 0) goto L_0x01ad
            r11 = r11 | 384(0x180, float:5.38E-43)
        L_0x0042:
            r20 = r31 & 8
            r23 = r32
            if (r20 == 0) goto L_0x01a0
            r11 = r11 | 3072(0xc00, float:4.305E-42)
        L_0x004a:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r30
            if (r0 != 0) goto L_0x0060
            r0 = r31 & 16
            if (r0 != 0) goto L_0x005d
            boolean r1 = r10.ACY(r4)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r1 != 0) goto L_0x005f
        L_0x005d:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x005f:
            r11 = r11 | r0
        L_0x0060:
            r19 = r31 & 32
            r12 = 458752(0x70000, float:6.42848E-40)
            if (r19 == 0) goto L_0x0196
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x0068:
            r11 = r11 | r0
        L_0x0069:
            r7 = 3670016(0x380000, float:5.142788E-39)
            r0 = r30 & r7
            if (r0 != 0) goto L_0x007e
            r0 = r31 & 64
            if (r0 != 0) goto L_0x007b
            boolean r1 = r10.ACY(r2)
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r1 != 0) goto L_0x007d
        L_0x007b:
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x007d:
            r11 = r11 | r0
        L_0x007e:
            r1 = r8 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0186
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0084:
            r11 = r11 | r0
        L_0x0085:
            r0 = r8 & 256(0x100, float:3.59E-43)
            r18 = 234881024(0xe000000, float:1.5777218E-30)
            if (r0 == 0) goto L_0x0176
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x008d:
            r11 = r11 | r0
        L_0x008e:
            r6 = 191739611(0xb6db6db, float:4.5782105E-32)
            r6 = r6 & r11
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r6 != r0) goto L_0x00cb
            boolean r0 = r10.BCM()
            if (r0 == 0) goto L_0x00cb
            r10.CuJ()
            r6 = r23
        L_0x00a2:
            X.8nW r1 = r10.AKE()
            if (r1 == 0) goto L_0x00ca
            r26 = 0
            kotlin.jvm.internal.KtLambdaShape0S0722000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape0S0722000_I2
            r16 = r0
            r17 = r14
            r18 = r13
            r19 = r5
            r20 = r3
            r21 = r4
            r22 = r2
            r23 = r25
            r24 = r9
            r25 = r8
            r27 = r6
            r28 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r1.D9d(r0)
        L_0x00ca:
            return
        L_0x00cb:
            r10.CvD()
            r0 = r30 & 1
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x013b
            boolean r0 = r10.Acj()
            if (r0 != 0) goto L_0x013b
            r10.CuJ()
            r0 = r31 & 2
            if (r0 == 0) goto L_0x00e7
            r11 = r11 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00e7:
            r0 = r31 & 16
            if (r0 == 0) goto L_0x00ed
            r11 = r11 & r16
        L_0x00ed:
            r0 = r31 & 64
            if (r0 == 0) goto L_0x00f3
            r11 = r11 & r17
        L_0x00f3:
            r6 = r23
        L_0x00f5:
            r10.AKA()
            r31 = 1
            r26 = 0
            r17 = 0
            r0 = r11 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            int r1 = X.C86114wI.A03(r11, r0)
            int r0 = r11 >> 3
            r12 = r12 & r0
            int r27 = X.C86144wL.A04(r1, r12, r0, r7)
            int r0 = r11 << 9
            r0 = r0 & r18
            r27 = r27 | r0
            r1 = 1879048192(0x70000000, float:1.58456325E29)
            int r0 = r11 << 15
            r1 = r1 & r0
            r27 = r27 | r1
            int r0 = r11 >> 18
            r0 = r0 & 896(0x380, float:1.256E-42)
            r29 = 3200(0xc80, float:4.484E-42)
            r20 = r13
            r21 = r10
            r22 = r3
            r23 = r17
            r24 = r14
            r28 = r0
            r30 = r6
            r32 = r15
            r16 = r2
            r18 = r4
            r19 = r5
            X.C115706vm.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x00a2
        L_0x013b:
            if (r22 == 0) goto L_0x013f
            X.7Wm r14 = androidx.compose.ui.Modifier.A00
        L_0x013f:
            r0 = r31 & 2
            r6 = 0
            if (r0 == 0) goto L_0x014b
            r0 = 3
            androidx.compose.foundation.lazy.LazyListState r13 = X.C97946Do.A00(r10, r6, r0)
            r11 = r11 & -113(0xffffffffffffff8f, float:NaN)
        L_0x014b:
            if (r21 == 0) goto L_0x0153
            float r0 = (float) r6
            X.7V9 r5 = new X.7V9
            r5.<init>(r0, r0, r0, r0)
        L_0x0153:
            if (r20 != 0) goto L_0x0157
            r6 = r23
        L_0x0157:
            r0 = r31 & 16
            if (r0 == 0) goto L_0x0161
            if (r6 != 0) goto L_0x0173
            X.8jl r4 = X.AnonymousClass7J3.A07
        L_0x015f:
            r11 = r11 & r16
        L_0x0161:
            if (r19 == 0) goto L_0x0165
            X.8fk r3 = X.AnonymousClass7KV.A02
        L_0x0165:
            r0 = r31 & 64
            if (r0 == 0) goto L_0x016f
            X.8fS r2 = X.C115666vi.A01(r10)
            r11 = r11 & r17
        L_0x016f:
            if (r1 == 0) goto L_0x00f5
            r15 = 1
            goto L_0x00f5
        L_0x0173:
            X.8jl r4 = X.AnonymousClass7J3.A06
            goto L_0x015f
        L_0x0176:
            r0 = r30 & r18
            if (r0 != 0) goto L_0x008e
            r0 = r25
            boolean r0 = r10.ACa(r0)
            int r0 = X.C86104wH.A03(r0)
            goto L_0x008d
        L_0x0186:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r30 & r0
            if (r0 != 0) goto L_0x0085
            boolean r0 = r10.ACZ(r15)
            int r0 = X.C86104wH.A04(r0)
            goto L_0x0084
        L_0x0196:
            r0 = r30 & r12
            if (r0 != 0) goto L_0x0069
            int r0 = X.C147188nY.A0K(r10, r3)
            goto L_0x0068
        L_0x01a0:
            r0 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x004a
            r0 = r23
            int r0 = X.C147188nY.A0O(r10, r0)
            r11 = r11 | r0
            goto L_0x004a
        L_0x01ad:
            r0 = r9 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0042
            int r0 = X.C147188nY.A0H(r10, r5)
            r11 = r11 | r0
            goto L_0x0042
        L_0x01b8:
            r0 = r30 & 14
            if (r0 != 0) goto L_0x01c4
            int r11 = X.C147188nY.A0F(r10, r14)
            r11 = r11 | r30
            goto L_0x0029
        L_0x01c4:
            r11 = r9
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115696vl.A01(X.8fS, X.8jl, X.8jm, androidx.compose.foundation.lazy.LazyListState, X.8nY, X.8fk, androidx.compose.ui.Modifier, X.0YY, int, int, boolean, boolean):void");
    }
}
