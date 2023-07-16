package X;

import android.os.Handler;
import android.os.Process;

/* renamed from: X.7zb  reason: invalid class name and case insensitive filesystem */
public final class C135507zb implements Runnable {
    public final /* synthetic */ C113006qY A00;

    public C135507zb(C113006qY r1) {
        this.A00 = r1;
    }

    public final void run() {
        C113006qY r1 = this.A00;
        Process.setThreadPriority(r1.A02);
        r1.A00 = true;
        ((Handler) r1.A04.getValue()).postDelayed(this, r1.A03);
    }
}
