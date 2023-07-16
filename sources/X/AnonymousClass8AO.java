package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.8AO  reason: invalid class name */
public final class AnonymousClass8AO<E> extends AnonymousClass89L<E> implements AnonymousClass8s1<E> {
    public int A00;
    public int A01;
    public C102626Vx A02;
    public Object[] A03;
    public Object[] A04;
    public C148878sK A05;
    public Object[] A06 = null;
    public Object[] A07;

    public AnonymousClass8AO(C148878sK r3, Object[] objArr) {
        this.A05 = r3;
        this.A07 = objArr;
        this.A00 = 0;
        this.A02 = new C102626Vx();
        this.A03 = null;
        this.A04 = objArr;
        this.A01 = r3.size();
    }

    private final int A04(List list, List list2, AnonymousClass0YY r8, C106656fO r9, Object[] objArr, int i, int i2) {
        if (objArr.length == 33 && objArr[32] == this.A02) {
            list.add(objArr);
        }
        Object obj = r9.A00;
        if (obj != null) {
            Object[] objArr2 = (Object[]) obj;
            Object[] objArr3 = objArr2;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj2 = objArr[i3];
                if (!AnonymousClass0wJ.A1X(r8.invoke(obj2))) {
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
            r9.A00 = objArr3;
            if (objArr2 != objArr3) {
                list2.add(objArr2);
            }
            return i2;
        }
        throw C18210wN.A0W("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
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
            C106656fO r0 = new C106656fO((Object) null);
            C04220Ms.A0A(objArr);
            Object[] A0I = A0I(r0, objArr, i2, i);
            C04220Ms.A0A(A0I);
            Object obj = r0.A00;
            if (obj != null) {
                this.A04 = (Object[]) obj;
                this.A01 = i;
                if (A0I[1] == null) {
                    this.A03 = (Object[]) A0I[0];
                    i2 -= 5;
                } else {
                    this.A03 = A0I;
                }
            } else {
                throw C18210wN.A0W("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
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
            X.6Vx r1 = r3.A02
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
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AO.A0L(java.lang.Object[], int):java.lang.Object[]");
    }

    private final Object[] A0M(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            throw C18180wK.A0a("Check failed.");
        } else if (i2 == 0) {
            return objArr;
        } else {
            int i3 = (i >> i2) & 31;
            Object[] objArr2 = objArr[i3];
            if (objArr2 != null) {
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
            throw C18210wN.A0W("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
    }

    public final void add(int i, Object obj) {
        int i2 = i;
        AnonymousClass7C1.A01(i, size());
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
        C106656fO r5 = new C106656fO((Object) null);
        Object[] objArr = this.A03;
        C04220Ms.A0A(objArr);
        A08(r5.A00, A0F(obj2, r5, objArr, this.A00, i2), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r14 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        r15.modCount++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        return r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection r24) {
        /*
            r23 = this;
            r7 = 0
            r1 = r24
            X.C04220Ms.A0B(r1, r7)
            r0 = 36
            kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21 r5 = new kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21
            r5.<init>(r1, r0)
            r15 = r23
            int r0 = r15.size()
            r8 = 32
            int r3 = X.AnonymousClass89L.A00(r0, r0)
            r2 = 0
            X.6fO r4 = new X.6fO
            r4.<init>(r2)
            java.lang.Object[] r0 = r15.A03
            r14 = 0
            if (r0 != 0) goto L_0x0034
            int r4 = r15.A05(r5, r4, r3)
        L_0x0028:
            if (r4 == r3) goto L_0x002b
            r14 = 1
        L_0x002b:
            if (r14 == 0) goto L_0x0033
        L_0x002d:
            int r0 = r15.modCount
            int r0 = r0 + 1
            r15.modCount = r0
        L_0x0033:
            return r14
        L_0x0034:
            java.util.ListIterator r13 = r15.A07(r7)
        L_0x0038:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r12 = r13.next()
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            r11 = 0
            r10 = r12
            r1 = 32
            r9 = 0
        L_0x0049:
            r6 = r12[r11]
            java.lang.Object r0 = r5.invoke(r6)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x0090
            if (r9 != 0) goto L_0x005d
            java.lang.Object[] r10 = r15.A0K(r12)
            r9 = 1
            r1 = r11
        L_0x005d:
            int r11 = r11 + 1
            if (r11 < r8) goto L_0x0049
            r4.A00 = r10
            if (r1 == r8) goto L_0x0038
            if (r1 == r8) goto L_0x00fe
            int r0 = r13.previousIndex()
            int r6 = r0 << 5
            java.util.ArrayList r17 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r16 = X.AnonymousClass0wJ.A0v()
        L_0x0075:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r13.next()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r21 = r8
            r22 = r1
            r18 = r5
            r19 = r4
            r20 = r0
            int r1 = r15.A04(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0075
        L_0x0090:
            if (r9 == 0) goto L_0x005d
            int r0 = r1 + 1
            r10[r1] = r6
            r1 = r0
            goto L_0x005d
        L_0x0098:
            java.lang.Object[] r0 = r15.A04
            r21 = r3
            r22 = r1
            r18 = r5
            r19 = r4
            r20 = r0
            int r5 = r15.A04(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r4 = r4.A00
            if (r4 == 0) goto L_0x0122
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            X.C04220Ms.A0B(r4, r7)
            java.util.Arrays.fill(r4, r5, r8, r2)
            boolean r0 = r17.isEmpty()
            java.lang.Object[] r8 = r15.A03
            if (r0 == 0) goto L_0x00f3
            X.C04220Ms.A0A(r8)
        L_0x00bf:
            int r0 = r17.size()
            int r0 = r0 << 5
            int r6 = r6 + r0
            r1 = r6 & 31
            r0 = 1
            if (r1 != 0) goto L_0x011b
            if (r6 != 0) goto L_0x00da
            r15.A00 = r7
            r0 = 0
        L_0x00d0:
            r15.A03 = r0
            r15.A04 = r4
            int r6 = r6 + r5
            r15.A01 = r6
            r14 = 1
            goto L_0x002d
        L_0x00da:
            int r3 = r6 - r0
            r0 = r8
        L_0x00dd:
            int r2 = r15.A00
            int r1 = r3 >> r2
            if (r1 != 0) goto L_0x00ee
            int r0 = r2 + -5
            r15.A00 = r0
            r0 = r8[r7]
            if (r0 == 0) goto L_0x0114
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L_0x00dd
        L_0x00ee:
            java.lang.Object[] r0 = r15.A0M(r0, r3, r2)
            goto L_0x00d0
        L_0x00f3:
            int r1 = r15.A00
            java.util.Iterator r0 = r17.iterator()
            java.lang.Object[] r8 = r15.A0H(r0, r8, r6, r1)
            goto L_0x00bf
        L_0x00fe:
            r13.hasNext()
            int r4 = r15.A05(r5, r4, r3)
            if (r4 != 0) goto L_0x0028
            java.lang.Object[] r2 = r15.A03
            int r1 = r15.size()
            int r0 = r15.A00
            r15.A0C(r2, r1, r0)
            goto L_0x0028
        L_0x0114:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x011b:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0122:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AO.removeAll(java.util.Collection):boolean");
    }

    public final Object set(int i, Object obj) {
        int i2 = i;
        AnonymousClass7C1.A00(i, size());
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
        C106656fO r5 = new C106656fO((Object) null);
        Object[] objArr = this.A03;
        C04220Ms.A0A(objArr);
        this.A03 = A0G(obj2, r5, objArr, this.A00, i2);
        return r5.A00;
    }

    private final int A05(AnonymousClass0YY r8, C106656fO r9, int i) {
        Object[] objArr = this.A04;
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (AnonymousClass0wJ.A1X(r8.invoke(obj))) {
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
        r9.A00 = objArr2;
        if (i2 == i) {
            return i;
        }
        if (objArr2 != null) {
            Arrays.fill(objArr2, i2, i, (Object) null);
            this.A04 = objArr2;
            this.A01 = size() - (i - i2);
            return i2;
        }
        throw C18210wN.A0W("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    private final ListIterator A07(int i) {
        if (this.A03 != null) {
            int A032 = A03() >> 5;
            AnonymousClass7C1.A01(i, A032);
            int i2 = this.A00;
            if (i2 == 0) {
                Object[] objArr = this.A03;
                C04220Ms.A0A(objArr);
                return new AnonymousClass8bS(objArr, i);
            }
            int i3 = i2 / 5;
            Object[] objArr2 = this.A03;
            C04220Ms.A0A(objArr2);
            return new AnonymousClass8bU(objArr2, i, A032, i3);
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

    private final Object[] A0F(Object obj, C106656fO r7, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            r7.A00 = objArr[31];
            Object[] A0K = A0K(objArr);
            AnonymousClass8AQ.A0G(objArr, A0K, i3 + 1, i3, 31);
            A0K[i3] = obj;
            return A0K;
        }
        Object[] A0K2 = A0K(objArr);
        int i4 = i - 5;
        Object obj2 = A0K2[i3];
        if (obj2 != null) {
            A0K2[i3] = A0F(obj, r7, (Object[]) obj2, i4, i2);
            int i5 = i3 + 1;
            while (i5 < 32 && A0K2[i5] != null) {
                Object obj3 = A0K2[i5];
                if (obj3 != null) {
                    A0K2[i5] = A0F(r7.A00, r7, (Object[]) obj3, i4, 0);
                    i5++;
                } else {
                    throw C18210wN.A0W("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
            return A0K2;
        }
        throw C18210wN.A0W("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    private final Object[] A0G(Object obj, C106656fO r5, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        Object[] A0K = A0K(objArr);
        if (i == 0) {
            if (A0K != objArr) {
                this.modCount++;
            }
            r5.A00 = A0K[i3];
            A0K[i3] = obj;
            return A0K;
        }
        Object obj2 = A0K[i3];
        if (obj2 != null) {
            A0K[i3] = A0G(obj, r5, (Object[]) obj2, i - 5, i2);
            return A0K;
        }
        throw C18210wN.A0W("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r0 == null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] A0I(X.C106656fO r5, java.lang.Object[] r6, int r7, int r8) {
        /*
            r4 = this;
            int r0 = r8 + -1
            int r0 = r0 >> r7
            r3 = r0 & 31
            r2 = 0
            r1 = 5
            r0 = r6[r3]
            if (r7 != r1) goto L_0x0011
            r5.A00 = r0
            r0 = r2
        L_0x000e:
            if (r3 != 0) goto L_0x001d
            return r2
        L_0x0011:
            if (r0 == 0) goto L_0x0024
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r7 = r7 - r1
            java.lang.Object[] r0 = r4.A0I(r5, r0, r7, r8)
            if (r0 != 0) goto L_0x001d
            goto L_0x000e
        L_0x001d:
            java.lang.Object[] r2 = r4.A0K(r6)
            r2[r3] = r0
            return r2
        L_0x0024:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AO.A0I(X.6fO, java.lang.Object[], int, int):java.lang.Object[]");
    }

    private final Object[] A0J(C106656fO r9, Object[] objArr, int i, int i2) {
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
        if (i4 >= i6) {
            while (true) {
                Object obj2 = A0K2[i4];
                if (obj2 != null) {
                    A0K2[i4] = A0J(r9, (Object[]) obj2, i5, 0);
                    if (i4 == i6) {
                        break;
                    }
                    i4--;
                } else {
                    throw C18210wN.A0W("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        Object obj3 = A0K2[i3];
        if (obj3 != null) {
            A0K2[i3] = A0J(r9, (Object[]) obj3, i5, i2);
            return A0K2;
        }
        throw C18210wN.A0W("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
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
            objArr3 = A0H(r5, objArr, i, i3);
        } else {
            objArr3 = A0K(objArr);
        }
        while (r5.hasNext()) {
            int i4 = this.A00 + 5;
            this.A00 = i4;
            objArr3 = AnonymousClass89L.A02(objArr3);
            objArr3[32] = this.A02;
            A0H(r5, objArr3, 1 << i4, i4);
        }
        return objArr3;
    }

    public final int A0Q() {
        return this.modCount;
    }

    public final C148878sK AB7() {
        C148878sK r2;
        C148878sK r22;
        Object[] objArr = this.A03;
        if (objArr == this.A06 && this.A04 == this.A07) {
            r22 = this.A05;
        } else {
            this.A02 = new C102626Vx();
            this.A06 = objArr;
            Object[] objArr2 = this.A04;
            this.A07 = objArr2;
            if (objArr != null) {
                r2 = new AnonymousClass8bX(objArr, objArr2, size(), this.A00);
            } else if (objArr2.length == 0) {
                r22 = AnonymousClass8bW.A01;
            } else {
                r2 = new AnonymousClass8bW(C86124wJ.A1b(objArr2, size()));
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
        AnonymousClass7C1.A01(i2, size());
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

    private final Object[] A0H(Iterator it, Object[] objArr, int i, int i2) {
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
            Object[] A0H = A0H(it, (Object[]) A0K[i3], i, i4);
            while (true) {
                A0K[i3] = A0H;
                i3++;
                if (i3 >= 32 || !it.hasNext()) {
                    return A0K;
                }
                A0H = A0H(it, (Object[]) A0K[i3], 0, i4);
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
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AO.A0N(java.lang.Object[], java.lang.Object[], int):java.lang.Object[]");
    }

    public final Object A0P(int i) {
        AnonymousClass7C1.A00(i, size());
        this.modCount++;
        int A032 = A03();
        if (i >= A032) {
            return A06(this.A03, A032, this.A00, i - A032);
        }
        C106656fO r2 = new C106656fO(this.A04[0]);
        Object[] objArr = this.A03;
        C04220Ms.A0A(objArr);
        A06(A0J(r2, objArr, this.A00, i), A032, this.A00, 0);
        return r2.A00;
    }

    public final Object get(int i) {
        Object[] objArr;
        AnonymousClass7C1.A00(i, size());
        if (A03() <= i) {
            objArr = this.A04;
        } else {
            objArr = this.A03;
            C04220Ms.A0A(objArr);
            int i2 = this.A00;
            while (i2 > 0) {
                Object obj = objArr[(i >> i2) & 31];
                if (obj != null) {
                    objArr = (Object[]) obj;
                    i2 -= 5;
                } else {
                    throw C18210wN.A0W("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        return objArr[i & 31];
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i) {
        AnonymousClass7C1.A01(i, size());
        return new AnonymousClass8bV(this, i);
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
