package X;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;

/* renamed from: X.0ev  reason: invalid class name and case insensitive filesystem */
public final class C09140ev {
    public static final long A01 = System.currentTimeMillis();
    public static final C09140ev A02 = new C09140ev();
    public static final String[] A03 = {"9774d56d682e549c", "9d1d1f0dfa440886", "fc067667235b8f19"};
    public String A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(12:15|(1:17)|18|19|20|21|22|23|24|25|26|(1:28)(4:32|33|34|37)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00a8 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8 A[Catch:{ IOException -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String A05(android.content.Context r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = r10.A00     // Catch:{ all -> 0x00d8 }
            boolean r0 = A03(r0)     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r10.A00     // Catch:{ all -> 0x00d8 }
            r0.getClass()     // Catch:{ all -> 0x00d8 }
            goto L_0x00c2
        L_0x0010:
            java.lang.String r0 = "/mnt/sdcard/.profig.os"
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x00d8 }
            r5.<init>(r0)     // Catch:{ all -> 0x00d8 }
            java.io.File r1 = r11.getFilesDir()     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "INSTALLATION"
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x00d8 }
            r4.<init>(r1, r0)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = A01(r5)     // Catch:{ all -> 0x00d8 }
            r10.A00 = r0     // Catch:{ all -> 0x00d8 }
            boolean r0 = A03(r0)     // Catch:{ all -> 0x00d8 }
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = A01(r4)     // Catch:{ all -> 0x00d8 }
            r10.A00 = r0     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x0048
            A02(r5, r0)     // Catch:{ all -> 0x00d8 }
            goto L_0x0048
        L_0x003a:
            boolean r0 = r4.exists()     // Catch:{ all -> 0x00d8 }
            if (r0 != 0) goto L_0x0048
            java.lang.String r0 = r10.A00     // Catch:{ all -> 0x00d8 }
            r0.getClass()     // Catch:{ all -> 0x00d8 }
            A02(r4, r0)     // Catch:{ all -> 0x00d8 }
        L_0x0048:
            java.lang.String r0 = r10.A00     // Catch:{ all -> 0x00d8 }
            boolean r0 = A03(r0)     // Catch:{ all -> 0x00d8 }
            if (r0 != 0) goto L_0x00bd
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x00d8 }
            java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "-"
            java.lang.String[] r9 = r3.split(r0)     // Catch:{ all -> 0x00d8 }
            int r1 = r9.length     // Catch:{ all -> 0x00d8 }
            r0 = 2
            if (r1 < r0) goto L_0x008d
            java.util.Random r1 = new java.util.Random     // Catch:{ all -> 0x00d8 }
            r1.<init>()     // Catch:{ all -> 0x00d8 }
            r0 = 15
            int r0 = r1.nextInt(r0)     // Catch:{ all -> 0x00d8 }
            java.lang.String r8 = java.lang.Integer.toHexString(r0)     // Catch:{ all -> 0x00d8 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d8 }
            long r0 = A01     // Catch:{ all -> 0x00d8 }
            long r6 = r6 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r0
            r0 = 1635(0x663, double:8.08E-321)
            long r6 = r6 + r0
            java.lang.String r2 = java.lang.Long.toHexString(r6)     // Catch:{ all -> 0x00d8 }
            r0 = 1
            r1 = r9[r0]     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r8, r2)     // Catch:{ all -> 0x00d8 }
            java.lang.String r3 = r3.replaceFirst(r1, r0)     // Catch:{ all -> 0x00d8 }
        L_0x008d:
            java.lang.Class<X.0ev> r6 = X.C09140ev.class
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00cc }
            r1.<init>(r4)     // Catch:{ IOException -> 0x00cc }
            r3.getClass()     // Catch:{ IOException -> 0x00cc }
            byte[] r0 = r3.getBytes()     // Catch:{ IOException -> 0x00cc }
            r1.write(r0)     // Catch:{ IOException -> 0x00cc }
            r1.flush()     // Catch:{ IOException -> 0x00cc }
            java.io.FileDescriptor r0 = r1.getFD()     // Catch:{ IOException -> 0x00a8 }
            r0.sync()     // Catch:{ IOException -> 0x00a8 }
        L_0x00a8:
            r1.close()     // Catch:{ IOException -> 0x00cc }
            A02(r5, r3)     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = A01(r4)     // Catch:{ all -> 0x00d8 }
            boolean r0 = A03(r1)     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x00c4
            r1.getClass()     // Catch:{ all -> 0x00d8 }
            r10.A00 = r1     // Catch:{ all -> 0x00d8 }
        L_0x00bd:
            java.lang.String r0 = r10.A00     // Catch:{ all -> 0x00d8 }
            r0.getClass()     // Catch:{ all -> 0x00d8 }
        L_0x00c2:
            monitor-exit(r10)
            return r0
        L_0x00c4:
            java.lang.String r0 = "Failed to read installation file and create a valid UUID"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00d8 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d8 }
            goto L_0x00d7
        L_0x00cc:
            r2 = move-exception
            java.lang.String r0 = "Failed to generate internal installation file."
            X.AnonymousClass0LU.A03(r6, r0, r2)     // Catch:{ all -> 0x00d8 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00d8 }
            r1.<init>(r2)     // Catch:{ all -> 0x00d8 }
        L_0x00d7:
            throw r1     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09140ev.A05(android.content.Context):java.lang.String");
    }

    public static final String A00(Context context) {
        String str;
        if (context != null) {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            String[] strArr = A03;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (strArr[i].equalsIgnoreCase(str)) {
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        str = "";
        return AnonymousClass00U.A0L("android-", str);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(java.io.File r2, java.lang.String r3) {
        /*
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0019 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0019 }
            byte[] r0 = r3.getBytes()     // Catch:{ IOException -> 0x0019 }
            r1.write(r0)     // Catch:{ IOException -> 0x0019 }
            r1.flush()     // Catch:{ IOException -> 0x0019 }
            java.io.FileDescriptor r0 = r1.getFD()     // Catch:{ IOException -> 0x0016 }
            r0.sync()     // Catch:{ IOException -> 0x0016 }
        L_0x0016:
            r1.close()     // Catch:{ IOException -> 0x0019 }
        L_0x0019:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09140ev.A02(java.io.File, java.lang.String):void");
    }

    public static boolean A03(String str) {
        if (str == null || TextUtils.isEmpty(str) || !str.matches("[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(java.io.File r5) {
        /*
            boolean r0 = r5.exists()
            r4 = 0
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0026 }
            r3.<init>(r5, r0)     // Catch:{ IOException -> 0x0026 }
            long r1 = r3.length()     // Catch:{ all -> 0x0021 }
            int r0 = (int) r1     // Catch:{ all -> 0x0021 }
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0021 }
            r3.readFully(r1)     // Catch:{ all -> 0x0021 }
            r3.close()     // Catch:{ IOException -> 0x0026 }
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
        L_0x0021:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09140ev.A01(java.io.File):java.lang.String");
    }

    public final String A04(Context context) {
        try {
            return A05(context);
        } catch (RuntimeException e) {
            AnonymousClass0LU.A07(C09140ev.class, "Failed to get custom UUID", e, new Object[0]);
            return null;
        }
    }
}
