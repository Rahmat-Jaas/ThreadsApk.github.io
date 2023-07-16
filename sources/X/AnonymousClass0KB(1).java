package X;

/* renamed from: X.0KB  reason: invalid class name */
public final class AnonymousClass0KB {
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0K4 A00(X.AnonymousClass0K4 r16, X.AnonymousClass0KC r17, java.lang.Object[] r18, boolean r19) {
        /*
            r14 = r16
            r13 = r17
            r17 = 0
            if (r19 != 0) goto L_0x0093
            r13.getClass()
            r14 = r17
        L_0x000d:
            r15 = r18
            int r12 = r15.length
            r0 = 4
            r11 = 1
            r10 = 0
            r3 = 0
            if (r12 > r0) goto L_0x0017
            r3 = 1
        L_0x0017:
            if (r13 == 0) goto L_0x008a
            java.lang.Class r1 = r13.A04
        L_0x001b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            java.lang.String r0 = java.util.Arrays.toString(r15)
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r0}
            java.lang.String r0 = "Don't know how to construct this object %s with the given args[len: %d] %s"
            if (r3 == 0) goto L_0x011d
            r9 = 0
            r8 = r9
            r7 = 0
            r6 = 0
            r5 = 0
            r2 = 0
        L_0x0031:
            if (r2 >= r12) goto L_0x010c
            r4 = r18[r2]
            if (r4 == 0) goto L_0x007d
            java.lang.Class r0 = r4.getClass()
            if (r0 == 0) goto L_0x00c2
            boolean r3 = r0.isPrimitive()
            if (r3 == 0) goto L_0x0076
            r0.isPrimitive()
            java.lang.Class r3 = java.lang.Integer.TYPE
            if (r0 == r3) goto L_0x0062
            java.lang.Class r3 = java.lang.Long.TYPE
            if (r0 == r3) goto L_0x0076
            java.lang.Class r3 = java.lang.Character.TYPE
            if (r0 == r3) goto L_0x0062
            java.lang.Class r3 = java.lang.Boolean.TYPE
            if (r0 == r3) goto L_0x0062
            java.lang.Class r3 = java.lang.Byte.TYPE
            if (r0 == r3) goto L_0x0062
            java.lang.Class r3 = java.lang.Short.TYPE
            if (r0 == r3) goto L_0x0062
            java.lang.Class r3 = java.lang.Float.TYPE
            if (r0 != r3) goto L_0x0076
        L_0x0062:
            int r16 = r6 + 1
            java.lang.Number r4 = (java.lang.Number) r4
            int r3 = r4.intValue()
            if (r6 == 0) goto L_0x0074
            if (r6 != r11) goto L_0x009a
            r7 = r3
        L_0x006f:
            r6 = r16
        L_0x0071:
            int r2 = r2 + 1
            goto L_0x0031
        L_0x0074:
            r10 = r3
            goto L_0x006f
        L_0x0076:
            boolean r3 = r0.isPrimitive()
            if (r3 != 0) goto L_0x00c2
            goto L_0x007f
        L_0x007d:
            r0 = r17
        L_0x007f:
            int r3 = r5 + 1
            if (r5 == 0) goto L_0x0088
            if (r5 != r11) goto L_0x00e7
            r8 = r4
        L_0x0086:
            r5 = r3
            goto L_0x0071
        L_0x0088:
            r9 = r4
            goto L_0x0086
        L_0x008a:
            if (r14 == 0) goto L_0x0091
            java.lang.Class r1 = r14.getClass()
            goto L_0x001b
        L_0x0091:
            r1 = 0
            goto L_0x001b
        L_0x0093:
            r14.getClass()
            r13 = r17
            goto L_0x000d
        L_0x009a:
            java.lang.String r4 = "Cannot construct "
            java.lang.String r6 = " arg[idx:"
            java.lang.String r8 = "]: "
            java.lang.String r10 = " with val "
            java.lang.String r12 = "because it has too many int type params!"
            java.lang.String r5 = "<null>"
            if (r1 == 0) goto L_0x00ac
            java.lang.String r5 = r1.toString()
        L_0x00ac:
            java.lang.String r7 = java.lang.Integer.toString(r2)
            java.lang.String r9 = r0.toString()
            java.lang.String r11 = java.lang.Integer.toString(r3)
            java.lang.String r1 = X.AnonymousClass00U.A0l(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00c2:
            java.lang.String r3 = "Cannot construct "
            java.lang.String r5 = " arg[idx:"
            java.lang.String r7 = "]: "
            java.lang.String r9 = " because because we don't understand the class"
            java.lang.String r8 = "<null>"
            r4 = r8
            if (r1 == 0) goto L_0x00d3
            java.lang.String r4 = r1.toString()
        L_0x00d3:
            java.lang.String r6 = java.lang.Integer.toString(r2)
            if (r0 == 0) goto L_0x00dd
            java.lang.String r8 = r0.toString()
        L_0x00dd:
            java.lang.String r1 = X.AnonymousClass00U.A0j(r3, r4, r5, r6, r7, r8, r9)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00e7:
            java.lang.String r3 = "Cannot construct "
            java.lang.String r5 = " arg[idx:"
            java.lang.String r7 = "]: "
            java.lang.String r9 = " because it has too many obj params!"
            java.lang.String r8 = "<null>"
            r4 = r8
            if (r1 == 0) goto L_0x00f8
            java.lang.String r4 = r1.toString()
        L_0x00f8:
            java.lang.String r6 = java.lang.Integer.toString(r2)
            if (r0 == 0) goto L_0x0102
            java.lang.String r8 = r0.toString()
        L_0x0102:
            java.lang.String r1 = X.AnonymousClass00U.A0j(r3, r4, r5, r6, r7, r8, r9)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x010c:
            if (r19 != 0) goto L_0x0116
            r13.getClass()
            X.0K4 r0 = X.AnonymousClass0KC.A01(r13, r9, r8, r10, r7)
            return r0
        L_0x0116:
            r14.getClass()
            r14.C9A(r10, r7, r9, r8)
            return r14
        L_0x011d:
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r0, (java.lang.Object[]) r2)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KB.A00(X.0K4, X.0KC, java.lang.Object[], boolean):X.0K4");
    }
}
