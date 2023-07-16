package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.0Ws  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0Ws implements Runnable {
    public final /* synthetic */ SettableFuture A00;

    public /* synthetic */ AnonymousClass0Ws(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }

    public final void run() {
        this.A00.set((Object) null);
    }
}
