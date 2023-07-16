package X;

import java.util.concurrent.locks.Lock;

/* renamed from: X.7zU  reason: invalid class name and case insensitive filesystem */
public final class C135437zU implements Runnable {
    public final /* synthetic */ C129377lm A00;

    public C135437zU(C129377lm r1) {
        this.A00 = r1;
    }

    public final void run() {
        C129377lm r0 = this.A00;
        Lock lock = r0.A0B;
        lock.lock();
        try {
            C129377lm.A02(r0);
        } finally {
            lock.unlock();
        }
    }
}
