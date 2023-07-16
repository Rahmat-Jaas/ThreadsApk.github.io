package X;

/* renamed from: X.8bR  reason: invalid class name */
public final class AnonymousClass8bR extends AnonymousClass84L {
    public final Object[] A00;

    public AnonymousClass8bR(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.A00 = objArr;
    }

    public final Object previous() {
        if (hasPrevious()) {
            Object[] objArr = this.A00;
            int i = this.A00 - 1;
            this.A00 = i;
            return objArr[i];
        }
        throw C86154wM.A0u();
    }
}
