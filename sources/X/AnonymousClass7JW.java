package X;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.util.Collection;

/* renamed from: X.7JW  reason: invalid class name */
public final class AnonymousClass7JW {
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051 A[LOOP:0: B:20:0x004b->B:22:0x0051, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A01(java.lang.Class r5, boolean r6) {
        /*
            r3 = 0
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0028, Exception -> 0x003a }
            java.lang.reflect.Constructor r1 = r5.getDeclaredConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x0028, Exception -> 0x003a }
            if (r6 == 0) goto L_0x000d
            A05(r1)     // Catch:{ NoSuchMethodException -> 0x0028, Exception -> 0x003a }
            goto L_0x0029
        L_0x000d:
            int r0 = r1.getModifiers()     // Catch:{ NoSuchMethodException -> 0x0028, Exception -> 0x003a }
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)     // Catch:{ NoSuchMethodException -> 0x0028, Exception -> 0x003a }
            if (r0 != 0) goto L_0x0029
            java.lang.String r2 = "Default constructor for "
            java.lang.String r1 = r5.getName()     // Catch:{ NoSuchMethodException -> 0x0028, Exception -> 0x003a }
            java.lang.String r0 = " is not accessible (non-public?): not allowed to try modify access via Reflection: can not instantiate type"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)     // Catch:{ NoSuchMethodException -> 0x0028, Exception -> 0x003a }
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ NoSuchMethodException -> 0x0028, Exception -> 0x003a }
            throw r0     // Catch:{ NoSuchMethodException -> 0x0028, Exception -> 0x003a }
        L_0x0028:
            r1 = 0
        L_0x0029:
            if (r1 == 0) goto L_0x0065
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0032 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ Exception -> 0x0032 }
            return r0
        L_0x0032:
            r4 = move-exception
            r0 = 652(0x28c, float:9.14E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            goto L_0x003d
        L_0x003a:
            r4 = move-exception
            java.lang.String r3 = "Failed to find default constructor of class "
        L_0x003d:
            java.lang.String r2 = r5.getName()
            java.lang.String r1 = ", problem: "
            java.lang.String r0 = r4.getMessage()
            java.lang.String r2 = X.AnonymousClass00U.A0d(r3, r2, r1, r0)
        L_0x004b:
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == 0) goto L_0x0056
            java.lang.Throwable r4 = r4.getCause()
            goto L_0x004b
        L_0x0056:
            r1 = r4
            boolean r0 = r4 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L_0x0075
            boolean r0 = r4 instanceof java.lang.Error
            if (r0 != 0) goto L_0x0075
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r2, r1)
            throw r4
        L_0x0065:
            java.lang.String r2 = "Class "
            java.lang.String r1 = r5.getName()
            java.lang.String r0 = " has no default (no arg) constructor"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)
            java.lang.IllegalArgumentException r4 = X.C18190wL.A0a(r0)
        L_0x0075:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JW.A01(java.lang.Class, boolean):java.lang.Object");
    }

    public static void A05(Member member) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            if (!accessibleObject.isAccessible()) {
                Class<?> declaringClass = member.getDeclaringClass();
                StringBuilder A0s = C18190wL.A0s("Can not access ");
                A0s.append(member);
                A0s.append(" (from class ");
                A0s.append(declaringClass.getName());
                A0s.append("; failed to set access: ");
                throw C18190wL.A0a(C18180wK.A0i(e.getMessage(), A0s));
            }
        }
    }

    public static Class A00(String str) {
        if (str.indexOf(46) < 0) {
            if ("int".equals(str)) {
                return Integer.TYPE;
            }
            if ("long".equals(str)) {
                return Long.TYPE;
            }
            if ("float".equals(str)) {
                return Float.TYPE;
            }
            if ("double".equals(str)) {
                return Double.TYPE;
            }
            if ("boolean".equals(str)) {
                return Boolean.TYPE;
            }
            if ("byte".equals(str)) {
                return Byte.TYPE;
            }
            if ("char".equals(str)) {
                return Character.TYPE;
            }
            if ("short".equals(str)) {
                return Short.TYPE;
            }
            if ("void".equals(str)) {
                return Void.TYPE;
            }
        }
        e = null;
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                return Class.forName(str, true, contextClassLoader);
            } catch (Exception e) {
                e = e;
                while (e.getCause() != null) {
                    e = e.getCause();
                }
            }
        }
        try {
            return Class.forName(str);
        } catch (Exception e2) {
            e = e2;
            if (e == null) {
                while (e.getCause() != null) {
                    e = e.getCause();
                }
                e = e;
            }
            if (e instanceof RuntimeException) {
                throw e;
            }
            throw new ClassNotFoundException(e.getMessage(), e);
        }
    }

    public static void A03(Class cls, Class cls2, Collection collection, boolean z) {
        if (cls != cls2 && cls != null && cls != Object.class) {
            if (z) {
                if (!collection.contains(cls)) {
                    collection.add(cls);
                } else {
                    return;
                }
            }
            for (Class A03 : cls.getInterfaces()) {
                A03(A03, cls2, collection, true);
            }
            A03(cls.getSuperclass(), cls2, collection, true);
        }
    }

    public static String A02(Class cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (cls.isEnum()) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    public static void A04(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        Throwable th2 = th;
        String message = th.getMessage();
        if (!(th instanceof RuntimeException) && !(th instanceof Error)) {
            th = new IllegalArgumentException(message, th2);
        }
        throw th;
    }
}
