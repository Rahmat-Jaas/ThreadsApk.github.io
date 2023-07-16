package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.85M  reason: invalid class name */
public final class AnonymousClass85M implements ThreadFactory {
    public final ThreadFactory A00 = Executors.defaultThreadFactory();
    public final AtomicInteger A01 = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A00.newThread(runnable);
        newThread.setName(AnonymousClass00U.A0J("PlayBillingLibrary-", this.A01.getAndIncrement()));
        return newThread;
    }
}
