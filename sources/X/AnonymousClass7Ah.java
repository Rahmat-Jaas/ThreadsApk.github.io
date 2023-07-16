package X;

/* renamed from: X.7Ah  reason: invalid class name */
public final class AnonymousClass7Ah {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r13 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (r13 == false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass79L r24, X.C147258p3 r25, X.C147188nY r26, androidx.compose.ui.Modifier r27, X.C142918fo r28, X.AnonymousClass0ZU r29, X.AnonymousClass0YP r30, float r31, int r32, int r33, long r34, long r36, boolean r38) {
        /*
            r10 = r31
            r23 = r24
            r1 = r36
            r3 = r34
            r6 = r28
            r5 = r25
            r22 = r38
            r16 = r27
            r7 = 0
            r0 = 1560876237(0x5d0914cd, float:6.1735908E17)
            r11 = r26
            r11.Cvd(r0)
            r8 = r33
            r0 = r33 & 1
            r38 = r29
            r9 = r32
            if (r0 == 0) goto L_0x01c8
            r12 = r32 | 6
        L_0x0025:
            r21 = r33 & 2
            if (r21 == 0) goto L_0x01bb
            r12 = r12 | 48
        L_0x002b:
            r20 = r33 & 4
            if (r20 == 0) goto L_0x01ae
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x0031:
            r19 = r33 & 8
            if (r19 == 0) goto L_0x01a3
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x0037:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r32
            if (r0 != 0) goto L_0x004d
            r0 = r33 & 16
            if (r0 != 0) goto L_0x004a
            boolean r13 = r11.ACX(r3)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r13 != 0) goto L_0x004c
        L_0x004a:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x004c:
            r12 = r12 | r0
        L_0x004d:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r32 & r0
            if (r0 != 0) goto L_0x0062
            r0 = r33 & 32
            if (r0 != 0) goto L_0x005f
            boolean r13 = r11.ACX(r1)
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r13 != 0) goto L_0x0061
        L_0x005f:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x0061:
            r12 = r12 | r0
        L_0x0062:
            r18 = r33 & 64
            if (r18 == 0) goto L_0x0191
            r0 = 1572864(0x180000, float:2.204052E-39)
        L_0x0068:
            r12 = r12 | r0
        L_0x0069:
            r13 = r8 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x0181
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x006f:
            r12 = r12 | r0
        L_0x0070:
            r14 = r8 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x0171
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0076:
            r12 = r12 | r0
        L_0x0077:
            r0 = r8 & 512(0x200, float:7.175E-43)
            r37 = r30
            if (r0 == 0) goto L_0x015f
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x007f:
            r12 = r12 | r0
        L_0x0080:
            r15 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r15 = r15 & r12
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r15 != r0) goto L_0x00bb
            boolean r0 = r11.BCM()
            if (r0 == 0) goto L_0x00bb
            r11.CuJ()
        L_0x0092:
            X.8nW r7 = r11.AKE()
            if (r7 == 0) goto L_0x00ba
            X.8TX r0 = new X.8TX
            r24 = r10
            r25 = r9
            r26 = r8
            r27 = r3
            r29 = r1
            r31 = r22
            r17 = r0
            r18 = r23
            r19 = r5
            r20 = r16
            r21 = r6
            r22 = r38
            r23 = r37
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31)
            X.AnonymousClass7WO.A00(r7, r0)
        L_0x00ba:
            return
        L_0x00bb:
            r11.CvD()
            r0 = r32 & 1
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r15 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0122
            boolean r0 = r11.Acj()
            if (r0 != 0) goto L_0x0122
            r11.CuJ()
            r0 = r33 & 16
            if (r0 == 0) goto L_0x00d6
            r12 = r12 & r15
        L_0x00d6:
            r0 = r33 & 32
            if (r0 == 0) goto L_0x00dc
            r12 = r12 & r17
        L_0x00dc:
            r11.AKA()
            X.534 r15 = X.AnonymousClass6ZL.A00
            java.lang.Object r0 = r11.AEA(r15)
            X.7yT r0 = (X.C134847yT) r0
            float r14 = r0.A00
            float r14 = r14 + r10
            X.534 r7 = X.AnonymousClass6WZ.A00
            X.7KE r0 = X.C86134wK.A0I(r1)
            r13 = 1
            X.7DS r7 = X.AnonymousClass7DS.A00(r7, r0, r13)
            X.7yT r0 = X.C134847yT.A00(r14)
            X.7DS r0 = X.AnonymousClass7DS.A00(r15, r0, r13)
            X.7DS[] r13 = new X.AnonymousClass7DS[]{r7, r0}
            X.8TK r7 = new X.8TK
            r31 = r14
            r32 = r10
            r33 = r12
            r34 = r3
            r36 = r22
            r24 = r7
            r25 = r23
            r26 = r5
            r27 = r16
            r28 = r6
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36)
            r0 = 2031491085(0x7916180d, float:4.870827E34)
            X.AnonymousClass7JR.A05(r11, r7, r13, r0)
            goto L_0x0092
        L_0x0122:
            if (r21 == 0) goto L_0x0126
            X.7Wm r16 = androidx.compose.ui.Modifier.A00
        L_0x0126:
            if (r20 == 0) goto L_0x012a
            r22 = 1
        L_0x012a:
            if (r19 == 0) goto L_0x012e
            X.8fo r6 = X.C102746Wj.A00
        L_0x012e:
            r0 = r33 & 16
            if (r0 == 0) goto L_0x013d
            X.78O r0 = X.C147188nY.A0X(r11)
            X.8pE r0 = r0.A0C
            long r3 = X.C86114wI.A0A(r0)
            r12 = r12 & r15
        L_0x013d:
            r0 = r33 & 32
            if (r0 == 0) goto L_0x0147
            long r1 = X.AnonymousClass72T.A00(r11, r3)
            r12 = r12 & r17
        L_0x0147:
            if (r18 == 0) goto L_0x014b
            r23 = 0
        L_0x014b:
            if (r13 == 0) goto L_0x014e
            float r10 = (float) r7
        L_0x014e:
            if (r14 == 0) goto L_0x00dc
            X.7W3 r0 = X.C147188nY.A0Y(r11)
            java.lang.Object r5 = X.AnonymousClass7GN.A00(r0)
            X.AnonymousClass7W3.A0w(r0, r7)
            X.8p3 r5 = (X.C147258p3) r5
            goto L_0x00dc
        L_0x015f:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r32
            if (r0 != 0) goto L_0x0080
            r0 = r37
            boolean r0 = r11.ACa(r0)
            int r0 = X.C86104wH.A02(r0)
            goto L_0x007f
        L_0x0171:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r32 & r0
            if (r0 != 0) goto L_0x0077
            boolean r0 = r11.ACY(r5)
            int r0 = X.C86104wH.A03(r0)
            goto L_0x0076
        L_0x0181:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r32 & r0
            if (r0 != 0) goto L_0x0070
            boolean r0 = r11.ACV(r10)
            int r0 = X.C86104wH.A04(r0)
            goto L_0x006f
        L_0x0191:
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r32 & r0
            if (r0 != 0) goto L_0x0069
            r0 = r23
            boolean r0 = r11.ACY(r0)
            int r0 = X.C86104wH.A01(r0)
            goto L_0x0068
        L_0x01a3:
            r0 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0037
            int r0 = X.C147188nY.A0I(r11, r6)
            r12 = r12 | r0
            goto L_0x0037
        L_0x01ae:
            r0 = r9 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0031
            r0 = r22
            int r0 = X.C147188nY.A0N(r11, r0)
            r12 = r12 | r0
            goto L_0x0031
        L_0x01bb:
            r0 = r32 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x002b
            r0 = r16
            int r0 = X.C147188nY.A0G(r11, r0)
            r12 = r12 | r0
            goto L_0x002b
        L_0x01c8:
            r0 = r32 & 14
            if (r0 != 0) goto L_0x01d6
            r0 = r38
            int r12 = X.C147188nY.A09(r11, r0)
            r12 = r12 | r32
            goto L_0x0025
        L_0x01d6:
            r12 = r9
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Ah.A01(X.79L, X.8p3, X.8nY, androidx.compose.ui.Modifier, X.8fo, X.0ZU, X.0YP, float, int, int, long, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r14.ACX(r3) == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r14.ACX(r1) == false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass79L r20, X.C147188nY r21, androidx.compose.ui.Modifier r22, X.C142918fo r23, X.AnonymousClass0YP r24, float r25, int r26, int r27, long r28, long r30) {
        /*
            r12 = r25
            r15 = r20
            r1 = r30
            r3 = r28
            r13 = r23
            r9 = r22
            r0 = 1412203386(0x542c837a, float:2.96376074E12)
            r14 = r21
            r14.Cvd(r0)
            r21 = r27
            r16 = r27 & 1
            r11 = r26
            if (r16 == 0) goto L_0x0154
            r10 = r26 | 6
        L_0x001e:
            r8 = r27 & 2
            if (r8 == 0) goto L_0x0149
            r10 = r10 | 48
        L_0x0024:
            r0 = r11 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0037
            r0 = r27 & 4
            if (r0 != 0) goto L_0x0034
            boolean r5 = r14.ACX(r3)
            r0 = 256(0x100, float:3.59E-43)
            if (r5 != 0) goto L_0x0036
        L_0x0034:
            r0 = 128(0x80, float:1.794E-43)
        L_0x0036:
            r10 = r10 | r0
        L_0x0037:
            r0 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x004a
            r0 = r27 & 8
            if (r0 != 0) goto L_0x0047
            boolean r5 = r14.ACX(r1)
            r0 = 2048(0x800, float:2.87E-42)
            if (r5 != 0) goto L_0x0049
        L_0x0047:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x0049:
            r10 = r10 | r0
        L_0x004a:
            r7 = r27 & 16
            if (r7 == 0) goto L_0x013b
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
        L_0x0050:
            r6 = r27 & 32
            if (r6 == 0) goto L_0x0129
            r5 = 196608(0x30000, float:2.75506E-40)
        L_0x0056:
            r10 = r10 | r5
        L_0x0057:
            r0 = r27 & 64
            r18 = r24
            if (r0 == 0) goto L_0x0117
            r0 = 1572864(0x180000, float:2.204052E-39)
        L_0x005f:
            r10 = r10 | r0
        L_0x0060:
            r0 = 2995931(0x2db6db, float:4.198194E-39)
            r5 = r10 & r0
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r5 != r0) goto L_0x008e
            boolean r0 = r14.BCM()
            if (r0 == 0) goto L_0x008e
            r14.CuJ()
        L_0x0073:
            X.8nW r0 = r14.AKE()
            if (r0 == 0) goto L_0x008d
            X.8Sa r14 = new X.8Sa
            r24 = r1
            r22 = r3
            r19 = r12
            r20 = r11
            r17 = r13
            r16 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r24)
            X.AnonymousClass7WO.A00(r0, r14)
        L_0x008d:
            return
        L_0x008e:
            r14.CvD()
            r0 = r26 & 1
            r5 = 0
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r14.Acj()
            if (r0 != 0) goto L_0x00ee
            r14.CuJ()
            r0 = r27 & 4
            if (r0 == 0) goto L_0x00a5
            r10 = r10 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00a5:
            r0 = r27 & 8
            if (r0 == 0) goto L_0x00ab
            r10 = r10 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00ab:
            r14.AKA()
            X.534 r8 = X.AnonymousClass6ZL.A00
            java.lang.Object r0 = r14.AEA(r8)
            X.7yT r0 = (X.C134847yT) r0
            float r7 = r0.A00
            float r7 = r7 + r12
            X.534 r5 = X.AnonymousClass6WZ.A00
            X.7KE r0 = X.C86134wK.A0I(r1)
            r6 = 1
            X.7DS r5 = X.AnonymousClass7DS.A00(r5, r0, r6)
            X.7yT r0 = X.C134847yT.A00(r7)
            X.7DS r0 = X.AnonymousClass7DS.A00(r8, r0, r6)
            X.7DS[] r6 = new X.AnonymousClass7DS[]{r5, r0}
            X.8SC r5 = new X.8SC
            r23 = r15
            r24 = r9
            r25 = r13
            r26 = r18
            r27 = r7
            r28 = r12
            r29 = r10
            r30 = r3
            r22 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            r0 = -1822160838(0xffffffff9364083a, float:-2.8781702E-27)
            X.AnonymousClass7JR.A05(r14, r5, r6, r0)
            goto L_0x0073
        L_0x00ee:
            if (r16 == 0) goto L_0x00f2
            X.7Wm r9 = androidx.compose.ui.Modifier.A00
        L_0x00f2:
            if (r8 == 0) goto L_0x00f6
            X.8fo r13 = X.C102746Wj.A00
        L_0x00f6:
            r0 = r27 & 4
            if (r0 == 0) goto L_0x0106
            X.78O r0 = X.C147188nY.A0X(r14)
            X.8pE r0 = r0.A0C
            long r3 = X.C86114wI.A0A(r0)
            r10 = r10 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0106:
            r0 = r27 & 8
            if (r0 == 0) goto L_0x0110
            long r1 = X.AnonymousClass72T.A00(r14, r3)
            r10 = r10 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0110:
            if (r7 == 0) goto L_0x0113
            r15 = 0
        L_0x0113:
            if (r6 == 0) goto L_0x00ab
            float r12 = (float) r5
            goto L_0x00ab
        L_0x0117:
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r26 & r0
            if (r0 != 0) goto L_0x0060
            r0 = r18
            boolean r0 = r14.ACa(r0)
            int r0 = X.C86104wH.A01(r0)
            goto L_0x005f
        L_0x0129:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r26 & r0
            if (r0 != 0) goto L_0x0057
            boolean r0 = r14.ACV(r12)
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r0 == 0) goto L_0x0056
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0056
        L_0x013b:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r26
            if (r0 != 0) goto L_0x0050
            int r0 = X.C147188nY.A0J(r14, r15)
            r10 = r10 | r0
            goto L_0x0050
        L_0x0149:
            r0 = r26 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0024
            int r0 = X.C147188nY.A0G(r14, r13)
            r10 = r10 | r0
            goto L_0x0024
        L_0x0154:
            r0 = r26 & 14
            if (r0 != 0) goto L_0x0160
            int r10 = X.C147188nY.A0F(r14, r9)
            r10 = r10 | r26
            goto L_0x001e
        L_0x0160:
            r10 = r11
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Ah.A02(X.79L, X.8nY, androidx.compose.ui.Modifier, X.8fo, X.0YP, float, int, int, long, long):void");
    }

    public static final long A00(C141708cp r4, C147188nY r5, float f, long j) {
        r5.Cvb(1561611256);
        AnonymousClass534 r3 = AnonymousClass72T.A00;
        if (j == C86114wI.A0A(((AnonymousClass78O) r5.AEA(r3)).A0C) && r4 != null) {
            AnonymousClass78O r1 = (AnonymousClass78O) r5.AEA(r3);
            if (Float.compare(f, (float) 0) > 0 && !C86104wH.A1X(r1.A02)) {
                j = C121657He.A03(C121657He.A04(C86154wM.A0G(AnonymousClass72T.A00(r5, j)), AnonymousClass7KE.A03(AnonymousClass72T.A00(r5, j)), AnonymousClass7KE.A02(AnonymousClass72T.A00(r5, j)), AnonymousClass7KE.A01(AnonymousClass72T.A00(r5, j)), ((((float) Math.log((double) (f + ((float) 1)))) * 4.5f) + 2.0f) / 100.0f), j);
            }
        }
        AnonymousClass7W3.A0y(r5);
        return j;
    }
}
