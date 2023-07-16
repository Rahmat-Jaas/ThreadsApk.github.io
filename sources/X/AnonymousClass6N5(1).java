package X;

/* renamed from: X.6N5  reason: invalid class name */
public final class AnonymousClass6N5 {
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r6 != 0) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147188nY r16, androidx.compose.ui.Modifier r17, X.C882357g r18, java.lang.String r19, X.AnonymousClass0ZU r20, X.AnonymousClass0YY r21, int r22, int r23) {
        /*
            r13 = r19
            r10 = r20
            r9 = r18
            r11 = r17
            boolean r3 = X.AnonymousClass0wJ.A1Y(r13, r10)
            r1 = 2
            r12 = r21
            X.C04220Ms.A0B(r12, r1)
            r0 = -1343131629(0xffffffffaff17013, float:-4.3917278E-10)
            r2 = r16
            r2.Cvd(r0)
            r15 = r23
            r0 = r23 & 1
            r14 = r22
            if (r0 == 0) goto L_0x00f3
            r0 = r22 | 6
        L_0x0024:
            r4 = r23 & 2
            r5 = 16
            if (r4 == 0) goto L_0x00e8
            r0 = r0 | 48
        L_0x002c:
            r4 = r23 & 4
            if (r4 == 0) goto L_0x00dd
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0032:
            r8 = r23 & 8
            if (r8 == 0) goto L_0x00d2
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0038:
            r6 = r23 & 16
            if (r6 == 0) goto L_0x0062
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            if (r6 != r5) goto L_0x0062
            r5 = 46811(0xb6db, float:6.5596E-41)
            r5 = r5 & r0
            r4 = 9362(0x2492, float:1.3119E-41)
            if (r5 != r4) goto L_0x0062
            boolean r4 = r2.BCM()
            if (r4 == 0) goto L_0x0062
            r2.CuJ()
        L_0x0051:
            X.8nW r0 = r2.AKE()
            if (r0 == 0) goto L_0x0061
            r16 = 4
            kotlin.jvm.internal.KtLambdaShape0S1402000_I2 r8 = new kotlin.jvm.internal.KtLambdaShape0S1402000_I2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.D9d(r8)
        L_0x0061:
            return
        L_0x0062:
            r2.CvD()
            r4 = r22 & 1
            r7 = -57345(0xffffffffffff1fff, float:NaN)
            if (r4 == 0) goto L_0x00a1
            boolean r4 = r2.Acj()
            if (r4 != 0) goto L_0x00a1
            r2.CuJ()
            if (r6 == 0) goto L_0x0078
        L_0x0077:
            r0 = r0 & r7
        L_0x0078:
            r2.AKA()
            X.4wG r3 = r9.A06
            X.4oM r17 = X.AnonymousClass7Aj.A01(r2, r3)
            java.lang.Object r19 = X.C147188nY.A0o(r2)
            androidx.compose.ui.Modifier r5 = X.AnonymousClass7FI.A01(r11)
            r4 = 775581985(0x2e3a7121, float:4.2391982E-11)
            kotlin.jvm.internal.KtLambdaShape7S0501000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape7S0501000_I2
            r18 = r9
            r20 = r12
            r21 = r10
            r22 = r0
            r23 = r1
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            X.C117656z2.A01(r2, r5, r3, r4)
            goto L_0x0051
        L_0x00a1:
            if (r8 == 0) goto L_0x00a5
            X.7Wm r11 = androidx.compose.ui.Modifier.A00
        L_0x00a5:
            if (r6 == 0) goto L_0x0078
            com.instagram.service.session.UserSession r6 = X.AnonymousClass7CZ.A00(r2)
            X.534 r4 = X.C1190073d.A00
            java.lang.Object r5 = r2.AEA(r4)
            X.C2o r5 = (X.C21839C2o) r5
            X.7bM r4 = new X.7bM
            r4.<init>(r5, r6, r13)
            X.06C r18 = X.AnonymousClass7CD.A00(r2)
            if (r18 == 0) goto L_0x0102
            r21 = 0
            X.6o9 r19 = X.C86104wH.A0J(r18)
            java.lang.Class<X.57g> r20 = X.C882357g.class
            r17 = r4
            X.3ak r9 = X.C98396Fj.A00(r16, r17, r18, r19, r20, r21)
            X.AnonymousClass7W3.A0z(r2, r3)
            X.57g r9 = (X.C882357g) r9
            goto L_0x0077
        L_0x00d2:
            r4 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0038
            int r4 = X.C147188nY.A0I(r2, r11)
            r0 = r0 | r4
            goto L_0x0038
        L_0x00dd:
            r4 = r14 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0032
            int r4 = X.C147188nY.A0B(r2, r12)
            r0 = r0 | r4
            goto L_0x0032
        L_0x00e8:
            r4 = r22 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x002c
            int r4 = X.C147188nY.A0A(r2, r10)
            r0 = r0 | r4
            goto L_0x002c
        L_0x00f3:
            r0 = r22 & 14
            if (r0 != 0) goto L_0x00ff
            int r0 = X.C147188nY.A0F(r2, r13)
            r0 = r0 | r22
            goto L_0x0024
        L_0x00ff:
            r0 = r14
            goto L_0x0024
        L_0x0102:
            java.lang.String r0 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6N5.A00(X.8nY, androidx.compose.ui.Modifier, X.57g, java.lang.String, X.0ZU, X.0YY, int, int):void");
    }
}
