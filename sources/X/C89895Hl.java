package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0111000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2;
import com.instagram.api.schemas.CanUseCreatorMonetizationProduct;
import com.instagram.api.schemas.HasOnboardedCreatorMonetizationProduct;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.5Hl  reason: invalid class name and case insensitive filesystem */
public final class C89895Hl extends AnonymousClass0Sf {
    public final KtCSuperShape0S0100000_I2 A00;
    public final KtCSuperShape0S0110000_I2 A01;
    public final KtCSuperShape0S0111000_I2 A02;
    public final KtCSuperShape0S0400000_I2 A03;
    public final KtCSuperShape0S0400000_I2 A04;
    public final CanUseCreatorMonetizationProduct A05;
    public final HasOnboardedCreatorMonetizationProduct A06;
    public final MonetizationEligibilityDecision A07;
    public final UserMonetizationProductType A08;
    public final boolean A09;
    public final boolean A0A;

    public C89895Hl(KtCSuperShape0S0100000_I2 ktCSuperShape0S0100000_I2, KtCSuperShape0S0110000_I2 ktCSuperShape0S0110000_I2, KtCSuperShape0S0111000_I2 ktCSuperShape0S0111000_I2, KtCSuperShape0S0400000_I2 ktCSuperShape0S0400000_I2, KtCSuperShape0S0400000_I2 ktCSuperShape0S0400000_I22, CanUseCreatorMonetizationProduct canUseCreatorMonetizationProduct, HasOnboardedCreatorMonetizationProduct hasOnboardedCreatorMonetizationProduct, MonetizationEligibilityDecision monetizationEligibilityDecision, UserMonetizationProductType userMonetizationProductType, boolean z, boolean z2) {
        C18180wK.A1Q(canUseCreatorMonetizationProduct, 2, hasOnboardedCreatorMonetizationProduct);
        C04220Ms.A0B(userMonetizationProductType, 9);
        this.A03 = ktCSuperShape0S0400000_I2;
        this.A05 = canUseCreatorMonetizationProduct;
        this.A01 = ktCSuperShape0S0110000_I2;
        this.A06 = hasOnboardedCreatorMonetizationProduct;
        this.A09 = z;
        this.A07 = monetizationEligibilityDecision;
        this.A02 = ktCSuperShape0S0111000_I2;
        this.A00 = ktCSuperShape0S0100000_I2;
        this.A08 = userMonetizationProductType;
        this.A04 = ktCSuperShape0S0400000_I22;
        this.A0A = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89895Hl) {
                C89895Hl r5 = (C89895Hl) obj;
                if (!(C04220Ms.A0I(this.A03, r5.A03) && this.A05 == r5.A05 && C04220Ms.A0I(this.A01, r5.A01) && this.A06 == r5.A06 && this.A09 == r5.A09 && this.A07 == r5.A07 && C04220Ms.A0I(this.A02, r5.A02) && C04220Ms.A0I(this.A00, r5.A00) && this.A08 == r5.A08 && C04220Ms.A0I(this.A04, r5.A04) && this.A0A == r5.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A032 = AnonymousClass0wJ.A03(this.A03) * 31;
        int A052 = AnonymousClass0wJ.A05(this.A06, (AnonymousClass0wJ.A05(this.A05, A032) + AnonymousClass0wJ.A03(this.A01)) * 31);
        boolean z = this.A09;
        int i = 1;
        if (z) {
            z = true;
        }
        int A053 = (AnonymousClass0wJ.A05(this.A08, (((((((A052 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A07(this.A04)) * 31;
        if (!this.A0A) {
            i = 0;
        }
        return A053 + i;
    }
}
