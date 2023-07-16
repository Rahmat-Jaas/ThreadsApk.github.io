package X;

/* renamed from: X.80X  reason: invalid class name */
public final class AnonymousClass80X implements Runnable {
    public final /* synthetic */ M5J A00;
    public final /* synthetic */ AnonymousClass7K3 A01;

    public AnonymousClass80X(M5J m5j, AnonymousClass7K3 r2) {
        this.A01 = r2;
        this.A00 = m5j;
    }

    public final void run() {
        AnonymousClass066 r2;
        AnonymousClass7K3 r3 = this.A01;
        C39730Kys kys = r3.A02.A03;
        if (kys instanceof AnonymousClass066) {
            r2 = (AnonymousClass066) kys;
        } else {
            AnonymousClass7K3.A04(r3, "NULL_LIFE_CYCLE_OWNER");
            r2 = null;
        }
        C143158gC r0 = r3.A00;
        if (r0 != null && r2 != null) {
            M5J m5j = this.A00;
            m5j.A0F(r0);
            m5j.A0C(r2, r3.A00);
        }
    }
}
