package X;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

/* renamed from: X.01Z  reason: invalid class name */
public final class AnonymousClass01Z {
    public static long A00;
    public static Method A01;
    public static Method A02;
    public static Method A03;
    public static Method A04;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            Class<Trace> cls = Trace.class;
            try {
                A00 = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                A03 = cls.getMethod("isTagEnabled", new Class[]{cls2});
                Class<String> cls3 = String.class;
                Class cls4 = Integer.TYPE;
                A01 = cls.getMethod("asyncTraceBegin", new Class[]{cls2, cls3, cls4});
                A02 = cls.getMethod("asyncTraceEnd", new Class[]{cls2, cls3, cls4});
                A04 = cls.getMethod("traceCounter", new Class[]{cls2, cls3, cls4});
            } catch (Exception unused) {
            }
        }
    }

    public static boolean A00() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AnonymousClass01Y.A00();
        }
        try {
            return ((Boolean) A03.invoke((Object) null, new Object[]{Long.valueOf(A00)})).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
