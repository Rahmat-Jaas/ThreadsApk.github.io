package X;

import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.5Hb  reason: invalid class name */
public final class AnonymousClass5Hb extends AnonymousClass0Sf {
    public final IGTVAccountLevelMonetizationToggleSetting A00;
    public final MonetizationEligibilityDecision A01;
    public final MonetizationEligibilityDecision A02;
    public final UserMonetizationProductType A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public AnonymousClass5Hb(IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting, MonetizationEligibilityDecision monetizationEligibilityDecision, MonetizationEligibilityDecision monetizationEligibilityDecision2, UserMonetizationProductType userMonetizationProductType, boolean z, boolean z2, boolean z3) {
        C18190wL.A1S(monetizationEligibilityDecision, 2, monetizationEligibilityDecision2);
        C04220Ms.A0B(userMonetizationProductType, 6);
        this.A04 = z;
        this.A01 = monetizationEligibilityDecision;
        this.A05 = z2;
        this.A00 = iGTVAccountLevelMonetizationToggleSetting;
        this.A02 = monetizationEligibilityDecision2;
        this.A03 = userMonetizationProductType;
        this.A06 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Hb) {
                AnonymousClass5Hb r5 = (AnonymousClass5Hb) obj;
                if (!(this.A04 == r5.A04 && this.A01 == r5.A01 && this.A05 == r5.A05 && this.A00 == r5.A00 && this.A02 == r5.A02 && this.A03 == r5.A03 && this.A06 == r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A04;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        int A052 = AnonymousClass0wJ.A05(this.A03, AnonymousClass0wJ.A05(this.A02, (((AnonymousClass0wJ.A05(this.A01, i2) + (C86164wN.A1S(this.A05) ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31));
        if (!this.A06) {
            i = 0;
        }
        return A052 + i;
    }
}
