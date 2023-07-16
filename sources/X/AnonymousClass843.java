package X;

import java.util.Iterator;

/* renamed from: X.843  reason: invalid class name */
public final class AnonymousClass843 implements Iterator, C03740Kn {
    public final Iterator A00;
    public final /* synthetic */ C1371286f A01;

    public AnonymousClass843(C1371286f r2) {
        this.A01 = r2;
        this.A00 = r2.A01.iterator();
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final Object next() {
        return this.A01.A00.invoke(this.A00.next());
    }

    public final void remove() {
        throw C18220wO.A0v();
    }
}
