package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.7CL  reason: invalid class name */
public final class AnonymousClass7CL {
    public static Handler A00;

    public static void A00(Runnable runnable) {
        synchronized (AnonymousClass7CL.class) {
            if (A00 == null) {
                A00 = AnonymousClass0wJ.A0F();
            }
        }
        A00.postDelayed(runnable, 0);
    }

    public static boolean A01() {
        return C18180wK.A1Z(Looper.getMainLooper().getThread(), Thread.currentThread());
    }
}
