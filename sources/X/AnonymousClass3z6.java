package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;

/* renamed from: X.3z6  reason: invalid class name */
public final class AnonymousClass3z6 implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(AnonymousClass3z6.class);
    public static final String __redex_internal_original_name = "ShareActivityUtil";

    public static final void A00(C84554tP r2, UserSession userSession, int i, int i2) {
        AnonymousClass2AI r1;
        C18180wK.A1P(userSession, 0, r2);
        if (i == 64206) {
            r1 = AnonymousClass2AI.A04;
        } else {
            r1 = null;
        }
        if (i2 == -1 && r1 != null && r1 != AnonymousClass2AI.A04 && !(!r1.A09(userSession))) {
            r1.A05(r2, true);
        }
    }

    public static final boolean A01(UserSession userSession) {
        C04620Ok A0V = C18240wQ.A0V(userSession);
        if (C18240wQ.A0e(userSession, A0V) == null) {
            return false;
        }
        if (!C35692Ol.A00(userSession).A05(A00, "ig_android_linking_cache_ig_to_fb_share_activity_authorization")) {
            return true;
        }
        if (C18240wQ.A0e(userSession, A0V) == null || C67373zR.A0D(userSession)) {
            return false;
        }
        return true;
    }
}
