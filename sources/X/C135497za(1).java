package X;

import android.os.Process;

/* renamed from: X.7za  reason: invalid class name and case insensitive filesystem */
public final class C135497za implements Runnable {
    public final /* synthetic */ C113006qY A00;

    public C135497za(C113006qY r1) {
        this.A00 = r1;
    }

    public final void run() {
        C113006qY r1 = this.A00;
        Process.setThreadPriority(r1.A01);
        r1.A00 = false;
    }
}
