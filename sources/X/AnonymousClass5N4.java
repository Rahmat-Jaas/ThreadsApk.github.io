package X;

/* renamed from: X.5N4  reason: invalid class name */
public final class AnonymousClass5N4 extends AnonymousClass0Sf implements C144948jY {
    public final C57943Dd A00;
    public final C57943Dd A01;
    public final J4J A02;
    public final boolean A03;

    public AnonymousClass5N4(C57943Dd r2, C57943Dd r3, J4J j4j, boolean z) {
        C18190wL.A1S(r2, 2, j4j);
        this.A03 = z;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = j4j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5N4) {
                AnonymousClass5N4 r5 = (AnonymousClass5N4) obj;
                if (this.A03 != r5.A03 || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean BLm() {
        return this.A03;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A02, (AnonymousClass0wJ.A05(this.A00, (C86164wN.A1S(this.A03) ? 1 : 0) * true) + AnonymousClass0wJ.A03(this.A01)) * 31 * 31);
    }
}
