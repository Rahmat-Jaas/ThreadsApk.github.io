package X;

/* renamed from: X.6VH  reason: invalid class name */
public final class AnonymousClass6VH {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : AnonymousClass006.A00(5)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "buy_with_logo";
                    break;
                case 2:
                    str2 = "secure_checkout";
                    break;
                case 3:
                    str2 = "purchase_protection";
                    break;
                case 4:
                    str2 = "";
                    break;
                default:
                    str2 = "buy_with_text";
                    break;
            }
            if (C04220Ms.A0I(str2, str)) {
                return num;
            }
        }
        return AnonymousClass006.A0Y;
    }
}
