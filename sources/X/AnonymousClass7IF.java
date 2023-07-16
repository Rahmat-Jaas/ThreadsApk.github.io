package X;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.DefaultLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/* renamed from: X.7IF  reason: invalid class name */
public final class AnonymousClass7IF {
    public static final AnonymousClass7IF A00 = new AnonymousClass7IF();
    public static final Map A01 = AnonymousClass0wJ.A0y();
    public static final Map A02 = AnonymousClass0wJ.A0y();

    public static final C14260p5 A02(Object obj) {
        C14260p5 reflectiveGenericLifecycleObserver;
        C147858q2 r1;
        C14260p5 r6;
        boolean z = obj instanceof C147858q2;
        if (obj instanceof C14260p5) {
            if (z) {
                r1 = (C147858q2) obj;
                r6 = (C14260p5) obj;
            }
            return (C14260p5) obj;
        } else if (z) {
            r1 = (C147858q2) obj;
            r6 = null;
        } else {
            Class<?> cls = obj.getClass();
            if (A00.A00(cls) == 2) {
                Object obj2 = A01.get(cls);
                C04220Ms.A0A(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    A01(obj, (Constructor) list.get(0));
                    new SingleGeneratedAdapterObserver();
                    throw null;
                }
                int size = list.size();
                C141878dM[] r12 = new C141878dM[size];
                for (int i = 0; i < size; i++) {
                    r12[i] = A01(obj, (Constructor) list.get(i));
                }
                obj = new CompositeGeneratedAdaptersObserver(r12);
                return (C14260p5) obj;
            }
            reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(obj);
            return reflectiveGenericLifecycleObserver;
        }
        reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter(r1, r6);
        return reflectiveGenericLifecycleObserver;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r0.booleanValue() != false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A00(java.lang.Class r11) {
        /*
            r10 = this;
            java.util.Map r5 = A02
            java.lang.Number r0 = X.C86124wJ.A0j(r11, r5)
            if (r0 == 0) goto L_0x000d
            int r0 = r0.intValue()
            return r0
        L_0x000d:
            java.lang.String r0 = r11.getCanonicalName()
            r6 = 1
            if (r0 == 0) goto L_0x008f
            java.lang.Package r0 = r11.getPackage()     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0077 }
            java.lang.String r7 = r11.getCanonicalName()     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0077 }
            if (r0 == 0) goto L_0x0069
            java.lang.String r4 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0077 }
        L_0x0022:
            X.C04220Ms.A09(r4)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0077 }
            int r3 = r4.length()     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0077 }
            r2 = 0
            if (r3 == 0) goto L_0x0035
            X.C04220Ms.A06(r7)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0077 }
            int r0 = r3 + 1
            java.lang.String r7 = X.C86134wK.A0q(r7, r0)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0077 }
        L_0x0035:
            X.C04220Ms.A09(r7)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0077 }
            java.lang.String r1 = "."
            java.lang.String r0 = "_"
            java.lang.String r1 = X.AnonymousClass8bQ.A0l(r7, r1, r0, r2)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0077 }
            java.lang.String r0 = "_LifecycleAdapter"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0077 }
            if (r3 == 0) goto L_0x004e
            r0 = 46
            java.lang.String r1 = X.AnonymousClass00U.A0N(r4, r1, r0)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0077 }
        L_0x004e:
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0077 }
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>"
            X.C04220Ms.A0C(r1, r0)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0077 }
            java.lang.Class[] r0 = new java.lang.Class[]{r11}     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0077 }
            java.lang.reflect.Constructor r2 = r1.getDeclaredConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0077 }
            boolean r0 = r2.isAccessible()     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0077 }
            if (r0 != 0) goto L_0x006c
            r2.setAccessible(r6)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0077 }
            goto L_0x006c
        L_0x0069:
            java.lang.String r4 = ""
            goto L_0x0022
        L_0x006c:
            java.util.Map r1 = A01
            java.util.List r0 = X.C18180wK.A0n(r2)
            r1.put(r11, r0)
            goto L_0x0110
        L_0x0077:
            r0 = move-exception
            java.lang.RuntimeException r2 = X.C86114wI.A0k(r0)
            throw r2
        L_0x007d:
            X.7Ge r9 = X.C121447Ge.A02
            java.util.Map r8 = r9.A01
            java.lang.Object r0 = r8.get(r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0094
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00b1
        L_0x008f:
            r0 = 1
        L_0x0090:
            X.C86154wM.A1T(r11, r5, r0)
            return r0
        L_0x0094:
            java.lang.reflect.Method[] r7 = r11.getDeclaredMethods()     // Catch:{ NoClassDefFoundError -> 0x0113 }
            int r4 = r7.length
            r3 = 0
            r2 = 0
        L_0x009b:
            if (r2 >= r4) goto L_0x00ae
            r1 = r7[r2]
            java.lang.Class<androidx.lifecycle.OnLifecycleEvent> r0 = androidx.lifecycle.OnLifecycleEvent.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            if (r0 == 0) goto L_0x00ab
            X.C121447Ge.A00(r9, r11, r7)
            goto L_0x008f
        L_0x00ab:
            int r2 = r2 + 1
            goto L_0x009b
        L_0x00ae:
            X.C86154wM.A1U(r11, r8, r3)
        L_0x00b1:
            java.lang.Class r1 = r11.getSuperclass()
            r7 = 0
            if (r1 == 0) goto L_0x00d5
            java.lang.Class<X.065> r0 = X.AnonymousClass065.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x00d5
            int r0 = r10.A00(r1)
            if (r0 == r6) goto L_0x008f
            java.util.Map r0 = A01
            java.lang.Object r0 = r0.get(r1)
            X.C04220Ms.A0A(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r7 = X.C18200wM.A0s(r0)
        L_0x00d5:
            java.lang.Class[] r4 = r11.getInterfaces()
            X.C04220Ms.A06(r4)
            r3 = 0
            int r2 = r4.length
        L_0x00de:
            if (r3 >= r2) goto L_0x0109
            r1 = r4[r3]
            if (r1 == 0) goto L_0x0106
            java.lang.Class<X.065> r0 = X.AnonymousClass065.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x0106
            int r0 = r10.A00(r1)
            if (r0 == r6) goto L_0x008f
            if (r7 != 0) goto L_0x00f8
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
        L_0x00f8:
            java.util.Map r0 = A01
            java.lang.Object r0 = r0.get(r1)
            X.C04220Ms.A0A(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r7.addAll(r0)
        L_0x0106:
            int r3 = r3 + 1
            goto L_0x00de
        L_0x0109:
            if (r7 == 0) goto L_0x008f
            java.util.Map r0 = A01
            r0.put(r11, r7)
        L_0x0110:
            r0 = 2
            goto L_0x0090
        L_0x0113:
            r1 = move-exception
            java.lang.String r0 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IF.A00(java.lang.Class):int");
    }

    public static final C141878dM A01(Object obj, Constructor constructor) {
        try {
            C04220Ms.A06(constructor.newInstance(new Object[]{obj}));
            return null;
        } catch (IllegalAccessException e) {
            throw C86114wI.A0k(e);
        } catch (InstantiationException e2) {
            throw C86114wI.A0k(e2);
        } catch (InvocationTargetException e3) {
            throw C86114wI.A0k(e3);
        }
    }
}
