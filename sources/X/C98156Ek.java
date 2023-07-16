package X;

/* renamed from: X.6Ek  reason: invalid class name and case insensitive filesystem */
public final class C98156Ek {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147188nY r35, X.AnonymousClass54A r36, java.util.Map r37, int r38, int r39) {
        /*
            r8 = r37
            r7 = 0
            r9 = r36
            X.C04220Ms.A0B(r9, r7)
            r0 = -446179233(0xffffffffe567d85f, float:-6.8428625E22)
            r10 = r35
            r10.Cvd(r0)
            r37 = r39
            r0 = r39 & 1
            r2 = 2
            r35 = r38
            if (r0 == 0) goto L_0x010a
            r0 = r38 | 6
        L_0x001b:
            r1 = r39 & 2
            if (r1 == 0) goto L_0x004b
            r0 = r0 | 16
            if (r1 != r2) goto L_0x0047
            r1 = r0 & 91
            r0 = 18
            if (r1 != r0) goto L_0x0047
            boolean r0 = r10.BCM()
            if (r0 == 0) goto L_0x0047
            r10.CuJ()
        L_0x0032:
            X.8nW r1 = r10.AKE()
            if (r1 == 0) goto L_0x0046
            r38 = 3
            kotlin.jvm.internal.KtLambdaShape2S0202000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape2S0202000_I2
            r33 = r0
            r34 = r8
            r33.<init>(r34, r35, r36, r37, r38)
            r1.D9d(r0)
        L_0x0046:
            return
        L_0x0047:
            java.util.Map r8 = X.AnonymousClass4WJ.A0A()
        L_0x004b:
            java.util.Iterator r16 = r9.iterator()
        L_0x004f:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r16.next()
            X.6Ej r0 = (X.C98146Ej) r0
            boolean r1 = r0 instanceof X.AnonymousClass549
            if (r1 == 0) goto L_0x00b5
            r1 = -326285735(0xffffffffec8d4659, float:-1.366326E27)
            r10.Cvb(r1)
            X.549 r0 = (X.AnonymousClass549) r0
            java.lang.String r12 = r0.A0C
            r8.get(r12)
            java.util.List r1 = r0.A0D
            r18 = r1
            int r1 = r0.A07
            r17 = r1
            X.6nD r15 = r0.A0A
            float r14 = r0.A00
            X.6nD r13 = r0.A0B
            float r11 = r0.A01
            float r6 = r0.A03
            int r5 = r0.A08
            int r4 = r0.A09
            float r3 = r0.A02
            float r2 = r0.A06
            float r1 = r0.A04
            float r0 = r0.A05
            r32 = 8
            r28 = r0
            r29 = r17
            r30 = r5
            r31 = r4
            r33 = r7
            r34 = r7
            r25 = r3
            r26 = r2
            r27 = r1
            r22 = r14
            r23 = r11
            r24 = r6
            r19 = r13
            r20 = r12
            r21 = r18
            r17 = r10
            r18 = r15
            X.C120427Ao.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x00b1:
            X.AnonymousClass7W3.A0z(r10, r7)
            goto L_0x004f
        L_0x00b5:
            boolean r1 = r0 instanceof X.AnonymousClass54A
            if (r1 == 0) goto L_0x0103
            r1 = -326283877(0xffffffffec8d4d9b, float:-1.3666002E27)
            r10.Cvb(r1)
            r2 = r0
            X.54A r2 = (X.AnonymousClass54A) r2
            java.lang.String r11 = r2.A07
            r8.get(r11)
            float r1 = r2.A02
            r17 = r1
            float r15 = r2.A03
            float r14 = r2.A04
            float r6 = r2.A05
            float r5 = r2.A06
            float r4 = r2.A00
            float r3 = r2.A01
            java.util.List r2 = r2.A09
            r13 = 1450046638(0x566df4ae, float:6.5408787E13)
            r12 = 8
            kotlin.jvm.internal.KtLambdaShape48S0200000_I2 r1 = new kotlin.jvm.internal.KtLambdaShape48S0200000_I2
            r1.<init>(r12, r8, r0)
            X.8sI r20 = X.AnonymousClass7JR.A00(r10, r1, r13)
            r28 = 939524096(0x38000000, float:3.0517578E-5)
            r29 = r7
            r25 = r14
            r26 = r6
            r27 = r5
            r22 = r4
            r23 = r3
            r24 = r15
            r19 = r2
            r21 = r17
            r17 = r10
            r18 = r11
            X.C120427Ao.A02(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x00b1
        L_0x0103:
            r0 = -326282407(0xffffffffec8d5359, float:-1.3668171E27)
            r10.Cvb(r0)
            goto L_0x00b1
        L_0x010a:
            r0 = r38 & 14
            if (r0 != 0) goto L_0x0116
            int r0 = X.C147188nY.A0F(r10, r9)
            r0 = r0 | r38
            goto L_0x001b
        L_0x0116:
            r0 = r35
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98156Ek.A00(X.8nY, X.54A, java.util.Map, int, int):void");
    }
}
