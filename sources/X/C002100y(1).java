package X;

/* renamed from: X.00y  reason: invalid class name and case insensitive filesystem */
public final class C002100y implements Cloneable {
    public static final Object A04 = new Object();
    public int A00;
    public boolean A01;
    public int[] A02;
    public Object[] A03;

    public final Object A04(int i) {
        Object obj;
        int A002 = C001400q.A00(this.A02, this.A00, i);
        if (A002 < 0 || (obj = this.A03[A002]) == A04) {
            return null;
        }
        return obj;
    }

    public static void A00(C002100y r8) {
        int i = r8.A00;
        int[] iArr = r8.A02;
        Object[] objArr = r8.A03;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != A04) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        r8.A01 = false;
        r8.A00 = i2;
    }

    public final int A01() {
        if (this.A01) {
            A00(this);
        }
        return this.A00;
    }

    public final int A02(int i) {
        if (this.A01) {
            A00(this);
        }
        return this.A02[i];
    }

    public final int A03(Object obj) {
        if (this.A01) {
            A00(this);
        }
        for (int i = 0; i < this.A00; i++) {
            if (this.A03[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public final Object A05(int i) {
        if (this.A01) {
            A00(this);
        }
        return this.A03[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r2 = r4.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(int r5) {
        /*
            r4 = this;
            int[] r1 = r4.A02
            int r0 = r4.A00
            int r3 = X.C001400q.A00(r1, r0, r5)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r2 = r4.A03
            r1 = r2[r3]
            java.lang.Object r0 = A04
            if (r1 == r0) goto L_0x0017
            r2[r3] = r0
            r0 = 1
            r4.A01 = r0
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002100y.A06(int):void");
    }

    public final void A07(int i, Object obj) {
        int[] iArr = this.A02;
        int i2 = this.A00;
        int A002 = C001400q.A00(iArr, i2, i);
        if (A002 >= 0) {
            this.A03[A002] = obj;
            return;
        }
        int i3 = A002 ^ -1;
        if (i3 < i2) {
            Object[] objArr = this.A03;
            if (objArr[i3] == A04) {
                iArr[i3] = i;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.A01 && i2 >= iArr.length) {
            A00(this);
            i2 = this.A00;
            i3 = C001400q.A00(iArr, i2, i) ^ -1;
        }
        int length = iArr.length;
        if (i2 >= length) {
            int i4 = (i2 + 1) << 2;
            int i5 = 4;
            while (true) {
                int i6 = (1 << i5) - 12;
                if (i4 > i6) {
                    i5++;
                    if (i5 >= 32) {
                        break;
                    }
                } else {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 >> 2;
            int[] iArr2 = new int[i7];
            Object[] objArr2 = new Object[i7];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            Object[] objArr3 = this.A03;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.A02 = iArr2;
            iArr = iArr2;
            this.A03 = objArr2;
        }
        int i8 = this.A00 - i3;
        if (i8 != 0) {
            int i9 = i3 + 1;
            System.arraycopy(iArr, i3, iArr, i9, i8);
            Object[] objArr4 = this.A03;
            System.arraycopy(objArr4, i3, objArr4, i9, this.A00 - i3);
        }
        this.A02[i3] = i;
        this.A03[i3] = obj;
        this.A00++;
    }

    public C002100y(int i) {
        this.A01 = false;
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            int i4 = (1 << i3) - 12;
            if (i2 > i4) {
                i3++;
                if (i3 >= 32) {
                    break;
                }
            } else {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 >> 2;
        this.A02 = new int[i5];
        this.A03 = new Object[i5];
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        try {
            C002100y r1 = (C002100y) super.clone();
            r1.A02 = (int[]) this.A02.clone();
            r1.A03 = (Object[]) this.A03.clone();
            return r1;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        if (A01() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.A00 * 28);
        sb.append('{');
        for (int i = 0; i < this.A00; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(A02(i));
            sb.append('=');
            Object A05 = A05(i);
            if (A05 != this) {
                sb.append(A05);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C002100y() {
        this(10);
    }
}
