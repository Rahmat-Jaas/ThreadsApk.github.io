package X;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.LifecycleDispatcher$DispatcherActivityCallback;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.064  reason: invalid class name */
public final class AnonymousClass064 {
    public static final AtomicBoolean A00 = new AtomicBoolean(false);

    public static final void A00(Context context) {
        if (!A00.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            C04220Ms.A0C(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new LifecycleDispatcher$DispatcherActivityCallback());
        }
    }
}
