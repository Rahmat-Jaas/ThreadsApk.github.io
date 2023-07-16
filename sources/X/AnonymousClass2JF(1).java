package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2JF  reason: invalid class name */
public final class AnonymousClass2JF {
    public static final Object A00(AnonymousClass601 r12, C63893iY r13) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r13, r12);
        Object A0B = C63893iY.A0B(r13, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A0B;
        String str2 = (String) C63893iY.A0C(r13, "null cannot be cast to non-null type kotlin.String", A1Z ? 1 : 0);
        String str3 = (String) C63893iY.A0C(r13, "null cannot be cast to non-null type kotlin.String", 2);
        C10300i6 A0F = C63913ic.A0F(r12);
        C18200wM.A1R(A0F);
        UserSession userSession = (UserSession) A0F;
        if (str.length() == 0) {
            C60333Op.A00(userSession).A02((Boolean) null, "bloks", false, A1Z);
        } else {
            C60333Op.A00(userSession).A01((Boolean) null, str, str2, str3, "bloks", false, A1Z);
        }
        AnonymousClass3WS.A01(userSession).A0L(userSession, A1Z);
        AnonymousClass3LY.A00(userSession).CWx(new AnonymousClass463());
        return null;
    }
}
