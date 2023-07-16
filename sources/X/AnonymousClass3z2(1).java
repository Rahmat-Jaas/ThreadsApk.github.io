package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.service.session.UserSession;

/* renamed from: X.3z2  reason: invalid class name */
public final class AnonymousClass3z2 implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(AnonymousClass3z2.class);
    public static final String __redex_internal_original_name = "ReelFBShareUtil";

    public static C32165H8c A00(Context context, C11630kW r13, BKH bkh, C82954qY r15, UserSession userSession, Boolean bool, Integer num, String str) {
        String A33;
        int i;
        BKH bkh2 = bkh;
        BKU bku = bkh.A0M;
        if (bku == null) {
            A33 = "";
        } else {
            A33 = bku.A33();
        }
        if (bkh.A0H() == null) {
            i = -1;
        } else {
            i = bkh.A0H().A00;
        }
        UserSession userSession2 = userSession;
        String str2 = str;
        C62943bB.A01(r13, userSession2, str2, A33, "one_tap_share", i);
        AnonymousClass2SK.A00(userSession2, "request", "self_story", C25567Do3.A02(userSession2).A0K, str2);
        C32165H8c A002 = C60313On.A00(new ShareLaterMedia(bku), userSession2, num, str2, "story_viewer");
        A002.A00 = new C24181hc(context, r13, bkh2, r15, userSession2, str2, bool.booleanValue());
        return A002;
    }
}
