package X;

/* renamed from: X.6uC  reason: invalid class name and case insensitive filesystem */
public final class C114956uC {
    public final C115146ua A00;
    public final C114686tj A01;
    public final C115156ub A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114956uC) {
                C114956uC r5 = (C114956uC) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A02, AnonymousClass0wJ.A05(this.A00, C18210wN.A04(this.A01)));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FBPayContactInfoComponent(fullNameComponent=");
        A0s.append(this.A01);
        A0s.append(", emailListComponent=");
        A0s.append(this.A00);
        A0s.append(", phoneNumberListComponent=");
        return C86104wH.A0y(this.A02, A0s);
    }

    public C114956uC(C115146ua r1, C114686tj r2, C115156ub r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
