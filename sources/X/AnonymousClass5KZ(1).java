package X;

/* renamed from: X.5KZ  reason: invalid class name */
public final class AnonymousClass5KZ extends AnonymousClass0Sf implements C144108hq {
    public final String A00;
    public final String A01;

    public final AnonymousClass5KZ CyB() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5KZ) {
                AnonymousClass5KZ r5 = (AnonymousClass5KZ) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, C18180wK.A03(this.A00));
    }

    public AnonymousClass5KZ(String str, String str2) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
