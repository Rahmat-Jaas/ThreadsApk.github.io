package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.6sL  reason: invalid class name and case insensitive filesystem */
public final class C113896sL {
    public final C111726oD A00;
    public final List A01;
    public final ScheduledExecutorService A02;
    public final ReentrantLock A03;
    public volatile AnonymousClass22X A04;
    public volatile boolean A05;

    public final synchronized void A01(AnonymousClass22X r5) {
        C04220Ms.A0B(r5, 0);
        if (this.A04 != r5) {
            this.A04 = r5;
            for (C143158gC r2 : this.A01) {
                this.A02.execute(new C1357780c(r2, r5));
            }
        }
    }

    public final void A00() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            if (this.A04 == null && !this.A05) {
                this.A05 = true;
                this.A00.A00(new C125477dK(this));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public C113896sL(C111726oD r2, ScheduledExecutorService scheduledExecutorService, boolean z) {
        AnonymousClass22X r0;
        this.A00 = r2;
        this.A02 = scheduledExecutorService;
        if (z) {
            r0 = null;
        } else {
            r0 = AnonymousClass22X.NOT_APPLICABLE;
        }
        this.A04 = r0;
        List synchronizedList = Collections.synchronizedList(AnonymousClass0wJ.A0v());
        C04220Ms.A06(synchronizedList);
        this.A01 = synchronizedList;
        this.A03 = new ReentrantLock();
    }
}
