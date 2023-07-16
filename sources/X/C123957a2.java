package X;

/* renamed from: X.7a2  reason: invalid class name and case insensitive filesystem */
public final class C123957a2 implements C143158gC {
    public int A00 = -1;
    public final C143158gC A01;
    public final M5J A02;

    public final void onChanged(Object obj) {
        int i = this.A00;
        int i2 = this.A02.A01;
        if (i != i2) {
            this.A00 = i2;
            this.A01.onChanged(obj);
        }
    }

    public C123957a2(M5J m5j, C143158gC r3) {
        this.A02 = m5j;
        this.A01 = r3;
    }
}
