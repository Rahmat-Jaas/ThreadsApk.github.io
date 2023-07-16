package X;

/* renamed from: X.0DV  reason: invalid class name */
public final class AnonymousClass0DV {
    public AnonymousClass0DW A00;
    public boolean A01 = true;
    public AnonymousClass0DW A02;
    public final AnonymousClass0DX A03;
    public final AnonymousClass0DW A04;

    public final AnonymousClass0DW A00() {
        boolean A042 = this.A01 & this.A03.A04(this.A02);
        this.A01 = A042;
        if (!A042) {
            return null;
        }
        AnonymousClass0DW r1 = this.A02;
        AnonymousClass0DW r0 = this.A00;
        AnonymousClass0DW r2 = this.A04;
        r1.A02(r0, r2);
        return r2;
    }

    public AnonymousClass0DV(AnonymousClass0DW r2, AnonymousClass0DW r3, AnonymousClass0DW r4, AnonymousClass0DX r5) {
        this.A03 = r5;
        this.A02 = r2;
        this.A00 = r3;
        this.A04 = r4;
    }

    public final AnonymousClass0DW A01() {
        if (A00() == null) {
            return null;
        }
        AnonymousClass0DW r1 = this.A00;
        this.A00 = this.A02;
        this.A02 = r1;
        return this.A04;
    }
}
