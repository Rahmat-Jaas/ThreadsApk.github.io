package X;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* renamed from: X.6J3  reason: invalid class name */
public final class AnonymousClass6J3 {
    /* JADX INFO: finally extract failed */
    public static Object A00(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
