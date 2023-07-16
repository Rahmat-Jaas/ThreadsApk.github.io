package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;

/* renamed from: X.0Ji  reason: invalid class name and case insensitive filesystem */
public final class C03560Ji {
    public static String A00(Context context, String str, String str2) {
        Bundle bundle;
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str2, 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(C03560Ji.class.getName(), "Error reading <meta-data> from AndroidManifest.xml.", e);
            return null;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof DeadObjectException) {
                Log.e(C03560Ji.class.getName(), "Error reading <meta-data> from AndroidManifest.xml.", e2);
                return null;
            }
            throw e2;
        }
    }
}
