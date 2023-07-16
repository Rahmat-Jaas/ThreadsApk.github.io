package X;

/* renamed from: X.5qR  reason: invalid class name */
public final class AnonymousClass5qR extends AnonymousClass5qS {
    public int A00;
    public final int A01;
    public final AnonymousClass5qX A02;

    public final int nextIndex() {
        return this.A00;
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }

    public final Object A00(int i) {
        return this.A02.get(i);
    }

    public final boolean hasNext() {
        return C18230wP.A1W(this.A00, this.A01);
    }

    public final boolean hasPrevious() {
        return C18180wK.A1X(this.A00);
    }

    public AnonymousClass5qR(int i, int i2) {
        C121287Fi.A02(i2, i);
        this.A01 = i;
        this.A00 = i2;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.A00;
            this.A00 = i + 1;
            return A00(i);
        }
        throw C86154wM.A0u();
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A00 - 1;
            this.A00 = i;
            return A00(i);
        }
        throw C86154wM.A0u();
    }

    public AnonymousClass5qR(AnonymousClass5qX r2, int i) {
        this(r2.size(), i);
        this.A02 = r2;
    }
}
