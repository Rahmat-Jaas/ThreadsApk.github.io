package X;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: X.00x  reason: invalid class name and case insensitive filesystem */
public class C002000x {
    public static int A03;
    public static int A04;
    public static Object[] A05;
    public static Object[] A06;
    public int[] A00;
    public int A01;
    public Object[] A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            try {
                if (obj instanceof C002000x) {
                    C002000x r7 = (C002000x) obj;
                    if (size() == r7.size()) {
                        for (int i = 0; i < this.A01; i++) {
                            Object[] objArr = this.A02;
                            Object obj2 = objArr[i << 1];
                            Object obj3 = objArr[(i << 1) + 1];
                            Object obj4 = r7.get(obj2);
                            if (obj3 == null) {
                                if (obj4 == null) {
                                    if (!r7.containsKey(obj2)) {
                                        return false;
                                    }
                                }
                            } else if (!obj3.equals(obj4)) {
                                return false;
                            }
                        }
                    }
                } else {
                    if (obj instanceof Map) {
                        Map map = (Map) obj;
                        if (size() == map.size()) {
                            for (int i2 = 0; i2 < this.A01; i2++) {
                                Object[] objArr2 = this.A02;
                                Object obj5 = objArr2[i2 << 1];
                                Object obj6 = objArr2[(i2 << 1) + 1];
                                Object obj7 = map.get(obj5);
                                if (obj6 == null) {
                                    if (obj7 == null) {
                                        if (!map.containsKey(obj5)) {
                                            return false;
                                        }
                                    }
                                } else if (!obj6.equals(obj7)) {
                                    return false;
                                }
                            }
                        }
                    }
                    return false;
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return true;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    private void A00(int i) {
        Class<C002000x> cls = C002000x.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = A06;
                if (objArr != null) {
                    this.A02 = objArr;
                    A06 = (Object[]) objArr[0];
                    this.A00 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    A04--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = A05;
                if (objArr2 != null) {
                    this.A02 = objArr2;
                    A05 = (Object[]) objArr2[0];
                    this.A00 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    A03--;
                    return;
                }
            }
        }
        this.A00 = new int[i];
        this.A02 = new Object[(i << 1)];
    }

    public static void A01(int[] iArr, Object[] objArr, int i) {
        Class<C002000x> cls = C002000x.class;
        int length = iArr.length;
        if (length == 8) {
            synchronized (cls) {
                int i2 = A04;
                if (i2 < 10) {
                    objArr[0] = A06;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    A06 = objArr;
                    A04 = i2 + 1;
                }
            }
        } else if (length == 4) {
            synchronized (cls) {
                int i4 = A03;
                if (i4 < 10) {
                    objArr[0] = A05;
                    objArr[1] = iArr;
                    for (int i5 = (i << 1) - 1; i5 >= 2; i5--) {
                        objArr[i5] = null;
                    }
                    A05 = objArr;
                    A03 = i4 + 1;
                }
            }
        }
    }

    public final int A02() {
        int i = this.A01;
        if (i == 0) {
            return -1;
        }
        int[] iArr = this.A00;
        try {
            int A002 = C001400q.A00(iArr, i, 0);
            if (A002 >= 0) {
                Object[] objArr = this.A02;
                if (objArr[A002 << 1] != null) {
                    int i2 = A002 + 1;
                    while (i2 < i && iArr[i2] == 0) {
                        if (objArr[i2 << 1] == null) {
                            return i2;
                        }
                        i2++;
                    }
                    do {
                        A002--;
                        if (A002 < 0 || iArr[A002] != 0) {
                            return i2 ^ -1;
                        }
                    } while (objArr[A002 << 1] != null);
                    return A002;
                }
            }
            return A002;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int A03(Object obj) {
        int i = this.A01 << 1;
        Object[] objArr = this.A02;
        int i2 = 1;
        if (obj == null) {
            while (i2 < i) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
                i2 += 2;
            }
            return -1;
        }
        while (i2 < i) {
            if (obj.equals(objArr[i2])) {
                return i2 >> 1;
            }
            i2 += 2;
        }
        return -1;
    }

    public final int A04(Object obj) {
        if (obj == null) {
            return A02();
        }
        return A05(obj, obj.hashCode());
    }

    public final int A05(Object obj, int i) {
        int i2 = this.A01;
        if (i2 == 0) {
            return -1;
        }
        try {
            int A002 = C001400q.A00(this.A00, i2, i);
            if (A002 < 0 || obj.equals(this.A02[A002 << 1])) {
                return A002;
            }
            int i3 = A002 + 1;
            while (i3 < i2 && this.A00[i3] == i) {
                if (obj.equals(this.A02[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            do {
                A002--;
                if (A002 < 0 || this.A00[A002] != i) {
                    return i3 ^ -1;
                }
            } while (!obj.equals(this.A02[A002 << 1]));
            return A002;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object A06(int i) {
        Object[] objArr = this.A02;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.A01;
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i4 = i3 - 1;
        int[] iArr = this.A00;
        int length = iArr.length;
        int i5 = 8;
        if (length <= 8 || i3 >= length / 3) {
            if (i < i4) {
                int i6 = i + 1;
                int i7 = i4 - i;
                System.arraycopy(iArr, i6, iArr, i, i7);
                Object[] objArr2 = this.A02;
                System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
            }
            Object[] objArr3 = this.A02;
            int i8 = i4 << 1;
            objArr3[i8] = null;
            objArr3[i8 + 1] = null;
        } else {
            if (i3 > 8) {
                i5 = i3 + (i3 >> 1);
            }
            A00(i5);
            if (i3 == this.A01) {
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.A00, 0, i);
                    System.arraycopy(objArr, 0, this.A02, 0, i2);
                }
                if (i < i4) {
                    int i9 = i + 1;
                    int i10 = i4 - i;
                    System.arraycopy(iArr, i9, this.A00, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.A02, i2, i10 << 1);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 == this.A01) {
            this.A01 = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final void A07(int i) {
        int i2 = this.A01;
        int[] iArr = this.A00;
        if (iArr.length < i) {
            Object[] objArr = this.A02;
            A00(i);
            if (this.A01 > 0) {
                System.arraycopy(iArr, 0, this.A00, 0, i2);
                System.arraycopy(objArr, 0, this.A02, 0, i2 << 1);
            }
            A01(iArr, objArr, i2);
        }
        if (this.A01 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void A08(C002000x r6) {
        int i = r6.A01;
        A07(this.A01 + i);
        if (this.A01 != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr = r6.A02;
                int i3 = i2 << 1;
                put(objArr[i3], objArr[i3 + 1]);
            }
        } else if (i > 0) {
            System.arraycopy(r6.A00, 0, this.A00, 0, i);
            System.arraycopy(r6.A02, 0, this.A02, 0, i << 1);
            this.A01 = i;
        }
    }

    public final void clear() {
        int i = this.A01;
        if (i > 0) {
            int[] iArr = this.A00;
            Object[] objArr = this.A02;
            this.A00 = C001400q.A00;
            this.A02 = C001400q.A01;
            this.A01 = 0;
            A01(iArr, objArr, i);
        }
        if (this.A01 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final int hashCode() {
        int hashCode;
        int[] iArr = this.A00;
        Object[] objArr = this.A02;
        int i = this.A01;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            int i5 = iArr[i3];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i4 += hashCode ^ i5;
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        if (this.A01 <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int hashCode;
        int A052;
        int i = this.A01;
        if (obj == null) {
            A052 = A02();
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
            A052 = A05(obj, hashCode);
        }
        if (A052 >= 0) {
            int i2 = (A052 << 1) + 1;
            Object[] objArr = this.A02;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = A052 ^ -1;
        int[] iArr = this.A00;
        if (i >= iArr.length) {
            int i4 = 4;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i >= 4) {
                i4 = 8;
            }
            Object[] objArr2 = this.A02;
            A00(i4);
            if (i == this.A01) {
                int[] iArr2 = this.A00;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.A02, 0, objArr2.length);
                }
                A01(iArr, objArr2, i);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr3 = this.A00;
            int i5 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i5, i - i3);
            Object[] objArr3 = this.A02;
            System.arraycopy(objArr3, i3 << 1, objArr3, i5 << 1, (this.A01 - i3) << 1);
        }
        int i6 = this.A01;
        if (i == i6) {
            int[] iArr4 = this.A00;
            if (i3 < iArr4.length) {
                iArr4[i3] = hashCode;
                Object[] objArr4 = this.A02;
                int i7 = i3 << 1;
                objArr4[i7] = obj;
                objArr4[i7 + 1] = obj2;
                this.A01 = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public C002000x(int i) {
        if (i == 0) {
            this.A00 = C001400q.A00;
            this.A02 = C001400q.A01;
        } else {
            A00(i);
        }
        this.A01 = 0;
    }

    public final boolean containsKey(Object obj) {
        if (A04(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (A03(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int A042 = A04(obj);
        if (A042 >= 0) {
            return this.A02[(A042 << 1) + 1];
        }
        return obj2;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public final Object remove(Object obj) {
        int A042 = A04(obj);
        if (A042 >= 0) {
            return A06(A042);
        }
        return null;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int A042 = A04(obj);
        if (A042 < 0) {
            return false;
        }
        int i = (A042 << 1) + 1;
        Object obj4 = this.A02[i];
        if (obj4 != obj2 && (obj2 == null || !obj2.equals(obj4))) {
            return false;
        }
        this.A02[i] = obj3;
        return true;
    }

    public final int size() {
        return this.A01;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.A01 * 28);
        sb.append('{');
        for (int i = 0; i < this.A01; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.A02[i << 1];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.A02[(i << 1) + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C002000x() {
        this.A00 = C001400q.A00;
        this.A02 = C001400q.A01;
        this.A01 = 0;
    }

    public final boolean remove(Object obj, Object obj2) {
        int A042 = A04(obj);
        if (A042 < 0) {
            return false;
        }
        Object obj3 = this.A02[(A042 << 1) + 1];
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        A06(A042);
        return true;
    }

    public final Object replace(Object obj, Object obj2) {
        int A042 = A04(obj);
        if (A042 < 0) {
            return null;
        }
        int i = (A042 << 1) + 1;
        Object[] objArr = this.A02;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }
}
