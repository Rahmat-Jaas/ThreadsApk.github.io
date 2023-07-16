package X;

import android.os.Process;

/* renamed from: X.0g6  reason: invalid class name */
public final class AnonymousClass0g6 extends Thread {
    public static final ThreadGroup A01 = new ThreadGroup("ig_thread");
    public final int A00;

    public AnonymousClass0g6(Runnable runnable, String str, int i) {
        super(A01, runnable, str);
        this.A00 = i;
    }

    public final void run() {
        Process.setThreadPriority(this.A00);
        super.run();
    }
}
