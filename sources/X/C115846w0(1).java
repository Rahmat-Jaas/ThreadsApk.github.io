package X;

/* renamed from: X.6w0  reason: invalid class name and case insensitive filesystem */
public final class C115846w0 {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    public static final X.C142898fm A00(X.C147698pl r7) {
        /*
            r5 = 0
            X.C04220Ms.A0B(r7, r5)
            r6 = 1024(0x400, float:1.435E-42)
            X.7YG r7 = (X.AnonymousClass7YG) r7
            X.7YG r1 = r7.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0050
            r0 = 16
            X.7YG[] r0 = new X.AnonymousClass7YG[r0]
            X.84X r4 = X.AnonymousClass84X.A01(r0)
            X.7YG r0 = r1.A02
            if (r0 == 0) goto L_0x002b
            r4.A0C(r0)
        L_0x001d:
            int r0 = r4.A00
            if (r0 == 0) goto L_0x004d
            r3 = 1
            X.7YG r1 = X.AnonymousClass84X.A02(r4, r0)
            int r0 = r1.A00
            r0 = r0 & r6
            if (r0 != 0) goto L_0x002f
        L_0x002b:
            X.C121847Ik.A05(r4, r1)
            goto L_0x001d
        L_0x002f:
            int r0 = r1.A01
            r0 = r0 & r6
            if (r0 == 0) goto L_0x0048
            boolean r0 = r1 instanceof X.C875353d
            if (r0 == 0) goto L_0x001d
            X.53d r1 = (X.C875353d) r1
            X.6Av r2 = r1.A00
            int r1 = r2.ordinal()
            if (r1 == r5) goto L_0x004f
            if (r1 == r3) goto L_0x004f
            r0 = 2
            if (r1 == r0) goto L_0x004f
            goto L_0x001d
        L_0x0048:
            X.7YG r1 = r1.A02
            if (r1 == 0) goto L_0x001d
            goto L_0x002f
        L_0x004d:
            X.6Av r2 = X.AnonymousClass6Av.Inactive
        L_0x004f:
            return r2
        L_0x0050:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115846w0.A00(X.8pl):X.8fm");
    }

    public static final void A01(C875353d r7) {
        AnonymousClass7YG r1 = r7.A03;
        if (r1.A08) {
            AnonymousClass7YG r3 = r1.A04;
            AnonymousClass7Y3 A01 = C121847Ik.A01(r7);
            while (true) {
                if ((A01.A0a.A02.A00 & 5120) != 0) {
                    while (r3 != null) {
                        int i = r3.A01;
                        if ((i & 5120) != 0) {
                            if ((1024 & i) != 0) {
                                return;
                            }
                            if (r3 instanceof C147698pl) {
                                C147698pl r12 = (C147698pl) r3;
                                r12.Bzc(A00(r12));
                            } else {
                                throw C18180wK.A0a("Check failed.");
                            }
                        }
                        r3 = r3.A04;
                    }
                }
                A01 = A01.A09();
                if (A01 != null) {
                    AnonymousClass7IW r0 = A01.A0a;
                    if (r0 != null) {
                        r3 = r0.A05;
                    } else {
                        r3 = null;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw C18180wK.A0a("Check failed.");
        }
    }
}
