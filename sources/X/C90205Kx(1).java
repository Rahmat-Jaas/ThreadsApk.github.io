package X;

/* renamed from: X.5Kx  reason: invalid class name and case insensitive filesystem */
public final class C90205Kx extends AnonymousClass0Sf implements C144288i8 {
    public final C90215Ky A00;
    public final boolean A01;

    public C90205Kx(C90215Ky r2, boolean z) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = z;
    }

    public final C90205Kx Czw() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90205Kx) {
                C90205Kx r5 = (C90205Kx) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A04(this.A00) + (C86164wN.A1S(this.A01) ? 1 : 0);
    }
}
