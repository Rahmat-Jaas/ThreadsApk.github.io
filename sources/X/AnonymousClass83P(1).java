package X;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: X.83P  reason: invalid class name */
public final class AnonymousClass83P implements Runnable {
    public final Bundle A00;
    public final C143278gS A01;
    public final String A02;
    public final /* synthetic */ C86264wq A03;

    public AnonymousClass83P(Bundle bundle, C86264wq r2, C143278gS r3, String str) {
        this.A03 = r2;
        this.A02 = str;
        this.A01 = r3;
        this.A00 = bundle;
    }

    private void A00(int i) {
        String str;
        C86264wq r5 = this.A03;
        synchronized (r5.A03) {
            try {
                this.A01.Ba8(i);
                str = this.A02;
            } catch (RemoteException e) {
                str = this.A02;
                AnonymousClass0LU.A0N("GcmTaskService", "Error reporting result of operation to scheduler for %s", str, e);
            } catch (Throwable th) {
                C86264wq.A07(r5, this.A02);
                throw th;
            }
            C86264wq.A07(r5, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        X.AnonymousClass0LU.A0E("GcmTaskService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", r2);
        A00(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r3 = this;
            X.4wq r2 = r3.A03     // Catch:{ RejectedExecutionException -> 0x001b }
            monitor-enter(r2)     // Catch:{ RejectedExecutionException -> 0x001b }
            java.util.concurrent.ExecutorService r0 = r2.A01     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0013
            r1 = 2
            X.85J r0 = new X.85J     // Catch:{ all -> 0x0018 }
            r0.<init>()     // Catch:{ all -> 0x0018 }
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)     // Catch:{ all -> 0x0018 }
            r2.A01 = r0     // Catch:{ all -> 0x0018 }
        L_0x0013:
            monitor-exit(r2)     // Catch:{ RejectedExecutionException -> 0x001b }
            r0.execute(r3)     // Catch:{ RejectedExecutionException -> 0x001b }
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ RejectedExecutionException -> 0x001b }
            throw r0     // Catch:{ RejectedExecutionException -> 0x001b }
        L_0x001b:
            r2 = move-exception
            java.lang.String r1 = "GcmTaskService"
            java.lang.String r0 = "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay."
            X.AnonymousClass0LU.A0E(r1, r0, r2)
            r0 = 1
            r3.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass83P.A01():void");
    }

    public final void run() {
        A00(this.A03.A08(new C113546rb(this.A02, this.A00)));
    }
}
