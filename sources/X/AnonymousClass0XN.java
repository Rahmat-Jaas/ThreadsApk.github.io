package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0XN  reason: invalid class name */
public final class AnonymousClass0XN implements Iterator, C03740Kn {
    public int A00;
    public final Object[] A01;

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        if (this.A00 < this.A01.length) {
            return true;
        }
        return false;
    }

    public final Object next() {
        try {
            Object[] objArr = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.A00--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public AnonymousClass0XN(Object[] objArr) {
        this.A01 = objArr;
    }
}
