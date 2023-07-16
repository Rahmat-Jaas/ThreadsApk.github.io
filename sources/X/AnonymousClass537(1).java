package X;

/* renamed from: X.537  reason: invalid class name */
public final class AnonymousClass537 extends AnonymousClass84K {
    public final AnonymousClass538 A00;
    public final Object[] A01;

    public AnonymousClass537(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.A01 = objArr2;
        int i4 = (i2 - 1) & -32;
        this.A00 = new AnonymousClass538(objArr, i > i4 ? i4 : i, i4, i3);
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A00;
            AnonymousClass538 r1 = this.A00;
            int i2 = r1.A01;
            if (i > i2) {
                Object[] objArr = this.A01;
                int i3 = i - 1;
                this.A00 = i3;
                return objArr[i3 - i2];
            }
            this.A00 = i - 1;
            return r1.previous();
        }
        throw C86154wM.A0u();
    }
}
