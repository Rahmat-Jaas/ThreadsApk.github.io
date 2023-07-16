package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.0l4  reason: invalid class name and case insensitive filesystem */
public final class C11950l4 implements AnonymousClass0W9 {
    public static String A01;
    public final Context A00;

    public final String AHL() {
        return "install_source";
    }

    public final long BgD() {
        return 70368744177664L;
    }

    public final void CCC(C05800Wc r4) {
        if (r4.BWB(47)) {
            String str = A01;
            AnonymousClass0WN AvU = r4.AvU();
            if (str == null) {
                str = "";
            }
            AvU.A03("install_source", str);
        }
    }

    public C11950l4(Context context) {
        this.A00 = context;
        if (A01 == null) {
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                A01 = packageManager.getInstallerPackageName(packageName);
            }
        }
    }

    public final boolean BTR(C08640dy r3) {
        return C07960cV.A05(AnonymousClass0e5.A00(36313110969058630L));
    }
}
