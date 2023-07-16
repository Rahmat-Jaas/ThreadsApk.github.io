package X;

import java.util.Iterator;

/* renamed from: X.4Tk  reason: invalid class name and case insensitive filesystem */
public final class C73684Tk implements Iterator, C03740Kn {
    public int A00;
    public final Iterator A01;

    public C73684Tk(Iterator it) {
        C04220Ms.A0B(it, 1);
        this.A01 = it;
    }

    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        this.A00 = i + 1;
        if (i >= 0) {
            return new AnonymousClass3I2(i, this.A01.next());
        }
        C06750aI.A1A();
        throw null;
    }

    public final void remove() {
        throw C18220wO.A0v();
    }
}
