package X;

import java.util.List;

/* renamed from: X.5Ka  reason: invalid class name */
public final class AnonymousClass5Ka extends AnonymousClass0Sf implements C144118hr {
    public final Long A00;
    public final List A01;

    public final AnonymousClass5Ka CyC() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Ka) {
                AnonymousClass5Ka r5 = (AnonymousClass5Ka) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A03(this.A00) * 31) + C18200wM.A07(this.A01);
    }

    public AnonymousClass5Ka(Long l, List list) {
        this.A00 = l;
        this.A01 = list;
    }
}
