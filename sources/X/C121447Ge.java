package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7Ge  reason: invalid class name and case insensitive filesystem */
public final class C121447Ge {
    public static C121447Ge A02 = new C121447Ge();
    public final Map A00 = AnonymousClass0wJ.A0y();
    public final Map A01 = AnonymousClass0wJ.A0y();

    public static AnonymousClass75P A00(C121447Ge r12, Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (superclass != null) {
            AnonymousClass75P r0 = (AnonymousClass75P) r12.A00.get(superclass);
            if (r0 == null) {
                r0 = A00(r12, superclass, (Method[]) null);
            }
            A0y.putAll(r0.A00);
        }
        for (Class cls2 : cls.getInterfaces()) {
            AnonymousClass75P r02 = (AnonymousClass75P) r12.A00.get(cls2);
            if (r02 == null) {
                r02 = A00(r12, cls2, (Method[]) null);
            }
            Iterator A0z = AnonymousClass0wJ.A0z(r02.A00);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                A01((C113526rZ) A0o.getKey(), (AnonymousClass060) A0o.getValue(), cls, A0y);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else if (AnonymousClass066.class.isAssignableFrom(parameterTypes[0])) {
                    i = 1;
                } else {
                    throw C18190wL.A0a("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                AnonymousClass060 value = onLifecycleEvent.value();
                if (length > 1) {
                    if (!AnonymousClass060.class.isAssignableFrom(parameterTypes[1])) {
                        throw C18190wL.A0a("invalid parameter type. second arg must be an event");
                    } else if (value == AnonymousClass060.ON_ANY) {
                        i = 2;
                        if (length > 2) {
                            throw C18190wL.A0a("cannot have more than 2 params");
                        }
                    } else {
                        throw C18190wL.A0a("Second arg is supported only for ON_ANY value");
                    }
                }
                A01(new C113526rZ(method, i), value, cls, A0y);
                z = true;
            }
        }
        AnonymousClass75P r1 = new AnonymousClass75P(A0y);
        r12.A00.put(cls, r1);
        C86154wM.A1U(cls, r12.A01, z);
        return r1;
    }

    public static void A01(C113526rZ r4, AnonymousClass060 r5, Class cls, Map map) {
        Object obj = map.get(r4);
        if (obj == null) {
            map.put(r4, r5);
        } else if (r5 != obj) {
            Method method = r4.A01;
            StringBuilder A0s = C18190wL.A0s(AnonymousClass000.A00(666));
            A0s.append(method.getName());
            A0s.append(" in ");
            A0s.append(cls.getName());
            A0s.append(" already declared with different @OnLifecycleEvent value: previous value ");
            A0s.append(obj);
            throw C18190wL.A0a(C86104wH.A0x(r5, ", new value ", A0s));
        }
    }
}
