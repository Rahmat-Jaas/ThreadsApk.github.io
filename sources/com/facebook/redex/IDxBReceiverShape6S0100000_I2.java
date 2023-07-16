package com.facebook.redex;

import android.content.BroadcastReceiver;

public class IDxBReceiverShape6S0100000_I2 extends BroadcastReceiver {
    public Object A00;
    public final int A01;

    public IDxBReceiverShape6S0100000_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ff, code lost:
        X.C14030oh.A0E(r1, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0402, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04d9, code lost:
        X.C14030oh.A0E(r1, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        X.C14030oh.A0E(r1, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r20, android.content.Intent r21) {
        /*
            r19 = this;
            r6 = r19
            int r1 = r6.A01
            r0 = r21
            switch(r1) {
                case 0: goto L_0x0246;
                case 1: goto L_0x0445;
                case 2: goto L_0x0222;
                case 3: goto L_0x03d4;
                case 4: goto L_0x0362;
                case 5: goto L_0x02c0;
                case 6: goto L_0x01b5;
                case 7: goto L_0x018c;
                case 8: goto L_0x0161;
                case 9: goto L_0x0144;
                case 10: goto L_0x0039;
                case 11: goto L_0x002a;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 2127185820(0x7eca479c, float:1.3443794E38)
            int r5 = X.C14030oh.A01(r1)
            boolean r1 = r6.isInitialStickyBroadcast()
            if (r1 == 0) goto L_0x001d
            r1 = -1514355581(0xffffffffa5bcc483, float:-3.2745963E-16)
        L_0x0019:
            X.C14030oh.A0E(r1, r5, r0)
            return
        L_0x001d:
            java.lang.Object r1 = r6.A00
            X.0jt r1 = (X.C11310jt) r1
            r2 = r20
            X.C11310jt.A02(r2, r1)
            r1 = 1841774108(0x6dc73e1c, float:7.7078253E27)
            goto L_0x0019
        L_0x002a:
            r1 = 1098763324(0x417dcc3c, float:15.862362)
            int r5 = X.C14030oh.A01(r1)
            r1 = 2
            X.C14220p1.A00(r1)
            r1 = 1861830173(0x6ef9461d, float:3.8573265E28)
            goto L_0x0019
        L_0x0039:
            r1 = -1961278261(0xffffffff8b1944cb, float:-2.9518482E-32)
            int r5 = X.C14030oh.A01(r1)
            if (r21 != 0) goto L_0x0046
            r1 = -1937770337(0xffffffff8c7ff89f, float:-1.9719302E-31)
            goto L_0x0019
        L_0x0046:
            java.lang.String r2 = r0.getAction()
            java.lang.String r1 = "com.facebook.rti.intent.ACTION_NOTIFICATION_ACK"
            boolean r1 = X.C09750gc.A00(r2, r1)
            if (r1 != 0) goto L_0x0056
            r1 = 764955254(0x2d984a76, float:1.7313467E-11)
            goto L_0x0019
        L_0x0056:
            java.lang.Object r2 = X.C17250ua.A00
            X.0m4 r2 = (X.C12530m4) r2
            java.lang.Object r3 = r6.A00
            X.0sG r3 = (X.C15970sG) r3
            X.0mM r1 = r3.A03
            X.0o5 r1 = r2.A00(r0, r1)
            boolean r1 = r1.BZk()
            if (r1 != 0) goto L_0x006e
            r1 = 1705175804(0x65a2eafc, float:9.616976E22)
            goto L_0x0019
        L_0x006e:
            java.lang.String r1 = "extra_notification_id"
            java.lang.String r13 = r0.getStringExtra(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 != 0) goto L_0x013f
            r2 = 1
            java.lang.String r1 = "extra_processor_completed"
            r0.getBooleanExtra(r1, r2)
            java.lang.String r14 = X.C12710mM.A00(r0)
            X.0pJ r1 = r3.A01()
            X.0gb r2 = r1.A00(r13)
            boolean r1 = r2.A01()
            if (r1 == 0) goto L_0x013f
            com.facebook.rti.push.service.FbnsServiceDelegate r11 = r3.A05
            java.lang.Object r7 = r2.A00()
            X.0wH r7 = (X.C18160wH) r7
            X.0gb r8 = r7.A01
            X.0gb r4 = r7.A03
            r15 = 0
            X.0tN r10 = r11.A09
            X.0w5 r6 = r11.A01
            android.content.Context r1 = r6.getApplicationContext()
            java.lang.String r3 = r1.getPackageName()
            long r1 = r7.A00
            java.lang.String r12 = "acknowledge"
            java.lang.String[] r9 = new java.lang.String[]{r12, r3, r14}
            java.lang.String r3 = "fbns_latency"
            r10.A01(r3, r9, r1)
            boolean r3 = r4.A01()
            if (r3 == 0) goto L_0x00f6
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.Object r3 = r4.A00()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            long r9 = r9 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r3.getClass()
            X.0mR r4 = new X.0mR
            r4.<init>(r3)
            X.0tN r10 = r11.A09
            android.content.Context r3 = r6.getApplicationContext()
            java.lang.String r6 = r3.getPackageName()
            java.lang.Object r3 = r4.A00()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            java.lang.String[] r9 = new java.lang.String[]{r12, r6, r14}
            java.lang.String r6 = "fbns_e2e_latency"
            r10.A01(r6, r9, r3)
        L_0x00f6:
            X.0sF r6 = r11.A03
            java.lang.String r3 = "ACK from "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r14)
            java.lang.String r3 = ": notifId = "
            r4.append(r3)
            r4.append(r13)
            java.lang.String r3 = "; delay = "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            r6.Bb6(r3)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            boolean r3 = r8.A01()
            if (r3 == 0) goto L_0x0131
            java.lang.Object r3 = r8.A00()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "l"
            r6.put(r3, r4)
        L_0x0131:
            java.lang.String r4 = r7.A04
            java.lang.String r3 = "src"
            r6.put(r3, r4)
            r17 = r1
            r16 = r6
            com.facebook.rti.push.service.FbnsServiceDelegate.A02(r11, r12, r13, r14, r15, r16, r17)
        L_0x013f:
            r1 = 1435405643(0x558e8d4b, float:1.95921875E13)
            goto L_0x0019
        L_0x0144:
            r1 = -1722511978(0xffffffff99548d96, float:-1.0988736E-23)
            int r5 = X.C14030oh.A01(r1)
            if (r21 != 0) goto L_0x0152
            r1 = -1872801073(0xffffffff905f52cf, float:-4.404279E-29)
            goto L_0x0019
        L_0x0152:
            java.lang.Object r1 = r6.A00
            X.00d r1 = (X.C000200d) r1
            r0.getAction()
            X.C000200d.A00(r0, r1)
            r1 = 727581135(0x2b5e01cf, float:7.8872754E-13)
            goto L_0x0019
        L_0x0161:
            r1 = 1023952170(0x3d08452a, float:0.033269085)
            int r5 = X.C14030oh.A01(r1)
            java.lang.Object r3 = r6.A00
            X.00d r3 = (X.C000200d) r3
            if (r21 != 0) goto L_0x0173
            r1 = 319323235(0x13087c63, float:1.722694E-27)
            goto L_0x0019
        L_0x0173:
            java.lang.String r2 = r0.getAction()
            java.lang.String r1 = "android.os.action.POWER_SAVE_MODE_CHANGED"
            boolean r1 = X.C09750gc.A00(r2, r1)
            if (r1 != 0) goto L_0x0184
            r1 = 584287127(0x22d38397, float:5.733099E-18)
            goto L_0x0019
        L_0x0184:
            X.C000200d.A00(r0, r3)
            r1 = -1641493495(0xffffffff9e28cc09, float:-8.9360394E-21)
            goto L_0x0019
        L_0x018c:
            r1 = 1202724665(0x47b01f39, float:90174.445)
            int r5 = X.C14030oh.A01(r1)
            java.lang.String r3 = r0.getAction()
            java.lang.Object r2 = r6.A00
            X.0Re r2 = (X.AnonymousClass0Re) r2
            java.lang.String r1 = r2.A08
            boolean r1 = X.C09750gc.A00(r3, r1)
            if (r1 != 0) goto L_0x01a8
            r1 = 1895660206(0x70fd7aae, float:6.2758415E29)
            goto L_0x0019
        L_0x01a8:
            r0.getAction()
            java.lang.Runnable r1 = r2.A0C
            r1.run()
            r1 = 1290445616(0x4ceaa330, float:1.230176E8)
            goto L_0x0019
        L_0x01b5:
            r1 = 1313512656(0x4e4a9cd0, float:8.4981862E8)
            int r5 = X.C14030oh.A01(r1)
            java.lang.String r2 = r0.getAction()
            java.lang.Object r7 = r6.A00
            X.0eG r7 = (X.C08770eG) r7
            java.lang.String r1 = r7.A0I
            boolean r1 = X.C09750gc.A00(r2, r1)
            if (r1 != 0) goto L_0x01d1
            r1 = 1497845056(0x59474d40, float:3.5061536E15)
            goto L_0x0019
        L_0x01d1:
            monitor-enter(r7)
            r0.getAction()     // Catch:{ all -> 0x04e0 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x04e0 }
            long r8 = r7.A00     // Catch:{ all -> 0x04e0 }
            long r2 = r7.A05     // Catch:{ all -> 0x04e0 }
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x01e6
            monitor-exit(r7)     // Catch:{ all -> 0x04e0 }
            r1 = 241978215(0xe6c4b67, float:2.912555E-30)
            goto L_0x0019
        L_0x01e6:
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x04e0 }
            long r1 = r7.A01     // Catch:{ all -> 0x04e0 }
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 >= 0) goto L_0x01f6
            monitor-exit(r7)     // Catch:{ all -> 0x04e0 }
            r1 = -93760644(0xfffffffffa69537c, float:-3.028746E35)
            goto L_0x0019
        L_0x01f6:
            long r3 = r3 + r8
            r7.A01 = r3     // Catch:{ all -> 0x04e0 }
            android.app.PendingIntent r3 = r7.A09     // Catch:{ all -> 0x04e0 }
            if (r3 == 0) goto L_0x0204
            X.0P7 r2 = r7.A0G     // Catch:{ all -> 0x04e0 }
            android.app.AlarmManager r1 = r7.A06     // Catch:{ all -> 0x04e0 }
            r2.A00(r1, r3)     // Catch:{ all -> 0x04e0 }
        L_0x0204:
            boolean r1 = r7.A03     // Catch:{ all -> 0x04e0 }
            if (r1 == 0) goto L_0x0217
            long r1 = r7.A01     // Catch:{ all -> 0x04e0 }
            X.C08770eG.A03(r3, r7, r1)     // Catch:{ all -> 0x04e0 }
            android.app.PendingIntent r6 = r7.A07     // Catch:{ all -> 0x04e0 }
            long r3 = r7.A01     // Catch:{ all -> 0x04e0 }
            r1 = 20000(0x4e20, double:9.8813E-320)
            long r3 = r3 + r1
            X.C08770eG.A02(r6, r7, r3)     // Catch:{ all -> 0x04e0 }
        L_0x0217:
            monitor-exit(r7)     // Catch:{ all -> 0x04e0 }
            java.lang.Runnable r1 = r7.A0P
            r1.run()
            r1 = -1176191247(0xffffffffb9e4bef1, float:-4.362981E-4)
            goto L_0x0019
        L_0x0222:
            r1 = 613356678(0x248f1486, float:6.205113E-17)
            int r5 = X.C14030oh.A01(r1)
            java.lang.String r3 = r0.getAction()
            java.lang.Object r2 = r6.A00
            X.06H r2 = (X.AnonymousClass06H) r2
            java.lang.String r1 = r2.A01
            boolean r1 = X.C09750gc.A00(r3, r1)
            if (r1 != 0) goto L_0x023e
            r1 = -33443813(0xfffffffffe01b01b, float:-4.30962E37)
            goto L_0x0019
        L_0x023e:
            X.AnonymousClass06H.A01(r2)
            r1 = 594548573(0x2370175d, float:1.30153734E-17)
            goto L_0x0019
        L_0x0246:
            r1 = 621189799(0x25069aa7, float:1.1675046E-16)
            int r5 = X.C14030oh.A01(r1)
            long r3 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r9 = r6.A00
            X.09F r9 = (X.AnonymousClass09F) r9
            monitor-enter(r9)
            java.lang.String r6 = r0.getAction()     // Catch:{ all -> 0x04e6 }
            int r2 = r6.hashCode()     // Catch:{ all -> 0x04e6 }
            r1 = -1886648615(0xffffffff8f8c06d9, float:-1.3807703E-29)
            r10 = 0
            r8 = 1
            if (r2 == r1) goto L_0x0291
            r1 = 1019184907(0x3cbf870b, float:0.023379823)
            if (r2 != r1) goto L_0x02a8
            java.lang.String r1 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x04e6 }
            if (r1 == 0) goto L_0x02a8
            boolean r1 = r9.A03     // Catch:{ all -> 0x04e6 }
            if (r1 != 0) goto L_0x0282
            long r6 = r9.A00     // Catch:{ all -> 0x04e6 }
            long r1 = r9.A02     // Catch:{ all -> 0x04e6 }
            long r10 = r3 - r1
            long r6 = r6 + r10
            r9.A00 = r6     // Catch:{ all -> 0x04e6 }
        L_0x027f:
            r9.A03 = r8     // Catch:{ all -> 0x04e6 }
            goto L_0x02a8
        L_0x0282:
            long r6 = r9.A01     // Catch:{ all -> 0x04e6 }
            long r1 = r9.A02     // Catch:{ all -> 0x04e6 }
            long r10 = r3 - r1
            long r6 = r6 + r10
            r9.A01 = r6     // Catch:{ all -> 0x04e6 }
            java.lang.String r1 = "CONNECTED"
            r9.A05(r1, r3)     // Catch:{ all -> 0x04e6 }
            goto L_0x027f
        L_0x0291:
            java.lang.String r1 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x04e6 }
            if (r1 == 0) goto L_0x02a8
            boolean r1 = r9.A03     // Catch:{ all -> 0x04e6 }
            if (r1 == 0) goto L_0x02ac
            long r6 = r9.A01     // Catch:{ all -> 0x04e6 }
            long r1 = r9.A02     // Catch:{ all -> 0x04e6 }
            long r11 = r3 - r1
            long r6 = r6 + r11
            r9.A01 = r6     // Catch:{ all -> 0x04e6 }
        L_0x02a6:
            r9.A03 = r10     // Catch:{ all -> 0x04e6 }
        L_0x02a8:
            r9.A02 = r3     // Catch:{ all -> 0x04e6 }
            monitor-exit(r9)     // Catch:{ all -> 0x04e6 }
            goto L_0x02bb
        L_0x02ac:
            long r6 = r9.A00     // Catch:{ all -> 0x04e6 }
            long r1 = r9.A02     // Catch:{ all -> 0x04e6 }
            long r11 = r3 - r1
            long r6 = r6 + r11
            r9.A00 = r6     // Catch:{ all -> 0x04e6 }
            java.lang.String r1 = "DISCONNECTED"
            r9.A05(r1, r3)     // Catch:{ all -> 0x04e6 }
            goto L_0x02a6
        L_0x02bb:
            r1 = -1142889552(0xffffffffbbe0e3b0, float:-0.00686308)
            goto L_0x0019
        L_0x02c0:
            r1 = 1654585752(0x629ef998, float:1.4662853E21)
            int r4 = X.C14030oh.A01(r1)
            java.lang.String r2 = r0.getAction()
            java.lang.Object r5 = r6.A00
            X.0eG r5 = (X.C08770eG) r5
            java.lang.String r1 = r5.A0K
            boolean r1 = X.C09750gc.A00(r2, r1)
            if (r1 != 0) goto L_0x02dc
            r1 = -345939171(0xffffffffeb61631d, float:-2.7247636E26)
            goto L_0x04d9
        L_0x02dc:
            monitor-enter(r5)
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0359 }
            long r1 = r5.A01     // Catch:{ all -> 0x0359 }
            long r6 = r6 - r1
            r0.getAction()     // Catch:{ all -> 0x0359 }
            r2 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0302
            X.0MO r3 = r5.A0H     // Catch:{ all -> 0x0359 }
            java.lang.String r2 = "keepalive_delay_ms"
            java.lang.String r1 = java.lang.Long.toString(r6)     // Catch:{ all -> 0x0359 }
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}     // Catch:{ all -> 0x0359 }
            java.util.Map r2 = X.C14740q4.A01(r1)     // Catch:{ all -> 0x0359 }
            java.lang.String r1 = "mqtt_keepalive_delay"
            r3.A07(r1, r2)     // Catch:{ all -> 0x0359 }
        L_0x0302:
            boolean r8 = r5.A0L     // Catch:{ all -> 0x0359 }
            if (r8 != 0) goto L_0x0311
            android.app.PendingIntent r3 = r5.A07     // Catch:{ all -> 0x0359 }
            if (r3 == 0) goto L_0x0311
            X.0P7 r2 = r5.A0G     // Catch:{ all -> 0x0359 }
            android.app.AlarmManager r1 = r5.A06     // Catch:{ all -> 0x0359 }
            r2.A00(r1, r3)     // Catch:{ all -> 0x0359 }
        L_0x0311:
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0359 }
            long r1 = r5.A02     // Catch:{ all -> 0x0359 }
            long r13 = r13 + r1
            boolean r1 = r5.A03     // Catch:{ all -> 0x0359 }
            if (r1 == 0) goto L_0x0330
            int r2 = r5.A04     // Catch:{ all -> 0x0359 }
            r1 = 23
            if (r2 < r1) goto L_0x0330
            if (r8 == 0) goto L_0x0330
            android.app.PendingIntent r11 = r5.A09     // Catch:{ all -> 0x0359 }
            if (r11 == 0) goto L_0x0330
            X.0P7 r9 = r5.A0G     // Catch:{ all -> 0x0359 }
            android.app.AlarmManager r10 = r5.A06     // Catch:{ all -> 0x0359 }
            r12 = 2
            r9.A01(r10, r11, r12, r13)     // Catch:{ all -> 0x0359 }
        L_0x0330:
            long r6 = r5.A00     // Catch:{ all -> 0x0359 }
            long r1 = r5.A05     // Catch:{ all -> 0x0359 }
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x033e
            monitor-exit(r5)     // Catch:{ all -> 0x0359 }
            r1 = 1454019520(0x56aa93c0, float:9.3775779E13)
            goto L_0x04d9
        L_0x033e:
            r5.A01 = r13     // Catch:{ all -> 0x0359 }
            boolean r1 = r5.A03     // Catch:{ all -> 0x0359 }
            if (r1 == 0) goto L_0x034e
            if (r8 != 0) goto L_0x034e
            android.app.PendingIntent r3 = r5.A07     // Catch:{ all -> 0x0359 }
            r1 = 20000(0x4e20, double:9.8813E-320)
            long r13 = r13 + r1
            X.C08770eG.A02(r3, r5, r13)     // Catch:{ all -> 0x0359 }
        L_0x034e:
            monitor-exit(r5)     // Catch:{ all -> 0x0359 }
            java.lang.Runnable r1 = r5.A0P
            r1.run()
            r1 = 1475794416(0x57f6d5f0, float:5.4279743E14)
            goto L_0x04d9
        L_0x0359:
            r2 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0359 }
            r1 = -1367302429(0xffffffffae809ee3, float:-5.84899E-11)
            X.C14030oh.A0E(r1, r4, r0)
            throw r2
        L_0x0362:
            r1 = 1323576756(0x4ee42db4, float:1.91410022E9)
            int r7 = X.C14030oh.A01(r1)
            java.lang.String r2 = r0.getAction()
            java.lang.Object r6 = r6.A00
            X.0eG r6 = (X.C08770eG) r6
            java.lang.String r1 = r6.A0J
            boolean r1 = X.C09750gc.A00(r2, r1)
            if (r1 != 0) goto L_0x037e
            r1 = 1252561378(0x4aa891e2, float:5523697.0)
            goto L_0x03ff
        L_0x037e:
            monitor-enter(r6)
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03cb }
            long r1 = r6.A01     // Catch:{ all -> 0x03cb }
            long r4 = r4 - r1
            r0.getAction()     // Catch:{ all -> 0x03cb }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x03a4
            X.0MO r3 = r6.A0H     // Catch:{ all -> 0x03cb }
            java.lang.String r2 = "keepalive_delay_ms"
            java.lang.String r1 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x03cb }
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}     // Catch:{ all -> 0x03cb }
            java.util.Map r2 = X.C14740q4.A01(r1)     // Catch:{ all -> 0x03cb }
            java.lang.String r1 = "mqtt_keepalive_delay"
            r3.A07(r1, r2)     // Catch:{ all -> 0x03cb }
        L_0x03a4:
            long r4 = r6.A00     // Catch:{ all -> 0x03cb }
            long r2 = r6.A05     // Catch:{ all -> 0x03cb }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x03b1
            monitor-exit(r6)     // Catch:{ all -> 0x03cb }
            r1 = -1985198(0xffffffffffe1b552, float:NaN)
            goto L_0x03ff
        L_0x03b1:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03cb }
            long r2 = r2 + r4
            r6.A01 = r2     // Catch:{ all -> 0x03cb }
            boolean r1 = r6.A03     // Catch:{ all -> 0x03cb }
            if (r1 == 0) goto L_0x03c1
            android.app.PendingIntent r1 = r6.A08     // Catch:{ all -> 0x03cb }
            X.C08770eG.A02(r1, r6, r2)     // Catch:{ all -> 0x03cb }
        L_0x03c1:
            monitor-exit(r6)     // Catch:{ all -> 0x03cb }
            java.lang.Runnable r1 = r6.A0P
            r1.run()
            r1 = 126072304(0x783b5f0, float:1.9817623E-34)
            goto L_0x03ff
        L_0x03cb:
            r2 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x03cb }
            r1 = 997965508(0x3b7bbec4, float:0.0038413266)
            X.C14030oh.A0E(r1, r7, r0)
            throw r2
        L_0x03d4:
            r1 = 2071197917(0x7b73f8dd, float:1.2667757E36)
            int r7 = X.C14030oh.A01(r1)
            java.lang.String r2 = r0.getAction()
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x043e
            java.lang.String r1 = "networkInfo"
            android.os.Parcelable r1 = r0.getParcelableExtra(r1)
            android.net.NetworkInfo r1 = (android.net.NetworkInfo) r1
            java.lang.Object r3 = r6.A00
            X.068 r3 = (X.AnonymousClass068) r3
            X.AnonymousClass068.A00(r1, r3)
            boolean r1 = r6.isInitialStickyBroadcast()
            if (r1 == 0) goto L_0x0403
            r1 = -1812383513(0xffffffff93f938e7, float:-6.2912547E-27)
        L_0x03ff:
            X.C14030oh.A0E(r1, r7, r0)
            return
        L_0x0403:
            X.0bY r1 = r3.A03()
            java.lang.String r5 = "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED"
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r5)
            java.lang.String r2 = "com.facebook.mqtt.EXTRA_NETWORK_TYPE"
            int r1 = r1.A00
            r4.putExtra(r2, r1)
            monitor-enter(r3)
            java.util.Set r2 = r3.A04     // Catch:{ all -> 0x0442 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0442 }
            r1.<init>(r2)     // Catch:{ all -> 0x0442 }
            monitor-exit(r3)     // Catch:{ all -> 0x0442 }
            java.util.Iterator r3 = r1.iterator()
        L_0x0422:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x043e
            java.lang.Object r2 = r3.next()
            X.0mw r2 = (X.C13060mw) r2
            java.lang.String r1 = r4.getAction()
            boolean r1 = X.C09750gc.A00(r1, r5)
            if (r1 == 0) goto L_0x0422
            X.00d r1 = r2.A00
            X.C000200d.A00(r4, r1)
            goto L_0x0422
        L_0x043e:
            r1 = 893513987(0x3541f103, float:7.224882E-7)
            goto L_0x03ff
        L_0x0442:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0442 }
            throw r2
        L_0x0445:
            r1 = -1282877687(0xffffffffb388d709, float:-6.372108E-8)
            int r4 = X.C14030oh.A01(r1)
            android.os.Bundle r2 = r0.getExtras()
            if (r2 == 0) goto L_0x0464
            java.lang.String r1 = "reason"
            java.lang.String r9 = r2.getString(r1)
        L_0x0458:
            java.lang.Object r5 = r6.A00
            X.0af r5 = (X.C06960af) r5
            boolean r1 = r5.A00
            if (r1 == 0) goto L_0x04c9
            java.lang.Class<X.09a> r3 = X.C019409a.class
            monitor-enter(r3)
            goto L_0x0466
        L_0x0464:
            r9 = 0
            goto L_0x0458
        L_0x0466:
            X.09a r1 = X.C019409a.A09     // Catch:{ all -> 0x04c6 }
            if (r1 != 0) goto L_0x0471
            X.09a r1 = new X.09a     // Catch:{ all -> 0x04c6 }
            r1.<init>()     // Catch:{ all -> 0x04c6 }
            X.C019409a.A09 = r1     // Catch:{ all -> 0x04c6 }
        L_0x0471:
            monitor-exit(r3)     // Catch:{ all -> 0x04c6 }
            java.lang.Object r3 = r1.A06
            monitor-enter(r3)
            X.0b4 r1 = r1.A01     // Catch:{ all -> 0x04c3 }
            if (r1 == 0) goto L_0x04c1
            X.0b8 r14 = r1.A00     // Catch:{ all -> 0x04c3 }
            X.0Xw r6 = r14.A0D     // Catch:{ all -> 0x04c3 }
            if (r6 == 0) goto L_0x0489
            monitor-enter(r6)     // Catch:{ all -> 0x04c3 }
            java.lang.Integer r2 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x04a8 }
            r1 = 0
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x04a8 }
            X.C06150Xw.A02(r6, r2, r1)     // Catch:{ all -> 0x04a8 }
            monitor-exit(r6)     // Catch:{ all -> 0x04c3 }
        L_0x0489:
            X.0Xk r8 = r14.A00     // Catch:{ all -> 0x04c3 }
            if (r8 == 0) goto L_0x04c1
            java.lang.Object r7 = r8.A01     // Catch:{ all -> 0x04c3 }
            monitor-enter(r7)     // Catch:{ all -> 0x04c3 }
            X.0Xx r1 = r8.A00     // Catch:{ all -> 0x04a5 }
            java.nio.MappedByteBuffer r6 = r1.A00     // Catch:{ all -> 0x04a5 }
            r2 = 202(0xca, float:2.83E-43)
            r1 = 49
            byte r1 = (byte) r1     // Catch:{ all -> 0x04a5 }
            r6.put(r2, r1)     // Catch:{ all -> 0x04a5 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04a5 }
            r8.A06(r1)     // Catch:{ all -> 0x04a5 }
            monitor-exit(r7)     // Catch:{ all -> 0x04a5 }
            goto L_0x04ab
        L_0x04a5:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x04a5 }
            goto L_0x04aa
        L_0x04a8:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x04c3 }
        L_0x04aa:
            throw r0     // Catch:{ all -> 0x04c3 }
        L_0x04ab:
            X.0Mg r12 = r14.A0A     // Catch:{ all -> 0x04c3 }
            X.0ND r13 = X.AnonymousClass0ND.CRITICAL_REPORT     // Catch:{ all -> 0x04c3 }
            r1 = 0
            X.0Mn r11 = new X.0Mn     // Catch:{ all -> 0x04c3 }
            r11.<init>(r1)     // Catch:{ all -> 0x04c3 }
            java.lang.Integer r15 = X.AnonymousClass006.A00     // Catch:{ all -> 0x04c3 }
            java.util.concurrent.ExecutorService r1 = X.C04350Ng.A00     // Catch:{ all -> 0x04c3 }
            X.0Me r10 = new X.0Me     // Catch:{ all -> 0x04c3 }
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x04c3 }
            r1.execute(r10)     // Catch:{ all -> 0x04c3 }
        L_0x04c1:
            monitor-exit(r3)     // Catch:{ all -> 0x04c3 }
            goto L_0x04c9
        L_0x04c3:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x04c3 }
            throw r2
        L_0x04c6:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x04c6 }
            throw r2
        L_0x04c9:
            monitor-enter(r5)
            monitor-exit(r5)     // Catch:{ all -> 0x04dd }
            java.lang.Class<X.0af> r3 = X.C06960af.class
            java.lang.String r2 = "CLOSE_SYSTEM_DIALOGS received, likely heading to background: %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            X.AnonymousClass0LU.A09(r3, r2, r1)
            r1 = 639595187(0x261f72b3, float:5.5319653E-16)
        L_0x04d9:
            X.C14030oh.A0E(r1, r4, r0)
            return
        L_0x04dd:
            r2 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x04dd }
            throw r2
        L_0x04e0:
            r2 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x04e0 }
            r1 = 360025332(0x15758cf4, float:4.9588548E-26)
            goto L_0x04eb
        L_0x04e6:
            r2 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x04e6 }
            r1 = -1037311408(0xffffffffc22be250, float:-42.97101)
        L_0x04eb:
            X.C14030oh.A0E(r1, r5, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxBReceiverShape6S0100000_I2.onReceive(android.content.Context, android.content.Intent):void");
    }
}
