package X;

/* renamed from: X.6us  reason: invalid class name and case insensitive filesystem */
public final class C115326us {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115326us) {
                C115326us r5 = (C115326us) obj;
                if (!(C04220Ms.A0I(this.A01, r5.A01) && C04220Ms.A0I(this.A00, r5.A00) && this.A04 == r5.A04 && this.A02 == r5.A02 && this.A05 == r5.A05 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C115326us(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean A1R = C18240wQ.A1R(i & 8, z2);
        boolean A1R2 = C18240wQ.A1R(i & 16, z3);
        boolean A1R3 = C18240wQ.A1R(i & 32, z4);
        this.A01 = str;
        this.A00 = str2;
        this.A04 = z;
        this.A02 = A1R;
        this.A05 = A1R2;
        this.A03 = A1R3;
    }

    public final int hashCode() {
        int A032 = (C18180wK.A03(this.A01) + C18200wM.A09(this.A00)) * 31;
        boolean z = this.A04;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A032 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A02;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A05;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        if (!this.A03) {
            i = 0;
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("PriceTableRowData(priceLabel=");
        A0s.append(this.A01);
        A0s.append(", priceAmount=");
        A0s.append(this.A00);
        A0s.append(", isLabelEmphasized=");
        A0s.append(this.A04);
        A0s.append(", isAmountEmphasized=");
        A0s.append(this.A02);
        A0s.append(", isPlaceholder=");
        A0s.append(this.A05);
        A0s.append(", isGreen=");
        A0s.append(this.A03);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
