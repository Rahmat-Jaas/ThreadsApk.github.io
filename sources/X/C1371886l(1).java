package X;

import java.util.concurrent.Future;

/* renamed from: X.86l  reason: invalid class name and case insensitive filesystem */
public final class C1371886l implements Et5 {
    public final Future A00;

    public final void dispose() {
        this.A00.cancel(false);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("DisposableFutureHandle[");
        A0s.append(this.A00);
        return C86114wI.A0q(A0s, ']');
    }

    public C1371886l(Future future) {
        this.A00 = future;
    }
}
