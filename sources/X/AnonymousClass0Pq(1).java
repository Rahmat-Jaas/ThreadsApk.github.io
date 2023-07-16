package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.0Pq  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0Pq implements Runnable {
    public final /* synthetic */ C04910Pt A00;
    public final /* synthetic */ CountDownLatch A01;

    public /* synthetic */ AnonymousClass0Pq(C04910Pt r1, CountDownLatch countDownLatch) {
        this.A00 = r1;
        this.A01 = countDownLatch;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0080, code lost:
        X.AnonymousClass0LU.A0G("lacrima", "Error while deleting report directory", r2);
        X.C04790Pd.A00();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            X.0Pt r7 = r10.A00
            java.util.concurrent.CountDownLatch r6 = r10.A01
            X.0Ps r1 = r7.A04
            java.lang.String r0 = "cleanup"
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x0090
            X.0Oe r0 = r7.A0D
            java.lang.Object r0 = r0.get()
            X.0Pi r0 = (X.C04840Pi) r0
            java.io.File r1 = r0.A01
            X.0Nd r0 = r7.A02     // Catch:{ IOException -> 0x001e }
            r0.A02()     // Catch:{ IOException -> 0x001e }
            goto L_0x0021
        L_0x001e:
            X.C04790Pd.A00()
        L_0x0021:
            java.io.File[] r5 = r1.listFiles()
            if (r5 == 0) goto L_0x0090
            int r4 = r5.length
            r3 = 0
        L_0x0029:
            if (r3 >= r4) goto L_0x008d
            r8 = r5[r3]
            X.0Pm r0 = X.C04870Pm.A00     // Catch:{ IOException -> 0x007f }
            java.io.File[] r0 = r8.listFiles(r0)     // Catch:{ IOException -> 0x007f }
            if (r0 != 0) goto L_0x0037
            r1 = 0
            goto L_0x0038
        L_0x0037:
            int r1 = r0.length     // Catch:{ IOException -> 0x007f }
        L_0x0038:
            X.0Nd r2 = r7.A02     // Catch:{ IOException -> 0x007f }
            r0 = 3
            r9 = 0
            if (r1 < r0) goto L_0x0044
            r9 = 1
            java.lang.Runnable r0 = r7.A06     // Catch:{ IOException -> 0x007f }
            r0.run()     // Catch:{ IOException -> 0x007f }
        L_0x0044:
            java.lang.String r1 = "_sent"
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x007f }
            r0.<init>(r8, r1)     // Catch:{ IOException -> 0x007f }
            boolean r0 = r0.exists()     // Catch:{ IOException -> 0x007f }
            if (r0 != 0) goto L_0x0053
            if (r9 == 0) goto L_0x008a
        L_0x0053:
            boolean r0 = X.C04910Pt.A0I     // Catch:{ IOException -> 0x007f }
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r8.getPath()     // Catch:{ IOException -> 0x007f }
            java.lang.Object[] r2 = new java.lang.Object[]{r0}     // Catch:{ IOException -> 0x007f }
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Would have deleted: %s"
            X.AnonymousClass0LU.A0O(r1, r0, r2)     // Catch:{ IOException -> 0x007f }
            goto L_0x008a
        L_0x0067:
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x007f }
            r0.<init>(r8, r1)     // Catch:{ IOException -> 0x007f }
            boolean r1 = r0.exists()     // Catch:{ IOException -> 0x007f }
            java.lang.String r0 = "reports"
            if (r1 != 0) goto L_0x0076
            if (r9 == 0) goto L_0x008a
        L_0x0076:
            monitor-enter(r2)     // Catch:{ IOException -> 0x007f }
            r2.A03(r8, r0)     // Catch:{ all -> 0x007c }
            monitor-exit(r2)     // Catch:{ IOException -> 0x007f }
            goto L_0x008a
        L_0x007c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x007f }
            throw r0     // Catch:{ IOException -> 0x007f }
        L_0x007f:
            r2 = move-exception
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Error while deleting report directory"
            X.AnonymousClass0LU.A0G(r1, r0, r2)
            X.C04790Pd.A00()
        L_0x008a:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x008d:
            r6.countDown()
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Pq.run():void");
    }
}
