package X;

import java.util.List;

/* renamed from: X.5Hj  reason: invalid class name and case insensitive filesystem */
public final class C89875Hj extends AnonymousClass0Sf {
    public final String A00;
    public final List A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89875Hj) {
                C89875Hj r5 = (C89875Hj) obj;
                if (!(C04220Ms.A0I(this.A02, r5.A02) && C04220Ms.A0I(this.A01, r5.A01) && this.A03 == r5.A03 && C04220Ms.A0I(this.A00, r5.A00) && this.A04 == r5.A04 && this.A07 == r5.A07 && this.A06 == r5.A06 && this.A05 == r5.A05 && this.A08 == r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052 = AnonymousClass0wJ.A05(this.A01, C18210wN.A04(this.A02));
        boolean z = this.A03;
        int i = 1;
        if (z) {
            z = true;
        }
        int A062 = (((A052 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A00)) * 31;
        boolean z2 = this.A04;
        if (z2) {
            z2 = true;
        }
        int i2 = (A062 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A07;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.A06;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.A05;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        if (!this.A08) {
            i = 0;
        }
        return i5 + i;
    }

    public C89875Hj(String str, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AnonymousClass0wJ.A1O(list, list2);
        this.A02 = list;
        this.A01 = list2;
        this.A03 = z;
        this.A00 = str;
        this.A04 = z2;
        this.A07 = z3;
        this.A06 = z4;
        this.A05 = z5;
        this.A08 = z6;
    }
}
