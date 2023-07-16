package com.facebook.common.hiddenapis.exempt;

import X.AnonymousClass0K9;
import X.C03410If;
import android.os.Build;
import dalvik.system.VMStack;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import jdk.internal.reflect.Reflection;

public class HiddenApis$TestGetCallingClassClass {
    public static boolean testJdkInternalReflectGetCallingClass() {
        AnonymousClass0K9 r6 = C03410If.A0C;
        Object[] objArr = new Object[0];
        try {
            Class callerClass = Reflection.getCallerClass();
            Class<HiddenApis$TestGetCallingClassClass> cls = HiddenApis$TestGetCallingClassClass.class;
            if (!cls.equals(callerClass)) {
                r6.A07("Cannot call jdk.internal.reflect.Reflection.getCallerClass on this platform. Got result: %s but expected: %s", callerClass, cls);
                return false;
            }
            Object[] objArr2 = new Object[0];
            return true;
        } catch (NoClassDefFoundError | NoSuchMethodError e) {
            r6.A0C(e, "Cannot call jdk.internal.reflect.Reflection.getCallerClass on this platform", new Object[0]);
            return false;
        }
    }

    public static boolean testSunReflectGetCallingClass() {
        if (33 > Build.VERSION.SDK_INT) {
            AnonymousClass0K9 r5 = C03410If.A0C;
            Object[] objArr = new Object[0];
            try {
                Class callerClass = sun.reflect.Reflection.getCallerClass();
                Class<HiddenApis$TestGetCallingClassClass> cls = HiddenApis$TestGetCallingClassClass.class;
                if (!cls.equals(callerClass)) {
                    r5.A07("Cannot call sun.reflect.Reflection.getCallerClass on this platform. Got result: %s but expected: %s", callerClass, cls);
                    return false;
                }
                Object[] objArr2 = new Object[0];
                return true;
            } catch (NoClassDefFoundError | NoSuchMethodError e) {
                r5.A0C(e, "Cannot call sun.reflect.Reflection.getCallerClass on this platform", new Object[0]);
            }
        }
        return false;
    }

    public static boolean testVMStackGetCallingClassLoader() {
        AnonymousClass0K9 r5 = C03410If.A0C;
        Object[] objArr = new Object[0];
        try {
            ClassLoader callingClassLoader = VMStack.getCallingClassLoader();
            ClassLoader classLoader = HiddenApis$TestGetCallingClassClass.class.getClassLoader();
            if (classLoader == null || !classLoader.equals(callingClassLoader)) {
                r5.A07("Cannot call VMStack.getCallingClassLoader on this platform. Got result: %s but expected: %s", callingClassLoader, classLoader);
                return false;
            }
            Object[] objArr2 = new Object[0];
            return false;
        } catch (NoClassDefFoundError | NoSuchMethodError e) {
            r5.A0C(e, "Cannot call VMStack.getCallingClassLoader on this platform", new Object[0]);
            return false;
        }
    }

    public static boolean callAndCheckVMStackGetStackClass2(Method method) {
        method.getClass();
        AnonymousClass0K9 r4 = C03410If.A0C;
        Object[] objArr = {method.getDeclaringClass(), method.getName()};
        try {
            Class cls = (Class) method.invoke((Object) null, new Object[0]);
            Class<HiddenApis$TestGetCallingClassClass> cls2 = HiddenApis$TestGetCallingClassClass.class;
            if (!cls2.equals(cls)) {
                r4.A07("Cannot call %s.%s on this platform. Got result: %s but expected: %s", method.getDeclaringClass(), method.getName(), cls, cls2);
                return false;
            }
            Object[] objArr2 = {method.getDeclaringClass(), method.getName()};
            return true;
        } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            r4.A0C(e, "Cannot call %s.%s on this platform", method.getDeclaringClass(), method.getName());
            return false;
        }
    }
}
