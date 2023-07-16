package X;

import android.view.MotionEvent;

/* renamed from: X.61J  reason: invalid class name */
public final class AnonymousClass61J extends AnonymousClass0gG {
    public final /* synthetic */ MotionEvent A00;
    public final /* synthetic */ KJC A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61J(MotionEvent motionEvent, KJC kjc) {
        super(590);
        this.A01 = kjc;
        this.A00 = motionEvent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        X.J5T.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            X.KJC r0 = r4.A01
            java.util.concurrent.atomic.AtomicReference r0 = r0.A06
            java.lang.Object r0 = r0.get()
            X.JmR r0 = (X.C37204JmR) r0
            if (r0 == 0) goto L_0x003d
            android.view.MotionEvent r3 = r4.A00
            java.util.concurrent.atomic.AtomicReference r1 = r0.A02     // Catch:{ all -> 0x0039 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x003d
            java.lang.Object r2 = r1.get()     // Catch:{ all -> 0x0039 }
            X.7Db r2 = (X.C120907Db) r2     // Catch:{ all -> 0x0039 }
            monitor-enter(r2)     // Catch:{ all -> 0x0039 }
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C120907Db.A05     // Catch:{ all -> 0x0036 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            android.os.Message r1 = new android.os.Message     // Catch:{ all -> 0x0036 }
            r1.<init>()     // Catch:{ all -> 0x0036 }
            r0 = 0
            r1.what = r0     // Catch:{ all -> 0x0036 }
            r1.obj = r3     // Catch:{ all -> 0x0036 }
            X.4z6 r0 = r2.A00     // Catch:{ all -> 0x0036 }
            r0.sendMessage(r1)     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r2)     // Catch:{ all -> 0x0039 }
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0039 }
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            X.J5T.A00(r0)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass61J.run():void");
    }
}
