package X;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Cr  reason: invalid class name and case insensitive filesystem */
public final class C02740Cr implements Future {
    public static final C02740Cr A01 = new C02740Cr((Object) null);
    public final Object A00;

    public final boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public C02740Cr(Object obj) {
        this.A00 = obj;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return get();
    }

    public final Object get() {
        return this.A00;
    }
}
