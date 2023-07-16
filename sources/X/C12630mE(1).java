package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0mE  reason: invalid class name and case insensitive filesystem */
public final class C12630mE extends AnonymousClass0gG {
    public final AnonymousClass0gG A00;
    public final AtomicInteger A01;
    public final /* synthetic */ C12460lw A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12630mE(C12460lw r5, AnonymousClass0gG r6, AtomicInteger atomicInteger) {
        super(r6.getRunnableId(), r6.getPriority(), r6.isSendToNetworkThreadPool(), r6.isMayRunDuringStartup());
        this.A02 = r5;
        this.A00 = r6;
        this.A01 = atomicInteger;
    }

    public final void run() {
        this.A00.run();
        C12460lw r1 = this.A02;
        synchronized (r1) {
            this.A01.decrementAndGet();
        }
        C12460lw.A00(r1);
    }
}
