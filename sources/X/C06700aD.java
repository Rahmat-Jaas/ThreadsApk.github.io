package X;

import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: X.0aD  reason: invalid class name and case insensitive filesystem */
public final class C06700aD implements Iterator, C03740Kn {
    public final /* synthetic */ Enumeration A00;

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C06700aD(Enumeration enumeration) {
        this.A00 = enumeration;
    }

    public final boolean hasNext() {
        return this.A00.hasMoreElements();
    }

    public final Object next() {
        return this.A00.nextElement();
    }
}
