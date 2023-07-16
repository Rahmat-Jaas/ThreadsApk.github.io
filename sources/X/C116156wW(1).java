package X;

/* renamed from: X.6wW  reason: invalid class name and case insensitive filesystem */
public final class C116156wW {
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map A00() {
        /*
            r11 = 0
            android.os.StrictMode$ThreadPolicy r10 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r8 = "/proc/self/task"
            java.util.HashMap r9 = X.AnonymousClass0wJ.A0y()     // Catch:{ Exception -> 0x00a7 }
            r7 = 0
            java.io.File r7 = X.C86144wL.A0Z(r8)     // Catch:{ Exception -> 0x004b }
            java.io.File[] r6 = r7.listFiles()     // Catch:{ Exception -> 0x004b }
            if (r6 == 0) goto L_0x0047
            int r5 = r6.length     // Catch:{ Exception -> 0x004b }
            r4 = 0
        L_0x0018:
            if (r4 >= r5) goto L_0x0047
            r3 = r6[r4]     // Catch:{ Exception -> 0x004b }
            java.lang.String r1 = r3.getName()     // Catch:{ Exception -> 0x004b }
            java.lang.String r0 = "/proc/self/task/%s/comm"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r0, (java.lang.Object) r1)     // Catch:{ Exception -> 0x004b }
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x003a }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x003a }
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0035 }
            r2.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003b
        L_0x0035:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            r1 = 0
        L_0x003b:
            if (r1 == 0) goto L_0x0044
            java.lang.String r0 = r3.getName()     // Catch:{ Exception -> 0x004b }
            r9.put(r0, r1)     // Catch:{ Exception -> 0x004b }
        L_0x0044:
            int r4 = r4 + 1
            goto L_0x0018
        L_0x0047:
            android.os.StrictMode.setThreadPolicy(r10)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x005d
        L_0x004b:
            r2 = move-exception
            java.lang.String r0 = "Error getting threads from task directory: %s"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r0, (java.lang.Object) r8)     // Catch:{ all -> 0x00a0 }
            java.lang.Class<X.6wW> r0 = X.C116156wW.class
            X.AnonymousClass0LU.A04(r0, r1, r2)     // Catch:{ all -> 0x00a0 }
            if (r7 == 0) goto L_0x005c
            android.os.StrictMode.setThreadPolicy(r10)     // Catch:{ Exception -> 0x00a7 }
        L_0x005c:
            r9 = r11
        L_0x005d:
            if (r9 != 0) goto L_0x0060
            return r11
        L_0x0060:
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()     // Catch:{ Exception -> 0x00a7 }
            java.util.Iterator r5 = X.AnonymousClass0wJ.A0z(r9)     // Catch:{ Exception -> 0x00a7 }
        L_0x0068:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x00a7 }
            if (r0 == 0) goto L_0x009f
            java.util.Map$Entry r4 = X.C18180wK.A0o(r5)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r2 = "/proc/%d/task/%s/stat"
            int r0 = android.os.Process.myPid()     // Catch:{ Exception -> 0x00a7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00a7 }
            java.lang.Object r0 = r4.getKey()     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r2, r1, r0)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String[] r0 = X.C120807Co.A02(r0)     // Catch:{ Exception -> 0x00a7 }
            X.6ra r3 = X.C120807Co.A01(r0)     // Catch:{ Exception -> 0x00a7 }
            if (r3 == 0) goto L_0x0068
            java.lang.String r2 = X.C18200wM.A0p(r4)     // Catch:{ Exception -> 0x00a7 }
            java.lang.Object r1 = r4.getValue()     // Catch:{ Exception -> 0x00a7 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ Exception -> 0x00a7 }
            r0.<init>(r1, r3)     // Catch:{ Exception -> 0x00a7 }
            r6.put(r2, r0)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x0068
        L_0x009f:
            return r6
        L_0x00a0:
            r0 = move-exception
            if (r7 == 0) goto L_0x00a6
            android.os.StrictMode.setThreadPolicy(r10)     // Catch:{ Exception -> 0x00a7 }
        L_0x00a6:
            throw r0     // Catch:{ Exception -> 0x00a7 }
        L_0x00a7:
            r2 = move-exception
            java.lang.Class<X.6wW> r1 = X.C116156wW.class
            java.lang.String r0 = "Error getting thread level CPU Usage data"
            X.AnonymousClass0LU.A03(r1, r0, r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116156wW.A00():java.util.Map");
    }
}
