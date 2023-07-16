package X;

import java.util.List;
import java.util.concurrent.RunnableFuture;

/* renamed from: X.82J  reason: invalid class name */
public final class AnonymousClass82J implements Runnable {
    public final int A00;
    public final List A01;
    public volatile boolean A02;

    public final void run() {
        RunnableFuture runnableFuture;
        RunnableFuture runnableFuture2;
        int i = 0;
        while (true) {
            List list = this.A01;
            if (i < list.size() && !this.A02) {
                C91035fU r2 = ((C108076hm) list.get(i)).A00;
                synchronized (r2) {
                    runnableFuture = r2.A00;
                }
                if (runnableFuture == null || !runnableFuture.isCancelled()) {
                    synchronized (r2) {
                        runnableFuture2 = r2.A00;
                    }
                    if (runnableFuture2 != null && !runnableFuture2.isDone() && r2.A02.get() == -1) {
                        r2.A00();
                    }
                }
                i++;
            } else {
                return;
            }
        }
        while (true) {
        }
    }

    public AnonymousClass82J(List list, int i) {
        this.A00 = i;
        this.A01 = list;
    }
}
