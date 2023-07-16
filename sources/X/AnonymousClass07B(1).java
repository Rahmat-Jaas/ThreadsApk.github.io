package X;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.07B  reason: invalid class name */
public final class AnonymousClass07B {
    public static long A00;
    public static Method A01;

    public static boolean A00() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AnonymousClass07D.A00();
        }
        try {
            Method method = A01;
            if (method == null) {
                Class<Trace> cls = Trace.class;
                A00 = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                method = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
                A01 = method;
            }
            return ((Boolean) method.invoke((Object) null, new Object[]{Long.valueOf(A00)})).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            throw new RuntimeException(cause);
        }
    }
}
