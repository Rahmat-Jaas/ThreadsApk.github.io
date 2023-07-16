package X;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.01r  reason: invalid class name and case insensitive filesystem */
public final class C003601r extends AbstractExecutorService implements AnonymousClass06Y {
    public final Handler A00;

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        AnonymousClass06V r2 = new AnonymousClass06V(handler, (Object) null, runnable);
        handler.postDelayed(r2, timeUnit.toMillis(j));
        return r2;
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        runnable.getClass();
        AnonymousClass06V r0 = new AnonymousClass06V(this.A00, (Object) null, runnable);
        execute(r0);
        return r0;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }

    public final RunnableFuture newTaskFor(Callable callable) {
        return new C003701s(this.A00, callable);
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public C003601r(Handler handler) {
        this.A00 = handler;
    }

    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new C003701s(this.A00, obj, runnable);
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        AnonymousClass06V r2 = new AnonymousClass06V(handler, callable);
        handler.postDelayed(r2, timeUnit.toMillis(j));
        return r2;
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        AnonymousClass06V r0 = new AnonymousClass06V(this.A00, obj, runnable);
        execute(r0);
        return r0;
    }

    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        callable.getClass();
        AnonymousClass06V r0 = new AnonymousClass06V(this.A00, callable);
        execute(r0);
        return r0;
    }
}
