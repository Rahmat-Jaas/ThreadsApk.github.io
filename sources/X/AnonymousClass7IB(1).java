package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.common.dextricks.Constants;
import java.net.URISyntaxException;
import java.util.Set;

/* renamed from: X.7IB  reason: invalid class name */
public final class AnonymousClass7IB {
    public static Boolean A00;
    public static final Set A01 = C86114wI.A0t(new String[]{"com.android.vending", "com.google.android.gms", "com.google.market"});

    /* JADX WARNING: Can't wrap try/catch for region: R(6:3|4|(3:6|7|(1:10))|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = 0
            if (r5 == 0) goto L_0x003a
            if (r6 == 0) goto L_0x003a
            java.lang.String r0 = X.AnonymousClass6DG.A00     // Catch:{ ActivityNotFoundException -> 0x003a }
            if (r0 == 0) goto L_0x0035
            android.net.Uri r0 = X.C15430rJ.A01(r0)     // Catch:{ NullPointerException -> 0x0035 }
            java.lang.String r3 = r0.getScheme()     // Catch:{ NullPointerException -> 0x0035 }
            java.lang.String r1 = r0.getAuthority()     // Catch:{ NullPointerException -> 0x0035 }
            if (r3 == 0) goto L_0x0035
            if (r1 == 0) goto L_0x0035
            android.os.Bundle r2 = X.C18180wK.A06()     // Catch:{ NullPointerException -> 0x0035 }
            java.lang.String r0 = "://"
            java.lang.String r1 = X.AnonymousClass00U.A0V(r3, r0, r1)     // Catch:{ NullPointerException -> 0x0035 }
            r0 = 179(0xb3, float:2.51E-43)
            java.lang.String r0 = X.I17.A00(r0)     // Catch:{ NullPointerException -> 0x0035 }
            r2.putString(r0, r1)     // Catch:{ NullPointerException -> 0x0035 }
            r0 = 906(0x38a, float:1.27E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)     // Catch:{ NullPointerException -> 0x0035 }
            r6.putExtra(r0, r2)     // Catch:{ NullPointerException -> 0x0035 }
        L_0x0035:
            X.C16430t3.A01(r5, r6)     // Catch:{ ActivityNotFoundException -> 0x003a }
            r0 = 1
            return r0
        L_0x003a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IB.A01(android.content.Context, android.content.Intent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r0 == false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.content.Context r3) {
        /*
            java.lang.Boolean r0 = A00
            if (r0 == 0) goto L_0x0009
            boolean r1 = r0.booleanValue()
            return r1
        L_0x0009:
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0029
            android.app.Activity r3 = (android.app.Activity) r3
            r2 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001f }
            android.content.ComponentName r0 = r3.getComponentName()     // Catch:{ NameNotFoundException -> 0x001f }
            android.content.pm.ActivityInfo r0 = r1.getActivityInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x001f }
            java.lang.String r1 = r0.processName     // Catch:{ NameNotFoundException -> 0x001f }
            goto L_0x0051
        L_0x001f:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r1 = "BrowserContextHelper"
            java.lang.String r0 = "Y U can't find the activity info!"
            X.C37252JnL.A02(r1, r0, r2)
            goto L_0x0060
        L_0x0029:
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            int r3 = android.os.Process.myPid()
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 == 0) goto L_0x0060
            java.util.Iterator r2 = r0.iterator()
        L_0x003f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r1 = r2.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r0 = r1.pid
            if (r0 != r3) goto L_0x003f
            java.lang.String r1 = r1.processName
        L_0x0051:
            if (r1 == 0) goto L_0x0060
            r0 = 543(0x21f, float:7.61E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.endsWith(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            A00 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IB.A00(android.content.Context):boolean");
    }

    public static boolean A02(Context context, Uri uri) {
        Intent A05 = C18250wR.A05("android.intent.action.VIEW");
        A05.addFlags(268435456);
        A05.setData(uri);
        for (ResolveInfo next : context.getPackageManager().queryIntentActivities(A05, Constants.LOAD_RESULT_PGO_ATTEMPTED)) {
            String str = next.activityInfo.packageName;
            if (A01.contains(str)) {
                Intent intent = new Intent(A05);
                intent.setComponent(new ComponentName(str, next.activityInfo.name));
                if (A01(context, intent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A03(Context context, String str) {
        Intent intent = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent A002 = C16400t0.A00(str);
                A002.addFlags(268435456);
                A002.addCategory(C18170wI.A00(36));
                A002.setComponent((ComponentName) null);
                A002.setSelector((Intent) null);
                intent = A002;
            } catch (URISyntaxException unused) {
            }
        }
        if (intent == null) {
            return false;
        }
        try {
            if (context.getPackageManager().resolveActivity(intent, 0) != null) {
                return A01(context, intent);
            }
        } catch (Exception e) {
            try {
                C37252JnL.A02("BrowserContextHelper", e.toString(), new Object[0]);
            } catch (Exception e2) {
                C37252JnL.A02("BrowserContextHelper", AnonymousClass00U.A0d(I17.A00(898), str, "\n", e2.getMessage()), new Object[0]);
                return false;
            }
        }
        String str2 = intent.getPackage();
        if (!TextUtils.isEmpty(str2)) {
            return A02(context, C18220wO.A0F(new Uri.Builder().scheme("market").authority("details"), "id", str2));
        }
        return A01(context, intent);
    }
}
