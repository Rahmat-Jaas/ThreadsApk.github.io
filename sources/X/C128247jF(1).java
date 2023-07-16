package X;

import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.ECPOffsiteOffer;
import java.util.Collection;

/* renamed from: X.7jF  reason: invalid class name and case insensitive filesystem */
public final class C128247jF implements C145318kI {
    public static final C128247jF A00 = new C128247jF();

    public final void A8v(ECPIncentive eCPIncentive, AnonymousClass588 r7) {
        Collection collection;
        C108806iy r0;
        PromoCodeList promoCodeList;
        C04220Ms.A0B(eCPIncentive, 1);
        if (eCPIncentive instanceof ECPOffsiteOffer) {
            C880856r r4 = r7.A08;
            AnonymousClass7Kx A0R = C86104wH.A0R(r4);
            if (A0R == null || (r0 = (C108806iy) A0R.A01) == null || (promoCodeList = (PromoCodeList) r0.A01) == null) {
                collection = AnonymousClass0ZV.A00;
            } else {
                collection = promoCodeList.A00;
            }
            AnonymousClass7Kx.A0I(r4, new C108806iy(AnonymousClass006.A01, new PromoCodeList(AnonymousClass00J.A0X(eCPIncentive.getId(), collection)), (String) null));
        }
    }

    public final void Cbm(ECPIncentive eCPIncentive, AnonymousClass588 r7) {
        Iterable iterable;
        C108806iy r0;
        PromoCodeList promoCodeList;
        if (eCPIncentive instanceof ECPOffsiteOffer) {
            C880856r r4 = r7.A08;
            AnonymousClass7Kx A0R = C86104wH.A0R(r4);
            if (A0R == null || (r0 = (C108806iy) A0R.A01) == null || (promoCodeList = (PromoCodeList) r0.A01) == null) {
                iterable = AnonymousClass0ZV.A00;
            } else {
                iterable = promoCodeList.A00;
            }
            AnonymousClass7Kx.A0I(r4, new C108806iy(AnonymousClass006.A01, new PromoCodeList(AnonymousClass00J.A0U(iterable, eCPIncentive.getId())), (String) null));
        }
    }
}
