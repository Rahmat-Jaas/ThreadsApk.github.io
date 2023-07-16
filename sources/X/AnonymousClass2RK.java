package X;

import java.util.Locale;

/* renamed from: X.2RK  reason: invalid class name */
public final class AnonymousClass2RK {
    public static final String A00(String str) {
        String str2;
        String str3 = str;
        if (str != null) {
            str2 = C18220wO.A0u(Locale.ROOT, str3);
        } else {
            str2 = null;
        }
        String A00 = I17.A00(40);
        String A002 = C28174Ezk.A00(354);
        String A003 = C28174Ezk.A00(309);
        String A004 = I17.A00(81);
        if (str2 == null) {
            return null;
        }
        switch (str2.hashCode()) {
            case -2077709277:
                if (!str2.equals("SETTINGS")) {
                    return "UNKNOWN";
                }
                return "SETTINGS";
            case -1382453013:
                if (str2.equals("NOTIFICATION")) {
                    return "NOTIFICATION";
                }
                break;
            case -787777531:
                if (str2.equals("STORY_INSIGHTS")) {
                    return "STORY_INSIGHTS";
                }
                break;
            case -602962448:
                if (str2.equals("MONETIZATION_INBOX")) {
                    return "MONETIZATION_INBOX";
                }
                break;
            case -196575407:
                if (str2.equals("PRO_HOME")) {
                    return "PRO_HOME";
                }
                break;
            case 2591:
                if (str2.equals("QP")) {
                    return "QP";
                }
                break;
            case 2511386:
                if (str2.equals("REEL")) {
                    return "REEL";
                }
                break;
            case 66081660:
                if (str2.equals("EMAIL")) {
                    return "EMAIL";
                }
                break;
            case 408556937:
                if (str2.equals("PROFILE")) {
                    return "PROFILE";
                }
                break;
            case 523908395:
                if (str2.equals("POST_LIVE")) {
                    return "POST_LIVE";
                }
                break;
            case 746833344:
                if (str2.equals(A004)) {
                    return A004;
                }
                break;
            case 755272608:
                if (str2.equals(A003)) {
                    return A003;
                }
                break;
            case 1261689812:
                if (str2.equals(A002)) {
                    return A002;
                }
                break;
            case 1915236889:
                if (str2.equals(A00)) {
                    return A00;
                }
                break;
            case 1960100960:
                if (str2.equals("REEL_INSIGHTS")) {
                    return "REEL_INSIGHTS";
                }
                break;
        }
        return "UNKNOWN";
    }
}
