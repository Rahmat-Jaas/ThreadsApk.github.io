package X;

/* renamed from: X.6Mi  reason: invalid class name and case insensitive filesystem */
public final class C100186Mi {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147258p3 r23, X.C147188nY r24, androidx.compose.ui.Modifier r25, X.C107816hM r26, java.lang.String r27, X.AnonymousClass0ZU r28, int r29, int r30, int r31) {
        /*
            r1 = r23
            r2 = r25
            r3 = 0
            r5 = r28
            X.C04220Ms.A0B(r5, r3)
            r9 = 1
            r0 = 40988654(0x2716fee, float:1.7738006E-37)
            r7 = r24
            r7.Cvd(r0)
            r0 = r31 & 1
            r4 = r30
            if (r0 == 0) goto L_0x0112
            r0 = r30 | 6
        L_0x001b:
            r6 = r31 & 2
            r8 = 16
            r15 = r27
            if (r6 == 0) goto L_0x0107
            r0 = r0 | 48
        L_0x0025:
            r6 = r31 & 4
            r14 = r29
            if (r6 == 0) goto L_0x00f8
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x002d:
            r10 = r31 & 8
            r6 = r26
            if (r10 == 0) goto L_0x00ed
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0035:
            r13 = r31 & 16
            if (r13 == 0) goto L_0x00df
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x003b:
            r12 = r31 & 32
            if (r12 == 0) goto L_0x00d3
            r10 = 196608(0x30000, float:2.75506E-40)
        L_0x0041:
            r0 = r0 | r10
        L_0x0042:
            r11 = 374491(0x5b6db, float:5.24774E-40)
            r11 = r11 & r0
            r10 = 74898(0x12492, float:1.04954E-40)
            if (r11 != r10) goto L_0x0073
            boolean r10 = r7.BCM()
            if (r10 == 0) goto L_0x0073
            r7.CuJ()
        L_0x0054:
            X.8nW r3 = r7.AKE()
            if (r3 == 0) goto L_0x0072
            X.8SF r0 = new X.8SF
            r24 = r1
            r25 = r2
            r26 = r6
            r27 = r15
            r28 = r5
            r29 = r14
            r30 = r4
            r23 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            X.AnonymousClass7WO.A00(r3, r0)
        L_0x0072:
            return
        L_0x0073:
            if (r13 == 0) goto L_0x0077
            X.7Wm r2 = androidx.compose.ui.Modifier.A00
        L_0x0077:
            if (r12 == 0) goto L_0x0082
            r1 = r7
            X.7W3 r1 = (X.AnonymousClass7W3) r1
            java.lang.Object r1 = X.AnonymousClass7GN.A00(r1)
            X.8p3 r1 = (X.C147258p3) r1
        L_0x0082:
            r16 = 0
            r10 = 1050253722(0x3e99999a, float:0.3)
            androidx.compose.ui.Modifier r11 = X.C1190273f.A00(r1, r2, r10, r9)
            X.8O3 r10 = X.AnonymousClass8O3.A00
            androidx.compose.ui.Modifier r20 = X.AnonymousClass6FI.A00(r11, r10, r9)
            float r8 = (float) r8
            X.52s r21 = X.AnonymousClass7G5.A00(r8)
            long r12 = r6.A00
            long r10 = r6.A01
            r9 = -1709557069(0xffffffff9a1a3ab3, float:-3.189387E-23)
            r27 = 2
            kotlin.jvm.internal.KtLambdaShape1S1102000_I2 r8 = new kotlin.jvm.internal.KtLambdaShape1S1102000_I2
            r22 = r8
            r23 = r6
            r24 = r15
            r25 = r0
            r26 = r14
            r22.<init>(r23, r24, r25, r26, r27)
            X.8sI r23 = X.AnonymousClass7JR.A00(r7, r8, r9)
            r24 = 817889280(0x30c00000, float:1.3969839E-9)
            r8 = r0 & 14
            r24 = r24 | r8
            r8 = 3670016(0x380000, float:5.142788E-39)
            int r0 = r0 << 3
            r0 = r0 & r8
            r24 = r24 | r0
            r25 = 256(0x100, float:3.59E-43)
            r17 = r16
            r28 = r10
            r30 = r3
            r22 = r5
            r26 = r12
            r18 = r1
            r19 = r7
            X.AnonymousClass70T.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30)
            goto L_0x0054
        L_0x00d3:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r30
            if (r10 != 0) goto L_0x0042
            int r10 = X.C147188nY.A0K(r7, r1)
            goto L_0x0041
        L_0x00df:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r30
            if (r10 != 0) goto L_0x003b
            int r10 = X.C147188nY.A0J(r7, r2)
            r0 = r0 | r10
            goto L_0x003b
        L_0x00ed:
            r10 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0035
            int r10 = X.C147188nY.A0I(r7, r6)
            r0 = r0 | r10
            goto L_0x0035
        L_0x00f8:
            r6 = r4 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x002d
            boolean r6 = r7.ACW(r14)
            int r6 = X.C86124wJ.A06(r6)
            r0 = r0 | r6
            goto L_0x002d
        L_0x0107:
            r6 = r30 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0025
            int r6 = X.C147188nY.A0G(r7, r15)
            r0 = r0 | r6
            goto L_0x0025
        L_0x0112:
            r0 = r30 & 14
            if (r0 != 0) goto L_0x011e
            int r0 = X.C147188nY.A09(r7, r5)
            r0 = r0 | r30
            goto L_0x001b
        L_0x011e:
            r0 = r4
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100186Mi.A00(X.8p3, X.8nY, androidx.compose.ui.Modifier, X.6hM, java.lang.String, X.0ZU, int, int, int):void");
    }
}
