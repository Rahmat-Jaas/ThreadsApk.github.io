package X;

/* renamed from: X.0iY  reason: invalid class name and case insensitive filesystem */
public final class C10560iY implements C08750eE {
    public C08760eF A00;
    public boolean A01 = false;
    public final C10420iJ A02 = new C02610Cc(this);

    public final void Ce3() {
        this.A01 = true;
    }

    public final void ANQ() {
        C08760eF r0 = this.A00;
        if (r0 != null) {
            r0.CVM();
        }
        this.A01 = false;
    }

    public final void CqN(C08760eF r3) {
        C10400iH r1 = C10410iI.A00;
        C10420iJ r0 = this.A02;
        if (r3 != null) {
            r1.A00(r0);
        } else {
            r1.A01(r0);
        }
        this.A00 = r3;
    }
}
