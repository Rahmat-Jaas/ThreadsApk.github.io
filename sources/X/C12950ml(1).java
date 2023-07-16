package X;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0ml  reason: invalid class name and case insensitive filesystem */
public abstract class C12950ml extends C02960Do implements Future {
    public abstract Future A01();

    public boolean cancel(boolean z) {
        return A01().cancel(z);
    }

    public Object get(long j, TimeUnit timeUnit) {
        return A01().get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return A01().isCancelled();
    }

    public final boolean isDone() {
        return A01().isDone();
    }

    public Object get() {
        return A01().get();
    }
}
