package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.2sA  reason: invalid class name and case insensitive filesystem */
public final class C49922sA {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : AnonymousClass006.A00(5)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "one_click_checkout";
                    break;
                case 2:
                    str2 = "shopping_bag";
                    break;
                case 3:
                    str2 = "view_in_cart";
                    break;
                case 4:
                    str2 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                default:
                    str2 = "external_link";
                    break;
            }
            if (C04220Ms.A0I(str2, str)) {
                return num;
            }
        }
        return AnonymousClass006.A00;
    }
}
