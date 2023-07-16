package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0WD  reason: invalid class name */
public final class AnonymousClass0WD {
    public final C03720Kl A00;
    public final ReentrantLock A01 = new ReentrantLock();

    public final void A00(AnonymousClass0WA r6) {
        long nowNanos;
        if (r6 == null) {
            nowNanos = 0;
        } else {
            nowNanos = this.A00.nowNanos();
        }
        this.A01.lock();
        if (r6 != null) {
            r6.A0I.addAndGet(this.A00.nowNanos() - nowNanos);
        }
    }

    public final void A01(AnonymousClass0WA r6) {
        long nowNanos;
        if (r6 == null) {
            nowNanos = 0;
        } else {
            nowNanos = this.A00.nowNanos();
        }
        this.A01.unlock();
        if (r6 != null) {
            r6.A0I.addAndGet(this.A00.nowNanos() - nowNanos);
        }
    }

    public AnonymousClass0WD(C03720Kl r2) {
        this.A00 = r2;
    }
}
