package X;

/* renamed from: X.5qY  reason: invalid class name */
public final class AnonymousClass5qY extends AnonymousClass84U {
    public static final AnonymousClass84U A03 = new AnonymousClass5qY((Object) null, new Object[0], 0);
    public final transient Object[] A00;
    public final transient int A01;
    public final transient Object A02;

    public AnonymousClass5qY(Object obj, Object[] objArr, int i) {
        this.A02 = obj;
        this.A00 = objArr;
        this.A01 = i;
    }

    public final int size() {
        return this.A01;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: short[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass5qY A00(X.C113696rz r18, java.lang.Object[] r19, int r20) {
        /*
            r8 = r19
            r7 = r20
            if (r20 != 0) goto L_0x000b
            X.84U r0 = A03
            X.5qY r0 = (X.AnonymousClass5qY) r0
            return r0
        L_0x000b:
            r6 = 0
            r17 = 0
            r5 = 1
            if (r7 != r5) goto L_0x0024
            r1 = r19[r17]
            r1.getClass()
            r0 = r19[r5]
            r0.getClass()
            X.AnonymousClass6J8.A00(r1, r0)
            X.5qY r0 = new X.5qY
            r0.<init>(r6, r8, r5)
            return r0
        L_0x0024:
            int r0 = r8.length
            int r0 = r0 >> r5
            X.C121287Fi.A02(r7, r0)
            r4 = 2
            int r11 = java.lang.Math.max(r7, r4)
            r0 = 751619276(0x2ccccccc, float:5.8207657E-12)
            r10 = 1073741824(0x40000000, float:2.0)
            if (r11 >= r0) goto L_0x0049
            int r0 = r11 + -1
            int r10 = java.lang.Integer.highestOneBit(r0)
        L_0x003b:
            int r10 = r10 + r10
            double r2 = (double) r10
            r0 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r2 = r2 * r0
            double r0 = (double) r11
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x0056
            goto L_0x003b
        L_0x0049:
            if (r11 < r10) goto L_0x0056
            r0 = 321(0x141, float:4.5E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0056:
            if (r7 != r5) goto L_0x0088
            r1 = r19[r17]
            r1.getClass()
            r0 = r19[r5]
            r0.getClass()
            X.AnonymousClass6J8.A00(r1, r0)
        L_0x0065:
            boolean r0 = r6 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x0082
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r0 = r6[r4]
            X.6pb r0 = (X.C112446pb) r0
            r1 = r18
            r1.A01 = r0
            r1 = r6[r17]
            r0 = r6[r5]
            int r7 = X.AnonymousClass0wJ.A04(r0)
            int r0 = r7 + r7
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r0)
            r6 = r1
        L_0x0082:
            X.5qY r0 = new X.5qY
            r0.<init>(r6, r8, r7)
            return r0
        L_0x0088:
            int r16 = r10 + -1
            r0 = 128(0x80, float:1.794E-43)
            r12 = 3
            r11 = -1
            if (r10 > r0) goto L_0x00ec
            byte[] r3 = new byte[r10]
            java.util.Arrays.fill(r3, r11)
            r10 = 0
            r9 = 0
        L_0x0097:
            if (r10 >= r7) goto L_0x00e7
            int r0 = r10 + r10
            int r12 = r9 + r9
            r11 = r19[r0]
            r11.getClass()
            r0 = r0 ^ 1
            r2 = r19[r0]
            r2.getClass()
            X.AnonymousClass6J8.A00(r11, r2)
            int r0 = r11.hashCode()
            int r13 = X.AnonymousClass6J9.A00(r0)
        L_0x00b4:
            r13 = r13 & r16
            byte r1 = r3[r13]
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x00cd
            byte r0 = (byte) r12
            r3[r13] = r0
            if (r9 >= r10) goto L_0x00c8
            r19[r12] = r11
            r0 = r12 ^ 1
            r19[r0] = r2
        L_0x00c8:
            int r9 = r9 + 1
        L_0x00ca:
            int r10 = r10 + 1
            goto L_0x0097
        L_0x00cd:
            r0 = r19[r1]
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x00e4
            r1 = r1 ^ 1
            r0 = r19[r1]
            r0.getClass()
            X.6pb r6 = new X.6pb
            r6.<init>(r11, r2, r0)
            r19[r1] = r2
            goto L_0x00ca
        L_0x00e4:
            int r13 = r13 + 1
            goto L_0x00b4
        L_0x00e7:
            if (r9 != r7) goto L_0x01b4
            r6 = r3
            goto L_0x0065
        L_0x00ec:
            r0 = 32768(0x8000, float:4.5918E-41)
            if (r10 > r0) goto L_0x0149
            short[] r10 = new short[r10]
            java.util.Arrays.fill(r10, r11)
            r9 = 0
            r3 = 0
        L_0x00f8:
            if (r9 >= r7) goto L_0x01a6
            int r0 = r9 + r9
            int r1 = r3 + r3
            r11 = r19[r0]
            r11.getClass()
            r0 = r0 ^ 1
            r2 = r19[r0]
            r2.getClass()
            X.AnonymousClass6J8.A00(r11, r2)
            int r0 = r11.hashCode()
            int r14 = X.AnonymousClass6J9.A00(r0)
        L_0x0115:
            r14 = r14 & r16
            short r0 = r10[r14]
            char r13 = (char) r0
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r13 != r0) goto L_0x012f
            short r0 = (short) r1
            r10[r14] = r0
            if (r3 >= r9) goto L_0x012a
            r19[r1] = r11
            r0 = r1 ^ 1
            r19[r0] = r2
        L_0x012a:
            int r3 = r3 + 1
        L_0x012c:
            int r9 = r9 + 1
            goto L_0x00f8
        L_0x012f:
            r0 = r19[r13]
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0146
            r1 = r13 ^ 1
            r0 = r19[r1]
            r0.getClass()
            X.6pb r6 = new X.6pb
            r6.<init>(r11, r2, r0)
            r19[r1] = r2
            goto L_0x012c
        L_0x0146:
            int r14 = r14 + 1
            goto L_0x0115
        L_0x0149:
            int[] r10 = new int[r10]
            java.util.Arrays.fill(r10, r11)
            r9 = 0
            r3 = 0
        L_0x0150:
            if (r9 >= r7) goto L_0x019c
            int r0 = r9 + r9
            int r15 = r3 + r3
            r13 = r19[r0]
            r13.getClass()
            r0 = r0 ^ 1
            r2 = r19[r0]
            r2.getClass()
            X.AnonymousClass6J8.A00(r13, r2)
            int r0 = r13.hashCode()
            int r14 = X.AnonymousClass6J9.A00(r0)
        L_0x016d:
            r14 = r14 & r16
            r1 = r10[r14]
            if (r1 != r11) goto L_0x0182
            r10[r14] = r15
            if (r3 >= r9) goto L_0x017d
            r19[r15] = r13
            r0 = r15 ^ 1
            r19[r0] = r2
        L_0x017d:
            int r3 = r3 + 1
        L_0x017f:
            int r9 = r9 + 1
            goto L_0x0150
        L_0x0182:
            r0 = r19[r1]
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0199
            r1 = r1 ^ 1
            r0 = r19[r1]
            r0.getClass()
            X.6pb r6 = new X.6pb
            r6.<init>(r13, r2, r0)
            r19[r1] = r2
            goto L_0x017f
        L_0x0199:
            int r14 = r14 + 1
            goto L_0x016d
        L_0x019c:
            if (r3 == r7) goto L_0x01bc
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r17] = r10
            X.C86164wN.A1O(r0, r3, r5)
            goto L_0x01af
        L_0x01a6:
            if (r3 == r7) goto L_0x01bc
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r17] = r10
            X.C86164wN.A1O(r0, r3, r5)
        L_0x01af:
            r0[r4] = r6
            r6 = r0
            goto L_0x0065
        L_0x01b4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r10 = new java.lang.Object[]{r3, r0, r6}
        L_0x01bc:
            r6 = r10
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5qY.A00(X.6rz, java.lang.Object[], int):X.5qY");
    }

    public final AnonymousClass89B A03() {
        return new AnonymousClass5qU(this.A00, 1, this.A01);
    }

    public final C93645qb A04() {
        return new C93635qa(this, this.A00, this.A01);
    }

    public final C93645qb A05() {
        return new AnonymousClass5qZ(new AnonymousClass5qU(this.A00, 0, this.A01), this);
    }

    public final Object get(Object obj) {
        char c;
        char c2;
        Object obj2 = this.A02;
        Object[] objArr = this.A00;
        int i = this.A01;
        if (obj != null) {
            if (i == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                if (obj3.equals(obj)) {
                    Object obj4 = objArr[1];
                    obj4.getClass();
                    return obj4;
                }
            } else if (obj2 != null) {
                if (!(obj2 instanceof byte[])) {
                    if (!(obj2 instanceof short[])) {
                        int[] iArr = (int[]) obj2;
                        int length = iArr.length - 1;
                        int A002 = AnonymousClass6J9.A00(obj.hashCode());
                        while (true) {
                            int i2 = A002 & length;
                            int i3 = iArr[i2];
                            if (i3 == -1) {
                                break;
                            } else if (obj.equals(objArr[i3])) {
                                c = i3 ^ 1;
                                break;
                            } else {
                                A002 = i2 + 1;
                            }
                        }
                    } else {
                        short[] sArr = (short[]) obj2;
                        int length2 = sArr.length - 1;
                        int A003 = AnonymousClass6J9.A00(obj.hashCode());
                        while (true) {
                            int i4 = A003 & length2;
                            c2 = (char) sArr[i4];
                            if (c2 != 65535) {
                                if (obj.equals(objArr[c2])) {
                                    break;
                                }
                                A003 = i4 + 1;
                            } else {
                                break;
                            }
                        }
                    }
                } else {
                    byte[] bArr = (byte[]) obj2;
                    int length3 = bArr.length - 1;
                    int A004 = AnonymousClass6J9.A00(obj.hashCode());
                    while (true) {
                        int i5 = A004 & length3;
                        c2 = bArr[i5] & 255;
                        if (c2 != 255) {
                            if (obj.equals(objArr[c2])) {
                                break;
                            }
                            A004 = i5 + 1;
                        } else {
                            break;
                        }
                    }
                }
                c = c2 ^ 1;
                Object obj5 = objArr[c];
                if (obj5 == null) {
                    return null;
                }
                return obj5;
            }
        }
        return null;
    }
}
