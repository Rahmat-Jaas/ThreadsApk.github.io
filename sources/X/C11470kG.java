package X;

/* renamed from: X.0kG  reason: invalid class name and case insensitive filesystem */
public final class C11470kG implements Runnable {
    public final /* synthetic */ C12490m0 A00;

    public C11470kG(C12490m0 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:28|29|30|32|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009f, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a0, code lost:
        X.AnonymousClass0LU.A0F("AnalyticsUploader", "Unable to read file", r5);
        r5 = android.util.Pair.create(false, (java.lang.Long) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e9, code lost:
        if (r5 == 200) goto L_0x00c5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x009e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r0 = r22
            X.0m0 r0 = r0.A00
            X.0nI r11 = r0.A03
            X.0lg r10 = r11.A01
            java.lang.String r1 = "upload_event_attempted"
            r3 = 1
            X.0pc r0 = new X.0pc
            r0.<init>(r1, r3)
            r10.A00(r0)
            java.lang.String r9 = "AnalyticsUploader"
            java.io.File r5 = r11.A02
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0047
            java.io.File[] r8 = r5.listFiles()
            java.lang.String r20 = "upload_event_succeeded"
            r1 = 0
            java.lang.String r7 = "uploaded_log_event_file_size_in_bytes"
            if (r8 != 0) goto L_0x0054
            boolean r0 = r5.exists()
            if (r0 != 0) goto L_0x0048
            java.lang.String r0 = "directory_not_found"
        L_0x0032:
            X.AnonymousClass0LU.A0B(r9, r0)
        L_0x0035:
            X.0pc r0 = new X.0pc
            r0.<init>(r7, r1)
            r10.A00(r0)
            X.0pc r5 = new X.0pc
            r0 = r20
            r5.<init>(r0, r3)
        L_0x0044:
            r10.A00(r5)
        L_0x0047:
            return
        L_0x0048:
            boolean r0 = r5.isFile()
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "directory_is_file"
            goto L_0x0032
        L_0x0051:
            java.lang.String r0 = "directory_unknown_error"
            goto L_0x0032
        L_0x0054:
            int r0 = r8.length
            r21 = r0
            r19 = 0
            r12 = 0
        L_0x005a:
            r0 = r21
            if (r12 >= r0) goto L_0x0035
            r18 = r8[r12]
            r5 = 0
            java.lang.Long r17 = java.lang.Long.valueOf(r5)
            r16 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r19)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x009d }
            r0 = r18
            r5.<init>(r0)     // Catch:{ all -> 0x009d }
            java.lang.String r0 = "UTF-8"
            java.io.InputStreamReader r13 = new java.io.InputStreamReader     // Catch:{ all -> 0x009d }
            r13.<init>(r5, r0)     // Catch:{ all -> 0x009d }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r15.<init>()     // Catch:{ all -> 0x0098 }
            r0 = 1024(0x400, float:1.435E-42)
            char[] r14 = new char[r0]     // Catch:{ all -> 0x0098 }
        L_0x0083:
            int r5 = r13.read(r14)     // Catch:{ all -> 0x0098 }
            r0 = -1
            if (r5 == r0) goto L_0x0090
            r0 = r19
            r15.append(r14, r0, r5)     // Catch:{ all -> 0x0098 }
            goto L_0x0083
        L_0x0090:
            java.lang.String r14 = r15.toString()     // Catch:{ all -> 0x0098 }
            r13.close()     // Catch:{ IOException -> 0x00ac }
            goto L_0x00ac
        L_0x0098:
            r0 = move-exception
            r13.close()     // Catch:{ IOException -> 0x009e }
            goto L_0x009e
        L_0x009d:
            r0 = move-exception
        L_0x009e:
            throw r0     // Catch:{ IOException -> 0x009f }
        L_0x009f:
            r5 = move-exception
            java.lang.String r0 = "Unable to read file"
            X.AnonymousClass0LU.A0F(r9, r0, r5)
            r0 = r17
            android.util.Pair r5 = android.util.Pair.create(r6, r0)
            goto L_0x00d8
        L_0x00ac:
            X.0pM r0 = r11.A00
            int r5 = r0.A00(r14)
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 != r0) goto L_0x00e9
            boolean r0 = r18.delete()
            if (r0 != 0) goto L_0x00c5
            java.lang.Object[] r5 = new java.lang.Object[]{r18}
            java.lang.String r0 = "File %s was not deleted"
            X.AnonymousClass0LU.A0O(r9, r0, r5)
        L_0x00c5:
            r16 = 1
        L_0x00c7:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r16)
            int r0 = r14.length()
            long r5 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            android.util.Pair r5 = android.util.Pair.create(r13, r0)
        L_0x00d8:
            java.lang.Object r0 = r5.first
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00ec
            X.0pc r5 = new X.0pc
            r5.<init>(r7, r1)
            goto L_0x0044
        L_0x00e9:
            if (r5 != r0) goto L_0x00c7
            goto L_0x00c5
        L_0x00ec:
            java.lang.Object r0 = r5.second
            java.lang.Number r0 = (java.lang.Number) r0
            long r5 = r0.longValue()
            long r1 = r1 + r5
            int r12 = r12 + 1
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11470kG.run():void");
    }
}
