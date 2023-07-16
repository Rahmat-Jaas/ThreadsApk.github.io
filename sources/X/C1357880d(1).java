package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.80d  reason: invalid class name and case insensitive filesystem */
public final class C1357880d implements Runnable {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ CountDownLatch A01;

    public C1357880d(Runnable runnable, CountDownLatch countDownLatch) {
        this.A00 = runnable;
        this.A01 = countDownLatch;
    }

    public final void run() {
        this.A00.run();
        this.A01.countDown();
    }
}
