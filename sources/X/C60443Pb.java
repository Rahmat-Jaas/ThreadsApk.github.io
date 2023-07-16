package X;

/* renamed from: X.3Pb  reason: invalid class name and case insensitive filesystem */
public final class C60443Pb {
    public static final AnonymousClass252 A01(String str) {
        C04220Ms.A0B(str, 0);
        for (AnonymousClass252 r1 : AnonymousClass252.values()) {
            if (C04220Ms.A0I(r1.A01, str)) {
                return r1;
            }
        }
        throw new UnsupportedOperationException(AnonymousClass00U.A0L("cannot find find audience mode for string: ", str));
    }

    public static final AnonymousClass252 A00(int i) {
        for (AnonymousClass252 r1 : AnonymousClass252.values()) {
            Integer num = r1.A00;
            if (num != null && num.intValue() == i) {
                return r1;
            }
        }
        return null;
    }
}
