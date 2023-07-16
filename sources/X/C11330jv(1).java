package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0jv  reason: invalid class name and case insensitive filesystem */
public final class C11330jv implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        return new C11230jl(runnable, AnonymousClass00U.A0J("RtiExecutor #", this.A00.getAndIncrement()));
    }
}
