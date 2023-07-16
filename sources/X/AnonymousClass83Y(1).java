package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* renamed from: X.83Y  reason: invalid class name */
public final class AnonymousClass83Y implements Collection<AnonymousClass79B>, C03740Kn {
    public final int A00;
    public final List A01;

    public final boolean containsAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        return this.A01.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass83Y) && C04220Ms.A0I(this.A01, ((AnonymousClass83Y) obj).A01));
    }

    public final Object[] toArray() {
        return AnonymousClass0N4.A00(this);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof AnonymousClass79B)) {
            return false;
        }
        C04220Ms.A0B(obj, 0);
        return this.A01.contains(obj);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    public final Iterator iterator() {
        return this.A01.iterator();
    }

    public final /* bridge */ int size() {
        return this.A00;
    }

    public final String toString() {
        return C86104wH.A0y(this.A01, C18190wL.A0s("LocaleList(localeList="));
    }

    public AnonymousClass83Y(List list) {
        this.A01 = list;
        this.A00 = list.size();
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

    public final boolean remove(Object obj) {
        throw C18220wO.A0v();
    }

    public final boolean removeAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final boolean removeIf(Predicate predicate) {
        throw C18220wO.A0v();
    }

    public final boolean retainAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final Object[] toArray(Object[] objArr) {
        return C86114wI.A1a(this, objArr);
    }
}
