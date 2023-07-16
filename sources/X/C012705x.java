package X;

import java.util.Iterator;

/* renamed from: X.05x  reason: invalid class name and case insensitive filesystem */
public final class C012705x implements Iterator, C03740Kn {
    public int A00;
    public final /* synthetic */ C002100y A01;

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C012705x(C002100y r1) {
        this.A01 = r1;
    }

    public final boolean hasNext() {
        if (this.A00 < this.A01.A01()) {
            return true;
        }
        return false;
    }

    public final Object next() {
        C002100y r2 = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        return r2.A05(i);
    }
}
