package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.6T1  reason: invalid class name */
public final class AnonymousClass6T1 {
    public static boolean A00(Context context) {
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        String installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null || !"com.android.vending".equals(installerPackageName)) {
            return false;
        }
        return true;
    }
}
