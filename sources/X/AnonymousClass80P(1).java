package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;

/* renamed from: X.80P  reason: invalid class name */
public final class AnonymousClass80P implements Runnable {
    public final /* synthetic */ ListenableFuture A00;
    public final /* synthetic */ AnonymousClass8s9 A01;

    public AnonymousClass80P(ListenableFuture listenableFuture, AnonymousClass8s9 r2) {
        this.A01 = r2;
        this.A00 = listenableFuture;
    }

    public final void run() {
        try {
            this.A01.resumeWith(this.A00.get());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            boolean z = th instanceof CancellationException;
            AnonymousClass8s9 r0 = this.A01;
            if (z) {
                r0.AC9(cause);
            } else {
                C146958n9.A00(cause, r0);
            }
        }
    }
}
