package X;

/* renamed from: X.16j  reason: invalid class name and case insensitive filesystem */
public final class C208516j extends AnonymousClass0Sf {
    public final int A00;
    public final C57943Dd A01;
    public final C57943Dd A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C208516j) {
                C208516j r5 = (C208516j) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A01, C18210wN.A04(this.A02)) + this.A00;
    }

    public C208516j(C57943Dd r1, C57943Dd r2, int i) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = i;
    }
}
