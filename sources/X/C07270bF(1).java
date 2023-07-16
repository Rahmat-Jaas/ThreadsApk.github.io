package X;

import java.io.File;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0bF  reason: invalid class name and case insensitive filesystem */
public final class C07270bF implements AnonymousClass0PC {
    public final long A00;
    public final C04100Mg A01;
    public final AnonymousClass0PD A02;
    public final AnonymousClass0Q4 A03;
    public final ScheduledExecutorService A04;

    public final void A00() {
        synchronized (this.A02) {
            C04100Mg r4 = this.A01;
            File file = r4.A02.A04;
            C002801h.A02(file, "Did you call SessionManager.init()?");
            if (!file.exists()) {
                this.A04.shutdown();
            }
            if (AnonymousClass0MI.A08()) {
                C06040Xk r2 = this.A03.A03;
                C002801h.A02(r2, "Did you call SessionManager.init()?");
                r2.A06(System.currentTimeMillis());
                C04170Mn r1 = new C04170Mn((Throwable) null);
                r4.A07(r1, AnonymousClass0ND.CRITICAL_REPORT, this);
                r4.A07(r1, AnonymousClass0ND.LARGE_REPORT, this);
            }
        }
    }

    public final void start() {
        long j = this.A00;
        if (j > 0) {
            this.A04.scheduleWithFixedDelay(new AnonymousClass0PU(this), j, j, TimeUnit.SECONDS);
        }
    }

    public C07270bF(C04100Mg r1, AnonymousClass0PD r2, AnonymousClass0Q4 r3, ScheduledExecutorService scheduledExecutorService, long j) {
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r1;
        this.A04 = scheduledExecutorService;
        this.A00 = j;
    }

    public final /* synthetic */ C06820aQ As3() {
        return null;
    }

    public final AnonymousClass0PD Awx() {
        return this.A02;
    }
}
