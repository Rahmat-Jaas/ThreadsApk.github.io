package X;

import android.os.HandlerThread;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0oM  reason: invalid class name and case insensitive filesystem */
public final class C13820oM {
    public static final Map A00 = Collections.synchronizedMap(new HashMap());

    public static final void A00(HandlerThread handlerThread) {
        try {
            Map map = A00;
            C04220Ms.A08(map);
            map.put(handlerThread.getName(), new WeakReference(handlerThread));
        } catch (Exception unused) {
        }
    }
}
