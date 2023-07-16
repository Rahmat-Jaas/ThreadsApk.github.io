package X;

/* renamed from: X.2R1  reason: invalid class name */
public final class AnonymousClass2R1 {
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0066 */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C62253Xz A00(android.content.Context r29, X.C10300i6 r30, X.C62253Xz r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, int r35, boolean r36, boolean r37) {
        /*
            r9 = r29
            android.content.res.AssetManager r17 = r9.getAssets()
            java.lang.String r5 = "id_name_mapping.json"
            java.lang.String r1 = "mobileconfig"
            java.io.File r11 = r9.getFilesDir()
            r11.mkdirs()
            if (r36 == 0) goto L_0x0070
            java.lang.String r0 = "mobileconfig_spoof"
            java.io.File r3 = new java.io.File
            r3.<init>(r11, r0)
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x0067 }
            r4.<init>(r3, r1)     // Catch:{ IOException -> 0x0067 }
            r4.mkdirs()     // Catch:{ IOException -> 0x0067 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0067 }
            r0.<init>(r11, r1)     // Catch:{ IOException -> 0x0067 }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0067 }
            r2.<init>(r0, r5)     // Catch:{ IOException -> 0x0067 }
            boolean r0 = r2.exists()     // Catch:{ IOException -> 0x0067 }
            if (r0 == 0) goto L_0x006f
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0067 }
            r1.<init>(r4, r5)     // Catch:{ IOException -> 0x0067 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0067 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0067 }
            java.nio.channels.FileChannel r11 = r0.getChannel()     // Catch:{ IOException -> 0x0067 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x0060 }
            r0.<init>(r1)     // Catch:{ all -> 0x0060 }
            java.nio.channels.FileChannel r10 = r0.getChannel()     // Catch:{ all -> 0x0060 }
            r12 = 0
            long r14 = r11.size()     // Catch:{ all -> 0x0059 }
            r10.transferFrom(r11, r12, r14)     // Catch:{ all -> 0x0059 }
            r10.close()     // Catch:{ all -> 0x0060 }
            r11.close()     // Catch:{ IOException -> 0x0067 }
            goto L_0x006f
        L_0x0059:
            r0 = move-exception
            if (r10 == 0) goto L_0x005f
            r10.close()     // Catch:{ all -> 0x005f }
        L_0x005f:
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            if (r11 == 0) goto L_0x0066
            r11.close()     // Catch:{ all -> 0x0066 }
        L_0x0066:
            throw r0     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            r2 = move-exception
            java.lang.String r1 = "MobileConfigIGUtils"
            java.lang.String r0 = "Failed to copy id_name_mapping file for spoofing"
            X.AnonymousClass0LU.A0H(r1, r0, r2)
        L_0x006f:
            r11 = r3
        L_0x0070:
            r3 = 0
            java.util.HashMap r29 = X.AnonymousClass0wJ.A0y()
            com.facebook.mobileconfig.MobileConfigManagerParamsHolder r1 = new com.facebook.mobileconfig.MobileConfigManagerParamsHolder
            r1.<init>()
            r5 = r35
            r1.setInstagramFlags(r3, r5)
            r0 = r34
            if (r34 == 0) goto L_0x0086
            r1.setFamilyDeviceId(r0)
        L_0x0086:
            r25 = 0
            r0 = r31
            if (r31 == 0) goto L_0x0096
            X.3zp r0 = r0.A00
            X.3Iv r0 = r0.A06()
            com.facebook.mobileconfig.MobileConfigManagerHolderImpl r25 = X.AnonymousClass19e.A00(r0)
        L_0x0096:
            r10 = 1
            X.3DF r22 = new X.3DF
            r15 = r30
            r6 = r33
            r31 = r37
            r23 = r9
            r24 = r17
            r26 = r1
            r27 = r15
            r28 = r6
            r30 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.47i r7 = new X.47i
            r7.<init>()
            X.3YJ r0 = X.AnonymousClass3YJ.A08
            r2 = 4
            com.facebook.redex.IDxProviderShape244S0100000_1_I2 r1 = new com.facebook.redex.IDxProviderShape244S0100000_1_I2
            r1.<init>(r15, r2)
            X.47S r12 = new X.47S
            r12.<init>(r1)
            X.4UI r1 = X.AnonymousClass4UI.A00
            X.47S r8 = new X.47S
            r8.<init>(r1)
            java.lang.String r4 = "ig4a"
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.A07     // Catch:{ all -> 0x01c6 }
            boolean r1 = r2.get()     // Catch:{ all -> 0x01c6 }
            if (r1 != 0) goto L_0x00dd
            r0.A03 = r12     // Catch:{ all -> 0x01c6 }
            r0.A02 = r8     // Catch:{ all -> 0x01c6 }
            r0.A00 = r6     // Catch:{ all -> 0x01c6 }
            r0.A01 = r4     // Catch:{ all -> 0x01c6 }
            r2.set(r10)     // Catch:{ all -> 0x01c6 }
        L_0x00dd:
            monitor-exit(r0)
            X.19e r19 = new X.19e
            r19.<init>()
            java.util.HashSet r24 = X.C18200wM.A0u()
            X.35E r14 = new X.35E
            r1 = r32
            r14.<init>(r1)
            r2 = 3
            com.facebook.redex.IDxProviderShape244S0100000_1_I2 r1 = new com.facebook.redex.IDxProviderShape244S0100000_1_I2
            r1.<init>(r9, r2)
            X.47S r13 = new X.47S
            r13.<init>(r1)
            X.401 r18 = new X.401
            r18.<init>()
            X.4U8 r12 = new X.4U8
            r12.<init>(r0)
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r0 = 60
            int r0 = r1.nextInt(r0)
            if (r0 != 0) goto L_0x0135
            java.lang.String r8 = "api2"
            r2 = 5184000(0x4f1a00, float:7.264331E-39)
            long r0 = X.C18190wL.A07()
            int r6 = (int) r0
            java.lang.String r4 = "mc_ratelimit_"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r4, r8)
            int r0 = X.AnonymousClass0SH.A00(r9, r0, r3)
            if (r0 != 0) goto L_0x01b8
            double r0 = java.lang.Math.random()
            double r2 = (double) r2
            double r0 = r0 * r2
            int r2 = (int) r0
            int r6 = r6 - r2
            java.lang.String r0 = X.AnonymousClass00U.A0L(r4, r8)
            X.AnonymousClass0SH.A02(r9, r0, r6)
        L_0x0135:
            r28 = 0
        L_0x0137:
            X.3zp r1 = new X.3zp
            r25 = r12
            r26 = r13
            r27 = r5
            r20 = r7
            r21 = r14
            r23 = r11
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.38S r0 = r7.A00
            if (r0 != 0) goto L_0x0155
            X.38S r0 = new X.38S
            r0.<init>(r1, r15)
            r7.A00 = r0
        L_0x0155:
            r2 = 36323298631491337(0x810bd900001f09, double:3.0343385445143353E-306)
            boolean r0 = X.C18210wN.A1S(r2)
            X.01V r8 = X.AnonymousClass01V.A0p
            r7 = 13644804(0xd03404, float:1.9120443E-38)
            r8.markerStart((int) r7, (int) r5)
            java.lang.String r2 = "app_upgrade"
            if (r0 == 0) goto L_0x01a7
            r1.A0E(r10)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A09
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x01a7
            X.3Iv r0 = r1.A06()
            X.3V0 r0 = r0.getLatestHandle()
            if (r0 == 0) goto L_0x01a7
            java.lang.String r0 = "java_manager_created_v2"
            r8.markerPoint((int) r7, (int) r5, (java.lang.String) r0)
            boolean r0 = r1.A0F()
            r8.markerAnnotate((int) r7, (int) r5, (java.lang.String) r2, (boolean) r0)
            X.0gE r0 = X.AnonymousClass0gE.A00()
            java.util.concurrent.ScheduledThreadPoolExecutor r6 = r0.A00
            X.4SQ r4 = new X.4SQ
            r4.<init>(r1, r8, r5)
            r2 = 0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r6.schedule(r4, r2, r0)
            r0 = 2
        L_0x019e:
            r8.markerEnd(r7, r5, r0)
            X.3Xz r0 = new X.3Xz
            r0.<init>(r1)
            return r0
        L_0x01a7:
            r1.A0A()
            java.lang.String r0 = "cpp_manager_created_v2"
            r8.markerPoint((int) r7, (int) r5, (java.lang.String) r0)
            boolean r0 = r1.A0F()
            r8.markerAnnotate((int) r7, (int) r5, (java.lang.String) r2, (boolean) r0)
            r0 = 3
            goto L_0x019e
        L_0x01b8:
            int r0 = r0 + r2
            if (r0 > r6) goto L_0x0135
            java.lang.String r0 = X.AnonymousClass00U.A0L(r4, r8)
            X.AnonymousClass0SH.A02(r9, r0, r6)
            r28 = 1
            goto L_0x0137
        L_0x01c6:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2R1.A00(android.content.Context, X.0i6, X.3Xz, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean):X.3Xz");
    }
}
