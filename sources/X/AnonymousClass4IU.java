package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4IU  reason: invalid class name */
public final class AnonymousClass4IU implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C04220Ms.A0B(uri, 0);
        AnonymousClass268 r1 = AnonymousClass268.A0K;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (r1.A02(obj)) {
            Fragment fragment = this.A00;
            AnonymousClass01V.A0p.markerStart(190461770);
            Context requireContext = fragment.requireContext();
            C37010Jil jil = new C37010Jil((C30087FzX) null);
            userSession.A01(C58303Ew.class, C75804cq.A00);
            if (!AnonymousClass3WI.A02(userSession) || !C35402Nh.A00(userSession).booleanValue()) {
                H1T A0O = AnonymousClass0wJ.A0O(userSession);
                A0O.A0J("accounts/set_hide_message_requests_global/");
                A0O.A0C(C85814vo.class, AnonymousClass3Za.class, true);
                A0O.A0K("config_value", 1);
                A0O.A0K("spam_scam_consent", 0);
                A0O.A0O("entry_point", "direct-hidden-words-adoption-qp");
                C32165H8c A0Q = C18190wL.A0Q(A0O);
                C63873iU.A0F(A0Q, requireContext, userSession, 19);
                C31155GhB.A01(requireContext, AnonymousClass06E.A00(fragment), A0Q);
                return;
            }
            AnonymousClass3WI.A01(jil, userSession, new C70004Bv(requireContext, userSession), false);
            C18230wP.A1K(userSession, AnonymousClass0wJ.A0Y(userSession), false);
        }
    }

    public AnonymousClass4IU(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
