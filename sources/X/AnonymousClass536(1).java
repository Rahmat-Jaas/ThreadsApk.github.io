package X;

/* renamed from: X.536  reason: invalid class name */
public final class AnonymousClass536 extends AnonymousClass84K {
    public final Object A00;

    public AnonymousClass536(Object obj, int i) {
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
