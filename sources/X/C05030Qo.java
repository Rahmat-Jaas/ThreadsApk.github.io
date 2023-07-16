package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.0Qo  reason: invalid class name and case insensitive filesystem */
public final class C05030Qo {
    public static final C07530bf A00(C10300i6 r1) {
        C04220Ms.A0B(r1, 0);
        if (r1 instanceof C07530bf) {
            return (C07530bf) r1;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final AnonymousClass0BO A01(C10300i6 r2) {
        C04220Ms.A0B(r2, 0);
        if (r2 instanceof UserSession) {
            return ((UserSession) r2).multipleAccountHelper;
        }
        if (r2 instanceof C07530bf) {
            return ((C07530bf) r2).A00;
        }
        StringBuilder sb = new StringBuilder("Cannot get AuthenticatedUserHelper from ");
        sb.append(r2);
        throw new IllegalStateException(sb.toString());
    }

    public static final UserSession A02(C10300i6 r1) {
        C04220Ms.A0B(r1, 0);
        if (r1 instanceof UserSession) {
            return (UserSession) r1;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final UserSession A03(C10300i6 r1) {
        C04220Ms.A0B(r1, 0);
        if (r1 instanceof UserSession) {
            return (UserSession) r1;
        }
        return null;
    }

    public static final String A04(C10300i6 r2) {
        UserSession userSession;
        if (!(r2 instanceof UserSession) || (userSession = (UserSession) r2) == null) {
            return null;
        }
        return userSession.getUserId();
    }
}
