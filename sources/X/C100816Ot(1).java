package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.6Ot  reason: invalid class name and case insensitive filesystem */
public final class C100816Ot {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        AnonymousClass674 r1;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        Object A0B = C63893iY.A0B(r10, 0);
        A0B.getClass();
        String A0h = C86164wN.A0h(A0B);
        String str = (String) C63893iY.A0C(r10, A0h, A1Z ? 1 : 0);
        Object A0C = C63893iY.A0C(r10, A0h, 2);
        Object A0B2 = C63893iY.A0B(r10, 3);
        C10300i6 A0F = C63913ic.A0F(r9);
        if (!(A0F instanceof UserSession)) {
            return null;
        }
        UserSession userSession = (UserSession) A0F;
        C04220Ms.A0B(userSession, 0);
        C04220Ms.A0B(str, 2);
        C04220Ms.A0B(A0C, 3);
        if (!A0B.equals("media")) {
            return null;
        }
        C19462Awj A01 = C19462Awj.A01(userSession);
        C04220Ms.A06(A01);
        BKU A05 = A01.A05(str);
        if (A05 == null && (A05 = BKU.A0C(AnonymousClass00U.A0V("{\"id\": \"", str, "\"}"))) != null) {
            A01.A03(A05);
        }
        if (!A0C.equals("has_liked")) {
            return null;
        }
        C04220Ms.A0C(A0B2, "null cannot be cast to non-null type kotlin.Boolean");
        if (AnonymousClass0wJ.A1X(A0B2)) {
            r1 = AnonymousClass674.LIKED;
        } else {
            r1 = AnonymousClass674.NOT_LIKED;
        }
        if (A05 == null) {
            return null;
        }
        C17363A7f.A00(A05.A2C(), r1, A05, userSession);
        return null;
    }
}
