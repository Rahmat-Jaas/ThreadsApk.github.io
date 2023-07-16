package X;

import java.util.List;

/* renamed from: X.5IE  reason: invalid class name */
public final class AnonymousClass5IE extends AnonymousClass0Sf {
    public final C970467s A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public AnonymousClass5IE(C970467s r2, Boolean bool, String str, String str2, List list, boolean z, boolean z2, boolean z3) {
        C18210wN.A1M(str, 1, r2);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = list;
        this.A01 = bool;
        this.A06 = z;
        this.A05 = z2;
        this.A07 = z3;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5IE) {
                AnonymousClass5IE r5 = (AnonymousClass5IE) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A01, r5.A01) || this.A06 != r5.A06 || this.A05 != r5.A05 || this.A07 != r5.A07 || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A032 = (((((C18180wK.A03(this.A03) + AnonymousClass0wJ.A06(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + C18200wM.A07(this.A01)) * 31;
        boolean z = this.A06;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A032 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A05;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        if (!this.A07) {
            i = 0;
        }
        return C18220wO.A06(this.A00, (i3 + i) * 31);
    }

    public AnonymousClass5IE() {
        this(C970467s.None, false, "", "", AnonymousClass0ZV.A00, false, false, false);
    }
}
