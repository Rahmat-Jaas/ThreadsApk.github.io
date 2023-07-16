package com.facebook.common.dextricks;

import dalvik.system.DexFile;
import java.lang.reflect.Method;

public final class DexFileLoad {
    public static void init() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static dalvik.system.DexFile loadDex(java.lang.String r5, java.lang.String r6, java.lang.ClassLoader r7) {
        /*
            r4 = 0
            r3 = 0
            if (r7 == 0) goto L_0x001b
            java.lang.reflect.Method r2 = getLoadMethodWithClassLoader()     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x001b }
            r1 = 1
            if (r2 == 0) goto L_0x001b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x001b }
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r6, r0, r7, r4}     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x001b }
            java.lang.Object r0 = r2.invoke(r4, r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x001b }
            dalvik.system.DexFile r0 = (dalvik.system.DexFile) r0     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x001b }
            r4 = r0
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            if (r1 != 0) goto L_0x0022
            dalvik.system.DexFile r4 = dalvik.system.DexFile.loadDex(r5, r6, r3)
        L_0x0022:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexFileLoad.loadDex(java.lang.String, java.lang.String, java.lang.ClassLoader):dalvik.system.DexFile");
    }

    public static Method getLoadMethodWithClassLoader() {
        Method[] declaredMethods = DexFile.class.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            if (!method.getName().equals("loadDex") || method.getParameterTypes().length < 5) {
                i++;
            } else {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }
}
