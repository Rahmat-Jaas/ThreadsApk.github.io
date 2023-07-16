package X;

import android.os.Process;

/* renamed from: X.0jl  reason: invalid class name and case insensitive filesystem */
public final class C11230jl extends Thread {
    public final int A00 = 9;

    public C11230jl(Runnable runnable, String str) {
        super(runnable, str);
    }

    public final void run() {
        Process.setThreadPriority(this.A00);
        super.run();
    }
}
