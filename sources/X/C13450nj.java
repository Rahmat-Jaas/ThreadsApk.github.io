package X;

/* renamed from: X.0nj  reason: invalid class name and case insensitive filesystem */
public final class C13450nj {
    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|15|16|17|(3:19|21|(2:23|30)(1:32))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0050 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056 A[Catch:{ NameNotFoundException -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060 A[Catch:{ NameNotFoundException -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0063 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Set A00(android.content.Context r8) {
        /*
            java.lang.String r5 = "InstalledSplitUtil"
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r0 = r8.getPackageName()     // Catch:{ NameNotFoundException -> 0x0067 }
            r7 = 0
            android.content.pm.PackageInfo r6 = r1.getPackageInfo(r0, r7)     // Catch:{ NameNotFoundException -> 0x0067 }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ NameNotFoundException -> 0x0067 }
            r4.<init>()     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r6 == 0) goto L_0x0066
            java.lang.String[] r0 = r6.splitNames     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r0 == 0) goto L_0x0066
            r3 = 0
        L_0x001b:
            java.lang.String[] r1 = r6.splitNames     // Catch:{ NameNotFoundException -> 0x0067 }
            int r0 = r1.length     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r3 >= r0) goto L_0x0066
            r0 = r1[r3]     // Catch:{ NameNotFoundException -> 0x0067 }
            r4.add(r0)     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String[] r0 = r6.splitNames     // Catch:{ NameNotFoundException -> 0x0067 }
            r0 = r0[r3]     // Catch:{ NameNotFoundException -> 0x0067 }
            boolean r0 = X.C13440nh.A00(r0, r8)     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r0 != 0) goto L_0x003d
            java.lang.String r1 = "Module %s is marked as installed through package manager but the split file does not exist at the expected location"
            java.lang.String[] r0 = r6.splitNames     // Catch:{ NameNotFoundException -> 0x0067 }
            r0 = r0[r3]     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NameNotFoundException -> 0x0067 }
            X.AnonymousClass0LU.A0P(r5, r1, r0)     // Catch:{ NameNotFoundException -> 0x0067 }
            goto L_0x0063
        L_0x003d:
            java.lang.String[] r0 = r6.splitNames     // Catch:{ NameNotFoundException -> 0x0067 }
            r2 = r0[r3]     // Catch:{ NameNotFoundException -> 0x0067 }
            r0 = r8
            java.lang.String r1 = com.facebook.voltron.runtime.ModuleApkUtil$ModuleResolver.A00(r8, r2)     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r1 != 0) goto L_0x0057
            java.lang.String r1 = r8.getPackageName()     // Catch:{ NameNotFoundException -> 0x0050 }
            android.content.Context r0 = r8.createPackageContext(r1, r7)     // Catch:{ NameNotFoundException -> 0x0050 }
        L_0x0050:
            java.lang.String r1 = com.facebook.voltron.runtime.ModuleApkUtil$ModuleResolver.A00(r0, r2)     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r1 != 0) goto L_0x0057
            goto L_0x005d
        L_0x0057:
            java.io.File r0 = new java.io.File     // Catch:{ NameNotFoundException -> 0x0067 }
            r0.<init>(r1)     // Catch:{ NameNotFoundException -> 0x0067 }
            goto L_0x005e
        L_0x005d:
            r0 = 0
        L_0x005e:
            if (r0 == 0) goto L_0x0063
            r0.toString()     // Catch:{ NameNotFoundException -> 0x0067 }
        L_0x0063:
            int r3 = r3 + 1
            goto L_0x001b
        L_0x0066:
            return r4
        L_0x0067:
            r1 = move-exception
            java.lang.String r0 = "our package is not found in the package manager!"
            X.AnonymousClass0LU.A0I(r5, r0, r1)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13450nj.A00(android.content.Context):java.util.Set");
    }
}
