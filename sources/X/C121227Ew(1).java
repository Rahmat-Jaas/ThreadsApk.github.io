package X;

/* renamed from: X.7Ew  reason: invalid class name and case insensitive filesystem */
public final class C121227Ew {
    public int A00;
    public int[] A01;
    public AnonymousClass84Z[] A02;
    public Object[] A03;

    public static AnonymousClass84Z A01(C121227Ew r2, int i) {
        AnonymousClass84Z r0 = r2.A02[r2.A01[i]];
        C04220Ms.A0A(r0);
        return r0;
    }

    public final void A02() {
        int length = this.A02.length;
        for (int i = 0; i < length; i++) {
            AnonymousClass84Z r0 = this.A02[i];
            if (r0 != null) {
                r0.clear();
            }
            this.A01[i] = i;
            this.A03[i] = null;
        }
        this.A00 = 0;
    }

    public final void A03(Object obj) {
        int i = this.A00;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.A01[i3];
            AnonymousClass84Z r0 = this.A02[i4];
            C04220Ms.A0A(r0);
            r0.remove(obj);
            if (r0.size() > 0) {
                if (i2 != i3) {
                    int[] iArr = this.A01;
                    int i5 = iArr[i2];
                    iArr[i2] = i4;
                    iArr[i3] = i5;
                }
                i2++;
            }
        }
        int i6 = this.A00;
        for (int i7 = i2; i7 < i6; i7++) {
            this.A03[this.A01[i7]] = null;
        }
        this.A00 = i2;
    }

    public C121227Ew() {
        int[] iArr = new int[50];
        int i = 0;
        do {
            iArr[i] = i;
            i++;
        } while (i < 50);
        this.A01 = iArr;
        this.A03 = new Object[50];
        this.A02 = new AnonymousClass84Z[50];
    }

    public static final int A00(C121227Ew r6, Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        int i = r6.A00 - 1;
        int i2 = 0;
        while (true) {
            if (i2 > i) {
                break;
            }
            int i3 = (i2 + i) >>> 1;
            Object obj2 = r6.A03[r6.A01[i3]];
            C04220Ms.A0A(obj2);
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 >= identityHashCode) {
                if (identityHashCode2 <= identityHashCode) {
                    if (obj != obj2) {
                        int i4 = i3 - 1;
                        while (-1 < i4) {
                            Object obj3 = r6.A03[r6.A01[i4]];
                            C04220Ms.A0A(obj3);
                            if (obj3 != obj) {
                                i4--;
                                if (System.identityHashCode(obj3) != identityHashCode) {
                                    break;
                                }
                            } else {
                                return i4;
                            }
                        }
                        i2 = i3 + 1;
                        int i5 = r6.A00;
                        while (true) {
                            if (i2 >= i5) {
                                i2 = r6.A00;
                                break;
                            }
                            Object obj4 = r6.A03[r6.A01[i2]];
                            C04220Ms.A0A(obj4);
                            if (obj4 != obj) {
                                if (System.identityHashCode(obj4) != identityHashCode) {
                                    break;
                                }
                                i2++;
                            } else {
                                return i2;
                            }
                        }
                    } else {
                        return i3;
                    }
                } else {
                    i = i3 - 1;
                }
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r6 = X.AnonymousClass0wJ.A1Y(r9, r10)
            int r0 = r8.A00
            if (r0 <= 0) goto L_0x0016
            int r0 = A00(r8, r9)
            if (r0 < 0) goto L_0x0017
            X.84Z r7 = A01(r8, r0)
        L_0x0012:
            r7.add(r10)
            return
        L_0x0016:
            r0 = -1
        L_0x0017:
            int r0 = r0 + 1
            int r5 = -r0
            int r4 = r8.A00
            int[] r2 = r8.A01
            int r0 = r2.length
            if (r4 >= r0) goto L_0x0047
            r1 = r2[r4]
            java.lang.Object[] r0 = r8.A03
            r0[r1] = r9
            X.84Z[] r0 = r8.A02
            r7 = r0[r1]
            if (r7 != 0) goto L_0x0034
            X.84Z r7 = new X.84Z
            r7.<init>()
            r0[r1] = r7
        L_0x0034:
            if (r5 >= r4) goto L_0x003c
            int r0 = r5 + 1
            int r4 = r4 - r5
            java.lang.System.arraycopy(r2, r5, r2, r0, r4)
        L_0x003c:
            int[] r0 = r8.A01
            r0[r5] = r1
        L_0x0040:
            int r0 = r8.A00
            int r0 = r0 + 1
            r8.A00 = r0
            goto L_0x0012
        L_0x0047:
            int r1 = r0 << 1
            X.84Z[] r0 = r8.A02
            java.lang.Object[] r0 = X.C86124wJ.A1b(r0, r1)
            X.84Z[] r0 = (X.AnonymousClass84Z[]) r0
            r8.A02 = r0
            X.84Z r7 = new X.84Z
            r7.<init>()
            r0[r4] = r7
            java.lang.Object[] r0 = r8.A03
            java.lang.Object[] r0 = X.C86124wJ.A1b(r0, r1)
            r8.A03 = r0
            r0[r4] = r9
            int[] r3 = new int[r1]
            int r0 = r8.A00
            r2 = r0
        L_0x0069:
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x0070
            r3[r0] = r0
            goto L_0x0069
        L_0x0070:
            if (r5 >= r2) goto L_0x007a
            int[] r1 = r8.A01
            int r0 = r5 + 1
            int r2 = r2 - r5
            java.lang.System.arraycopy(r1, r5, r3, r0, r2)
        L_0x007a:
            r3[r5] = r4
            if (r5 <= 0) goto L_0x0083
            int[] r0 = r8.A01
            java.lang.System.arraycopy(r0, r6, r3, r6, r5)
        L_0x0083:
            r8.A01 = r3
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121227Ew.A04(java.lang.Object, java.lang.Object):void");
    }

    public final boolean A05(Object obj, Object obj2) {
        int i;
        AnonymousClass84Z r0;
        boolean A1Y = AnonymousClass0wJ.A1Y(obj, obj2);
        int A002 = A00(this, obj);
        if (A002 >= 0 && (r0 = this.A02[i]) != null) {
            A1Y = r0.remove(obj2);
            if (r0.size() == 0) {
                int i2 = A002 + 1;
                int i3 = this.A00;
                if (i2 < i3) {
                    int[] iArr = this.A01;
                    System.arraycopy(iArr, i2, iArr, A002, i3 - i2);
                }
                int[] iArr2 = this.A01;
                int i4 = this.A00 - 1;
                iArr2[i4] = (i = this.A01[A002]);
                this.A03[i] = null;
                this.A00 = i4;
            }
        }
        return A1Y;
    }
}
