package X;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8ba  reason: invalid class name and case insensitive filesystem */
public final class C141438ba extends C27424EnG implements C145648kq {
    public final Executor A00;

    public final void A05(Runnable runnable, C27952Ew2 ew2) {
        try {
            this.A00.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            AnonymousClass7C2.A00(cancellationException, ew2);
            C25295DjG.A01.A05(runnable, ew2);
        }
    }

    public final Et5 BQx(Runnable runnable, C27952Ew2 ew2, long j) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.A00;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            try {
                ScheduledFuture<?> schedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
                if (schedule != null) {
                    return new C1371886l(schedule);
                }
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                AnonymousClass7C2.A00(cancellationException, ew2);
            }
        }
        return MX4.A00.BQx(runnable, ew2, j);
    }

    public final void Cg9(AnonymousClass8s9 r5, long j) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.A00;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            AnonymousClass823 r1 = new AnonymousClass823(r5, this);
            C27952Ew2 context = r5.getContext();
            try {
                ScheduledFuture<?> schedule = scheduledExecutorService.schedule(r1, j, TimeUnit.MILLISECONDS);
                if (schedule != null) {
                    r5.BQt(new C27405Emx(schedule));
                    return;
                }
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                AnonymousClass7C2.A00(cancellationException, context);
            }
        }
        MX4.A00.Cg9(r5, j);
    }

    public final void close() {
        ExecutorService executorService;
        Executor executor = this.A00;
        if ((executor instanceof ExecutorService) && (executorService = (ExecutorService) executor) != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C141438ba) || ((C141438ba) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.A00);
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C141438ba(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.A00 = executor;
        try {
            if ((executor instanceof ScheduledThreadPoolExecutor) && (scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor) != null && (method = AnonymousClass6Z9.A00) != null) {
                method.invoke(scheduledThreadPoolExecutor, new Object[]{C18180wK.A0Y()});
            }
        } catch (Throwable unused) {
        }
    }
}
