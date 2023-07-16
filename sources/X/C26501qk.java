package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: X.1qk  reason: invalid class name and case insensitive filesystem */
public final class C26501qk extends AnonymousClass3YP {
    public final Intent A00 = C18250wR.A05("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");

    public final boolean A03(Context context, String str) {
        C04220Ms.A0B(str, 1);
        if (!"com.bbk.launcher2".equalsIgnoreCase(str)) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            String str2 = Build.BRAND;
            if ((str2 == null || !str2.equalsIgnoreCase("vivo")) && (str2 == null || !str2.equalsIgnoreCase("iQOO"))) {
                return false;
            }
        }
        return true;
    }
}
