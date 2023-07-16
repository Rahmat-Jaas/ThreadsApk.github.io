package X;

/* renamed from: X.5q6  reason: invalid class name */
public final class AnonymousClass5q6 extends AnonymousClass5q8 {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ AnonymousClass5q8 A02;

    public final int size() {
        return this.A01;
    }

    public AnonymousClass5q6(AnonymousClass5q8 r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    public final Object get(int i) {
        AnonymousClass7BR.A01(i, this.A01);
        return this.A02.get(i + this.A00);
    }
}
