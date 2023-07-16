package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2Ix  reason: invalid class name and case insensitive filesystem */
public final class C34272Ix {
    public static final Object A00(AnonymousClass601 r7, C63893iY r8) {
        UserSession userSession;
        boolean A1Z = AnonymousClass0wJ.A1Z(r8, r7);
        boolean A01 = AnonymousClass3WF.A01(r8, 0);
        C10300i6 A0F = C63913ic.A0F(r7);
        if (!(A0F instanceof UserSession) || (userSession = (UserSession) A0F) == null) {
            throw C18190wL.A0a("User session must not be null");
        }
        AnonymousClass3Zu.A03(userSession).A05(false);
        C695949f A00 = C49252r5.A00(userSession);
        if (A01) {
            A00.A04(A1Z);
        } else {
            A00.A04(false);
        }
        AnonymousClass3LY.A00(userSession).A04(new E6U(AnonymousClass006.A01, AnonymousClass006.A00, A01, false));
        return null;
    }
}
