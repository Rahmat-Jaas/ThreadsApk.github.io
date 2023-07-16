package X;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.06P  reason: invalid class name */
public class AnonymousClass06P extends AnonymousClass0EW implements Runnable, C12970mn {
    public final C12960mm A00;
    public final /* synthetic */ AnonymousClass06H A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass06P(AnonymousClass06H r2, Object obj, Runnable runnable) {
        super(r2.A00);
        this.A01 = r2;
        this.A00 = new C12960mm(runnable, obj);
    }

    public final boolean cancel(boolean z) {
        AnonymousClass06H r4 = this.A01;
        synchronized (r4) {
            PriorityQueue priorityQueue = r4.A02;
            Iterator it = priorityQueue.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass086 r1 = (AnonymousClass086) it.next();
                if (r1.A01 == this) {
                    priorityQueue.remove(r1);
                    AnonymousClass06H.A02(r4);
                    break;
                }
            }
        }
        return this.A00.cancel(z);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void run() {
        this.A00.run();
    }

    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ Future A01() {
        return this.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass06P(AnonymousClass06H r2, Callable callable) {
        super(r2.A00);
        this.A01 = r2;
        this.A00 = new C12960mm(callable);
    }
}
