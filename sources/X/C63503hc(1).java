package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.3hc  reason: invalid class name and case insensitive filesystem */
public final class C63503hc {
    public static C32165H8c A00(Context context, C10300i6 r5, String str, boolean z) {
        H1T A0N = AnonymousClass0wJ.A0N(r5);
        A0N.A0J("users/check_username/");
        C61933Wk.A01(A0N, str, 31, 8, 91);
        A0N.A0O("_uuid", C18230wP.A0i(context));
        A0N.A0R("is_group_creation", z);
        return C18180wK.A0T(A0N, AnonymousClass1TR.class, AnonymousClass3PN.class);
    }

    public static C32165H8c A01(Context context, UserSession userSession, Integer num, String str) {
        String str2;
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("accounts/initiate_phone_number_confirmation/");
        A0N.A0B(AnonymousClass1T2.class, AnonymousClass3N2.class);
        C61933Wk.A01(A0N, str, 9, 12, 17);
        C18180wK.A0t(context, A0N, "phone_id", C18190wL.A0l(userSession));
        if (1 - num.intValue() != 0) {
            str2 = "edit_profile";
        } else {
            str2 = "profile_megaphone";
        }
        A0N.A0O("send_source", str2);
        if (AnonymousClass0fO.A00(context)) {
            A0N.A0O("android_build_type", C10370iE.A00().name().toLowerCase());
        }
        if (userSession.multipleAccountHelper.A0L()) {
            A0N.A04.A0I = true;
        }
        return C18190wL.A0Q(A0N);
    }

    public static C32165H8c A02(Context context, UserSession userSession, Integer num, String str) {
        String str2;
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("accounts/send_confirm_email/");
        A0N.A0B(C22011Ta.class, AnonymousClass3PP.class);
        C18180wK.A0t(context, A0N, C61933Wk.A00(0, 9, 29), C09140ev.A00(context));
        switch (num.intValue()) {
            case 0:
                str2 = "email_cliff_megaphone";
                break;
            case 1:
                str2 = "profile_megaphone";
                break;
            case 2:
                str2 = "edit_profile";
                break;
            case 3:
                str2 = "personal_information";
                break;
            case 4:
                str2 = "profile_qp";
                break;
            case 5:
                str2 = "nux";
                break;
            case 6:
                str2 = "logout_upsell";
                break;
            default:
                str2 = "2fa_sms";
                break;
        }
        A0N.A0O("send_source", str2);
        A0N.A0P("email", str);
        if (userSession.multipleAccountHelper.A0L()) {
            A0N.A04.A0I = true;
        }
        return C18190wL.A0Q(A0N);
    }

    public static C32165H8c A03(C10300i6 r3, String str) {
        H1T A0N = AnonymousClass0wJ.A0N(r3);
        A0N.A0J("accounts/send_sms_code/");
        C61933Wk.A01(A0N, str, 9, 12, 17);
        return C18180wK.A0T(A0N, AnonymousClass1U3.class, AnonymousClass3WO.class);
    }

    public static C32165H8c A04(C10300i6 r3, String str, String str2, boolean z) {
        H1T A0N = AnonymousClass0wJ.A0N(r3);
        A0N.A0J("accounts/verify_sms_code/");
        C61933Wk.A01(A0N, str, 9, 12, 17);
        C61933Wk.A01(A0N, str2, 39, 17, 9);
        if (z) {
            A0N.A0O("has_sms_consent", "true");
        }
        return C18180wK.A0T(A0N, AnonymousClass1U4.class, AnonymousClass3WP.class);
    }

    public static C32165H8c A05(AnonymousClass3DU r5, UserSession userSession, String str, boolean z) {
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("accounts/edit_profile/");
        C61933Wk.A01(A0N, r5.A0F, 31, 8, 91);
        A0N.A0O("first_name", r5.A09);
        C61933Wk.A01(A0N, r5.A0E, 9, 12, 17);
        A0N.A0O("email", r5.A07);
        A0N.A0O("biography", r5.A05);
        A0N.A0O("primary_profile_link_type", r5.A01.A00);
        A0N.A0R("hide_ig_app_switcher_badge", !r5.A0K);
        A0N.A0R("show_fb_link_on_profile", r5.A0J);
        if (z) {
            A0N.A0O("gender", String.valueOf(r5.A00));
        }
        A0N.A0B(C22091Ti.class, AnonymousClass3PS.class);
        C61933Wk.A01(A0N, str, 0, 9, 29);
        return C18190wL.A0Q(A0N);
    }

    public static C32165H8c A06(UserSession userSession) {
        H1T A0O = C18180wK.A0O(userSession);
        A0O.A0J("accounts/current_user/");
        A0O.A0O("edit", "true");
        return AnonymousClass0wJ.A0T(A0O, C21921Sr.class, AnonymousClass3PR.class);
    }

    public static C32165H8c A07(UserSession userSession) {
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("accounts/enable_sms_consent/");
        return AnonymousClass0wJ.A0S(A0N);
    }
}
