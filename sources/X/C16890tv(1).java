package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0tv  reason: invalid class name and case insensitive filesystem */
public final class C16890tv {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b A[Catch:{ NullPointerException -> 0x003c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r8) {
        /*
            java.lang.String r0 = r8.getPackageName()
            java.lang.String r4 = com.facebook.rti.push.service.FbnsServiceDelegate.A00(r0)
            android.content.ComponentName r1 = new android.content.ComponentName
            r1.<init>(r8, r4)
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            int r0 = r0.getComponentEnabledSetting(r1)     // Catch:{ Exception -> 0x009c }
            r3 = 1
            if (r0 == r3) goto L_0x001a
            if (r0 != 0) goto L_0x009c
        L_0x001a:
            java.lang.String r7 = r8.getPackageName()
            java.lang.Class<android.app.ActivityManager> r2 = android.app.ActivityManager.class
            java.lang.String r0 = "activity"
            java.lang.Object r1 = r8.getSystemService(r0)     // Catch:{ Exception -> 0x002f }
            if (r1 == 0) goto L_0x002f
            boolean r0 = r2.isInstance(r1)     // Catch:{ Exception -> 0x002f }
            if (r0 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.util.List r0 = r1.getRunningServices(r0)     // Catch:{ NullPointerException -> 0x003c }
            if (r0 == 0) goto L_0x008c
            goto L_0x0045
        L_0x003c:
            r2 = move-exception
            java.lang.String r1 = "RtiGracefulSystemMethodHelper"
            java.lang.String r0 = "Failed to getRunningServices"
            X.AnonymousClass0LU.A0F(r1, r0, r2)
            goto L_0x008c
        L_0x0045:
            java.util.Iterator r6 = r0.iterator()
        L_0x0049:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r5 = r6.next()
            android.app.ActivityManager$RunningServiceInfo r5 = (android.app.ActivityManager.RunningServiceInfo) r5
            android.content.ComponentName r0 = r5.service
            java.lang.String r2 = r0.getClassName()
            android.content.ComponentName r0 = r5.service
            java.lang.String r1 = r0.getPackageName()
            boolean r0 = r4.equals(r2)
            if (r0 == 0) goto L_0x0049
            boolean r0 = r7.equals(r1)
            if (r0 == 0) goto L_0x0049
            boolean r0 = r5.started
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "Orca.STOP"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r1 = r8.getPackageName()
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r1, r4)
            r2.setComponent(r0)
            X.0mM r0 = new X.0mM
            r0.<init>((android.content.Context) r8)
            X.C12610mC.A01(r2, r0)
        L_0x008c:
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r8, r4)
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            r0 = 2
            r1.setComponentEnabledSetting(r2, r0, r3)
            r2.getShortClassName()
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16890tv.A00(android.content.Context):void");
    }

    public static void A01(Context context, AnonymousClass0YN r7, String str, String str2, String str3, String str4) {
        if (context.getPackageName().equals(str3)) {
            ComponentName componentName = new ComponentName(context, str);
            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            componentName.getShortClassName();
        }
        ComponentName componentName2 = new ComponentName(str3, str);
        Intent intent = new Intent(str4);
        intent.setComponent(componentName2);
        if (str2 != null) {
            intent.putExtra("caller", str2);
        }
        if (r7 != null) {
            String str5 = r7.A03;
            if (str5 != null) {
                intent.putExtra("caller", str5);
            }
            long j = r7.A00;
            if (j != 0) {
                intent.putExtra("EXPIRED_SESSION", j);
            }
            Boolean bool = r7.A01;
            if (bool != null) {
                intent.putExtra("EXPLICIT_DELIVERY_ACK", bool);
            }
            Integer num = r7.A02;
            if (num != null) {
                intent.putExtra("DELIVERY_RETRY_INTERVAL", num);
            }
        }
        C12610mC.A01(intent, new C12710mM(context));
    }
}
