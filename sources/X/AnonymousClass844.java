package X;

import java.util.Iterator;

/* renamed from: X.844  reason: invalid class name */
public final class AnonymousClass844 implements Iterator, C03740Kn {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C122137Ks A02;

    public AnonymousClass844(C122137Ks r1, int i, int i2) {
        this.A01 = i2;
        this.A02 = r1;
        this.A00 = i;
    }

    public final boolean hasNext() {
        return C18230wP.A1W(this.A00, this.A01);
    }

    public final Object next() {
        if (!hasNext()) {
            return null;
        }
        C122137Ks r3 = this.A02;
        Object[] objArr = r3.A0F;
        int i = this.A00;
        this.A00 = i + 1;
        if (i >= r3.A0B) {
            i += r3.A09;
        }
        return objArr[i];
    }

    public final void remove() {
        throw C18220wO.A0v();
    }
}
