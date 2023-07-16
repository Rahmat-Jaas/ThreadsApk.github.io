package X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.00k  reason: invalid class name and case insensitive filesystem */
public final class C000900k implements Collection<V> {
    public final /* synthetic */ C013306f A00;

    public C000900k(C013306f r1) {
        this.A00 = r1;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        if (this.A00.A03(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Iterator iterator() {
        return new C014206o(this.A00);
    }

    public final boolean remove(Object obj) {
        C013306f r1 = this.A00;
        int A03 = r1.A03(obj);
        if (A03 < 0) {
            return false;
        }
        r1.A06(A03);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        C013306f r5 = this.A00;
        int i = r5.A01;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(r5.A02[(i2 << 1) + 1])) {
                r5.A06(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        C013306f r5 = this.A00;
        int i = r5.A01;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(r5.A02[(i2 << 1) + 1])) {
                r5.A06(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    public final int size() {
        return this.A00.A01;
    }

    public final Object[] toArray(Object[] objArr) {
        C013306f r4 = this.A00;
        int i = r4.A01;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = r4.A02[(i2 << 1) + 1];
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final Object[] toArray() {
        C013306f r5 = this.A00;
        int i = r5.A01;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = r5.A02[(i2 << 1) + 1];
        }
        return objArr;
    }
}
