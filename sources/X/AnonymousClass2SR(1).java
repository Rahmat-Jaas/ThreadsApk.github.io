package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.instagram.common.api.base.IDxACallbackShape5S0400000_1_I2;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape32S0200000_I2_16;
import kotlin.jvm.internal.KtLambdaShape94S0100000_I2_74;

/* renamed from: X.2SR  reason: invalid class name */
public final class AnonymousClass2SR {
    public static final void A00(Fragment fragment, BKU bku, UserSession userSession) {
        AnonymousClass0wJ.A1N(fragment, userSession);
        C04220Ms.A0B(bku, 2);
        bku.A0f.A6Q = C18180wK.A0n(AnonymousClass0wJ.A0d(userSession.getUserId()));
        bku.AAy(userSession);
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        C18200wM.A1N(A0O, "users/pin_timeline_media/");
        A0O.A0O("post_id", bku.A0N);
        C32165H8c A0T = C18200wM.A0T(A0O, "profile_tab", "clips");
        KtLambdaShape94S0100000_I2_74 ktLambdaShape94S0100000_I2_74 = new KtLambdaShape94S0100000_I2_74(userSession, 45);
        KtLambdaShape32S0200000_I2_16 ktLambdaShape32S0200000_I2_16 = new KtLambdaShape32S0200000_I2_16(39, bku, userSession);
        C04220Ms.A0B(ktLambdaShape32S0200000_I2_16, 6);
        C18330wh A01 = C18330wh.A01(fragment);
        LifecycleCoroutineScopeImpl A00 = AnonymousClass3J3.A00(fragment.getLifecycle());
        C18330wh.A03(fragment, A01, 2131832567);
        A0T.A00 = new IDxACallbackShape5S0400000_1_I2(11, A01, A00, ktLambdaShape32S0200000_I2_16, ktLambdaShape94S0100000_I2_74);
        C31155GhB.A03(A0T);
    }
}
