package X;

/* renamed from: X.5NB  reason: invalid class name */
public final class AnonymousClass5NB extends AnonymousClass7A9 {
    public final AnonymousClass7A9 A00;
    public final AnonymousClass7A9 A01;

    public AnonymousClass5NB(AnonymousClass7A9 r2, AnonymousClass7A9 r3) {
        super(r2, (C145838lB) null);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5NB) {
                AnonymousClass5NB r5 = (AnonymousClass5NB) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, AnonymousClass0wJ.A03(this.A00) * 31);
    }
}
