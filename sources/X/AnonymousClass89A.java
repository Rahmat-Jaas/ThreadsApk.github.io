package X;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.89A  reason: invalid class name */
public abstract class AnonymousClass89A extends AbstractCollection implements Serializable {
    public static final Object[] A00 = C86164wN.A1T();

    public final int A02() {
        if ((this instanceof AnonymousClass5qA) || (this instanceof AnonymousClass5q7)) {
            return 0;
        }
        if (this instanceof AnonymousClass5q6) {
            AnonymousClass5q6 r2 = (AnonymousClass5q6) this;
            return r2.A02.A02() + r2.A00;
        }
        throw C18240wQ.A0j();
    }

    public int A03(Object[] objArr, int i) {
        if (this instanceof AnonymousClass5q9) {
            objArr[0] = ((AnonymousClass5q9) this).A00;
            return 1;
        }
        AnonymousClass5qA r0 = (AnonymousClass5qA) this;
        Object[] objArr2 = r0.A02;
        int i2 = r0.A01;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    public final Object[] A04() {
        if (this instanceof AnonymousClass5qA) {
            return ((AnonymousClass5qA) this).A02;
        }
        if (this instanceof AnonymousClass5q7) {
            return ((AnonymousClass5q7) this).A01;
        }
        if (this instanceof AnonymousClass5q6) {
            return ((AnonymousClass5q6) this).A02.A04();
        }
        return null;
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
        int A02;
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] A04 = A04();
            if (A04 == null) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            } else {
                int A022 = A02();
                if (this instanceof AnonymousClass5qA) {
                    A02 = ((AnonymousClass5qA) this).A01;
                } else if (this instanceof AnonymousClass5q7) {
                    A02 = ((AnonymousClass5q7) this).A00;
                } else if (this instanceof AnonymousClass5q6) {
                    AnonymousClass5q6 r2 = (AnonymousClass5q6) this;
                    A02 = r2.A02.A02() + r2.A00 + r2.A01;
                } else {
                    throw C18240wQ.A0j();
                }
                return Arrays.copyOfRange(A04, A022, A02, objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        A03(objArr, 0);
        return objArr;
    }

    public final Object[] toArray() {
        return toArray(A00);
    }
}
