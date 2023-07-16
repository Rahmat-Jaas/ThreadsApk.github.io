package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.16v  reason: invalid class name and case insensitive filesystem */
public final class C209516v extends AnonymousClass0Sf {
    public final int A00;
    public final int A01;
    public final AnonymousClass2OH A02;
    public final List A03;
    public final List A04;
    public final Map A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C209516v) {
                C209516v r5 = (C209516v) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || this.A01 != r5.A01 || this.A00 != r5.A00 || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A05, r5.A05) || this.A06 != r5.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052 = AnonymousClass0wJ.A05(this.A05, AnonymousClass0wJ.A05(this.A02, AnonymousClass0wJ.A05(this.A04, ((((AnonymousClass0wJ.A03(this.A03) * 31) + this.A01) * 31) + this.A00) * 31)));
        boolean z = this.A06;
        if (z) {
            z = true;
        }
        return A052 + (z ? 1 : 0);
    }

    public C209516v(AnonymousClass2OH r2, List list, List list2, Map map, int i, int i2, boolean z) {
        C18180wK.A1R(list2, r2);
        C04220Ms.A0B(map, 6);
        this.A03 = list;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = list2;
        this.A02 = r2;
        this.A05 = map;
        this.A06 = z;
    }
}
