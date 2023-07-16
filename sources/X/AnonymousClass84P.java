package X;

import java.util.ListIterator;

/* renamed from: X.84P  reason: invalid class name */
public final class AnonymousClass84P implements ListIterator, AnonymousClass0Wi {
    public int A00;
    public int A01 = -1;
    public final AnonymousClass8AN A02;

    public final void add(Object obj) {
        AnonymousClass8AN r2 = this.A02;
        int i = this.A00;
        this.A00 = i + 1;
        r2.add(i, obj);
        this.A01 = -1;
    }

    public final boolean hasNext() {
        return C18230wP.A1W(this.A00, this.A02.A00);
    }

    public final boolean hasPrevious() {
        return C18180wK.A1X(this.A00);
    }

    public final Object next() {
        int i = this.A00;
        AnonymousClass8AN r2 = this.A02;
        if (i < r2.A00) {
            this.A00 = i + 1;
            this.A01 = i;
            return r2.A03[r2.A01 + i];
        }
        throw C86154wM.A0u();
    }

    public final int nextIndex() {
        return this.A00;
    }

    public final Object previous() {
        int i = this.A00;
        if (i > 0) {
            int i2 = i - 1;
            this.A00 = i2;
            this.A01 = i2;
            AnonymousClass8AN r0 = this.A02;
            return r0.A03[r0.A01 + i2];
        }
        throw C86154wM.A0u();
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }

    public final void remove() {
        int i = this.A01;
        if (i != -1) {
            this.A02.remove(i);
            this.A00 = this.A01;
            this.A01 = -1;
            return;
        }
        throw C18180wK.A0a("Call next() or previous() before removing element from the iterator.");
    }

    public final void set(Object obj) {
        int i = this.A01;
        if (i != -1) {
            this.A02.set(i, obj);
            return;
        }
        throw C18180wK.A0a("Call next() or previous() before replacing element from the iterator.");
    }

    public AnonymousClass84P(AnonymousClass8AN r2, int i) {
        this.A02 = r2;
        this.A00 = i;
    }
}
