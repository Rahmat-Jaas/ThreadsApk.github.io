package X;

import java.util.List;
import java.util.ListIterator;

/* renamed from: X.84N  reason: invalid class name */
public final class AnonymousClass84N implements ListIterator, AnonymousClass0Wi {
    public int A00;
    public final List A01;

    public final void add(Object obj) {
        this.A01.add(this.A00, obj);
        this.A00++;
    }

    public final boolean hasNext() {
        return C18230wP.A1W(this.A00, this.A01.size());
    }

    public final boolean hasPrevious() {
        return C18180wK.A1X(this.A00);
    }

    public final Object next() {
        List list = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        return list.get(i);
    }

    public final int nextIndex() {
        return this.A00;
    }

    public final Object previous() {
        int i = this.A00 - 1;
        this.A00 = i;
        return this.A01.get(i);
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }

    public final void remove() {
        int i = this.A00 - 1;
        this.A00 = i;
        this.A01.remove(i);
    }

    public final void set(Object obj) {
        this.A01.set(this.A00, obj);
    }

    public AnonymousClass84N(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }
}
