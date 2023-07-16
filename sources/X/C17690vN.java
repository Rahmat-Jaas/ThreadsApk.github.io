package X;

import java.util.List;

/* renamed from: X.0vN  reason: invalid class name and case insensitive filesystem */
public final class C17690vN implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C17630vH A01;
    public final /* synthetic */ List A02;

    public C17690vN(C17630vH r1, List list, int i) {
        this.A01 = r1;
        this.A02 = list;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        X.C17630vH.A03(r4, X.C17540v7.SUBSCRIBE, X.C17490uz.A00(r2), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            X.0vH r4 = r8.A01
            java.util.List r7 = r8.A02
            int r6 = r8.A00
            X.C17630vH.A02(r4)     // Catch:{ all -> 0x0042 }
            java.lang.Integer r1 = r4.A0Y     // Catch:{ all -> 0x0042 }
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x0042 }
            if (r1 != r0) goto L_0x004c
            X.0pX r5 = r4.A0E     // Catch:{ all -> 0x0042 }
            monitor-enter(r5)     // Catch:{ all -> 0x0042 }
            X.0ue r0 = X.C17290ue.SUBSCRIBE     // Catch:{ all -> 0x003f }
            X.0uh r3 = new X.0uh     // Catch:{ all -> 0x003f }
            r3.<init>(r0)     // Catch:{ all -> 0x003f }
            X.0ug r2 = new X.0ug     // Catch:{ all -> 0x003f }
            r2.<init>(r6)     // Catch:{ all -> 0x003f }
            X.0uW r0 = new X.0uW     // Catch:{ all -> 0x003f }
            r0.<init>(r7)     // Catch:{ all -> 0x003f }
            X.0q8 r1 = new X.0q8     // Catch:{ all -> 0x003f }
            r1.<init>(r3, r2, r0)     // Catch:{ all -> 0x003f }
            X.0uG r0 = r5.A01     // Catch:{ all -> 0x003f }
            X.C14510pX.A01(r5, r1, r0)     // Catch:{ all -> 0x003f }
            monitor-exit(r5)     // Catch:{ all -> 0x0042 }
            X.0my r2 = r4.A0X     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x004c
            X.00d r0 = r2.A01     // Catch:{ all -> 0x0042 }
            android.os.Handler r1 = r0.A05     // Catch:{ all -> 0x0042 }
            X.0AA r0 = new X.0AA     // Catch:{ all -> 0x0042 }
            r0.<init>(r2)     // Catch:{ all -> 0x0042 }
            r1.post(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x003f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0042 }
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r2 = move-exception
            X.0uz r1 = X.C17490uz.A00(r2)
            X.0v7 r0 = X.C17540v7.SUBSCRIBE
            X.C17630vH.A03(r4, r0, r1, r2)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17690vN.run():void");
    }
}
