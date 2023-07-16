package X;

/* renamed from: X.2Cu  reason: invalid class name and case insensitive filesystem */
public final class C32682Cu {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : AnonymousClass006.A00(8)) {
            switch (num.intValue()) {
                case 1:
                    str2 = AnonymousClass3QJ.A00(21, 8, 71);
                    break;
                case 2:
                    str2 = "password";
                    break;
                case 3:
                    str2 = "email";
                    break;
                case 4:
                    str2 = AnonymousClass3QJ.A00(9, 12, 27);
                    break;
                case 5:
                    str2 = "full_name";
                    break;
                case 6:
                    str2 = "sentry";
                    break;
                case 7:
                    str2 = "confirmation_code";
                    break;
                default:
                    str2 = "unknown";
                    break;
            }
            if (C04220Ms.A0I(str2, str)) {
                return num;
            }
        }
        return AnonymousClass006.A00;
    }
}
