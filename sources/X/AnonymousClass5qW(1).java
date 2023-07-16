package X;

/* renamed from: X.5qW  reason: invalid class name */
public final class AnonymousClass5qW extends AnonymousClass5qX {
    public static final AnonymousClass5qX A02 = new AnonymousClass5qW(new Object[0], 0);
    public final transient Object[] A00;
    public final transient int A01;

    public final int A03() {
        return this.A01;
    }

    public final int A04() {
        return 0;
    }

    public final Object[] A05() {
        return this.A00;
    }

    public final int size() {
        return this.A01;
    }

    public final int A06(Object[] objArr, int i) {
        Object[] objArr2 = this.A00;
        int i2 = this.A01;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    public final Object get(int i) {
        C121287Fi.A01(i, this.A01);
        Object obj = this.A00[i];
        obj.getClass();
        return obj;
    }

    public AnonymousClass5qW(Object[] objArr, int i) {
        this.A00 = objArr;
        this.A01 = i;
    }
}
