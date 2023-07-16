package X;

/* renamed from: X.5LR  reason: invalid class name */
public final class AnonymousClass5LR extends AnonymousClass0Sf implements C142288ec {
    public final C57943Dd A00;
    public final C57943Dd A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5LR) {
                AnonymousClass5LR r5 = (AnonymousClass5LR) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A04(this.A01) + AnonymousClass0wJ.A03(this.A00);
    }

    public AnonymousClass5LR(C57943Dd r1, C57943Dd r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
