package X;

import android.os.SystemClock;

/* renamed from: X.0jO  reason: invalid class name and case insensitive filesystem */
public final class C11050jO implements Runnable {
    public final Runnable A00;
    public volatile long A01;
    public volatile long A02;
    public final /* synthetic */ C10980jH A03;

    public C11050jO(C10980jH r1, Runnable runnable) {
        this.A03 = r1;
        this.A00 = runnable;
        SystemClock.uptimeMillis();
    }

    public final void run() {
        SystemClock.uptimeMillis();
        C10980jH r1 = this.A03;
        SystemClock.currentThreadTimeMillis();
        this.A00.run();
        SystemClock.currentThreadTimeMillis();
        SystemClock.uptimeMillis();
        synchronized (r1) {
            r1.A00 = false;
        }
        C10980jH.A01(r1);
    }
}
