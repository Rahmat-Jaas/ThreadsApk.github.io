package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.instagram.service.session.UserSession;

/* renamed from: X.6Ye  reason: invalid class name and case insensitive filesystem */
public final class C103196Ye {
    public static Boolean A00;

    public static PackageInfo A00(Context context, UserSession userSession) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        Boolean bool = A00;
        if (bool == null) {
            bool = C18180wK.A0X();
            A00 = bool;
        }
        if (!bool.booleanValue()) {
            return packageManager.getPackageInfo(AnonymousClass000.A00(826), 0);
        }
        try {
            return packageManager.getPackageInfo("com.facebook.stella_debug", 0);
        } catch (PackageManager.NameNotFoundException e) {
            C24128D9z.A00(userSession, AnonymousClass006.A00, e.toString());
            return null;
        }
    }
}
