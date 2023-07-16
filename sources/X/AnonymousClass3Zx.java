package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Zx  reason: invalid class name */
public final class AnonymousClass3Zx {
    public static C32165H8c A02(UserSession userSession, String str, String str2, String str3, String str4) {
        return A03(userSession, str, str2, str3, str4, (String) null, (String) null, (String) null, false, false, false, false, false, false, false);
    }

    public static C32165H8c A00(Context context, UserSession userSession, Boolean bool, Boolean bool2, String str, String str2, String str3) {
        Integer num;
        String A0l = C18190wL.A0l(userSession);
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("address_book/link/");
        A0N.A0O("phone_id", C18190wL.A0l(userSession));
        C61933Wk.A01(A0N, C18230wP.A0i(context), 0, 9, 29);
        A0N.A0O("contacts", str);
        A0N.A0O(IgFragmentActivity.MODULE_KEY, str2);
        A0N.A0R("should_process_contacts_immediately", bool.booleanValue());
        A0N.A0P("source", str3);
        A0N.A0R("has_seen_new_ci_content", bool2.booleanValue());
        A0N.A0B(AnonymousClass4K4.class, AnonymousClass3PU.class);
        StringBuilder A0r = C18200wM.A0r();
        A0r.append("address_book/link/");
        A0r.append("_");
        if (!TextUtils.isEmpty(str)) {
            num = Integer.valueOf(str.hashCode());
        } else {
            num = "";
        }
        A0r.append(num);
        A0r.append("_");
        if (A0l == null) {
            A0l = "";
        }
        A0N.A0I(C18180wK.A0i(A0l, A0r));
        A0N.A0E(AnonymousClass006.A0Y);
        H1R h1r = A0N.A04;
        h1r.A00 = 1500;
        h1r.A0P = true;
        return A0N.A02();
    }

    public static C32165H8c A01(Context context, UserSession userSession, String str, boolean z) {
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("address_book/unlink/");
        A0N.A0O("phone_id", C18190wL.A0l(userSession));
        C61933Wk.A01(A0N, C18230wP.A0i(context), 0, 9, 29);
        A0N.A0R("user_initiated", z);
        A0N.A0P("source", str);
        C18240wQ.A18(A0N);
        if (!C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36313819638662856L)) {
            A0N.A06();
        }
        return A0N.A02();
    }

    public static C32165H8c A03(UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        H1T h1t = new H1T(userSession);
        h1t.A01 = new CY0(new C04710Ou(userSession), AnonymousClass3PU.class);
        h1t.A0F(AnonymousClass006.A0N);
        h1t.A0J(str);
        h1t.A0P("query", str2);
        h1t.A0P(I17.A00(851), str3);
        h1t.A0P("max_id", str4);
        h1t.A0P("rank_token", str5);
        h1t.A0P("order", str6);
        h1t.A0P("text_post_app_onboarding_setting", str7);
        if (z2) {
            h1t.A0O("rank_mutual", "true");
        }
        if (z3) {
            h1t.A0O("includes_hashtags", "true");
        }
        if (z4) {
            h1t.A0O("enable_groups", "true");
        }
        if (z5) {
            h1t.A0O("support_professional_sticker_search", "true");
        }
        if (z6) {
            h1t.A0O("force_ig_context", "true");
        }
        if (z7) {
            h1t.A0O("include_user_count", "true");
        }
        if (z) {
            boolean A0E = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36323526264758149L);
            StringBuilder A0r = C18200wM.A0r();
            A0r.append(str);
            if (A0E) {
                A0r.append(str2);
                A0r.append(str6);
            } else {
                A0r.append(str2);
            }
            A0r.append("_");
            h1t.A0I(C18180wK.A0i(str4, A0r));
            h1t.A0E(AnonymousClass006.A0Y);
            h1t.A04.A00 = 3000;
        }
        if ("nux_follow_from_logged_in_accounts".equals(str3)) {
            h1t.A0O("source", "nux_follow_from_logged_in_accounts");
            h1t.A04.A0I = true;
        } else if ("search_in_dp".equals(str3)) {
            h1t.A0O("source", "search_in_dp");
        }
        return h1t.A02();
    }
}
