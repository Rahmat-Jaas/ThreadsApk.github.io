package X;

import java.util.Iterator;

/* renamed from: X.840  reason: invalid class name */
public final class AnonymousClass840 implements Iterator, C03740Kn {
    public final Iterator A00;

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public AnonymousClass840(AnonymousClass54A r2) {
        this.A00 = r2.A08.iterator();
    }

    public final void remove() {
        throw C18220wO.A0v();
    }
}
