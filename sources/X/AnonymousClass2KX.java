package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.2KX  reason: invalid class name */
public final class AnonymousClass2KX {
    public static void A00(Context context, C84284st r8, C145538kf r9, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        C18220wO.A1J(A0N, "accounts/switch_business_page/");
        A0N.A0O("page_id", str);
        A0N.A0O("fb_auth_token", str3);
        A0N.A0O("entry_point", str4);
        C32165H8c A0T = C18200wM.A0T(A0N, "flow_name", str5);
        A0T.A00 = new AnonymousClass1iJ(context, r8, userSession, str2, str);
        r9.schedule(A0T);
    }
}
