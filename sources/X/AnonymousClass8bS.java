package X;

/* renamed from: X.8bS  reason: invalid class name */
public final class AnonymousClass8bS extends AnonymousClass84L {
    public final Object A00;

    public AnonymousClass8bS(Object obj, int i) {
        super(i, 1);
        this.A00 = obj;
    }

    public final Object previous() {
        if (hasPrevious()) {
            this.A00--;
            return this.A00;
        }
        throw C86154wM.A0u();
    }
}
