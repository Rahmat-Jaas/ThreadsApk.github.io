package X;

/* renamed from: X.6pP  reason: invalid class name and case insensitive filesystem */
public final class C112336pP {
    public final Object A00;
    public final C81784oM A01;
    public final C112336pP A02;

    public C112336pP(C81784oM r2, C112336pP r3) {
        C04220Ms.A0B(r2, 1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r2.getValue();
    }

    public final boolean A00() {
        if (this.A01.getValue() != this.A00) {
            return true;
        }
        C112336pP r0 = this.A02;
        if (r0 == null || !r0.A00()) {
            return false;
        }
        return true;
    }
}
