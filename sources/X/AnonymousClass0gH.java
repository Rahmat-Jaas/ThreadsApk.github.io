package X;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.0gH  reason: invalid class name */
public final class AnonymousClass0gH extends LinkedBlockingDeque<AnonymousClass0gG> {
    public final /* synthetic */ C12460lw A00;

    public AnonymousClass0gH(C12460lw r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        return super.offerFirst(obj);
    }

    public final /* bridge */ /* synthetic */ Object remove() {
        return super.removeFirst();
    }
}
