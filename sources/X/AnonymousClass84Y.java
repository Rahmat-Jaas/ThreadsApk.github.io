package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.84Y  reason: invalid class name */
public final class AnonymousClass84Y implements Set, Serializable, C03740Kn {
    public static final AnonymousClass84Y A00 = new AnonymousClass84Y();

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Object[] toArray() {
        return AnonymousClass0N4.A00(this);
    }

    public final String toString() {
        return "[]";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Set) || !((Set) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public final Iterator iterator() {
        return C06410Zg.A00;
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C18220wO.A0v();
    }

    public final boolean addAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final void clear() {
        throw C18220wO.A0v();
    }

    public final boolean containsAll(Collection collection) {
        return C86144wL.A1Z(collection);
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

    public final /* bridge */ boolean contains(Object obj) {
        return false;
    }
}
