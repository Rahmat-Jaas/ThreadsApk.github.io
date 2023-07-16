package X;

/* renamed from: X.82D  reason: invalid class name */
public final class AnonymousClass82D implements Runnable {
    public final /* synthetic */ AnonymousClass066 A00;
    public final /* synthetic */ M5J A01;
    public final /* synthetic */ C89405Ej A02;

    public AnonymousClass82D(AnonymousClass066 r1, M5J m5j, C89405Ej r3) {
        this.A02 = r3;
        this.A01 = m5j;
        this.A00 = r1;
    }

    public final void run() {
        C89405Ej r3 = this.A02;
        C143158gC r0 = r3.A04;
        if (r0 != null) {
            M5J m5j = this.A01;
            m5j.A0F(r0);
            m5j.A0C(this.A00, r3.A04);
        }
    }
}
