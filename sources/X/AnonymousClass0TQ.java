package X;

/* renamed from: X.0TQ  reason: invalid class name */
public final class AnonymousClass0TQ implements AnonymousClass09H {
    public static final int[] A02 = {0, 1, 2, 2, 3, 3, 3, 3};
    public static final boolean[] A03 = {true, true, true, false, true, false, false, false};
    public int A00;
    public int A01 = 0;

    public AnonymousClass0TQ(int i) {
        this.A00 = i + 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        if (r1 == 255) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int ADW(byte[] r13, int r14, int r15) {
        /*
            r12 = this;
            int r1 = r14 + -1
            int r15 = r15 + r14
            int r4 = r15 + -5
            r3 = r14
        L_0x0006:
            r0 = 0
            r11 = 1
            if (r3 > r4) goto L_0x00a8
            byte r2 = r13[r3]
            r5 = r2 & 254(0xfe, float:3.56E-43)
            r2 = 232(0xe8, float:3.25E-43)
            if (r5 != r2) goto L_0x00a4
            int r2 = r3 - r1
            r1 = r2 & -4
            if (r1 == 0) goto L_0x0063
            r12.A01 = r0
            r2 = 0
        L_0x001b:
            int r10 = r3 + 4
            byte r0 = r13[r10]
            r6 = 255(0xff, float:3.57E-43)
            r0 = r0 & r6
            if (r0 == 0) goto L_0x0026
            if (r0 != r6) goto L_0x0084
        L_0x0026:
            int r9 = r3 + 1
            byte r0 = r13[r9]
            r5 = r0 & 255(0xff, float:3.57E-43)
            int r8 = r3 + 2
            byte r0 = r13[r8]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r5 = r5 | r0
            int r7 = r3 + 3
            byte r0 = r13[r7]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            r5 = r5 | r0
            byte r0 = r13[r10]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r5 = r5 | r0
        L_0x0045:
            int r0 = r12.A00
            int r0 = r0 + r3
            int r0 = r0 - r14
            int r5 = r5 - r0
            if (r2 == 0) goto L_0x008b
            int[] r0 = A02
            r0 = r0[r2]
            int r1 = r0 << 3
            int r0 = 24 - r1
            int r0 = r5 >>> r0
            byte r0 = (byte) r0
            r0 = r0 & r6
            if (r0 == 0) goto L_0x005c
            if (r0 != r6) goto L_0x008b
        L_0x005c:
            int r0 = 32 - r1
            int r0 = r11 << r0
            int r0 = r0 - r11
            r5 = r5 ^ r0
            goto L_0x0045
        L_0x0063:
            int r1 = r12.A01
            int r0 = r2 + -1
            int r1 = r1 << r0
            r2 = r1 & 7
            r12.A01 = r2
            if (r2 == 0) goto L_0x001b
            boolean[] r0 = A03
            boolean r0 = r0[r2]
            if (r0 == 0) goto L_0x0084
            int r1 = r3 + 4
            int[] r0 = A02
            r0 = r0[r2]
            int r1 = r1 - r0
            byte r1 = r13[r1]
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0084
            if (r1 != r0) goto L_0x001b
        L_0x0084:
            int r2 = r2 << r11
            r0 = r2 | 1
            r12.A01 = r0
            r1 = r3
            goto L_0x00a4
        L_0x008b:
            byte r0 = (byte) r5
            r13[r9] = r0
            int r0 = r5 >>> 8
            byte r0 = (byte) r0
            r13[r8] = r0
            int r0 = r5 >>> 16
            byte r0 = (byte) r0
            r13[r7] = r0
            int r0 = r5 >>> 24
            r0 = r0 & 1
            int r0 = r0 - r11
            r0 = r0 ^ -1
            byte r0 = (byte) r0
            r13[r10] = r0
            r1 = r3
            r3 = r10
        L_0x00a4:
            int r3 = r3 + 1
            goto L_0x0006
        L_0x00a8:
            int r2 = r3 - r1
            r1 = r2 & -4
            if (r1 != 0) goto L_0x00b2
            int r0 = r12.A01
            int r2 = r2 - r11
            int r0 = r0 << r2
        L_0x00b2:
            r12.A01 = r0
            int r3 = r3 - r14
            int r0 = r12.A00
            int r0 = r0 + r3
            r12.A00 = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0TQ.ADW(byte[], int, int):int");
    }
}
