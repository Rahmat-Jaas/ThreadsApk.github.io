package X;

import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3aC  reason: invalid class name and case insensitive filesystem */
public final class C62533aC {
    public static final SparseArray A00 = new SparseArray();
    public static final Object A01 = new Object();
    public static final AtomicInteger A02 = new AtomicInteger(0);

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
        X.C30967GcS.A01((X.AnonymousClass3HX) null, "BloksDataStorage", "Casting error when retrieving data", r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(java.lang.Class r5, java.lang.Integer r6) {
        /*
            r4 = 0
            if (r6 != 0) goto L_0x0004
            return r4
        L_0x0004:
            java.lang.Object r3 = A01     // Catch:{ ClassCastException -> 0x0022 }
            monitor-enter(r3)     // Catch:{ ClassCastException -> 0x0022 }
            android.util.SparseArray r2 = A00     // Catch:{ all -> 0x001f }
            int r1 = r6.intValue()     // Catch:{ all -> 0x001f }
            int r0 = r2.indexOfKey(r1)     // Catch:{ all -> 0x001f }
            if (r0 >= 0) goto L_0x0015
            r0 = r4
            goto L_0x001d
        L_0x0015:
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x001f }
            java.lang.Object r0 = r5.cast(r0)     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r3)     // Catch:{ ClassCastException -> 0x0022 }
            return r0
        L_0x001f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ ClassCastException -> 0x0022 }
            throw r0     // Catch:{ ClassCastException -> 0x0022 }
        L_0x0022:
            r3 = move-exception
            java.lang.String r2 = "BloksDataStorage"
            java.lang.String r1 = "Casting error when retrieving data"
            r0 = 0
            X.C30967GcS.A01(r4, r2, r1, r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62533aC.A01(java.lang.Class, java.lang.Integer):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0024, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0025, code lost:
        X.C30967GcS.A01((X.AnonymousClass3HX) null, "BloksDataStorage", "Casting error when retrieving data", r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(java.lang.Class r5, java.lang.Integer r6) {
        /*
            r4 = 0
            if (r6 == 0) goto L_0x002e
            java.lang.Object r3 = A01     // Catch:{ ClassCastException -> 0x0024 }
            monitor-enter(r3)     // Catch:{ ClassCastException -> 0x0024 }
            android.util.SparseArray r2 = A00     // Catch:{ all -> 0x0021 }
            int r1 = r6.intValue()     // Catch:{ all -> 0x0021 }
            int r0 = r2.indexOfKey(r1)     // Catch:{ all -> 0x0021 }
            if (r0 >= 0) goto L_0x0014
            monitor-exit(r3)     // Catch:{ ClassCastException -> 0x0024 }
            return r4
        L_0x0014:
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x0021 }
            java.lang.Object r0 = r5.cast(r0)     // Catch:{ all -> 0x0021 }
            r2.delete(r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r3)     // Catch:{ ClassCastException -> 0x0024 }
            return r0
        L_0x0021:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ ClassCastException -> 0x0024 }
            throw r0     // Catch:{ ClassCastException -> 0x0024 }
        L_0x0024:
            r3 = move-exception
            java.lang.String r2 = "BloksDataStorage"
            java.lang.String r1 = "Casting error when retrieving data"
            r0 = 0
            X.C30967GcS.A01(r4, r2, r1, r3, r0)
            return r4
        L_0x002e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62533aC.A02(java.lang.Class, java.lang.Integer):java.lang.Object");
    }

    public static final int A00(Object obj) {
        int incrementAndGet = A02.incrementAndGet();
        synchronized (A01) {
            A00.append(incrementAndGet, obj);
        }
        return incrementAndGet;
    }
}
