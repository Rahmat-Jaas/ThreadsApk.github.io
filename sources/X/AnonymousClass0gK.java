package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0gK  reason: invalid class name */
public final class AnonymousClass0gK implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(1);
    public final /* synthetic */ int A01;

    public AnonymousClass0gK(int i) {
        this.A01 = i;
    }

    public final Thread newThread(Runnable runnable) {
        return new AnonymousClass0g6(runnable, AnonymousClass00U.A0J("IgExecutorV2 #", this.A00.getAndIncrement()), this.A01);
    }
}
