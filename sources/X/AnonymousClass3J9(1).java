package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.3J9  reason: invalid class name */
public final class AnonymousClass3J9 {
    public static Integer A00(String str) {
        if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            return AnonymousClass006.A00;
        }
        if (str.equals("FACEBOOK_APPLICATION_WEB")) {
            return AnonymousClass006.A01;
        }
        if (str.equals("FACEBOOK_APPLICATION_NATIVE")) {
            return AnonymousClass006.A0C;
        }
        if (str.equals("FACEBOOK_APPLICATION_SERVICE")) {
            return AnonymousClass006.A0N;
        }
        if (str.equals("CHROME_CUSTOM_TAB")) {
            return AnonymousClass006.A0Y;
        }
        if (str.equals("WEB_VIEW")) {
            return AnonymousClass006.A0j;
        }
        if (str.equals("TEST_USER")) {
            return AnonymousClass006.A0u;
        }
        if (str.equals("CLIENT_TOKEN")) {
            return AnonymousClass006.A15;
        }
        if (str.equals("FXCAL")) {
            return AnonymousClass006.A1C;
        }
        throw C18190wL.A0a(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "FACEBOOK_APPLICATION_WEB";
            case 2:
                return "FACEBOOK_APPLICATION_NATIVE";
            case 3:
                return "FACEBOOK_APPLICATION_SERVICE";
            case 4:
                return "CHROME_CUSTOM_TAB";
            case 5:
                return "WEB_VIEW";
            case 6:
                return "TEST_USER";
            case 7:
                return "CLIENT_TOKEN";
            case 8:
                return "FXCAL";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
