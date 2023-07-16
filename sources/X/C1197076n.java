package X;

/* renamed from: X.76n  reason: invalid class name and case insensitive filesystem */
public final class C1197076n {
    public boolean A00;
    public final AnonymousClass84X A01 = AnonymousClass84X.A01(new AnonymousClass53X[16]);
    public final AnonymousClass84X A02 = AnonymousClass84X.A01(new C104176bM[16]);
    public final AnonymousClass84X A03 = AnonymousClass84X.A01(new AnonymousClass7Y3[16]);
    public final AnonymousClass84X A04 = AnonymousClass84X.A01(new C104176bM[16]);
    public final C147098nO A05;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019  */
    public static final void A00(X.AnonymousClass7YG r5, X.C104176bM r6, java.util.Set r7) {
        /*
            X.7YG r5 = r5.A03
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x005f
            r0 = 16
            X.7YG[] r0 = new X.AnonymousClass7YG[r0]
            X.84X r4 = X.AnonymousClass84X.A01(r0)
            X.7YG r0 = r5.A02
            if (r0 == 0) goto L_0x005a
            r4.A0C(r0)
        L_0x0015:
            int r0 = r4.A00
            if (r0 == 0) goto L_0x005e
            X.7YG r5 = X.AnonymousClass84X.A02(r4, r0)
            int r0 = r5.A00
            r0 = r0 & 32
            if (r0 == 0) goto L_0x005a
            r3 = r5
        L_0x0024:
            int r0 = r3.A01
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0055
            boolean r0 = r3 instanceof X.C147628pe
            if (r0 == 0) goto L_0x0055
            r2 = r3
            X.8pe r2 = (X.C147628pe) r2
            boolean r0 = r2 instanceof X.AnonymousClass53X
            if (r0 == 0) goto L_0x0049
            r1 = r2
            X.53X r1 = (X.AnonymousClass53X) r1
            X.8pV r0 = r1.A00
            boolean r0 = r0 instanceof X.C147488pQ
            if (r0 == 0) goto L_0x0049
            java.util.HashSet r0 = r1.A03
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x0049
            r7.add(r2)
        L_0x0049:
            X.6qv r0 = r2.B4y()
            boolean r0 = r0.A01(r6)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0015
        L_0x0055:
            X.7YG r3 = r3.A02
            if (r3 == 0) goto L_0x005a
            goto L_0x0024
        L_0x005a:
            X.C121847Ik.A05(r4, r5)
            goto L_0x0015
        L_0x005e:
            return
        L_0x005f:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1197076n.A00(X.7YG, X.6bM, java.util.Set):void");
    }

    public C1197076n(C147098nO r3) {
        this.A05 = r3;
    }
}
