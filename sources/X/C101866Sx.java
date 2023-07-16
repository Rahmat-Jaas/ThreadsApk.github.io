package X;

import java.util.Map;

/* renamed from: X.6Sx  reason: invalid class name and case insensitive filesystem */
public final class C101866Sx {
    public static final C35356ItK A00(String str) {
        Map map = C35356ItK.A01;
        if (map == null) {
            C04220Ms.A0E("reverseMap");
            throw null;
        }
        C35356ItK itK = (C35356ItK) map.get(str);
        if (itK == null) {
            return C35356ItK.UNKNOWN;
        }
        return itK;
    }
}
