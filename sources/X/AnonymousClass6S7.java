package X;

import android.content.Context;
import com.instagram.common.api.base.IDxACallbackShape16S0300000_2_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.6S7  reason: invalid class name */
public final class AnonymousClass6S7 {
    public static void A00(Context context, BKU bku, UserSession userSession) {
        bku.A3o(false);
        bku.AAy(userSession);
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0T("media/%s/enable_comments/", bku.A0f.A4Y);
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0N, C85814vo.class, AnonymousClass3Za.class);
        A0T.A00 = new IDxACallbackShape16S0300000_2_I2(5, context, bku, userSession);
        C31155GhB.A03(A0T);
    }
}
