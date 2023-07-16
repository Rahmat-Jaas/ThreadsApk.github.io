package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.6W2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6W2 {
    public static final void A00(Throwable th, C27996Ewk ewk) {
        CancellationException cancellationException;
        if (!(th instanceof CancellationException) || (cancellationException = (CancellationException) th) == null) {
            cancellationException = new CancellationException("Channel was consumed, consumer had failed");
            cancellationException.initCause(th);
        }
        ewk.AC7(cancellationException);
    }
}
