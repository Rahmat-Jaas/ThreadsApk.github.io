package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.0Sn  reason: invalid class name */
public final class AnonymousClass0Sn extends Thread {
    public ReferenceQueue A00;
    public volatile boolean A01 = true;
    public final /* synthetic */ C07760c8 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0Sn(C07760c8 r2, ReferenceQueue referenceQueue, int i) {
        super(AnonymousClass00U.A0J("RefQThread-", i));
        this.A02 = r2;
        this.A00 = referenceQueue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        if (r8 <= 0) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            X.0c8 r7 = r9.A02
            r6 = 32
            r5 = 0
            long[] r4 = new long[r6]
            java.lang.ref.Reference[] r3 = new java.lang.ref.Reference[r6]
        L_0x0009:
            r8 = 0
        L_0x000a:
            java.lang.ref.ReferenceQueue r2 = r9.A00     // Catch:{ InterruptedException -> 0x0028 }
            java.lang.ref.Reference r0 = r2.poll()     // Catch:{ InterruptedException -> 0x0028 }
            if (r0 == 0) goto L_0x001a
            int r1 = r8 + 1
            r3[r8] = r0     // Catch:{ InterruptedException -> 0x0027 }
            r8 = r1
            if (r1 < r6) goto L_0x000a
            goto L_0x002a
        L_0x001a:
            if (r8 != 0) goto L_0x0028
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.ref.Reference r0 = r2.remove(r0)     // Catch:{ InterruptedException -> 0x0028 }
            if (r0 == 0) goto L_0x0054
            r1 = 1
            r3[r8] = r0     // Catch:{ InterruptedException -> 0x0027 }
        L_0x0027:
            r8 = r1
        L_0x0028:
            if (r8 <= 0) goto L_0x0054
        L_0x002a:
            r2 = 0
        L_0x002b:
            r0 = r3[r2]
            X.0Sl r0 = (X.C05290Sl) r0
            java.lang.Object r0 = r0.AnW()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r4[r2] = r0
            int r2 = r2 + 1
            if (r2 < r8) goto L_0x002b
            X.0Sk r0 = r7.A03
            r0.onDeallocation(r4, r5, r8)
            java.util.Set r2 = r7.A05
            monitor-enter(r2)
            r1 = 0
        L_0x0048:
            r0 = r3[r1]     // Catch:{ all -> 0x0059 }
            r2.remove(r0)     // Catch:{ all -> 0x0059 }
            r3[r1] = r5     // Catch:{ all -> 0x0059 }
            int r1 = r1 + 1
            if (r1 < r8) goto L_0x0048
            monitor-exit(r2)     // Catch:{ all -> 0x0059 }
        L_0x0054:
            boolean r0 = r9.A01
            if (r0 != 0) goto L_0x0009
            return
        L_0x0059:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0059 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Sn.run():void");
    }
}
