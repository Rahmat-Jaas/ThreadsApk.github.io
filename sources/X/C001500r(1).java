package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.00r  reason: invalid class name and case insensitive filesystem */
public abstract class C001500r implements Iterator {
    public int A00;
    public int A01;
    public boolean A02;

    public abstract Object A00(int i);

    public abstract void A01(int i);

    public final boolean hasNext() {
        if (this.A00 < this.A01) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (this.A02) {
            int i = this.A00 - 1;
            this.A00 = i;
            A01(i);
            this.A01--;
            this.A02 = false;
            return;
        }
        throw new IllegalStateException();
    }

    public C001500r(int i) {
        this.A01 = i;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.A00;
            Object A002 = A00(i);
            this.A00 = i + 1;
            this.A02 = true;
            return A002;
        }
        throw new NoSuchElementException();
    }
}
