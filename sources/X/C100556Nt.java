package X;

/* renamed from: X.6Nt  reason: invalid class name and case insensitive filesystem */
public final class C100556Nt {
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a3, code lost:
        if (r14 != 0) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r34, X.C147188nY r35, androidx.compose.ui.Modifier r36, X.C19210zU r37, com.instagram.service.session.UserSession r38, X.AnonymousClass0ZU r39, X.AnonymousClass0ZU r40, X.AnonymousClass0ZU r41, int r42, int r43) {
        /*
            r3 = r37
            r19 = r38
            r17 = r34
            r8 = 0
            r7 = r39
            X.C04220Ms.A0B(r7, r8)
            r4 = r41
            r6 = r40
            X.AnonymousClass0wJ.A1O(r6, r4)
            r2 = 3
            r10 = r36
            X.C04220Ms.A0B(r10, r2)
            r1 = 966857532(0x39a1133c, float:3.0722644E-4)
            r0 = r35
            r0.Cvd(r1)
            r22 = r43
            r5 = r43 & 1
            r1 = r42
            if (r5 == 0) goto L_0x013b
            r5 = r42 | 6
        L_0x002b:
            r9 = r43 & 2
            if (r9 == 0) goto L_0x0130
            r5 = r5 | 48
        L_0x0031:
            r9 = r43 & 4
            if (r9 == 0) goto L_0x0125
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0037:
            r9 = r43 & 8
            if (r9 == 0) goto L_0x011a
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x003d:
            r16 = r43 & 16
            if (r16 == 0) goto L_0x0043
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
        L_0x0043:
            r15 = r43 & 32
            if (r15 == 0) goto L_0x004a
            r9 = 65536(0x10000, float:9.18355E-41)
            r5 = r5 | r9
        L_0x004a:
            r14 = r43 & 64
            if (r14 == 0) goto L_0x0051
            r9 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 | r9
        L_0x0051:
            r11 = r43 & 112(0x70, float:1.57E-43)
            r9 = 112(0x70, float:1.57E-43)
            if (r11 != r9) goto L_0x0084
            r11 = 2995931(0x2db6db, float:4.198194E-39)
            r11 = r11 & r5
            r9 = 599186(0x92492, float:8.39638E-40)
            if (r11 != r9) goto L_0x0084
            boolean r9 = r0.BCM()
            if (r9 == 0) goto L_0x0084
            r0.CuJ()
        L_0x0069:
            X.8nW r0 = r0.AKE()
            if (r0 == 0) goto L_0x0083
            kotlin.jvm.internal.KtLambdaShape1S0702000_I2 r13 = new kotlin.jvm.internal.KtLambdaShape1S0702000_I2
            r23 = r2
            r20 = r3
            r21 = r1
            r18 = r10
            r16 = r4
            r15 = r7
            r14 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.D9d(r13)
        L_0x0083:
            return
        L_0x0084:
            r0.CvD()
            r9 = r42 & 1
            r13 = -3670017(0xffffffffffc7ffff, float:NaN)
            r12 = -458753(0xfffffffffff8ffff, float:NaN)
            r11 = -57345(0xffffffffffff1fff, float:NaN)
            if (r9 == 0) goto L_0x00e3
            boolean r9 = r0.Acj()
            if (r9 != 0) goto L_0x00e3
            r0.CuJ()
            if (r16 == 0) goto L_0x00a0
            r5 = r5 & r11
        L_0x00a0:
            if (r15 == 0) goto L_0x00a3
            r5 = r5 & r12
        L_0x00a3:
            if (r14 == 0) goto L_0x00a6
        L_0x00a5:
            r5 = r5 & r13
        L_0x00a6:
            r0.AKA()
            X.4wG r8 = r3.A02
            r33 = 0
            X.4oM r31 = X.AnonymousClass7Aj.A01(r0, r8)
            androidx.compose.ui.Modifier r35 = X.AnonymousClass7FI.A03(r10)
            r9 = 2106443069(0x7d8dc53d, float:2.3555658E37)
            kotlin.jvm.internal.KtLambdaShape2S0701000_I2 r8 = new kotlin.jvm.internal.KtLambdaShape2S0701000_I2
            r23 = r8
            r24 = r5
            r25 = r2
            r26 = r3
            r27 = r17
            r28 = r4
            r29 = r6
            r30 = r7
            r32 = r19
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.8sI r37 = X.AnonymousClass7JR.A00(r0, r8, r9)
            r38 = 196608(0x30000, float:2.75506E-40)
            r39 = 30
            r40 = 0
            r34 = r0
            r36 = r33
            r42 = r40
            X.AnonymousClass70T.A01(r33, r34, r35, r36, r37, r38, r39, r40, r42)
            goto L_0x0069
        L_0x00e3:
            if (r16 == 0) goto L_0x00ea
            android.content.Context r17 = X.C147188nY.A0T(r0)
            r5 = r5 & r11
        L_0x00ea:
            if (r15 == 0) goto L_0x00f1
            java.lang.Object r19 = X.AnonymousClass7CZ.A01(r0)
            r5 = r5 & r12
        L_0x00f1:
            if (r14 == 0) goto L_0x00a6
            android.content.Context r9 = X.C86154wM.A09(r17)
            android.app.Application r9 = (android.app.Application) r9
            X.3wk r3 = new X.3wk
            r3.<init>(r9)
            X.06C r25 = X.AnonymousClass7CD.A00(r0)
            if (r25 == 0) goto L_0x014a
            r28 = 0
            X.6o9 r26 = X.C86104wH.A0J(r25)
            java.lang.Class<X.0zU> r27 = X.C19210zU.class
            r23 = r0
            r24 = r3
            X.3ak r3 = X.C98396Fj.A00(r23, r24, r25, r26, r27, r28)
            X.AnonymousClass7W3.A0z(r0, r8)
            X.0zU r3 = (X.C19210zU) r3
            goto L_0x00a5
        L_0x011a:
            r9 = r1 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x003d
            int r9 = X.C147188nY.A0I(r0, r10)
            r5 = r5 | r9
            goto L_0x003d
        L_0x0125:
            r9 = r1 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0037
            int r9 = X.C147188nY.A0B(r0, r4)
            r5 = r5 | r9
            goto L_0x0037
        L_0x0130:
            r9 = r42 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0031
            int r9 = X.C147188nY.A0A(r0, r6)
            r5 = r5 | r9
            goto L_0x0031
        L_0x013b:
            r5 = r42 & 14
            if (r5 != 0) goto L_0x0147
            int r5 = X.C147188nY.A09(r0, r7)
            r5 = r5 | r42
            goto L_0x002b
        L_0x0147:
            r5 = r1
            goto L_0x002b
        L_0x014a:
            java.lang.String r0 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100556Nt.A00(android.content.Context, X.8nY, androidx.compose.ui.Modifier, X.0zU, com.instagram.service.session.UserSession, X.0ZU, X.0ZU, X.0ZU, int, int):void");
    }
}
