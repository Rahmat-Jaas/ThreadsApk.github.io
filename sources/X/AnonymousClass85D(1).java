package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.85D  reason: invalid class name */
public final /* synthetic */ class AnonymousClass85D implements Executor {
    public static final /* synthetic */ AnonymousClass85D A00 = new AnonymousClass85D();

    public final void execute(Runnable runnable) {
        Object A002 = AnonymousClass6YN.A00.A00();
        C04220Ms.A06(A002);
        Handler handler = (Handler) A002;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}
