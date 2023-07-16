package X;

import java.util.Map;

/* renamed from: X.5Hg  reason: invalid class name */
public final class AnonymousClass5Hg extends AnonymousClass0Sf {
    public final C970867w A00;
    public final C970867w A01;
    public final C304621k A02;
    public final String A03;
    public final Map A04;
    public final AnonymousClass8s2 A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Hg) {
                AnonymousClass5Hg r5 = (AnonymousClass5Hg) obj;
                if (!(C04220Ms.A0I(this.A05, r5.A05) && C04220Ms.A0I(this.A03, r5.A03) && this.A06 == r5.A06 && this.A07 == r5.A07 && this.A02 == r5.A02 && C04220Ms.A0I(this.A04, r5.A04) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A03, C18210wN.A04(this.A05));
        boolean z = this.A06;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A072 + (z ? 1 : 0)) * 31;
        if (!this.A07) {
            i = 0;
        }
        return C18220wO.A06(this.A00, AnonymousClass0wJ.A05(this.A01, AnonymousClass0wJ.A05(this.A04, AnonymousClass0wJ.A05(this.A02, (i2 + i) * 31))));
    }

    public AnonymousClass5Hg(C970867w r2, C970867w r3, C304621k r4, String str, Map map, AnonymousClass8s2 r7, boolean z, boolean z2) {
        AnonymousClass0wJ.A1O(r7, str);
        C86104wH.A1P(r4, 5, r2);
        C04220Ms.A0B(r3, 8);
        this.A05 = r7;
        this.A03 = str;
        this.A06 = z;
        this.A07 = z2;
        this.A02 = r4;
        this.A04 = map;
        this.A01 = r2;
        this.A00 = r3;
    }
}
