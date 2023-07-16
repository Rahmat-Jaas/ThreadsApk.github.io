package X;

/* renamed from: X.6pM  reason: invalid class name and case insensitive filesystem */
public final class C112306pM {
    public int A00;
    public int[] A01 = new int[4];
    public Object[] A02 = new Object[4];

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r2 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r2 >= r7) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        r0 = r4[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r0 == r10) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (java.lang.System.identityHashCode(r0) != r6) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        r2 = -(r2 + 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(java.lang.Object r10, int r11) {
        /*
            r9 = this;
            int r7 = r9.A00
            r3 = -1
            if (r7 <= 0) goto L_0x0056
            int r8 = r7 + -1
            int r6 = java.lang.System.identityHashCode(r10)
            r2 = 0
        L_0x000c:
            if (r2 > r8) goto L_0x004a
            int r0 = r2 + r8
            int r5 = r0 >>> 1
            java.lang.Object[] r4 = r9.A02
            r1 = r4[r5]
            int r0 = java.lang.System.identityHashCode(r1)
            if (r0 >= r6) goto L_0x001f
            int r2 = r5 + 1
            goto L_0x000c
        L_0x001f:
            if (r0 <= r6) goto L_0x0024
            int r8 = r5 + -1
            goto L_0x000c
        L_0x0024:
            if (r1 != r10) goto L_0x0028
            r2 = r5
            goto L_0x004d
        L_0x0028:
            int r2 = r5 + -1
        L_0x002a:
            if (r3 >= r2) goto L_0x0038
            r0 = r4[r2]
            if (r0 == r10) goto L_0x004d
            int r0 = java.lang.System.identityHashCode(r0)
            int r2 = r2 + -1
            if (r0 == r6) goto L_0x002a
        L_0x0038:
            int r2 = r5 + 1
        L_0x003a:
            if (r2 >= r7) goto L_0x0049
            r0 = r4[r2]
            if (r0 == r10) goto L_0x004d
            int r0 = java.lang.System.identityHashCode(r0)
            if (r0 != r6) goto L_0x004a
            int r2 = r2 + 1
            goto L_0x003a
        L_0x0049:
            r2 = r7
        L_0x004a:
            int r0 = r2 + 1
            int r2 = -r0
        L_0x004d:
            if (r2 < 0) goto L_0x0057
            int[] r1 = r9.A01
            r0 = r1[r2]
            r1[r2] = r11
            return r0
        L_0x0056:
            r2 = -1
        L_0x0057:
            int r0 = r2 + 1
            int r4 = -r0
            java.lang.Object[] r1 = r9.A02
            int r0 = r1.length
            if (r7 != r0) goto L_0x0091
            int r0 = r0 << 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            int[] r5 = new int[r0]
            int r2 = r4 + 1
            int r7 = r7 - r4
            java.lang.System.arraycopy(r1, r4, r6, r2, r7)
            int[] r1 = r9.A01
            int r0 = r9.A00
            int r0 = r0 - r4
            java.lang.System.arraycopy(r1, r4, r5, r2, r0)
            java.lang.Object[] r0 = r9.A02
            r1 = 0
            X.AnonymousClass8AQ.A0G(r0, r6, r1, r1, r4)
            int[] r0 = r9.A01
            java.lang.System.arraycopy(r0, r1, r5, r1, r4)
            r9.A02 = r6
            r9.A01 = r5
        L_0x0082:
            java.lang.Object[] r0 = r9.A02
            r0[r4] = r10
            int[] r0 = r9.A01
            r0[r4] = r11
            int r0 = r9.A00
            int r0 = r0 + 1
            r9.A00 = r0
            return r3
        L_0x0091:
            int r2 = r4 + 1
            int r7 = r7 - r4
            java.lang.System.arraycopy(r1, r4, r1, r2, r7)
            int[] r1 = r9.A01
            int r0 = r9.A00
            int r0 = r0 - r4
            java.lang.System.arraycopy(r1, r4, r1, r2, r0)
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112306pM.A00(java.lang.Object, int):int");
    }
}
