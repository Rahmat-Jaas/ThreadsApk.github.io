package X;

import java.util.ListIterator;

/* renamed from: X.84M  reason: invalid class name */
public final class AnonymousClass84M implements ListIterator, C03740Kn {
    public int A00;
    public final int A01;
    public final int A02;
    public final /* synthetic */ AnonymousClass84G A03;

    public AnonymousClass84M(AnonymousClass84G r1, int i, int i2, int i3) {
        this.A03 = r1;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }

    public final boolean hasNext() {
        return C18230wP.A1W(this.A00, this.A01);
    }

    public final boolean hasPrevious() {
        return C86134wK.A1X(this.A00, this.A02);
    }

    public final Object next() {
        Object[] objArr = this.A03.A03;
        int i = this.A00;
        this.A00 = i + 1;
        return objArr[i];
    }

    public final int nextIndex() {
        return this.A00 - this.A02;
    }

    public final Object previous() {
        Object[] objArr = this.A03.A03;
        int i = this.A00 - 1;
        this.A00 = i;
        return objArr[i];
    }

    public final int previousIndex() {
        return (this.A00 - this.A02) - 1;
    }

    public final void add(Object obj) {
        throw C18220wO.A0v();
    }

    public final void remove() {
        throw C18220wO.A0v();
    }

    public final void set(Object obj) {
        throw C18220wO.A0v();
    }
}
