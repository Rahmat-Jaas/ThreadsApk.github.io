package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Mq  reason: invalid class name and case insensitive filesystem */
public final class C59843Mq {
    public static boolean A01(UserSession userSession, String str) {
        C04620Ok r1 = C06810aP.A01;
        if (!C18200wM.A1X(userSession, r1) || str == null || !str.equals(C18240wQ.A0e(userSession, r1)) || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36314000027289359L)) {
            return false;
        }
        return true;
    }

    public static boolean A00(CallerContext callerContext, UserSession userSession, String str) {
        if (!C35692Ol.A00(userSession).A05(callerContext, "ig_android_linking_cache_crowdsourcing") || A01(userSession, str) || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36315314287282692L)) {
            return false;
        }
        return true;
    }
}
