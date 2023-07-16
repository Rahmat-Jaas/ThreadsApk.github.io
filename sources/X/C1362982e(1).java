package X;

import com.instagram.realtime.requeststream.PulsarScheduler;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.82e  reason: invalid class name and case insensitive filesystem */
public final class C1362982e implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ PulsarScheduler A01;
    public final /* synthetic */ ScheduledExecutorService A02;

    public C1362982e(PulsarScheduler pulsarScheduler, ScheduledExecutorService scheduledExecutorService, long j) {
        this.A01 = pulsarScheduler;
        this.A02 = scheduledExecutorService;
        this.A00 = j;
    }

    public final void run() {
        this.A01.startPulsarTest(this.A02, this.A00);
    }
}
