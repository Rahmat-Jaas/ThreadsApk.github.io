package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.0PS  reason: invalid class name */
public final class AnonymousClass0PS {
    /* JADX WARNING: Can't wrap try/catch for region: R(6:53|52|54|55|56|57) */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e8, code lost:
        r5 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C04830Ph A00(android.content.Context r7, java.lang.String r8, int r9) {
        /*
            java.lang.String r2 = "RtiGracefulSystemMethodHelper"
            X.0Ph r4 = new X.0Ph
            r4.<init>(r8)
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            r4.A01 = r0     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            if (r0 == 0) goto L_0x0099
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            if (r0 == 0) goto L_0x0099
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            if (r0 == 0) goto L_0x0081
            java.lang.Object r3 = X.C17250ua.A00     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            X.0m4 r3 = (X.C12530m4) r3     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            java.lang.String r0 = r3.A05     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            boolean r0 = r0.equals(r8)     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            r1 = 1
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = r3.A04     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            boolean r0 = r0.equals(r8)     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            if (r0 != 0) goto L_0x0058
            java.lang.String r1 = "com.facebook.rti.fbns.intent.RECEIVE"
            android.content.Intent r0 = new android.content.Intent     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            r0.<init>(r1)     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            android.content.Intent r3 = r0.setPackage(r8)     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch:{ RuntimeException -> 0x0047 }
            r0 = 0
            java.util.List r0 = r1.queryBroadcastReceivers(r3, r0)     // Catch:{ RuntimeException -> 0x0047 }
            if (r0 == 0) goto L_0x0056
            goto L_0x005d
        L_0x0047:
            r1 = move-exception
            java.lang.String r0 = "Failed to queryBroadcastReceivers"
            X.AnonymousClass0LU.A0F(r2, r0, r1)     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            boolean r0 = r0 instanceof android.os.DeadObjectException     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            if (r0 != 0) goto L_0x0056
            throw r1     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
        L_0x0056:
            r1 = 0
            goto L_0x0067
        L_0x0058:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            goto L_0x0067
        L_0x005d:
            boolean r0 = r0.isEmpty()     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            r0 = r0 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
        L_0x0067:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            boolean r0 = r0.equals(r1)     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            if (r0 == 0) goto L_0x0074
            java.lang.Integer r0 = X.AnonymousClass006.A0Y     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            r4.A02 = r0     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            goto L_0x0099
        L_0x0074:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            boolean r0 = r0.equals(r1)     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            if (r0 == 0) goto L_0x0099
            java.lang.Integer r0 = X.AnonymousClass006.A0N     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            r4.A02 = r0     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            goto L_0x0099
        L_0x0081:
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            r4.A02 = r0     // Catch:{ NameNotFoundException -> 0x0095, RuntimeException -> 0x0086 }
            goto L_0x0099
        L_0x0086:
            r1 = move-exception
            java.lang.String r0 = "Failed to getPackageInfo"
            X.AnonymousClass0LU.A0F(r2, r0, r1)
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 != 0) goto L_0x0099
            throw r1
        L_0x0095:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r4.A02 = r0
        L_0x0099:
            r0 = r9 & 64
            if (r0 == 0) goto L_0x0151
            java.lang.Integer r1 = r4.A02
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            if (r1 != r0) goto L_0x0151
            android.content.pm.PackageInfo r0 = r4.A01
            if (r0 == 0) goto L_0x0151
            android.content.pm.PackageInfo r0 = r4.A01
            android.content.pm.Signature[] r2 = r0.signatures
            if (r2 == 0) goto L_0x00e6
            int r1 = r2.length
            r0 = 1
            if (r1 != r0) goto L_0x00e6
            r6 = 0
            r0 = r2[r6]
            byte[] r5 = r0.toByteArray()
            java.lang.String r3 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x00bf }
            goto L_0x00d7
        L_0x00bf:
            java.lang.String r0 = "org.apache.harmony.security.fortress.Services"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r1 = "setNeedRefresh"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x00d3 }
            java.lang.reflect.Method r2 = r2.getMethod(r1, r0)     // Catch:{ Exception -> 0x00d3 }
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00d3 }
            r2.invoke(r1, r0)     // Catch:{ Exception -> 0x00d3 }
        L_0x00d3:
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x00e8 }
        L_0x00d7:
            int r0 = r5.length     // Catch:{ NoSuchAlgorithmException -> 0x00e8 }
            r1.update(r5, r6, r0)     // Catch:{ NoSuchAlgorithmException -> 0x00e8 }
            byte[] r1 = r1.digest()     // Catch:{ NoSuchAlgorithmException -> 0x00e8 }
            r0 = 11
            java.lang.String r5 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x00e8 }
            goto L_0x00e9
        L_0x00e6:
            r5 = 0
            goto L_0x00e9
        L_0x00e8:
            r5 = 0
        L_0x00e9:
            java.lang.Object r2 = X.C17250ua.A00
            X.0m4 r2 = (X.C12530m4) r2
            X.0PL r0 = X.AnonymousClass0PL.A00(r7)
            boolean r0 = r0.A02
            r1 = r0 ^ 1
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.Set r0 = r2.A07
            if (r1 != 0) goto L_0x012d
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0107:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0129
            java.lang.Object r1 = r2.next()
            java.util.Map r0 = X.C15470rN.A1G
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L_0x0125
            X.0rM r0 = X.C15470rN.A0Z
            X.0rM[] r0 = new X.C15460rM[]{r0}
            java.util.Set r0 = X.C15470rN.A00(r0)
        L_0x0125:
            r3.addAll(r0)
            goto L_0x0107
        L_0x0129:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r3)
        L_0x012d:
            java.util.Iterator r1 = r0.iterator()
        L_0x0131:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0143
            java.lang.Object r0 = r1.next()
            X.0rM r0 = (X.C15460rM) r0
            java.lang.String r0 = r0.A00
            r6.add(r0)
            goto L_0x0131
        L_0x0143:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r6)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0152
            java.lang.Integer r0 = X.AnonymousClass006.A0u
        L_0x014f:
            r4.A02 = r0
        L_0x0151:
            return r4
        L_0x0152:
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            goto L_0x014f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PS.A00(android.content.Context, java.lang.String, int):X.0Ph");
    }

    public static boolean A01(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.equals(context.getPackageName()) && A00(context, str, 64).A02 != AnonymousClass006.A0u) {
            return false;
        }
        return true;
    }
}
