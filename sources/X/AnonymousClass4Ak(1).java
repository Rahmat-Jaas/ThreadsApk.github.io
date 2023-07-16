package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ak  reason: invalid class name */
public final class AnonymousClass4Ak implements C27896Ev7 {
    public final void Bp8(FragmentActivity fragmentActivity, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        AnonymousClass3Ze.A01(C319329n.MONETIZATION, C319529p.CREATOR_MARKETPLACE_ROW, userSession);
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, userSession);
        AnonymousClass2MG.A00();
        C57953De r2 = new C57953De();
        ValuePropsFlow valuePropsFlow = ValuePropsFlow.CREATOR_MARKETPLACE;
        C04220Ms.A0B(valuePropsFlow, 0);
        A0Q.A03 = r2.A00(valuePropsFlow.A00, (String) null);
        A0Q.A05();
    }

    public final int Ae9() {
        return R.drawable.instagram_tag_down_pano_outline_24;
    }

    public final int BH9() {
        return 2131830677;
    }
}
