package X;

import com.instagram.common.api.base.IDxACallbackShape36S0200000_2_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6Vc  reason: invalid class name and case insensitive filesystem */
public final class C102416Vc {
    public static final void A00(UserSession userSession, String str) {
        User A0Y;
        C04220Ms.A0B(userSession, 0);
        C25550Dnj A00 = AnonymousClass6VR.A00(userSession);
        if (str != null) {
            A0Y = A00.A03(str);
        } else {
            A0Y = AnonymousClass0wJ.A0Y(userSession);
        }
        if (A0Y != null) {
            C32165H8c A002 = C102406Vb.A00(userSession);
            A002.A00 = new IDxACallbackShape36S0200000_2_I2(13, A0Y, A00);
            C31155GhB.A03(A002);
        }
    }
}
