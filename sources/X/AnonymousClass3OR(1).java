package X;

import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;

/* renamed from: X.3OR  reason: invalid class name */
public final class AnonymousClass3OR {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "copy_link";
            case 1:
                return "facebook";
            case 2:
                return "messenger";
            case 3:
                return "nametag";
            case 4:
                return "share_sheet";
            case 5:
                return "tumblr";
            case 6:
                return "twitter";
            case 7:
                return "snapchat";
            case 8:
                return "user_email";
            case 9:
                return "user_sms";
            case 10:
                return "whats_app";
            case 11:
                return "vk";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "kakaotalk";
            case 13:
                return "line";
            case 14:
                return "discord";
            case 15:
                return "private_reply";
            default:
                return "qr_code";
        }
    }

    public static void A01(H1T h1t, UserSession userSession, Integer num, String str, String str2) {
        h1t.A0J(str);
        h1t.A0O("share_to_app", A00(num));
        h1t.A0O("containermodule", str2);
        h1t.A0R("exposed_to_experiment", C63413hR.A05(userSession));
        h1t.A0P("qe_universe_name", C63413hR.A04(userSession));
    }
}
