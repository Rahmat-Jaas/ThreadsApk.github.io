package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Aq  reason: invalid class name and case insensitive filesystem */
public final class C69834Aq implements C27896Ev7 {
    public final boolean A00;

    public final void Bp8(FragmentActivity fragmentActivity, UserSession userSession) {
        C25786Drz A0Q;
        Fragment A002;
        C04220Ms.A0B(userSession, 1);
        boolean z = this.A00;
        C319329n r1 = C319329n.MONETIZATION;
        if (z) {
            AnonymousClass3Ze.A01(r1, C319529p.SUBSCRIPTIONS_ROW_ELIGIBLE, userSession);
            A002 = AnonymousClass3WJ.A00().A02("PRO_HOME");
            A0Q = C18180wK.A0Q(fragmentActivity, userSession);
        } else {
            AnonymousClass3Ze.A01(r1, C319529p.SUBSCRIPTIONS_ROW, userSession);
            A0Q = C18180wK.A0Q(fragmentActivity, userSession);
            AnonymousClass2MG.A00();
            C57953De r2 = new C57953De();
            ValuePropsFlow valuePropsFlow = ValuePropsFlow.SUBSCRIPTION;
            C04220Ms.A0B(valuePropsFlow, 0);
            A002 = r2.A00(valuePropsFlow.A00, (String) null);
        }
        A0Q.A03 = A002;
        A0Q.A05();
    }

    public C69834Aq(boolean z) {
        this.A00 = z;
    }

    public final int Ae9() {
        return R.drawable.instagram_crown_pano_outline_24;
    }

    public final int BH9() {
        return 2131830686;
    }
}
