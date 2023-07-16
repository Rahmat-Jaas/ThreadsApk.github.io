package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.72u  reason: invalid class name and case insensitive filesystem */
public final class C1189172u {
    public static final Handler A00 = AnonymousClass0wJ.A0F();

    public static void A00(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }
}
