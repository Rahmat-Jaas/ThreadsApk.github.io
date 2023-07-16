package X;

/* renamed from: X.6rz  reason: invalid class name and case insensitive filesystem */
public final class C113696rz {
    public int A00 = 0;
    public C112446pb A01;
    public Object[] A02 = new Object[8];

    public final AnonymousClass84U A00() {
        C112446pb r0 = this.A01;
        if (r0 == null) {
            AnonymousClass5qY A002 = AnonymousClass5qY.A00(this, this.A02, this.A00);
            r0 = this.A01;
            if (r0 == null) {
                return A002;
            }
        }
        throw r0.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = java.lang.Integer.highestOneBit(r3 - 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.A00
            int r3 = r0 + 1
            int r3 = r3 + r3
            java.lang.Object[] r2 = r4.A02
            int r1 = r2.length
            if (r3 <= r1) goto L_0x0023
            int r0 = r1 >> 1
            int r1 = r1 + r0
            int r0 = r1 + 1
            if (r0 >= r3) goto L_0x001d
            int r0 = r3 + -1
            int r0 = java.lang.Integer.highestOneBit(r0)
            int r0 = r0 + r0
            if (r0 >= 0) goto L_0x001d
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x001d:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            r4.A02 = r0
        L_0x0023:
            X.AnonymousClass6J8.A00(r5, r6)
            java.lang.Object[] r2 = r4.A02
            int r1 = r4.A00
            int r0 = r1 + r1
            r2[r0] = r5
            int r0 = r0 + 1
            r2[r0] = r6
            int r0 = r1 + 1
            r4.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113696rz.A01(java.lang.Object, java.lang.Object):void");
    }
}
