package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2Is  reason: invalid class name and case insensitive filesystem */
public final class C34222Is {
    public static final Object A00(AnonymousClass601 r5, C63893iY r6) {
        UserSession userSession;
        boolean A1Z = AnonymousClass0wJ.A1Z(r6, r5);
        Object A0B = C63893iY.A0B(r6, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A0B;
        String str2 = (String) C63893iY.A0C(r6, "null cannot be cast to non-null type kotlin.String", A1Z ? 1 : 0);
        C10300i6 A0F = C63913ic.A0F(r5);
        if (!(A0F instanceof UserSession) || (userSession = (UserSession) A0F) == null) {
            throw C18190wL.A0a("User session must not be null to access local device cache");
        }
        C18180wK.A0v(C696949q.A00(AnonymousClass3Zs.A03(userSession), D2R.A2Z), str, str2);
        return null;
    }
}
