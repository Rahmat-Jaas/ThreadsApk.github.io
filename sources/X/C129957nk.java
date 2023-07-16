package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.7nk  reason: invalid class name and case insensitive filesystem */
public final class C129957nk implements C83334rD {
    public final SettableFuture A00 = new SettableFuture();

    public final void onFailure(Throwable th) {
        C04220Ms.A0B(th, 0);
        this.A00.setException(th);
    }

    public final void onSuccess(Object obj) {
        this.A00.set(obj);
    }
}
