package X;

import android.content.Context;
import com.instagram.common.api.base.IDxACallbackShape6S0400000_3_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.6So  reason: invalid class name and case insensitive filesystem */
public abstract class C101776So {
    public static void A00(Context context, AnonymousClass06E r9, BKU bku, C161229dN r11, UserSession userSession, String str) {
        C18330wh r7 = new C18330wh(context);
        r7.A04(context.getResources().getString(2131828213));
        String str2 = bku.A0f.A4Y.split("_")[0];
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J(C18180wK.A0j("guides/guide/%s/delete_media/", new Object[]{str}));
        C32165H8c A0T = C86104wH.A0T(A0N, "media_id", str2);
        A0T.A00 = new IDxACallbackShape6S0400000_3_I2(2, context, bku, r11, r7);
        C31155GhB.A01(context, r9, A0T);
    }
}
