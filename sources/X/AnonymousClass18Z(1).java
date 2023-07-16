package X;

/* renamed from: X.18Z  reason: invalid class name */
public final class AnonymousClass18Z extends AnonymousClass0Sf implements C84074sV {
    public final Long A00;
    public final Long A01;

    public final AnonymousClass18Z D0E() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18Z) {
                AnonymousClass18Z r5 = (AnonymousClass18Z) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Long Afr() {
        return this.A00;
    }

    public final Long BDS() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A03(this.A00) * 31) + C18200wM.A07(this.A01);
    }

    public AnonymousClass18Z(Long l, Long l2) {
        this.A00 = l;
        this.A01 = l2;
    }
}
