package X;

import java.util.Map;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6jg  reason: invalid class name and case insensitive filesystem */
public final class C109236jg {
    public C110936mW A00 = null;
    public RunnableFuture A01;
    public final AtomicInteger A02 = new AtomicInteger(-1);

    public C109236jg(AnonymousClass3HX r3, C113616ro r4, C110936mW r5, Map map) {
        this.A01 = new FutureTask(new C1367984l(r3, r4, r5, map));
    }
}
