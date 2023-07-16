package X;

import android.os.Trace;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Ch  reason: invalid class name and case insensitive filesystem */
public final class C02660Ch {
    public static final long A00;
    public static final Method A01;
    public static final Method A02;
    public static volatile boolean A03 = true;

    static {
        Class<Trace> cls = Trace.class;
        try {
            Class<?> cls2 = Long.TYPE;
            Method method = cls.getMethod("isTagEnabled", new Class[]{cls2});
            Method method2 = cls.getMethod("setAppTracingAllowed", new Class[]{Boolean.TYPE});
            Field field = cls.getField("TRACE_TAG_APP");
            if (field.getType() == cls2) {
                long j = field.getLong((Object) null);
                A01 = method;
                A02 = method2;
                A00 = j;
            }
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException unused) {
        }
    }

    public static Object A00(Method method, Object... objArr) {
        try {
            return method.invoke((Object) null, objArr);
        } catch (IllegalAccessException unused) {
            A03 = false;
            return null;
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (!(targetException instanceof RuntimeException) && !(targetException instanceof Error)) {
                return null;
            }
            throw targetException;
        }
    }
}
