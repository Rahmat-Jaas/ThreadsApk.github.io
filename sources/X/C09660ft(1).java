package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.0ft  reason: invalid class name and case insensitive filesystem */
public final class C09660ft {
    public static void A00(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", context.getPackageName());
        intent.putExtra("app_uid", context.getApplicationInfo().uid);
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        C10650ih.A0B(context, intent);
    }

    public static boolean A01(Context context) {
        return AnonymousClass7EV.A00(context).A02();
    }
}
