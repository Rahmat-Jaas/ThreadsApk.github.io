package X;

/* renamed from: X.18b  reason: invalid class name */
public final class AnonymousClass18b extends AnonymousClass0Sf implements C84084sW {
    public final Integer A00;
    public final Integer A01;

    public final AnonymousClass18b D0G() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18b) {
                AnonymousClass18b r5 = (AnonymousClass18b) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer Afm() {
        return this.A00;
    }

    public final Integer BDN() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A03(this.A00) * 31) + C18200wM.A07(this.A01);
    }

    public AnonymousClass18b(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }
}
