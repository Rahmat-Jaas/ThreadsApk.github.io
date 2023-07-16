package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.fanclub.impl.FanClubFragmentFactoryImpl$newFanClubFanOnboardingWelcomeFragment$1;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Hg  reason: invalid class name and case insensitive filesystem */
public final class C58783Hg {
    public final Fragment A00(Context context, UserSession userSession, String str) {
        C04220Ms.A0B(userSession, 1);
        C63743iE A02 = C63743iE.A02("com.instagram.user_pay.fan_club.screens.creator_onboarding.creator_side_subscription_settings", C63203gz.A03("tooltip", str));
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        C18210wN.A0s(context, A0N, 2131837639);
        return C62853b1.A02(A0N, A02);
    }

    public final Fragment A01(Bundle bundle, UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        C63743iE A02 = C63743iE.A02("com.instagram.user_pay.fan_club.screens.fan_onboarding_welcome", AnonymousClass4WJ.A09(C18180wK.A0p("creator_user_id", bundle.getString("creator_user_id")), C18180wK.A0p("origin", bundle.getString("origin")), C18180wK.A0p("is_bottom_sheet", bundle.getString("is_bottom_sheet")), C18180wK.A0p("show_only_done_cta", bundle.getString("show_only_done_cta"))));
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        A0N.A04 = new FanClubFragmentFactoryImpl$newFanClubFanOnboardingWelcomeFragment$1();
        return C62853b1.A02(A0N, A02);
    }

    public final Fragment A02(String str) {
        C27061rs r1 = new C27061rs();
        r1.setArguments(C18180wK.A09("ARGUMENT_ENTRY_POINT", str));
        return r1;
    }
}
