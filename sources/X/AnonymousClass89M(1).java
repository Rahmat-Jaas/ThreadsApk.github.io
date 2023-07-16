package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.89M  reason: invalid class name */
public final class AnonymousClass89M<E> extends AbstractList<E> implements RandomAccess {
    public final ArrayList A00;

    public final void add(int i, Object obj) {
        ArrayList arrayList = this.A00;
        if (obj != null) {
            arrayList.add(i, obj);
            return;
        }
        throw C18210wN.A0W("Element must be non-null");
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    public final boolean equals(Object obj) {
        return this.A00.equals(obj);
    }

    public final Object get(int i) {
        return this.A00.get(i);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final int indexOf(Object obj) {
        return this.A00.indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        return this.A00.lastIndexOf(obj);
    }

    public final Object remove(int i) {
        return this.A00.remove(i);
    }

    public final boolean removeAll(Collection collection) {
        return this.A00.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        return this.A00.retainAll(collection);
    }

    public final Object set(int i, Object obj) {
        ArrayList arrayList = this.A00;
        if (obj != null) {
            return arrayList.set(i, obj);
        }
        throw C18210wN.A0W("Element must be non-null");
    }

    public final int size() {
        return this.A00.size();
    }

    public final Object[] toArray(Object[] objArr) {
        return this.A00.toArray(objArr);
    }

    public AnonymousClass89M(ArrayList arrayList) {
        arrayList.getClass();
        this.A00 = arrayList;
    }

    public final boolean remove(Object obj) {
        return this.A00.remove(obj);
    }

    public final Object[] toArray() {
        return this.A00.toArray();
    }
}
