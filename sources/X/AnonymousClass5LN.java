package X;

/* renamed from: X.5LN  reason: invalid class name */
public final class AnonymousClass5LN extends AnonymousClass0Sf implements C142268ea {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5LN) {
                AnonymousClass5LN r5 = (AnonymousClass5LN) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C18180wK.A03(this.A02) + AnonymousClass0wJ.A06(this.A00)) * 31) + C18200wM.A09(this.A01);
    }

    public AnonymousClass5LN(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
