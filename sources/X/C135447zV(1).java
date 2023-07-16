package X;

import android.os.Process;

/* renamed from: X.7zV  reason: invalid class name and case insensitive filesystem */
public final class C135447zV implements Runnable {
    public final Runnable A00;

    public C135447zV(Runnable runnable) {
        this.A00 = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.A00.run();
    }
}
