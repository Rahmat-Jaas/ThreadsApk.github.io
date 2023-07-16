package X;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: X.0Mm  reason: invalid class name and case insensitive filesystem */
public final class C04160Mm {
    public static void A00(PackageManager packageManager, C04170Mn r4, Integer num) {
        AnonymousClass0ON r1;
        AnonymousClass0OO r2;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.art", 1073741824);
            if (packageInfo != null) {
                Integer num2 = AnonymousClass006.A01;
                if (num == num2) {
                    r1 = AnonymousClass0MU.A40;
                } else {
                    r1 = AnonymousClass0MU.A41;
                }
                r4.A03(r1, packageInfo.versionName);
                if (num == num2) {
                    r2 = AnonymousClass0MU.A12;
                } else {
                    r2 = AnonymousClass0MU.A13;
                }
                r4.A02(r2, Long.valueOf(packageInfo.getLongVersionCode()));
            }
        } catch (PackageManager.NameNotFoundException unused) {
            C04790Pd.A00();
        }
    }
}
