package X;

import java.util.List;

/* renamed from: X.18W  reason: invalid class name */
public final class AnonymousClass18W extends AnonymousClass0Sf implements C84064sU {
    public final Boolean A00;
    public final List A01;

    public AnonymousClass18W(Boolean bool, List list) {
        C04220Ms.A0B(list, 2);
        this.A00 = bool;
        this.A01 = list;
    }

    public final AnonymousClass18W Czo() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18W) {
                AnonymousClass18W r5 = (AnonymousClass18W) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Boolean AmE() {
        return this.A00;
    }

    public final List B1g() {
        return this.A01;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, AnonymousClass0wJ.A03(this.A00) * 31);
    }
}
