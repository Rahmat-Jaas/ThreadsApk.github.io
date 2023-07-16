package X;

/* renamed from: X.6EX  reason: invalid class name */
public final class AnonymousClass6EX {
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        if (r0 != 1) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ae, code lost:
        if (r0 != 1) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b3, code lost:
        if (r3.A04 != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ba, code lost:
        if (r3.A04 != false) goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e4 A[EDGE_INSN: B:63:0x00e4->B:55:0x00e4 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C875353d r9, X.AnonymousClass0YY r10, int r11) {
        /*
            r2 = 0
            X.6bM r0 = X.C102786Wn.A00
            java.lang.Object r3 = r9.AbB(r0)
            X.8cy r3 = (X.C141798cy) r3
            if (r3 == 0) goto L_0x0100
            r0 = 5
            if (r11 != r0) goto L_0x00bf
            r9 = 5
        L_0x000f:
            X.7YE r3 = (X.AnonymousClass7YE) r3
            X.8cj r0 = r3.A02
            X.7VU r0 = (X.AnonymousClass7VU) r0
            androidx.compose.foundation.lazy.LazyListState r8 = r0.A00
            X.8nU r0 = r8.A02()
            int r0 = r0.BHd()
            if (r0 <= 0) goto L_0x00f2
            java.util.List r0 = X.C147158nU.A00(r8)
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x00f2
            X.0MJ r7 = X.C86144wL.A17()
            X.6b4 r5 = r3.A01
            int r4 = r8.A00()
            java.util.List r0 = X.C147158nU.A00(r8)
            java.lang.Object r0 = X.AnonymousClass00J.A0E(r0)
            X.8cc r0 = (X.AnonymousClass8cc) r0
            X.7VH r0 = (X.AnonymousClass7VH) r0
            int r1 = r0.A00
            X.6tN r0 = new X.6tN
            r0.<init>(r4, r1)
            X.84X r6 = r5.A00
            r6.A0C(r0)
            r7.A00 = r0
            r1 = 0
        L_0x0050:
            java.lang.Object r0 = r7.A00
            X.6tN r0 = (X.C114486tN) r0
            boolean r0 = X.AnonymousClass7YE.A00(r0, r3, r9)
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r0 = r7.A00
            X.6tN r0 = (X.C114486tN) r0
            int r5 = r0.A01
            int r4 = r0.A00
            r0 = 1
            if (r9 == r0) goto L_0x00b5
            r0 = 2
            if (r9 == r0) goto L_0x00bc
            r0 = 5
            if (r9 == r0) goto L_0x00b8
            r0 = 6
            if (r9 == r0) goto L_0x00b1
            r0 = 3
            boolean r0 = X.AnonymousClass0wJ.A1T(r9, r0)
            r1 = 1
            if (r0 == 0) goto L_0x00a3
            X.69J r0 = r3.A03
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x00b8
            if (r0 == r1) goto L_0x00b1
        L_0x0080:
            X.6tN r1 = new X.6tN
            r1.<init>(r5, r4)
            r6.A0C(r1)
            java.lang.Object r0 = r7.A00
            X.C04220Ms.A0B(r0, r2)
            r6.A0E(r0)
            r7.A00 = r1
            X.8pE r0 = r8.A0I
            X.C86134wK.A1B(r0)
            X.7XQ r0 = new X.7XQ
            r0.<init>(r3, r7, r9)
            java.lang.Object r1 = r10.invoke(r0)
            if (r1 != 0) goto L_0x00e4
            goto L_0x0050
        L_0x00a3:
            r0 = 4
            if (r9 != r0) goto L_0x00dd
            X.69J r0 = r3.A03
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x00b1
            if (r0 == r1) goto L_0x00b8
            goto L_0x0080
        L_0x00b1:
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x00bc
        L_0x00b5:
            int r5 = r5 + -1
            goto L_0x0080
        L_0x00b8:
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x00b5
        L_0x00bc:
            int r4 = r4 + 1
            goto L_0x0080
        L_0x00bf:
            r0 = 6
            if (r11 != r0) goto L_0x00c5
            r9 = 6
            goto L_0x000f
        L_0x00c5:
            r0 = 3
            if (r11 != r0) goto L_0x00cb
            r9 = 3
            goto L_0x000f
        L_0x00cb:
            r0 = 4
            if (r11 != r0) goto L_0x00d1
            r9 = 4
            goto L_0x000f
        L_0x00d1:
            r0 = 1
            if (r11 != r0) goto L_0x00d7
            r9 = 2
            goto L_0x000f
        L_0x00d7:
            r0 = 2
            if (r11 != r0) goto L_0x00f9
            r9 = 1
            goto L_0x000f
        L_0x00dd:
            java.lang.String r0 = "Lazy list does not support beyond bounds layout for the specified direction"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00e4:
            java.lang.Object r0 = r7.A00
            X.C04220Ms.A0B(r0, r2)
            r6.A0E(r0)
            X.8pE r0 = r8.A0I
            X.C86134wK.A1B(r0)
            return r1
        L_0x00f2:
            X.7XP r0 = X.AnonymousClass7YE.A05
            java.lang.Object r1 = r10.invoke(r0)
            return r1
        L_0x00f9:
            java.lang.String r0 = "Unsupported direction for beyond bounds layout"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0100:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6EX.A00(X.53d, X.0YY, int):java.lang.Object");
    }
}
