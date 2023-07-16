package X;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0DK  reason: invalid class name */
public final class AnonymousClass0DK {
    public ScheduledFuture A00;
    public final AnonymousClass0BW A01;
    public final AnonymousClass0DH A02;
    public final ScheduledExecutorService A03;

    public final synchronized void A00(AnonymousClass0DJ r8) {
        long j = r8.A00;
        ScheduledFuture scheduledFuture = this.A00;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.A00 = this.A03.scheduleWithFixedDelay(new AnonymousClass0DI(r8, this), 0, j, TimeUnit.SECONDS);
    }

    public AnonymousClass0DK(AnonymousClass0DH r2, ScheduledExecutorService scheduledExecutorService) {
        AnonymousClass0BW r0 = new AnonymousClass0BW();
        this.A03 = scheduledExecutorService;
        this.A02 = r2;
        this.A01 = r0;
    }
}
