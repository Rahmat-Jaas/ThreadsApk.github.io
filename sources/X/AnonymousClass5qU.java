package X;

/* renamed from: X.5qU  reason: invalid class name */
public final class AnonymousClass5qU extends AnonymousClass5qX {
    public final transient int A00;
    public final transient int A01;
    public final transient Object[] A02;

    public final int size() {
        return this.A01;
    }

    public final Object get(int i) {
        C121287Fi.A01(i, this.A01);
        Object obj = this.A02[i + i + this.A00];
        obj.getClass();
        return obj;
    }

    public AnonymousClass5qU(Object[] objArr, int i, int i2) {
        this.A02 = objArr;
        this.A00 = i;
        this.A01 = i2;
    }
}
