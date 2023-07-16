package X;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0p2  reason: invalid class name and case insensitive filesystem */
public final class C14230p2 {
    public static AtomicBoolean A00 = new AtomicBoolean(false);

    public static void A00() {
        boolean isEnabled = Trace.isEnabled();
        if (A00.compareAndSet(!isEnabled, isEnabled)) {
            C14220p1.A00(4);
        }
    }
}
