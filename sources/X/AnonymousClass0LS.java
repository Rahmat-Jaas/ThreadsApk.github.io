package X;

import android.os.Handler;

/* renamed from: X.0LS  reason: invalid class name */
public final class AnonymousClass0LS implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ Runnable A01;

    public AnonymousClass0LS(Handler handler, Runnable runnable) {
        this.A01 = runnable;
        this.A00 = handler;
    }

    public final void run() {
        this.A01.run();
        this.A00.postDelayed(this, 14400000);
    }
}
