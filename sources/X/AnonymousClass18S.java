package X;

/* renamed from: X.18S  reason: invalid class name */
public final class AnonymousClass18S extends AnonymousClass0Sf implements C84044sS {
    public final String A00;
    public final String A01;

    public final AnonymousClass18S CzD() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18S) {
                AnonymousClass18S r5 = (AnonymousClass18S) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getId() {
        return this.A00;
    }

    public final String getName() {
        return this.A01;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, C18180wK.A03(this.A00));
    }

    public AnonymousClass18S(String str, String str2) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
