package X;

/* renamed from: X.7Dw  reason: invalid class name and case insensitive filesystem */
public final class C121057Dw {
    public static final C121057Dw A00 = new C121057Dw();

    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r11 = r18.getDeclaredMethods();
        X.C04220Ms.A06(r11);
        r10 = r11.length;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0126, code lost:
        if (X.C18220wO.A1V(X.AnonymousClass00U.A0A(r4, ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn.delimiter), r5 ? 1 : 0, r1) == false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0128, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012a, code lost:
        if (r9 < r10) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012c, code lost:
        r6 = r11[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0136, code lost:
        if (X.C04220Ms.A0I(r6.getName(), r4) == false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0138, code lost:
        r1 = r6.getName();
        X.C04220Ms.A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014a, code lost:
        r17 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014e, code lost:
        if (r17 != null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0190, code lost:
        throw new java.lang.NoSuchMethodException(X.AnonymousClass00U.A0N(r18.getName(), r4, '.'));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x011c */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015f A[Catch:{ ReflectiveOperationException -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0169 A[Catch:{ ReflectiveOperationException -> 0x0191 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C147188nY r23, java.lang.String r24, java.lang.String r25, java.lang.Object... r26) {
        /*
            r22 = this;
            r2 = 0
            r20 = r24
            r4 = r25
            r0 = r20
            boolean r5 = X.AnonymousClass0wJ.A1Z(r0, r4)
            r1 = 2
            r21 = r23
            r8 = r26
            r0 = r21
            int r9 = X.C86124wJ.A07(r1, r0, r8)
            r3 = 0
            java.lang.Class r18 = java.lang.Class.forName(r20)     // Catch:{ ReflectiveOperationException -> 0x0191 }
            X.C04220Ms.A06(r18)     // Catch:{ ReflectiveOperationException -> 0x0191 }
            int r7 = r8.length     // Catch:{ ReflectiveOperationException -> 0x0191 }
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r8, r7)     // Catch:{ ReflectiveOperationException -> 0x0191 }
            r17 = 0
            int r10 = r11.length     // Catch:{ ReflectiveOperationException -> 0x011c }
            if (r10 != 0) goto L_0x002a
            r6 = 1
            goto L_0x0033
        L_0x002a:
            double r0 = (double) r10     // Catch:{ ReflectiveOperationException -> 0x011c }
            r12 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = r0 / r12
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ ReflectiveOperationException -> 0x011c }
            int r6 = (int) r0     // Catch:{ ReflectiveOperationException -> 0x011c }
        L_0x0033:
            java.util.ArrayList r9 = X.C18240wQ.A0k(r9)     // Catch:{ ReflectiveOperationException -> 0x011c }
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()     // Catch:{ ReflectiveOperationException -> 0x011c }
            r1 = 0
        L_0x003c:
            if (r1 >= r10) goto L_0x004e
            r0 = r11[r1]     // Catch:{ ReflectiveOperationException -> 0x011c }
            if (r0 == 0) goto L_0x004b
            java.lang.Class r0 = r0.getClass()     // Catch:{ ReflectiveOperationException -> 0x011c }
            if (r0 == 0) goto L_0x004b
            r12.add(r0)     // Catch:{ ReflectiveOperationException -> 0x011c }
        L_0x004b:
            int r1 = r1 + 1
            goto L_0x003c
        L_0x004e:
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ ReflectiveOperationException -> 0x011c }
            java.lang.Object[] r0 = r12.toArray(r0)     // Catch:{ ReflectiveOperationException -> 0x011c }
            X.AnonymousClass0Lm.A00(r0, r9)     // Catch:{ ReflectiveOperationException -> 0x011c }
            java.lang.Class<X.8nY> r0 = X.C147188nY.class
            r9.add(r0)     // Catch:{ ReflectiveOperationException -> 0x011c }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ ReflectiveOperationException -> 0x011c }
            X.8bH r0 = X.AnonymousClass8bI.A0C(r2, r6)     // Catch:{ ReflectiveOperationException -> 0x011c }
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0w(r0)     // Catch:{ ReflectiveOperationException -> 0x011c }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ ReflectiveOperationException -> 0x011c }
        L_0x006a:
            boolean r0 = r1.hasNext()     // Catch:{ ReflectiveOperationException -> 0x011c }
            if (r0 == 0) goto L_0x007a
            r0 = r1
            X.83z r0 = (X.C1367083z) r0     // Catch:{ ReflectiveOperationException -> 0x011c }
            r0.A00()     // Catch:{ ReflectiveOperationException -> 0x011c }
            r6.add(r10)     // Catch:{ ReflectiveOperationException -> 0x011c }
            goto L_0x006a
        L_0x007a:
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ ReflectiveOperationException -> 0x011c }
            java.lang.Object[] r0 = r6.toArray(r0)     // Catch:{ ReflectiveOperationException -> 0x011c }
            X.AnonymousClass0Lm.A00(r0, r9)     // Catch:{ ReflectiveOperationException -> 0x011c }
            int r0 = r9.size()     // Catch:{ ReflectiveOperationException -> 0x011c }
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ ReflectiveOperationException -> 0x011c }
            java.lang.Object[] r1 = r9.toArray(r0)     // Catch:{ ReflectiveOperationException -> 0x011c }
            java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch:{ ReflectiveOperationException -> 0x011c }
            int r0 = r1.length     // Catch:{ ReflectiveOperationException -> 0x011c }
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ ReflectiveOperationException -> 0x011c }
            java.lang.Class[] r10 = (java.lang.Class[]) r10     // Catch:{ ReflectiveOperationException -> 0x011c }
            java.lang.reflect.Method[] r9 = r18.getDeclaredMethods()     // Catch:{ ReflectiveOperationException -> 0x011c }
            X.C04220Ms.A06(r9)     // Catch:{ ReflectiveOperationException -> 0x011c }
            int r0 = r9.length     // Catch:{ ReflectiveOperationException -> 0x011c }
            r19 = r0
            r11 = 0
        L_0x00a1:
            r0 = r19
            if (r11 >= r0) goto L_0x0110
            r6 = r9[r11]     // Catch:{ ReflectiveOperationException -> 0x011c }
            java.lang.String r0 = r6.getName()     // Catch:{ ReflectiveOperationException -> 0x011c }
            boolean r0 = r4.equals(r0)     // Catch:{ ReflectiveOperationException -> 0x011c }
            if (r0 != 0) goto L_0x00c4
            java.lang.String r1 = r6.getName()     // Catch:{ ReflectiveOperationException -> 0x011c }
            X.C04220Ms.A06(r1)     // Catch:{ ReflectiveOperationException -> 0x011c }
            r0 = 45
            java.lang.String r0 = X.AnonymousClass00U.A0A(r4, r0)     // Catch:{ ReflectiveOperationException -> 0x011c }
            boolean r0 = X.C18220wO.A1V(r0, r5, r1)     // Catch:{ ReflectiveOperationException -> 0x011c }
            if (r0 == 0) goto L_0x00fa
        L_0x00c4:
            java.lang.Class[] r15 = r6.getParameterTypes()     // Catch:{ ReflectiveOperationException -> 0x011c }
            X.C04220Ms.A06(r15)     // Catch:{ ReflectiveOperationException -> 0x011c }
            int r14 = r15.length     // Catch:{ ReflectiveOperationException -> 0x011c }
            int r0 = r10.length     // Catch:{ ReflectiveOperationException -> 0x011c }
            if (r14 != r0) goto L_0x00fa
            java.util.ArrayList r13 = X.C18240wQ.A0k(r14)     // Catch:{ ReflectiveOperationException -> 0x011c }
            r12 = 0
            r0 = 0
        L_0x00d5:
            if (r12 >= r14) goto L_0x00ed
            r1 = r15[r12]     // Catch:{ ReflectiveOperationException -> 0x011c }
            int r16 = r0 + 1
            r0 = r10[r0]     // Catch:{ ReflectiveOperationException -> 0x011c }
            boolean r0 = r1.isAssignableFrom(r0)     // Catch:{ ReflectiveOperationException -> 0x011c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ ReflectiveOperationException -> 0x011c }
            r13.add(r0)     // Catch:{ ReflectiveOperationException -> 0x011c }
            int r12 = r12 + 1
            r0 = r16
            goto L_0x00d5
        L_0x00ed:
            boolean r0 = r13 instanceof java.util.Collection     // Catch:{ ReflectiveOperationException -> 0x011c }
            if (r0 == 0) goto L_0x00fd
            boolean r0 = r13.isEmpty()     // Catch:{ ReflectiveOperationException -> 0x011c }
            if (r0 == 0) goto L_0x00fd
            goto L_0x0150
        L_0x00f8:
            if (r0 != 0) goto L_0x0101
        L_0x00fa:
            int r11 = r11 + 1
            goto L_0x00a1
        L_0x00fd:
            java.util.Iterator r1 = r13.iterator()     // Catch:{ ReflectiveOperationException -> 0x011c }
        L_0x0101:
            boolean r0 = r1.hasNext()     // Catch:{ ReflectiveOperationException -> 0x011c }
            if (r0 == 0) goto L_0x0150
            java.lang.Object r0 = r1.next()     // Catch:{ ReflectiveOperationException -> 0x011c }
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)     // Catch:{ ReflectiveOperationException -> 0x011c }
            goto L_0x00f8
        L_0x0110:
            java.lang.String r0 = " not found"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r4, r0)     // Catch:{ ReflectiveOperationException -> 0x011c }
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ ReflectiveOperationException -> 0x011c }
            r0.<init>(r1)     // Catch:{ ReflectiveOperationException -> 0x011c }
            throw r0     // Catch:{ ReflectiveOperationException -> 0x011c }
        L_0x011c:
            java.lang.reflect.Method[] r11 = r18.getDeclaredMethods()     // Catch:{ ReflectiveOperationException -> 0x014c }
            X.C04220Ms.A06(r11)     // Catch:{ ReflectiveOperationException -> 0x014c }
            int r10 = r11.length     // Catch:{ ReflectiveOperationException -> 0x014c }
            r9 = 0
            goto L_0x012a
        L_0x0126:
            if (r0 != 0) goto L_0x014a
            int r9 = r9 + 1
        L_0x012a:
            if (r9 >= r10) goto L_0x0181
            r6 = r11[r9]     // Catch:{ ReflectiveOperationException -> 0x014c }
            java.lang.String r0 = r6.getName()     // Catch:{ ReflectiveOperationException -> 0x014c }
            boolean r0 = X.C04220Ms.A0I(r0, r4)     // Catch:{ ReflectiveOperationException -> 0x014c }
            if (r0 != 0) goto L_0x014a
            java.lang.String r1 = r6.getName()     // Catch:{ ReflectiveOperationException -> 0x014c }
            X.C04220Ms.A06(r1)     // Catch:{ ReflectiveOperationException -> 0x014c }
            r0 = 45
            java.lang.String r0 = X.AnonymousClass00U.A0A(r4, r0)     // Catch:{ ReflectiveOperationException -> 0x014c }
            boolean r0 = X.C18220wO.A1V(r0, r5, r1)     // Catch:{ ReflectiveOperationException -> 0x014c }
            goto L_0x0126
        L_0x014a:
            r17 = r6
        L_0x014c:
            r6 = r17
            if (r17 == 0) goto L_0x0181
        L_0x0150:
            r6.setAccessible(r5)     // Catch:{ ReflectiveOperationException -> 0x0191 }
            int r0 = r6.getModifiers()     // Catch:{ ReflectiveOperationException -> 0x0191 }
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)     // Catch:{ ReflectiveOperationException -> 0x0191 }
            r9 = r22
            if (r0 == 0) goto L_0x0169
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r7)     // Catch:{ ReflectiveOperationException -> 0x0191 }
            r0 = r21
            r9.A00(r0, r3, r6, r1)     // Catch:{ ReflectiveOperationException -> 0x0191 }
            return
        L_0x0169:
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ ReflectiveOperationException -> 0x0191 }
            r0 = r18
            java.lang.reflect.Constructor r1 = r0.getConstructor(r1)     // Catch:{ ReflectiveOperationException -> 0x0191 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ ReflectiveOperationException -> 0x0191 }
            java.lang.Object r5 = r1.newInstance(r0)     // Catch:{ ReflectiveOperationException -> 0x0191 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r7)     // Catch:{ ReflectiveOperationException -> 0x0191 }
            r0 = r21
            r9.A00(r0, r5, r6, r1)     // Catch:{ ReflectiveOperationException -> 0x0191 }
            return
        L_0x0181:
            java.lang.String r1 = r18.getName()     // Catch:{ ReflectiveOperationException -> 0x0191 }
            r0 = 46
            java.lang.String r1 = X.AnonymousClass00U.A0N(r1, r4, r0)     // Catch:{ ReflectiveOperationException -> 0x0191 }
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ ReflectiveOperationException -> 0x0191 }
            r0.<init>(r1)     // Catch:{ ReflectiveOperationException -> 0x0191 }
            throw r0     // Catch:{ ReflectiveOperationException -> 0x0191 }
        L_0x0191:
            r5 = move-exception
            java.lang.String r0 = "Failed to invoke Composable Method '"
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            r0 = r20
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r4)
            r0 = 39
            java.lang.String r1 = X.C86114wI.A0q(r1, r0)
            X.C04220Ms.A0B(r1, r2)
            java.lang.String r0 = "PreviewLogger"
            android.util.Log.w(r0, r1, r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121057Dw.A01(X.8nY, java.lang.String, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bc, code lost:
        if (r8.equals("int") == false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.C147188nY r11, java.lang.Object r12, java.lang.reflect.Method r13, java.lang.Object... r14) {
        /*
            r10 = this;
            java.lang.Class[] r4 = r13.getParameterTypes()
            X.C04220Ms.A06(r4)
            int r0 = r4.length
            r5 = -1
            int r3 = r0 + -1
            if (r3 < 0) goto L_0x001a
        L_0x000d:
            int r2 = r3 + -1
            r1 = r4[r3]
            java.lang.Class<X.8nY> r0 = X.C147188nY.class
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x00fa
            r5 = r3
        L_0x001a:
            r4 = 0
            boolean r0 = X.AnonymousClass0wJ.A1W(r12)
            if (r5 != 0) goto L_0x00ee
            r2 = 1
        L_0x0022:
            int r6 = r5 + 1
            int r2 = r2 + r6
            java.lang.Class[] r0 = r13.getParameterTypes()
            int r3 = r0.length
            if (r3 == r2) goto L_0x00eb
            double r0 = (double) r5
            r7 = 4629418941960159232(0x403f000000000000, double:31.0)
            double r0 = r0 / r7
            double r0 = java.lang.Math.ceil(r0)
            int r7 = (int) r0
        L_0x0035:
            int r7 = r7 + r2
            if (r7 != r3) goto L_0x0112
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r1 = 0
        L_0x003b:
            if (r1 >= r3) goto L_0x010a
            if (r1 < 0) goto L_0x00cf
            if (r1 >= r5) goto L_0x00cf
            X.C04220Ms.A0B(r14, r4)
            int r0 = r14.length
            int r0 = r0 + -1
            if (r1 > r0) goto L_0x0050
            r0 = r14[r1]
        L_0x004b:
            r7[r1] = r0
            int r1 = r1 + 1
            goto L_0x003b
        L_0x0050:
            java.lang.Class[] r0 = r13.getParameterTypes()
            r0 = r0[r1]
            X.C04220Ms.A03(r0)
            java.lang.String r8 = r0.getName()
            if (r8 == 0) goto L_0x0066
            int r0 = r8.hashCode()
            switch(r0) {
                case -1325958191: goto L_0x00bf;
                case 104431: goto L_0x00b6;
                case 3039496: goto L_0x00a9;
                case 3052374: goto L_0x009c;
                case 3327612: goto L_0x008f;
                case 64711720: goto L_0x0082;
                case 97526364: goto L_0x0075;
                case 109413500: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            r0 = 0
            goto L_0x004b
        L_0x0068:
            java.lang.String r0 = "short"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0066
            java.lang.Short r0 = java.lang.Short.valueOf(r4)
            goto L_0x004b
        L_0x0075:
            java.lang.String r0 = "float"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0066
            java.lang.Float r0 = X.C86124wJ.A0g()
            goto L_0x004b
        L_0x0082:
            java.lang.String r0 = "boolean"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0066
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            goto L_0x004b
        L_0x008f:
            java.lang.String r0 = "long"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0066
            java.lang.Long r0 = X.C18210wN.A0V()
            goto L_0x004b
        L_0x009c:
            java.lang.String r0 = "char"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0066
            java.lang.Character r0 = java.lang.Character.valueOf(r4)
            goto L_0x004b
        L_0x00a9:
            java.lang.String r0 = "byte"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0066
            java.lang.Byte r0 = java.lang.Byte.valueOf(r4)
            goto L_0x004b
        L_0x00b6:
            java.lang.String r0 = "int"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00d8
            goto L_0x0066
        L_0x00bf:
            java.lang.String r0 = "double"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0066
            r8 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r8)
            goto L_0x004b
        L_0x00cf:
            if (r1 != r5) goto L_0x00d4
            r0 = r11
            goto L_0x004b
        L_0x00d4:
            if (r6 > r1) goto L_0x00de
            if (r1 >= r2) goto L_0x00de
        L_0x00d8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x004b
        L_0x00de:
            if (r2 > r1) goto L_0x00ff
            if (r1 >= r3) goto L_0x00ff
            r0 = 2097151(0x1fffff, float:2.938734E-39)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x004b
        L_0x00eb:
            r7 = 0
            goto L_0x0035
        L_0x00ee:
            int r0 = r0 + r5
            double r2 = (double) r0
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r2 = r2 / r0
            double r0 = java.lang.Math.ceil(r2)
            int r2 = (int) r0
            goto L_0x0022
        L_0x00fa:
            if (r2 < 0) goto L_0x001a
            r3 = r2
            goto L_0x000d
        L_0x00ff:
            r0 = 740(0x2e4, float:1.037E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x010a:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r7, r3)
            r13.invoke(r12, r0)
            return
        L_0x0112:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121057Dw.A00(X.8nY, java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):void");
    }
}
