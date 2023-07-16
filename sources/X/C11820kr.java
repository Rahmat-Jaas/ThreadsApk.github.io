package X;

import java.util.Queue;

/* renamed from: X.0kr  reason: invalid class name and case insensitive filesystem */
public final class C11820kr implements Runnable {
    public final /* synthetic */ C12490m0 A00;

    public C11820kr(C12490m0 r1) {
        this.A00 = r1;
    }

    public final void run() {
        C12490m0 r2 = this.A00;
        r2.A09.set(false);
        while (true) {
            Queue queue = r2.A08;
            if (!queue.isEmpty()) {
                ((Runnable) queue.remove()).run();
            } else {
                return;
            }
        }
    }
}
