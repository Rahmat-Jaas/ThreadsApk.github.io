package X;

/* renamed from: X.6W9  reason: invalid class name */
public final class AnonymousClass6W9 {
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01af, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        if (r0 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0137, code lost:
        if (r7 != null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013b, code lost:
        if (r7 == null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r8 = r5.getDeclaredClasses();
        X.C04220Ms.A06(r8);
        r6 = r8.length;
        r5 = 0;
        r4 = null;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0149, code lost:
        if (r5 >= r6) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x014b, code lost:
        r2 = r8[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0157, code lost:
        if (X.C04220Ms.A0I(r2.getSimpleName(), "$serializer") == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0159, code lost:
        if (r3 != false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x015b, code lost:
        r3 = true;
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015d, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0160, code lost:
        if (r3 == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0162, code lost:
        if (r4 == null) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0164, code lost:
        r0 = r4.getField("INSTANCE");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x016a, code lost:
        if (r0 == null) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x016c, code lost:
        r7 = r0.get((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0172, code lost:
        if ((r7 instanceof X.AnonymousClass8sP) == false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0174, code lost:
        r7 = (X.AnonymousClass8sP) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0176, code lost:
        if (r7 == null) goto L_0x0179;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass8sP A00(X.AnonymousClass0W7 r11, X.AnonymousClass8sP... r12) {
        /*
            r6 = 0
            boolean r1 = X.AnonymousClass0wJ.A1Z(r11, r12)
            java.lang.Class r5 = X.AnonymousClass724.A00(r11)
            boolean r0 = r5.isEnum()
            if (r0 == 0) goto L_0x0038
            java.lang.Class<kotlinx.serialization.Serializable> r0 = kotlinx.serialization.Serializable.class
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r0)
            if (r0 != 0) goto L_0x0038
            java.lang.Class<kotlinx.serialization.Polymorphic> r0 = kotlinx.serialization.Polymorphic.class
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r0)
            if (r0 != 0) goto L_0x0038
            java.lang.Object[] r2 = r5.getEnumConstants()
            java.lang.String r0 = r5.getCanonicalName()
            X.C04220Ms.A06(r0)
            if (r2 == 0) goto L_0x01a8
            java.lang.Enum[] r2 = (java.lang.Enum[]) r2
            X.Kls r1 = new X.Kls
            r1.<init>(r0, r2)
            boolean r0 = r1 instanceof X.AnonymousClass8sP
            if (r0 == 0) goto L_0x01b0
            return r1
        L_0x0038:
            boolean r0 = r5.isInterface()
            if (r0 == 0) goto L_0x0066
            java.lang.Class r1 = X.AnonymousClass724.A00(r11)
            java.lang.Class<kotlinx.serialization.Serializable> r0 = kotlinx.serialization.Serializable.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            kotlinx.serialization.Serializable r0 = (kotlinx.serialization.Serializable) r0
            if (r0 == 0) goto L_0x0060
        L_0x004c:
            java.lang.Class r0 = r0.with()
            X.0Ai r1 = X.C18210wN.A0l(r0)
            java.lang.Class<kotlinx.serialization.PolymorphicSerializer> r0 = kotlinx.serialization.PolymorphicSerializer.class
            X.0Ai r0 = X.C18210wN.A0l(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01b0
        L_0x0060:
            kotlinx.serialization.PolymorphicSerializer r1 = new kotlinx.serialization.PolymorphicSerializer
            r1.<init>(r11)
            return r1
        L_0x0066:
            int r0 = r12.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r12, r0)
            X.8sP[] r9 = (X.AnonymousClass8sP[]) r9
            r8 = 0
            java.lang.String r0 = "Companion"
            java.lang.reflect.Field r0 = r5.getDeclaredField(r0)     // Catch:{ all -> 0x007b }
            r0.setAccessible(r1)     // Catch:{ all -> 0x007b }
            java.lang.Object r8 = r0.get(r8)     // Catch:{ all -> 0x007b }
        L_0x007b:
            r7 = 0
            if (r8 == 0) goto L_0x00b1
            int r4 = r9.length     // Catch:{ NoSuchMethodException -> 0x013b, InvocationTargetException -> 0x0191 }
            r1 = 0
            if (r4 != 0) goto L_0x00a6
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x013b, InvocationTargetException -> 0x0191 }
        L_0x0084:
            java.lang.Class r2 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x013b, InvocationTargetException -> 0x0191 }
            java.lang.String r1 = "serializer"
            int r0 = r3.length     // Catch:{ NoSuchMethodException -> 0x013b, InvocationTargetException -> 0x0191 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)     // Catch:{ NoSuchMethodException -> 0x013b, InvocationTargetException -> 0x0191 }
            java.lang.Class[] r0 = (java.lang.Class[]) r0     // Catch:{ NoSuchMethodException -> 0x013b, InvocationTargetException -> 0x0191 }
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x013b, InvocationTargetException -> 0x0191 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r9, r4)     // Catch:{ NoSuchMethodException -> 0x013b, InvocationTargetException -> 0x0191 }
            java.lang.Object r1 = r1.invoke(r8, r0)     // Catch:{ NoSuchMethodException -> 0x013b, InvocationTargetException -> 0x0191 }
            boolean r0 = r1 instanceof X.AnonymousClass8sP     // Catch:{ NoSuchMethodException -> 0x013b, InvocationTargetException -> 0x0191 }
            if (r0 == 0) goto L_0x00b1
            X.8sP r1 = (X.AnonymousClass8sP) r1     // Catch:{ NoSuchMethodException -> 0x013b, InvocationTargetException -> 0x0191 }
            r7 = r1
            goto L_0x013b
        L_0x00a6:
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x013b, InvocationTargetException -> 0x0191 }
        L_0x00a8:
            java.lang.Class<X.8sP> r0 = X.AnonymousClass8sP.class
            r3[r1] = r0     // Catch:{ NoSuchMethodException -> 0x013b, InvocationTargetException -> 0x0191 }
            int r1 = r1 + 1
            if (r1 >= r4) goto L_0x0084
            goto L_0x00a8
        L_0x00b1:
            java.lang.reflect.Field[] r9 = r5.getDeclaredFields()
            X.C04220Ms.A06(r9)
            int r8 = r9.length
            r7 = 0
            r4 = r7
            r3 = 0
            r10 = 0
        L_0x00bd:
            if (r3 >= r8) goto L_0x00e8
            r2 = r9[r3]
            java.lang.String r1 = r2.getName()
            java.lang.String r0 = "INSTANCE"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x00e5
            java.lang.Class r0 = r2.getType()
            boolean r0 = X.C04220Ms.A0I(r0, r5)
            if (r0 == 0) goto L_0x00e5
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L_0x00e5
            if (r10 != 0) goto L_0x0139
            r4 = r2
            r10 = 1
        L_0x00e5:
            int r3 = r3 + 1
            goto L_0x00bd
        L_0x00e8:
            if (r10 == 0) goto L_0x0139
            if (r4 == 0) goto L_0x0139
            java.lang.Object r4 = r4.get(r7)
            java.lang.reflect.Method[] r8 = r5.getMethods()
            X.C04220Ms.A06(r8)
            int r3 = r8.length
            r2 = 0
            r10 = 0
        L_0x00fa:
            if (r2 >= r3) goto L_0x0127
            r9 = r8[r2]
            java.lang.String r1 = r9.getName()
            java.lang.String r0 = "serializer"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0124
            java.lang.Class[] r0 = r9.getParameterTypes()
            X.C04220Ms.A06(r0)
            int r0 = r0.length
            if (r0 != 0) goto L_0x0124
            java.lang.Class r1 = r9.getReturnType()
            java.lang.Class<X.8sP> r0 = X.AnonymousClass8sP.class
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0124
            if (r10 != 0) goto L_0x0139
            r7 = r9
            r10 = 1
        L_0x0124:
            int r2 = r2 + 1
            goto L_0x00fa
        L_0x0127:
            if (r10 == 0) goto L_0x0139
            if (r7 == 0) goto L_0x0139
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Object r7 = r7.invoke(r4, r0)
            boolean r0 = r7 instanceof X.AnonymousClass8sP
            if (r0 == 0) goto L_0x0139
            X.8sP r7 = (X.AnonymousClass8sP) r7
            if (r7 != 0) goto L_0x013d
        L_0x0139:
            r7 = 0
            goto L_0x013e
        L_0x013b:
            if (r7 == 0) goto L_0x00b1
        L_0x013d:
            return r7
        L_0x013e:
            java.lang.Class[] r8 = r5.getDeclaredClasses()     // Catch:{ NoSuchFieldException -> 0x0179 }
            X.C04220Ms.A06(r8)     // Catch:{ NoSuchFieldException -> 0x0179 }
            int r6 = r8.length     // Catch:{ NoSuchFieldException -> 0x0179 }
            r5 = 0
            r4 = r7
            r3 = 0
        L_0x0149:
            if (r5 >= r6) goto L_0x0160
            r2 = r8[r5]     // Catch:{ NoSuchFieldException -> 0x0179 }
            java.lang.String r1 = r2.getSimpleName()     // Catch:{ NoSuchFieldException -> 0x0179 }
            java.lang.String r0 = "$serializer"
            boolean r0 = X.C04220Ms.A0I(r1, r0)     // Catch:{ NoSuchFieldException -> 0x0179 }
            if (r0 == 0) goto L_0x015d
            if (r3 != 0) goto L_0x0170
            r3 = 1
            r4 = r2
        L_0x015d:
            int r5 = r5 + 1
            goto L_0x0149
        L_0x0160:
            if (r3 == 0) goto L_0x0170
            if (r4 == 0) goto L_0x0170
            java.lang.String r0 = "INSTANCE"
            java.lang.reflect.Field r0 = r4.getField(r0)     // Catch:{ NoSuchFieldException -> 0x0179 }
            if (r0 == 0) goto L_0x0170
            java.lang.Object r7 = r0.get(r7)     // Catch:{ NoSuchFieldException -> 0x0179 }
        L_0x0170:
            boolean r0 = r7 instanceof X.AnonymousClass8sP     // Catch:{ NoSuchFieldException -> 0x0179 }
            if (r0 == 0) goto L_0x0179
            X.8sP r7 = (X.AnonymousClass8sP) r7     // Catch:{ NoSuchFieldException -> 0x0179 }
            if (r7 == 0) goto L_0x0179
            goto L_0x01af
        L_0x0179:
            java.lang.Class r1 = X.AnonymousClass724.A00(r11)
            java.lang.Class<kotlinx.serialization.Polymorphic> r0 = kotlinx.serialization.Polymorphic.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            if (r0 != 0) goto L_0x0060
            java.lang.Class<kotlinx.serialization.Serializable> r0 = kotlinx.serialization.Serializable.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            kotlinx.serialization.Serializable r0 = (kotlinx.serialization.Serializable) r0
            if (r0 == 0) goto L_0x01b0
            goto L_0x004c
        L_0x0191:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()
            if (r2 == 0) goto L_0x01ae
            java.lang.String r1 = r2.getMessage()
            if (r1 != 0) goto L_0x01a2
            java.lang.String r1 = r0.getMessage()
        L_0x01a2:
            java.lang.reflect.InvocationTargetException r0 = new java.lang.reflect.InvocationTargetException
            r0.<init>(r2, r1)
            throw r0
        L_0x01a8:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
        L_0x01ae:
            throw r0
        L_0x01af:
            return r7
        L_0x01b0:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6W9.A00(X.0W7, X.8sP[]):X.8sP");
    }
}
