package X;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.06V  reason: invalid class name */
public class AnonymousClass06V extends AnonymousClass0EW implements Runnable, C12970mn {
    public final C12960mm A00;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void run() {
        this.A00.run();
    }

    public AnonymousClass06V(Handler handler, Object obj, Runnable runnable) {
        super(handler);
        this.A00 = new C12960mm(runnable, obj);
    }

    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ Future A01() {
        return this.A00;
    }

    public AnonymousClass06V(Handler handler, Callable callable) {
        super(handler);
        this.A00 = new C12960mm(callable);
    }
}
