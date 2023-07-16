package X;

import com.facebook.AccessToken;
import com.instagram.service.session.UserSession;
import java.util.Collection;
import java.util.Date;

/* renamed from: X.2JG  reason: invalid class name */
public final class AnonymousClass2JG {
    public static final Object A00(AnonymousClass601 r19, C63893iY r20) {
        AnonymousClass601 r5 = r19;
        C63893iY r2 = r20;
        boolean A1Z = AnonymousClass0wJ.A1Z(r2, r5);
        Object A0B = C63893iY.A0B(r2, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A0B;
        String str2 = (String) C63893iY.A0C(r2, "null cannot be cast to non-null type kotlin.String", A1Z ? 1 : 0);
        String str3 = (String) C63893iY.A0C(r2, "null cannot be cast to non-null type kotlin.String", 2);
        C10300i6 A0F = C63913ic.A0F(r5);
        C04220Ms.A0C(A0F, "null cannot be cast to non-null type com.instagram.service.session.UserSession");
        UserSession userSession = (UserSession) A0F;
        if (C18180wK.A1W(str.length())) {
            C67303zK.A04((AnonymousClass18S) null, (AnonymousClass18T) null, userSession, (String) null);
        } else {
            C67303zK.A04((AnonymousClass18S) null, new AnonymousClass18T((Integer) null, (Integer) null, str, str2, A1Z), userSession, "relink");
        }
        if (str3.length() == 0) {
            AnonymousClass3z4.A00(new AnonymousClass3z4(userSession), 4, false, A1Z);
        } else {
            C67363zQ.A0A(new AccessToken(AnonymousClass006.A1C, str3, C60943Re.A02, str, C29771zH.A02.A00, (Collection) null, (Date) null, new Date()), A0F, false);
            C10300i6 A0F2 = C63913ic.A0F(r5);
            C04220Ms.A0C(A0F2, "null cannot be cast to non-null type com.instagram.service.session.UserSession");
            UserSession userSession2 = (UserSession) A0F2;
            if ("".length() == 0) {
                C60333Op.A00(userSession2).A02((Boolean) null, "bloks", false, A1Z);
            } else {
                C60333Op.A00(userSession2).A01((Boolean) null, "", "", "", "bloks", false, A1Z);
            }
            AnonymousClass3WS.A01(userSession2).A0L(userSession2, A1Z);
        }
        AnonymousClass3LY.A00(userSession).CWx(new AnonymousClass463());
        return null;
    }
}
