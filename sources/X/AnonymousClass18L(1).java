package X;

/* renamed from: X.18L  reason: invalid class name */
public final class AnonymousClass18L extends AnonymousClass0Sf implements C81224nO {
    public final long A00;
    public final C28291u0 A01;
    public final C560635q A02;
    public final C560735r A03;

    public AnonymousClass18L(C28291u0 r3) {
        C560635q r0;
        C04220Ms.A0B(r3, 1);
        this.A01 = r3;
        C28221tt r1 = r3.A08;
        C04220Ms.A06(r1);
        this.A03 = new C560735r(r1);
        AnonymousClass3FV r12 = r3.A07;
        if (r12 != null) {
            r0 = new C560635q(r12);
        } else {
            r0 = null;
        }
        this.A02 = r0;
        this.A00 = (long) r3.A01;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass18L) && C04220Ms.A0I(this.A01, ((AnonymousClass18L) obj).A01));
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
