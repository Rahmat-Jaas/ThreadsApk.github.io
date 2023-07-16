package X;

import android.os.Process;

/* renamed from: X.88o  reason: invalid class name and case insensitive filesystem */
public final class C1374388o extends Thread {
    public final int A00 = 10;

    public C1374388o(Runnable runnable) {
        super(runnable, "fonts-androidx");
    }

    public final void run() {
        Process.setThreadPriority(this.A00);
        super.run();
    }
}
