package X;

import android.system.Os;
import android.system.OsConstants;
import java.util.Locale;

/* renamed from: X.7Co  reason: invalid class name and case insensitive filesystem */
public final class C120807Co {
    public static long A00;
    public static boolean A01;

    public static double A00(String[] strArr, int i, long j) {
        if (i >= strArr.length) {
            return 0.0d;
        }
        if (j > 0) {
            String str = strArr[i];
            try {
                return ((double) Long.parseLong(str)) / ((double) j);
            } catch (NumberFormatException e) {
                AnonymousClass0LU.A0G("CpuInfoUtils", String.format(Locale.US, "Error parsing %d /proc/[pid]/stat field as long: %s", new Object[]{Integer.valueOf(i), str}), e);
                return 0.0d;
            }
        } else {
            throw C18190wL.A0a("clockTicksPerSecond should be positive.");
        }
    }

    public static C113536ra A01(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        if (!A01) {
            A00 = Os.sysconf(OsConstants._SC_CLK_TCK);
            A01 = true;
        }
        long j = A00;
        double A002 = A00(strArr, 13, j);
        double A003 = A00(strArr, 14, j);
        A00(strArr, 15, j);
        A00(strArr, 16, j);
        return new C113536ra(A002, A003);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f A[Catch:{ all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007a A[SYNTHETIC, Splitter:B:34:0x007a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] A02(java.lang.String r9) {
        /*
            java.lang.String r5 = "Error closing procfs file: %s"
            java.io.File r0 = X.C86144wL.A0Z(r9)
            boolean r0 = r0.exists()
            r8 = 0
            if (r0 != 0) goto L_0x0019
            java.lang.String r1 = "CpuInfoUtils"
            java.lang.String r0 = "stat file not found "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r9)
            X.AnonymousClass0LU.A0C(r1, r0)
        L_0x0018:
            return r8
        L_0x0019:
            android.os.StrictMode$ThreadPolicy r7 = android.os.StrictMode.allowThreadDiskReads()
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x004a, all -> 0x0060 }
            r6.<init>(r9, r0)     // Catch:{ Exception -> 0x004a, all -> 0x0060 }
            java.lang.String r3 = r6.readLine()     // Catch:{ Exception -> 0x0048 }
            r6.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x003c
        L_0x002c:
            r2 = move-exception
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[]{r9}
            java.lang.String r1 = java.lang.String.format(r1, r5, r0)
            java.lang.String r0 = "CpuInfoUtils"
            X.AnonymousClass0LU.A0G(r0, r1, r2)
        L_0x003c:
            android.os.StrictMode.setThreadPolicy(r7)
            if (r3 == 0) goto L_0x0018
            java.lang.String r0 = " "
            java.lang.String[] r8 = r3.split(r0)
            return r8
        L_0x0048:
            r4 = move-exception
            goto L_0x004c
        L_0x004a:
            r4 = move-exception
            r6 = r8
        L_0x004c:
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = "Error reading cpu time from procfs file: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r9}     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = java.lang.String.format(r3, r1, r0)     // Catch:{ all -> 0x0077 }
            java.lang.String r2 = "CpuInfoUtils"
            X.AnonymousClass0LU.A0G(r2, r0, r4)     // Catch:{ all -> 0x0077 }
            if (r6 == 0) goto L_0x0018
            goto L_0x0063
        L_0x0060:
            r3 = move-exception
            r6 = r8
            goto L_0x0078
        L_0x0063:
            r6.close()     // Catch:{ IOException -> 0x0067 }
            goto L_0x0073
        L_0x0067:
            r1 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r9}
            java.lang.String r0 = java.lang.String.format(r3, r5, r0)
            X.AnonymousClass0LU.A0G(r2, r0, r1)
        L_0x0073:
            android.os.StrictMode.setThreadPolicy(r7)
            return r8
        L_0x0077:
            r3 = move-exception
        L_0x0078:
            if (r6 == 0) goto L_0x0091
            r6.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x008e
        L_0x007e:
            r2 = move-exception
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[]{r9}
            java.lang.String r1 = java.lang.String.format(r1, r5, r0)
            java.lang.String r0 = "CpuInfoUtils"
            X.AnonymousClass0LU.A0G(r0, r1, r2)
        L_0x008e:
            android.os.StrictMode.setThreadPolicy(r7)
        L_0x0091:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120807Co.A02(java.lang.String):java.lang.String[]");
    }
}
