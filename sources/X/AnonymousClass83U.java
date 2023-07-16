package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.83U  reason: invalid class name */
public final class AnonymousClass83U implements InvocationHandler {
    public final Object A00;

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2 = this.A00;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, C86114wI.A0Z(obj2)).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (ReflectiveOperationException e2) {
            throw C86154wM.A0h(AnonymousClass0wJ.A0t("Reflection failed for method ", method), e2);
        }
    }

    public AnonymousClass83U(Object obj) {
        this.A00 = obj;
    }
}
