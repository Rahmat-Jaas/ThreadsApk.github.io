package X;

import androidx.work.CoroutineWorker;
import java.util.concurrent.CancellationException;

/* renamed from: X.7yw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135137yw implements Runnable {
    public final /* synthetic */ CoroutineWorker A00;

    public /* synthetic */ C135137yw(CoroutineWorker coroutineWorker) {
        this.A00 = coroutineWorker;
    }

    public final void run() {
        CoroutineWorker coroutineWorker = this.A00;
        if (coroutineWorker.A00.isCancelled()) {
            coroutineWorker.A02.AC7((CancellationException) null);
        }
    }
}
