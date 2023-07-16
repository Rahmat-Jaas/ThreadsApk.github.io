package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.46m  reason: invalid class name and case insensitive filesystem */
public final class C690346m implements C82394pY {
    public final UserSession A00;

    public C690346m(UserSession userSession) {
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C14030oh.A03(986705841);
        AnonymousClass45Q r8 = (AnonymousClass45Q) obj;
        int A032 = C14030oh.A03(-247130934);
        if (C63173fJ.A05(AnonymousClass0TJ.A05, 18299756136630082L)) {
            UserSession userSession = this.A00;
            String str = r8.A02;
            String str2 = r8.A01;
            H1T A0N = AnonymousClass0wJ.A0N(userSession);
            A0N.A0J("safetynet/put_safetynet_response/");
            A0N.A0O("sn_result", str);
            A0N.A0O("sn_nonce", str2);
            C31155GhB.A05(AnonymousClass0wJ.A0S(A0N), 240, 3, true, false);
        }
        C14030oh.A0A(-1942894730, A032);
        C14030oh.A0A(-200848377, A03);
    }
}
