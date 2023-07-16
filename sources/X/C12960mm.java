package X;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.0mm  reason: invalid class name and case insensitive filesystem */
public final class C12960mm extends FutureTask implements AnonymousClass0C7 {
    public final AnonymousClass0FH A00 = new AnonymousClass0FH();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r2.isEmpty() != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r2.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        throw new java.lang.NullPointerException("execute");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void done() {
        /*
            r3 = this;
            X.0FH r1 = r3.A00
            java.util.Queue r2 = r1.A01
            monitor-enter(r2)
            boolean r0 = r1.A00     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            return
        L_0x000b:
            r0 = 1
            r1.A00 = r0     // Catch:{ all -> 0x0021 }
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0020
            r2.poll()
            java.lang.String r0 = "execute"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x0020:
            return
        L_0x0021:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12960mm.done():void");
    }

    public C12960mm(Callable callable) {
        super(callable);
    }

    public C12960mm(Runnable runnable, Object obj) {
        super(runnable, obj);
    }
}
