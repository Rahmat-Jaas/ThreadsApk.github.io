package X;

/* renamed from: X.077  reason: invalid class name */
public final class AnonymousClass077 implements C03570Jn {
    public final /* synthetic */ AnonymousClass0VV A00;

    public AnonymousClass077(AnonymousClass0VV r1) {
        this.A00 = r1;
    }

    private void A00() {
        AnonymousClass0T4 r0;
        this.A00.A05.onTrigger();
        synchronized (AnonymousClass0T7.class) {
            r0 = AnonymousClass0T7.A00;
        }
        if (r0 != null) {
            r0.Cbt(this);
        }
    }

    public final void Bk4(AnonymousClass0T5 r2) {
        if ((this.A00.A00 & 4) != 0 && r2 == AnonymousClass0T5.RED) {
            A00();
        }
    }

    public final void C3x(AnonymousClass0T5 r2) {
        if ((this.A00.A00 & 1) != 0 && r2 == AnonymousClass0T5.RED) {
            A00();
        }
    }

    public final void COO(AnonymousClass0T5 r2) {
        if ((this.A00.A00 & 2) != 0 && r2 == AnonymousClass0T5.RED) {
            A00();
        }
    }
}
