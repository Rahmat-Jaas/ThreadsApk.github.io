package X;

/* renamed from: X.6Pj  reason: invalid class name and case insensitive filesystem */
public final class C100966Pj {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.reflect.InvocationTargetException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: java.lang.IllegalArgumentException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: java.lang.IllegalStateException} */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e5, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ff, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0100, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0108, code lost:
        throw new X.AnonymousClass665(r7.A02, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0109, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x010b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x010c, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x010d, code lost:
        if (r4 != null) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0112, code lost:
        if (r9 != null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0114, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0117, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e5 A[ExcHandler: 666 | IV8 (e java.lang.Throwable), Splitter:B:47:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ff A[ExcHandler: 666 | IV8 (e java.lang.Throwable), PHI: r3 r9 
      PHI: (r3v1 X.MMo) = (r3v2 X.MMo), (r3v4 X.MMo), (r3v4 X.MMo), (r3v4 X.MMo), (r3v4 X.MMo), (r3v4 X.MMo), (r3v4 X.MMo) binds: [B:61:0x00ea, B:15:0x0038, B:19:0x0042, B:43:0x00a8, B:20:?, B:22:0x0067, B:32:0x008c] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v4 java.io.InputStream) = (r9v5 java.io.InputStream), (r9v6 java.io.InputStream), (r9v6 java.io.InputStream), (r9v6 java.io.InputStream), (r9v6 java.io.InputStream), (r9v6 java.io.InputStream), (r9v6 java.io.InputStream) binds: [B:61:0x00ea, B:15:0x0038, B:19:0x0042, B:43:0x00a8, B:20:?, B:22:0x0067, B:32:0x008c] A[DONT_GENERATE, DONT_INLINE], Splitter:B:15:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x010f A[SYNTHETIC, Splitter:B:77:0x010f] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C146578mT A00(X.MIS r6, X.GJX r7, X.C147008nE r8, java.io.InputStream r9, java.lang.Class r10, boolean r11) {
        /*
            r4 = 0
            if (r9 == 0) goto L_0x00e7
            if (r11 == 0) goto L_0x001d
            r0 = 99
            java.lang.String r1 = X.AnonymousClass000.A00(r0)     // Catch:{ 666 | IV8 -> 0x00e5 }
            X.3Ud r0 = r7.A01(r1)     // Catch:{ 666 | IV8 -> 0x00e5 }
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = r0.A01     // Catch:{ 666 | IV8 -> 0x00e5 }
            if (r0 == 0) goto L_0x00bf
            java.lang.String r2 = "application/json"
            int r0 = r0.indexOf(r2)     // Catch:{ 666 | IV8 -> 0x00e5 }
            if (r0 < 0) goto L_0x00bf
        L_0x001d:
            r0 = 473(0x1d9, float:6.63E-43)
            java.lang.String r0 = X.I17.A00(r0)     // Catch:{ 666 | IV8 -> 0x00e5 }
            X.3Ud r0 = r7.A01(r0)     // Catch:{ 666 | IV8 -> 0x00e5 }
            java.io.InputStream r9 = r8.DBG(r0, r9)     // Catch:{ 666 | IV8 -> 0x00e5 }
            if (r6 == 0) goto L_0x0032
            X.MMo r3 = r6.A07(r9)     // Catch:{ 666 | IV8 -> 0x00e5 }
            goto L_0x0038
        L_0x0032:
            X.MIS r0 = X.C18987Aon.A00     // Catch:{ 666 | IV8 -> 0x00e5 }
            X.MMo r3 = r0.A07(r9)     // Catch:{ 666 | IV8 -> 0x00e5 }
        L_0x0038:
            X.LcR r0 = X.C86144wL.A0S(r3)     // Catch:{ 666 | IV8 -> 0x00ff, all -> 0x010b }
            if (r0 == 0) goto L_0x00e8
            java.lang.String r1 = "parseFromJson"
            java.lang.Class<X.MMo> r0 = X.MMo.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00ef, IllegalAccessException -> 0x00a7, 666 | IV8 -> 0x00ff }
            java.lang.reflect.Method r0 = r10.getMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00ef, IllegalAccessException -> 0x00a7, 666 | IV8 -> 0x00ff }
            java.lang.Object r2 = X.C86154wM.A0Z(r3, r4, r0)     // Catch:{ NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00ef, IllegalAccessException -> 0x00a7, 666 | IV8 -> 0x00ff }
            X.8mT r2 = (X.C146578mT) r2     // Catch:{ NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00ef, IllegalAccessException -> 0x00a7, 666 | IV8 -> 0x00ff }
            java.lang.String r0 = "response should be parsed successfully"
            X.AnonymousClass7Ko.A07(r2, r0)     // Catch:{ NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00ef, IllegalAccessException -> 0x00a7, 666 | IV8 -> 0x00ff }
            int r0 = r7.A02     // Catch:{ NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00ef, IllegalAccessException -> 0x00a7, 666 | IV8 -> 0x00ff }
            r2.setStatusCode(r0)     // Catch:{ NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00ef, IllegalAccessException -> 0x00a7, 666 | IV8 -> 0x00ff }
            r0 = 6
            java.lang.String r0 = X.I17.A00(r0)     // Catch:{ NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00ef, IllegalAccessException -> 0x00a7, 666 | IV8 -> 0x00ff }
            X.3Ud r0 = r7.A01(r0)     // Catch:{ NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00ef, IllegalAccessException -> 0x00a7, 666 | IV8 -> 0x00ff }
            boolean r0 = X.AnonymousClass0wJ.A1W(r0)
            r2.setFromDiskCache(r0)     // Catch:{ NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00ef, IllegalAccessException -> 0x00a7, 666 | IV8 -> 0x00ff }
            java.lang.String r0 = "Date"
            X.3Ud r5 = r7.A01(r0)     // Catch:{ NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00ef, IllegalAccessException -> 0x00a7, 666 | IV8 -> 0x00ff }
            if (r5 == 0) goto L_0x008a
            java.lang.String r4 = "EEE, dd MMM yyyy HH:mm:ss z"
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x008a }
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x008a }
            r1.<init>(r4, r0)     // Catch:{ Exception -> 0x008a }
            java.lang.String r0 = r5.A01     // Catch:{ Exception -> 0x008a }
            java.util.Date r0 = r1.parse(r0)     // Catch:{ Exception -> 0x008a }
            if (r0 == 0) goto L_0x008a
            long r0 = r0.getTime()     // Catch:{ Exception -> 0x008a }
            r2.setResponseTimestamp(r0)     // Catch:{ Exception -> 0x008a }
        L_0x008a:
            java.lang.String r0 = "X-IG-Request-Elapsed-Time-MS"
            X.3Ud r0 = r7.A01(r0)     // Catch:{ NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00ef, IllegalAccessException -> 0x00a7, 666 | IV8 -> 0x00ff }
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = r0.A01     // Catch:{ NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00ef, IllegalAccessException -> 0x00a7, 666 | IV8 -> 0x00ff }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00ef, IllegalAccessException -> 0x00a7, 666 | IV8 -> 0x00ff }
            r2.setServerElapsedTime(r0)     // Catch:{ NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00ef, IllegalAccessException -> 0x00a7, 666 | IV8 -> 0x00ff }
        L_0x009b:
            int r0 = r7.A01     // Catch:{ NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00ef, IllegalAccessException -> 0x00a7, 666 | IV8 -> 0x00ff }
            r2.setResponseId(r0)     // Catch:{ NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00ef, IllegalAccessException -> 0x00a7, 666 | IV8 -> 0x00ff }
            r3.close()     // Catch:{ IOException -> 0x00a3 }
        L_0x00a3:
            r9.close()
            return r2
        L_0x00a7:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ 666 | IV8 -> 0x00ff, all -> 0x010b }
            r0.<init>(r1)     // Catch:{ 666 | IV8 -> 0x00ff, all -> 0x010b }
            goto L_0x00fe
        L_0x00ae:
            r2 = move-exception
            java.lang.String r1 = r10.getCanonicalName()     // Catch:{ 666 | IV8 -> 0x00ff, all -> 0x010b }
            java.lang.String r0 = "On Class "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r1)     // Catch:{ 666 | IV8 -> 0x00ff, all -> 0x010b }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 666 | IV8 -> 0x00ff, all -> 0x010b }
            r0.<init>(r1, r2)     // Catch:{ 666 | IV8 -> 0x00ff, all -> 0x010b }
            goto L_0x00fe
        L_0x00bf:
            X.3Ud r6 = r7.A01(r1)     // Catch:{ 666 | IV8 -> 0x00e5 }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ 666 | IV8 -> 0x00e5 }
            r1.<init>()     // Catch:{ 666 | IV8 -> 0x00e5 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r0]     // Catch:{ 666 | IV8 -> 0x00e5 }
            int r3 = r9.read(r5)     // Catch:{ IOException -> 0x00de, 666 | IV8 -> 0x00e5 }
            if (r3 <= 0) goto L_0x00de
            r2 = 0
            r1.write(r5, r2, r3)     // Catch:{ IOException -> 0x00de, 666 | IV8 -> 0x00e5 }
            java.lang.String r0 = "utf-8"
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x00de, 666 | IV8 -> 0x00e5 }
            r1.<init>(r5, r2, r3, r0)     // Catch:{ IOException -> 0x00de, 666 | IV8 -> 0x00e5 }
            goto L_0x00df
        L_0x00de:
            r1 = 0
        L_0x00df:
            X.666 r0 = new X.666     // Catch:{ 666 | IV8 -> 0x00e5 }
            r0.<init>(r6, r1)     // Catch:{ 666 | IV8 -> 0x00e5 }
            throw r0     // Catch:{ 666 | IV8 -> 0x00e5 }
        L_0x00e5:
            r2 = move-exception
            goto L_0x0101
        L_0x00e7:
            r3 = r4
        L_0x00e8:
            java.lang.String r0 = "Response body is empty"
            java.io.IOException r0 = X.C86154wM.A0V(r0)     // Catch:{ 666 | IV8 -> 0x00ff, all -> 0x010b }
            goto L_0x00fe
        L_0x00ef:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getTargetException()     // Catch:{ 666 | IV8 -> 0x00ff, all -> 0x010b }
            boolean r1 = r1 instanceof java.lang.Exception     // Catch:{ 666 | IV8 -> 0x00ff, all -> 0x010b }
            if (r1 == 0) goto L_0x00fe
            java.lang.Throwable r0 = r0.getTargetException()     // Catch:{ 666 | IV8 -> 0x00ff, all -> 0x010b }
            java.lang.Exception r0 = (java.lang.Exception) r0     // Catch:{ 666 | IV8 -> 0x00ff, all -> 0x010b }
        L_0x00fe:
            throw r0     // Catch:{ 666 | IV8 -> 0x00ff, all -> 0x010b }
        L_0x00ff:
            r2 = move-exception
            r4 = r3
        L_0x0101:
            int r1 = r7.A02     // Catch:{ all -> 0x0109 }
            X.665 r0 = new X.665     // Catch:{ all -> 0x0109 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0109 }
            throw r0     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            goto L_0x010d
        L_0x010b:
            r0 = move-exception
            r4 = r3
        L_0x010d:
            if (r4 == 0) goto L_0x0112
            r4.close()     // Catch:{ IOException -> 0x0112 }
        L_0x0112:
            if (r9 == 0) goto L_0x0117
            r9.close()
        L_0x0117:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100966Pj.A00(X.MIS, X.GJX, X.8nE, java.io.InputStream, java.lang.Class, boolean):X.8mT");
    }
}
