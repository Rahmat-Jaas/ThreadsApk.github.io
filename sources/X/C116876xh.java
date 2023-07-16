package X;

/* renamed from: X.6xh  reason: invalid class name and case insensitive filesystem */
public final class C116876xh {
    public static Integer A00(String str) {
        if (str.equals("SHIPPING")) {
            return AnonymousClass006.A00;
        }
        if (str.equals("PICKUP")) {
            return AnonymousClass006.A01;
        }
        throw C18190wL.A0a(str);
    }

    public static String A01(Integer num) {
        if (1 - num.intValue() != 0) {
            return "SHIPPING";
        }
        return "PICKUP";
    }
}
