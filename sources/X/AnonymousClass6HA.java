package X;

import android.os.Handler;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.6HA  reason: invalid class name */
public final class AnonymousClass6HA {
    public static final void A00(Handler handler, Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new C1357880d(runnable, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            AnonymousClass0LU.A0E("HandlerUtils", "Interrupted awaiting latch", e);
            Thread.currentThread().interrupt();
        }
    }
}
