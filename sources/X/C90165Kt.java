package X;

/* renamed from: X.5Kt  reason: invalid class name and case insensitive filesystem */
public final class C90165Kt extends AnonymousClass0Sf implements C144258i5 {
    public final String A00;
    public final boolean A01;

    public C90165Kt(String str, boolean z) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    public final C90165Kt Czr() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90165Kt) {
                C90165Kt r5 = (C90165Kt) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18180wK.A03(this.A00) + (C86164wN.A1S(this.A01) ? 1 : 0);
    }
}
