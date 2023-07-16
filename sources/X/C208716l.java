package X;

import java.util.List;

/* renamed from: X.16l  reason: invalid class name and case insensitive filesystem */
public final class C208716l extends AnonymousClass0Sf {
    public final int A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C208716l) {
                C208716l r5 = (C208716l) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A05 = AnonymousClass0wJ.A05(this.A02, AnonymousClass0wJ.A07(this.A01, this.A00 * 31));
        boolean z = this.A03;
        if (z) {
            z = true;
        }
        return A05 + (z ? 1 : 0);
    }

    public C208716l(String str, List list, int i, boolean z) {
        AnonymousClass0wJ.A1Q(str, list);
        this.A00 = i;
        this.A01 = str;
        this.A02 = list;
        this.A03 = z;
    }
}
