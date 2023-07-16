package X;

/* renamed from: X.0YS  reason: invalid class name */
public final class AnonymousClass0YS implements AnonymousClass0NA {
    public AnonymousClass0NA A00;
    public final C04100Mg A01;
    public final /* synthetic */ AnonymousClass0OK A02;

    private synchronized AnonymousClass0NA A00() {
        C07220b8 r0;
        if (this.A00 == null && (r0 = (C07220b8) this.A01.A03(C07220b8.class)) != null) {
            this.A00 = r0.A0C;
        }
        return this.A00;
    }

    public AnonymousClass0YS(AnonymousClass0OK r2) {
        this.A02 = r2;
        this.A01 = r2.A02();
    }

    public final void CAR(AnonymousClass0QT r2) {
        AnonymousClass0NA A002 = A00();
        if (A002 != null) {
            A002.CAR(r2);
        }
    }

    public final void CAS(AnonymousClass0QT r2) {
        AnonymousClass0NA A002 = A00();
        if (A002 != null) {
            A002.CAS(r2);
        }
    }
}
