package X;

/* renamed from: X.2Ki  reason: invalid class name and case insensitive filesystem */
public final class C34642Ki {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : AnonymousClass006.A00(9)) {
            if (str != null) {
                Integer num2 = AnonymousClass006.A0Y;
                if (C18220wO.A1V("selfie_captcha", 1, str)) {
                    return num2;
                }
            }
            switch (num.intValue()) {
                case 1:
                    str2 = "consent";
                    break;
                case 2:
                    str2 = "delta_login_review";
                    break;
                case 3:
                    str2 = "change_password";
                    break;
                case 4:
                    str2 = "selfie_captcha";
                    break;
                case 5:
                    str2 = "bloks";
                    break;
                case 6:
                    str2 = "ie_change_password";
                    break;
                case 7:
                    str2 = "id_captcha";
                    break;
                case 8:
                    str2 = "unknown";
                    break;
                default:
                    str2 = "underage";
                    break;
            }
            if (C04220Ms.A0I(str2, str)) {
                return num;
            }
        }
        return AnonymousClass006.A1C;
    }
}
