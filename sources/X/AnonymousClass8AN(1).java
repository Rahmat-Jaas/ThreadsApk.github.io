package X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.8AN  reason: invalid class name */
public final class AnonymousClass8AN<E> extends AnonymousClass89L<E> implements List<E>, RandomAccess, Serializable, AnonymousClass028 {
    public int A00;
    public int A01;
    public boolean A02;
    public Object[] A03;
    public final AnonymousClass8AN A04;
    public final AnonymousClass8AN A05;

    public final boolean addAll(int i, Collection collection) {
        C04220Ms.A0B(collection, 1);
        A09(this);
        C120667By.A01(i, this.A00);
        int size = collection.size();
        A08(this.A01 + i, collection, size);
        return C18180wK.A1X(size);
    }

    public final int indexOf(Object obj) {
        for (int i = 0; i < this.A00; i++) {
            if (C04220Ms.A0I(this.A03[this.A01 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final Iterator iterator() {
        return new AnonymousClass84P(this, 0);
    }

    public final boolean removeAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        A09(this);
        if (A03(collection, this.A01, this.A00, false) > 0) {
            return true;
        }
        return false;
    }

    public final boolean retainAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        A09(this);
        if (A03(collection, this.A01, this.A00, true) <= 0) {
            return false;
        }
        return true;
    }

    public final List subList(int i, int i2) {
        C120667By.A02(i, i2, this.A00);
        Object[] objArr = this.A03;
        int i3 = this.A01 + i;
        int i4 = i2 - i;
        boolean z = this.A02;
        AnonymousClass8AN r2 = this.A05;
        if (r2 == null) {
            r2 = this;
        }
        return new AnonymousClass8AN(this, r2, objArr, i3, i4, z);
    }

    public final Object[] toArray(Object[] objArr) {
        C04220Ms.A0B(objArr, 0);
        int length = objArr.length;
        int i = this.A00;
        Object[] objArr2 = this.A03;
        if (length < i) {
            int i2 = this.A01;
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            C04220Ms.A06(copyOfRange);
            return copyOfRange;
        }
        int i3 = this.A01;
        AnonymousClass8AQ.A0G(objArr2, objArr, 0, i3, i + i3);
        int i4 = this.A00;
        if (length <= i4) {
            return objArr;
        }
        objArr[i4] = null;
        return objArr;
    }

    private final int A03(Collection collection, int i, int i2, boolean z) {
        int i3;
        AnonymousClass8AN r0 = this.A04;
        if (r0 != null) {
            i3 = r0.A03(collection, i, i2, z);
        } else {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                int i6 = i + i4;
                if (collection.contains(this.A03[i6]) == z) {
                    Object[] objArr = this.A03;
                    i4++;
                    objArr[i5 + i] = objArr[i6];
                    i5++;
                } else {
                    i4++;
                }
            }
            i3 = i2 - i5;
            Object[] objArr2 = this.A03;
            AnonymousClass8AQ.A0G(objArr2, objArr2, i + i5, i2 + i, this.A00);
            Object[] objArr3 = this.A03;
            int i7 = this.A00;
            C102576Vs.A00(objArr3, i7 - i3, i7);
        }
        this.A00 -= i3;
        return i3;
    }

    public static final Object A04(AnonymousClass8AN r5, int i) {
        Object obj;
        AnonymousClass8AN r0 = r5.A04;
        if (r0 != null) {
            obj = A04(r0, i);
        } else {
            Object[] objArr = r5.A03;
            obj = objArr[i];
            int i2 = i + 1;
            int i3 = r5.A01;
            System.arraycopy(objArr, i2, objArr, i, (r5.A00 + i3) - i2);
            Object[] objArr2 = r5.A03;
            C04220Ms.A0B(objArr2, 0);
            objArr2[(i3 + r5.A00) - 1] = null;
        }
        r5.A00--;
        return obj;
    }

    private final void A05(int i, int i2) {
        int i3 = this.A00 + i2;
        if (this.A04 != null) {
            throw new IllegalStateException();
        } else if (i3 >= 0) {
            Object[] objArr = this.A03;
            int length = objArr.length;
            if (i3 > length) {
                int i4 = length + (length >> 1);
                if (i4 - i3 < 0) {
                    i4 = i3;
                }
                if (i4 - 2147483639 > 0) {
                    i4 = 2147483639;
                    if (i3 > 2147483639) {
                        i4 = Integer.MAX_VALUE;
                    }
                }
                objArr = C86124wJ.A1b(objArr, i4);
                this.A03 = objArr;
            }
            AnonymousClass8AQ.A0G(objArr, objArr, i + i2, i, this.A01 + this.A00);
            this.A00 += i2;
        } else {
            throw new OutOfMemoryError();
        }
    }

    private final void A06(int i, int i2) {
        AnonymousClass8AN r0 = this.A04;
        if (r0 != null) {
            r0.A06(i, i2);
        } else {
            Object[] objArr = this.A03;
            AnonymousClass8AQ.A0G(objArr, objArr, i, i + i2, this.A00);
            Object[] objArr2 = this.A03;
            int i3 = this.A00;
            C102576Vs.A00(objArr2, i3 - i2, i3);
        }
        this.A00 -= i2;
    }

    private final void A07(int i, Object obj) {
        AnonymousClass8AN r1 = this.A04;
        if (r1 != null) {
            r1.A07(i, obj);
            this.A03 = r1.A03;
            this.A00++;
            return;
        }
        A05(i, 1);
        this.A03[i] = obj;
    }

    private final void A08(int i, Collection collection, int i2) {
        AnonymousClass8AN r0 = this.A04;
        if (r0 != null) {
            r0.A08(i, collection, i2);
            this.A03 = r0.A03;
            this.A00 += i2;
            return;
        }
        A05(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.A03[i + i3] = it.next();
        }
    }

    public static final void A09(AnonymousClass8AN r1) {
        AnonymousClass8AN r0;
        if (r1.A02 || ((r0 = r1.A05) != null && r0.A02)) {
            throw C18240wQ.A0j();
        }
    }

    public final void A0Q() {
        if (this.A04 == null) {
            A09(this);
            this.A02 = true;
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        Object[] objArr = this.A03;
        int i = this.A01;
        int i2 = this.A00;
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!C04220Ms.A0I(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        C120667By.A00(i, this.A00);
        return this.A03[this.A01 + i];
    }

    public final int hashCode() {
        Object[] objArr = this.A03;
        int i = this.A01;
        int i2 = this.A00;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + C18230wP.A05(objArr[i + i4]);
        }
        return i3;
    }

    public final boolean isEmpty() {
        return C18180wK.A1W(this.A00);
    }

    public final int lastIndexOf(Object obj) {
        int i = this.A00;
        do {
            i--;
            if (i < 0) {
                return -1;
            }
        } while (!C04220Ms.A0I(this.A03[this.A01 + i], obj));
        return i;
    }

    public final ListIterator listIterator(int i) {
        C120667By.A01(i, this.A00);
        return new AnonymousClass84P(this, i);
    }

    public final String toString() {
        Object[] objArr = this.A03;
        int i = this.A01;
        int i2 = this.A00;
        StringBuilder A0s = C86114wI.A0s((i2 * 3) + 2);
        A0s.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                C86144wL.A1T(A0s);
            }
            A0s.append(objArr[i + i3]);
        }
        String A0i = C18180wK.A0i("]", A0s);
        C04220Ms.A06(A0i);
        return A0i;
    }

    public AnonymousClass8AN(AnonymousClass8AN r1, AnonymousClass8AN r2, Object[] objArr, int i, int i2, boolean z) {
        this.A03 = objArr;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = z;
        this.A04 = r1;
        this.A05 = r2;
    }

    public final void add(int i, Object obj) {
        A09(this);
        C120667By.A01(i, this.A00);
        A07(this.A01 + i, obj);
    }

    public final void clear() {
        A09(this);
        A06(this.A01, this.A00);
    }

    public final boolean remove(Object obj) {
        A09(this);
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final Object set(int i, Object obj) {
        A09(this);
        C120667By.A00(i, this.A00);
        Object[] objArr = this.A03;
        int i2 = this.A01 + i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public AnonymousClass8AN() {
        this((AnonymousClass8AN) null, (AnonymousClass8AN) null, new Object[10], 0, 0, false);
    }

    public final boolean add(Object obj) {
        A09(this);
        A07(this.A01 + this.A00, obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        A09(this);
        int size = collection.size();
        A08(this.A01 + this.A00, collection, size);
        return C18180wK.A1X(size);
    }

    public final ListIterator listIterator() {
        return new AnonymousClass84P(this, 0);
    }

    public final Object[] toArray() {
        Object[] objArr = this.A03;
        int i = this.A01;
        int i2 = this.A00 + i;
        C04220Ms.A0B(objArr, 0);
        C102556Vq.A00(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        C04220Ms.A06(copyOfRange);
        return copyOfRange;
    }
}
