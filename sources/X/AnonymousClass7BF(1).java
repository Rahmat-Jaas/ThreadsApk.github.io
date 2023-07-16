package X;

/* renamed from: X.7BF  reason: invalid class name */
public final class AnonymousClass7BF {
    public static Integer A00(String str) {
        if (str.equals("INVALID_OFFER_CODE")) {
            return AnonymousClass006.A00;
        }
        if (str.equals("INVALID_PAYMENT_DATA")) {
            return AnonymousClass006.A01;
        }
        if (str.equals("INVALID_SHIPPING_ADDRESS")) {
            return AnonymousClass006.A0C;
        }
        if (str.equals("OUT_OF_SERVICE_AREA")) {
            return AnonymousClass006.A0N;
        }
        if (str.equals("OTHER_ERROR")) {
            return AnonymousClass006.A0Y;
        }
        if (str.equals("TIMEOUT")) {
            return AnonymousClass006.A0j;
        }
        if (str.equals("PRODUCT_OWNED")) {
            return AnonymousClass006.A0u;
        }
        if (str.equals("UPDATE_ORDER_ERROR")) {
            return AnonymousClass006.A15;
        }
        if (str.equals("GENERIC_FAILURE")) {
            return AnonymousClass006.A1C;
        }
        throw C18190wL.A0a(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "INVALID_PAYMENT_DATA";
            case 2:
                return "INVALID_SHIPPING_ADDRESS";
            case 3:
                return "OUT_OF_SERVICE_AREA";
            case 4:
                return "OTHER_ERROR";
            case 5:
                return "TIMEOUT";
            case 6:
                return "PRODUCT_OWNED";
            case 7:
                return "UPDATE_ORDER_ERROR";
            case 8:
                return "GENERIC_FAILURE";
            default:
                return "INVALID_OFFER_CODE";
        }
    }

    public static final String A02(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "INVALID_PAYMENT_DATA";
            case 2:
                return "INVALID_SHIPPING_ADDRESS";
            case 3:
                return "OUT_OF_SERVICE_AREA";
            case 4:
                return "OTHER_ERROR";
            case 5:
                return "TIMEOUT";
            case 6:
                return "PRODUCT_OWNED";
            case 7:
                return "UPDATE_ORDER_ERROR";
            case 8:
                return "GENERIC_FAILURE";
            default:
                return "INVALID_OFFER_CODE";
        }
    }
}
