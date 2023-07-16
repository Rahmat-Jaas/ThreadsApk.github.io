package X;

/* renamed from: X.2CR  reason: invalid class name */
public final class AnonymousClass2CR {
    public static final boolean A00(String str) {
        String str2;
        for (Integer intValue : C18240wQ.A1a()) {
            switch (intValue.intValue()) {
                case 1:
                    str2 = "android.test.canceled";
                    break;
                case 2:
                    str2 = "android.test.refunded";
                    break;
                case 3:
                    str2 = "android.test.item_unavailable";
                    break;
                default:
                    str2 = "android.test.purchased";
                    break;
            }
            if (C04220Ms.A0I(str2, str)) {
                return true;
            }
        }
        return false;
    }
}
