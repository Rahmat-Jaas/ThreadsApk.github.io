package X;

/* renamed from: X.53E  reason: invalid class name */
public final class AnonymousClass53E extends AnonymousClass53I {
    public final boolean A00;
    public final AnonymousClass53I A01;
    public final AnonymousClass0YY A02;
    public final AnonymousClass0YY A03;
    public final boolean A04;

    public final void A0A() {
        AnonymousClass53I r0;
        this.A01 = true;
        if (this.A04 && (r0 = this.A01) != null) {
            r0.A0A();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r6.A05;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass53E(X.AnonymousClass53I r6, X.AnonymousClass0YY r7, X.AnonymousClass0YY r8, boolean r9, boolean r10) {
        /*
            r5 = this;
            X.7yd r4 = X.C134947yd.A04
            if (r6 == 0) goto L_0x0008
            X.0YY r0 = r6.A05
            if (r0 != 0) goto L_0x0012
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference r0 = X.C122127Kl.A07
            java.lang.Object r0 = r0.get()
            X.53I r0 = (X.AnonymousClass53I) r0
            X.0YY r0 = r0.A05
        L_0x0012:
            if (r9 != 0) goto L_0x0015
            r0 = 0
        L_0x0015:
            X.0YY r3 = X.AnonymousClass53I.A01(r7, r0, r7)
            if (r6 == 0) goto L_0x001f
            X.0YY r2 = r6.A06
            if (r2 != 0) goto L_0x0029
        L_0x001f:
            java.util.concurrent.atomic.AtomicReference r0 = X.C122127Kl.A07
            java.lang.Object r0 = r0.get()
            X.53I r0 = (X.AnonymousClass53I) r0
            X.0YY r2 = r0.A06
        L_0x0029:
            r1 = r8
            if (r8 == 0) goto L_0x0049
            if (r2 == 0) goto L_0x003a
            boolean r0 = r8.equals(r2)
            if (r0 != 0) goto L_0x003a
            r0 = 5
            kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1 r1 = new kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1
            r1.<init>((X.AnonymousClass0YY) r8, (X.AnonymousClass0YY) r2, (int) r0)
        L_0x003a:
            r0 = 0
            r5.<init>(r4, r3, r1, r0)
            r5.A01 = r6
            r5.A02 = r7
            r5.A03 = r8
            r5.A00 = r9
            r5.A04 = r10
            return
        L_0x0049:
            r1 = r2
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass53E.<init>(X.53I, X.0YY, X.0YY, boolean, boolean):void");
    }

    public static final AnonymousClass53I A00(AnonymousClass53E r0) {
        AnonymousClass53I r02 = r0.A01;
        if (r02 == null) {
            return (AnonymousClass53I) C86154wM.A0e(C122127Kl.A07);
        }
        return r02;
    }
}
