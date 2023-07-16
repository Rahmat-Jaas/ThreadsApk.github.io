package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.3WR  reason: invalid class name */
public final class AnonymousClass3WR {
    public static C32165H8c A01(Context context, C10300i6 r5, String str, String str2, String str3, List list) {
        H1T A0N = AnonymousClass0wJ.A0N(r5);
        A0N.A0J("accounts/send_verify_email/");
        C63383hO.A02(context, A0N);
        A0N.A0O("email", str);
        A0N.A0R("auto_confirm_only", false);
        AnonymousClass269.A09(A0N);
        A0N.A0P("big_blue_token", str2);
        A0N.A0P("phone_id", str3);
        if (!C09790gg.A00(list)) {
            JSONArray A0i = C18250wR.A0i();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C18210wN.A1R(it, A0i);
            }
            C18230wP.A1I(A0N, A0i);
        }
        if (C18250wR.A01(r5) > 0) {
            A0N.A04.A0I = true;
        }
        return C18180wK.A0T(A0N, AnonymousClass1SP.class, AnonymousClass3NW.class);
    }

    public static C32165H8c A02(C10300i6 r2, String str, String str2, String str3, boolean z) {
        String str4;
        H1T A0N = AnonymousClass0wJ.A0N(r2);
        A0N.A0J("fb/show_continue_as/");
        C63383hO.A03(A0N, str);
        A0N.A0O("phone_id", str2);
        A0N.A0O("screen", "landing");
        if (z) {
            str4 = "big_blue_token";
        } else {
            str4 = "fb_access_token";
        }
        A0N.A0O(str4, str3);
        return C18180wK.A0T(A0N, C22061Tf.class, C59943Na.class);
    }

    public static C32165H8c A00(Context context, C10300i6 r5, String str, String str2, String str3) {
        H1T A0N = AnonymousClass0wJ.A0N(r5);
        A0N.A0J("accounts/send_signup_sms_code/");
        A0N.A0O(C63383hO.A01(28, 12, 80), str);
        A0N.A0O(C63383hO.A01(11, 9, 12), str2);
        A0N.A0O("guid", str3);
        C18180wK.A1J(A0N, r5, "waterfall_id", AnonymousClass269.A04());
        A0N.A0B(C27111rz.class, C59953Nb.class);
        if (AnonymousClass0fO.A00(context)) {
            A0N.A0O("android_build_type", C10370iE.A00().name().toLowerCase());
        }
        if (C18250wR.A01(r5) > 0) {
            A0N.A04.A0I = true;
        }
        return C18190wL.A0Q(A0N);
    }
}
