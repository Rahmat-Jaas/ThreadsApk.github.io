package X;

import java.io.FileFilter;

/* renamed from: X.732  reason: invalid class name */
public final class AnonymousClass732 {
    public static final FileFilter A00 = new C134657y8();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        if (r4 != null) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0051 A[SYNTHETIC, Splitter:B:36:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0056 A[Catch:{ IOException -> 0x0065 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x005b A[Catch:{ IOException -> 0x0065 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.lang.String r6) {
        /*
            android.os.StrictMode$ThreadPolicy r5 = android.os.StrictMode.allowThreadDiskReads()
            r1 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004a, all -> 0x0038 }
            r4.<init>(r6)     // Catch:{ IOException -> 0x004a, all -> 0x0038 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x004d, all -> 0x0036 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x004d, all -> 0x0036 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x004e, all -> 0x0034 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x004e, all -> 0x0034 }
            java.lang.String r1 = r2.readLine()     // Catch:{ IOException -> 0x0032, all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
            java.lang.String r0 = "0-[\\d]+$"
            boolean r0 = r1.matches(r0)     // Catch:{ IOException -> 0x0032, all -> 0x0030 }
            if (r0 == 0) goto L_0x002e
            r0 = 2
            java.lang.String r0 = r1.substring(r0)     // Catch:{ IOException -> 0x0032, all -> 0x0030 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ IOException -> 0x0032, all -> 0x0030 }
            int r0 = r0 + 1
            goto L_0x005c
        L_0x002e:
            r0 = -1
            goto L_0x005c
        L_0x0030:
            r0 = move-exception
            goto L_0x003d
        L_0x0032:
            r1 = r2
            goto L_0x004e
        L_0x0034:
            r0 = move-exception
            goto L_0x0040
        L_0x0036:
            r0 = move-exception
            goto L_0x003a
        L_0x0038:
            r0 = move-exception
            r4 = r1
        L_0x003a:
            if (r4 == 0) goto L_0x0046
            goto L_0x0043
        L_0x003d:
            r2.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0040:
            r3.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0043:
            r4.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            android.os.StrictMode.setThreadPolicy(r5)
            throw r0
        L_0x004a:
            r3 = r1
            r4 = r1
            goto L_0x004e
        L_0x004d:
            r3 = r1
        L_0x004e:
            r0 = -1
            if (r1 == 0) goto L_0x0054
            r1.close()     // Catch:{ IOException -> 0x0065 }
        L_0x0054:
            if (r3 == 0) goto L_0x0059
            r3.close()     // Catch:{ IOException -> 0x0065 }
        L_0x0059:
            if (r4 == 0) goto L_0x0065
            goto L_0x0062
        L_0x005c:
            r2.close()     // Catch:{ IOException -> 0x0065 }
            r3.close()     // Catch:{ IOException -> 0x0065 }
        L_0x0062:
            r4.close()     // Catch:{ IOException -> 0x0065 }
        L_0x0065:
            android.os.StrictMode.setThreadPolicy(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass732.A00(java.lang.String):int");
    }
}
