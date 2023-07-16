package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.09K  reason: invalid class name */
public final class AnonymousClass09K extends C03470In {
    public static AnonymousClass09K A05;
    public final Method A00;
    public final Method A01;
    public final Method A02;
    public final Method A03;
    public final Method A04;

    public final Class A01(String str) {
        Method method = this.A00;
        if (method == null) {
            return null;
        }
        try {
            return (Class) method.invoke((Object) null, new Object[]{str});
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Constructor A02(Class cls, Class... clsArr) {
        Method method = this.A01;
        if (method == null) {
            return null;
        }
        try {
            return (Constructor) method.invoke(cls, new Object[]{clsArr});
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Field A03(Class cls, String str) {
        Method method = this.A02;
        if (method == null) {
            return null;
        }
        try {
            Field field = (Field) method.invoke(cls, new Object[]{str});
            if (field != null) {
                field.setAccessible(true);
            }
            return field;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Method A04(Class cls, String str, Class... clsArr) {
        Method method = this.A04;
        if (method == null) {
            return null;
        }
        try {
            return (Method) method.invoke(cls, new Object[]{str, clsArr});
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Field[] A05(Class cls) {
        Method method = this.A03;
        if (method == null) {
            return null;
        }
        try {
            return (Field[]) method.invoke(cls, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public AnonymousClass09K() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5 = null;
        Class<Class> cls = Class.class;
        Class<String> cls2 = String.class;
        try {
            method = cls.getDeclaredMethod("forName", new Class[]{cls2});
            Class<Class[]> cls3 = Class[].class;
            try {
                method2 = cls.getDeclaredMethod("getDeclaredMethod", new Class[]{cls2, cls3});
            } catch (Throwable unused) {
                method2 = null;
                method3 = null;
                method4 = null;
                this.A00 = method;
                this.A04 = method2;
                this.A02 = method3;
                this.A03 = method4;
                this.A01 = method5;
            }
            try {
                method3 = cls.getDeclaredMethod("getDeclaredField", new Class[]{cls2});
                try {
                    method4 = cls.getDeclaredMethod("getDeclaredFields", new Class[0]);
                    try {
                        method5 = cls.getDeclaredMethod("getDeclaredConstructor", new Class[]{cls3});
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    method4 = null;
                }
            } catch (Throwable unused4) {
                method3 = null;
                method4 = null;
                this.A00 = method;
                this.A04 = method2;
                this.A02 = method3;
                this.A03 = method4;
                this.A01 = method5;
            }
        } catch (Throwable unused5) {
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            this.A00 = method;
            this.A04 = method2;
            this.A02 = method3;
            this.A03 = method4;
            this.A01 = method5;
        }
        this.A00 = method;
        this.A04 = method2;
        this.A02 = method3;
        this.A03 = method4;
        this.A01 = method5;
    }
}
