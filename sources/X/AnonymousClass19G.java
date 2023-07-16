package X;

/* renamed from: X.19G  reason: invalid class name */
public final class AnonymousClass19G extends AnonymousClass0Sf implements C81424nm {
    public final C57943Dd A00;
    public final C57943Dd A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass19G) {
                AnonymousClass19G r5 = (AnonymousClass19G) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18210wN.A04(this.A01));
    }

    public AnonymousClass19G(C57943Dd r1, C57943Dd r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
