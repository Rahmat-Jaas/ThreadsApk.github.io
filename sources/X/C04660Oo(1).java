package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.0Oo  reason: invalid class name and case insensitive filesystem */
public final class C04660Oo {
    public static final User A00(C10300i6 r1) {
        C04220Ms.A0B(r1, 0);
        if (r1 instanceof UserSession) {
            return C06810aP.A01.A01((UserSession) r1);
        }
        return null;
    }

    public static final AnonymousClass266 A01(C10300i6 r1) {
        AnonymousClass266 A0g;
        C04220Ms.A0B(r1, 0);
        User A00 = A00(r1);
        if (A00 == null || (A0g = A00.A0g()) == null) {
            return AnonymousClass266.A07;
        }
        return A0g;
    }

    public static final String A02(C10300i6 r1) {
        AnonymousClass266 A0g;
        String obj;
        C04220Ms.A0B(r1, 0);
        User A00 = A00(r1);
        if (A00 == null || (A0g = A00.A0g()) == null || (obj = A0g.toString()) == null) {
            return "";
        }
        return obj;
    }
}
