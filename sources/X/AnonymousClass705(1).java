package X;

import android.content.Context;
import com.instagram.api.schemas.IGUserThirdPartyDownloads;
import com.instagram.common.api.base.IDxACallbackShape0S0310000_2_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.705  reason: invalid class name */
public final class AnonymousClass705 {
    public static final void A00(Context context, UserSession userSession, String str, boolean z) {
        AnonymousClass0wJ.A1O(userSession, str);
        User A0Y = AnonymousClass0wJ.A0Y(userSession);
        A0Y.A2f(z);
        A0Y.A1t(userSession);
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0B(C85814vo.class, AnonymousClass3Za.class);
        A0O.A0J("clips/user/set_third_party_downloads_enabled/");
        A0O.A0R(C18170wI.A00(107), z);
        C32165H8c A0T = C18200wM.A0T(A0O, "container_module", str);
        A0T.A00 = new IDxACallbackShape0S0310000_2_I2(0, context, userSession, A0Y, z);
        C31155GhB.A03(A0T);
    }

    public static final boolean A01(UserSession userSession) {
        if (C19573AyZ.A05(userSession) && AnonymousClass0wJ.A0Y(userSession).A0O() == IGUserThirdPartyDownloads.NOT_SET) {
            AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
            if (C63803iN.A0E(r2, userSession, 36324694496387708L) || !C63803iN.A0E(r2, userSession, 36324694495994486L)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
