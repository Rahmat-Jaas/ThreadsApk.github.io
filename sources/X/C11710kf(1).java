package X;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0kf  reason: invalid class name and case insensitive filesystem */
public final class C11710kf implements AnonymousClass0gW {
    public boolean A00;
    public final AtomicLong A01 = new AtomicLong();
    public final C09810gi A02;
    public final AnonymousClass0gW A03;
    public final Queue A04;

    public C11710kf(C09810gi r2, AnonymousClass0gW r3) {
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = new ConcurrentLinkedQueue();
        this.A00 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C11710kf r5) {
        /*
            monitor-enter(r5)
            boolean r0 = r5.A00     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0016
            java.util.concurrent.atomic.AtomicLong r0 = r5.A01     // Catch:{ all -> 0x002c }
            long r3 = r0.get()     // Catch:{ all -> 0x002c }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0014
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x002c }
        L_0x0014:
            monitor-exit(r5)     // Catch:{ all -> 0x002c }
            goto L_0x0025
        L_0x0016:
            java.util.Queue r0 = r5.A04     // Catch:{ all -> 0x002c }
            java.lang.Object r1 = r0.poll()     // Catch:{ all -> 0x002c }
            X.0ky r1 = (X.C11890ky) r1     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0014
            r0 = 1
            r5.A00 = r0     // Catch:{ all -> 0x002c }
            monitor-exit(r5)     // Catch:{ all -> 0x002c }
            goto L_0x0026
        L_0x0025:
            return
        L_0x0026:
            X.0gW r0 = r5.A03
            r0.AKp(r1)
            return
        L_0x002c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x002c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11710kf.A00(X.0kf):void");
    }

    public final void AKo(AnonymousClass0gJ r2) {
        throw new UnsupportedOperationException();
    }

    public final void AKp(AnonymousClass0gG r3) {
        this.A04.add(new C11890ky(r3, this));
        A00(this);
    }
}
