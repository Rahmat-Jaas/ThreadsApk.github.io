package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.4Tm  reason: invalid class name and case insensitive filesystem */
public final class C73704Tm implements Iterator, C03740Kn {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;

    public C73704Tm(char c, char c2) {
        this.A03 = 1;
        this.A02 = c2;
        boolean z = C04220Ms.A00(c, c2) > 0 ? false : true;
        this.A01 = z;
        this.A00 = !z ? c2 : c;
    }

    public final boolean hasNext() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        if (i != this.A02) {
            this.A00 = this.A03 + i;
        } else if (this.A01) {
            this.A01 = false;
        } else {
            throw new NoSuchElementException();
        }
        return Character.valueOf((char) i);
    }

    public final void remove() {
        throw C18220wO.A0v();
    }

    public C73704Tm() {
    }
}
