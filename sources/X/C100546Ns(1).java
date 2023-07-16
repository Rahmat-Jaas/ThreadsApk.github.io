package X;

/* renamed from: X.6Ns  reason: invalid class name and case insensitive filesystem */
public final class C100546Ns {
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008c, code lost:
        if (r9 != 0) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r30, X.C147188nY r31, androidx.compose.ui.Modifier r32, X.AnonymousClass57B r33, com.instagram.service.session.UserSession r34, X.AnonymousClass0ZU r35, X.AnonymousClass0YP r36, int r37, int r38) {
        /*
            r11 = r34
            r16 = r30
            r13 = r33
            r3 = 0
            r12 = r35
            X.C04220Ms.A0B(r12, r3)
            r14 = r32
            r15 = r36
            X.AnonymousClass0wJ.A1O(r15, r14)
            r0 = 485838262(0x1cf54db6, float:1.6232828E-21)
            r1 = r31
            r1.Cvd(r0)
            r18 = r38
            r0 = r38 & 1
            r2 = r37
            if (r0 == 0) goto L_0x011a
            r0 = r37 | 6
        L_0x0025:
            r4 = r38 & 2
            if (r4 == 0) goto L_0x010f
            r0 = r0 | 48
        L_0x002b:
            r4 = r38 & 4
            if (r4 == 0) goto L_0x0104
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0031:
            r6 = r38 & 8
            if (r6 == 0) goto L_0x0037
            r0 = r0 | 1024(0x400, float:1.435E-42)
        L_0x0037:
            r10 = r38 & 16
            if (r10 == 0) goto L_0x003d
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
        L_0x003d:
            r9 = r38 & 32
            if (r9 == 0) goto L_0x0044
            r4 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 | r4
        L_0x0044:
            r5 = r38 & 56
            r4 = 56
            if (r5 != r4) goto L_0x006f
            r5 = 374491(0x5b6db, float:5.24774E-40)
            r5 = r5 & r0
            r4 = 74898(0x12492, float:1.04954E-40)
            if (r5 != r4) goto L_0x006f
            boolean r4 = r1.BCM()
            if (r4 == 0) goto L_0x006f
            r1.CuJ()
        L_0x005c:
            X.8nW r0 = r1.AKE()
            if (r0 == 0) goto L_0x006e
            r19 = 8
            kotlin.jvm.internal.KtLambdaShape1S0602000_I2 r10 = new kotlin.jvm.internal.KtLambdaShape1S0602000_I2
            r17 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.D9d(r10)
        L_0x006e:
            return
        L_0x006f:
            r1.CvD()
            r4 = r37 & 1
            r8 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = -57345(0xffffffffffff1fff, float:NaN)
            if (r4 == 0) goto L_0x00cc
            boolean r4 = r1.Acj()
            if (r4 != 0) goto L_0x00cc
            r1.CuJ()
            if (r6 == 0) goto L_0x0089
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0089:
            if (r10 == 0) goto L_0x008c
            r0 = r0 & r7
        L_0x008c:
            if (r9 == 0) goto L_0x008f
        L_0x008e:
            r0 = r0 & r8
        L_0x008f:
            r1.AKA()
            X.0kW r4 = X.C1189973c.A00(r1)
            java.lang.String r25 = r4.getModuleName()
            androidx.compose.ui.Modifier r30 = X.AnonymousClass7FI.A03(r14)
            r35 = 0
            r28 = 0
            r5 = 1175156343(0x460b7677, float:8925.616)
            kotlin.jvm.internal.KtLambdaShape1S1501000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape1S1501000_I2
            r20 = r12
            r21 = r13
            r22 = r11
            r23 = r16
            r24 = r15
            r26 = r0
            r27 = r3
            r19 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            X.8sI r32 = X.AnonymousClass7JR.A00(r1, r4, r5)
            r33 = 196608(0x30000, float:2.75506E-40)
            r34 = 30
            r29 = r1
            r31 = r28
            r37 = r35
            X.AnonymousClass70T.A01(r28, r29, r30, r31, r32, r33, r34, r35, r37)
            goto L_0x005c
        L_0x00cc:
            if (r6 == 0) goto L_0x00f6
            com.instagram.service.session.UserSession r6 = X.AnonymousClass7CZ.A00(r1)
            X.0kW r5 = X.C1189973c.A00(r1)
            X.7bA r4 = new X.7bA
            r4.<init>(r5, r6)
            X.06C r21 = X.AnonymousClass7CD.A00(r1)
            if (r21 == 0) goto L_0x0129
            r24 = 0
            X.6o9 r22 = X.C86104wH.A0J(r21)
            java.lang.Class<X.57B> r23 = X.AnonymousClass57B.class
            r19 = r1
            r20 = r4
            X.3ak r13 = X.C98396Fj.A00(r19, r20, r21, r22, r23, r24)
            X.AnonymousClass7W3.A0z(r1, r3)
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00f6:
            if (r10 == 0) goto L_0x00fd
            java.lang.Object r16 = X.C147188nY.A0o(r1)
            r0 = r0 & r7
        L_0x00fd:
            if (r9 == 0) goto L_0x008f
            java.lang.Object r11 = X.AnonymousClass7CZ.A01(r1)
            goto L_0x008e
        L_0x0104:
            r4 = r2 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0031
            int r4 = X.C147188nY.A0H(r1, r14)
            r0 = r0 | r4
            goto L_0x0031
        L_0x010f:
            r4 = r37 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x002b
            int r4 = X.C147188nY.A0A(r1, r15)
            r0 = r0 | r4
            goto L_0x002b
        L_0x011a:
            r0 = r37 & 14
            if (r0 != 0) goto L_0x0126
            int r0 = X.C147188nY.A09(r1, r12)
            r0 = r0 | r37
            goto L_0x0025
        L_0x0126:
            r0 = r2
            goto L_0x0025
        L_0x0129:
            java.lang.String r0 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100546Ns.A00(android.content.Context, X.8nY, androidx.compose.ui.Modifier, X.57B, com.instagram.service.session.UserSession, X.0ZU, X.0YP, int, int):void");
    }
}
