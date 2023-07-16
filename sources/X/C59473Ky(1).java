package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3Ky  reason: invalid class name and case insensitive filesystem */
public final class C59473Ky {
    public static final boolean A00(UserSession userSession) {
        User A0Y = AnonymousClass0wJ.A0Y(userSession);
        MonetizationRepository A00 = AnonymousClass2RN.A00(userSession);
        Boolean AW5 = A0Y.A05.AW5();
        if ((AW5 == null || !AW5.booleanValue()) && !A00.A04(UserMonetizationProductType.BRANDED_CONTENT_DEAL_BRAND)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        User A0Y = AnonymousClass0wJ.A0Y(userSession);
        MonetizationRepository A00 = AnonymousClass2RN.A00(userSession);
        if (A0Y.A2q() || A00.A04(UserMonetizationProductType.BRANDED_CONTENT_DEAL_CREATOR)) {
            return true;
        }
        return false;
    }
}
