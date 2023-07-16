package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0gL  reason: invalid class name */
public final class AnonymousClass0gL extends AbstractExecutorService {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return false;
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
    }

    public AnonymousClass0gL(int i, int i2, boolean z, boolean z2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
        this.A02 = z2;
    }

    public final void execute(Runnable runnable) {
        AnonymousClass0gN.A00().AKp(new C12690mK(this, runnable, this.A01, this.A00, this.A03, this.A02));
    }

    public final List shutdownNow() {
        return Collections.emptyList();
    }
}
