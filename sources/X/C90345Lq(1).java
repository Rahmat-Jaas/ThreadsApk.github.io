package X;

/* renamed from: X.5Lq  reason: invalid class name and case insensitive filesystem */
public final class C90345Lq extends AnonymousClass0Sf implements C142348ei {
    public final C23894D0g A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90345Lq) {
                C90345Lq r5 = (C90345Lq) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A04 = C18210wN.A04(this.A00);
        boolean z = this.A01;
        if (z) {
            z = true;
        }
        return A04 + (z ? 1 : 0);
    }

    public C90345Lq(C23894D0g d0g, boolean z) {
        this.A00 = d0g;
        this.A01 = z;
    }
}
