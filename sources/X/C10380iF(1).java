package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.0iF  reason: invalid class name and case insensitive filesystem */
public final class C10380iF {
    public static String A00;

    public static String A02(Context context) {
        String str = A00;
        if (str != null) {
            return str;
        }
        try {
            String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            A00 = str2;
            return str2;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static final int A00() {
        return AnonymousClass0FX.A01();
    }

    public static String A01(Context context) {
        Context applicationContext = context.getApplicationContext();
        String A002 = C03560Ji.A00(applicationContext, "com.facebook.versioncontrol.branch", applicationContext.getPackageName());
        if (A002 == null) {
            return "";
        }
        return A002;
    }
}
