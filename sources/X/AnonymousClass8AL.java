package X;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.8AL  reason: invalid class name */
public final class AnonymousClass8AL<E> extends AnonymousClass89L<E> {
    public static final Object[] A03 = C86164wN.A1T();
    public int A00;
    public int A01;
    public Object[] A02;

    public final boolean addAll(int i, Collection collection) {
        Object[] objArr;
        C04220Ms.A0B(collection, 1);
        C120667By.A01(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        A04(AnonymousClass89L.A01(this, collection));
        int A032 = A03(this);
        int length = this.A02.length;
        if (A032 >= length) {
            A032 -= length;
        }
        int i2 = this.A00 + i;
        if (i2 >= length) {
            i2 -= length;
        }
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i3 = this.A00;
            int i4 = i3 - size;
            if (i2 < i3) {
                Object[] objArr2 = this.A02;
                System.arraycopy(objArr2, i3, objArr2, i4, objArr2.length - i3);
                Object[] objArr3 = this.A02;
                int length2 = objArr3.length - size;
                if (size >= i2) {
                    System.arraycopy(objArr3, 0, objArr3, length2, i2);
                } else {
                    System.arraycopy(objArr3, 0, objArr3, length2, size);
                    Object[] objArr4 = this.A02;
                    AnonymousClass8AQ.A0G(objArr4, objArr4, 0, size, i2);
                }
            } else if (i4 >= 0) {
                Object[] objArr5 = this.A02;
                AnonymousClass8AQ.A0G(objArr5, objArr5, i4, i3, i2);
            } else {
                Object[] objArr6 = this.A02;
                int length3 = objArr6.length;
                i4 += length3;
                int i5 = i2 - i3;
                int i6 = length3 - i4;
                if (i6 >= i5) {
                    System.arraycopy(objArr6, i3, objArr6, i4, i5);
                } else {
                    System.arraycopy(objArr6, i3, objArr6, i4, (i3 + i6) - i3);
                    Object[] objArr7 = this.A02;
                    AnonymousClass8AQ.A0G(objArr7, objArr7, 0, this.A00 + i6, i2);
                }
            }
            this.A00 = i4;
            i2 -= size;
            if (i2 < 0) {
                i2 += this.A02.length;
            }
        } else {
            int i7 = i2 + size;
            if (i2 < A032) {
                int i8 = size + A032;
                objArr = this.A02;
                int length4 = objArr.length;
                if (i8 > length4) {
                    if (i7 >= length4) {
                        i7 -= length4;
                    } else {
                        int i9 = A032 - (i8 - length4);
                        System.arraycopy(objArr, i9, objArr, 0, A032 - i9);
                        Object[] objArr8 = this.A02;
                        AnonymousClass8AQ.A0G(objArr8, objArr8, i7, i2, i9);
                    }
                }
            } else {
                Object[] objArr9 = this.A02;
                AnonymousClass8AQ.A0G(objArr9, objArr9, size, 0, A032);
                Object[] objArr10 = this.A02;
                int length5 = objArr10.length;
                if (i7 >= length5) {
                    System.arraycopy(objArr10, i2, objArr10, i7 - length5, length5 - i2);
                } else {
                    int i10 = length5 - size;
                    System.arraycopy(objArr10, i10, objArr10, 0, length5 - i10);
                    objArr = this.A02;
                    A032 = objArr.length - size;
                }
            }
            System.arraycopy(objArr, i2, objArr, i7, A032 - i2);
        }
        A05(collection, i2);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v6, types: [int] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection r11) {
        /*
            r10 = this;
            r8 = 0
            X.C04220Ms.A0B(r11, r8)
            boolean r0 = r10.isEmpty()
            r4 = 0
            if (r0 != 0) goto L_0x0096
            java.lang.Object[] r0 = r10.A02
            int r0 = r0.length
            if (r0 == 0) goto L_0x0096
            int r6 = A03(r10)
            java.lang.Object[] r0 = r10.A02
            int r9 = r0.length
            if (r6 < r9) goto L_0x001a
            int r6 = r6 - r9
        L_0x001a:
            int r7 = r10.A00
            r5 = 0
            r3 = r7
            if (r7 < r6) goto L_0x0069
        L_0x0020:
            if (r7 >= r9) goto L_0x003c
            java.lang.Object[] r0 = r10.A02
            r2 = r0[r7]
            r0[r7] = r5
            boolean r0 = r11.contains(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r1 = r10.A02
            int r0 = r3 + 1
            r1[r3] = r2
            r3 = r0
        L_0x0037:
            int r7 = r7 + 1
            goto L_0x0020
        L_0x003a:
            r8 = 1
            goto L_0x0037
        L_0x003c:
            r2 = r3
            java.lang.Object[] r0 = r10.A02
            int r0 = r0.length
            if (r3 < r0) goto L_0x0044
            int r2 = r3 - r0
        L_0x0044:
            r3 = r2
        L_0x0045:
            if (r4 >= r6) goto L_0x0067
            java.lang.Object[] r0 = r10.A02
            r1 = r0[r4]
            r0[r4] = r5
            boolean r0 = r11.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0065
            java.lang.Object[] r0 = r10.A02
            r0[r2] = r1
            int r0 = r0.length
            int r0 = r0 + -1
            int r2 = r2 + 1
            if (r3 != r0) goto L_0x0061
            r2 = 0
        L_0x0061:
            r3 = r2
        L_0x0062:
            int r4 = r4 + 1
            goto L_0x0045
        L_0x0065:
            r8 = 1
            goto L_0x0062
        L_0x0067:
            r4 = r8
            goto L_0x0089
        L_0x0069:
            java.lang.Object[] r0 = r10.A02
            if (r7 >= r6) goto L_0x0083
            r2 = r0[r7]
            boolean r0 = r11.contains(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0081
            java.lang.Object[] r1 = r10.A02
            int r0 = r3 + 1
            r1[r3] = r2
            r3 = r0
        L_0x007e:
            int r7 = r7 + 1
            goto L_0x0069
        L_0x0081:
            r4 = 1
            goto L_0x007e
        L_0x0083:
            X.C04220Ms.A0B(r0, r8)
            java.util.Arrays.fill(r0, r3, r6, r5)
        L_0x0089:
            if (r4 == 0) goto L_0x0096
            int r0 = r10.A00
            int r3 = r3 - r0
            if (r3 >= 0) goto L_0x0094
            java.lang.Object[] r0 = r10.A02
            int r0 = r0.length
            int r3 = r3 + r0
        L_0x0094:
            r10.A01 = r3
        L_0x0096:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AL.removeAll(java.util.Collection):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v6, types: [int] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean retainAll(java.util.Collection r11) {
        /*
            r10 = this;
            r8 = 0
            X.C04220Ms.A0B(r11, r8)
            boolean r0 = r10.isEmpty()
            r4 = 0
            if (r0 != 0) goto L_0x0090
            java.lang.Object[] r0 = r10.A02
            int r0 = r0.length
            if (r0 == 0) goto L_0x0090
            int r6 = A03(r10)
            java.lang.Object[] r0 = r10.A02
            int r9 = r0.length
            if (r6 < r9) goto L_0x001a
            int r6 = r6 - r9
        L_0x001a:
            int r7 = r10.A00
            r5 = 0
            r3 = r7
            if (r7 < r6) goto L_0x0065
        L_0x0020:
            if (r7 >= r9) goto L_0x003a
            java.lang.Object[] r0 = r10.A02
            r2 = r0[r7]
            r0[r7] = r5
            boolean r0 = r11.contains(r2)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r1 = r10.A02
            int r0 = r3 + 1
            r1[r3] = r2
            r3 = r0
        L_0x0035:
            int r7 = r7 + 1
            goto L_0x0020
        L_0x0038:
            r8 = 1
            goto L_0x0035
        L_0x003a:
            r2 = r3
            java.lang.Object[] r0 = r10.A02
            int r0 = r0.length
            if (r3 < r0) goto L_0x0042
            int r2 = r3 - r0
        L_0x0042:
            r3 = r2
        L_0x0043:
            if (r4 >= r6) goto L_0x0063
            java.lang.Object[] r0 = r10.A02
            r1 = r0[r4]
            r0[r4] = r5
            boolean r0 = r11.contains(r1)
            if (r0 == 0) goto L_0x0061
            java.lang.Object[] r0 = r10.A02
            r0[r2] = r1
            int r0 = r0.length
            int r0 = r0 + -1
            int r2 = r2 + 1
            if (r3 != r0) goto L_0x005d
            r2 = 0
        L_0x005d:
            r3 = r2
        L_0x005e:
            int r4 = r4 + 1
            goto L_0x0043
        L_0x0061:
            r8 = 1
            goto L_0x005e
        L_0x0063:
            r4 = r8
            goto L_0x0083
        L_0x0065:
            java.lang.Object[] r0 = r10.A02
            if (r7 >= r6) goto L_0x007d
            r2 = r0[r7]
            boolean r0 = r11.contains(r2)
            if (r0 == 0) goto L_0x007b
            java.lang.Object[] r1 = r10.A02
            int r0 = r3 + 1
            r1[r3] = r2
            r3 = r0
        L_0x0078:
            int r7 = r7 + 1
            goto L_0x0065
        L_0x007b:
            r4 = 1
            goto L_0x0078
        L_0x007d:
            X.C04220Ms.A0B(r0, r8)
            java.util.Arrays.fill(r0, r3, r6, r5)
        L_0x0083:
            if (r4 == 0) goto L_0x0090
            int r0 = r10.A00
            int r3 = r3 - r0
            if (r3 >= 0) goto L_0x008e
            java.lang.Object[] r0 = r10.A02
            int r0 = r0.length
            int r3 = r3 + r0
        L_0x008e:
            r10.A01 = r3
        L_0x0090:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AL.retainAll(java.util.Collection):boolean");
    }

    public final Object[] toArray(Object[] objArr) {
        C04220Ms.A0B(objArr, 0);
        if (objArr.length < size()) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size());
            C04220Ms.A0C(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int A032 = A03(this);
        Object[] objArr2 = this.A02;
        int length = objArr2.length;
        if (A032 >= length) {
            A032 -= length;
        }
        int i = this.A00;
        if (i < A032) {
            AnonymousClass8AQ.A0G(objArr2, objArr, 0, i, A032);
        } else if (C18250wR.A1K(this)) {
            Object[] objArr3 = this.A02;
            AnonymousClass8AQ.A0G(objArr3, objArr, 0, this.A00, objArr3.length);
            Object[] objArr4 = this.A02;
            AnonymousClass8AQ.A0G(objArr4, objArr, objArr4.length - this.A00, 0, A032);
        }
        if (objArr.length > size()) {
            objArr[size()] = null;
        }
        return objArr;
    }

    public static int A03(AnonymousClass8AL r2) {
        return r2.A00 + r2.size();
    }

    private final void A04(int i) {
        Object[] objArr;
        if (i >= 0) {
            Object[] objArr2 = this.A02;
            int length = objArr2.length;
            if (i > length) {
                if (objArr2 == A03) {
                    if (i < 10) {
                        i = 10;
                    }
                    objArr = new Object[i];
                } else {
                    int i2 = length + (length >> 1);
                    if (i2 - i < 0) {
                        i2 = i;
                    }
                    if (i2 - 2147483639 > 0) {
                        i2 = 2147483639;
                        if (i > 2147483639) {
                            i2 = Integer.MAX_VALUE;
                        }
                    }
                    objArr = new Object[i2];
                    int i3 = this.A00;
                    System.arraycopy(objArr2, i3, objArr, 0, length - i3);
                    Object[] objArr3 = this.A02;
                    int length2 = objArr3.length;
                    int i4 = this.A00;
                    System.arraycopy(objArr3, 0, objArr, length2 - i4, i4);
                    this.A00 = 0;
                }
                this.A02 = objArr;
                return;
            }
            return;
        }
        throw C18180wK.A0a("Deque is too big.");
    }

    public AnonymousClass8AL(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = A03;
        } else {
            objArr = new Object[i];
        }
        this.A02 = objArr;
    }

    private final void A05(Collection collection, int i) {
        Iterator it = collection.iterator();
        int length = this.A02.length;
        while (i < length && it.hasNext()) {
            this.A02[i] = it.next();
            i++;
        }
        int i2 = this.A00;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.A02[i3] = it.next();
        }
        this.A01 = AnonymousClass89L.A01(this, collection);
    }

    public final Object A0Q() {
        if (!isEmpty()) {
            return this.A02[this.A00];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object A0R() {
        if (isEmpty()) {
            return null;
        }
        return this.A02[this.A00];
    }

    public final Object A0S() {
        if (!isEmpty()) {
            Object[] objArr = this.A02;
            int A0B = this.A00 + C86104wH.A0B(this);
            int length = this.A02.length;
            if (A0B >= length) {
                A0B -= length;
            }
            return objArr[A0B];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object A0T() {
        if (isEmpty()) {
            return null;
        }
        Object[] objArr = this.A02;
        int A0B = this.A00 + C86104wH.A0B(this);
        int length = this.A02.length;
        if (A0B >= length) {
            A0B -= length;
        }
        return objArr[A0B];
    }

    public final Object A0U() {
        if (!isEmpty()) {
            Object[] objArr = this.A02;
            int i = this.A00;
            Object obj = objArr[i];
            objArr[i] = null;
            int i2 = i + 1;
            if (i == objArr.length - 1) {
                i2 = 0;
            }
            this.A00 = i2;
            this.A01 = C86164wN.A05(this);
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object A0V() {
        if (!isEmpty()) {
            int A0B = this.A00 + C86104wH.A0B(this);
            Object[] objArr = this.A02;
            int length = objArr.length;
            if (A0B >= length) {
                A0B -= length;
            }
            Object obj = objArr[A0B];
            objArr[A0B] = null;
            this.A01 = C86164wN.A05(this);
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final void A0W(Object obj) {
        A04(size() + 1);
        int i = this.A00;
        if (i == 0) {
            Object[] objArr = this.A02;
            C04220Ms.A0B(objArr, 0);
            i = objArr.length;
        }
        int i2 = i - 1;
        this.A00 = i2;
        this.A02[i2] = obj;
        this.A01 = size() + 1;
    }

    public final void A0X(Object obj) {
        A04(size() + 1);
        Object[] objArr = this.A02;
        int A032 = A03(this);
        int length = this.A02.length;
        if (A032 >= length) {
            A032 -= length;
        }
        objArr[A032] = obj;
        this.A01 = size() + 1;
    }

    public final void add(int i, Object obj) {
        int i2;
        C120667By.A01(i, size());
        if (i == size()) {
            A0X(obj);
        } else if (i == 0) {
            A0W(obj);
        } else {
            A04(size() + 1);
            int i3 = this.A00 + i;
            int length = this.A02.length;
            if (i3 >= length) {
                i3 -= length;
            }
            if (i < ((size() + 1) >> 1)) {
                if (i3 == 0) {
                    Object[] objArr = this.A02;
                    C04220Ms.A0B(objArr, 0);
                    i2 = objArr.length - 1;
                } else {
                    i2 = i3 - 1;
                }
                int i4 = this.A00;
                if (i4 == 0) {
                    Object[] objArr2 = this.A02;
                    C04220Ms.A0B(objArr2, 0);
                    i4 = objArr2.length;
                }
                int i5 = i4 - 1;
                int i6 = this.A00;
                Object[] objArr3 = this.A02;
                if (i2 >= i6) {
                    objArr3[i5] = objArr3[i6];
                    int i7 = i6 + 1;
                    System.arraycopy(objArr3, i7, objArr3, i6, (i2 + 1) - i7);
                } else {
                    System.arraycopy(objArr3, i6, objArr3, i6 - 1, objArr3.length - i6);
                    Object[] objArr4 = this.A02;
                    objArr4[objArr4.length - 1] = objArr4[0];
                    System.arraycopy(objArr4, 1, objArr4, 0, (i2 + 1) - 1);
                }
                this.A02[i2] = obj;
                this.A00 = i5;
            } else {
                int A032 = A03(this);
                Object[] objArr5 = this.A02;
                int length2 = objArr5.length;
                if (A032 >= length2) {
                    A032 -= length2;
                }
                if (i3 < A032) {
                    System.arraycopy(objArr5, i3, objArr5, i3 + 1, A032 - i3);
                } else {
                    System.arraycopy(objArr5, 0, objArr5, 1, A032);
                    Object[] objArr6 = this.A02;
                    int length3 = objArr6.length - 1;
                    objArr6[0] = objArr6[length3];
                    System.arraycopy(objArr6, i3, objArr6, i3 + 1, length3 - i3);
                }
                this.A02[i3] = obj;
            }
            this.A01 = size() + 1;
        }
    }

    public final void clear() {
        int A032 = A03(this);
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (A032 >= length) {
            A032 -= length;
        }
        int i = this.A00;
        if (i < A032) {
            Arrays.fill(objArr, i, A032, (Object) null);
        } else if (C18250wR.A1K(this)) {
            Object[] objArr2 = this.A02;
            Arrays.fill(objArr2, this.A00, objArr2.length, (Object) null);
            Object[] objArr3 = this.A02;
            C04220Ms.A0B(objArr3, 0);
            Arrays.fill(objArr3, 0, A032, (Object) null);
        }
        this.A00 = 0;
        this.A01 = 0;
    }

    public final boolean contains(Object obj) {
        return C86114wI.A1T(indexOf(obj), -1);
    }

    public final Object get(int i) {
        C120667By.A00(i, size());
        Object[] objArr = this.A02;
        int i2 = this.A00 + i;
        int length = objArr.length;
        if (i2 >= length) {
            i2 -= length;
        }
        return objArr[i2];
    }

    public final int indexOf(Object obj) {
        int A032 = A03(this);
        int length = this.A02.length;
        if (A032 >= length) {
            A032 -= length;
        }
        int i = this.A00;
        if (i < A032) {
            while (i < A032) {
                if (!C04220Ms.A0I(obj, this.A02[i])) {
                    i++;
                }
            }
            return -1;
        } else if (i < A032) {
            return -1;
        } else {
            while (true) {
                if (i < length) {
                    if (C04220Ms.A0I(obj, this.A02[i])) {
                        break;
                    }
                    i++;
                } else {
                    int i2 = 0;
                    while (i2 < A032) {
                        if (C04220Ms.A0I(obj, this.A02[i2])) {
                            i = i2 + this.A02.length;
                        } else {
                            i2++;
                        }
                    }
                    return -1;
                }
            }
        }
        return i - this.A00;
    }

    public final boolean isEmpty() {
        return C18180wK.A1W(size());
    }

    public final int lastIndexOf(Object obj) {
        int i;
        int A032 = A03(this);
        int length = this.A02.length;
        if (A032 >= length) {
            A032 -= length;
        }
        int i2 = this.A00;
        if (i2 < A032) {
            i = A032 - 1;
            if (i2 <= i) {
                while (!C04220Ms.A0I(obj, this.A02[i])) {
                    if (i != i2) {
                        i--;
                    }
                }
            }
            return -1;
        }
        if (i2 > A032) {
            while (true) {
                A032--;
                if (-1 < A032) {
                    if (C04220Ms.A0I(obj, this.A02[A032])) {
                        i = A032 + this.A02.length;
                        break;
                    }
                } else {
                    Object[] objArr = this.A02;
                    C04220Ms.A0B(objArr, 0);
                    int length2 = objArr.length - 1;
                    int i3 = this.A00;
                    if (i3 <= length2) {
                        while (!C04220Ms.A0I(obj, this.A02[i])) {
                            if (i != i3) {
                                length2 = i - 1;
                            }
                        }
                    }
                }
            }
        }
        return -1;
        return i - this.A00;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final Object set(int i, Object obj) {
        C120667By.A00(i, size());
        int i2 = this.A00 + i;
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (i2 >= length) {
            i2 -= length;
        }
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public AnonymousClass8AL() {
        this.A02 = A03;
    }

    public final boolean add(Object obj) {
        A0X(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        if (collection.isEmpty()) {
            return false;
        }
        A04(AnonymousClass89L.A01(this, collection));
        int A032 = A03(this);
        int length = this.A02.length;
        if (A032 >= length) {
            A032 -= length;
        }
        A05(collection, A032);
        return true;
    }

    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
