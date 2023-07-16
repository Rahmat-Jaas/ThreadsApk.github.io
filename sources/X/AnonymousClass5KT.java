package X;

/* renamed from: X.5KT  reason: invalid class name */
public final class AnonymousClass5KT extends AnonymousClass0Sf implements C144068hm {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;

    public final AnonymousClass5KT Cxz() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5KT) {
                AnonymousClass5KT r5 = (AnonymousClass5KT) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass0wJ.A03(this.A01) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + C18200wM.A07(this.A00);
    }

    public AnonymousClass5KT(Boolean bool, Integer num, String str) {
        this.A01 = num;
        this.A02 = str;
        this.A00 = bool;
    }
}
