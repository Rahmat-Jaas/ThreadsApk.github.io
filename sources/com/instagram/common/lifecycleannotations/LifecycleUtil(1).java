package com.instagram.common.lifecycleannotations;

import X.AnonymousClass00U;
import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class LifecycleUtil {
    public static final Map REFERENCE_CLEANERS = AnonymousClass0wJ.A0y();
    public static final Class TAG = LifecycleUtil.class;

    public static Method findReferenceCleanerForClass(Class cls) {
        Map map = REFERENCE_CLEANERS;
        Method method = (Method) map.get(cls);
        if (method != null) {
            return method;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.")) {
            return null;
        }
        try {
            Method declaredMethod = Class.forName(AnonymousClass00U.A0L(name, "LifecycleUtil")).getDeclaredMethod("cleanupReferences", new Class[]{cls});
            map.put(cls, declaredMethod);
            return declaredMethod;
        } catch (ClassNotFoundException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass != null) {
                return findReferenceCleanerForClass(superclass);
            }
            return null;
        } catch (NoSuchMethodException e) {
            AnonymousClass0LU.A05(TAG, "referenceCleanerClass generated incorrectly: %s", e, cls.getCanonicalName());
            return null;
        }
    }

    public static void cleanupReferences(Object obj) {
        Class cls;
        Object[] objArr;
        String str;
        try {
            Class<?> cls2 = obj.getClass();
            Method findReferenceCleanerForClass = findReferenceCleanerForClass(cls2);
            if (findReferenceCleanerForClass != null) {
                findReferenceCleanerForClass.invoke((Object) null, new Object[]{obj});
            } else {
                cls2.getCanonicalName();
            }
        } catch (IllegalAccessException e) {
            e = e;
            cls = TAG;
            objArr = new Object[]{obj.getClass().getCanonicalName()};
            str = "unable to access cleanup for: %s";
            AnonymousClass0LU.A05(cls, str, e, objArr);
        } catch (InvocationTargetException e2) {
            e = e2;
            cls = TAG;
            objArr = new Object[]{obj.getClass().getCanonicalName()};
            str = "unable to invoke cleanup for: %s";
            AnonymousClass0LU.A05(cls, str, e, objArr);
        }
    }
}
