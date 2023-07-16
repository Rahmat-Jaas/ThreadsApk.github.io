package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.83Z  reason: invalid class name */
public final class AnonymousClass83Z implements Collection<Object>, C03740Kn {
    public final Set A00;

    public AnonymousClass83Z() {
        this((Set) null, (DefaultConstructorMarker) null, 1);
    }

    public final boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        return this.A00.containsAll(collection);
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final boolean removeAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        return this.A00.remove(collection);
    }

    public final boolean retainAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        return this.A00.retainAll(collection);
    }

    public final Object[] toArray() {
        return AnonymousClass0N4.A00(this);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return this.A00.add(obj);
    }

    public final void clear() {
        this.A00.clear();
    }

    public final Iterator iterator() {
        return this.A00.iterator();
    }

    public final boolean remove(Object obj) {
        return this.A00.remove(obj);
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public /* synthetic */ AnonymousClass83Z(Set set, DefaultConstructorMarker defaultConstructorMarker, int i) {
        this.A00 = C86134wK.A0u();
    }

    public final boolean addAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final boolean removeIf(Predicate predicate) {
        throw C18220wO.A0v();
    }

    public final Object[] toArray(Object[] objArr) {
        return C86114wI.A1a(this, objArr);
    }
}
