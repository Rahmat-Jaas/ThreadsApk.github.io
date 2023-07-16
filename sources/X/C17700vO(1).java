package X;

/* renamed from: X.0vO  reason: invalid class name and case insensitive filesystem */
public final class C17700vO implements C14140os {
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x007e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0073=Splitter:B:19:0x0073, B:26:0x007e=Splitter:B:26:0x007e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CPs() {
        /*
            r9 = this;
            X.C14250p4.A00()
            r2 = 1
            long r0 = X.C14220p1.A02
            long r2 = r2 & r0
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x004f
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            java.lang.String r0 = "Android trace tags: "
            r5.append(r0)
            java.lang.String r4 = "debug.atrace.tags.enableflags"
            r2 = 0
            boolean r0 = X.C02640Cf.A05
            if (r0 == 0) goto L_0x0038
            java.lang.reflect.Method r1 = X.C02640Cf.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0}
            java.lang.Object r0 = X.C02640Cf.A00(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0038
            long r2 = r0.longValue()
        L_0x0038:
            r5.append(r2)
            java.lang.String r0 = ", Facebook trace tags: "
            r5.append(r0)
            long r0 = X.C14220p1.A02
            r5.append(r0)
            java.lang.String r2 = r5.toString()
            r1 = 0
            java.lang.String r0 = "process_labels"
            com.facebook.systrace.Systrace.A01(r1, r0, r2)
        L_0x004f:
            r2 = 64
            long r0 = X.C14220p1.A02
            long r2 = r2 & r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = "/proc/self/cmdline"
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ IOException -> 0x0084 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0084 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x007f }
            r3.<init>(r4)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x007a }
            r2 = 0
            int r0 = r1.indexOf(r2)     // Catch:{ all -> 0x007a }
            if (r0 < 0) goto L_0x0073
            java.lang.String r1 = r1.substring(r2, r0)     // Catch:{ all -> 0x007a }
        L_0x0073:
            r3.close()     // Catch:{ all -> 0x007f }
            r4.close()     // Catch:{ IOException -> 0x0084 }
            goto L_0x008b
        L_0x007a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x007e }
        L_0x007e:
            throw r0     // Catch:{ all -> 0x007f }
        L_0x007f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0083 }
        L_0x0083:
            throw r0     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x008b:
            java.lang.String r0 = "process_name"
            com.facebook.systrace.Systrace.A01(r2, r0, r1)
            java.lang.String r0 = "dalvik.vm.heapgrowthlimit"
            java.lang.String r4 = X.C02640Cf.A01(r0)
            java.lang.String r0 = "dalvik.vm.heapmaxfree"
            java.lang.String r6 = X.C02640Cf.A01(r0)
            java.lang.String r0 = "dalvik.vm.heapminfree"
            java.lang.String r7 = X.C02640Cf.A01(r0)
            java.lang.String r0 = "dalvik.vm.heapstartsize"
            java.lang.String r5 = X.C02640Cf.A01(r0)
            java.lang.String r0 = "dalvik.vm.heaptargetutilization"
            java.lang.String r8 = X.C02640Cf.A01(r0)
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8}
            java.lang.String r0 = "device=%s,heapgrowthlimit=%s,heapstartsize=%s,heapminfree=%s,heapmaxfree=%s,heaptargetutilization=%s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "process_labels"
            com.facebook.systrace.Systrace.A01(r2, r0, r1)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17700vO.CPs():void");
    }

    public final void CPu() {
    }
}
