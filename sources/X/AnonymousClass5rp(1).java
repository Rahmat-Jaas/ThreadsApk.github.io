package X;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.5rp  reason: invalid class name */
public abstract class AnonymousClass5rp extends AnonymousClass5rq {
    public static final Logger A00 = Logger.getLogger(AnonymousClass5rp.class.getName());

    public final boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final void addListener(Runnable runnable, Executor executor) {
        AnonymousClass7Ko.A07(runnable, C28174Ezk.A00(144));
        AnonymousClass7Ko.A07(executor, C28174Ezk.A00(135));
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = A00;
            Level level = Level.SEVERE;
            StringBuilder A0s = C18190wL.A0s(C28174Ezk.A00(29));
            A0s.append(runnable);
            logger.log(level, C86104wH.A0x(executor, C28174Ezk.A00(287), A0s), e);
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }

    public final Object get() {
        return ((AnonymousClass5ro) this).A00;
    }
}
