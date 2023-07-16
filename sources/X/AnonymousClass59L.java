package X;

/* renamed from: X.59L  reason: invalid class name */
public final class AnonymousClass59L extends C113226qx {
    public final C1201779c A00;
    public final C1201779c A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass59L) {
                AnonymousClass59L r5 = (AnonymousClass59L) obj;
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

    public final String toString() {
        C1201779c r2 = this.A00;
        StringBuilder A0s = C18190wL.A0s("PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: ");
        A0s.append(this.A01);
        return AnonymousClass4n8.A09(AnonymousClass00U.A0L(C86104wH.A0v(r2, C18180wK.A0i("\n                    ", A0s)), "|)"), "|");
    }

    public AnonymousClass59L(C1201779c r1, C1201779c r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
