package X;

import android.content.Context;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.nux.cal.model.ConnectContent;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.3iV  reason: invalid class name and case insensitive filesystem */
public final class C63883iV {
    public static C32165H8c A00(Context context, C10300i6 r3, String str, List list) {
        String str2;
        String str3;
        H1T A0N = AnonymousClass0wJ.A0N(r3);
        A0N.A0J("fxcal/get_sso_accounts/");
        C63383hO.A03(A0N, C09140ev.A00(context));
        A0N.A0P("surface", str);
        A0N.A0M("include_social_context", false);
        C18240wQ.A1A(A0N, AnonymousClass1SH.class, AnonymousClass3MZ.class);
        try {
            JSONArray A0i = C18250wR.A0i();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0i.put(C18250wR.A0j(C35652Oh.A00((AnonymousClass3TD) it.next())));
            }
            A0N.A0P("tokens", A0i.toString());
        } catch (IOException e) {
            str2 = e.toString();
            str3 = "Fail to fetch IG SSO users";
            C10450iM.A03(str3, str2);
            return C18190wL.A0Q(A0N);
        } catch (JSONException e2) {
            str2 = e2.toString();
            str3 = "Fail to build JSON object";
            C10450iM.A03(str3, str2);
            return C18190wL.A0Q(A0N);
        }
        return C18190wL.A0Q(A0N);
    }

    public static AnonymousClass3TD A0G(FxcalAccountType fxcalAccountType, String str, String str2) {
        return new AnonymousClass3TD(fxcalAccountType, AnonymousClass25F.FIRST_PARTY, str, str2);
    }

    public static C32165H8c A01(Context context, C07530bf r4, Boolean bool, Boolean bool2, String str, String str2, boolean z, boolean z2) {
        str.getClass();
        H1T A0N = AnonymousClass0wJ.A0N(r4);
        A0N.A0J("users/lookup_phone/");
        C63383hO.A02(context, A0N);
        A0N.A0R("supports_sms_code", z);
        AnonymousClass269.A09(A0N);
        A0N.A0P("query", str);
        A0N.A0P("use_whatsapp", String.valueOf(z2));
        A0N.A0P("client_message", str2);
        A0N.A0M("auth_failed", bool);
        A0N.A0M("is_resend", bool2);
        A0N.A0B(AnonymousClass1U5.class, AnonymousClass3N5.class);
        if (AnonymousClass0fO.A00(context)) {
            A0N.A0O("android_build_type", C18240wQ.A0g(C10370iE.A00().name()));
        }
        return C18190wL.A0Q(A0N);
    }

    public static C32165H8c A02(Context context, C07530bf r2, Integer num, String str) {
        String str2;
        H1T A0N = AnonymousClass0wJ.A0N(r2);
        A0N.A0J("accounts/assisted_account_recovery/");
        A0N.A0O("query", str);
        C63383hO.A02(context, A0N);
        switch (num.intValue()) {
            case 0:
                str2 = "login_help";
                break;
            case 1:
                str2 = "account_access";
                break;
            case 2:
                str2 = "multi_account";
                break;
            case 3:
                str2 = "recovery_upsell";
                break;
            default:
                str2 = "login_upsell";
                break;
        }
        A0N.A0O("source", str2);
        return C18180wK.A0T(A0N, C22191Ts.class, C59873Mt.class);
    }

    public static C32165H8c A03(Context context, C07530bf r2, String str) {
        H1T A0N = AnonymousClass0wJ.A0N(r2);
        A0N.A0J("accounts/send_recovery_flow_email/");
        A0N.A0O("query", str);
        C63383hO.A02(context, A0N);
        AnonymousClass269.A0A(A0N, "adid", A0H());
        return C18180wK.A0T(A0N, C22131Tm.class, AnonymousClass3N1.class);
    }

    public static C32165H8c A04(Context context, C07530bf r4, String str, String str2, String str3) {
        H1T A0N = AnonymousClass0wJ.A0N(r4);
        A0N.A0J("accounts/one_tap_app_login/");
        A0N.A0O("login_nonce", str);
        C63383hO.A02(context, A0N);
        C18250wR.A17(A0N, str2);
        C18180wK.A1J(A0N, r4, "adid", A0H());
        A0N.A0P("device_base_login_session", str3);
        return C18180wK.A0S(A0N);
    }

    public static C32165H8c A05(Context context, C07530bf r2, String str, String str2, String str3, String str4) {
        H1T A0N = AnonymousClass0wJ.A0N(r2);
        A0N.A0J("accounts/account_recovery_code_verify/");
        C63383hO.A03(A0N, C09140ev.A00(context));
        AnonymousClass269.A0A(A0N, "recover_code", str);
        A0N.A0P("recovery_handle", str2);
        A0N.A0O("recovery_handle_type", str3);
        A0N.A0O("recovery_type", str4);
        C18240wQ.A1A(A0N, AnonymousClass1TO.class, C59853Mr.class);
        return C18190wL.A0Q(A0N);
    }

    public static C32165H8c A06(Context context, C07530bf r4, String str, String str2, String str3, String str4, String str5, String str6) {
        H1T A0N = AnonymousClass0wJ.A0N(r4);
        A0N.A0J("accounts/account_recovery_code_login/");
        A0N.A0O("query", str);
        A0N.A0O("recover_code", str2);
        A0N.A0O("source", "account_recover_code");
        C63383hO.A02(context, A0N);
        AnonymousClass269.A09(A0N);
        A0N.A0P("phone_id", C18190wL.A0l(r4));
        A0N.A0P("flow_type", str3);
        A0N.A0P("client_message", str4);
        A0N.A0P("auth_start_response", str5);
        A0N.A0P("autoconf_metadata_blob", str6);
        return C18180wK.A0S(A0N);
    }

    public static C32165H8c A07(Context context, UserSession userSession, Boolean bool) {
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("accounts/opt_out_feo2_service/");
        C18250wR.A17(A0N, userSession.getUserId());
        A0N.A0M("retrieve_only", bool);
        AnonymousClass269.A09(A0N);
        A0N.A0O("source", "account_recover_code");
        C63383hO.A02(context, A0N);
        A0N.A0P("phone_id", C18190wL.A0l(userSession));
        C18240wQ.A1A(A0N, AnonymousClass1T1.class, AnonymousClass3N0.class);
        return C18190wL.A0Q(A0N);
    }

    public static C32165H8c A08(Context context, UserSession userSession, String str, String str2, String str3, boolean z) {
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("accounts/register_feo2_service/");
        A0N.A0P("enc_verifier", str);
        AnonymousClass269.A0A(A0N, "recover_code", str2);
        C18250wR.A17(A0N, userSession.getUserId());
        A0N.A0R("has_feo2_consent", z);
        A0N.A0O("source", "account_recover_code");
        C63383hO.A02(context, A0N);
        A0N.A0O("sms_flow_type", str3);
        C18240wQ.A1A(A0N, C21651Rq.class, AnonymousClass3N3.class);
        return C18190wL.A0Q(A0N);
    }

    public static C32165H8c A09(C10300i6 r3, AnonymousClass3TD r4, Boolean bool, String str, String str2, String str3, String str4, String str5) {
        H1T A0N = AnonymousClass0wJ.A0N(r3);
        A0N.A0J("fxcal/sso_login/");
        A0N.A0P("pk", str);
        A0N.A0O("adid", A0H());
        C63383hO.A03(A0N, str2);
        C18180wK.A1J(A0N, r3, "guid", str3);
        AnonymousClass269.A09(A0N);
        A0N.A0P("surface", str4);
        A0N.A0M("require_password_reset", bool);
        A0N.A0P("stop_deletion_token", str5);
        C18240wQ.A1A(A0N, C26651qz.class, C59893Mv.class);
        A0N.A06();
        try {
            A0N.A0O("token", C35652Oh.A00(r4));
        } catch (IOException e) {
            C10450iM.A03("Fail to fetch SSO token", e.toString());
        }
        return A0N.A02();
    }

    public static C32165H8c A0A(C10300i6 r6, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str8;
        H1T A0N = AnonymousClass0wJ.A0N(r6);
        A0N.A0J("fb/facebook_signup/");
        String str9 = "false";
        String str10 = str9;
        if (z2) {
            str10 = "true";
        }
        A0N.A0O("dryrun", str10);
        A0N.A0O(C63383hO.A00(), str);
        A0N.A0O("adid", A0H());
        if (z) {
            str8 = "big_blue_token";
        } else {
            str8 = "fb_access_token";
        }
        A0N.A0O(str8, str2);
        C63383hO.A03(A0N, str5);
        C18180wK.A1J(A0N, r6, "guid", str6);
        AnonymousClass269.A0A(A0N, "jazoest", AnonymousClass3E4.A00.A00(C18190wL.A0l(r6)));
        A0N.A0R("fb_reg_flag", z4);
        if (z5) {
            str9 = "true";
        }
        A0N.A0O("force_signup_with_fb_after_cp_claiming", str9);
        A0N.A0M("require_password_reset", bool);
        C18240wQ.A1A(A0N, C26651qz.class, C59893Mv.class);
        A0N.A06();
        if (z3) {
            A0N.A0O("allow_contacts_sync", "true");
        }
        if (str3 != null) {
            A0N.A0O("sn_result", str3);
        }
        if (str4 != null) {
            A0N.A0O("sn_nonce", str4);
        }
        if (str7 != null) {
            A0N.A0O("surface", str7);
        }
        return A0N.A02();
    }

    public static C32165H8c A0B(C10300i6 r2, String str, String str2) {
        H1T A0N = AnonymousClass0wJ.A0N(r2);
        A0N.A0J("fb/nux_fb_content/");
        A0N.A0O("access_token", str);
        A0N.A0P("linking_entry_point", str2);
        C18240wQ.A1A(A0N, ConnectContent.class, C59993Nf.class);
        return C18190wL.A0Q(A0N);
    }

    public static C32165H8c A0C(C10300i6 r2, String str, String str2) {
        H1T A0N = AnonymousClass0wJ.A0N(r2);
        A0N.A0J("fb/verify_access_token/");
        C18240wQ.A1A(A0N, AnonymousClass1TW.class, C59903Mw.class);
        A0N.A0O("fb_access_token", str);
        A0N.A0P("query", str2);
        return C18190wL.A0Q(A0N);
    }

    public static C32165H8c A0D(C10300i6 r5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i) {
        JSONArray A0i = C18250wR.A0i();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C18210wN.A1R(it, A0i);
            }
        }
        H1T A0N = AnonymousClass0wJ.A0N(r5);
        A0N.A0J("accounts/login/");
        A0N.A0O("enc_password", C62663aU.A01(A0N, r5, C63383hO.A00(), str8, str6));
        C63383hO.A03(A0N, str2);
        A0N.A0O("guid", str5);
        C18180wK.A1J(A0N, r5, "adid", A0H());
        A0N.A0O("jazoest", AnonymousClass3E4.A00.A00(C18190wL.A0l(r5)));
        A0N.A0O("login_attempt_count", Integer.toString(i));
        C18230wP.A1I(A0N, A0i);
        A0N.A0P("sn_result", str4);
        A0N.A0P("sn_nonce", str3);
        A0N.A0P("country_codes", str);
        A0N.A0P("stop_deletion_token", str7);
        return C18180wK.A0S(A0N);
    }

    public static C32165H8c A0E(C10300i6 r4, List list) {
        JSONArray A0i = C18250wR.A0i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18210wN.A1R(it, A0i);
        }
        H1T A0N = AnonymousClass0wJ.A0N(r4);
        A0N.A0J("accounts/google_token_users/");
        C18230wP.A1I(A0N, A0i);
        return C18180wK.A0T(A0N, AnonymousClass1SK.class, C59913Mx.class);
    }

    public static C32165H8c A0F(UserSession userSession) {
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("accounts/send_password_reset_link/");
        return C18180wK.A0T(A0N, C22131Tm.class, AnonymousClass3N1.class);
    }

    public static String A0H() {
        String A0h = C18200wM.A0h(C18200wM.A0C(), "google_ad_id");
        if (A0h == null) {
            return "";
        }
        return A0h;
    }
}
