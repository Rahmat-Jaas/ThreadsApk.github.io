package X;

/* renamed from: X.535  reason: invalid class name */
public final class AnonymousClass535 extends AnonymousClass84K {
    public final Object[] A00;

    public AnonymousClass535(Object[] objArr, int i, int i2) {
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
