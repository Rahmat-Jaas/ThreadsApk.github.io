package X;

/* renamed from: X.79c  reason: invalid class name and case insensitive filesystem */
public final class C1201779c {
    public static final C1201779c A03;
    public final C104236bS A00;
    public final C104236bS A01;
    public final C104236bS A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1201779c) {
                C1201779c r5 = (C1201779c) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    static {
        AnonymousClass59K r1 = AnonymousClass59K.A01;
        A03 = new C1201779c(r1, r1, r1);
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, AnonymousClass0wJ.A05(this.A01, C18210wN.A04(this.A02)));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("LoadStates(refresh=");
        A0s.append(this.A02);
        A0s.append(", prepend=");
        A0s.append(this.A01);
        A0s.append(", append=");
        return C86104wH.A0y(this.A00, A0s);
    }

    public C1201779c(C104236bS r1, C104236bS r2, C104236bS r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }
}
