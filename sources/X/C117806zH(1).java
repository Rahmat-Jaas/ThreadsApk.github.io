package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* renamed from: X.6zH  reason: invalid class name and case insensitive filesystem */
public final class C117806zH {
    public static final void A00(Activity activity) {
        C04220Ms.A0B(activity, 0);
        AnonymousClass7K8.A02(activity, new C131717sf(new C105526dZ(activity)), new String[]{AnonymousClass000.A00(50)});
    }

    public static final boolean A01(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("BARCELONA_DEVICE_PREFERENCE", 0);
        if (Build.VERSION.SDK_INT < 33 || C18180wK.A1W(context.checkSelfPermission(AnonymousClass000.A00(50))) || sharedPreferences.getBoolean("has_notification_permission_dialog_shown", false)) {
            return false;
        }
        return true;
    }
}
