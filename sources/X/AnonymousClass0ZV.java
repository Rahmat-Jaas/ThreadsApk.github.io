package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.0ZV  reason: invalid class name */
public final class AnonymousClass0ZV implements List, Serializable, RandomAccess, C03740Kn {
    public static final AnonymousClass0ZV A00 = new AnonymousClass0ZV();

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        return collection.isEmpty();
    }

    public final int hashCode() {
        return 1;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray() {
        return AnonymousClass0N4.A00(this);
    }

    public final Object[] toArray(Object[] objArr) {
        C04220Ms.A0B(objArr, 0);
        return AnonymousClass0N4.A01(this, objArr);
    }

    public final String toString() {
        return "[]";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof List) || !((List) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        throw new IndexOutOfBoundsException(AnonymousClass00U.A0E("Empty list doesn't contain element at index ", '.', i));
    }

    public final ListIterator listIterator(int i) {
        if (i == 0) {
            return C06410Zg.A00;
        }
        throw new IndexOutOfBoundsException(AnonymousClass00U.A0J("Index: ", i));
    }

    public final List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(AnonymousClass00U.A01(i, i2, "fromIndex: ", ", toIndex: "));
    }

    public final Iterator iterator() {
        return C06410Zg.A00;
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final /* bridge */ boolean contains(Object obj) {
        return false;
    }

    public final /* bridge */ int indexOf(Object obj) {
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        return -1;
    }

    public final ListIterator listIterator() {
        return C06410Zg.A00;
    }
}
