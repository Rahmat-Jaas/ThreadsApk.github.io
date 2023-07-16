package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.60u  reason: invalid class name and case insensitive filesystem */
public final class C954560u extends AnonymousClass0gG {
    public final /* synthetic */ C112666pz A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C954560u(C112666pz r2) {
        super(364579106);
        this.A00 = r2;
    }

    public final void run() {
        AnonymousClass781 r2 = (AnonymousClass781) this.A00.A01.getValue();
        ReentrantLock reentrantLock = r2.A02;
        reentrantLock.lock();
        try {
            if (r2.A00 == null) {
                r2.A01();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
