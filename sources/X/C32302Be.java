package X;

/* renamed from: X.2Be  reason: invalid class name and case insensitive filesystem */
public final class C32302Be {
    public static final Object A00(C63893iY r5) {
        String str;
        String A0O;
        C04220Ms.A0B(r5, 0);
        String A0D = C63893iY.A0D(r5, 0);
        C127397h3 A02 = C63893iY.A02(r5, 1);
        if (A02 == null || (str = C18230wP.A0o(A02)) == null) {
            str = "bk.action.debug.internal.DeviceLog";
        }
        String str2 = "debug";
        if (!(A02 == null || (A0O = A02.A0O(35, str2)) == null)) {
            str2 = A0O;
        }
        switch (str2.hashCode()) {
            case 3641990:
                if (!str2.equals("warn")) {
                    return null;
                }
                AnonymousClass0LU.A0C(str, A0D);
                return null;
            case 96784904:
                if (!str2.equals("error")) {
                    return null;
                }
                AnonymousClass0LU.A0B(str, A0D);
                return null;
            default:
                return null;
        }
    }
}
