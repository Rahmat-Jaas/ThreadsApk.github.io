package X;

import java.util.concurrent.ScheduledFuture;

/* renamed from: X.0Nj  reason: invalid class name and case insensitive filesystem */
public final class C04380Nj implements Runnable {
    public final /* synthetic */ C06150Xw A00;

    public C04380Nj(C06150Xw r1) {
        this.A00 = r1;
    }

    public final void run() {
        ScheduledFuture scheduledFuture;
        C06150Xw r2 = this.A00;
        synchronized (r2) {
            if (r2.A0E != null) {
                C06150Xw.A00(r2);
                Boolean bool = r2.A05;
                if (!(bool == null || bool.booleanValue() || (scheduledFuture = r2.A07) == null)) {
                    scheduledFuture.cancel(false);
                    r2.A07 = null;
                }
            }
        }
    }
}
