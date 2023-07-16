package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: X.6kj  reason: invalid class name and case insensitive filesystem */
public final class C109856kj {
    public boolean A00;
    public final Context A01;
    public final SharedPreferences A02;
    public final AnonymousClass8eW A03;

    public C109856kj(Context context, AnonymousClass8eW r6, String str) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        this.A01 = createDeviceProtectedStorageContext;
        SharedPreferences A0C = C86164wN.A0C(createDeviceProtectedStorageContext, AnonymousClass00U.A0L("com.google.firebase.common.prefs:", str));
        this.A02 = A0C;
        this.A03 = r6;
        if (A0C.contains("firebase_data_collection_default_enabled")) {
            z = A0C.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                Context context2 = this.A01;
                PackageManager packageManager = context2.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context2.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled"))) {
                    z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = true;
        }
        this.A00 = z;
    }
}
