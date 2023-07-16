package X;

/* renamed from: X.78U  reason: invalid class name */
public final class AnonymousClass78U {
    public static final float A00 = ((float) 2);
    public static final AnonymousClass78U A01 = new AnonymousClass78U();
    public static final float A02 = ((float) 1);

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r12.ACX(r10) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        if ((r25 & 4) != 0) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r12.ACV(r6) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C147188nY r21, androidx.compose.ui.Modifier r22, float r23, int r24, int r25, long r26) {
        /*
            r20 = this;
            r10 = r26
            r6 = r23
            r5 = r22
            r0 = 910934799(0x364bc30f, float:3.0362896E-6)
            r12 = r21
            r12.Cvd(r0)
            r8 = r25
            r3 = r25 & 1
            r7 = r24
            if (r3 == 0) goto L_0x00c5
            r2 = r24 | 6
        L_0x0018:
            r0 = r24 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x002b
            r0 = r25 & 2
            if (r0 != 0) goto L_0x0028
            boolean r1 = r12.ACV(r6)
            r0 = 32
            if (r1 != 0) goto L_0x002a
        L_0x0028:
            r0 = 16
        L_0x002a:
            r2 = r2 | r0
        L_0x002b:
            r0 = r7 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x003e
            r0 = r25 & 4
            if (r0 != 0) goto L_0x003b
            boolean r1 = r12.ACX(r10)
            r0 = 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L_0x003d
        L_0x003b:
            r0 = 128(0x80, float:1.794E-43)
        L_0x003d:
            r2 = r2 | r0
        L_0x003e:
            r0 = r25 & 8
            r4 = r20
            if (r0 == 0) goto L_0x00bb
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0046:
            r1 = r2 & 5851(0x16db, float:8.199E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r1 != r0) goto L_0x0065
            boolean r0 = r12.BCM()
            if (r0 == 0) goto L_0x0065
            r12.CuJ()
        L_0x0055:
            X.8nW r0 = r12.AKE()
            if (r0 == 0) goto L_0x0064
            r9 = 0
            kotlin.jvm.internal.KtLambdaShape0S0202101_I2 r3 = new kotlin.jvm.internal.KtLambdaShape0S0202101_I2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.D9d(r3)
        L_0x0064:
            return
        L_0x0065:
            r12.CvD()
            r0 = r24 & 1
            if (r0 == 0) goto L_0x009d
            boolean r0 = r12.Acj()
            if (r0 != 0) goto L_0x009d
            r12.CuJ()
            r0 = r25 & 2
            if (r0 == 0) goto L_0x007b
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
        L_0x007b:
            r0 = r25 & 4
            if (r0 == 0) goto L_0x0081
        L_0x007f:
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0081:
            r12.AKA()
            r15 = 0
            r16 = r2 & 14
            int r0 = r2 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r16 = r16 | r0
            int r0 = r2 << 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r16 = r16 | r0
            r17 = 8
            r13 = r5
            r14 = r6
            r18 = r10
            X.AnonymousClass6ED.A00(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0055
        L_0x009d:
            if (r3 == 0) goto L_0x00a1
            X.7Wm r5 = androidx.compose.ui.Modifier.A00
        L_0x00a1:
            r0 = r25 & 2
            if (r0 == 0) goto L_0x00a9
            float r6 = A02
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00a9:
            r0 = r25 & 4
            if (r0 == 0) goto L_0x0081
            X.534 r0 = X.AnonymousClass6WZ.A00
            long r0 = X.C147188nY.A0R(r12, r0)
            r3 = 1039516303(0x3df5c28f, float:0.12)
            long r10 = X.C121657He.A04(X.C86154wM.A0G(r0), X.AnonymousClass7KE.A03(r0), X.AnonymousClass7KE.A02(r0), X.AnonymousClass7KE.A01(r0), r3)
            goto L_0x007f
        L_0x00bb:
            r0 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0046
            int r0 = X.C147188nY.A0I(r12, r4)
            r2 = r2 | r0
            goto L_0x0046
        L_0x00c5:
            r0 = r24 & 14
            if (r0 != 0) goto L_0x00d1
            int r2 = X.C147188nY.A0F(r12, r5)
            r2 = r2 | r24
            goto L_0x0018
        L_0x00d1:
            r2 = r7
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78U.A00(X.8nY, androidx.compose.ui.Modifier, float, int, int, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r13.ACX(r10) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r13.ACV(r15) == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C147188nY r13, androidx.compose.ui.Modifier r14, float r15, int r16, int r17, long r18) {
        /*
            r12 = this;
            r10 = r18
            r6 = r15
            r5 = r14
            r0 = 1499002201(0x5958f559, float:3.81677235E15)
            r13.Cvd(r0)
            r8 = r17
            r3 = r17 & 1
            r7 = r16
            if (r3 == 0) goto L_0x00a6
            r2 = r16 | 6
        L_0x0014:
            r0 = r16 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0027
            r0 = r17 & 2
            if (r0 != 0) goto L_0x0024
            boolean r1 = r13.ACV(r15)
            r0 = 32
            if (r1 != 0) goto L_0x0026
        L_0x0024:
            r0 = 16
        L_0x0026:
            r2 = r2 | r0
        L_0x0027:
            r0 = r7 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x003a
            r0 = r17 & 4
            if (r0 != 0) goto L_0x0037
            boolean r1 = r13.ACX(r10)
            r0 = 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L_0x0039
        L_0x0037:
            r0 = 128(0x80, float:1.794E-43)
        L_0x0039:
            r2 = r2 | r0
        L_0x003a:
            r0 = r17 & 8
            r4 = r12
            if (r0 == 0) goto L_0x009c
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0041:
            r1 = r2 & 5851(0x16db, float:8.199E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r1 != r0) goto L_0x0060
            boolean r0 = r13.BCM()
            if (r0 == 0) goto L_0x0060
            r13.CuJ()
        L_0x0050:
            X.8nW r0 = r13.AKE()
            if (r0 == 0) goto L_0x005f
            r9 = 1
            kotlin.jvm.internal.KtLambdaShape0S0202101_I2 r3 = new kotlin.jvm.internal.KtLambdaShape0S0202101_I2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.D9d(r3)
        L_0x005f:
            return
        L_0x0060:
            r13.CvD()
            r0 = r16 & 1
            if (r0 == 0) goto L_0x0087
            boolean r0 = r13.Acj()
            if (r0 != 0) goto L_0x0087
            r13.CuJ()
        L_0x0070:
            r13.AKA()
            r1 = 0
            X.C04220Ms.A0B(r5, r1)
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.Modifier.A04(r5)
            androidx.compose.ui.Modifier r0 = X.AnonymousClass7Kq.A08(r0, r6)
            androidx.compose.ui.Modifier r0 = X.C115656vh.A00(r0, r10)
            X.C120767Cj.A01(r13, r0, r1)
            goto L_0x0050
        L_0x0087:
            if (r3 == 0) goto L_0x008b
            X.7Wm r5 = androidx.compose.ui.Modifier.A00
        L_0x008b:
            r0 = r17 & 2
            if (r0 == 0) goto L_0x0091
            float r6 = A00
        L_0x0091:
            r0 = r17 & 4
            if (r0 == 0) goto L_0x0070
            X.534 r0 = X.AnonymousClass6WZ.A00
            long r10 = X.C147188nY.A0R(r13, r0)
            goto L_0x0070
        L_0x009c:
            r0 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0041
            int r0 = X.C147188nY.A0I(r13, r12)
            r2 = r2 | r0
            goto L_0x0041
        L_0x00a6:
            r0 = r16 & 14
            if (r0 != 0) goto L_0x00b2
            int r2 = X.C147188nY.A0F(r13, r14)
            r2 = r2 | r16
            goto L_0x0014
        L_0x00b2:
            r2 = r7
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78U.A01(X.8nY, androidx.compose.ui.Modifier, float, int, int, long):void");
    }
}
