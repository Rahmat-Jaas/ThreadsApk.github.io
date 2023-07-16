package X;

/* renamed from: X.53D  reason: invalid class name */
public final class AnonymousClass53D extends AnonymousClass53I {
    public boolean A00;
    public final AnonymousClass53I A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass53D(AnonymousClass53I r2, C134947yd r3, AnonymousClass0YY r4, AnonymousClass0YY r5, int i) {
        super(r3, r4, r5, i);
        C04220Ms.A0B(r3, 2);
        this.A01 = r2;
        r2.A0B();
    }

    public final void A0A() {
        if (!this.A01) {
            super.A0A();
            if (!this.A00) {
                this.A00 = true;
                this.A01.A0C();
            }
        }
    }
}
