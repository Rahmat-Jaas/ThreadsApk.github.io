package X;

/* renamed from: X.6vB  reason: invalid class name and case insensitive filesystem */
public final class C115476vB {
    public C104236bS A00;
    public C104236bS A01;
    public C104236bS A02;

    public final C104236bS A00(AnonymousClass67E r3) {
        int A04 = C18230wP.A04(r3, 0);
        if (A04 == 0) {
            return this.A02;
        }
        if (A04 == 2) {
            return this.A00;
        }
        if (A04 == 1) {
            return this.A01;
        }
        throw AnonymousClass4VZ.A00();
    }

    public final void A02(C104236bS r4, AnonymousClass67E r5) {
        C04220Ms.A0B(r5, 0);
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            this.A02 = r4;
        } else if (ordinal == 2) {
            this.A00 = r4;
        } else if (ordinal == 1) {
            this.A01 = r4;
        } else {
            throw AnonymousClass4VZ.A00();
        }
    }

    public final void A03(C1201779c r2) {
        C04220Ms.A0B(r2, 0);
        this.A02 = r2.A02;
        this.A00 = r2.A00;
        this.A01 = r2.A01;
    }

    public final C1201779c A01() {
        return new C1201779c(this.A02, this.A01, this.A00);
    }

    public C115476vB() {
        AnonymousClass59K r0 = AnonymousClass59K.A01;
        this.A02 = r0;
        this.A01 = r0;
        this.A00 = r0;
    }
}
