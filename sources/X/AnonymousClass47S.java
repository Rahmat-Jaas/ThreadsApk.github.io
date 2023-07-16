package X;

/* renamed from: X.47S  reason: invalid class name */
public final class AnonymousClass47S implements C86014w8 {
    public Object A00;
    public final C04560Oe A01;
    public volatile boolean A02;

    public final synchronized Object get() {
        if (!this.A02) {
            if (!this.A02) {
                this.A00 = this.A01.get();
                this.A02 = true;
            }
        }
        return this.A00;
    }

    public AnonymousClass47S(C04560Oe r1) {
        this.A01 = r1;
    }
}
