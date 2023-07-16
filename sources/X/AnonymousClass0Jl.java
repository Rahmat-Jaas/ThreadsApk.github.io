package X;

import android.os.Handler;

/* renamed from: X.0Jl  reason: invalid class name */
public final class AnonymousClass0Jl implements AnonymousClass0MF {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ Runnable A01;

    public final void Bkt() {
    }

    public AnonymousClass0Jl(Handler handler, Runnable runnable) {
        this.A00 = handler;
        this.A01 = runnable;
    }

    public final void Bkw() {
        this.A00.postDelayed(this.A01, 30000);
    }
}
