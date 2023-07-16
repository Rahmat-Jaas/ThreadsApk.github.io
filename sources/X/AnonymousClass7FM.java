package X;

/* renamed from: X.7FM  reason: invalid class name */
public final class AnonymousClass7FM {
    /* JADX WARNING: CFG modification limit reached, blocks count: 137 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r5 = A00((X.C875353d) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r5 == null) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C875353d A00(X.C875353d r5) {
        /*
            r2 = 0
            X.C04220Ms.A0B(r5, r2)
            X.6Av r0 = r5.A00
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r2) goto L_0x002c
            r4 = 0
            if (r1 == r0) goto L_0x0032
            r0 = 2
            if (r1 == r0) goto L_0x002c
            r0 = 3
            if (r1 == r0) goto L_0x005a
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x001b:
            int r0 = r3.A01
            r0 = r0 & r2
            if (r0 == 0) goto L_0x002d
            boolean r0 = r3 instanceof X.C875353d
            if (r0 == 0) goto L_0x0049
            X.53d r3 = (X.C875353d) r3
            X.53d r5 = A00(r3)
            if (r5 == 0) goto L_0x0049
        L_0x002c:
            return r5
        L_0x002d:
            X.7YG r3 = r3.A02
            if (r3 == 0) goto L_0x0049
            goto L_0x001b
        L_0x0032:
            r2 = 1024(0x400, float:1.435E-42)
            X.7YG r3 = r5.A03
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x005b
            r0 = 16
            X.7YG[] r0 = new X.AnonymousClass7YG[r0]
            X.84X r1 = X.AnonymousClass84X.A01(r0)
            X.7YG r0 = r3.A02
            if (r0 == 0) goto L_0x0056
            r1.A0C(r0)
        L_0x0049:
            int r0 = r1.A00
            if (r0 == 0) goto L_0x005a
            X.7YG r3 = X.AnonymousClass84X.A02(r1, r0)
            int r0 = r3.A00
            r0 = r0 & r2
            if (r0 != 0) goto L_0x001b
        L_0x0056:
            X.C121847Ik.A05(r1, r3)
            goto L_0x0049
        L_0x005a:
            return r4
        L_0x005b:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7FM.A00(X.53d):X.53d");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C875353d A01(X.C875353d r7) {
        /*
            r6 = 0
            X.7YG r7 = r7.A03
            boolean r0 = r7.A08
            r5 = 0
            if (r0 == 0) goto L_0x004a
            r4 = 1024(0x400, float:1.435E-42)
            r0 = 16
            X.7YG[] r0 = new X.AnonymousClass7YG[r0]
            X.84X r3 = X.AnonymousClass84X.A01(r0)
            X.7YG r0 = r7.A02
            if (r0 == 0) goto L_0x0027
            r3.A0C(r0)
        L_0x0019:
            int r0 = r3.A00
            if (r0 == 0) goto L_0x004a
            r2 = 1
            X.7YG r7 = X.AnonymousClass84X.A02(r3, r0)
            int r0 = r7.A00
            r0 = r0 & r4
            if (r0 != 0) goto L_0x002b
        L_0x0027:
            X.C121847Ik.A05(r3, r7)
            goto L_0x0019
        L_0x002b:
            int r0 = r7.A01
            r0 = r0 & r4
            if (r0 == 0) goto L_0x0044
            boolean r0 = r7 instanceof X.C875353d
            if (r0 == 0) goto L_0x0019
            X.53d r7 = (X.C875353d) r7
            X.6Av r0 = r7.A00
            int r1 = r0.ordinal()
            if (r1 == r6) goto L_0x0049
            if (r1 == r2) goto L_0x0049
            r0 = 2
            if (r1 == r0) goto L_0x0049
            goto L_0x0019
        L_0x0044:
            X.7YG r7 = r7.A02
            if (r7 == 0) goto L_0x0019
            goto L_0x002b
        L_0x0049:
            return r7
        L_0x004a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7FM.A01(X.53d):X.53d");
    }

    public static final AnonymousClass7F6 A02(C875353d r3) {
        AnonymousClass7F6 Bax;
        C04220Ms.A0B(r3, 0);
        AnonymousClass54T r1 = r3.A06;
        if (r1 == null || (Bax = C115896w5.A01(r1).Bax(r1, false)) == null) {
            return AnonymousClass7F6.A04;
        }
        return Bax;
    }

    public static final boolean A03(C875353d r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass54T r0 = r2.A06;
        if (r0 == null) {
            return false;
        }
        AnonymousClass7Y3 r1 = r0.A0H;
        if (!r1.A0N || r1.A0A == null) {
            return false;
        }
        return true;
    }
}
