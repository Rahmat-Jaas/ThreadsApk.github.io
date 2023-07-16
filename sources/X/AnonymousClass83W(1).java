package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.83W  reason: invalid class name */
public final class AnonymousClass83W<T> implements Collection<T>, C03740Kn {
    public final Object[] A00;
    public final boolean A01;

    public final boolean contains(Object obj) {
        return AnonymousClass8AP.A0E(obj, this.A00);
    }

    public final boolean isEmpty() {
        return C18180wK.A1W(this.A00.length);
    }

    public final Iterator iterator() {
        return new AnonymousClass0XN(this.A00);
    }

    public final /* bridge */ int size() {
        return this.A00.length;
    }

    public AnonymousClass83W(Object[] objArr, boolean z) {
        this.A00 = objArr;
        this.A01 = z;
    }

    public final boolean add(Object obj) {
        throw C18220wO.A0v();
    }

    public final boolean addAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final void clear() {
        throw C18220wO.A0v();
    }

    public final boolean containsAll(Collection collection) {
        if (C86144wL.A1Z(collection)) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean remove(Object obj) {
        throw C18220wO.A0v();
    }

    public final boolean removeAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final boolean retainAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final Object[] toArray(Object[] objArr) {
        return C86114wI.A1a(this, objArr);
    }

    public final Object[] toArray() {
        Object[] objArr = this.A00;
        if (this.A01 && C04220Ms.A0I(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        C04220Ms.A06(copyOf);
        return copyOf;
    }
}
