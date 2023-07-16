package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3yj  reason: invalid class name and case insensitive filesystem */
public final class C67013yj implements CallerContextable {
    public static final String __redex_internal_original_name = "RecommendedUserApi";

    public static final C32165H8c A00(UserSession userSession, Integer num, String str) {
        String str2;
        AnonymousClass0wJ.A1N(userSession, str);
        if (C04220Ms.A0I(C35393Iu1.A0f.toString(), (Object) null)) {
            str2 = "discover/suggested_businesses/";
        } else {
            str2 = "discover/ayml/";
        }
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0J(str2);
        A0O.A0O("phone_id", C18190wL.A0l(userSession));
        A0O.A01 = new CY0(new C04710Ou(userSession), C25184DhP.class);
        A0O.A0O("max_number_to_display", num.toString());
        A0O.A0O(IgFragmentActivity.MODULE_KEY, str);
        A0O.A0I(AnonymousClass00U.A0X(str2, str, (String) null, '_'));
        A0O.A0E(AnonymousClass006.A0Y);
        A0O.A04.A00 = 700;
        return A0O.A02();
    }
}
