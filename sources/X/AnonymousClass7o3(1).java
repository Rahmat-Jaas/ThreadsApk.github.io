package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7o3  reason: invalid class name */
public final class AnonymousClass7o3 implements ListenableFuture {
    public final C39984LCx A00;
    public final C148838sG A01;

    public final void addListener(Runnable runnable, Executor executor) {
        this.A00.addListener(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.A00.cancel(z);
    }

    public final Object get() {
        return this.A00.get();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.A00.isCancelled();
    }

    public final boolean isDone() {
        return this.A00.isDone();
    }

    public /* synthetic */ AnonymousClass7o3(C148838sG r2) {
        C39984LCx lCx = new C39984LCx();
        this.A01 = r2;
        this.A00 = lCx;
        r2.BQv(C86164wN.A0q(this, 21));
    }
}
