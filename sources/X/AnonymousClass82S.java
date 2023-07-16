package X;

import android.os.Bundle;

/* renamed from: X.82S  reason: invalid class name */
public final /* synthetic */ class AnonymousClass82S implements Runnable {
    public final Bundle A00;
    public final C113426rN A01;
    public final C120937De A02;

    public AnonymousClass82S(Bundle bundle, C113426rN r2, C120937De r3) {
        this.A02 = r3;
        this.A00 = bundle;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (((X.AnonymousClass6CH) r1.getCause()).A00 == 4) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0063, code lost:
        if (r0 != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            X.7De r0 = r6.A02
            android.os.Bundle r5 = r6.A00
            X.6rN r3 = r6.A01
            X.7Dh r4 = r0.A02     // Catch:{ IOException -> 0x006c }
            X.7HG r0 = r4.A05     // Catch:{ IOException -> 0x006c }
            int r1 = r0.A04()     // Catch:{ IOException -> 0x006c }
            r0 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r1 < r0) goto L_0x004b
            android.content.Context r0 = r4.A03     // Catch:{ IOException -> 0x006c }
            X.7Da r2 = X.C120897Da.A01(r0)     // Catch:{ IOException -> 0x006c }
            monitor-enter(r2)     // Catch:{ IOException -> 0x006c }
            int r1 = r2.A00     // Catch:{ all -> 0x002f }
            int r0 = r1 + 1
            r2.A00 = r0     // Catch:{ all -> 0x002f }
            monitor-exit(r2)     // Catch:{ IOException -> 0x006c }
            X.5rw r0 = new X.5rw     // Catch:{ IOException -> 0x006c }
            r0.<init>(r1, r5)     // Catch:{ IOException -> 0x006c }
            X.7HU r0 = X.C120897Da.A00(r2, r0)     // Catch:{ IOException -> 0x006c }
            java.lang.Object r2 = X.C117056y3.A00(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0032 }
            goto L_0x0066
        L_0x002f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x006c }
            throw r0     // Catch:{ IOException -> 0x006c }
        L_0x0032:
            r1 = move-exception
            java.lang.String r0 = "FirebaseInstanceId"
            X.C86114wI.A1N(r0, r1)     // Catch:{ IOException -> 0x006c }
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ IOException -> 0x006c }
            boolean r0 = r0 instanceof X.AnonymousClass6CH     // Catch:{ IOException -> 0x006c }
            if (r0 == 0) goto L_0x0065
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ IOException -> 0x006c }
            X.6CH r0 = (X.AnonymousClass6CH) r0     // Catch:{ IOException -> 0x006c }
            int r1 = r0.A00     // Catch:{ IOException -> 0x006c }
            r0 = 4
            if (r1 != r0) goto L_0x0065
        L_0x004b:
            android.os.Bundle r2 = X.AnonymousClass7Dh.A00(r5, r4)     // Catch:{ IOException -> 0x006c }
            if (r2 == 0) goto L_0x0066
            java.lang.String r1 = "google.messenger"
            boolean r0 = r2.containsKey(r1)     // Catch:{ IOException -> 0x006c }
            if (r0 == 0) goto L_0x0066
            android.os.Bundle r2 = X.AnonymousClass7Dh.A00(r5, r4)     // Catch:{ IOException -> 0x006c }
            if (r2 == 0) goto L_0x0066
            boolean r0 = r2.containsKey(r1)     // Catch:{ IOException -> 0x006c }
            if (r0 == 0) goto L_0x0066
        L_0x0065:
            r2 = 0
        L_0x0066:
            X.7HU r0 = r3.A00     // Catch:{ IOException -> 0x006c }
            r0.A0B(r2)     // Catch:{ IOException -> 0x006c }
            return
        L_0x006c:
            r1 = move-exception
            X.7HU r0 = r3.A00
            r0.A0A(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass82S.run():void");
    }
}
