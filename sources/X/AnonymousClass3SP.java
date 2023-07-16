package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3SP  reason: invalid class name */
public final class AnonymousClass3SP {
    public final C24998Ddb A00;
    public final UserSession A01;

    public /* synthetic */ AnonymousClass3SP(UserSession userSession) {
        C24998Ddb A002 = AnonymousClass2SN.A00(userSession);
        C04220Ms.A0B(A002, 2);
        this.A01 = userSession;
        this.A00 = A002;
    }

    public static final Object A00(UserSession userSession, String str, String str2, C146958n9 r6) {
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        A0P.A0J("creatives/avatar_profile_pic/");
        A0P.A0B(AnonymousClass5tC.class, AnonymousClass3JX.class);
        if (str != null) {
            A0P.A0L("user_id", Long.parseLong(str));
        }
        if (str2 != null) {
            A0P.A0O("coin_flip_type", str2);
        }
        return C63623hv.A00(A0P.A02(), r6, 987414878, 0);
    }
}
