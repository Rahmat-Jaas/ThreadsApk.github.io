package X;

/* renamed from: X.5L8  reason: invalid class name */
public final class AnonymousClass5L8 extends AnonymousClass0Sf implements C21551BwF {
    public final String A00;
    public final String A01;

    public final AnonymousClass5L8 D21() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5L8) {
                AnonymousClass5L8 r5 = (AnonymousClass5L8) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BFt() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A06(this.A00) * 31) + C18200wM.A09(this.A01);
    }

    public AnonymousClass5L8(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
