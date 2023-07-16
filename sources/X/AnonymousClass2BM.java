package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2BM  reason: invalid class name */
public final class AnonymousClass2BM {
    public static String A00(Context context, List list) {
        PackageManager packageManager = context.getPackageManager();
        new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        Intent A05 = C18250wR.A05("android.support.customtabs.action.CustomTabsService");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            A05.setPackage(A0k);
            if (packageManager.resolveService(A05, 0) != null) {
                return A0k;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }
}
