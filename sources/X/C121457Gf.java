package X;

/* renamed from: X.7Gf  reason: invalid class name and case insensitive filesystem */
public final class C121457Gf {
    public C146508mM A00;
    public C146508mM A01;
    public final AnonymousClass7AW A02;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r3 == null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A01(X.C121457Gf r3, long r4) {
        /*
            X.8mM r2 = r3.A01
            if (r2 == 0) goto L_0x0015
            boolean r0 = r2.BRS()
            if (r0 == 0) goto L_0x004c
            X.8mM r1 = r3.A00
            if (r1 == 0) goto L_0x0015
            r0 = 1
            X.7F6 r3 = r1.Bax(r2, r0)
        L_0x0013:
            if (r3 != 0) goto L_0x0017
        L_0x0015:
            X.7F6 r3 = X.AnonymousClass7F6.A04
        L_0x0017:
            float r0 = X.AnonymousClass7KC.A01(r4)
            float r2 = r3.A01
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x002f
            float r0 = X.AnonymousClass7KC.A01(r4)
            float r2 = r3.A02
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x002f
            float r2 = X.AnonymousClass7KC.A01(r4)
        L_0x002f:
            float r0 = X.AnonymousClass7KC.A02(r4)
            float r1 = r3.A03
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0047
            float r0 = X.AnonymousClass7KC.A02(r4)
            float r1 = r3.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0047
            float r1 = X.AnonymousClass7KC.A02(r4)
        L_0x0047:
            long r0 = X.C86104wH.A0C(r2, r1)
            return r0
        L_0x004c:
            X.7F6 r3 = X.AnonymousClass7F6.A04
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121457Gf.A01(X.7Gf, long):long");
    }

    public static final long A02(C121457Gf r3, long j) {
        C146508mM r1;
        C146508mM r2 = r3.A01;
        if (r2 == null || (r1 = r3.A00) == null || !r2.BRS() || !r1.BRS()) {
            return j;
        }
        return r2.Bay(r1, j);
    }

    public C121457Gf(AnonymousClass7AW r1) {
        this.A02 = r1;
    }

    public static int A00(C121457Gf r0, long j) {
        return r0.A02.A07(A02(r0, j));
    }
}
