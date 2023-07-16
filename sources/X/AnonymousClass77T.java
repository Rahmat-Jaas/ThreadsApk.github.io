package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.api.base.IDxACallbackShape36S0200000_2_I2;
import com.instagram.monetization.api.MonetizationApi;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.77T  reason: invalid class name */
public final class AnonymousClass77T {
    public final UserSession A00;

    public static final C32165H8c A00(AnonymousClass77T r3, List list, AnonymousClass0YY r5) {
        H1T A0P = AnonymousClass0wJ.A0P(r3.A00);
        A0P.A0J("business/eligibility/get_monetization_products_eligibility_data/");
        A0P.A0B(C93925ss.class, AnonymousClass71O.class);
        C32165H8c A0T = C18200wM.A0T(A0P, "product_types", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list));
        A0T.A00 = new IDxACallbackShape36S0200000_2_I2(9, r5, r3);
        return A0T;
    }

    public final void A01(UserMonetizationProductType userMonetizationProductType, AnonymousClass0YY r6) {
        C32165H8c A002;
        int ordinal = userMonetizationProductType.ordinal();
        if (ordinal == 10 || ordinal == 5 || ordinal == 15) {
            List A0n = C18180wK.A0n(userMonetizationProductType.A00);
            UserSession userSession = this.A00;
            new MonetizationApi(userSession);
            A002 = MonetizationApi.A00(userSession, A0n);
            A002.A00 = new IDxACallbackShape36S0200000_2_I2(10, r6, this);
        } else {
            A002 = A00(this, C18180wK.A0n(userMonetizationProductType.A00), r6);
        }
        C31155GhB.A03(A002);
    }

    public AnonymousClass77T(UserSession userSession) {
        this.A00 = userSession;
    }
}
