package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.100  reason: invalid class name */
public final class AnonymousClass100 extends C62793ak {
    public final int A00;
    public final UserMonetizationProductType A01;
    public final String A02;
    public final C86094wG A03;
    public final C86074wE A04;

    public AnonymousClass100(UserMonetizationProductType userMonetizationProductType, String str) {
        Object value;
        C208616k r0;
        this.A01 = userMonetizationProductType;
        this.A02 = str;
        this.A00 = userMonetizationProductType == UserMonetizationProductType.REVSHARE ? 2131828569 : 2131828534;
        C27457Enn A0z = C18190wL.A0z(new C208616k(false, false, 2131832137));
        this.A04 = A0z;
        this.A03 = C18230wP.A0x((C148838sG) null, A0z);
        do {
            value = A0z.getValue();
            if (C04220Ms.A0I(MonetizationEligibilityDecision.ELIGIBLE.A00, this.A02) || C04220Ms.A0I(MonetizationEligibilityDecision.AT_RISK_OF_BECOMING_INELIGIBLE.A00, this.A02)) {
                r0 = new C208616k(true, false, 2131832136);
            } else {
                r0 = new C208616k(false, true, 2131832137);
            }
        } while (!A0z.ADi(value, r0));
    }
}
