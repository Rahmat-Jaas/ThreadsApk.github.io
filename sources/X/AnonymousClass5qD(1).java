package X;

/* renamed from: X.5qD  reason: invalid class name */
public final class AnonymousClass5qD extends AnonymousClass5qE {
    public int A00;
    public final int A01;
    public final AnonymousClass5q8 A02;

    public final int nextIndex() {
        return this.A00;
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }

    public final boolean hasNext() {
        return C18230wP.A1W(this.A00, this.A01);
    }

    public final boolean hasPrevious() {
        return C18180wK.A1X(this.A00);
    }

    public AnonymousClass5qD(AnonymousClass5q8 r3, int i) {
        int size = r3.size();
        if (i <= size) {
            this.A01 = size;
            this.A00 = i;
            this.A02 = r3;
            return;
        }
        throw new IndexOutOfBoundsException(AnonymousClass7BR.A00("index", i, size));
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.A00;
            this.A00 = i + 1;
            return this.A02.get(i);
        }
        throw C86154wM.A0u();
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A00 - 1;
            this.A00 = i;
            return this.A02.get(i);
        }
        throw C86154wM.A0u();
    }
}
