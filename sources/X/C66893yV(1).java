package X;

import com.facebook.AccessToken;
import com.instagram.service.session.UserSession;

/* renamed from: X.3yV  reason: invalid class name and case insensitive filesystem */
public final class C66893yV implements C83984sK {
    public final /* synthetic */ AnonymousClass1aw A00;

    public C66893yV(AnonymousClass1aw r1) {
        this.A00 = r1;
    }

    public final void onCancel() {
        C54072yr.A00(this.A00.A05, (String) null, "change_password");
    }

    public final void onError(String str) {
        AnonymousClass1aw r3 = this.A00;
        C15730rn A0T = C18230wP.A0T("facebook_auth_error");
        A0T.A09("fb4a_installed", Boolean.valueOf(AnonymousClass0wJ.A1W(C63443hU.A00())));
        A0T.A0D("referrer", "change_password");
        if (str != null) {
            A0T.A0D("exception", str);
        }
        C18180wK.A1K(A0T, r3.A05);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass1aw r8 = this.A00;
        AccessToken accessToken = ((AnonymousClass39Q) obj).A00;
        UserSession userSession = r8.A05;
        C04220Ms.A0B(userSession, 0);
        C54102yu.A00(userSession, (C313625r) null, "change_password", (String) null);
        String str = accessToken.A02;
        C07530bf A05 = AnonymousClass0RA.A0C.A05(r8);
        C32165H8c A0C = C63883iV.A0C(r8.A05, str, (String) null);
        A0C.A00 = new C26711r5(r8.requireContext(), r8.A0F, r8.requireActivity(), r8.getParentFragmentManager(), accessToken, r8, A05, AnonymousClass0wJ.A0Y(r8.A05));
        r8.schedule(A0C);
    }
}
