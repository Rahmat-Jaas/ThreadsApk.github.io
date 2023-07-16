package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.7ya  reason: invalid class name and case insensitive filesystem */
public final class C134917ya implements Iterable, C03740Kn {
    public final int A00;
    public final C134927yb A01;
    public final int A02;

    public final Iterator iterator() {
        C134927yb r3 = this.A01;
        if (r3.A03 == this.A00) {
            int i = this.A02;
            return new AnonymousClass847(r3, i + 1, i + C86154wM.A03(i, r3.A06));
        }
        throw new ConcurrentModificationException();
    }

    public C134917ya(C134927yb r1, int i, int i2) {
        this.A01 = r1;
        this.A02 = i;
        this.A00 = i2;
    }
}
