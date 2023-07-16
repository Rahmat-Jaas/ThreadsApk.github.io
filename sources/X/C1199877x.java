package X;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.77x  reason: invalid class name and case insensitive filesystem */
public final class C1199877x {
    public static final C1199877x A03 = new C1199877x();
    public final Map A00 = AnonymousClass0wJ.A0y();
    public final Set A01 = C18200wM.A0u();
    public final AtomicInteger A02 = C86144wL.A11();

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0019, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0056, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0074 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x0074=Splitter:B:25:0x0074, B:14:0x003e=Splitter:B:14:0x003e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00(boolean r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r2 = 1
            if (r7 == 0) goto L_0x0042
            java.util.concurrent.atomic.AtomicInteger r1 = r6.A02     // Catch:{ all -> 0x007d }
            int r0 = r1.get()     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x007b
            r1.set(r2)     // Catch:{ all -> 0x007d }
            java.util.Set r0 = r6.A01     // Catch:{ all -> 0x007d }
            java.util.Map r5 = r6.A00     // Catch:{ all -> 0x007d }
            r4 = 19
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x007d }
        L_0x0019:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x007b
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x007d }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x007d }
            boolean r0 = r5.containsKey(r2)     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0019
            int r1 = r2.intValue()     // Catch:{ IllegalArgumentException -> 0x003e, Exception -> 0x0019 }
            int r0 = android.os.Process.getThreadPriority(r1)     // Catch:{ IllegalArgumentException -> 0x003e, Exception -> 0x0019 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x003e, Exception -> 0x0019 }
            android.os.Process.setThreadPriority(r1, r4)     // Catch:{ IllegalArgumentException -> 0x003e, Exception -> 0x0019 }
            r5.put(r2, r0)     // Catch:{ IllegalArgumentException -> 0x003e, Exception -> 0x0019 }
            goto L_0x0019
        L_0x003e:
            r3.remove()     // Catch:{ all -> 0x007d }
            goto L_0x0019
        L_0x0042:
            java.util.concurrent.atomic.AtomicInteger r1 = r6.A02     // Catch:{ all -> 0x007d }
            int r0 = r1.get()     // Catch:{ all -> 0x007d }
            if (r0 != r2) goto L_0x007b
            r0 = 0
            r1.set(r0)     // Catch:{ all -> 0x007d }
            java.util.Set r5 = r6.A01     // Catch:{ all -> 0x007d }
            java.util.Map r4 = r6.A00     // Catch:{ all -> 0x007d }
            java.util.Iterator r3 = X.C18220wO.A0x(r4)     // Catch:{ all -> 0x007d }
        L_0x0056:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0078
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x007d }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x007d }
            java.lang.Object r0 = r4.get(r2)     // Catch:{ IllegalArgumentException -> 0x0074, Exception -> 0x0056 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalArgumentException -> 0x0074, Exception -> 0x0056 }
            int r1 = r2.intValue()     // Catch:{ IllegalArgumentException -> 0x0074, Exception -> 0x0056 }
            int r0 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x0074, Exception -> 0x0056 }
            android.os.Process.setThreadPriority(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0074, Exception -> 0x0056 }
            goto L_0x0056
        L_0x0074:
            r5.remove(r2)     // Catch:{ all -> 0x007d }
            goto L_0x0056
        L_0x0078:
            r4.clear()     // Catch:{ all -> 0x007d }
        L_0x007b:
            monitor-exit(r6)
            return
        L_0x007d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1199877x.A00(boolean):void");
    }
}
