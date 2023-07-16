package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.0Pn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C04880Pn implements Runnable {
    public final /* synthetic */ AnonymousClass0ND A00;
    public final /* synthetic */ C04910Pt A01;
    public final /* synthetic */ CountDownLatch A02;

    public /* synthetic */ C04880Pn(AnonymousClass0ND r1, C04910Pt r2, CountDownLatch countDownLatch) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = countDownLatch;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.0Y4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.0Y3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.0Y4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.0Y4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.0Y4} */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d6, code lost:
        if (r14 == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0147, code lost:
        if (r20 == 0) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        X.C04790Pd.A00();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x01f9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x022e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x010c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0194 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0204 A[Catch:{ all -> 0x022a, all -> 0x022e, IOException -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x020f A[Catch:{ all -> 0x022a, all -> 0x022e, IOException -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x00ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7 A[Catch:{ all -> 0x0108, all -> 0x010c, IOException -> 0x011c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r27 = this;
            r0 = r27
            X.0Pt r11 = r0.A01
            X.0ND r10 = r0.A00
            java.util.concurrent.CountDownLatch r0 = r0.A02
            r26 = r0
            X.0Ps r2 = r11.A04
            java.lang.String r1 = "send_"
            java.lang.String r0 = r10.name()
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            boolean r0 = r2.A00(r0)
            if (r0 != 0) goto L_0x0271
            java.lang.Object r1 = r2.A00
            monitor-enter(r1)
            monitor-exit(r1)     // Catch:{ all -> 0x026e }
            X.0Oe r0 = r11.A0D
            java.lang.Object r0 = r0.get()
            X.0Pi r0 = (X.C04840Pi) r0
            java.io.File r2 = r0.A01
            r1 = 6
            com.facebook.redex.IDxFFilterShape519S0100000_I2 r0 = new com.facebook.redex.IDxFFilterShape519S0100000_I2
            r0.<init>(r10, r1)
            java.io.File[] r9 = r2.listFiles(r0)
            X.0Y6 r8 = r11.A03
            if (r8 == 0) goto L_0x006a
            java.io.File r0 = r8.A04
            java.io.File[] r6 = r0.listFiles()
            if (r6 == 0) goto L_0x006a
            long r14 = java.lang.System.currentTimeMillis()
            int r5 = r6.length
            r4 = 0
        L_0x0046:
            if (r4 >= r5) goto L_0x006a
            r7 = r6[r4]
            long r0 = r7.lastModified()
            long r12 = r14 - r0
            r1 = 0
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0064
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0 = 3
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            long r1 = r3.convert(r0, r2)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0067
        L_0x0064:
            r7.delete()
        L_0x0067:
            int r4 = r4 + 1
            goto L_0x0046
        L_0x006a:
            if (r9 == 0) goto L_0x0271
            X.0Pr r0 = X.C04890Pr.A00
            java.util.Arrays.sort(r9, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r11.A09
            r0.getAndIncrement()
            int r0 = r9.length
            r25 = r0
            X.0Pv r22 = new X.0Pv
            r22.<init>()
            r7 = 0
        L_0x007f:
            r0 = r25
            if (r7 >= r0) goto L_0x0271
            r15 = r9[r7]
            java.lang.String r1 = "_report.txt"
            r3 = 0
            com.facebook.redex.IDxFFilterShape2S1000000_I2 r0 = new com.facebook.redex.IDxFFilterShape2S1000000_I2
            r0.<init>(r1, r3)
            java.io.File[] r2 = r15.listFiles(r0)
            if (r2 == 0) goto L_0x0263
            int r1 = r2.length
            r0 = 1
            if (r1 != r0) goto L_0x0263
            r6 = r2[r3]
        L_0x0099:
            r0 = 0
            if (r8 == 0) goto L_0x01fd
            if (r6 == 0) goto L_0x025d
            boolean r5 = r8.A07
            java.util.Properties r4 = new java.util.Properties
            if (r5 == 0) goto L_0x010d
            r4.<init>()
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ IOException -> 0x011c }
            r1.<init>(r6)     // Catch:{ IOException -> 0x011c }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x011c }
            r3.<init>(r1)     // Catch:{ IOException -> 0x011c }
            java.lang.String r12 = r3.readLine()     // Catch:{ all -> 0x0108 }
            r16 = 0
            r14 = 0
            r13 = 0
        L_0x00b9:
            if (r12 == 0) goto L_0x0104
            if (r16 == 0) goto L_0x00c2
            if (r14 == 0) goto L_0x00d8
            if (r13 != 0) goto L_0x0104
            goto L_0x00ed
        L_0x00c2:
            X.0ON r1 = X.AnonymousClass0MU.A4A     // Catch:{ all -> 0x0108 }
            java.lang.String r2 = r1.A00     // Catch:{ all -> 0x0108 }
            boolean r1 = r12.startsWith(r2)     // Catch:{ all -> 0x0108 }
            if (r1 == 0) goto L_0x00d6
            java.lang.String r1 = X.AnonymousClass0Y6.A00(r12)     // Catch:{ all -> 0x0108 }
            r4.setProperty(r2, r1)     // Catch:{ all -> 0x0108 }
            r16 = 1
            goto L_0x00ff
        L_0x00d6:
            if (r14 != 0) goto L_0x00eb
        L_0x00d8:
            X.0OO r1 = X.AnonymousClass0MU.A2y     // Catch:{ all -> 0x0108 }
            java.lang.String r2 = r1.A00     // Catch:{ all -> 0x0108 }
            boolean r1 = r12.startsWith(r2)     // Catch:{ all -> 0x0108 }
            if (r1 == 0) goto L_0x00eb
            java.lang.String r1 = X.AnonymousClass0Y6.A00(r12)     // Catch:{ all -> 0x0108 }
            r4.setProperty(r2, r1)     // Catch:{ all -> 0x0108 }
            r14 = 1
            goto L_0x00ff
        L_0x00eb:
            if (r13 != 0) goto L_0x00ff
        L_0x00ed:
            X.0OO r1 = X.AnonymousClass0MU.A1K     // Catch:{ all -> 0x0108 }
            java.lang.String r2 = r1.A00     // Catch:{ all -> 0x0108 }
            boolean r1 = r12.startsWith(r2)     // Catch:{ all -> 0x0108 }
            if (r1 == 0) goto L_0x00ff
            java.lang.String r1 = X.AnonymousClass0Y6.A00(r12)     // Catch:{ all -> 0x0108 }
            r4.setProperty(r2, r1)     // Catch:{ all -> 0x0108 }
            r13 = 1
        L_0x00ff:
            java.lang.String r12 = r3.readLine()     // Catch:{ all -> 0x0108 }
            goto L_0x00b9
        L_0x0104:
            r3.close()     // Catch:{ IOException -> 0x011c }
            goto L_0x011f
        L_0x0108:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x010c }
        L_0x010c:
            throw r1     // Catch:{ IOException -> 0x011c }
        L_0x010d:
            r4.<init>()
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException | IllegalArgumentException -> 0x01fa }
            r2.<init>(r6)     // Catch:{ IOException | IllegalArgumentException -> 0x01fa }
            r4.load(r2)     // Catch:{ all -> 0x01f5 }
            r2.close()     // Catch:{ IOException | IllegalArgumentException -> 0x01fa }
            goto L_0x011f
        L_0x011c:
            X.C04790Pd.A00()
        L_0x011f:
            X.0ON r1 = X.AnonymousClass0MU.A4A
            java.lang.String r12 = r1.A00
            java.lang.String r1 = r4.getProperty(r12)
            if (r1 != 0) goto L_0x012c
            r3 = 0
            goto L_0x0200
        L_0x012c:
            java.util.Properties r3 = new java.util.Properties
            r3.<init>()
            X.0OO r1 = X.AnonymousClass0MU.A2y
            java.lang.String r1 = r1.A00
            java.lang.String r2 = r4.getProperty(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            r13 = 0
            if (r1 != 0) goto L_0x0180
            long r20 = java.lang.Long.parseLong(r2)
            int r1 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x015b
        L_0x0149:
            X.0OO r1 = X.AnonymousClass0MU.A1K
            java.lang.String r1 = r1.A00
            java.lang.String r2 = r4.getProperty(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x015b
            long r20 = java.lang.Long.parseLong(r2)
        L_0x015b:
            r1 = 1
            long r20 = r20 - r1
            r1 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 * r1
            r18 = 0
            int r1 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x01ee
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r20
            long r1 = r8.A03
            long r1 = r1 - r13
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r13.toNanos(r1)
            java.util.concurrent.locks.Lock r13 = r8.A06
            r17 = r13
            r17.lock()
            goto L_0x0183
        L_0x0180:
            r20 = 0
            goto L_0x0149
        L_0x0183:
            long r13 = r8.A02     // Catch:{ all -> 0x0269 }
            int r16 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r16 != 0) goto L_0x0197
            int r13 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r13 <= 0) goto L_0x0197
            java.util.concurrent.locks.Condition r13 = r8.A05     // Catch:{ InterruptedException -> 0x0194 }
            long r1 = r13.awaitNanos(r1)     // Catch:{ InterruptedException -> 0x0194 }
            goto L_0x0183
        L_0x0194:
            X.C04790Pd.A00()     // Catch:{ all -> 0x0269 }
        L_0x0197:
            long r1 = r8.A02     // Catch:{ all -> 0x0269 }
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0269 }
            int r1 = r8.A00     // Catch:{ all -> 0x0269 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0269 }
            android.util.Pair r13 = new android.util.Pair     // Catch:{ all -> 0x0269 }
            r13.<init>(r2, r1)     // Catch:{ all -> 0x0269 }
            r17.unlock()
            java.lang.Object r1 = r13.first
            java.lang.Number r1 = (java.lang.Number) r1
            long r16 = r1.longValue()
            int r1 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r1 <= 0) goto L_0x01dc
            long r16 = r16 - r20
            monitor-enter(r8)
            r4.getProperty(r12)     // Catch:{ all -> 0x0266 }
            java.lang.String r2 = java.lang.Long.toString(r16)     // Catch:{ all -> 0x0266 }
            monitor-exit(r8)     // Catch:{ all -> 0x0266 }
            X.0OO r1 = X.AnonymousClass0MU.A2Q
            java.lang.String r1 = r1.A00
            r3.setProperty(r1, r2)
            X.0ON r1 = X.AnonymousClass0MU.A88
            java.lang.String r2 = r1.A00
            java.lang.Object r1 = r13.second
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r3.setProperty(r2, r1)
        L_0x01dc:
            long r12 = android.os.SystemClock.uptimeMillis()
            long r1 = r8.A01
            long r12 = r12 - r1
            java.lang.String r2 = java.lang.Long.toString(r12)
            X.0OO r1 = X.AnonymousClass0MU.A2S
            java.lang.String r1 = r1.A00
            r3.setProperty(r1, r2)
        L_0x01ee:
            if (r5 != 0) goto L_0x0200
            r4.putAll(r3)
            r3 = r4
            goto L_0x0200
        L_0x01f5:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x01f9 }
        L_0x01f9:
            throw r1     // Catch:{ IOException | IllegalArgumentException -> 0x01fa }
        L_0x01fa:
            X.C04790Pd.A00()
        L_0x01fd:
            r3 = r0
            if (r6 == 0) goto L_0x025d
        L_0x0200:
            boolean r1 = r11.A0F     // Catch:{ IOException -> 0x022f }
            if (r1 == 0) goto L_0x020f
            X.0Y3 r4 = new X.0Y3     // Catch:{ IOException -> 0x022f }
            r4.<init>(r6)     // Catch:{ IOException -> 0x022f }
            if (r3 == 0) goto L_0x0233
            r4.A6C(r3)     // Catch:{ IOException -> 0x022f }
            goto L_0x0233
        L_0x020f:
            java.util.Properties r2 = new java.util.Properties     // Catch:{ IOException -> 0x022f }
            r2.<init>()     // Catch:{ IOException -> 0x022f }
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ IOException -> 0x022f }
            r1.<init>(r6)     // Catch:{ IOException -> 0x022f }
            r2.load(r1)     // Catch:{ all -> 0x022a }
            r1.close()     // Catch:{ IOException -> 0x022f }
            if (r3 == 0) goto L_0x0224
            r2.putAll(r3)     // Catch:{ IOException -> 0x022f }
        L_0x0224:
            X.0Y4 r4 = new X.0Y4     // Catch:{ IOException -> 0x022f }
            r4.<init>(r2)     // Catch:{ IOException -> 0x022f }
            goto L_0x0233
        L_0x022a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x022e }
        L_0x022e:
            throw r0     // Catch:{ IOException -> 0x022f }
        L_0x022f:
            X.C04790Pd.A00()
            goto L_0x025d
        L_0x0233:
            if (r8 == 0) goto L_0x0240
            X.0ND r0 = X.AnonymousClass0ND.LARGE_REPORT
            if (r10 != r0) goto L_0x0261
            if (r3 == 0) goto L_0x0261
            X.0O8 r0 = new X.0O8
            r0.<init>(r8, r3)
        L_0x0240:
            int r1 = X.C04910Pt.A0H
            int r1 = r1 + 1
            X.C04910Pt.A0H = r1
            r15.getName()
            java.util.concurrent.Executor r2 = r11.A08
            X.0Pp r1 = new X.0Pp
            r19 = r1
            r20 = r4
            r21 = r11
            r23 = r15
            r24 = r0
            r19.<init>(r20, r21, r22, r23, r24)
            r2.execute(r1)
        L_0x025d:
            int r7 = r7 + 1
            goto L_0x007f
        L_0x0261:
            r0 = 0
            goto L_0x0240
        L_0x0263:
            r6 = 0
            goto L_0x0099
        L_0x0266:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0266 }
            throw r0
        L_0x0269:
            r0 = move-exception
            r17.unlock()
            throw r0
        L_0x026e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x026e }
            throw r0
        L_0x0271:
            r26.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04880Pn.run():void");
    }
}
