package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Am  reason: invalid class name */
public final class AnonymousClass4Am implements C27896Ev7 {
    public final void Bp8(FragmentActivity fragmentActivity, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        AnonymousClass3Ze.A01(C319329n.MONETIZATION, C319529p.GIFTS_ROW_ELIGIBLE, userSession);
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, userSession);
        A0Q.A03 = AnonymousClass2FT.A00().A01().A00(userSession, "PRO_HOME", (String) null, (String) null, false);
        A0Q.A05();
    }

    public final int Ae9() {
        return R.drawable.instagram_gift_box_pano_outline_24;
    }

    public final int BH9() {
        return 2131830679;
    }
}
