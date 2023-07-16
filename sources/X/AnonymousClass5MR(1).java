package X;

/* renamed from: X.5MR  reason: invalid class name */
public final class AnonymousClass5MR extends AnonymousClass0Sf implements C144668is {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5MR) {
                AnonymousClass5MR r5 = (AnonymousClass5MR) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B3L() {
        return this.A00;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, C18180wK.A03(this.A00));
    }

    public AnonymousClass5MR(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
