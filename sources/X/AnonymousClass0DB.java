package X;

import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;

/* renamed from: X.0DB  reason: invalid class name */
public final class AnonymousClass0DB {
    public static final C014306p A00 = new C014306p();

    public static final void A00(PowerManager.WakeLock wakeLock) {
        C014306p r6 = A00;
        synchronized (r6) {
            C014306p.A00(r6);
            C02920Dk r2 = (C02920Dk) r6.A06.get(wakeLock);
            if (r2 == null) {
                Log.e("WakeLockMetricsCollector", "Unknown wakelock modified", (Throwable) null);
            } else if (C02920Dk.A00(r2, SystemClock.uptimeMillis())) {
                int i = r6.A00 - 1;
                r6.A00 = i;
                if (i == 0) {
                    r6.A03 += r2.A03 - r6.A02;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r1 != 0) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.os.PowerManager.WakeLock r7, long r8) {
        /*
            X.06p r5 = A00
            monitor-enter(r5)
            X.C014306p.A00(r5)     // Catch:{ all -> 0x0054 }
            java.util.WeakHashMap r0 = r5.A06     // Catch:{ all -> 0x0054 }
            java.lang.Object r4 = r0.get(r7)     // Catch:{ all -> 0x0054 }
            X.0Dk r4 = (X.C02920Dk) r4     // Catch:{ all -> 0x0054 }
            if (r4 != 0) goto L_0x0019
            java.lang.String r2 = "WakeLockMetricsCollector"
            java.lang.String r1 = "Unknown wakelock modified"
            r0 = 0
            android.util.Log.e(r2, r1, r0)     // Catch:{ all -> 0x0054 }
            goto L_0x0052
        L_0x0019:
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0054 }
            r6 = 0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0026
            long r8 = r8 + r2
            r4.A04 = r8     // Catch:{ all -> 0x0054 }
        L_0x0026:
            boolean r0 = r4.A06     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0031
            int r1 = r4.A00     // Catch:{ all -> 0x0054 }
            int r0 = r1 + 1
            r4.A00 = r0     // Catch:{ all -> 0x0054 }
            goto L_0x0050
        L_0x0031:
            boolean r0 = r4.A05     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x0052
            r4.A01 = r2     // Catch:{ all -> 0x0054 }
            r0 = 1
            r4.A05 = r0     // Catch:{ all -> 0x0054 }
            int r4 = r5.A00     // Catch:{ all -> 0x0054 }
            if (r4 != 0) goto L_0x0044
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0054 }
            r5.A02 = r0     // Catch:{ all -> 0x0054 }
        L_0x0044:
            long r2 = r5.A01     // Catch:{ all -> 0x0054 }
            r0 = 1
            long r2 = r2 + r0
            r5.A01 = r2     // Catch:{ all -> 0x0054 }
            int r0 = r4 + 1
            r5.A00 = r0     // Catch:{ all -> 0x0054 }
            goto L_0x0052
        L_0x0050:
            if (r1 == 0) goto L_0x0031
        L_0x0052:
            monitor-exit(r5)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DB.A01(android.os.PowerManager$WakeLock, long):void");
    }
}
