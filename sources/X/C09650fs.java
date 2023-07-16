package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.facebook.redex.IDxComparatorShape93S0000000_I2;
import java.util.Comparator;

/* renamed from: X.0fs  reason: invalid class name and case insensitive filesystem */
public final class C09650fs {
    public static final Uri A00 = new Uri.Builder().scheme("https").authority("play.google.com").path("store/apps/details").build();
    public static final Uri A01 = new Uri.Builder().scheme("market").authority("details").build();
    public static final String A02 = AnonymousClass00U.A0L("market://details?id=", "com.instagram.android");
    public static final String[] A03 = {"com.android.vending", "com.google.android.gms", "com.google.market"};
    public static final Comparator A04 = new IDxComparatorShape93S0000000_I2(9);

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r1 = r0.getPackageInfo(r5, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A08(android.content.Context r4, java.lang.String r5, int r6) {
        /*
            r3 = 0
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ NameNotFoundException | NumberFormatException -> 0x0027 }
            if (r0 == 0) goto L_0x0027
            android.content.pm.PackageInfo r1 = r0.getPackageInfo(r5, r3)     // Catch:{ NameNotFoundException | NumberFormatException -> 0x0027 }
            if (r1 == 0) goto L_0x0027
            java.lang.String r0 = r1.versionName     // Catch:{ NameNotFoundException | NumberFormatException -> 0x0027 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NameNotFoundException | NumberFormatException -> 0x0027 }
            if (r0 != 0) goto L_0x0027
            java.lang.String r2 = r1.versionName     // Catch:{ NameNotFoundException | NumberFormatException -> 0x0027 }
            java.lang.String r1 = "\\."
            r0 = 2
            java.lang.String[] r0 = r2.split(r1, r0)     // Catch:{ NameNotFoundException | NumberFormatException -> 0x0027 }
            r0 = r0[r3]     // Catch:{ NameNotFoundException | NumberFormatException -> 0x0027 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NameNotFoundException | NumberFormatException -> 0x0027 }
            if (r0 < r6) goto L_0x0027
            r3 = 1
        L_0x0027:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09650fs.A08(android.content.Context, java.lang.String, int):boolean");
    }

    public static boolean A09(PackageManager packageManager, String str) {
        if (packageManager == null) {
            return false;
        }
        try {
            return packageManager.getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static void A01(Context context, String str, String str2) {
        String A0L = AnonymousClass00U.A0L("market://details?id=", str);
        if (str2 != null) {
            A0L = AnonymousClass00U.A0V(A0L, "&referrer=utm_source%3D", str2);
        }
        Uri A012 = C15430rJ.A01(A0L);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setData(A012);
        if (!C10650ih.A0B(context, intent)) {
            C10650ih.A06(context, A00.buildUpon().appendQueryParameter("id", str).build());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.content.Context r5, android.content.Intent r6) {
        /*
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r3 = 0
            java.util.List r4 = r0.queryIntentActivities(r6, r3)
            java.util.Iterator r2 = r4.iterator()
        L_0x000d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r2.next()
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r1 = r0.packageName
            java.lang.String r0 = r5.getPackageName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            return r3
        L_0x0028:
            java.lang.String r0 = "com.instagram.android"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0032
            r0 = 3
            return r0
        L_0x0032:
            java.lang.String r0 = "com.facebook.katana"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "com.facebook.wakizashi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000d
        L_0x0042:
            r0 = 4
            return r0
        L_0x0044:
            java.lang.String r0 = "https://www.example.com"
            android.net.Uri r2 = X.C15430rJ.A01(r0)
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r2)
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            java.util.List r5 = r0.queryIntentActivities(r1, r3)
            java.util.Iterator r4 = r4.iterator()
        L_0x005d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r3 = r4.next()
            java.util.Comparator r2 = A04
            java.util.Iterator r1 = r5.iterator()
        L_0x006d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r1.next()
            int r0 = r2.compare(r0, r3)
            if (r0 != 0) goto L_0x006d
            goto L_0x005d
        L_0x007e:
            r0 = 1
            return r0
        L_0x0080:
            r0 = 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09650fs.A00(android.content.Context, android.content.Intent):int");
    }

    public static boolean A02(Context context) {
        String packageName = context.getPackageName();
        if (packageName.equals("com.instagram.barcelona") || packageName.equals("com.instagram.barcelona.debug")) {
            return true;
        }
        return false;
    }

    public static boolean A03(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (A09(packageManager, "com.facebook.katana") || A09(packageManager, "com.facebook.wakizashi")) {
            return true;
        }
        return false;
    }

    public static boolean A04(Context context) {
        String packageName = context.getPackageName();
        if (packageName.equals("com.instagram.android") || packageName.equals("com.instagram.android.debug")) {
            return true;
        }
        return false;
    }

    public static boolean A05(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (A09(packageManager, "com.instagram.android") || A09(packageManager, "com.instagram.android.debug")) {
            return true;
        }
        return false;
    }

    public static boolean A06(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || packageManager.getLaunchIntentForPackage("com.android.vending") == null) {
            return false;
        }
        try {
            return packageManager.getApplicationInfo("com.android.vending", 0).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            C10450iM.A03("PackageUtil", e.getMessage());
            return false;
        }
    }

    public static boolean A07(Context context) {
        return A09(context.getPackageManager(), "com.whatsapp");
    }
}
