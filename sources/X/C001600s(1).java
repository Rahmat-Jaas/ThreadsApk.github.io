package X;

/* renamed from: X.00s  reason: invalid class name and case insensitive filesystem */
public final class C001600s implements Cloneable {
    public static final Object A04 = new Object();
    public int A00;
    public boolean A01;
    public long[] A02;
    public Object[] A03;

    public final Object A04(long j) {
        Object obj;
        int A012 = C001400q.A01(this.A02, this.A00, j);
        if (A012 < 0 || (obj = this.A03[A012]) == A04) {
            return null;
        }
        return obj;
    }

    public static void A00(C001600s r9) {
        int i = r9.A00;
        long[] jArr = r9.A02;
        Object[] objArr = r9.A03;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != A04) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        r9.A01 = false;
        r9.A00 = i2;
    }

    public final int A01() {
        if (this.A01) {
            A00(this);
        }
        return this.A00;
    }

    public final long A02(int i) {
        if (this.A01) {
            A00(this);
        }
        return this.A02[i];
    }

    public final Object A03(int i) {
        if (this.A01) {
            A00(this);
        }
        return this.A03[i];
    }

    public final void A05() {
        int i = this.A00;
        Object[] objArr = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r2 = r4.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(long r5) {
        /*
            r4 = this;
            long[] r1 = r4.A02
            int r0 = r4.A00
            int r3 = X.C001400q.A01(r1, r0, r5)
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
        throw new UnsupportedOperationException("Method not decompiled: X.C001600s.A06(long):void");
    }

    public final void A07(long j, Object obj) {
        long[] jArr = this.A02;
        int i = this.A00;
        int A012 = C001400q.A01(jArr, i, j);
        if (A012 >= 0) {
            this.A03[A012] = obj;
            return;
        }
        int i2 = A012 ^ -1;
        if (i2 < i) {
            Object[] objArr = this.A03;
            if (objArr[i2] == A04) {
                jArr[i2] = j;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.A01 && i >= jArr.length) {
            A00(this);
            i = this.A00;
            i2 = C001400q.A01(jArr, i, j) ^ -1;
        }
        int length = jArr.length;
        if (i >= length) {
            int i3 = (i + 1) << 3;
            int i4 = 4;
            while (true) {
                int i5 = (1 << i4) - 12;
                if (i3 > i5) {
                    i4++;
                    if (i4 >= 32) {
                        break;
                    }
                } else {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 >> 3;
            long[] jArr2 = new long[i6];
            Object[] objArr2 = new Object[i6];
            System.arraycopy(jArr, 0, jArr2, 0, length);
            Object[] objArr3 = this.A03;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.A02 = jArr2;
            jArr = jArr2;
            this.A03 = objArr2;
        }
        int i7 = this.A00 - i2;
        if (i7 != 0) {
            int i8 = i2 + 1;
            System.arraycopy(jArr, i2, jArr, i8, i7);
            Object[] objArr4 = this.A03;
            System.arraycopy(objArr4, i2, objArr4, i8, this.A00 - i2);
        }
        this.A02[i2] = j;
        this.A03[i2] = obj;
        this.A00++;
    }

    public C001600s(int i) {
        this.A01 = false;
        int i2 = i << 3;
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
        int i5 = i2 >> 3;
        this.A02 = new long[i5];
        this.A03 = new Object[i5];
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        try {
            C001600s r1 = (C001600s) super.clone();
            r1.A02 = (long[]) this.A02.clone();
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
            Object A032 = A03(i);
            if (A032 != this) {
                sb.append(A032);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C001600s() {
        this(10);
    }
}
