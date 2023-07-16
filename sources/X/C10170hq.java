package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.0hq  reason: invalid class name and case insensitive filesystem */
public final class C10170hq {
    public static String A00;

    public static String A00(Context context) {
        String str = A00;
        if (str != null) {
            return str;
        }
        context.getClass();
        String valueOf = String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
        A00 = valueOf;
        return valueOf;
    }

    public static String A01(Context context) {
        ActivityInfo activityInfo;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, Constants.LOAD_RESULT_PGO_ATTEMPTED);
            if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) {
                return "";
            }
            return activityInfo.packageName;
        } catch (RuntimeException unused) {
            return "";
        }
    }

    public static boolean A02(String str) {
        PackageManager packageManager = C10600ic.A00.getPackageManager();
        try {
            packageManager.getClass();
            packageManager.getPackageInfo(str, 128);
            return true;
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return false;
        }
    }
}
