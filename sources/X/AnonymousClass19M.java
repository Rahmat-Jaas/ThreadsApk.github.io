package X;

import java.util.List;

/* renamed from: X.19M  reason: invalid class name */
public final class AnonymousClass19M extends AnonymousClass0Sf implements C81484ns {
    public final int A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass19M) {
                AnonymousClass19M r5 = (AnonymousClass19M) obj;
                if (!(this.A00 == r5.A00 && C04220Ms.A0I(this.A01, r5.A01) && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A05 = AnonymousClass0wJ.A05(this.A01, this.A00 * 31);
        boolean z = this.A02;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A05 + (z ? 1 : 0)) * 31;
        if (!this.A03) {
            i = 0;
        }
        return i2 + i;
    }

    public AnonymousClass19M(List list, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = list;
        this.A02 = z;
        this.A03 = z2;
    }
}
