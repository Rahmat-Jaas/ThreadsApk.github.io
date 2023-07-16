package X;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.0gJ  reason: invalid class name */
public class AnonymousClass0gJ extends FutureTask {
    public final AnonymousClass0gG A00;

    public AnonymousClass0gJ(Callable callable, int i, int i2, boolean z) {
        super(callable);
        this.A00 = new C12660mH(this, i, i2, z);
    }

    public AnonymousClass0gJ(Runnable runnable, Object obj) {
        super(runnable, obj);
        this.A00 = new C12660mH(this, 88550195, 3, false);
    }
}
