package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2Ir  reason: invalid class name and case insensitive filesystem */
public final class C34212Ir {
    public static final Object A00(AnonymousClass601 r5, C63893iY r6) {
        UserSession userSession;
        boolean A1Z = AnonymousClass0wJ.A1Z(r6, r5);
        String A0D = C63893iY.A0D(r6, 0);
        int A04 = AnonymousClass0wJ.A04(C63893iY.A0A(r6, A1Z ? 1 : 0));
        C10300i6 A0F = C63913ic.A0F(r5);
        if (!(A0F instanceof UserSession) || (userSession = (UserSession) A0F) == null) {
            throw C18190wL.A0a("User session must not be null to access local device cache");
        }
        AnonymousClass0wJ.A11(C696949q.A00(AnonymousClass3Zs.A03(userSession), D2R.A2Z), A0D, A04);
        return null;
    }
}
