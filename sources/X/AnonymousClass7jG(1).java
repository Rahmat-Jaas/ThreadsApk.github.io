package X;

import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.ECPOnsiteOffer;
import com.facebookpay.incentives.model.IncentiveCredentialList;
import java.util.Collection;

/* renamed from: X.7jG  reason: invalid class name */
public final class AnonymousClass7jG implements C145318kI {
    public static final AnonymousClass7jG A00 = new AnonymousClass7jG();

    public final void A8v(ECPIncentive eCPIncentive, AnonymousClass588 r7) {
        Collection collection;
        C108806iy r0;
        IncentiveCredentialList incentiveCredentialList;
        C04220Ms.A0B(eCPIncentive, 1);
        if (eCPIncentive instanceof ECPOnsiteOffer) {
            C880856r r4 = r7.A07;
            AnonymousClass7Kx A0R = C86104wH.A0R(r4);
            if (A0R == null || (r0 = (C108806iy) A0R.A01) == null || (incentiveCredentialList = (IncentiveCredentialList) r0.A01) == null) {
                collection = AnonymousClass0ZV.A00;
            } else {
                collection = incentiveCredentialList.A00;
            }
            AnonymousClass7Kx.A0I(r4, new C108806iy(AnonymousClass006.A01, new IncentiveCredentialList(AnonymousClass00J.A0X(((ECPOnsiteOffer) eCPIncentive).A01, collection)), (String) null));
        }
    }

    public final void Cbm(ECPIncentive eCPIncentive, AnonymousClass588 r7) {
        Iterable iterable;
        C108806iy r0;
        IncentiveCredentialList incentiveCredentialList;
        if (eCPIncentive instanceof ECPOnsiteOffer) {
            C880856r r4 = r7.A07;
            AnonymousClass7Kx A0R = C86104wH.A0R(r4);
            if (A0R == null || (r0 = (C108806iy) A0R.A01) == null || (incentiveCredentialList = (IncentiveCredentialList) r0.A01) == null) {
                iterable = AnonymousClass0ZV.A00;
            } else {
                iterable = incentiveCredentialList.A00;
            }
            AnonymousClass7Kx.A0I(r4, new C108806iy(AnonymousClass006.A01, new IncentiveCredentialList(AnonymousClass00J.A0U(iterable, ((ECPOnsiteOffer) eCPIncentive).A01)), (String) null));
        }
    }
}
