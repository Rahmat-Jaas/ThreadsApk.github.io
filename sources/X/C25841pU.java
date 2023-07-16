package X;

import java.util.List;

/* renamed from: X.1pU  reason: invalid class name and case insensitive filesystem */
public final class C25841pU extends AnonymousClass2OD {
    public final C57943Dd A00;
    public final C57943Dd A01;
    public final List A02;
    public final boolean A03;

    public C25841pU(C57943Dd r2, C57943Dd r3, List list, boolean z) {
        C04220Ms.A0B(list, 4);
        this.A01 = r2;
        this.A00 = r3;
        this.A03 = z;
        this.A02 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25841pU) {
                C25841pU r5 = (C25841pU) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || this.A03 != r5.A03 || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A05 = AnonymousClass0wJ.A05(this.A00, C18210wN.A04(this.A01));
        boolean z = this.A03;
        if (z) {
            z = true;
        }
        return C18220wO.A06(this.A02, (A05 + (z ? 1 : 0)) * 31);
    }
}
