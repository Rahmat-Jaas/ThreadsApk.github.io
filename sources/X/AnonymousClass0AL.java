package X;

import java.util.Iterator;

/* renamed from: X.0AL  reason: invalid class name */
public final class AnonymousClass0AL implements Iterator {
    public int A00;
    public int A01;
    public final Object[] A02;

    public final boolean hasNext() {
        if (this.A01 < this.A00) {
            return true;
        }
        return false;
    }

    public final Object next() {
        Object[] objArr = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        return objArr[i];
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public AnonymousClass0AL(Object[] objArr) {
        this.A02 = objArr;
        this.A00 = objArr.length;
    }
}
