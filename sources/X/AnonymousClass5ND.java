package X;

import android.os.Process;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5ND  reason: invalid class name */
public final class AnonymousClass5ND extends MGK {
    public final int A00;

    public final int ATy() {
        return 6;
    }

    public final void A02() {
        AtomicInteger atomicInteger = AnonymousClass6aG.A01;
        if (atomicInteger.get() != 0) {
            int decrementAndGet = atomicInteger.decrementAndGet();
            if (decrementAndGet == 0) {
                int A002 = AnonymousClass6XH.A00();
                if (A002 >= 0) {
                    Process.setThreadPriority(A002, AnonymousClass6aG.A02);
                    AnonymousClass6aG.A00.set(false);
                }
            } else if (decrementAndGet < 0) {
                atomicInteger.compareAndSet(decrementAndGet, 0);
            }
        }
    }

    public final boolean A03() {
        int i = this.A00;
        int A002 = AnonymousClass6XH.A00();
        if (A002 < 0) {
            return true;
        }
        if (AnonymousClass6aG.A00.compareAndSet(false, true)) {
            AnonymousClass6aG.A02 = Process.getThreadPriority(A002);
        }
        Process.setThreadPriority(A002, i);
        AnonymousClass6aG.A01.incrementAndGet();
        return true;
    }

    public AnonymousClass5ND(int i) {
        this.A00 = i;
    }
}
