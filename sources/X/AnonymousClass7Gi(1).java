package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;

/* renamed from: X.7Gi  reason: invalid class name */
public final class AnonymousClass7Gi {
    public static final AnonymousClass7Gi A06 = new AnonymousClass7Gi();
    public int A00;
    public C972668r A01;
    public C1196476g A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public static int A00(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i = packageInfo.versionCode;
            if (i != 0) {
                return i;
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            return (serviceInfoArr == null || serviceInfoArr.length == 0) ? -1 : 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public static final synchronized void A01(Context context, AnonymousClass7Gi r4) {
        C1373888j r1;
        synchronized (r4) {
            if (!r4.A05) {
                try {
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle.containsKey("com.google.ar.core")) {
                        r4.A04 = C18190wL.A0j(bundle, "com.google.ar.core").equals("required");
                        String A002 = C18170wI.A00(921);
                        if (bundle.containsKey(A002)) {
                            r4.A00 = bundle.getInt(A002);
                            r4.A05 = true;
                        } else {
                            r1 = new C1373888j(C18170wI.A00(599));
                        }
                    } else {
                        r1 = new C1373888j("Application manifest must contain meta-data com.google.ar.core");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    r1 = new C1373888j((Throwable) e);
                }
                throw r1;
            }
        }
    }
}
