package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: X.84F  reason: invalid class name */
public final class AnonymousClass84F implements List<T>, C03740Kn {
    public final int A00;
    public final int A01;
    public final /* synthetic */ AnonymousClass84G A02;

    public final boolean containsAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final Object[] toArray() {
        return AnonymousClass0N4.A00(this);
    }

    public AnonymousClass84F(AnonymousClass84G r1, int i, int i2) {
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
    }

    public final Object get(int i) {
        return this.A02.A03[i + this.A01];
    }

    public final int indexOf(Object obj) {
        int i = this.A01;
        int i2 = i;
        int i3 = this.A00;
        if (i > i3) {
            return -1;
        }
        while (!C04220Ms.A0I(this.A02.A03[i], obj)) {
            if (i == i3) {
                return -1;
            }
            i++;
        }
        return i - i2;
    }

    public final Iterator iterator() {
        AnonymousClass84G r3 = this.A02;
        int i = this.A01;
        return new AnonymousClass84M(r3, i, i, this.A00);
    }

    public final int lastIndexOf(Object obj) {
        int i = this.A00;
        int i2 = this.A01;
        if (i2 > i) {
            return -1;
        }
        while (!C04220Ms.A0I(this.A02.A03[i], obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    public final ListIterator listIterator(int i) {
        AnonymousClass84G r3 = this.A02;
        int i2 = this.A01;
        return new AnonymousClass84M(r3, i + i2, i2, this.A00);
    }

    public final /* bridge */ int size() {
        return this.A00 - this.A01;
    }

    public final List subList(int i, int i2) {
        AnonymousClass84G r2 = this.A02;
        int i3 = this.A01;
        return new AnonymousClass84F(r2, i + i3, i3 + i2);
    }

    public final void add(int i, Object obj) {
        throw C18220wO.A0v();
    }

    public final boolean addAll(int i, Collection collection) {
        throw C18220wO.A0v();
    }

    public final void clear() {
        throw C18220wO.A0v();
    }

    public final boolean contains(Object obj) {
        return C86114wI.A1T(indexOf(obj), -1);
    }

    public final boolean isEmpty() {
        return C18180wK.A1W(size());
    }

    public final Object remove(int i) {
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

    public final Object set(int i, Object obj) {
        throw C18220wO.A0v();
    }

    public final void sort(Comparator comparator) {
        throw C18220wO.A0v();
    }

    public final Object[] toArray(Object[] objArr) {
        return C86114wI.A1a(this, objArr);
    }

    public final boolean add(Object obj) {
        throw C18220wO.A0v();
    }

    public final boolean addAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final ListIterator listIterator() {
        AnonymousClass84G r3 = this.A02;
        int i = this.A01;
        return new AnonymousClass84M(r3, i, i, this.A00);
    }

    public final boolean remove(Object obj) {
        throw C18220wO.A0v();
    }
}
