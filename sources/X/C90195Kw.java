package X;

/* renamed from: X.5Kw  reason: invalid class name and case insensitive filesystem */
public final class C90195Kw extends AnonymousClass0Sf implements C144278i7 {
    public final String A00;
    public final String A01;

    public final C90195Kw Czv() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90195Kw) {
                C90195Kw r5 = (C90195Kw) obj;
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

    public C90195Kw(String str, String str2) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
