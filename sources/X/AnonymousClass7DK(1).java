package X;

/* renamed from: X.7DK  reason: invalid class name */
public final class AnonymousClass7DK {
    public static final C41212LzK[] A01 = new C41212LzK[0];
    public final C41169Ly7 A00 = new C41169Ly7();

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C134767yJ A00(X.C134767yJ r13) {
        /*
            r12 = 0
            r1 = 0
        L_0x0002:
            int[] r6 = r13.A03
            int r5 = r6.length
            if (r1 >= r5) goto L_0x000e
            r0 = r6[r1]
            if (r0 != 0) goto L_0x000e
            int r1 = r1 + 1
            goto L_0x0002
        L_0x000e:
            if (r1 != r5) goto L_0x001c
            r7 = 0
        L_0x0011:
            r11 = 1
            int r5 = r5 - r11
        L_0x0013:
            if (r5 < 0) goto L_0x0046
            r4 = r6[r5]
            if (r4 != 0) goto L_0x0036
            int r5 = r5 + -1
            goto L_0x0013
        L_0x001c:
            int r0 = r13.A01
            int r4 = r1 / r0
            int r0 = r1 % r0
            int r3 = r0 << 5
            r2 = r6[r1]
            r1 = 0
        L_0x0027:
            int r0 = 31 - r1
            int r0 = r2 << r0
            if (r0 != 0) goto L_0x0030
            int r1 = r1 + 1
            goto L_0x0027
        L_0x0030:
            int r3 = r3 + r1
            int[] r7 = new int[]{r3, r4}
            goto L_0x0011
        L_0x0036:
            int r0 = r13.A01
            int r3 = r5 / r0
            int r5 = r5 % r0
            int r2 = r5 << 5
            r1 = 31
        L_0x003f:
            int r0 = r4 >>> r1
            if (r0 != 0) goto L_0x0048
            int r1 = r1 + -1
            goto L_0x003f
        L_0x0046:
            r10 = 0
            goto L_0x004d
        L_0x0048:
            int r2 = r2 + r1
            int[] r10 = new int[]{r2, r3}
        L_0x004d:
            if (r7 == 0) goto L_0x00e6
            if (r10 == 0) goto L_0x00e6
            int r6 = r13.A00
            int r5 = r13.A02
            r4 = r7[r12]
            r9 = r4
            r3 = 1
            r2 = r7[r11]
            r8 = r2
            r1 = 0
        L_0x005d:
            if (r4 >= r5) goto L_0x0073
            if (r2 >= r6) goto L_0x0073
            boolean r0 = r13.A03(r4, r2)
            if (r3 == r0) goto L_0x006e
            int r1 = r1 + 1
            r0 = 5
            if (r1 == r0) goto L_0x0073
            r3 = r3 ^ 1
        L_0x006e:
            int r4 = r4 + 1
            int r2 = r2 + 1
            goto L_0x005d
        L_0x0073:
            if (r4 == r5) goto L_0x00e6
            if (r2 == r6) goto L_0x00e6
            int r4 = r4 - r9
            float r7 = (float) r4
            r0 = 1088421888(0x40e00000, float:7.0)
            float r7 = r7 / r0
            r2 = r10[r11]
            r3 = r10[r12]
            if (r9 >= r3) goto L_0x00e6
            if (r8 >= r2) goto L_0x00e6
            int r1 = r2 - r8
            int r0 = r3 - r9
            if (r1 == r0) goto L_0x008e
            int r3 = r9 + r1
            if (r3 >= r5) goto L_0x00e6
        L_0x008e:
            int r0 = r3 - r9
            int r0 = r0 + 1
            float r0 = (float) r0
            float r0 = r0 / r7
            int r6 = java.lang.Math.round(r0)
            int r0 = r1 + 1
            float r0 = (float) r0
            float r0 = r0 / r7
            int r5 = java.lang.Math.round(r0)
            if (r6 <= 0) goto L_0x00e6
            if (r5 <= 0) goto L_0x00e6
            if (r5 != r6) goto L_0x00e6
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r7 / r0
            int r1 = (int) r0
            int r8 = r8 + r1
            int r9 = r9 + r1
            int r0 = r6 + -1
            float r0 = (float) r0
            float r0 = r0 * r7
            int r0 = (int) r0
            int r0 = r0 + r9
            int r0 = r0 - r3
            if (r0 <= 0) goto L_0x00b9
            if (r0 > r1) goto L_0x00e6
            int r9 = r9 - r0
        L_0x00b9:
            int r0 = r5 + -1
            float r0 = (float) r0
            float r0 = r0 * r7
            int r0 = (int) r0
            int r0 = r0 + r8
            int r0 = r0 - r2
            if (r0 <= 0) goto L_0x00c5
            if (r0 > r1) goto L_0x00e6
            int r8 = r8 - r0
        L_0x00c5:
            X.7yJ r4 = new X.7yJ
            r4.<init>(r6, r5)
            r3 = 0
        L_0x00cb:
            float r0 = (float) r3
            float r0 = r0 * r7
            int r2 = (int) r0
            int r2 = r2 + r8
            r1 = 0
        L_0x00d0:
            float r0 = (float) r1
            float r0 = r0 * r7
            int r0 = (int) r0
            int r0 = r0 + r9
            boolean r0 = r13.A03(r0, r2)
            if (r0 == 0) goto L_0x00dd
            r4.A01(r1, r3)
        L_0x00dd:
            int r1 = r1 + 1
            if (r1 < r6) goto L_0x00d0
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x00cb
            return r4
        L_0x00e6:
            X.LXG r0 = X.LXG.A00
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7DK.A00(X.7yJ):X.7yJ");
    }
}
