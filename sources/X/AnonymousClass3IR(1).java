package X;

import android.app.Activity;
import com.instagram.common.api.base.IDxACallbackShape2S1200000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112;

/* renamed from: X.3IR  reason: invalid class name */
public final class AnonymousClass3IR {
    public static AnonymousClass3IR A00;

    public final void A00(Activity activity, UserSession userSession, String str, Map map) {
        C04220Ms.A0B(userSession, 0);
        ((AnonymousClass44W) userSession.A01(AnonymousClass44W.class, new KtLambdaShape132S0100000_I2_112(userSession, 23))).A01(activity, str, map, false);
    }

    public final void A01(Activity activity, UserSession userSession, String str, Map map) {
        C04220Ms.A0B(userSession, 0);
        ((AnonymousClass44W) userSession.A01(AnonymousClass44W.class, new KtLambdaShape132S0100000_I2_112(userSession, 23))).A01(activity, str, map, true);
    }

    public final void A02(UserSession userSession, Activity activity, String str) {
        A00(activity, userSession, str, (Map) null);
    }

    public final void A03(UserSession userSession, Activity activity, String str) {
        IDxACallbackShape2S1200000_1_I2 iDxACallbackShape2S1200000_1_I2 = new IDxACallbackShape2S1200000_1_I2(userSession, activity, str, 9);
        C32165H8c A0U = C18200wM.A0U(userSession, new C26301qN(C18180wK.A0j("{\"%s\":\"%s\"}", new Object[]{"0", str})));
        A0U.A00 = iDxACallbackShape2S1200000_1_I2;
        C31155GhB.A05(A0U, 221, 3, false, false);
    }
}
