package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: X.3UX  reason: invalid class name */
public final class AnonymousClass3UX {
    public static final String A02 = AnonymousClass00U.A0L("com.facebook.services", ".identity.FEO2");
    public final Context A00;
    public final PackageManager A01;

    public final int A00() {
        Bundle bundle;
        boolean z = true;
        if (this.A00.checkSelfPermission(A02) != 0) {
            z = false;
        }
        if (!z) {
            return -1;
        }
        try {
            ApplicationInfo applicationInfo = this.A01.getPackageInfo("com.facebook.services", 128).applicationInfo;
            if (applicationInfo == null || !applicationInfo.enabled || (bundle = applicationInfo.metaData) == null) {
                return -1;
            }
            return bundle.getInt("com.facebook.services.identity.feo2.api.level", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public AnonymousClass3UX(Context context, PackageManager packageManager) {
        this.A00 = context;
        this.A01 = packageManager;
    }
}
