package X;

import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: X.08e  reason: invalid class name and case insensitive filesystem */
public final class C017208e {
    public static Class A05 = null;
    public static Method A06 = null;
    public static boolean A07 = false;
    public static boolean A08 = false;
    public static final Method A09;
    public static final Method A0A;
    public static final Method A0B = A02("getDeclaredConstructor", Class[].class);
    public static final Method A0C = A02("getDeclaredField", String.class);
    public static final Method A0D;
    public static final Method A0E;
    public static final boolean A0F;
    public static final boolean A0G;
    public static final boolean A0H;
    public static final Method A0I = A02("getDeclaredFields", new Class[0]);
    public static final Map A0J;
    public boolean A00;
    public boolean A01;
    public boolean A02 = false;
    public final int A03;
    public final List A04;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a7, code lost:
        if (r9 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010a A[Catch:{ Exception -> 0x010e }] */
    static {
        /*
            java.lang.String r6 = "forName"
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 1
            r4 = 0
            r1 = 30
            r0 = 0
            if (r2 >= r1) goto L_0x000c
            r0 = 1
        L_0x000c:
            A0F = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            A0J = r2
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.String r0 = "Z"
            r2.put(r1, r0)
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.String r0 = "B"
            r2.put(r1, r0)
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.String r0 = "C"
            r2.put(r1, r0)
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.String r0 = "S"
            r2.put(r1, r0)
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.String r0 = "I"
            r2.put(r1, r0)
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.String r0 = "J"
            r2.put(r1, r0)
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.String r0 = "F"
            r2.put(r1, r0)
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.String r0 = "D"
            r2.put(r1, r0)
            java.lang.String r8 = "ApiBlockListExemption"
            r12 = 0
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r2}     // Catch:{ Exception -> 0x0073 }
            java.lang.reflect.Method r10 = r3.getDeclaredMethod(r6, r0)     // Catch:{ Exception -> 0x0073 }
            r10.setAccessible(r5)     // Catch:{ Exception -> 0x0077 }
            java.lang.String r1 = "getDeclaredMethod"
            java.lang.Class<java.lang.Class[]> r0 = java.lang.Class[].class
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r0}     // Catch:{ Exception -> 0x0077 }
            java.lang.reflect.Method r9 = r3.getDeclaredMethod(r1, r0)     // Catch:{ Exception -> 0x0077 }
            r9.setAccessible(r5)     // Catch:{ Exception -> 0x006f }
            goto L_0x0071
        L_0x006f:
            r1 = move-exception
            goto L_0x0079
        L_0x0071:
            r11 = 0
            goto L_0x007f
        L_0x0073:
            r1 = move-exception
            r10 = r12
            r9 = r12
            goto L_0x0079
        L_0x0077:
            r1 = move-exception
            r9 = r12
        L_0x0079:
            java.lang.String r0 = "Failed to init api exemption dependencies."
            android.util.Log.e(r8, r0, r1)
            r11 = 1
        L_0x007f:
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0095 }
            java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r1, r0}     // Catch:{ NoSuchMethodException -> 0x0095 }
            java.lang.reflect.Method r7 = r3.getDeclaredMethod(r6, r0)     // Catch:{ NoSuchMethodException -> 0x0095 }
            r7.setAccessible(r5)     // Catch:{ NoSuchMethodException -> 0x0093 }
            goto L_0x00a4
        L_0x0093:
            r0 = move-exception
            goto L_0x0097
        L_0x0095:
            r0 = move-exception
            r7 = r12
        L_0x0097:
            java.lang.String r1 = "Could not get Class.forName with CL. Msg: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            android.util.Log.w(r8, r0)
        L_0x00a4:
            if (r10 == 0) goto L_0x00a9
            r6 = 1
            if (r9 != 0) goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            A0A = r10
            A09 = r7
            A0D = r9
            A0H = r6
            A0G = r11
            if (r11 == 0) goto L_0x0101
            java.lang.String r3 = "Failed"
        L_0x00b8:
            java.lang.String r2 = "Yes"
            java.lang.String r1 = "No"
            r0 = r1
            if (r6 == 0) goto L_0x00c0
            r0 = r2
        L_0x00c0:
            if (r7 != 0) goto L_0x00c3
            r2 = r1
        L_0x00c3:
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r0, r2}
            java.lang.String r0 = "We %s getting the needed hidden api deps on this platform. Can we try to remove hidden APIs: %s. Got Class.forName with ClassLoader: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.w(r8, r0)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r1 = new java.lang.Class[]{r0}
            java.lang.String r0 = "getDeclaredField"
            java.lang.reflect.Method r0 = A02(r0, r1)
            A0C = r0
            java.lang.Class[] r1 = new java.lang.Class[r4]
            java.lang.String r0 = "getDeclaredFields"
            java.lang.reflect.Method r0 = A02(r0, r1)
            A0I = r0
            java.lang.Class<java.lang.Class[]> r0 = java.lang.Class[].class
            java.lang.Class[] r1 = new java.lang.Class[]{r0}
            java.lang.String r0 = "getDeclaredConstructor"
            java.lang.reflect.Method r0 = A02(r0, r1)
            A0B = r0
            java.lang.Class<java.lang.reflect.Constructor> r3 = java.lang.reflect.Constructor.class
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class[] r2 = new java.lang.Class[]{r0}
            java.lang.String r1 = "newInstance"
            goto L_0x0104
        L_0x0101:
            java.lang.String r3 = "Succeeded"
            goto L_0x00b8
        L_0x0104:
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x010e }
            if (r0 == 0) goto L_0x011c
            r0.setAccessible(r5)     // Catch:{ Exception -> 0x010e }
            goto L_0x011c
        L_0x010e:
            java.lang.String r0 = java.util.Arrays.toString(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1, r0}
            java.lang.String r0 = "Could not get %s.%s (%s)"
            java.lang.String.format(r0, r1)
            r0 = r12
        L_0x011c:
            A0E = r0
            A05 = r12
            A06 = r12
            A08 = r4
            A07 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C017208e.<clinit>():void");
    }

    public static String A01(Class<?> cls) {
        String str;
        String A002;
        if (cls == null) {
            throw new IllegalArgumentException();
        } else if (Void.TYPE.equals(cls)) {
            return "V";
        } else {
            if (cls.isArray()) {
                cls = cls.getComponentType();
                str = "[";
                if (cls == null) {
                    throw new IllegalStateException();
                }
            } else {
                str = "";
            }
            if (!cls.isPrimitive() || (A002 = (String) A0J.get(cls)) == null) {
                A002 = A00(cls);
            }
            return AnonymousClass00U.A0L(str, A002);
        }
    }

    public static Method A02(String str, Class... clsArr) {
        Class<Class> cls = Class.class;
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            if (declaredMethod == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Exception unused) {
            String.format("Could not get %s.%s (%s)", new Object[]{cls, str, Arrays.toString(clsArr)});
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03() {
        /*
            r12 = this;
            boolean r0 = r12.A02
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            boolean r0 = r12.A01
            r5 = 1
            if (r0 != 0) goto L_0x003c
            boolean r0 = A0F
            if (r0 != 0) goto L_0x002c
            int r4 = r12.A03
            r0 = 2
            r1 = 0
            r3 = 30
            java.lang.Object[] r2 = new java.lang.Object[r0]
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r1] = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r2[r5] = r1
            if (r4 >= r3) goto L_0x00e0
            java.lang.String r0 = "removeHiddenApiCheckHardening: The current OS version and our target SDK version %d has hidden api hardening check off for compat compatibility by default.."
            java.lang.String.format(r0, r2)
        L_0x002c:
            r2 = 1
        L_0x002d:
            java.lang.String r1 = "ApiBlockListExemption"
            if (r2 != 0) goto L_0x0036
            java.lang.String r0 = "Removing hidden api check failed."
            android.util.Log.w(r1, r0)
        L_0x0036:
            r0 = r2 ^ 1
            r12.A00 = r0
            r12.A01 = r5
        L_0x003c:
            boolean r0 = A07
            if (r0 != 0) goto L_0x0078
            java.lang.String r8 = "ApiBlockListExemption"
            boolean r0 = A0H
            r11 = 0
            if (r0 == 0) goto L_0x00dd
            boolean r0 = A0G
            if (r0 != 0) goto L_0x00dd
            java.lang.reflect.Method r1 = A0A
            if (r1 == 0) goto L_0x00dd
            java.lang.reflect.Method r10 = A0D
            if (r10 == 0) goto L_0x00dd
            java.lang.Class r0 = A05
            if (r0 == 0) goto L_0x007e
            java.lang.reflect.Method r0 = A06
            if (r0 == 0) goto L_0x007e
        L_0x005b:
            r1 = 1
        L_0x005c:
            boolean r0 = A08
            r0 = r0 | r1
            A08 = r0
            A07 = r5
            if (r1 != 0) goto L_0x0078
            boolean r0 = r12.A00
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "succeeded"
        L_0x006b:
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Enable api exemption failed. Hidden API check removal was a %s."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.e(r8, r0)
        L_0x0078:
            boolean r0 = A08
            return r0
        L_0x007b:
            java.lang.String r0 = "failed"
            goto L_0x006b
        L_0x007e:
            java.lang.String r0 = "com.android.internal.os.ZygoteInit"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ Exception -> 0x00d7 }
            r9 = 0
            java.lang.Object r7 = r1.invoke(r9, r0)     // Catch:{ Exception -> 0x00d7 }
            java.lang.Class r7 = (java.lang.Class) r7     // Catch:{ Exception -> 0x00d7 }
            if (r7 == 0) goto L_0x00dd
            r6 = 2
            java.lang.String[] r4 = new java.lang.String[r6]
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            java.lang.String r1 = "setApiBlacklistExemptions"
            java.lang.String r0 = "setApiDenylistExemptions"
            if (r3 > r2) goto L_0x00cd
            r4[r11] = r1
            r4[r5] = r0
        L_0x009e:
            r3 = 0
        L_0x009f:
            r1 = r4[r3]
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ Exception -> 0x00b7 }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ Exception -> 0x00b7 }
            java.lang.Object r0 = r10.invoke(r7, r0)     // Catch:{ Exception -> 0x00b7 }
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch:{ Exception -> 0x00b7 }
            if (r0 == 0) goto L_0x00c6
            r0.setAccessible(r5)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00c6
        L_0x00b7:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "Failed to get api exemption method %s."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.w(r8, r0, r2)
            r0 = r9
        L_0x00c6:
            int r3 = r3 + 1
            if (r0 != 0) goto L_0x00d2
            if (r3 >= r6) goto L_0x00dd
            goto L_0x009f
        L_0x00cd:
            r4[r11] = r0
            r4[r5] = r1
            goto L_0x009e
        L_0x00d2:
            A05 = r7
            A06 = r0
            goto L_0x005b
        L_0x00d7:
            r1 = move-exception
            java.lang.String r0 = "Failed to init api exemption dependencies."
            android.util.Log.e(r8, r0, r1)
        L_0x00dd:
            r1 = 0
            goto L_0x005c
        L_0x00e0:
            java.lang.String r0 = "removeHiddenApiCheckHardening: Will attempt to remove hidden api check hardening the hard way (pun intended) for the OS version %d and our target SDK version %d."
            java.lang.String.format(r0, r2)
            boolean r0 = com.facebook.common.hiddenapis.exempt.HiddenApisNative.sInited
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = "no"
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "removeHiddenApiCheckHardening: Target sdk %d success: %s"
            java.lang.String.format(r0, r1)
        L_0x00f4:
            r2 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C017208e.A03():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (A0G != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C017208e(int r5, boolean r6) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.A02 = r0
            boolean r0 = A0F
            if (r0 != 0) goto L_0x000f
            boolean r1 = A0G
            r0 = 0
            if (r1 == 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r4.A01 = r0
            boolean r0 = A0G
            r4.A00 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r4.A04 = r0
            r4.A03 = r5
            r4.A02 = r6
            java.lang.Class r0 = r4.getClass()
            java.lang.String r3 = r0.getName()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r6 == 0) goto L_0x0041
            java.lang.String r0 = ""
        L_0x0037:
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r1, r0}
            java.lang.String r0 = "Creating %s for target sdk version %d [OS: %d] we will%s try to enable hidden api access if needed."
            java.lang.String.format(r0, r1)
            return
        L_0x0041:
            java.lang.String r0 = " NOT"
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C017208e.<init>(int, boolean):void");
    }

    public static String A00(Class cls) {
        String name;
        String str;
        Class<?> enclosingClass = cls.getEnclosingClass();
        if (enclosingClass != null) {
            name = enclosingClass.getName();
            str = cls.getSimpleName();
        } else {
            name = cls.getName();
            str = null;
        }
        StringBuilder sb = new StringBuilder("L");
        sb.append(name.replace('.', '/'));
        if (str != null) {
            sb.append('$');
            sb.append(str);
        }
        sb.append(BasicHeaderValueParser.PARAM_DELIMITER);
        return sb.toString();
    }

    public final boolean A04(String... strArr) {
        boolean z;
        Object[] objArr;
        String str;
        if (!A03()) {
            z = false;
            objArr = new Object[]{Arrays.toString(strArr)};
            str = "Cannot exempt these hiddden apis: %s";
        } else {
            z = false;
            objArr = new Object[]{Arrays.toString(strArr)};
            str = "Exemption of %s is not supported";
        }
        String.format(str, objArr);
        return z;
    }
}
