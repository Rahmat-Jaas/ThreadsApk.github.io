package X;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: X.0OF  reason: invalid class name */
public final class AnonymousClass0OF implements C04050Mb {
    public final Application A00;
    public final Integer A01;

    public final void CWp(C04170Mn r6, AnonymousClass0ND r7) {
        AnonymousClass0OO r1;
        AnonymousClass0ON r12;
        String str;
        AnonymousClass0ON r0;
        PackageManager packageManager = this.A00.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            C04160Mm.A00(packageManager, r6, this.A01);
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.webview", 0);
            if (!(packageInfo == null || (str = packageInfo.versionName) == null)) {
                if (this.A01 == AnonymousClass006.A01) {
                    r0 = AnonymousClass0MU.A97;
                } else {
                    r0 = AnonymousClass0MU.A98;
                }
                r6.A03(r0, str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            C04790Pd.A00();
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 0);
            if (packageInfo2 != null) {
                Integer num = this.A01;
                Integer num2 = AnonymousClass006.A01;
                if (num == num2) {
                    r1 = AnonymousClass0MU.A1Y;
                } else {
                    r1 = AnonymousClass0MU.A1Z;
                }
                r6.A01(r1, packageInfo2.versionCode);
                if (num == num2) {
                    r12 = AnonymousClass0MU.A5M;
                } else {
                    r12 = AnonymousClass0MU.A5N;
                }
                r6.A03(r12, packageInfo2.versionName);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            C04790Pd.A00();
        }
    }

    public AnonymousClass0OF(Application application, Integer num) {
        this.A00 = application;
        this.A01 = num;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0g;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
