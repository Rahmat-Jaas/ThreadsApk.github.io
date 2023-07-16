package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.853  reason: invalid class name */
public final /* synthetic */ class AnonymousClass853 implements Executor {
    public final /* synthetic */ Handler A00;

    public /* synthetic */ AnonymousClass853(Handler handler) {
        this.A00 = handler;
    }

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
