package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3X4  reason: invalid class name */
public final class AnonymousClass3X4 {
    public static final AnonymousClass3X4 A00 = new AnonymousClass3X4();

    public static final List A00(Context context, String str) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return AnonymousClass0ZV.A00;
        }
        Uri A01 = C15430rJ.A01(str);
        PackageManager packageManager2 = context.getPackageManager();
        if (packageManager2 == null) {
            queryIntentActivities = AnonymousClass0ZV.A00;
        } else {
            queryIntentActivities = packageManager2.queryIntentActivities(new Intent("android.intent.action.VIEW", A01), 0);
            C04220Ms.A06(queryIntentActivities);
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent A0B = C18230wP.A0B();
            A0B.setAction("android.support.customtabs.action.CustomTabsService");
            A0B.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(A0B, 0) != null) {
                A0v.add(resolveInfo);
            }
        }
        return A0v;
    }
}
