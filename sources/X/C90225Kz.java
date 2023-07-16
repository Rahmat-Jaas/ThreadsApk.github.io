package X;

/* renamed from: X.5Kz  reason: invalid class name and case insensitive filesystem */
public final class C90225Kz extends AnonymousClass0Sf implements C144308iA {
    public final BKU A00;
    public final String A01;

    public final C90225Kz D01(C112176p7 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90225Kz) {
                C90225Kz r5 = (C90225Kz) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18180wK.A03(this.A01));
    }

    public C90225Kz(BKU bku, String str) {
        AnonymousClass0wJ.A1O(str, bku);
        this.A01 = str;
        this.A00 = bku;
    }
}
