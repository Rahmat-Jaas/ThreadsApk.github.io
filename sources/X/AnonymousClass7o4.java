package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7o4  reason: invalid class name */
public final class AnonymousClass7o4 implements ListenableFuture {
    public final WeakReference A00;
    public final MJO A01 = new AnonymousClass55R(this);

    public final void addListener(Runnable runnable, Executor executor) {
        this.A01.addListener(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        C112616pu r3 = (C112616pu) this.A00.get();
        boolean cancel = this.A01.cancel(z);
        if (cancel && r3 != null) {
            r3.A02 = null;
            r3.A00 = null;
            r3.A01.A06((Object) null);
        }
        return cancel;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.A01.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.A01.isCancelled();
    }

    public final boolean isDone() {
        return this.A01.isDone();
    }

    public final String toString() {
        return this.A01.toString();
    }

    public AnonymousClass7o4(C112616pu r2) {
        this.A00 = C86144wL.A0w(r2);
    }

    public final Object get() {
        return this.A01.get();
    }
}
