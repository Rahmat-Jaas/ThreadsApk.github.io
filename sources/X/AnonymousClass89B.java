package X;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.89B  reason: invalid class name */
public abstract class AnonymousClass89B extends AbstractCollection implements Serializable {
    public static final Object[] A00 = C86164wN.A1T();

    public Object[] A05() {
        return null;
    }

    public abstract int A06(Object[] objArr, int i);

    public abstract boolean contains(Object obj);

    public int A03() {
        throw C18240wQ.A0j();
    }

    public int A04() {
        throw C18240wQ.A0j();
    }

    public final boolean add(Object obj) {
        throw C18240wQ.A0j();
    }

    public final boolean addAll(Collection collection) {
        throw C18240wQ.A0j();
    }

    public final void clear() {
        throw C18240wQ.A0j();
    }

    public final boolean remove(Object obj) {
        throw C18240wQ.A0j();
    }

    public final boolean removeAll(Collection collection) {
        throw C18240wQ.A0j();
    }

    public final boolean retainAll(Collection collection) {
        throw C18240wQ.A0j();
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] A05 = A05();
            if (A05 != null) {
                return Arrays.copyOfRange(A05, A04(), A03(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        A06(objArr, 0);
        return objArr;
    }

    public final Object[] toArray() {
        return toArray(A00);
    }
}
