package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.6ab  reason: invalid class name and case insensitive filesystem */
public final class C103716ab {
    public static Boolean A00;
    public static Boolean A01;
    public static Boolean A02;
    public static Boolean A03;

    public static void A00(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = A00;
        if (bool == null) {
            boolean z = false;
            if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            A00 = bool;
        }
        if (bool.booleanValue() && A01 == null) {
            boolean z2 = false;
            if (context.getPackageManager().hasSystemFeature("cn.google")) {
                z2 = true;
            }
            A01 = Boolean.valueOf(z2);
        }
    }
}
