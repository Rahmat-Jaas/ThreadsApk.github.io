package X;

/* renamed from: X.6NA  reason: invalid class name */
public final class AnonymousClass6NA {
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008c, code lost:
        if (r5 == X.AnonymousClass7GN.A00) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147188nY r18, androidx.compose.ui.Modifier r19, java.lang.String r20, X.AnonymousClass0YY r21, X.AnonymousClass8s2 r22, int r23, int r24, boolean r25) {
        /*
            r15 = r19
            r6 = 0
            r10 = r21
            r9 = r22
            X.C18180wK.A1P(r9, r6, r10)
            r0 = 2008414907(0x77b5fabb, float:7.381962E33)
            r12 = r18
            r12.Cvd(r0)
            r19 = r24
            r0 = r24 & 1
            r2 = 4
            r8 = r23
            if (r0 == 0) goto L_0x0150
            r0 = r23 | 6
        L_0x001d:
            r1 = r24 & 2
            r11 = r20
            if (r1 == 0) goto L_0x0145
            r0 = r0 | 48
        L_0x0025:
            r1 = r24 & 4
            r3 = 256(0x100, float:3.59E-43)
            r7 = r25
            if (r1 == 0) goto L_0x013a
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x002f:
            r1 = r24 & 8
            r4 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x012f
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0037:
            r13 = r24 & 16
            if (r13 == 0) goto L_0x0121
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x003d:
            r5 = 46811(0xb6db, float:6.5596E-41)
            r5 = r5 & r0
            r1 = 9362(0x2492, float:1.3119E-41)
            if (r5 != r1) goto L_0x0069
            boolean r1 = r12.BCM()
            if (r1 == 0) goto L_0x0069
            r12.CuJ()
        L_0x004e:
            X.8nW r1 = r12.AKE()
            if (r1 == 0) goto L_0x0068
            r20 = 1
            kotlin.jvm.internal.KtLambdaShape0S1312000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape0S1312000_I2
            r16 = r9
            r17 = r11
            r18 = r8
            r21 = r7
            r13 = r0
            r14 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r1.D9d(r0)
        L_0x0068:
            return
        L_0x0069:
            if (r13 == 0) goto L_0x006d
            X.7Wm r15 = androidx.compose.ui.Modifier.A00
        L_0x006d:
            r1 = r0 & 14
            boolean r2 = X.AnonymousClass0wJ.A1T(r1, r2)
            r1 = r0 & 7168(0x1c00, float:1.0045E-41)
            boolean r1 = X.AnonymousClass0wJ.A1T(r1, r4)
            r2 = r2 | r1
            r1 = r0 & 896(0x380, float:1.256E-42)
            boolean r1 = X.AnonymousClass0wJ.A1T(r1, r3)
            r2 = r2 | r1
            r13 = r12
            X.7W3 r13 = (X.AnonymousClass7W3) r13
            java.lang.Object r5 = r13.A13()
            if (r2 != 0) goto L_0x008e
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r5 != r1) goto L_0x00e5
        L_0x008e:
            r1 = 10
            int r1 = X.C02260Al.A0z(r9, r1)
            int r1 = X.AnonymousClass4WK.A0L(r1)
            java.util.LinkedHashMap r5 = X.C18190wL.A0v(r1)
            java.util.Iterator r16 = r9.iterator()
        L_0x00a0:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x00e2
            java.lang.Object r14 = r16.next()
            X.5I9 r14 = (X.AnonymousClass5I9) r14
            X.75c r4 = r14.A04
            java.lang.String r3 = r4.A01
            int r1 = r14.A02
            r22 = r1
            int r1 = r14.A00
            r18 = r1
            int r1 = r14.A01
            r17 = r1
            r2 = 31
            kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3 r1 = new kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3
            r1.<init>(r2, r10, r14)
            X.5vd r2 = X.C94525vd.A00
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00cf
            r25 = 1
            if (r7 != 0) goto L_0x00d1
        L_0x00cf:
            r25 = 0
        L_0x00d1:
            X.5HT r2 = new X.5HT
            r20 = r2
            r21 = r1
            r23 = r18
            r24 = r17
            r20.<init>(r21, r22, r23, r24, r25)
            r5.put(r3, r2)
            goto L_0x00a0
        L_0x00e2:
            r13.A14(r5)
        L_0x00e5:
            java.util.Map r5 = (java.util.Map) r5
            boolean r2 = r12.ACY(r5)
            java.lang.Object r1 = r13.A13()
            if (r2 != 0) goto L_0x00f5
            java.lang.Object r2 = X.AnonymousClass7GN.A00
            if (r1 != r2) goto L_0x0100
        L_0x00f5:
            java.util.Collection r1 = r5.values()
            java.util.List r1 = X.AnonymousClass00J.A0N(r1)
            r13.A14(r1)
        L_0x0100:
            java.util.List r1 = (java.util.List) r1
            if (r11 == 0) goto L_0x011f
            java.lang.Object r2 = r5.get(r11)
            X.5HT r2 = (X.AnonymousClass5HT) r2
        L_0x010a:
            int r0 = r0 >> 6
            r0 = r0 & 896(0x380, float:1.256E-42)
            r24 = r0 | 8
            r20 = r12
            r21 = r15
            r22 = r2
            r23 = r1
            r25 = r6
            X.AnonymousClass6M1.A00(r20, r21, r22, r23, r24, r25)
            goto L_0x004e
        L_0x011f:
            r2 = 0
            goto L_0x010a
        L_0x0121:
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r23
            if (r1 != 0) goto L_0x003d
            int r1 = X.C147188nY.A0J(r12, r15)
            r0 = r0 | r1
            goto L_0x003d
        L_0x012f:
            r1 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0037
            int r1 = X.C147188nY.A0C(r12, r10)
            r0 = r0 | r1
            goto L_0x0037
        L_0x013a:
            r1 = r8 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x002f
            int r1 = X.C147188nY.A0N(r12, r7)
            r0 = r0 | r1
            goto L_0x002f
        L_0x0145:
            r1 = r23 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0025
            int r1 = X.C147188nY.A0G(r12, r11)
            r0 = r0 | r1
            goto L_0x0025
        L_0x0150:
            r0 = r23 & 14
            if (r0 != 0) goto L_0x015c
            int r0 = X.C147188nY.A0F(r12, r9)
            r0 = r0 | r23
            goto L_0x001d
        L_0x015c:
            r0 = r8
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NA.A00(X.8nY, androidx.compose.ui.Modifier, java.lang.String, X.0YY, X.8s2, int, int, boolean):void");
    }
}
