package X;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.00m  reason: invalid class name and case insensitive filesystem */
public final class C001000m<E> implements Collection<E>, Set<E> {
    public static int A03;
    public static int A04;
    public static Object[] A05;
    public static Object[] A06;
    public static final Object A07 = new Object();
    public static final Object A08 = new Object();
    public int A00;
    public int[] A01;
    public Object[] A02;

    private void A02(int i) {
        if (i == 8) {
            synchronized (A08) {
                Object[] objArr = A06;
                if (objArr != null) {
                    try {
                        this.A02 = objArr;
                        A06 = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.A01 = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            A04--;
                            return;
                        }
                    } catch (ClassCastException unused) {
                    }
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("ArraySet Found corrupt ArraySet cache: [0]=");
                    sb.append(objArr[0]);
                    sb.append(" [1]=");
                    sb.append(objArr[1]);
                    printStream.println(sb.toString());
                    A06 = null;
                    A04 = 0;
                }
            }
        } else if (i == 4) {
            synchronized (A07) {
                Object[] objArr2 = A05;
                if (objArr2 != null) {
                    try {
                        this.A02 = objArr2;
                        A05 = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.A01 = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            A03--;
                            return;
                        }
                    } catch (ClassCastException unused2) {
                    }
                    PrintStream printStream2 = System.out;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ArraySet Found corrupt ArraySet cache: [0]=");
                    sb2.append(objArr2[0]);
                    sb2.append(" [1]=");
                    sb2.append(objArr2[1]);
                    printStream2.println(sb2.toString());
                    A05 = null;
                    A03 = 0;
                }
            }
        }
        this.A01 = new int[i];
        this.A02 = new Object[i];
    }

    public static void A03(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (A08) {
                int i2 = A04;
                if (i2 < 10) {
                    objArr[0] = A06;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    A06 = objArr;
                    A04 = i2 + 1;
                }
            }
        } else if (length == 4) {
            synchronized (A07) {
                int i4 = A03;
                if (i4 < 10) {
                    objArr[0] = A05;
                    objArr[1] = iArr;
                    for (int i5 = i - 1; i5 >= 2; i5--) {
                        objArr[i5] = null;
                    }
                    A05 = objArr;
                    A03 = i4 + 1;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (size() == set.size()) {
                    int i = 0;
                    while (i < this.A00) {
                        try {
                            if (set.contains(this.A02[i])) {
                                i++;
                            }
                        } catch (ClassCastException | NullPointerException unused) {
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.A00) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.A00);
        }
        System.arraycopy(this.A02, 0, objArr, 0, this.A00);
        int length = objArr.length;
        int i = this.A00;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    private int A00() {
        int i = this.A00;
        if (i == 0) {
            return -1;
        }
        try {
            int[] iArr = this.A01;
            int A002 = C001400q.A00(iArr, i, 0);
            if (A002 >= 0) {
                Object[] objArr = this.A02;
                if (objArr[A002] != null) {
                    int i2 = A002 + 1;
                    while (i2 < i && iArr[i2] == 0) {
                        if (objArr[i2] == null) {
                            return i2;
                        }
                        i2++;
                    }
                    do {
                        A002--;
                        if (A002 < 0 || iArr[A002] != 0) {
                            return i2 ^ -1;
                        }
                    } while (objArr[A002] != null);
                    return A002;
                }
            }
            return A002;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private int A01(Object obj, int i) {
        int i2 = this.A00;
        if (i2 == 0) {
            return -1;
        }
        try {
            int A002 = C001400q.A00(this.A01, i2, i);
            if (A002 < 0 || obj.equals(this.A02[A002])) {
                return A002;
            }
            int i3 = A002 + 1;
            while (i3 < i2 && this.A01[i3] == i) {
                if (obj.equals(this.A02[i3])) {
                    return i3;
                }
                i3++;
            }
            do {
                A002--;
                if (A002 < 0 || this.A01[A002] != i) {
                    return i3 ^ -1;
                }
            } while (!obj.equals(this.A02[A002]));
            return A002;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void A04(int i) {
        int i2 = this.A00;
        Object[] objArr = this.A02;
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.A01;
        int length = iArr.length;
        int i4 = 8;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i3) {
                int i5 = i + 1;
                int i6 = i3 - i;
                System.arraycopy(iArr, i5, iArr, i, i6);
                Object[] objArr2 = this.A02;
                System.arraycopy(objArr2, i5, objArr2, i, i6);
            }
            this.A02[i3] = null;
        } else {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            A02(i4);
            if (i > 0) {
                System.arraycopy(iArr, 0, this.A01, 0, i);
                System.arraycopy(objArr, 0, this.A02, 0, i);
            }
            if (i < i3) {
                int i7 = i + 1;
                int i8 = i3 - i;
                System.arraycopy(iArr, i7, this.A01, i, i8);
                System.arraycopy(objArr, i7, this.A02, i, i8);
            }
        }
        if (i2 == this.A00) {
            this.A00 = i3;
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean add(Object obj) {
        int hashCode;
        int A012;
        int i = this.A00;
        if (obj == null) {
            A012 = A00();
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
            A012 = A01(obj, hashCode);
        }
        if (A012 >= 0) {
            return false;
        }
        int i2 = A012 ^ -1;
        int[] iArr = this.A01;
        if (i >= iArr.length) {
            int i3 = 4;
            if (i >= 8) {
                i3 = (i >> 1) + i;
            } else if (i >= 4) {
                i3 = 8;
            }
            Object[] objArr = this.A02;
            A02(i3);
            if (i == this.A00) {
                int[] iArr2 = this.A01;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.A02, 0, objArr.length);
                }
                A03(iArr, objArr, i);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i2 < i) {
            int[] iArr3 = this.A01;
            int i4 = i2 + 1;
            int i5 = i - i2;
            System.arraycopy(iArr3, i2, iArr3, i4, i5);
            Object[] objArr2 = this.A02;
            System.arraycopy(objArr2, i2, objArr2, i4, i5);
        }
        int i6 = this.A00;
        if (i == i6) {
            int[] iArr4 = this.A01;
            if (i2 < iArr4.length) {
                iArr4[i2] = hashCode;
                this.A02[i2] = obj;
                this.A00 = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean addAll(Collection collection) {
        int size = this.A00 + collection.size();
        int i = this.A00;
        int[] iArr = this.A01;
        if (iArr.length < size) {
            Object[] objArr = this.A02;
            A02(size);
            int i2 = this.A00;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.A01, 0, i2);
                System.arraycopy(objArr, 0, this.A02, 0, this.A00);
            }
            A03(iArr, objArr, this.A00);
        }
        if (this.A00 == i) {
            boolean z = false;
            for (Object add : collection) {
                z |= add(add);
            }
            return z;
        }
        throw new ConcurrentModificationException();
    }

    public final void clear() {
        int i = this.A00;
        if (i != 0) {
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            this.A01 = C001400q.A00;
            this.A02 = C001400q.A01;
            this.A00 = 0;
            A03(iArr, objArr, i);
        }
        if (this.A00 != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean contains(Object obj) {
        int A012;
        if (obj == null) {
            A012 = A00();
        } else {
            A012 = A01(obj, obj.hashCode());
        }
        if (A012 >= 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.A01;
        int i = this.A00;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final boolean isEmpty() {
        if (this.A00 <= 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new AnonymousClass06a(this);
    }

    public final boolean remove(Object obj) {
        int A012;
        if (obj == null) {
            A012 = A00();
        } else {
            A012 = A01(obj, obj.hashCode());
        }
        if (A012 < 0) {
            return false;
        }
        A04(A012);
        return true;
    }

    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.A00 - 1; i >= 0; i--) {
            if (!collection.contains(this.A02[i])) {
                A04(i);
                z = true;
            }
        }
        return z;
    }

    public C001000m(int i) {
        if (i == 0) {
            this.A01 = C001400q.A00;
            this.A02 = C001400q.A01;
        } else {
            A02(i);
        }
        this.A00 = 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final int size() {
        return this.A00;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.A00 * 14);
        sb.append('{');
        for (int i = 0; i < this.A00; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.A02[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C001000m() {
        this(0);
    }

    public final Object[] toArray() {
        int i = this.A00;
        Object[] objArr = new Object[i];
        System.arraycopy(this.A02, 0, objArr, 0, i);
        return objArr;
    }
}
