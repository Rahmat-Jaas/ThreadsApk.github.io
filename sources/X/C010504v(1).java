package X;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.04v  reason: invalid class name and case insensitive filesystem */
public class C010504v {
    public static final C002000x A00 = new C002000x();

    public static Class A00(String str, ClassLoader classLoader) {
        try {
            C002000x r0 = A00;
            C002000x r1 = (C002000x) r0.get(classLoader);
            if (r1 == null) {
                r1 = new C002000x();
                r0.put(classLoader, r1);
            }
            Class cls = (Class) r1.get(str);
            if (cls != null) {
                return cls;
            }
            Class<?> cls2 = Class.forName(str, false, classLoader);
            r1.put(str, cls2);
            return cls2;
        } catch (ClassNotFoundException e) {
            throw new C010004l(e, AnonymousClass00U.A0V("Unable to instantiate fragment ", str, ": make sure class name exists"));
        } catch (ClassCastException e2) {
            throw new C010004l(e2, AnonymousClass00U.A0V("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"));
        }
    }

    public Fragment A01(ClassLoader classLoader, String str) {
        try {
            return (Fragment) A00(str, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            throw new C010004l(e, AnonymousClass00U.A0V("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"));
        } catch (IllegalAccessException e2) {
            throw new C010004l(e2, AnonymousClass00U.A0V("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"));
        } catch (NoSuchMethodException e3) {
            throw new C010004l(e3, AnonymousClass00U.A0V("Unable to instantiate fragment ", str, ": could not find Fragment constructor"));
        } catch (InvocationTargetException e4) {
            throw new C010004l(e4, AnonymousClass00U.A0V("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"));
        }
    }
}
