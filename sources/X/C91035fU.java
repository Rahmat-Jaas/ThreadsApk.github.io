package X;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: X.5fU  reason: invalid class name and case insensitive filesystem */
public final class C91035fU extends C112406pX {
    public final int A00;
    public final int A01;
    public final AnonymousClass7J7 A02;

    public final AnonymousClass7J7 A01() {
        RunnableFuture runnableFuture;
        synchronized (this) {
            runnableFuture = this.A00;
        }
        if (runnableFuture == null || runnableFuture.isDone()) {
            return (AnonymousClass7J7) A00();
        }
        return this.A02;
    }

    public C91035fU(AnonymousClass7J7 r1, Callable callable, int i, int i2) {
        super(callable);
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
    }
}
