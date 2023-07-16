package X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.00i  reason: invalid class name and case insensitive filesystem */
public final class C000700i implements Set<K> {
    public final /* synthetic */ C013306f A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public C000700i(C013306f r1) {
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
        return this.A00.containsKey(obj);
    }

    public final boolean containsAll(Collection collection) {
        C013306f r2 = this.A00;
        for (Object containsKey : collection) {
            if (!r2.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        C013306f r4 = this.A00;
        int i = 0;
        for (int i2 = r4.A01 - 1; i2 >= 0; i2--) {
            Object obj = r4.A02[i2 << 1];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i += hashCode;
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Iterator iterator() {
        return new AnonymousClass07W(this.A00);
    }

    public final boolean remove(Object obj) {
        C013306f r1 = this.A00;
        int A04 = r1.A04(obj);
        if (A04 < 0) {
            return false;
        }
        r1.A06(A04);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        C013306f r3 = this.A00;
        int i = r3.A01;
        for (Object remove : collection) {
            r3.remove(remove);
        }
        if (i != r3.A01) {
            return true;
        }
        return false;
    }

    public final boolean retainAll(Collection collection) {
        return this.A00.A09(collection);
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
            objArr[i2] = r4.A02[i2 << 1];
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public final Object[] toArray() {
        C013306f r5 = this.A00;
        int i = r5.A01;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = r5.A02[i2 << 1];
        }
        return objArr;
    }
}
