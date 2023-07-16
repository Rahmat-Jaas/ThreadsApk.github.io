package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.847  reason: invalid class name */
public final class AnonymousClass847 implements Iterator, C03740Kn {
    public int A00;
    public final int A01;
    public final C134927yb A02;
    public final int A03;

    public final boolean hasNext() {
        return C18230wP.A1W(this.A00, this.A03);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        C134927yb r3 = this.A02;
        int i = r3.A03;
        int i2 = this.A01;
        if (i == i2) {
            int i3 = this.A00;
            this.A00 = C86154wM.A03(i3, r3.A06) + i3;
            return new C134917ya(r3, i3, i2);
        }
        throw new ConcurrentModificationException();
    }

    public AnonymousClass847(C134927yb r2, int i, int i2) {
        this.A02 = r2;
        this.A03 = i2;
        this.A00 = i;
        this.A01 = r2.A03;
        if (r2.A05) {
            throw new ConcurrentModificationException();
        }
    }

    public final void remove() {
        throw C18220wO.A0v();
    }
}
