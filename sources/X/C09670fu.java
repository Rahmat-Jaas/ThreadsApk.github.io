package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.0fu  reason: invalid class name and case insensitive filesystem */
public final class C09670fu {
    public static Long A00;

    public static synchronized long A00(Context context) {
        long longValue;
        synchronized (C09670fu.class) {
            Long l = A00;
            if (l == null) {
                C09410fN.A02();
                l = Long.valueOf(C09410fN.A01(context));
                A00 = l;
            }
            longValue = l.longValue();
        }
        return longValue;
    }

    public static boolean A01() {
        if (!Build.FINGERPRINT.startsWith("generic")) {
            String str = Build.PRODUCT;
            if (str.startsWith("sdk_phone") || str.startsWith("sdk_gphone") || str.startsWith("sdk_google_phone") || Build.MANUFACTURER.contains("Genymotion")) {
                return true;
            }
            return false;
        }
        return true;
    }
}
