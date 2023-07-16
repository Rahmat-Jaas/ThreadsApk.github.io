package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0lw  reason: invalid class name and case insensitive filesystem */
public final class C12460lw implements AnonymousClass0gW {
    public final BlockingQueue A00 = new AnonymousClass0gH(this);
    public final int A01;
    public final AnonymousClass0gW A02;
    public final AtomicInteger A03 = new AtomicInteger(0);

    public C12460lw(AnonymousClass0gW r3, int i) {
        this.A02 = r3;
        this.A01 = i;
    }

    public static void A00(C12460lw r4) {
        AnonymousClass0gG r2;
        synchronized (r4) {
            AtomicInteger atomicInteger = r4.A03;
            if (atomicInteger.get() < r4.A01 && (r2 = (AnonymousClass0gG) r4.A00.poll()) != null) {
                atomicInteger.incrementAndGet();
                r4.A02.AKp(new C12630mE(r4, r2, atomicInteger));
            }
        }
    }

    public final void AKo(AnonymousClass0gJ r2) {
        AKp(r2.A00);
    }

    public final void AKp(AnonymousClass0gG r2) {
        this.A00.add(r2);
        A00(this);
    }
}
