package X;

import android.content.Context;

/* renamed from: X.7qH  reason: invalid class name and case insensitive filesystem */
public final class C130557qH implements C11630kW, AnonymousClass0i1 {
    public static boolean A02 = false;
    public static boolean A03 = false;
    public static final String __redex_internal_original_name = "InstallReferrerRegistrar";
    public final Context A00;
    public final C10300i6 A01;

    public final String getModuleName() {
        return "install_referrer";
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r6.A01 == null) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r13 = this;
            X.KJ8 r4 = X.KJ8.A0G
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0019
            boolean r0 = A02
            if (r0 != 0) goto L_0x0019
            X.0i6 r3 = r13.A01
            java.lang.String r2 = "first_open_waiting_for_referrer"
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            r1 = 1
            r0 = 0
            X.C54162z0.A00(r3, r2, r0, r0)
            A02 = r1
        L_0x0019:
            boolean r0 = A03
            if (r0 != 0) goto L_0x0111
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x0037
            boolean r0 = X.KJ8.A02()
            if (r0 == 0) goto L_0x0111
            android.content.SharedPreferences r2 = X.C18200wM.A0C()
            java.lang.String r1 = "preference_referral_logging_attempt_count"
            r0 = 0
            int r1 = r2.getInt(r1, r0)
            if (r1 <= 0) goto L_0x0111
            r0 = 3
            if (r1 >= r0) goto L_0x0111
        L_0x0037:
            android.content.SharedPreferences r1 = X.C18200wM.A0C()
            java.lang.String r0 = "preference_referral_logging_attempt_count"
            r7 = 0
            X.AnonymousClass0wJ.A14(r1, r0, r7)
            android.content.Context r0 = r13.A00
            r4 = 0
            if (r0 == 0) goto L_0x0103
            X.76I r6 = new X.76I
            r6.<init>(r0)
            X.6pI r5 = new X.6pI     // Catch:{ SecurityException -> 0x010a }
            r5.<init>(r6, r13)     // Catch:{ SecurityException -> 0x010a }
            int r2 = r6.A00     // Catch:{ SecurityException -> 0x010a }
            r9 = 2
            if (r2 != r9) goto L_0x005e
            com.google.android.finsky.externalreferrer.IGetInstallReferrerService r0 = r6.A02     // Catch:{ SecurityException -> 0x010a }
            if (r0 == 0) goto L_0x005e
            android.content.ServiceConnection r1 = r6.A01     // Catch:{ SecurityException -> 0x010a }
            r0 = 1
            if (r1 != 0) goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            java.lang.String r8 = "InstallReferrerClient"
            if (r0 == 0) goto L_0x006a
            android.util.Log.isLoggable(r8, r9)     // Catch:{ SecurityException -> 0x010a }
            r5.A00(r7)     // Catch:{ SecurityException -> 0x010a }
            return
        L_0x006a:
            r10 = 3
            r3 = 1
            if (r2 != r3) goto L_0x0070
            goto L_0x00fa
        L_0x0070:
            if (r2 != r10) goto L_0x007a
            r0 = 619(0x26b, float:8.67E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ SecurityException -> 0x010a }
            goto L_0x00fc
        L_0x007a:
            android.util.Log.isLoggable(r8, r9)     // Catch:{ SecurityException -> 0x010a }
            X.7Lw r0 = new X.7Lw     // Catch:{ SecurityException -> 0x010a }
            r0.<init>(r6, r5)     // Catch:{ SecurityException -> 0x010a }
            r6.A01 = r0     // Catch:{ SecurityException -> 0x010a }
            java.lang.String r0 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            android.content.Intent r11 = X.C18250wR.A05(r0)     // Catch:{ SecurityException -> 0x010a }
            java.lang.String r12 = "com.android.vending"
            java.lang.String r1 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ SecurityException -> 0x010a }
            r0.<init>(r12, r1)     // Catch:{ SecurityException -> 0x010a }
            r11.setComponent(r0)     // Catch:{ SecurityException -> 0x010a }
            android.content.Context r2 = r6.A03     // Catch:{ SecurityException -> 0x010a }
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch:{ SecurityException -> 0x010a }
            java.util.List r1 = r0.queryIntentServices(r11, r7)     // Catch:{ SecurityException -> 0x010a }
            r10 = 2
            if (r1 == 0) goto L_0x00f4
            boolean r0 = r1.isEmpty()     // Catch:{ SecurityException -> 0x010a }
            if (r0 != 0) goto L_0x00f4
            java.lang.Object r0 = r1.get(r7)     // Catch:{ SecurityException -> 0x010a }
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ SecurityException -> 0x010a }
            android.content.pm.ServiceInfo r1 = r0.serviceInfo     // Catch:{ SecurityException -> 0x010a }
            if (r1 == 0) goto L_0x00f4
            java.lang.String r0 = r1.packageName     // Catch:{ SecurityException -> 0x010a }
            java.lang.String r1 = r1.name     // Catch:{ SecurityException -> 0x010a }
            boolean r0 = r12.equals(r0)     // Catch:{ SecurityException -> 0x010a }
            if (r0 == 0) goto L_0x00ec
            if (r1 == 0) goto L_0x00ec
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch:{ SecurityException -> 0x010a }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r12, r0)     // Catch:{ NameNotFoundException -> 0x00ec }
            int r1 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x00ec }
            r0 = 80837300(0x4d17ab4, float:4.924835E-36)
            if (r1 < r0) goto L_0x00ec
            android.content.Intent r1 = new android.content.Intent     // Catch:{ SecurityException -> 0x010a }
            r1.<init>(r11)     // Catch:{ SecurityException -> 0x010a }
            android.content.ServiceConnection r0 = r6.A01     // Catch:{ SecurityException -> 0x010a }
            boolean r0 = r2.bindService(r1, r0, r3)     // Catch:{ SecurityException -> 0x010a }
            if (r0 == 0) goto L_0x00e1
            android.util.Log.isLoggable(r8, r9)     // Catch:{ SecurityException -> 0x010a }
            return
        L_0x00e1:
            java.lang.String r0 = "Connection to service is blocked."
            X.C86144wL.A1R(r0)     // Catch:{ SecurityException -> 0x010a }
            r6.A00 = r7     // Catch:{ SecurityException -> 0x010a }
            r5.A00(r3)     // Catch:{ SecurityException -> 0x010a }
            return
        L_0x00ec:
            java.lang.String r0 = "Play Store missing or incompatible. Version 8.3.73 or later required."
            X.C86144wL.A1R(r0)     // Catch:{ SecurityException -> 0x010a }
            r6.A00 = r7     // Catch:{ SecurityException -> 0x010a }
            goto L_0x00ff
        L_0x00f4:
            r6.A00 = r7     // Catch:{ SecurityException -> 0x010a }
            android.util.Log.isLoggable(r8, r9)     // Catch:{ SecurityException -> 0x010a }
            goto L_0x00ff
        L_0x00fa:
            java.lang.String r0 = "Client is already in the process of connecting to the service."
        L_0x00fc:
            X.C86144wL.A1R(r0)     // Catch:{ SecurityException -> 0x010a }
        L_0x00ff:
            r5.A00(r10)     // Catch:{ SecurityException -> 0x010a }
            return
        L_0x0103:
            java.lang.String r0 = "Please provide a valid Context."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x010a:
            java.lang.String r1 = "SECURITY_EXCEPTION"
            X.0i6 r0 = r13.A01
            X.C54162z0.A00(r0, r4, r1, r4)
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130557qH.A00():void");
    }

    public C130557qH(Context context, C10300i6 r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
