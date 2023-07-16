package X;

/* renamed from: X.19S  reason: invalid class name */
public final class AnonymousClass19S extends AnonymousClass0Sf implements C81674oB {
    public final int A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass19S) {
                AnonymousClass19S r5 = (AnonymousClass19S) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.A02, C18180wK.A03(this.A01)) + this.A00;
    }

    public AnonymousClass19S(String str, String str2, int i) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }
}
