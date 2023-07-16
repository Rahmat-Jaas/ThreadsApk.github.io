package X;

import java.util.ListIterator;

/* renamed from: X.53B  reason: invalid class name */
public final class AnonymousClass53B<E> extends AnonymousClass8AD<E> implements C147378pF<E> {
    public final int A00;
    public final int A01;
    public final Object[] A02;
    public final Object[] A03;

    public final C147378pF A5V(Object obj, int i) {
        int i2 = i;
        C120407Al.A01(i, size());
        Object obj2 = obj;
        if (i == size()) {
            return A5J(obj);
        }
        int size = (size() - 1) & -32;
        if (i >= size) {
            return A01(obj, this.A02, i - size);
        }
        C104096bE r4 = new C104096bE((Object) null);
        return A01(r4.A00, A03(r4, obj2, this.A02, this.A00, i2), 0);
    }

    public final C147378pF CbP(AnonymousClass0YY r5) {
        C04220Ms.A0B(r5, 0);
        AnonymousClass8AM r0 = new AnonymousClass8AM(this, this.A02, this.A03, this.A00);
        r0.A0R(r5);
        return r0.AB1();
    }

    private final Object[] A03(C104096bE r13, Object obj, Object[] objArr, int i, int i2) {
        Object[] A1b;
        int i3 = i2;
        int i4 = (i2 >> i) & 31;
        C104096bE r7 = r13;
        Object obj2 = obj;
        if (i == 0) {
            if (i4 == 0) {
                A1b = new Object[32];
            } else {
                A1b = C86124wJ.A1b(objArr, 32);
            }
            AnonymousClass8AQ.A0G(objArr, A1b, i4 + 1, i4, 31);
            r13.A00 = objArr[31];
            A1b[i4] = obj;
        } else {
            A1b = C86124wJ.A1b(objArr, 32);
            int i5 = i - 5;
            Object[] objArr2 = objArr[i4];
            C04220Ms.A0C(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            A1b[i4] = A03(r7, obj2, objArr2, i5, i3);
            int i6 = i4 + 1;
            while (i6 < 32 && A1b[i6] != null) {
                Object[] objArr3 = objArr[i6];
                C04220Ms.A0C(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A1b[i6] = A03(r7, r13.A00, objArr3, i5, 0);
                i6++;
            }
        }
        return A1b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r1 == null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] A04(X.C104096bE r6, java.lang.Object[] r7, int r8, int r9) {
        /*
            r5 = this;
            int r0 = r9 >> r8
            r4 = r0 & 31
            r3 = 0
            r2 = 5
            if (r8 != r2) goto L_0x0010
            r0 = r7[r4]
            r6.A00 = r0
            r1 = r3
        L_0x000d:
            if (r4 != 0) goto L_0x0021
            return r3
        L_0x0010:
            r1 = r7[r4]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            X.C04220Ms.A0C(r1, r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r8 = r8 - r2
            java.lang.Object[] r1 = r5.A04(r6, r1, r8, r9)
            if (r1 != 0) goto L_0x0021
            goto L_0x000d
        L_0x0021:
            r0 = 32
            java.lang.Object[] r3 = X.C86124wJ.A1b(r7, r0)
            r3[r4] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass53B.A04(X.6bE, java.lang.Object[], int, int):java.lang.Object[]");
    }

    private final Object[] A05(C104096bE r9, Object[] objArr, int i, int i2) {
        Object[] A1b;
        int i3 = (i2 >> i) & 31;
        int i4 = 31;
        if (i == 0) {
            if (i3 == 0) {
                A1b = new Object[32];
            } else {
                A1b = C86124wJ.A1b(objArr, 32);
            }
            AnonymousClass8AQ.A0G(objArr, A1b, i3, i3 + 1, 32);
            A1b[31] = r9.A00;
            r9.A00 = objArr[i3];
            return A1b;
        }
        if (objArr[31] == null) {
            i4 = ((((size() - 1) & -32) - 1) >> i) & 31;
        }
        Object[] A1b2 = C86124wJ.A1b(objArr, 32);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj = A1b2[i4];
                C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A1b2[i4] = A05(r9, (Object[]) obj, i5, 0);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj2 = A1b2[i3];
        C04220Ms.A0C(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A1b2[i3] = A05(r9, (Object[]) obj2, i5, i2);
        return A1b2;
    }

    private final Object[] A06(Object obj, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        Object[] A1b = C86124wJ.A1b(objArr, 32);
        if (i == 0) {
            A1b[i3] = obj;
            return A1b;
        }
        Object obj2 = A1b[i3];
        C04220Ms.A0C(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A1b[i3] = A06(obj, (Object[]) obj2, i - 5, i2);
        return A1b;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass8s0 ABS() {
        return new AnonymousClass8AM(this, this.A02, this.A03, this.A00);
    }

    public AnonymousClass53B(Object[] objArr, Object[] objArr2, int i, int i2) {
        AnonymousClass0wJ.A1O(objArr, objArr2);
        this.A02 = objArr;
        this.A03 = objArr2;
        this.A01 = i;
        this.A00 = i2;
        if (size() > 32) {
            size();
            size();
            return;
        }
        throw C18190wL.A0a(AnonymousClass00U.A0J("Trie-based persistent vector should have at least 33 elements, got ", size()));
    }

    private final C147378pF A00(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size != 1) {
            Object[] objArr2 = this.A03;
            Object[] A1b = C86124wJ.A1b(objArr2, 32);
            int i4 = size - 1;
            if (i3 < i4) {
                AnonymousClass8AQ.A0G(objArr2, A1b, i3, i3 + 1, size);
            }
            A1b[i4] = null;
            return new AnonymousClass53B(objArr, A1b, (i + size) - 1, i2);
        } else if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = C86124wJ.A1b(objArr, 32);
            }
            return new AnonymousClass53A(objArr);
        } else {
            C104096bE r1 = new C104096bE((Object) null);
            Object[] A04 = A04(r1, objArr, i2, i - 1);
            C04220Ms.A0A(A04);
            Object obj = r1.A00;
            C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objArr3 = (Object[]) obj;
            if (A04[1] == null) {
                Object obj2 = A04[0];
                C04220Ms.A0C(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A04 = (Object[]) obj2;
                i2 -= 5;
            }
            return new AnonymousClass53B(A04, objArr3, i, i2);
        }
    }

    private final AnonymousClass53B A01(Object obj, Object[] objArr, int i) {
        int size = size() - ((size() - 1) & -32);
        Object[] objArr2 = this.A03;
        Object[] A1b = C86124wJ.A1b(objArr2, 32);
        if (size < 32) {
            AnonymousClass8AQ.A0G(objArr2, A1b, i + 1, i, size);
            A1b[i] = obj;
            return new AnonymousClass53B(objArr, A1b, size() + 1, this.A00);
        }
        Object obj2 = objArr2[31];
        System.arraycopy(objArr2, i, A1b, i + 1, (size - 1) - i);
        A1b[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return A02(objArr, A1b, objArr3);
    }

    private final AnonymousClass53B A02(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        Object[] A07;
        int size = size() >> 5;
        int i = this.A00;
        if (size > (1 << i)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            i += 5;
            A07 = A07(objArr4, objArr2, i);
        } else {
            A07 = A07(objArr, objArr2, i);
        }
        return new AnonymousClass53B(A07, objArr3, size() + 1, i);
    }

    private final Object[] A07(Object[] objArr, Object[] objArr2, int i) {
        Object[] objArr3;
        int size = ((size() - 1) >> i) & 31;
        if (objArr != null) {
            objArr3 = C86124wJ.A1b(objArr, 32);
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[size] = objArr2;
            return objArr3;
        }
        objArr3[size] = A07((Object[]) objArr3[size], objArr2, i - 5);
        return objArr3;
    }

    public final C147378pF A5J(Object obj) {
        int size = size() - ((size() - 1) & -32);
        if (size < 32) {
            Object[] A1b = C86124wJ.A1b(this.A03, 32);
            A1b[size] = obj;
            return new AnonymousClass53B(this.A02, A1b, size() + 1, this.A00);
        }
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return A02(this.A02, this.A03, objArr);
    }

    public final C147378pF CbV(int i) {
        C120407Al.A00(i, size());
        int size = (size() - 1) & -32;
        Object[] objArr = this.A02;
        int i2 = this.A00;
        if (i >= size) {
            return A00(objArr, size, i2, i - size);
        }
        return A00(A05(new C104096bE(this.A03[0]), objArr, i2, i), size, i2, 0);
    }

    public final C147378pF ChP(Object obj, int i) {
        C120407Al.A00(i, size());
        if (((size() - 1) & -32) <= i) {
            Object[] A1b = C86124wJ.A1b(this.A03, 32);
            A1b[i & 31] = obj;
            return new AnonymousClass53B(this.A02, A1b, size(), this.A00);
        }
        Object[] objArr = this.A02;
        int i2 = this.A00;
        return new AnonymousClass53B(A06(obj, objArr, i2, i), this.A03, size(), i2);
    }

    public final Object get(int i) {
        Object[] objArr;
        C120407Al.A00(i, size());
        if (((size() - 1) & -32) <= i) {
            objArr = this.A03;
        } else {
            objArr = this.A02;
            for (int i2 = this.A00; i2 > 0; i2 -= 5) {
                Object obj = objArr[(i >> i2) & 31];
                C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    public final ListIterator listIterator(int i) {
        C120407Al.A01(i, size());
        return new AnonymousClass537(this.A02, this.A03, i, size(), (this.A00 / 5) + 1);
    }
}
