package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Cf  reason: invalid class name and case insensitive filesystem */
public final class C02640Cf {
    public static final Method A00;
    public static final Method A01;
    public static final Method A02;
    public static final Method A03;
    public static final Method A04;
    public static volatile boolean A05;

    public static Object A00(Method method, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return method.invoke((Object) null, objArr);
        } catch (IllegalAccessException unused) {
            A05 = false;
            return null;
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (!(targetException instanceof RuntimeException) && !(targetException instanceof Error)) {
                return null;
            }
            throw targetException;
        }
    }

    static {
        boolean z;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Class<String> cls2 = String.class;
            Method method = cls.getMethod("get", new Class[]{cls2});
            Method method2 = cls.getMethod("getBoolean", new Class[]{cls2, Boolean.TYPE});
            Method method3 = cls.getMethod("getLong", new Class[]{cls2, Long.TYPE});
            Method method4 = cls.getMethod("set", new Class[]{cls2, cls2});
            A00 = cls.getMethod("addChangeCallback", new Class[]{Runnable.class});
            A03 = method;
            A02 = method2;
            A01 = method3;
            A04 = method4;
            z = true;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            z = false;
        }
        A05 = z;
    }

    public static String A01(String str) {
        String str2;
        if (!A05 || (str2 = (String) A00(A03, str)) == null) {
            return "";
        }
        return str2;
    }
}
