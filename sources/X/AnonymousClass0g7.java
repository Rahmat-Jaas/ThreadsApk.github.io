package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0g7  reason: invalid class name */
public final class AnonymousClass0g7 extends AbstractExecutorService {
    public final int A00;
    public final int A01;
    public final AnonymousClass0gW A02 = new C11710kf(C09820gj.A00, AnonymousClass0gN.A00());
    public final boolean A03;

    public AnonymousClass0g7(int i, boolean z) {
        this.A01 = i;
        this.A00 = 3;
        this.A03 = z;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return false;
    }

    public final void execute(Runnable runnable) {
        this.A02.AKp(new C12230lY(this, runnable, this.A01, this.A00, this.A03));
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
    }

    public final List shutdownNow() {
        return Collections.emptyList();
    }
}
