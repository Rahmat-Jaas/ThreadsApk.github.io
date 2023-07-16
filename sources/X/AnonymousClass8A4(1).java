package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.8A4  reason: invalid class name */
public final class AnonymousClass8A4 extends AtomicReference implements C41767MbD {
    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("RunnableDisposable(disposed=");
        A0s.append(C18220wO.A1U(get()));
        C86144wL.A1T(A0s);
        A0s.append(get());
        return C18180wK.A0i(")", A0s);
    }

    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            ((Runnable) andSet).run();
        }
    }

    public AnonymousClass8A4(Runnable runnable) {
        super(runnable);
    }
}
