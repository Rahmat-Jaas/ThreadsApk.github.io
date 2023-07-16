package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ao  reason: invalid class name and case insensitive filesystem */
public final class C69814Ao implements C27896Ev7 {
    public final void Bp8(FragmentActivity fragmentActivity, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        AnonymousClass3Ze.A01(C319329n.MONETIZATION, C319529p.PROFILE_FEED_ADS_ROW_ELIGIBLE, userSession);
        AnonymousClass0wJ.A19(AnonymousClass2S8.A00().A00().A00(IGRevShareProductType.PROFILE_ADS, "PRO_HOME", (String) null), fragmentActivity, userSession);
    }

    public final int Ae9() {
        return R.drawable.instagram_circle_dollar_pano_outline_24;
    }

    public final int BH9() {
        return 2131830684;
    }
}
