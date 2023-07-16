package X;

/* renamed from: X.5L1  reason: invalid class name */
public final class AnonymousClass5L1 extends AnonymousClass0Sf implements C144328iC {
    public final String A00;
    public final String A01;

    public final AnonymousClass5L1 D0B() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5L1) {
                AnonymousClass5L1 r5 = (AnonymousClass5L1) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A06(this.A00) * 31) + C18200wM.A09(this.A01);
    }

    public AnonymousClass5L1(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
