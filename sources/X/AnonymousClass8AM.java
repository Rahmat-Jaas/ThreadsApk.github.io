package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.8AM  reason: invalid class name */
public final class AnonymousClass8AM<E> extends AnonymousClass89L<E> implements AnonymousClass8s0<E> {
    public int A00;
    public int A01;
    public AnonymousClass6EL A02 = new AnonymousClass6EL();
    public Object[] A03;
    public Object[] A04;
    public C147378pF A05;
    public Object[] A06;
    public Object[] A07;

    private final int A04(C104096bE r6, List list, List list2, AnonymousClass0YY r9, Object[] objArr, int i, int i2) {
        if (objArr.length == 33 && objArr[32] == this.A02) {
            list.add(objArr);
        }
        Object obj = r6.A00;
        C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!AnonymousClass0wJ.A1X(r9.invoke(obj2))) {
                if (i2 == 32) {
                    if (C18190wL.A1a(list)) {
                        objArr3 = (Object[]) list.remove(C86104wH.A0B(list));
                    } else {
                        objArr3 = A0E();
                    }
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        r6.A00 = objArr3;
        if (objArr2 != objArr3) {
            list2.add(objArr2);
        }
        return i2;
    }

    private final void A09(Collection collection, Object[] objArr, Object[] objArr2, Object[][] objArr3, int i, int i2, int i3) {
        Object[] A0E;
        if (i3 >= 1) {
            Object[] A0K = A0K(objArr);
            objArr3[0] = A0K;
            int i4 = i & 31;
            int size = ((i + collection.size()) - 1) & 31;
            int i5 = (i2 - i4) + size;
            if (i5 < 32) {
                AnonymousClass8AQ.A0G(A0K, objArr2, size + 1, i4, i2);
            } else {
                int i6 = (i5 - 32) + 1;
                if (i3 == 1) {
                    A0E = A0K;
                } else {
                    A0E = A0E();
                    i3--;
                    objArr3[i3] = A0E;
                }
                int i7 = i2 - i6;
                AnonymousClass8AQ.A0G(A0K, objArr2, 0, i7, i2);
                AnonymousClass8AQ.A0G(A0K, A0E, size + 1, i4, i7);
                objArr2 = A0E;
            }
            Iterator it = collection.iterator();
            A0B(it, A0K, i4);
            for (int i8 = 1; i8 < i3; i8++) {
                Object[] A0E2 = A0E();
                A0B(it, A0E2, 0);
                objArr3[i8] = A0E2;
            }
            A0B(it, objArr2, 0);
            return;
        }
        throw C18180wK.A0a("Check failed.");
    }

    private final void A0C(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.A03 = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.A04 = objArr;
            this.A01 = i;
        } else {
            C104096bE r0 = new C104096bE((Object) null);
            C04220Ms.A0A(objArr);
            Object[] A0H = A0H(r0, objArr, i2, i);
            C04220Ms.A0A(A0H);
            Object obj = r0.A00;
            C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            this.A04 = (Object[]) obj;
            this.A01 = i;
            if (A0H[1] == null) {
                this.A03 = (Object[]) A0H[0];
                i2 -= 5;
            } else {
                this.A03 = A0H;
            }
        }
        this.A00 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r4[32] != r3.A02) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] A0L(java.lang.Object[] r4, int r5) {
        /*
            r3 = this;
            int r1 = r4.length
            r0 = 33
            if (r1 != r0) goto L_0x000e
            r0 = 32
            r2 = r4[r0]
            X.6EL r1 = r3.A02
            r0 = 1
            if (r2 == r1) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r2 = 0
            if (r0 == 0) goto L_0x0018
            int r0 = 32 - r5
            X.AnonymousClass8AQ.A0G(r4, r4, r5, r2, r0)
            return r4
        L_0x0018:
            java.lang.Object[] r1 = r3.A0E()
            int r0 = 32 - r5
            X.AnonymousClass8AQ.A0G(r4, r1, r5, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AM.A0L(java.lang.Object[], int):java.lang.Object[]");
    }

    private final Object[] A0M(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            throw C18180wK.A0a("Check failed.");
        } else if (i2 == 0) {
            return objArr;
        } else {
            int i3 = (i >> i2) & 31;
            Object[] objArr2 = objArr[i3];
            C04220Ms.A0C(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object A0M = A0M(objArr2, i, i2 - 5);
            if (i3 < 31) {
                int i4 = i3 + 1;
                if (objArr[i4] != null) {
                    if (objArr.length == 33 && objArr[32] == this.A02) {
                        Arrays.fill(objArr, i4, 32, (Object) null);
                    }
                    Object[] A0E = A0E();
                    AnonymousClass8AQ.A0G(objArr, A0E, 0, 0, i4);
                    objArr = A0E;
                }
            }
            if (A0M == objArr[i3]) {
                return objArr;
            }
            Object[] A0K = A0K(objArr);
            A0K[i3] = A0M;
            return A0K;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r13 != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        r14.modCount++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        return r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0R(X.AnonymousClass0YY r23) {
        /*
            r22 = this;
            r6 = 0
            r7 = r23
            X.C04220Ms.A0B(r7, r6)
            r14 = r22
            int r0 = r14.size()
            r1 = 32
            int r3 = X.AnonymousClass89L.A00(r0, r0)
            r2 = 0
            X.6bE r15 = new X.6bE
            r15.<init>(r2)
            java.lang.Object[] r0 = r14.A03
            r13 = 0
            if (r0 != 0) goto L_0x002d
            int r4 = r14.A05(r15, r7, r3)
        L_0x0021:
            if (r4 == r3) goto L_0x0024
            r13 = 1
        L_0x0024:
            if (r13 == 0) goto L_0x002c
        L_0x0026:
            int r0 = r14.modCount
            int r0 = r0 + 1
            r14.modCount = r0
        L_0x002c:
            return r13
        L_0x002d:
            java.util.ListIterator r12 = r14.A07(r6)
        L_0x0031:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r11 = r12.next()
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            r10 = 0
            r9 = r11
            r4 = 32
            r8 = 0
        L_0x0042:
            r5 = r11[r10]
            java.lang.Object r0 = r7.invoke(r5)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x0087
            if (r8 != 0) goto L_0x0056
            java.lang.Object[] r9 = r14.A0K(r11)
            r8 = 1
            r4 = r10
        L_0x0056:
            int r10 = r10 + 1
            if (r10 < r1) goto L_0x0042
            r15.A00 = r9
            if (r4 == r1) goto L_0x0031
            if (r4 == r1) goto L_0x00f5
            int r0 = r12.previousIndex()
            int r5 = r0 << 5
            java.util.ArrayList r17 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r16 = X.AnonymousClass0wJ.A0v()
        L_0x006e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r12.next()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r20 = r1
            r21 = r4
            r18 = r7
            r19 = r0
            int r4 = r14.A04(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x006e
        L_0x0087:
            if (r8 == 0) goto L_0x0056
            int r0 = r4 + 1
            r9[r4] = r5
            r4 = r0
            goto L_0x0056
        L_0x008f:
            java.lang.Object[] r0 = r14.A04
            r20 = r3
            r21 = r4
            r18 = r7
            r19 = r0
            int r7 = r14.A04(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r8 = r15.A00
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            X.C04220Ms.A0C(r8, r4)
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            X.C04220Ms.A0B(r8, r6)
            java.util.Arrays.fill(r8, r7, r1, r2)
            boolean r0 = r17.isEmpty()
            java.lang.Object[] r3 = r14.A03
            if (r0 == 0) goto L_0x00ea
            X.C04220Ms.A0A(r3)
        L_0x00b7:
            int r0 = r17.size()
            int r0 = r0 << 5
            int r5 = r5 + r0
            r1 = r5 & 31
            r0 = 1
            if (r1 != 0) goto L_0x010b
            if (r5 != 0) goto L_0x00d1
            r14.A00 = r6
        L_0x00c7:
            r14.A03 = r2
            r14.A04 = r8
            int r5 = r5 + r7
            r14.A01 = r5
            r13 = 1
            goto L_0x0026
        L_0x00d1:
            int r2 = r5 - r0
        L_0x00d3:
            int r1 = r14.A00
            int r0 = r2 >> r1
            if (r0 != 0) goto L_0x00e5
            int r0 = r1 + -5
            r14.A00 = r0
            r3 = r3[r6]
            X.C04220Ms.A0C(r3, r4)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            goto L_0x00d3
        L_0x00e5:
            java.lang.Object[] r2 = r14.A0M(r3, r2, r1)
            goto L_0x00c7
        L_0x00ea:
            int r1 = r14.A00
            java.util.Iterator r0 = r17.iterator()
            java.lang.Object[] r3 = r14.A0J(r0, r3, r5, r1)
            goto L_0x00b7
        L_0x00f5:
            r12.hasNext()
            int r4 = r14.A05(r15, r7, r3)
            if (r4 != 0) goto L_0x0021
            java.lang.Object[] r2 = r14.A03
            int r1 = r14.size()
            int r0 = r14.A00
            r14.A0C(r2, r1, r0)
            goto L_0x0021
        L_0x010b:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AM.A0R(X.0YY):boolean");
    }

    public final void add(int i, Object obj) {
        int i2 = i;
        C120407Al.A01(i, size());
        Object obj2 = obj;
        if (i == size()) {
            add(obj);
            return;
        }
        this.modCount++;
        int A032 = A03();
        if (i >= A032) {
            A08(obj, this.A03, i - A032);
            return;
        }
        C104096bE r4 = new C104096bE((Object) null);
        Object[] objArr = this.A03;
        C04220Ms.A0A(objArr);
        A08(r4.A00, A0F(r4, obj2, objArr, this.A00, i2), 0);
    }

    public final boolean removeAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        return A0R(C86154wM.A10(collection, 8));
    }

    public final Object set(int i, Object obj) {
        int i2 = i;
        C120407Al.A00(i, size());
        Object obj2 = obj;
        if (A03() <= i) {
            Object[] A0K = A0K(this.A04);
            if (A0K != this.A04) {
                this.modCount++;
            }
            int i3 = i & 31;
            Object obj3 = A0K[i3];
            A0K[i3] = obj;
            this.A04 = A0K;
            return obj3;
        }
        C104096bE r4 = new C104096bE((Object) null);
        Object[] objArr = this.A03;
        C04220Ms.A0A(objArr);
        this.A03 = A0G(r4, obj2, objArr, this.A00, i2);
        return r4.A00;
    }

    private final int A05(C104096bE r8, AnonymousClass0YY r9, int i) {
        Object[] objArr = this.A04;
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (AnonymousClass0wJ.A1X(r9.invoke(obj))) {
                if (!z) {
                    objArr2 = A0K(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        r8.A00 = objArr2;
        if (i2 == i) {
            return i;
        }
        C04220Ms.A0C(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        C04220Ms.A0B(objArr2, 0);
        Arrays.fill(objArr2, i2, i, (Object) null);
        this.A04 = objArr2;
        this.A01 = size() - (i - i2);
        return i2;
    }

    private final ListIterator A07(int i) {
        if (this.A03 != null) {
            int A032 = A03() >> 5;
            C120407Al.A01(i, A032);
            int i2 = this.A00;
            if (i2 == 0) {
                Object[] objArr = this.A03;
                C04220Ms.A0A(objArr);
                return new AnonymousClass536(objArr, i);
            }
            int i3 = i2 / 5;
            Object[] objArr2 = this.A03;
            C04220Ms.A0A(objArr2);
            return new AnonymousClass538(objArr2, i, A032, i3);
        }
        throw AnonymousClass0wJ.A0b();
    }

    private final void A0A(Collection collection, Object[] objArr, Object[][] objArr2, int i, int i2, int i3) {
        Object[][] objArr3;
        Object[] objArr4;
        Object[] objArr5 = objArr;
        if (this.A03 != null) {
            int i4 = i;
            int i5 = i >> 5;
            int i6 = i3;
            int i7 = i6;
            Object[] objArr6 = objArr5;
            ListIterator A072 = A07(A03() >> 5);
            while (true) {
                int previousIndex = A072.previousIndex();
                objArr3 = objArr2;
                objArr4 = (Object[]) A072.previous();
                if (previousIndex == i5) {
                    break;
                }
                AnonymousClass8AQ.A0G(objArr4, objArr6, 0, 32 - i2, 32);
                objArr6 = A0L(objArr4, i2);
                i7--;
                objArr2[i7] = objArr6;
            }
            int A032 = i3 - (((A03() >> 5) - 1) - i5);
            if (A032 < i6) {
                objArr5 = objArr2[A032];
                C04220Ms.A0A(objArr5);
            }
            A09(collection, objArr4, objArr5, objArr3, i4, 32, A032);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final void A0B(Iterator it, Object[] objArr, int i) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    private final Object[] A0E() {
        Object[] objArr = new Object[33];
        objArr[32] = this.A02;
        return objArr;
    }

    private final Object[] A0F(C104096bE r5, Object obj, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            r5.A00 = objArr[31];
            Object[] A0K = A0K(objArr);
            AnonymousClass8AQ.A0G(objArr, A0K, i3 + 1, i3, 31);
            A0K[i3] = obj;
            return A0K;
        }
        Object[] A0K2 = A0K(objArr);
        int i4 = i - 5;
        Object obj2 = A0K2[i3];
        C04220Ms.A0C(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj2;
        while (true) {
            A0K2[i3] = A0F(r5, obj, objArr2, i4, i2);
            i3++;
            if (i3 >= 32 || A0K2[i3] == null) {
                return A0K2;
            }
            Object obj3 = A0K2[i3];
            C04220Ms.A0C(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) obj3;
            i2 = 0;
            obj = r5.A00;
        }
    }

    private final Object[] A0G(C104096bE r4, Object obj, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        Object[] A0K = A0K(objArr);
        if (i == 0) {
            if (A0K != objArr) {
                this.modCount++;
            }
            r4.A00 = A0K[i3];
            A0K[i3] = obj;
            return A0K;
        }
        Object obj2 = A0K[i3];
        C04220Ms.A0C(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A0K[i3] = A0G(r4, obj, (Object[]) obj2, i - 5, i2);
        return A0K;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r0 == null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] A0H(X.C104096bE r6, java.lang.Object[] r7, int r8, int r9) {
        /*
            r5 = this;
            int r0 = r9 + -1
            int r0 = r0 >> r8
            r4 = r0 & 31
            r3 = 0
            r2 = 5
            if (r8 != r2) goto L_0x0011
            r0 = r7[r4]
            r6.A00 = r0
            r0 = r3
        L_0x000e:
            if (r4 != 0) goto L_0x0022
            return r3
        L_0x0011:
            r1 = r7[r4]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            X.C04220Ms.A0C(r1, r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r8 = r8 - r2
            java.lang.Object[] r0 = r5.A0H(r6, r1, r8, r9)
            if (r0 != 0) goto L_0x0022
            goto L_0x000e
        L_0x0022:
            java.lang.Object[] r3 = r5.A0K(r7)
            r3[r4] = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AM.A0H(X.6bE, java.lang.Object[], int, int):java.lang.Object[]");
    }

    private final Object[] A0I(C104096bE r9, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        int i4 = 31;
        if (i == 0) {
            Object obj = objArr[i3];
            Object[] A0K = A0K(objArr);
            AnonymousClass8AQ.A0G(objArr, A0K, i3, i3 + 1, 32);
            A0K[31] = r9.A00;
            r9.A00 = obj;
            return A0K;
        }
        if (objArr[31] == null) {
            i4 = ((A03() - 1) >> i) & 31;
        }
        Object[] A0K2 = A0K(objArr);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj2 = A0K2[i4];
                C04220Ms.A0C(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A0K2[i4] = A0I(r9, (Object[]) obj2, i5, 0);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj3 = A0K2[i3];
        C04220Ms.A0C(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A0K2[i3] = A0I(r9, (Object[]) obj3, i5, i2);
        return A0K2;
    }

    private final Object[] A0K(Object[] objArr) {
        if (objArr == null) {
            return A0E();
        }
        int length = objArr.length;
        if (length == 33 && objArr[32] == this.A02) {
            return objArr;
        }
        Object[] A0E = A0E();
        if (length > 32) {
            length = 32;
        }
        AnonymousClass8AQ.A0G(objArr, A0E, 0, 0, length);
        return A0E;
    }

    private final Object[] A0O(Object[] objArr, Object[][] objArr2, int i) {
        Object[] objArr3;
        AnonymousClass0XN r5 = new AnonymousClass0XN(objArr2);
        int i2 = i >> 5;
        int i3 = this.A00;
        if (i2 < (1 << i3)) {
            objArr3 = A0J(r5, objArr, i, i3);
        } else {
            objArr3 = A0K(objArr);
        }
        while (r5.hasNext()) {
            int i4 = this.A00 + 5;
            this.A00 = i4;
            objArr3 = AnonymousClass89L.A02(objArr3);
            objArr3[32] = this.A02;
            A0J(r5, objArr3, 1 << i4, i4);
        }
        return objArr3;
    }

    public final int A0Q() {
        return this.modCount;
    }

    public final C147378pF AB1() {
        C147378pF r2;
        C147378pF r22;
        Object[] objArr = this.A03;
        if (objArr == this.A06 && this.A04 == this.A07) {
            r22 = this.A05;
        } else {
            this.A02 = new AnonymousClass6EL();
            this.A06 = objArr;
            Object[] objArr2 = this.A04;
            this.A07 = objArr2;
            if (objArr != null) {
                r2 = new AnonymousClass53B(objArr, objArr2, size(), this.A00);
            } else if (objArr2.length == 0) {
                r22 = AnonymousClass53A.A01;
            } else {
                r2 = new AnonymousClass53A(C86124wJ.A1b(objArr2, size()));
            }
            r22 = r2;
        }
        this.A05 = r22;
        return r22;
    }

    public final boolean addAll(int i, Collection collection) {
        Object[] A0E;
        int i2 = i;
        Collection collection2 = collection;
        C04220Ms.A0B(collection2, 1);
        C120407Al.A01(i2, size());
        if (i2 == size()) {
            return addAll(collection2);
        }
        if (collection2.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i3 = (i >> 5) << 5;
        int size = (((size() - i3) + collection2.size()) - 1) >> 5;
        if (size == 0) {
            A03();
            int i4 = i & 31;
            Object[] objArr = this.A04;
            A0E = A0K(objArr);
            int size2 = (((i + collection2.size()) - 1) & 31) + 1;
            int size3 = size();
            AnonymousClass8AQ.A0G(objArr, A0E, size2, i4, AnonymousClass89L.A00(size3, size3));
            A0B(collection2.iterator(), A0E, i4);
        } else {
            Object[][] objArr2 = new Object[size][];
            int size4 = size();
            int A002 = AnonymousClass89L.A00(size4, size4);
            int A012 = AnonymousClass89L.A01(this, collection2);
            int A003 = AnonymousClass89L.A00(A012, A012);
            if (i2 >= A03()) {
                A0E = A0E();
                A09(collection2, this.A04, A0E, objArr2, i2, A002, size);
            } else if (A003 > A002) {
                int i5 = A003 - A002;
                A0E = A0L(this.A04, i5);
                A0A(collection2, A0E, objArr2, i2, i5, size);
            } else {
                Object[] objArr3 = this.A04;
                A0E = A0E();
                int i6 = A002 - A003;
                AnonymousClass8AQ.A0G(objArr3, A0E, 0, i6, A002);
                int i7 = 32 - i6;
                Object[] A0L = A0L(this.A04, i7);
                int i8 = size - 1;
                objArr2[i8] = A0L;
                A0A(collection2, A0L, objArr2, i2, i7, i8);
            }
            this.A03 = A0O(this.A03, objArr2, i3);
        }
        this.A04 = A0E;
        this.A01 = AnonymousClass89L.A01(this, collection2);
        return true;
    }

    public AnonymousClass8AM(C147378pF r2, Object[] objArr, Object[] objArr2, int i) {
        this.A05 = r2;
        this.A06 = objArr;
        this.A07 = objArr2;
        this.A00 = i;
        this.A03 = objArr;
        this.A04 = objArr2;
        this.A01 = r2.size();
    }

    private final int A03() {
        if (size() <= 32) {
            return 0;
        }
        return C86164wN.A05(this) & -32;
    }

    private final Object A06(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size == 1) {
            Object obj = this.A04[0];
            A0C(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.A04;
        Object obj2 = objArr2[i3];
        Object[] A0K = A0K(objArr2);
        AnonymousClass8AQ.A0G(objArr2, A0K, i3, i3 + 1, size);
        A0K[size - 1] = null;
        this.A03 = objArr;
        this.A04 = A0K;
        this.A01 = (i + size) - 1;
        this.A00 = i2;
        return obj2;
    }

    private final void A08(Object obj, Object[] objArr, int i) {
        int size = size();
        int A002 = AnonymousClass89L.A00(size, size);
        Object[] A0K = A0K(this.A04);
        if (A002 < 32) {
            AnonymousClass8AQ.A0G(this.A04, A0K, i + 1, i, A002);
            A0K[i] = obj;
            this.A03 = objArr;
            this.A04 = A0K;
            this.A01 = size() + 1;
            return;
        }
        Object[] objArr2 = this.A04;
        Object obj2 = objArr2[31];
        AnonymousClass8AQ.A0G(objArr2, A0K, i + 1, i, 31);
        A0K[i] = obj;
        Object[] A022 = AnonymousClass89L.A02(obj2);
        A022[32] = this.A02;
        A0D(objArr, A0K, A022);
    }

    private final void A0D(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.A00;
        if (size > (1 << i)) {
            Object[] A022 = AnonymousClass89L.A02(objArr);
            A022[32] = this.A02;
            this.A03 = A0N(A022, objArr2, i + 5);
            this.A04 = objArr3;
            this.A00 += 5;
        } else {
            if (objArr == null) {
                this.A03 = objArr2;
            } else {
                this.A03 = A0N(objArr, objArr2, i);
            }
            this.A04 = objArr3;
        }
        this.A01 = size() + 1;
    }

    private final Object[] A0J(Iterator it, Object[] objArr, int i, int i2) {
        if (!it.hasNext()) {
            throw C18180wK.A0a("Check failed.");
        } else if (i2 < 0) {
            throw C18180wK.A0a("Check failed.");
        } else if (i2 == 0) {
            return (Object[]) it.next();
        } else {
            Object[] A0K = A0K(objArr);
            int i3 = (i >> i2) & 31;
            int i4 = i2 - 5;
            Object[] A0J = A0J(it, (Object[]) A0K[i3], i, i4);
            while (true) {
                A0K[i3] = A0J;
                i3++;
                if (i3 >= 32 || !it.hasNext()) {
                    return A0K;
                }
                A0J = A0J(it, (Object[]) A0K[i3], 0, i4);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] A0N(java.lang.Object[] r5, java.lang.Object[] r6, int r7) {
        /*
            r4 = this;
            int r0 = X.C86164wN.A05(r4)
            int r0 = r0 >> r7
            r3 = r0 & 31
            java.lang.Object[] r2 = r4.A0K(r5)
            r1 = 5
            if (r7 == r1) goto L_0x0017
            r0 = r2[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r7 = r7 - r1
            java.lang.Object[] r6 = r4.A0N(r0, r6, r7)
        L_0x0017:
            r2[r3] = r6
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AM.A0N(java.lang.Object[], java.lang.Object[], int):java.lang.Object[]");
    }

    public final Object A0P(int i) {
        C120407Al.A00(i, size());
        this.modCount++;
        int A032 = A03();
        if (i >= A032) {
            return A06(this.A03, A032, this.A00, i - A032);
        }
        C104096bE r2 = new C104096bE(this.A04[0]);
        Object[] objArr = this.A03;
        C04220Ms.A0A(objArr);
        A06(A0I(r2, objArr, this.A00, i), A032, this.A00, 0);
        return r2.A00;
    }

    public final Object get(int i) {
        Object[] objArr;
        C120407Al.A00(i, size());
        if (A03() <= i) {
            objArr = this.A04;
        } else {
            objArr = this.A03;
            C04220Ms.A0A(objArr);
            for (int i2 = this.A00; i2 > 0; i2 -= 5) {
                Object obj = objArr[(i >> i2) & 31];
                C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i) {
        C120407Al.A01(i, size());
        return new AnonymousClass539(this, i);
    }

    public final boolean add(Object obj) {
        this.modCount++;
        int size = size();
        int A002 = AnonymousClass89L.A00(size, size);
        if (A002 < 32) {
            Object[] A0K = A0K(this.A04);
            A0K[A002] = obj;
            this.A04 = A0K;
            this.A01 = size() + 1;
            return true;
        }
        Object[] A022 = AnonymousClass89L.A02(obj);
        A022[32] = this.A02;
        A0D(this.A03, this.A04, A022);
        return true;
    }

    public final boolean addAll(Collection collection) {
        Object[] A0E;
        C04220Ms.A0B(collection, 0);
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int size = size();
        int A002 = AnonymousClass89L.A00(size, size);
        Iterator it = collection.iterator();
        if (32 - A002 >= collection.size()) {
            A0E = A0K(this.A04);
            A0B(it, A0E, A002);
        } else {
            int size2 = ((collection.size() + A002) - 1) >> 5;
            Object[][] objArr = new Object[size2][];
            Object[] A0K = A0K(this.A04);
            A0B(it, A0K, A002);
            objArr[0] = A0K;
            for (int i = 1; i < size2; i++) {
                Object[] A0E2 = A0E();
                A0B(it, A0E2, 0);
                objArr[i] = A0E2;
            }
            this.A03 = A0O(this.A03, objArr, A03());
            A0E = A0E();
            A0B(it, A0E, 0);
        }
        this.A04 = A0E;
        this.A01 = AnonymousClass89L.A01(this, collection);
        return true;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }
}
