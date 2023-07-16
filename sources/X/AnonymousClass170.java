package X;

import com.instagram.api.schemas.RankingAlgorithm;
import java.util.List;

/* renamed from: X.170  reason: invalid class name */
public final class AnonymousClass170 extends AnonymousClass0Sf {
    public final RankingAlgorithm A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final List A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass170) {
                AnonymousClass170 r5 = (AnonymousClass170) obj;
                if (!C04220Ms.A0I(this.A08, r5.A08) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A09, r5.A09) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A04, r5.A04) || this.A00 != r5.A00 || !C04220Ms.A0I(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((AnonymousClass0wJ.A03(this.A08) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A09)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A07(this.A05);
    }

    public AnonymousClass170(RankingAlgorithm rankingAlgorithm, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, List list, List list2) {
        this.A08 = list;
        this.A01 = bool;
        this.A06 = str;
        this.A02 = bool2;
        this.A09 = list2;
        this.A03 = bool3;
        this.A07 = str2;
        this.A04 = bool4;
        this.A00 = rankingAlgorithm;
        this.A05 = bool5;
    }
}
