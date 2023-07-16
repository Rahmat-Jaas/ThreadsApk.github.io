package X;

import com.facebookpay.offsite.models.message.OffsiteShippingType$Companion;

/* renamed from: X.6xi  reason: invalid class name and case insensitive filesystem */
public final class C116886xi {
    public static Integer A00(String str) {
        if (str.equals("SHIPPING")) {
            return AnonymousClass006.A00;
        }
        if (str.equals(OffsiteShippingType$Companion.DELIVERY)) {
            return AnonymousClass006.A01;
        }
        if (str.equals("PICKUP")) {
            return AnonymousClass006.A0C;
        }
        throw C18190wL.A0a(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return OffsiteShippingType$Companion.DELIVERY;
            case 2:
                return "PICKUP";
            default:
                return "SHIPPING";
        }
    }
}
