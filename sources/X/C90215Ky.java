package X;

/* renamed from: X.5Ky  reason: invalid class name and case insensitive filesystem */
public final class C90215Ky extends AnonymousClass0Sf implements C144298i9 {
    public final String A00;
    public final boolean A01;

    public final C90215Ky Czx() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90215Ky) {
                C90215Ky r5 = (C90215Ky) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A06(this.A00) * 31) + (C86164wN.A1S(this.A01) ? 1 : 0);
    }

    public C90215Ky(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
