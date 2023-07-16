package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.3JM  reason: invalid class name */
public final class AnonymousClass3JM {
    public static boolean A00(Context context, String str) {
        context.getPackageManager().getClass();
        try {
            return context.getPackageManager().getPackageInfo(str, 0).applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException e) {
            AnonymousClass0LU.A03(AnonymousClass3JM.class, "Encounter package name is not found in package manager exception!", e);
            return false;
        }
    }
}
