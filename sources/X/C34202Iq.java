package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2Iq  reason: invalid class name and case insensitive filesystem */
public final class C34202Iq {
    public static final Object A00(AnonymousClass601 r5, C63893iY r6) {
        UserSession userSession;
        boolean A1Z = AnonymousClass0wJ.A1Z(r6, r5);
        String A0D = C63893iY.A0D(r6, 0);
        float A00 = C18240wQ.A00(C63893iY.A0A(r6, A1Z ? 1 : 0));
        C10300i6 A0F = C63913ic.A0F(r5);
        if (!(A0F instanceof UserSession) || (userSession = (UserSession) A0F) == null) {
            throw C18190wL.A0a("User session must not be null to access local device cache");
        }
        C696949q.A00(AnonymousClass3Zs.A03(userSession), D2R.A2Z).putFloat(A0D, A00).apply();
        return null;
    }
}
