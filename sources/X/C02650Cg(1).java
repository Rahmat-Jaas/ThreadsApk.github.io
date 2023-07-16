package X;

/* renamed from: X.0Cg  reason: invalid class name and case insensitive filesystem */
public final class C02650Cg implements Runnable {
    public final /* synthetic */ C13080my A00;
    public final /* synthetic */ C17810va A01;

    public C02650Cg(C13080my r1, C17810va r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        if (r2.getSharedPreferences("rti.mqtt.oxygen_fbns_config", 0).getBoolean("fbns_secure_auth", false) == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c3, code lost:
        if (com.instagram.realtimeclient.fleetbeacon.FleetBeaconTestTrigger.TRANSPORT.equals(com.instagram.realtimeclient.fleetbeacon.FleetBeaconTestTrigger.TRANSPORT) == false) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            X.0my r0 = r1.A00
            X.00d r4 = r0.A01
            X.0vH r5 = r0.A00
            X.0vH r0 = r4.A0s
            if (r0 != r5) goto L_0x0210
            X.0va r3 = r1.A01
            X.0gb r2 = r3.A02
            boolean r0 = r2.A01()
            r14 = 0
            if (r0 == 0) goto L_0x00c6
            X.0li r1 = r4.A0I
            java.lang.Object r0 = r2.A00()
            X.0lk r0 = (X.C12350lk) r0
            boolean r7 = r1.D8c(r0)
        L_0x0023:
            java.lang.String r0 = r4.A0V
            boolean r0 = X.AnonymousClass0s5.A02(r0)
            if (r0 != 0) goto L_0x0040
            X.0gb r2 = r3.A03
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x0040
            X.0vk r1 = r4.A0R
            java.lang.Object r0 = r2.A00()
            X.0wB r0 = (X.C18110wB) r0
            boolean r0 = r1.D8d(r0)
            r7 = r7 | r0
        L_0x0040:
            java.lang.String r0 = r4.A0V
            boolean r0 = X.AnonymousClass0s5.A02(r0)
            if (r0 == 0) goto L_0x0063
            X.0vk r3 = r4.A0R
            android.content.Context r2 = r4.A04
            java.lang.String r1 = "fbns_secure_auth"
            if (r2 == 0) goto L_0x005d
            java.lang.String r0 = "rti.mqtt.oxygen_fbns_config"
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r14)
            boolean r0 = r0.getBoolean(r1, r14)
            r1 = 1
            if (r0 != 0) goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            boolean r0 = r3.CmI(r1)
            r7 = r7 | r0
        L_0x0063:
            X.0gb r1 = r4.A06
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = r4.A0V
            boolean r0 = X.AnonymousClass0s5.A02(r0)
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r0 = r1.A00()
            X.0lF r0 = (X.C12060lF) r0
            java.lang.String r6 = "MQTT"
            X.0mV r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            X.0mU r0 = r1.A00(r0)
            java.lang.String r3 = "gateway_type"
            android.content.SharedPreferences r1 = r0.A00
            boolean r0 = r1.contains(r3)
            r2 = 1
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = ""
            java.lang.String r0 = r1.getString(r3, r0)
            boolean r0 = r6.equals(r0)
            r2 = r0 ^ 1
            if (r2 == 0) goto L_0x00a6
            android.content.SharedPreferences$Editor r0 = r1.edit()
            r0.putString(r3, r6)
            r0.apply()
        L_0x00a6:
            r1 = r2
        L_0x00a7:
            r7 = r7 | r1
        L_0x00a8:
            if (r7 == 0) goto L_0x00af
            X.03q r0 = r4.A0M
            r0.Bsl()
        L_0x00af:
            r10 = 0
            java.util.Map r3 = r4.A0W
            monitor-enter(r3)
            goto L_0x00c9
        L_0x00b4:
            android.content.SharedPreferences$Editor r0 = r1.edit()
            r0.putString(r3, r6)
            r0.apply()
            boolean r0 = r6.equals(r6)
            r1 = 0
            if (r0 != 0) goto L_0x00a7
            goto L_0x00a6
        L_0x00c6:
            r7 = 0
            goto L_0x0023
        L_0x00c9:
            android.util.Pair r2 = r4.A05()     // Catch:{ all -> 0x0206 }
            if (r2 == 0) goto L_0x00d9
            java.util.concurrent.Executor r1 = r4.A0X     // Catch:{ all -> 0x0206 }
            X.0IJ r0 = new X.0IJ     // Catch:{ all -> 0x0206 }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x0206 }
            r1.execute(r0)     // Catch:{ all -> 0x0206 }
        L_0x00d9:
            monitor-exit(r3)     // Catch:{ all -> 0x0206 }
            r4.A09()
            X.0Lp r6 = r4.A0D
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.util.concurrent.atomic.AtomicLong r2 = r4.A0n
            long r2 = r2.get()
            long r0 = r0 - r2
            java.lang.Class<X.0Ei> r2 = X.C03100Ei.class
            X.0LD r7 = r6.A05(r2)
            X.0me r7 = (X.C12880me) r7
            X.0md r3 = X.C12870md.A05
            java.lang.Object r3 = r7.A00(r3)
            java.util.concurrent.atomic.AtomicLong r3 = (java.util.concurrent.atomic.AtomicLong) r3
            r3.incrementAndGet()
            X.0md r3 = X.C12870md.A03
            java.lang.Object r3 = r7.A00(r3)
            java.util.concurrent.atomic.AtomicLong r3 = (java.util.concurrent.atomic.AtomicLong) r3
            r3.set(r0)
            X.0LW r0 = r6.A00
            java.util.concurrent.atomic.AtomicLong r3 = r0.A01
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.set(r0)
            X.0tB r3 = X.C16480tB.A04
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.A01 = r0
            java.lang.System.currentTimeMillis()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.A01 = r0
            java.lang.System.currentTimeMillis()
            X.0jQ r0 = r6.A01
            java.util.List r6 = r0.A00
            monitor-enter(r6)
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x0203 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0203 }
            if (r0 == 0) goto L_0x0141
            r1.next()     // Catch:{ all -> 0x0203 }
            java.lang.String r1 = "onMqttNetworkConnectionSuccess"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0203 }
            r0.<init>(r1)     // Catch:{ all -> 0x0203 }
            throw r0     // Catch:{ all -> 0x0203 }
        L_0x0141:
            monitor-exit(r6)
            X.0mS r0 = r4.A07
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0195
            X.0Lp r3 = r4.A0D
            X.0Eg r9 = X.AnonymousClass0Lp.A00(r3)
            X.0LD r7 = r3.A05(r2)
            X.0Ei r7 = (X.C03100Ei) r7
            X.0LW r1 = r3.A00
            r0 = 1
            X.0Li r6 = r1.A00(r0)
            java.lang.Class<X.0Eh> r0 = X.C03090Eh.class
            X.0LD r8 = r3.A05(r0)
            X.0Eh r8 = (X.C03090Eh) r8
            java.lang.Class<X.0EX> r0 = X.AnonymousClass0EX.class
            X.0LD r13 = r3.A05(r0)
            X.0EX r13 = (X.AnonymousClass0EX) r13
            r11 = r10
            r12 = r10
            r15 = r14
            org.json.JSONObject r0 = X.C03960Lr.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ JSONException -> 0x0177 }
            java.lang.String r6 = r0.toString()     // Catch:{ JSONException -> 0x0177 }
            goto L_0x0179
        L_0x0177:
            java.lang.String r6 = ""
        L_0x0179:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0195
            java.lang.Integer r3 = X.AnonymousClass006.A01     // Catch:{ 0uv -> 0x0195 }
            java.lang.String r1 = "/mqtt_health_stats"
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x018d }
            r4.A04(r10, r3, r1, r0)     // Catch:{ 0uv -> 0x0195 }
            goto L_0x0195
        L_0x018d:
            java.lang.String r1 = "UTF-8 not supported"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ 0uv -> 0x0195 }
            r0.<init>(r1)     // Catch:{ 0uv -> 0x0195 }
            throw r0     // Catch:{ 0uv -> 0x0195 }
        L_0x0195:
            X.0Lp r0 = r4.A0D
            X.0LD r1 = r0.A05(r2)
            X.0me r1 = (X.C12880me) r1
            X.0md r0 = X.C12870md.A06
            r1.A02(r0, r10)
            X.03q r0 = r4.A0M
            r0.Brm()
            long r7 = android.os.SystemClock.elapsedRealtime()
            X.0uB r2 = r4.A0T
            long r0 = r2.A02
            long r7 = r7 - r0
            X.0MO r6 = r4.A0C
            int r0 = r2.A01
            java.lang.String r3 = "retry_count"
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "retry_duration_ms"
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String[] r0 = new java.lang.String[]{r3, r2, r1, r0}
            java.util.Map r2 = X.C14740q4.A01(r0)
            java.lang.String r1 = "mqtt_connection_retries"
            r6.A07(r1, r2)
            X.0eQ r0 = r6.A01
            if (r0 == 0) goto L_0x01d4
            r0.Bb8(r1, r2)
        L_0x01d4:
            r4.A0d = r14
            r6 = r5
            monitor-enter(r6)
            java.util.List r2 = r5.A01     // Catch:{ all -> 0x0203 }
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A0K     // Catch:{ all -> 0x0203 }
            int r1 = r0.incrementAndGet()     // Catch:{ all -> 0x0203 }
            r0 = 1
            if (r1 <= r0) goto L_0x01f9
            X.0my r3 = r5.A0X     // Catch:{ all -> 0x0203 }
            java.lang.Throwable r2 = new java.lang.Throwable     // Catch:{ all -> 0x0203 }
            r2.<init>()     // Catch:{ all -> 0x0203 }
        L_0x01ea:
            X.00d r0 = r3.A01     // Catch:{ all -> 0x0203 }
            android.os.Handler r1 = r0.A05     // Catch:{ all -> 0x0203 }
            X.09k r0 = new X.09k     // Catch:{ all -> 0x0203 }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x0203 }
            r1.post(r0)     // Catch:{ all -> 0x0203 }
        L_0x01f6:
            r5.A01 = r10     // Catch:{ all -> 0x0203 }
            goto L_0x0209
        L_0x01f9:
            if (r2 != 0) goto L_0x01f6
            X.0my r3 = r5.A0X     // Catch:{ all -> 0x0203 }
            java.lang.Throwable r2 = new java.lang.Throwable     // Catch:{ all -> 0x0203 }
            r2.<init>()     // Catch:{ all -> 0x0203 }
            goto L_0x01ea
        L_0x0203:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0206:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0206 }
            throw r0
        L_0x0209:
            monitor-exit(r6)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.A02 = r0
        L_0x0210:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02650Cg.run():void");
    }
}
