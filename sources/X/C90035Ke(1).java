package X;

/* renamed from: X.5Ke  reason: invalid class name and case insensitive filesystem */
public final class C90035Ke extends AnonymousClass0Sf implements C144158hv {
    public final int A00;
    public final String A01;

    public C90035Ke(int i, String str) {
        C04220Ms.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
    }

    public final C90035Ke CyG() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90035Ke) {
                C90035Ke r5 = (C90035Ke) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, this.A00 * 31);
    }
}
