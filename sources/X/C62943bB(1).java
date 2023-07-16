package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3bB  reason: invalid class name and case insensitive filesystem */
public final class C62943bB {
    public static C15730rn A00(C11630kW r2, UserSession userSession, Integer num, String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        C15730rn A00 = C15730rn.A00(r2, "ig_fb_xposting_waterfall");
        if (str3.equalsIgnoreCase("share_later")) {
            str4 = "TIMELINE";
        } else {
            str4 = "FB_STORY";
        }
        A00.A0D("share_to_surface", str4);
        if (AnonymousClass0wJ.A0Y(userSession).Apo()) {
            str5 = "BUSINESS";
        } else {
            str5 = "PERSONAL";
        }
        A00.A0D("ig_account_type", str5);
        if (C67373zR.A0D(userSession)) {
            str6 = "PAGE";
        } else {
            str6 = "USER";
        }
        A00.A0D("share_to_entity_type", str6);
        A00.A0D("waterfall_id", str);
        A00.A0D("ig_actor_id", userSession.getUserId());
        A00.A0C("client_event_time", C18200wM.A0c());
        if (num != null) {
            A00.A08(num, "media_type");
        }
        if (str2 != null) {
            A00.A0D("media_id", str2);
        }
        return A00;
    }

    public static void A04(C11630kW r8, UserSession userSession, String str, String str2, String str3, Throwable th, int i) {
        String str4;
        String str5;
        String str6 = "";
        if (th != null) {
            str5 = th.getLocalizedMessage();
            if (th.getStackTrace().length > 0) {
                str6 = th.getStackTrace()[0].getClassName();
                StringBuilder A0r = C18200wM.A0r();
                for (StackTraceElement obj : th.getStackTrace()) {
                    A0r.append(obj.toString());
                    A0r.append("\n");
                }
                str4 = A0r.toString();
                A03(r8, userSession, str, str2, str3, str5, str6, str4, i);
            }
        } else {
            str5 = str6;
        }
        str4 = str6;
        A03(r8, userSession, str, str2, str3, str5, str6, str4, i);
    }

    public static void A01(C11630kW r5, UserSession userSession, String str, String str2, String str3, int i) {
        UserSession userSession2 = userSession;
        C15730rn A00 = A00(r5, userSession2, Integer.valueOf(i), str, str2, str3);
        A00.A0D("event", AnonymousClass00U.A0L("fb_ig_client_request_", str3));
        C18180wK.A1K(A00, userSession2);
    }

    public static void A02(C11630kW r5, UserSession userSession, String str, String str2, String str3, int i) {
        UserSession userSession2 = userSession;
        C15730rn A00 = A00(r5, userSession2, Integer.valueOf(i), str, str2, str3);
        A00.A0D("event", AnonymousClass00U.A0L("fb_ig_client_success_", str3));
        C18180wK.A1K(A00, userSession2);
    }

    public static void A03(C11630kW r5, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        UserSession userSession2 = userSession;
        C15730rn A00 = A00(r5, userSession2, Integer.valueOf(i), str, str2, str3);
        A00.A0D("event", AnonymousClass00U.A0L("fb_ig_client_failure_", str3));
        A00.A0D("exception_message", str4);
        A00.A0D("exception_class", str5);
        A00.A0D("exception_stack", str6);
        C18180wK.A1K(A00, userSession2);
    }
}
