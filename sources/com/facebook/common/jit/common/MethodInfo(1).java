package com.facebook.common.jit.common;

import X.AnonymousClass00U;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MethodInfo {
    public static final Map A05;
    public static final Map A06;
    public final Class A00;
    public final String A01;
    public final String A02;
    public final Constructor A03;
    public final Method A04;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0032
            boolean r0 = r4 instanceof com.facebook.common.jit.common.MethodInfo
            if (r0 == 0) goto L_0x0032
            com.facebook.common.jit.common.MethodInfo r4 = (com.facebook.common.jit.common.MethodInfo) r4
            java.lang.Class r1 = r3.A00
            java.lang.Class r0 = r4.A00
            if (r1 != 0) goto L_0x004f
            if (r0 != 0) goto L_0x0032
        L_0x0011:
            java.lang.reflect.Method r1 = r3.A04
            java.lang.reflect.Method r0 = r4.A04
            if (r1 != 0) goto L_0x0048
            if (r0 != 0) goto L_0x0032
        L_0x0019:
            java.lang.reflect.Constructor r1 = r3.A03
            java.lang.reflect.Constructor r0 = r4.A03
            if (r1 != 0) goto L_0x0041
            if (r0 != 0) goto L_0x0032
        L_0x0021:
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            if (r1 != 0) goto L_0x003a
            if (r0 != 0) goto L_0x0032
        L_0x0029:
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r4.A02
            if (r1 != 0) goto L_0x0033
            if (r0 != 0) goto L_0x0032
        L_0x0031:
            r2 = 1
        L_0x0032:
            return r2
        L_0x0033:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0032
            goto L_0x0031
        L_0x003a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0032
            goto L_0x0029
        L_0x0041:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0032
            goto L_0x0021
        L_0x0048:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0032
            goto L_0x0019
        L_0x004f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0032
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.jit.common.MethodInfo.equals(java.lang.Object):boolean");
    }

    static {
        HashMap hashMap = new HashMap(9);
        A05 = hashMap;
        hashMap.put(Byte.TYPE, "B");
        hashMap.put(Character.TYPE, "C");
        hashMap.put(Short.TYPE, "S");
        hashMap.put(Integer.TYPE, "I");
        hashMap.put(Long.TYPE, "J");
        hashMap.put(Float.TYPE, "F");
        hashMap.put(Double.TYPE, "D");
        hashMap.put(Void.TYPE, "V");
        hashMap.put(Boolean.TYPE, "Z");
        HashMap hashMap2 = new HashMap(9);
        A06 = hashMap2;
        hashMap2.put('B', Byte.TYPE);
        hashMap2.put('C', Character.TYPE);
        hashMap2.put('S', Short.TYPE);
        hashMap2.put('I', Integer.TYPE);
        hashMap2.put('J', Long.TYPE);
        hashMap2.put('F', Float.TYPE);
        hashMap2.put('D', Double.TYPE);
        hashMap2.put('V', Void.TYPE);
        hashMap2.put('Z', Boolean.TYPE);
    }

    public static String A00(Class cls) {
        StringBuilder sb;
        String str;
        String str2 = (String) A05.get(cls);
        if (str2 != null) {
            return str2;
        }
        if (cls.isArray()) {
            sb = new StringBuilder("[");
            str = A00(cls.getComponentType());
        } else {
            sb = new StringBuilder("L");
            sb.append(cls.getName().replace('.', '/'));
            str = ";";
        }
        sb.append(str);
        return sb.toString();
    }

    public static String A01(Class cls, Class[] clsArr) {
        StringBuilder sb = new StringBuilder("(");
        for (Class A002 : clsArr) {
            sb.append(A00(A002));
        }
        sb.append(')');
        sb.append(A00(cls));
        return sb.toString();
    }

    public static boolean A02(Class cls, List list, int i) {
        if (i > 0) {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            do {
                sb.append('[');
                i2++;
            } while (i2 < i);
            String obj = sb.toString();
            String str = (String) A05.get(cls);
            StringBuilder sb2 = new StringBuilder();
            if (str != null) {
                sb2.append(obj);
            } else {
                sb2.append(obj);
                sb2.append("L");
                sb2.append(cls.getName());
                str = ";";
            }
            sb2.append(str);
            String obj2 = sb2.toString();
            try {
                Class<?> cls2 = Class.forName(obj2);
                if (cls2 == null) {
                    return false;
                }
                list.add(cls2);
                return true;
            } catch (ClassNotFoundException | NoClassDefFoundError e) {
                Log.w("JitMethodInfo", String.format("Cannot find array class: %s", new Object[]{obj2}), e);
                return false;
            }
        } else {
            throw new IllegalArgumentException(AnonymousClass00U.A0S("Array count ", " is not valid", i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a5, code lost:
        java.lang.String.format("Did NOT find constructor %s %s with types: %s", new java.lang.Object[]{r9.getName(), r5, java.util.Arrays.toString(r8)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b8, code lost:
        r1 = new java.lang.IllegalArgumentException("Dest array is not big enough");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c0, code lost:
        r1 = new java.lang.IllegalArgumentException("Src array lacks the num of needed elements");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c7, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c8, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        android.util.Log.w("JitMethodInfo", java.lang.String.format("Cannot find class: %s for method: %s sig: %s", new java.lang.Object[]{r6, r5, r4}), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01d6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01e1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01e2, code lost:
        android.util.Log.w("JitMethodInfo", java.lang.String.format("Programming Error: class: %s for method: %s sig: %s", new java.lang.Object[]{r6, r5, r4}), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01ef, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f6, code lost:
        java.lang.String.format("Signature %s is malformed. Class %s not found", new java.lang.Object[]{r4, r0});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0101, code lost:
        r8 = (java.lang.Class[]) r1.toArray(new java.lang.Class[r1.size()]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010d, code lost:
        if (r8 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0111, code lost:
        if (r9 == null) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0119, code lost:
        if ("<clinit>".equals(r5) == false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0126, code lost:
        return new com.facebook.common.jit.common.MethodInfo(r9, r5, A01(java.lang.Void.TYPE, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012d, code lost:
        if ("<init>".equals(r5) != false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012f, code lost:
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r2 = r9.getDeclaredMethod(r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0135, code lost:
        if (r2 == null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0154, code lost:
        return new com.facebook.common.jit.common.MethodInfo((java.lang.Class) r9, r5, A01(r2.getReturnType(), r2.getParameterTypes()), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r2 = r9.getDeclaredConstructor(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0178, code lost:
        if (r2 == null) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017f, code lost:
        if (r9.getEnclosingClass() != null) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0181, code lost:
        r1 = r8.length;
        r0 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0184, code lost:
        if (r0 >= r0) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0186, code lost:
        if (r1 >= r1) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0188, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0189, code lost:
        if (r0 < r1) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x018b, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r2 = r9.getDeclaredConstructor(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0192, code lost:
        if (r2 == null) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01a4, code lost:
        return new com.facebook.common.jit.common.MethodInfo((java.lang.Class) r9, r5, A01(java.lang.Void.TYPE, r2.getParameterTypes()), (java.lang.reflect.Constructor) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0138 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x017b */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c8 A[ExcHandler: ClassNotFoundException | NoClassDefFoundError (r2v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:4:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01e1 A[ExcHandler: Error | RuntimeException (r2v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:108:0x01cb] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:67:0x0131=Splitter:B:67:0x0131, B:97:0x0195=Splitter:B:97:0x0195, B:71:0x0138=Splitter:B:71:0x0138, B:84:0x017b=Splitter:B:84:0x017b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.common.jit.common.MethodInfo getMethod(java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r18 = 0
            r12 = 2
            r17 = 1
            r11 = 0
            java.lang.String r3 = "JitMethodInfo"
            r6 = r19
            r5 = r20
            r4 = r21
            if (r19 == 0) goto L_0x01d7
            if (r20 == 0) goto L_0x01d7
            if (r21 == 0) goto L_0x01d7
            java.lang.Class r9 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            char r1 = r4.charAt(r11)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            r0 = 40
            if (r1 == r0) goto L_0x0038
            java.lang.Object[] r1 = new java.lang.Object[]{r4}     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = "Signature %s is malformed. No '(' at the front"
        L_0x0026:
            java.lang.String.format(r0, r1)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
        L_0x0029:
            java.lang.String r1 = "Cannot find class: %s for method: %s sig: %s. Cannot parse sig"
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r5, r4}     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            android.util.Log.w(r3, r0)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            goto L_0x0110
        L_0x0038:
            r0 = 41
            int r10 = r4.indexOf(r0)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            if (r10 >= 0) goto L_0x0047
            java.lang.Object[] r1 = new java.lang.Object[]{r4}     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = "Signature %s is malformed. No ')'"
            goto L_0x0026
        L_0x0047:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            r1.<init>()     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            r2 = 1
        L_0x004d:
            if (r2 >= r10) goto L_0x0101
            char r15 = r4.charAt(r2)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            r13 = 0
        L_0x0054:
            r0 = 91
            if (r15 != r0) goto L_0x0061
            int r13 = r13 + 1
            int r2 = r2 + 1
            char r15 = r4.charAt(r2)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            goto L_0x0054
        L_0x0061:
            r16 = 0
            if (r13 <= 0) goto L_0x0067
            r16 = 1
        L_0x0067:
            java.util.Map r0 = A06     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.Character r14 = java.lang.Character.valueOf(r15)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.Object r7 = r0.get(r14)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.Class r7 = (java.lang.Class) r7     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r8 = "Signature %s is malformed. Cannot get array type for %s."
            if (r7 == 0) goto L_0x008e
            if (r16 == 0) goto L_0x0088
            boolean r0 = A02(r7, r1, r13)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            if (r0 != 0) goto L_0x008b
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            r1[r11] = r21     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = r7.getName()     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            goto L_0x00cd
        L_0x0088:
            r1.add(r7)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
        L_0x008b:
            int r2 = r2 + 1
            goto L_0x004d
        L_0x008e:
            r0 = 76
            if (r15 == r0) goto L_0x0093
            goto L_0x00db
        L_0x0093:
            r0 = 59
            int r7 = r4.indexOf(r0, r2)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            if (r7 >= 0) goto L_0x00a6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r0}     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = "Signature %s is malformed. No end ';' at idx: %d"
            goto L_0x0026
        L_0x00a6:
            int r0 = r2 + 1
            if (r7 > r0) goto L_0x00ab
            goto L_0x00e3
        L_0x00ab:
            java.lang.String r14 = r4.substring(r0, r7)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            r2 = 47
            r0 = 46
            java.lang.String r0 = r14.replace(r2, r0)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x00f6, ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            if (r2 == 0) goto L_0x0029
            if (r16 == 0) goto L_0x00d4
            boolean r0 = A02(r2, r1, r13)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            if (r0 != 0) goto L_0x00d7
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            r1[r11] = r21     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = r2.getName()     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
        L_0x00cd:
            r1[r17] = r0     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String.format(r8, r1)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            goto L_0x0029
        L_0x00d4:
            r1.add(r2)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
        L_0x00d7:
            int r2 = r7 + 1
            goto L_0x004d
        L_0x00db:
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r14}     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = "Signature %s is malformed. Char %s not understood."
            goto L_0x0026
        L_0x00e3:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1, r0}     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = "Signature %s is malformed. Idxs [%d, %d] not valid"
            java.lang.String.format(r0, r1)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            goto L_0x0029
        L_0x00f6:
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r0}     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = "Signature %s is malformed. Class %s not found"
            java.lang.String.format(r0, r1)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            goto L_0x0029
        L_0x0101:
            int r0 = r1.size()     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.Object[] r8 = r1.toArray(r0)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.Class[] r8 = (java.lang.Class[]) r8     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            if (r8 == 0) goto L_0x0029
            goto L_0x0111
        L_0x0110:
            return r18
        L_0x0111:
            if (r9 == 0) goto L_0x01ef
            java.lang.String r0 = "<clinit>"
            boolean r0 = r0.equals(r5)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            if (r0 == 0) goto L_0x0127
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = A01(r0, r8)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            com.facebook.common.jit.common.MethodInfo r7 = new com.facebook.common.jit.common.MethodInfo     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            r7.<init>(r9, r5, r0)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            return r7
        L_0x0127:
            java.lang.String r0 = "<init>"
            boolean r0 = r0.equals(r5)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            if (r0 != 0) goto L_0x0174
            r7 = 0
            r10 = r9
        L_0x0131:
            java.lang.reflect.Method r2 = r9.getDeclaredMethod(r5, r8)     // Catch:{ NoSuchMethodException -> 0x0138, ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            if (r2 == 0) goto L_0x0138
            goto L_0x0143
        L_0x0138:
            java.lang.Class r1 = r10.getSuperclass()     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            r0 = r10
            r10 = r1
            if (r1 == 0) goto L_0x0155
            if (r1 == r0) goto L_0x0155
            goto L_0x0131
        L_0x0143:
            java.lang.Class[] r1 = r2.getParameterTypes()     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.Class r0 = r2.getReturnType()     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = A01(r0, r1)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            com.facebook.common.jit.common.MethodInfo r7 = new com.facebook.common.jit.common.MethodInfo     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            r7.<init>((java.lang.Class) r9, (java.lang.String) r5, (java.lang.String) r0, (java.lang.reflect.Method) r2)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            return r7
        L_0x0155:
            java.lang.String r2 = r9.getName()     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = java.util.Arrays.toString(r8)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r5, r0}     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = "Did NOT find method (in chain) for class %s %s with types: %s"
            java.lang.String.format(r0, r1)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = java.util.Arrays.toString(r8)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r5, r0}     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = "Did NOT find method (from reflect method) %s %s with types: %s"
            java.lang.String.format(r0, r1)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            return r7
        L_0x0174:
            java.lang.reflect.Constructor r2 = r9.getDeclaredConstructor(r8)     // Catch:{ NoSuchMethodException -> 0x017b, ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            if (r2 == 0) goto L_0x017b
            goto L_0x0195
        L_0x017b:
            java.lang.Class r0 = r9.getEnclosingClass()     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            if (r0 == 0) goto L_0x01ef
            int r1 = r8.length     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            int r0 = r1 + 1
            if (r0 < r0) goto L_0x01b8
            if (r1 < r1) goto L_0x01c0
            r0 = 0
        L_0x0189:
            if (r0 >= r1) goto L_0x018e
            int r0 = r0 + 1
            goto L_0x0189
        L_0x018e:
            java.lang.reflect.Constructor r2 = r9.getDeclaredConstructor(r8)     // Catch:{ NoSuchMethodException -> 0x01a5, ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            if (r2 != 0) goto L_0x0195
            goto L_0x01a5
        L_0x0195:
            java.lang.Class[] r1 = r2.getParameterTypes()     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = A01(r0, r1)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            com.facebook.common.jit.common.MethodInfo r7 = new com.facebook.common.jit.common.MethodInfo     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            r7.<init>((java.lang.Class) r9, (java.lang.String) r5, (java.lang.String) r0, (java.lang.reflect.Constructor) r2)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            return r7
        L_0x01a5:
            java.lang.String r1 = r9.getName()     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = java.util.Arrays.toString(r8)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r5, r0}     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            java.lang.String r0 = "Did NOT find constructor %s %s with types: %s"
            java.lang.String.format(r0, r1)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            r7 = 0
            return r7
        L_0x01b8:
            java.lang.String r0 = "Dest array is not big enough"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            r1.<init>(r0)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            goto L_0x01c7
        L_0x01c0:
            java.lang.String r0 = "Src array lacks the num of needed elements"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
            r1.<init>(r0)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
        L_0x01c7:
            throw r1     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x01c8 }
        L_0x01c8:
            r2 = move-exception
            java.lang.String r1 = "Cannot find class: %s for method: %s sig: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r5, r4}     // Catch:{ Error | RuntimeException -> 0x01e1, Error | RuntimeException -> 0x01e1 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ Error | RuntimeException -> 0x01e1, Error | RuntimeException -> 0x01e1 }
            android.util.Log.w(r3, r0, r2)     // Catch:{ Error | RuntimeException -> 0x01e1, Error | RuntimeException -> 0x01e1 }
            return r18
        L_0x01d7:
            java.lang.String r1 = "Trying to get method but cant because some crucial information was null. class name: %s method name: %s method sig: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r5, r4}     // Catch:{ Error | RuntimeException -> 0x01e1, Error | RuntimeException -> 0x01e1 }
            java.lang.String.format(r1, r0)     // Catch:{ Error | RuntimeException -> 0x01e1, Error | RuntimeException -> 0x01e1 }
            return r18
        L_0x01e1:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r5, r4}
            java.lang.String r0 = "Programming Error: class: %s for method: %s sig: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.w(r3, r0, r2)
        L_0x01ef:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.jit.common.MethodInfo.getMethod(java.lang.String, java.lang.String, java.lang.String):com.facebook.common.jit.common.MethodInfo");
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = this.A00.hashCode() * 31;
        Method method = this.A04;
        int i4 = 0;
        if (method != null) {
            i = method.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        Constructor constructor = this.A03;
        if (constructor != null) {
            i2 = constructor.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str = this.A01;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str2 = this.A02;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i7 + i4;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[ MethodInfo ");
        sb.append("cls: ");
        Class cls = this.A00;
        String str2 = "<null>";
        if (cls != null) {
            str2 = cls.getName();
        }
        sb.append(str2);
        sb.append(", ");
        Executable executable = this.A04;
        if (executable != null) {
            str = "method: ";
        } else {
            executable = this.A03;
            if (executable != null) {
                str = "constructor: ";
            }
            sb.append("name: ");
            sb.append(this.A01);
            sb.append(", ");
            sb.append("signature: ");
            sb.append(this.A02);
            sb.append(']');
            return sb.toString();
        }
        sb.append(str);
        sb.append(executable.getName());
        sb.append(", ");
        sb.append("name: ");
        sb.append(this.A01);
        sb.append(", ");
        sb.append("signature: ");
        sb.append(this.A02);
        sb.append(']');
        return sb.toString();
    }

    public MethodInfo(Class cls, String str, String str2, Constructor constructor) {
        this.A00 = cls;
        this.A04 = null;
        this.A03 = constructor;
        this.A01 = str;
        this.A02 = str2;
    }

    public MethodInfo(Class cls, String str, String str2) {
        this.A00 = cls;
        this.A04 = null;
        this.A03 = null;
        this.A01 = str;
        this.A02 = str2;
    }

    public MethodInfo(Class cls, String str, String str2, Method method) {
        this.A00 = cls;
        this.A04 = method;
        this.A03 = null;
        this.A01 = str;
        this.A02 = str2;
    }

    public MethodInfo() {
        this.A00 = null;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
    }
}
