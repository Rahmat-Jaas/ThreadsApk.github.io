package X;

/* renamed from: X.77H  reason: invalid class name */
public final class AnonymousClass77H {
    public static final AnonymousClass77H A00 = new AnonymousClass77H();

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e4, code lost:
        if (r6 != 0) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f0, code lost:
        if (r4 != 0) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f3, code lost:
        r6 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C110746mC A00(android.content.Context r15, X.C127397h3 r16) {
        /*
            r14 = this;
            r0 = 94
            r1 = r16
            X.7h3 r9 = r1.A0K(r0)
            if (r9 == 0) goto L_0x0110
            int r10 = X.C101116Py.A00(r1)
            int r1 = r9.A03
            r0 = 16373(0x3ff5, float:2.2943E-41)
            if (r1 == r0) goto L_0x005a
            r0 = 16483(0x4063, float:2.3098E-41)
            if (r1 != r0) goto L_0x0105
            java.lang.Integer r0 = X.AnonymousClass006.A01
        L_0x001a:
            int r3 = r0.intValue()
            r0 = 0
            r1 = 41
            if (r3 == r0) goto L_0x0025
            r1 = 40
        L_0x0025:
            r0 = -1
            int r11 = r9.A0H(r1, r0)
            if (r11 == r0) goto L_0x00fe
            r1 = 36
            r4 = 1
            r2 = 0
            if (r3 == r2) goto L_0x004f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r0 = 35
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x003c:
            int r0 = r5.intValue()
            int r8 = r1.intValue()
            android.util.SparseArray r7 = r9.A04
            java.lang.String r1 = X.C86114wI.A0m(r7, r0)
            r6 = 0
            r0 = 0
            if (r1 == 0) goto L_0x0061
            goto L_0x005d
        L_0x004f:
            r0 = 38
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x003c
        L_0x005a:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            goto L_0x001a
        L_0x005d:
            float r0 = X.AnonymousClass7Kk.A01(r1)     // Catch:{ 1zB -> 0x0063 }
        L_0x0061:
            int r5 = (int) r0     // Catch:{ 1zB -> 0x0063 }
            goto L_0x006f
        L_0x0063:
            java.lang.String r0 = "Invalid pixel format for grid spacing "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r1)
            java.lang.String r0 = "GridCommonUtils"
            X.C30967GcS.A02(r0, r1)
            int r5 = (int) r6
        L_0x006f:
            java.lang.String r1 = X.C86114wI.A0m(r7, r8)
            r0 = 0
            if (r1 == 0) goto L_0x007a
            float r0 = X.AnonymousClass7Kk.A01(r1)     // Catch:{ 1zB -> 0x007c }
        L_0x007a:
            int r0 = (int) r0     // Catch:{ 1zB -> 0x007c }
            goto L_0x0088
        L_0x007c:
            java.lang.String r0 = "Invalid pixel format for grid spacing "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r1)
            java.lang.String r0 = "GridCommonUtils"
            X.C30967GcS.A02(r0, r1)
            int r0 = (int) r6
        L_0x0088:
            if (r10 != r4) goto L_0x00f5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L_0x0092:
            int r12 = r1.intValue()
            int r13 = r0.intValue()
            r0 = 40
            if (r3 == r2) goto L_0x00a0
            r0 = 38
        L_0x00a0:
            X.7h3 r1 = r9.A0K(r0)
            if (r1 != 0) goto L_0x00b0
            android.graphics.Rect r8 = X.C86134wK.A0D()
        L_0x00aa:
            X.6mC r7 = new X.6mC
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x00b0:
            r0 = 42
            float r0 = X.AnonymousClass6Q2.A00(r1, r0)
            int r6 = (int) r0
            r0 = 40
            float r0 = X.AnonymousClass6Q2.A00(r1, r0)
            int r5 = (int) r0
            r0 = 41
            float r0 = X.AnonymousClass6Q2.A00(r1, r0)
            int r4 = (int) r0
            r0 = 35
            float r0 = X.AnonymousClass6Q2.A00(r1, r0)
            int r3 = (int) r0
            r0 = 36
            float r0 = X.AnonymousClass6Q2.A00(r1, r0)
            int r2 = (int) r0
            r0 = 38
            float r0 = X.AnonymousClass6Q2.A00(r1, r0)
            int r1 = (int) r0
            boolean r0 = X.AnonymousClass6Q3.A00(r15)
            if (r0 == 0) goto L_0x00eb
            r0 = r4
            if (r4 != 0) goto L_0x00e4
            r0 = r2
        L_0x00e4:
            if (r6 == 0) goto L_0x00f3
        L_0x00e6:
            android.graphics.Rect r8 = X.C86164wN.A0F(r0, r5, r6, r3)
            goto L_0x00aa
        L_0x00eb:
            r0 = r6
            if (r6 != 0) goto L_0x00ef
            r0 = r2
        L_0x00ef:
            r6 = r4
            if (r4 == 0) goto L_0x00f3
            goto L_0x00e6
        L_0x00f3:
            r6 = r1
            goto L_0x00e6
        L_0x00f5:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0092
        L_0x00fe:
            java.lang.String r0 = "GridCommonUtils: span-count is required for grids"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0105:
            java.lang.String r0 = "GridCommonUtils: Grid type is unknown for style "
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r1)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0110:
            java.lang.String r0 = "GridCommonUtils: grid layout config should be defined"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass77H.A00(android.content.Context, X.7h3):X.6mC");
    }
}
