package X;

import java.util.List;

/* renamed from: X.5y3  reason: invalid class name */
public final class AnonymousClass5y3 extends C105796e0 {
    public final long A00;
    public final C25515Dn3 A01;
    public final Integer A02;
    public final String A03;
    public final List A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5y3(C25515Dn3 dn3, Integer num, String str, List list, long j, boolean z) {
        super(dn3);
        C04220Ms.A0B(dn3, 2);
        this.A03 = str;
        this.A01 = dn3;
        this.A04 = list;
        this.A00 = j;
        this.A05 = z;
        this.A02 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5y3) {
                AnonymousClass5y3 r8 = (AnonymousClass5y3) obj;
                if (!C04220Ms.A0I(this.A03, r8.A03) || !C04220Ms.A0I(this.A01, r8.A01) || !C04220Ms.A0I(this.A04, r8.A04) || this.A00 != r8.A00 || this.A05 != r8.A05 || !C04220Ms.A0I(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        int A06 = (C86104wH.A06(AnonymousClass0wJ.A05(this.A04, AnonymousClass0wJ.A05(this.A01, AnonymousClass0wJ.A06(this.A03) * 31)), this.A00) + 1) * 31;
        if (!this.A05) {
            i = 0;
        }
        return ((A06 + i) * 31) + C18200wM.A07(this.A02);
    }
}
