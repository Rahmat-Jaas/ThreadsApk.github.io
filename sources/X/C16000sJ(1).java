package X;

import ch.boye.httpclientandroidlib.util.LangUtils;

/* renamed from: X.0sJ  reason: invalid class name and case insensitive filesystem */
public final class C16000sJ {
    public static String A00(int i) {
        if (i == 1) {
            return "URI_MAP_URI_MAPPING";
        }
        if (i == 1408) {
            return "URI_MAP_FACEBOOK_URL_FACEWEB";
        }
        if (i == 6484) {
            return "URI_MAP_FACEBOOK_URL_PROFILE_SWITCHING";
        }
        if (i == 7857) {
            return "URI_MAP_FACEBOOK_URL_LINKSHIM";
        }
        if (i == 3) {
            return "URI_MAP_FACEWEB_FALLBACK";
        }
        if (i == 4) {
            return "URI_MAP_GOOGLE_PLAY";
        }
        if (i == 5) {
            return "URI_MAP_FACEWEB";
        }
        if (i == 6) {
            return "URI_MAP_DEEP_LINK";
        }
        if (i == 12) {
            return "URI_MAP_FACEBOOK_URL";
        }
        if (i == 13) {
            return "URI_MAP_THIRD_PARTY";
        }
        switch (i) {
            case 8:
                return "URI_MAP_MESSENGER";
            case 9:
                return "URI_MAP_DIODE";
            case 10:
                return "URI_MAP_WEBVIEW_REDIRECT";
            default:
                switch (i) {
                    case 15:
                        return "URI_MAP_FACEWEB_INTENT";
                    case 16:
                        return "URI_MAP_URI_LOOKUP_STATIC";
                    case LangUtils.HASH_SEED /*17*/:
                        return "URI_MAP_URI_LOOKUP_FALLBACK";
                    case 18:
                        return "URI_MAP_APP_MANAGER_INTENT";
                    case 19:
                        return "URI_MAP_SMS_INTENT";
                    case 20:
                        return "URI_MAP_SIGN";
                    case 21:
                        return "URI_MAP_MULTI_BINDING";
                    case 22:
                        return "URI_MAP_URI_LOOKUP_DFA";
                    case 23:
                        return "URI_MAP_REACT_NATIVE";
                    case 24:
                        return "URI_MAP_WEBVIEW_URI_REDIRECTOR_CONSTRUCT";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
