package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* renamed from: X.72D  reason: invalid class name */
public final class AnonymousClass72D {
    public static Object A00(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(AnonymousClass72D.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
