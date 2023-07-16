package X;

/* renamed from: X.5qV  reason: invalid class name */
public final class AnonymousClass5qV extends AnonymousClass5qX {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ AnonymousClass5qX A02;

    public final Object[] A05() {
        return this.A02.A05();
    }

    public final int size() {
        return this.A01;
    }

    public AnonymousClass5qV(AnonymousClass5qX r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    public final int A03() {
        return this.A02.A04() + this.A00 + this.A01;
    }

    public final int A04() {
        return this.A02.A04() + this.A00;
    }

    public final AnonymousClass5qX A08(int i, int i2) {
        C121287Fi.A03(i, i2, this.A01);
        AnonymousClass5qX r1 = this.A02;
        int i3 = this.A00;
        return r1.subList(i + i3, i2 + i3);
    }

    public final Object get(int i) {
        C121287Fi.A01(i, this.A01);
        return this.A02.get(i + this.A00);
    }
}
