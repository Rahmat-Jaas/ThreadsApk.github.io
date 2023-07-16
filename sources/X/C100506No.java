package X;

/* renamed from: X.6No  reason: invalid class name and case insensitive filesystem */
public final class C100506No {
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        if (r6 != 0) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r25, X.C147188nY r26, androidx.compose.ui.Modifier r27, X.C881656z r28, com.instagram.service.session.UserSession r29, X.AnonymousClass0ZU r30, int r31, int r32) {
        /*
            r2 = r27
            r1 = r30
            r20 = r29
            r21 = r25
            r19 = r28
            boolean r3 = X.AnonymousClass0wJ.A1Y(r1, r2)
            r0 = -675550676(0xffffffffd7bbea2c, float:-4.1322887E14)
            r9 = r26
            r9.Cvd(r0)
            r25 = r32
            r0 = r32 & 1
            r24 = r31
            if (r0 == 0) goto L_0x00e8
            r0 = r31 | 6
        L_0x0020:
            r4 = r32 & 2
            if (r4 == 0) goto L_0x00dd
            r0 = r0 | 48
        L_0x0026:
            r8 = r32 & 4
            if (r8 == 0) goto L_0x002c
            r0 = r0 | 128(0x80, float:1.794E-43)
        L_0x002c:
            r7 = r32 & 8
            if (r7 == 0) goto L_0x0032
            r0 = r0 | 1024(0x400, float:1.435E-42)
        L_0x0032:
            r6 = r32 & 16
            if (r6 == 0) goto L_0x0038
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
        L_0x0038:
            r5 = r32 & 28
            r4 = 28
            if (r5 != r4) goto L_0x0066
            r5 = 46811(0xb6db, float:6.5596E-41)
            r5 = r5 & r0
            r4 = 9362(0x2492, float:1.3119E-41)
            if (r5 != r4) goto L_0x0066
            boolean r4 = r9.BCM()
            if (r4 == 0) goto L_0x0066
            r9.CuJ()
        L_0x004f:
            X.8nW r3 = r9.AKE()
            if (r3 == 0) goto L_0x0065
            r26 = 6
            kotlin.jvm.internal.KtLambdaShape1S0502000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape1S0502000_I2
            r22 = r1
            r23 = r2
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r3.D9d(r0)
        L_0x0065:
            return
        L_0x0066:
            r9.CvD()
            r4 = r31 & 1
            r5 = -57345(0xffffffffffff1fff, float:NaN)
            if (r4 == 0) goto L_0x00b1
            boolean r4 = r9.Acj()
            if (r4 != 0) goto L_0x00b1
            r9.CuJ()
            if (r8 == 0) goto L_0x007d
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x007d:
            if (r7 == 0) goto L_0x0081
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0081:
            if (r6 == 0) goto L_0x0084
        L_0x0083:
            r0 = r0 & r5
        L_0x0084:
            r9.AKA()
            androidx.compose.ui.Modifier r10 = X.AnonymousClass7FI.A03(r2)
            r8 = 0
            r15 = 0
            r4 = -660363125(0xffffffffd8a3a88b, float:-1.43955425E15)
            r32 = 7
            kotlin.jvm.internal.KtLambdaShape9S0401000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape9S0401000_I2
            r26 = r3
            r27 = r19
            r28 = r21
            r29 = r20
            r31 = r0
            r26.<init>(r27, r28, r29, r30, r31, r32)
            X.8sI r12 = X.AnonymousClass7JR.A00(r9, r3, r4)
            r13 = 196608(0x30000, float:2.75506E-40)
            r14 = 30
            r11 = r8
            r17 = r15
            X.AnonymousClass70T.A01(r8, r9, r10, r11, r12, r13, r14, r15, r17)
            goto L_0x004f
        L_0x00b1:
            if (r8 == 0) goto L_0x00ce
            X.7aU r10 = new X.7aU
            r10.<init>()
            X.06C r11 = X.AnonymousClass7CD.A00(r9)
            if (r11 == 0) goto L_0x00f8
            r14 = 0
            X.6o9 r12 = X.C86104wH.A0J(r11)
            java.lang.Class<X.56z> r13 = X.C881656z.class
            X.3ak r19 = X.C98396Fj.A00(r9, r10, r11, r12, r13, r14)
            X.AnonymousClass7W3.A0z(r9, r3)
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ce:
            if (r7 == 0) goto L_0x00d6
            java.lang.Object r21 = X.C147188nY.A0o(r9)
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00d6:
            if (r6 == 0) goto L_0x0084
            java.lang.Object r20 = X.AnonymousClass7CZ.A01(r9)
            goto L_0x0083
        L_0x00dd:
            r4 = r31 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0026
            int r4 = X.C147188nY.A0G(r9, r2)
            r0 = r0 | r4
            goto L_0x0026
        L_0x00e8:
            r0 = r31 & 14
            if (r0 != 0) goto L_0x00f4
            int r0 = X.C147188nY.A09(r9, r1)
            r0 = r31 | r0
            goto L_0x0020
        L_0x00f4:
            r0 = r24
            goto L_0x0020
        L_0x00f8:
            java.lang.String r0 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100506No.A00(android.content.Context, X.8nY, androidx.compose.ui.Modifier, X.56z, com.instagram.service.session.UserSession, X.0ZU, int, int):void");
    }
}
