package X;

import java.util.Iterator;

/* renamed from: X.83z  reason: invalid class name and case insensitive filesystem */
public abstract class C1367083z implements Iterator, C03740Kn {
    public final int A00() {
        AnonymousClass8AS r2 = (AnonymousClass8AS) this;
        int i = r2.A00;
        if (i != r2.A02) {
            r2.A00 = r2.A03 + i;
            return i;
        } else if (r2.A01) {
            r2.A01 = false;
            return i;
        } else {
            throw C86154wM.A0u();
        }
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(A00());
    }

    public final void remove() {
        throw C18220wO.A0v();
    }
}
