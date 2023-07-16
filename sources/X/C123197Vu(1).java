package X;

/* renamed from: X.7Vu  reason: invalid class name and case insensitive filesystem */
public final class C123197Vu implements C145708kx {
    public int A00 = -1;
    public AnonymousClass7AW A01;
    public final long A02;
    public final AnonymousClass0ZU A03;
    public final AnonymousClass0ZU A04;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (((float) X.C86104wH.A08(r6.A02)) < r4.A00) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized int A00(X.C123197Vu r5, X.AnonymousClass7AW r6) {
        /*
            monitor-enter(r5)
            X.7AW r0 = r5.A01     // Catch:{ all -> 0x004a }
            if (r0 == r6) goto L_0x0046
            X.7EK r4 = r6.A03     // Catch:{ all -> 0x004a }
            boolean r2 = r4.A06     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0019
            long r0 = r6.A02     // Catch:{ all -> 0x004a }
            int r0 = X.C86104wH.A08(r0)     // Catch:{ all -> 0x004a }
            float r1 = (float) r0     // Catch:{ all -> 0x004a }
            float r0 = r4.A00     // Catch:{ all -> 0x004a }
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            r3 = 1
            if (r0 == 0) goto L_0x003b
            if (r2 != 0) goto L_0x003b
            long r0 = r6.A02     // Catch:{ all -> 0x004a }
            int r0 = X.C86104wH.A08(r0)     // Catch:{ all -> 0x004a }
            float r2 = (float) r0     // Catch:{ all -> 0x004a }
            int r1 = r6.A03(r2)     // Catch:{ all -> 0x004a }
            int r0 = r4.A02     // Catch:{ all -> 0x004a }
            int r0 = r0 - r3
            if (r1 <= r0) goto L_0x0030
            r1 = r0
        L_0x0030:
            float r0 = r6.A02(r1)     // Catch:{ all -> 0x004a }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            int r1 = r1 + -1
            goto L_0x0030
        L_0x003b:
            int r1 = r4.A02     // Catch:{ all -> 0x004a }
            int r1 = r1 - r3
        L_0x003e:
            int r0 = r6.A06(r1, r3)     // Catch:{ all -> 0x004a }
            r5.A00 = r0     // Catch:{ all -> 0x004a }
            r5.A01 = r6     // Catch:{ all -> 0x004a }
        L_0x0046:
            int r0 = r5.A00     // Catch:{ all -> 0x004a }
            monitor-exit(r5)
            return r0
        L_0x004a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C123197Vu.A00(X.7Vu, X.7AW):int");
    }

    public final long AlH(C114886u3 r7, boolean z) {
        AnonymousClass7AW r3;
        C114876u2 r0;
        if (!z ? r7.A00.A01 == this.A02 : r7.A01.A01 == this.A02) {
            if (!(Ard() == null || (r3 = (AnonymousClass7AW) this.A03.invoke()) == null)) {
                if (z) {
                    r0 = r7.A01;
                } else {
                    r0 = r7.A00;
                }
                int A022 = AnonymousClass8bI.A02(r0.A00, 0, A00(this, r3));
                return C86104wH.A0C(AnonymousClass6EA.A00(r3, A022, z, r7.A02), r3.A01(r3.A04(A022)));
            }
        }
        return AnonymousClass7KC.A03;
    }

    public final AnonymousClass7F6 AU5(int i) {
        int length;
        AnonymousClass7AW r3 = (AnonymousClass7AW) this.A03.invoke();
        if (r3 == null || (length = r3.A04.A03.length()) < 1) {
            return AnonymousClass7F6.A04;
        }
        return r3.A09(AnonymousClass8bI.A02(i, 0, length - 1));
    }

    public final C146508mM Ard() {
        C146508mM r1 = (C146508mM) this.A04.invoke();
        if (r1 == null || !r1.BRS()) {
            return null;
        }
        return r1;
    }

    public C123197Vu(AnonymousClass0ZU r2, AnonymousClass0ZU r3, long j) {
        this.A02 = j;
        this.A04 = r2;
        this.A03 = r3;
    }
}
