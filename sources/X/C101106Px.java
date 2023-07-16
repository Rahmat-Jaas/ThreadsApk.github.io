package X;

/* renamed from: X.6Px  reason: invalid class name and case insensitive filesystem */
public final class C101106Px {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r2 == 13336) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C127397h3 A00(X.C145528ke r12, X.C127397h3 r13) {
        /*
            X.7h3 r3 = r12.A8m(r13)
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            r0 = 135(0x87, float:1.89E-43)
            java.lang.Object r0 = X.C127397h3.A0A(r3, r0)
            boolean r11 = X.AnonymousClass0wJ.A1W(r0)
            int r2 = r3.A03
            r1 = 13326(0x340e, float:1.8674E-41)
            if (r2 == r1) goto L_0x001d
            r0 = 13336(0x3418, float:1.8688E-41)
            r10 = 0
            if (r2 != r0) goto L_0x001e
        L_0x001d:
            r10 = 1
        L_0x001e:
            java.util.HashSet r4 = X.C18200wM.A0u()
            if (r2 == r1) goto L_0x007b
            r0 = 13336(0x3418, float:1.8688E-41)
            if (r2 == r0) goto L_0x007b
        L_0x0028:
            X.794 r0 = X.AnonymousClass794.A00()
            X.7H4 r0 = r0.A02
            int[] r6 = r0.A02(r2)
            r5 = 0
        L_0x0033:
            int r0 = r6.length
            if (r5 >= r0) goto L_0x0081
            r0 = r6[r5]
            X.7h3 r0 = r3.A0K(r0)
            if (r0 == 0) goto L_0x0078
            X.7h3 r7 = A00(r12, r0)
            if (r7 == r0) goto L_0x0057
            if (r3 != r13) goto L_0x0050
            r2 = 0
            X.7h3 r3 = new X.7h3
            int r1 = r13.A02
            java.util.List r0 = r13.A07
            r3.<init>(r13, r2, r0, r1)
        L_0x0050:
            r1 = r6[r5]
            android.util.SparseArray r0 = r3.A04
            r0.put(r1, r7)
        L_0x0057:
            int r2 = r7.A00
            r1 = 1
            r0 = r2 & 1
            if (r0 != 0) goto L_0x005f
            r1 = 0
        L_0x005f:
            r11 = r11 | r1
            r0 = r2 & 2
            boolean r0 = X.C18180wK.A1V(r0)
            r10 = r10 | r0
            java.util.Set r1 = r7.A01
            if (r1 != 0) goto L_0x006f
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x006f:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0078
            r4.addAll(r1)
        L_0x0078:
            int r5 = r5 + 1
            goto L_0x0033
        L_0x007b:
            int r0 = r3.A02
            X.C18200wM.A1U(r4, r0)
            goto L_0x0028
        L_0x0081:
            int[] r7 = X.AnonymousClass7H4.A00(r3)
            r6 = 0
        L_0x0086:
            int r0 = r7.length
            if (r6 >= r0) goto L_0x00ea
            r0 = r7[r6]
            java.util.List r8 = r3.A0Q(r0)
            r5 = r8
            r2 = 0
        L_0x0091:
            int r0 = r8.size()
            if (r2 >= r0) goto L_0x00d2
            X.7h3 r0 = X.C86154wM.A0Q(r8, r2)
            if (r0 == 0) goto L_0x00cf
            X.7h3 r9 = A00(r12, r0)
            if (r9 == r0) goto L_0x00ac
            if (r5 != r8) goto L_0x00a9
            java.util.ArrayList r5 = X.C18200wM.A0s(r8)
        L_0x00a9:
            r5.set(r2, r9)
        L_0x00ac:
            int r0 = r9.A00
            r1 = 1
            r0 = r0 & 1
            if (r0 != 0) goto L_0x00b4
            r1 = 0
        L_0x00b4:
            r11 = r11 | r1
            int r0 = r9.A00
            r0 = r0 & 2
            boolean r0 = X.C18180wK.A1V(r0)
            r10 = r10 | r0
            java.util.Set r1 = r9.A01
            if (r1 != 0) goto L_0x00c6
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x00c6:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00cf
            r4.addAll(r1)
        L_0x00cf:
            int r2 = r2 + 1
            goto L_0x0091
        L_0x00d2:
            if (r5 == r8) goto L_0x00e7
            if (r3 != r13) goto L_0x00e0
            r2 = 0
            X.7h3 r3 = new X.7h3
            int r1 = r13.A02
            java.util.List r0 = r13.A07
            r3.<init>(r13, r2, r0, r1)
        L_0x00e0:
            r1 = r7[r6]
            android.util.SparseArray r0 = r3.A04
            r0.put(r1, r5)
        L_0x00e7:
            int r6 = r6 + 1
            goto L_0x0086
        L_0x00ea:
            if (r3 == r13) goto L_0x0100
            int r0 = r3.A00
            r1 = r0 & -2
            if (r11 == 0) goto L_0x00f4
            r1 = r0 | 1
        L_0x00f4:
            r3.A00 = r1
            r0 = r1 & -3
            if (r10 == 0) goto L_0x00fc
            r0 = r1 | 2
        L_0x00fc:
            r3.A00 = r0
            r3.A01 = r4
        L_0x0100:
            r12.CRq(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101106Px.A00(X.8ke, X.7h3):X.7h3");
    }
}
