package X;

/* renamed from: X.0XC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0XC implements Runnable {
    public final /* synthetic */ AnonymousClass0X0 A00;
    public final /* synthetic */ AnonymousClass0XE A01;

    public /* synthetic */ AnonymousClass0XC(AnonymousClass0X0 r1, AnonymousClass0XE r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0139 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x013a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r30 = this;
            r0 = r30
            X.0XE r3 = r0.A01
            X.0X0 r0 = r0.A00
            r29 = r0
            java.lang.Object r7 = r3.A05
            monitor-enter(r7)
            java.lang.Object r2 = r3.A06     // Catch:{ all -> 0x015e }
            monitor-enter(r2)     // Catch:{ all -> 0x015e }
            X.0XA r0 = r3.A04     // Catch:{ all -> 0x015b }
            r28 = r0
            r28.A02()     // Catch:{ all -> 0x015b }
            java.io.File r1 = X.AnonymousClass0XA.A00(r28)     // Catch:{ all -> 0x015b }
            java.io.File r0 = X.AnonymousClass0XA.A01(r28)     // Catch:{ all -> 0x015b }
            r1.renameTo(r0)     // Catch:{ all -> 0x015b }
            monitor-exit(r2)     // Catch:{ all -> 0x015b }
            r0 = 1
            r3.A07 = r0     // Catch:{ all -> 0x015e }
            java.io.File r1 = X.AnonymousClass0XA.A01(r28)     // Catch:{ all -> 0x015e }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x015e }
            if (r0 == 0) goto L_0x0156
            java.io.File[] r6 = r1.listFiles()     // Catch:{ all -> 0x015e }
            if (r6 == 0) goto L_0x0156
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x015e }
            r15.<init>()     // Catch:{ all -> 0x015e }
            int r14 = r6.length     // Catch:{ IOException | JSONException -> 0x013a }
            r5 = 0
        L_0x003b:
            if (r5 >= r14) goto L_0x013a
            r13 = r6[r5]     // Catch:{ IOException | JSONException -> 0x013a }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException | JSONException -> 0x013a }
            r1.<init>(r13)     // Catch:{ IOException | JSONException -> 0x013a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException | JSONException -> 0x013a }
            r2.<init>()     // Catch:{ IOException | JSONException -> 0x013a }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException | JSONException -> 0x013a }
            r0.<init>(r1)     // Catch:{ IOException | JSONException -> 0x013a }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException | JSONException -> 0x013a }
            r1.<init>(r0)     // Catch:{ IOException | JSONException -> 0x013a }
        L_0x0053:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x005d
            r2.append(r0)     // Catch:{ all -> 0x0135 }
            goto L_0x0053
        L_0x005d:
            r1.close()     // Catch:{ IOException | JSONException -> 0x013a }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException | JSONException -> 0x013a }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ IOException | JSONException -> 0x013a }
            r4.<init>(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            int r0 = r4.length()     // Catch:{ IOException | JSONException -> 0x013a }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException | JSONException -> 0x013a }
            r3.<init>(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            r2 = 0
        L_0x0073:
            int r0 = r4.length()     // Catch:{ IOException | JSONException -> 0x013a }
            if (r2 >= r0) goto L_0x0125
            org.json.JSONObject r8 = r4.getJSONObject(r2)     // Catch:{ IOException | JSONException -> 0x013a }
            java.lang.String r0 = "integerDimensions"
            org.json.JSONArray r0 = r8.getJSONArray(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            java.lang.String[] r20 = X.AnonymousClass0X9.A01(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            java.lang.String r0 = "integerDimensionValues"
            org.json.JSONArray r9 = r8.getJSONArray(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            int r1 = r9.length()     // Catch:{ IOException | JSONException -> 0x013a }
            long[] r12 = new long[r1]     // Catch:{ IOException | JSONException -> 0x013a }
            r0 = 0
        L_0x0094:
            if (r0 >= r1) goto L_0x009f
            long r10 = r9.getLong(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            r12[r0] = r10     // Catch:{ IOException | JSONException -> 0x013a }
            int r0 = r0 + 1
            goto L_0x0094
        L_0x009f:
            java.lang.String r0 = "stringDimensions"
            org.json.JSONArray r0 = r8.getJSONArray(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            java.lang.String[] r21 = X.AnonymousClass0X9.A01(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            java.lang.String r0 = "stringDimensionValues"
            org.json.JSONArray r0 = r8.getJSONArray(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            java.lang.String[] r22 = X.AnonymousClass0X9.A01(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            java.lang.String r0 = "integerAggregations"
            org.json.JSONArray r0 = r8.getJSONArray(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            java.lang.String[] r23 = X.AnonymousClass0X9.A01(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            java.lang.String r0 = "integerResults"
            org.json.JSONArray r9 = r8.getJSONArray(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            int r1 = r9.length()     // Catch:{ IOException | JSONException -> 0x013a }
            long[] r11 = new long[r1]     // Catch:{ IOException | JSONException -> 0x013a }
            r0 = 0
        L_0x00ca:
            if (r0 >= r1) goto L_0x00d5
            long r16 = r9.getLong(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            r11[r0] = r16     // Catch:{ IOException | JSONException -> 0x013a }
            int r0 = r0 + 1
            goto L_0x00ca
        L_0x00d5:
            java.lang.String r0 = "doubleAggregations"
            org.json.JSONArray r0 = r8.getJSONArray(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            java.lang.String[] r24 = X.AnonymousClass0X9.A01(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            java.lang.String r0 = "doubleResults"
            org.json.JSONArray r10 = r8.getJSONArray(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            int r9 = r10.length()     // Catch:{ IOException | JSONException -> 0x013a }
            double[] r1 = new double[r9]     // Catch:{ IOException | JSONException -> 0x013a }
            r0 = 0
        L_0x00ec:
            if (r0 >= r9) goto L_0x00f7
            double r16 = r10.getDouble(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            r1[r0] = r16     // Catch:{ IOException | JSONException -> 0x013a }
            int r0 = r0 + 1
            goto L_0x00ec
        L_0x00f7:
            java.lang.String r0 = "stringAggregations"
            org.json.JSONArray r0 = r8.getJSONArray(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            java.lang.String[] r25 = X.AnonymousClass0X9.A01(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            java.lang.String r0 = "stringResults"
            org.json.JSONArray r0 = r8.getJSONArray(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            java.lang.String[] r26 = X.AnonymousClass0X9.A01(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            java.lang.String r0 = "count"
            int r27 = r8.getInt(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            X.0X6 r0 = new X.0X6     // Catch:{ IOException | JSONException -> 0x013a }
            r16 = r0
            r17 = r1
            r18 = r12
            r19 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ IOException | JSONException -> 0x013a }
            r3.add(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            int r2 = r2 + 1
            goto L_0x0073
        L_0x0125:
            java.lang.String r1 = r13.getName()     // Catch:{ IOException | JSONException -> 0x013a }
            X.0X5 r0 = new X.0X5     // Catch:{ IOException | JSONException -> 0x013a }
            r0.<init>(r1, r3)     // Catch:{ IOException | JSONException -> 0x013a }
            r15.add(r0)     // Catch:{ IOException | JSONException -> 0x013a }
            int r5 = r5 + 1
            goto L_0x003b
        L_0x0135:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0139 }
        L_0x0139:
            throw r0     // Catch:{ IOException | JSONException -> 0x013a }
        L_0x013a:
            boolean r0 = r15.isEmpty()     // Catch:{ all -> 0x015e }
            if (r0 != 0) goto L_0x0156
            java.util.Iterator r2 = r15.iterator()     // Catch:{ all -> 0x015e }
        L_0x0144:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x015e }
            if (r0 == 0) goto L_0x0156
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x015e }
            X.0X5 r1 = (X.AnonymousClass0X5) r1     // Catch:{ all -> 0x015e }
            r0 = r29
            X.AnonymousClass0X0.A05(r0, r1)     // Catch:{ all -> 0x015e }
            goto L_0x0144
        L_0x0156:
            r28.A02()     // Catch:{ all -> 0x015e }
            monitor-exit(r7)     // Catch:{ all -> 0x015e }
            return
        L_0x015b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x015b }
            throw r0     // Catch:{ all -> 0x015e }
        L_0x015e:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x015e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XC.run():void");
    }
}
