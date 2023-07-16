package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* renamed from: X.84Q  reason: invalid class name */
public final class AnonymousClass84Q implements ListIterator, AnonymousClass0Wi {
    public int A00;
    public int A01;
    public final AnonymousClass84D A02;

    private final void A00() {
        if (this.A02.A01() != this.A01) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        if (this.A00 >= this.A02.size() - 1) {
            return false;
        }
        return true;
    }

    public final boolean hasPrevious() {
        return C86114wI.A1S(this.A00);
    }

    public final int nextIndex() {
        return this.A00 + 1;
    }

    public final int previousIndex() {
        return this.A00;
    }

    public AnonymousClass84Q(AnonymousClass84D r2, int i) {
        this.A02 = r2;
        this.A00 = i - 1;
        this.A01 = r2.A01();
    }

    public final void add(Object obj) {
        A00();
        AnonymousClass84D r1 = this.A02;
        r1.add(this.A00 + 1, obj);
        this.A00++;
        this.A01 = r1.A01();
    }

    public final Object next() {
        A00();
        int i = this.A00 + 1;
        AnonymousClass84D r1 = this.A02;
        C1187272a.A00(i, r1.size());
        Object obj = r1.get(i);
        this.A00 = i;
        return obj;
    }

    public final Object previous() {
        A00();
        int i = this.A00;
        AnonymousClass84D r1 = this.A02;
        C1187272a.A00(i, r1.size());
        this.A00--;
        return r1.get(this.A00);
    }

    public final void remove() {
        A00();
        AnonymousClass84D r1 = this.A02;
        r1.remove(this.A00);
        this.A00--;
        this.A01 = r1.A01();
    }

    public final void set(Object obj) {
        A00();
        AnonymousClass84D r1 = this.A02;
        r1.set(this.A00, obj);
        this.A01 = r1.A01();
    }
}
