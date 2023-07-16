package X;

import java.lang.reflect.Method;

/* renamed from: X.6a2  reason: invalid class name */
public final class AnonymousClass6a2 {
    public static final Method A00;
    public static final Method A01;

    static {
        Method method;
        Method method2;
        Class cls;
        Class<Throwable> cls2 = Throwable.class;
        Method[] methods = cls2.getMethods();
        C04220Ms.A06(methods);
        int length = methods.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i2];
            if (C04220Ms.A0I(method2.getName(), "addSuppressed")) {
                Class[] parameterTypes = method2.getParameterTypes();
                C04220Ms.A06(parameterTypes);
                if (parameterTypes.length == 1) {
                    cls = parameterTypes[0];
                } else {
                    cls = null;
                }
                if (C04220Ms.A0I(cls, cls2)) {
                    break;
                }
            }
            i2++;
        }
        A00 = method2;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method3 = methods[i];
            if (C04220Ms.A0I(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i++;
        }
        A01 = method;
    }
}
