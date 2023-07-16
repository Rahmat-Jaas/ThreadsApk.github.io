package X;

import android.os.Bundle;

/* renamed from: X.7Hq  reason: invalid class name */
public final class AnonymousClass7Hq {
    public static String A00(Bundle bundle) {
        return bundle.getString(AnonymousClass00U.A0R("AUTH_FLOW_UTIL_AUTH_FLOW", "#", 1));
    }

    public static String A01(Bundle bundle) {
        return bundle.getString(AnonymousClass00U.A0R("AUTH_FLOW_UTIL_AUTH_STEP", "#", 2));
    }

    public static String A02(Bundle bundle) {
        return bundle.getString(AnonymousClass00U.A0R("AUTH_FLOW_UTIL_AUTH_STEP", "#", 1));
    }

    public static void A03(Bundle bundle, String str) {
        bundle.putString(AnonymousClass00U.A0R("AUTH_FLOW_UTIL_AUTH_FLOW", "#", 1), str);
    }

    public static void A04(Bundle bundle, String str) {
        bundle.putString(AnonymousClass00U.A0R("AUTH_FLOW_UTIL_AUTH_STEP", "#", 1), str);
    }
}
