package X;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.6pv  reason: invalid class name and case insensitive filesystem */
public final class C112626pv {
    public boolean A00;
    public boolean A01 = true;
    public boolean A02;
    public final Queue A03 = new ArrayDeque();

    public final void A00() {
        if (!this.A02) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    Queue queue = this.A03;
                    if (!C18190wL.A1a(queue) || (!this.A00 && this.A01)) {
                        this.A02 = z;
                    } else {
                        Runnable runnable = (Runnable) queue.poll();
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                this.A02 = z;
            } finally {
                this.A02 = z;
            }
        }
    }
}
