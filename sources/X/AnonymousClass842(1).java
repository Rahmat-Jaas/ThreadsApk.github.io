package X;

import java.util.Iterator;

/* renamed from: X.842  reason: invalid class name */
public class AnonymousClass842 implements Iterator, C03740Kn {
    public int A00;
    public final /* synthetic */ AnonymousClass8AJ A01;

    public AnonymousClass842(AnonymousClass8AJ r1) {
        this.A01 = r1;
    }

    public final boolean hasNext() {
        return C18230wP.A1W(this.A00, this.A01.size());
    }

    public final Object next() {
        if (hasNext()) {
            AnonymousClass8AJ r2 = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            return r2.get(i);
        }
        throw C86154wM.A0u();
    }

    public final void remove() {
        throw C18220wO.A0v();
    }
}
