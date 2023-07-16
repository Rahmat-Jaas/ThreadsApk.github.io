package X;

/* renamed from: X.0S6  reason: invalid class name */
public abstract class AnonymousClass0S6 implements Runnable {
    public final Runnable A00;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r3 = (X.C07680bu) r3;
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r1 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r3.A00 = null;
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            r3 = r4
            r2 = r3
            X.0bu r2 = (X.C07680bu) r2     // Catch:{ all -> 0x0022 }
            X.0Ru r1 = r2.A00     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0012
            int r0 = r1.BIZ()     // Catch:{ all -> 0x0022 }
            X.0Ru r0 = X.C07650br.A01(r1, r0)     // Catch:{ all -> 0x0022 }
            r2.A00 = r0     // Catch:{ all -> 0x0022 }
        L_0x0012:
            java.lang.Runnable r0 = r4.A00     // Catch:{ all -> 0x0022 }
            r0.run()     // Catch:{ all -> 0x0022 }
            X.0Ru r1 = r2.A00
            if (r1 == 0) goto L_0x0021
            r0 = 0
            r2.A00 = r0
            r1.close()
        L_0x0021:
            return
        L_0x0022:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r2 = move-exception
            X.0bu r3 = (X.C07680bu) r3
            X.0Ru r1 = r3.A00
            if (r1 == 0) goto L_0x0031
            r0 = 0
            r3.A00 = r0
            r1.close()
        L_0x0031:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0S6.run():void");
    }

    public AnonymousClass0S6(Runnable runnable) {
        this.A00 = runnable;
    }
}
