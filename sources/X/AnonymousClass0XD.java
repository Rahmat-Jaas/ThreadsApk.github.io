package X;

import java.util.List;

/* renamed from: X.0XD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0XD implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass0XE A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ AnonymousClass0XD(AnonymousClass0XE r1, List list, long j) {
        this.A01 = r1;
        this.A02 = list;
        this.A00 = j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:40|41|42|43|44) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x010d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0117 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            X.0XE r6 = r1.A01
            java.util.List r0 = r1.A02
            long r2 = r1.A00
            java.lang.Object r5 = r6.A06
            monitor-enter(r5)
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x011a }
        L_0x000f:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x0118
            java.lang.Object r4 = r15.next()     // Catch:{ all -> 0x011a }
            X.0jJ r4 = (X.C11000jJ) r4     // Catch:{ all -> 0x011a }
            long r7 = r4.A03     // Catch:{ all -> 0x011a }
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x000f
            java.util.List r7 = r4.A00()     // Catch:{ all -> 0x011a }
            X.0XA r1 = r6.A04     // Catch:{ IOException | JSONException -> 0x000f }
            X.0X4 r0 = r4.A01     // Catch:{ IOException | JSONException -> 0x000f }
            java.lang.String r4 = r0.A00     // Catch:{ IOException | JSONException -> 0x000f }
            java.io.File r1 = X.AnonymousClass0XA.A00(r1)     // Catch:{ IOException | JSONException -> 0x000f }
            r1.mkdirs()     // Catch:{ IOException | JSONException -> 0x000f }
            java.io.File r0 = new java.io.File     // Catch:{ IOException | JSONException -> 0x000f }
            r0.<init>(r1, r4)     // Catch:{ IOException | JSONException -> 0x000f }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException | JSONException -> 0x000f }
            r4.<init>(r0)     // Catch:{ IOException | JSONException -> 0x000f }
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ all -> 0x0113 }
            r8.<init>()     // Catch:{ all -> 0x0113 }
            java.util.Iterator r14 = r7.iterator()     // Catch:{ all -> 0x0113 }
        L_0x0045:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0113 }
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r9 = r14.next()     // Catch:{ all -> 0x0113 }
            X.0X6 r9 = (X.AnonymousClass0X6) r9     // Catch:{ all -> 0x0113 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x0113 }
            r7.<init>()     // Catch:{ all -> 0x0113 }
            java.lang.String[] r0 = r9.A06     // Catch:{ all -> 0x0113 }
            org.json.JSONArray r1 = X.AnonymousClass0X9.A00(r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "integerDimensions"
            r7.put(r0, r1)     // Catch:{ all -> 0x0113 }
            long[] r13 = r9.A02     // Catch:{ all -> 0x0113 }
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ all -> 0x0113 }
            r12.<init>()     // Catch:{ all -> 0x0113 }
            int r11 = r13.length     // Catch:{ all -> 0x0113 }
            r10 = 0
        L_0x006a:
            if (r10 >= r11) goto L_0x0074
            r0 = r13[r10]     // Catch:{ all -> 0x0113 }
            r12.put(r0)     // Catch:{ all -> 0x0113 }
            int r10 = r10 + 1
            goto L_0x006a
        L_0x0074:
            java.lang.String r0 = "integerDimensionValues"
            r7.put(r0, r12)     // Catch:{ all -> 0x0113 }
            java.lang.String[] r0 = r9.A09     // Catch:{ all -> 0x0113 }
            org.json.JSONArray r1 = X.AnonymousClass0X9.A00(r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "stringDimensions"
            r7.put(r0, r1)     // Catch:{ all -> 0x0113 }
            java.lang.String[] r0 = r9.A08     // Catch:{ all -> 0x0113 }
            org.json.JSONArray r1 = X.AnonymousClass0X9.A00(r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "stringDimensionValues"
            r7.put(r0, r1)     // Catch:{ all -> 0x0113 }
            java.lang.String[] r0 = r9.A05     // Catch:{ all -> 0x0113 }
            org.json.JSONArray r1 = X.AnonymousClass0X9.A00(r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "integerAggregations"
            r7.put(r0, r1)     // Catch:{ all -> 0x0113 }
            long[] r13 = r9.A03     // Catch:{ all -> 0x0113 }
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ all -> 0x0113 }
            r12.<init>()     // Catch:{ all -> 0x0113 }
            int r11 = r13.length     // Catch:{ all -> 0x0113 }
            r10 = 0
        L_0x00a3:
            if (r10 >= r11) goto L_0x00ad
            r0 = r13[r10]     // Catch:{ all -> 0x0113 }
            r12.put(r0)     // Catch:{ all -> 0x0113 }
            int r10 = r10 + 1
            goto L_0x00a3
        L_0x00ad:
            java.lang.String r0 = "integerResults"
            r7.put(r0, r12)     // Catch:{ all -> 0x0113 }
            java.lang.String[] r0 = r9.A04     // Catch:{ all -> 0x0113 }
            org.json.JSONArray r1 = X.AnonymousClass0X9.A00(r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "doubleAggregations"
            r7.put(r0, r1)     // Catch:{ all -> 0x0113 }
            double[] r13 = r9.A01     // Catch:{ all -> 0x0113 }
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ all -> 0x0113 }
            r12.<init>()     // Catch:{ all -> 0x0113 }
            int r11 = r13.length     // Catch:{ all -> 0x0113 }
            r10 = 0
        L_0x00c6:
            if (r10 >= r11) goto L_0x00d0
            r0 = r13[r10]     // Catch:{ all -> 0x0113 }
            r12.put(r0)     // Catch:{ all -> 0x0113 }
            int r10 = r10 + 1
            goto L_0x00c6
        L_0x00d0:
            java.lang.String r0 = "doubleResults"
            r7.put(r0, r12)     // Catch:{ all -> 0x0113 }
            java.lang.String[] r0 = r9.A07     // Catch:{ all -> 0x0113 }
            org.json.JSONArray r1 = X.AnonymousClass0X9.A00(r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "stringAggregations"
            r7.put(r0, r1)     // Catch:{ all -> 0x0113 }
            java.lang.String[] r0 = r9.A0A     // Catch:{ all -> 0x0113 }
            org.json.JSONArray r1 = X.AnonymousClass0X9.A00(r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "stringResults"
            r7.put(r0, r1)     // Catch:{ all -> 0x0113 }
            int r1 = r9.A00     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "count"
            r7.put(r0, r1)     // Catch:{ all -> 0x0113 }
            r8.put(r7)     // Catch:{ all -> 0x0113 }
            goto L_0x0045
        L_0x00f7:
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0113 }
            if (r0 == 0) goto L_0x010e
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0113 }
            r1.<init>(r4)     // Catch:{ all -> 0x0113 }
            r1.write(r0)     // Catch:{ all -> 0x0109 }
            r1.close()     // Catch:{ all -> 0x0113 }
            goto L_0x010e
        L_0x0109:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x010d }
        L_0x010d:
            throw r0     // Catch:{ all -> 0x0113 }
        L_0x010e:
            r4.close()     // Catch:{ IOException | JSONException -> 0x000f }
            goto L_0x000f
        L_0x0113:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0117 }
        L_0x0117:
            throw r0     // Catch:{ IOException | JSONException -> 0x000f }
        L_0x0118:
            monitor-exit(r5)     // Catch:{ all -> 0x011a }
            return
        L_0x011a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x011a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XD.run():void");
    }
}
