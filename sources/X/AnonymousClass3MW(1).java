package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCListenerShape9S0500000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0401000_I2_1;

/* renamed from: X.3MW  reason: invalid class name */
public final class AnonymousClass3MW {
    public static final void A00(Fragment fragment, C86 c86) {
        C04220Ms.A0B(c86, 1);
        AnonymousClass061 r3 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = fragment.getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape5S0401000_I2_1(r3, c86, viewLifecycleOwner, fragment, (C146958n9) null, 23), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public static final void A01(FragmentActivity fragmentActivity, C11630kW r11, UserSession userSession, User user) {
        int i;
        C11630kW r8 = r11;
        UserSession userSession2 = userSession;
        int A02 = C18200wM.A02(1, userSession, r11);
        C13330nS A01 = C13330nS.A01(r11, userSession);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A01, "subscription_content_public_preview_upsell_impression"), 2746);
        C18230wP.A1H(A0I, r11.getModuleName());
        User user2 = user;
        C18250wR.A0x(A0I, AnonymousClass0wJ.A0d(user.getId()));
        A0I.Bb4();
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C25828Dsm A0W = C18190wL.A0W(fragmentActivity);
        A0W.A0i(fragmentActivity.getDrawable(R.drawable.ig_illustrations_illo_exclusive_posts_refresh));
        A0W.A0L(2131827082);
        A0W.A0p(AnonymousClass0wJ.A0l(fragmentActivity, user.BK7(), 2131827081));
        if (C18250wR.A1J(userSession, user.getId())) {
            i = 2131826219;
        } else {
            A0W.A0P(new IDxCListenerShape9S0500000_1_I2(A02, fragmentActivity2, user2, A01, r8, userSession2), 2131827149);
            i = 2131831869;
        }
        A0W.A0N((DialogInterface.OnClickListener) null, i);
        AnonymousClass0wJ.A1K(A0W);
    }
}
