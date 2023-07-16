package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: X.84E  reason: invalid class name */
public final class AnonymousClass84E implements List<AnonymousClass8ck>, C03740Kn {
    public final List A00 = new AnonymousClass84D();

    public final boolean containsAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        return this.A00.containsAll(collection);
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Iterator iterator() {
        return this.A00.iterator();
    }

    public final ListIterator listIterator() {
        return this.A00.listIterator();
    }

    public final ListIterator listIterator(int i) {
        return this.A00.listIterator(i);
    }

    public final List subList(int i, int i2) {
        return this.A00.subList(i, i2);
    }

    public final Object[] toArray() {
        return AnonymousClass0N4.A00(this);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof AnonymousClass8ck)) {
            return false;
        }
        C04220Ms.A0B(obj, 0);
        return this.A00.contains(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof AnonymousClass8ck)) {
            return -1;
        }
        C04220Ms.A0B(obj, 0);
        return this.A00.indexOf(obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof AnonymousClass8ck)) {
            return -1;
        }
        C04220Ms.A0B(obj, 0);
        return this.A00.lastIndexOf(obj);
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw C18220wO.A0v();
    }

    public final boolean addAll(int i, Collection collection) {
        throw C18220wO.A0v();
    }

    public final void clear() {
        throw C18220wO.A0v();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw C18220wO.A0v();
    }

    public final boolean removeAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        throw C18220wO.A0v();
    }

    public final boolean retainAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw C18220wO.A0v();
    }

    public final void sort(Comparator comparator) {
        throw C18220wO.A0v();
    }

    public final Object[] toArray(Object[] objArr) {
        return C86114wI.A1a(this, objArr);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C18220wO.A0v();
    }

    public final boolean addAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final boolean remove(Object obj) {
        throw C18220wO.A0v();
    }
}
