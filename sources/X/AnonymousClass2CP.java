package X;

/* renamed from: X.2CP  reason: invalid class name */
public final class AnonymousClass2CP {
    /* JADX WARNING: Can't wrap try/catch for region: R(3:47|48|49) */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0096, code lost:
        return new X.AnonymousClass3FG(X.AnonymousClass006.A0Y, false, false);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x008f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:8:0x0029=Splitter:B:8:0x0029, B:47:0x008f=Splitter:B:47:0x008f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3FG A00(android.content.Context r7) {
        /*
            android.content.pm.PackageManager r3 = r7.getPackageManager()
            java.lang.String r6 = "com.facebook.appmanager"
            java.lang.String r0 = "com.facebook.oxygen.appmanager.firstparty.tos.ShouldAcceptTos"
            android.content.ComponentName r5 = new android.content.ComponentName
            r5.<init>(r6, r0)
            java.lang.String r0 = "com.facebook.oxygen.appmanager.firstparty.tos.ShouldShowExplicitTos"
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r6, r0)
            r4 = 0
            int r1 = r3.getComponentEnabledSetting(r5)     // Catch:{ IllegalArgumentException -> 0x00ce }
            int r0 = r3.getComponentEnabledSetting(r2)     // Catch:{ IllegalArgumentException -> 0x00ce }
            r3 = 1
            if (r1 == 0) goto L_0x0031
            if (r0 == 0) goto L_0x0031
            boolean r2 = X.AnonymousClass0wJ.A1T(r1, r3)
            if (r0 == r3) goto L_0x0029
            r3 = 0
        L_0x0029:
            java.lang.Integer r0 = X.AnonymousClass006.A01     // Catch:{ IllegalArgumentException -> 0x00ce }
            X.3FG r1 = new X.3FG     // Catch:{ IllegalArgumentException -> 0x00ce }
            r1.<init>(r0, r2, r3)     // Catch:{ IllegalArgumentException -> 0x00ce }
            return r1
        L_0x0031:
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ IllegalArgumentException -> 0x00ce }
            r0.getReceiverInfo(r5, r4)     // Catch:{ NameNotFoundException -> 0x0063 }
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ IllegalArgumentException -> 0x00ce }
            r0.getReceiverInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x0063 }
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ IllegalArgumentException -> 0x00ce }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r6, r4)     // Catch:{ NameNotFoundException -> 0x005b }
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch:{ IllegalArgumentException -> 0x00ce }
            int r1 = r0.flags     // Catch:{ IllegalArgumentException -> 0x00ce }
            r0 = r1 & 1
            if (r0 != 0) goto L_0x0053
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x005b
        L_0x0053:
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ IllegalArgumentException -> 0x00ce }
            X.3FG r1 = new X.3FG     // Catch:{ IllegalArgumentException -> 0x00ce }
            r1.<init>(r0, r3, r3)     // Catch:{ IllegalArgumentException -> 0x00ce }
            return r1
        L_0x005b:
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ IllegalArgumentException -> 0x00ce }
            X.3FG r1 = new X.3FG     // Catch:{ IllegalArgumentException -> 0x00ce }
            r1.<init>(r0, r3, r4)     // Catch:{ IllegalArgumentException -> 0x00ce }
            return r1
        L_0x0063:
            android.content.pm.PackageManager r2 = r7.getPackageManager()     // Catch:{ IllegalArgumentException -> 0x00ce }
            java.lang.String r0 = "com.facebook.oxygen.appmanager.firstparty.tos.ShouldShowTos"
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ IllegalArgumentException -> 0x00ce }
            r1.<init>(r6, r0)     // Catch:{ IllegalArgumentException -> 0x00ce }
            int r0 = r2.getComponentEnabledSetting(r1)     // Catch:{ IllegalArgumentException -> 0x008f }
            r2 = 1
            if (r0 != 0) goto L_0x0084
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ IllegalArgumentException -> 0x008f }
            r0.getReceiverInfo(r1, r4)     // Catch:{ all -> 0x0097 }
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ IllegalArgumentException -> 0x008f }
            X.3FG r1 = new X.3FG     // Catch:{ IllegalArgumentException -> 0x008f }
            r1.<init>(r0, r3, r3)     // Catch:{ IllegalArgumentException -> 0x008f }
            return r1
        L_0x0084:
            if (r0 == r3) goto L_0x0087
            r2 = 0
        L_0x0087:
            java.lang.Integer r0 = X.AnonymousClass006.A01     // Catch:{ IllegalArgumentException -> 0x008f }
            X.3FG r1 = new X.3FG     // Catch:{ IllegalArgumentException -> 0x008f }
            r1.<init>(r0, r2, r2)     // Catch:{ IllegalArgumentException -> 0x008f }
            return r1
        L_0x008f:
            java.lang.Integer r0 = X.AnonymousClass006.A0Y     // Catch:{ IllegalArgumentException -> 0x00ce }
            X.3FG r1 = new X.3FG     // Catch:{ IllegalArgumentException -> 0x00ce }
            r1.<init>(r0, r4, r4)     // Catch:{ IllegalArgumentException -> 0x00ce }
            return r1
        L_0x0097:
            java.lang.String r0 = "phone"
            java.lang.Object r3 = r7.getSystemService(r0)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            int r1 = r3.getSimState()
            r2 = 1
            r0 = 5
            if (r1 != r0) goto L_0x00c6
            java.lang.String r1 = r3.getSimOperator()
            java.lang.String r0 = "2"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "302"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00c3
            java.lang.Integer r0 = X.AnonymousClass006.A15
            X.3FG r1 = new X.3FG
            r1.<init>(r0, r2, r4)
            return r1
        L_0x00c3:
            java.lang.Integer r0 = X.AnonymousClass006.A0u
            goto L_0x00c8
        L_0x00c6:
            java.lang.Integer r0 = X.AnonymousClass006.A0j
        L_0x00c8:
            X.3FG r1 = new X.3FG
            r1.<init>(r0, r2, r2)
            return r1
        L_0x00ce:
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            X.3FG r1 = new X.3FG
            r1.<init>(r0, r4, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2CP.A00(android.content.Context):X.3FG");
    }
}
