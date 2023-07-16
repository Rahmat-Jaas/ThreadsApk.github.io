package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Wb  reason: invalid class name and case insensitive filesystem */
public final class C61853Wb {
    public static final String A00(CallerContext callerContext, C10300i6 r2, String str) {
        AnonymousClass0wJ.A1M(r2, 0, callerContext);
        if (A02(r2)) {
            return null;
        }
        return C62963bD.A01(callerContext, r2, str);
    }

    public static final boolean A01(CallerContext callerContext, C10300i6 r3, String str) {
        AnonymousClass0wJ.A1M(r3, 0, callerContext);
        if (!A02(r3)) {
            return C62963bD.A03(callerContext, r3, str);
        }
        return false;
    }

    public static final boolean A02(C10300i6 r2) {
        if (C18210wN.A1S(36325617913832610L) && (r2 instanceof UserSession)) {
            UserSession userSession = (UserSession) r2;
            if (!C06810aP.A01.A01(userSession).A3D() || C49422rM.A00(userSession).A00) {
                return false;
            }
            return true;
        }
        return false;
    }
}
