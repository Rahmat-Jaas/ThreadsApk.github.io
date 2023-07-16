package X;

/* renamed from: X.06j  reason: invalid class name and case insensitive filesystem */
public final class C013706j {
    public static final C013606i A00 = new C15200qu();
    public static final C013606i A01 = new C15220qw();

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.pm.PackageInfo r3, java.io.File r4) {
        /*
            java.lang.String r0 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            java.io.File r1 = new java.io.File
            r1.<init>(r4, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x001f }
            r0.<init>(r1)     // Catch:{ IOException -> 0x001f }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x001f }
            r2.<init>(r0)     // Catch:{ IOException -> 0x001f }
            long r0 = r3.lastUpdateTime     // Catch:{ all -> 0x001a }
            r2.writeLong(r0)     // Catch:{ all -> 0x001a }
            r2.close()     // Catch:{ IOException -> 0x001f }
            return
        L_0x001a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x001e }
        L_0x001e:
            throw r0     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C013706j.A01(android.content.pm.PackageInfo, java.io.File):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x02a2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0055 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:175:0x0468 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:208:0x04c7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:213:0x04cc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x01cf */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:116:0x02a2=Splitter:B:116:0x02a2, B:149:0x03b7=Splitter:B:149:0x03b7} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r23, X.C013606i r24, java.util.concurrent.Executor r25, boolean r26) {
        /*
            android.content.Context r1 = r23.getApplicationContext()
            java.lang.String r5 = r1.getPackageName()
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo()
            android.content.res.AssetManager r6 = r1.getAssets()
            java.lang.String r1 = r0.sourceDir
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            java.lang.String r9 = r0.getName()
            android.content.pm.PackageManager r1 = r23.getPackageManager()
            r16 = 0
            r7 = r24
            r0 = r16
            android.content.pm.PackageInfo r18 = r1.getPackageInfo(r5, r0)     // Catch:{ NameNotFoundException -> 0x0519 }
            java.io.File r17 = r23.getFilesDir()
            if (r26 != 0) goto L_0x0056
            java.lang.String r2 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            java.io.File r1 = new java.io.File
            r0 = r17
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0056
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0056 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0056 }
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0056 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0056 }
            long r3 = r1.readLong()     // Catch:{ all -> 0x0051 }
            r1.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x04eb
        L_0x0051:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            r23.getPackageName()
            java.lang.String r0 = "/data/misc/profiles/cur/0"
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r5)
            java.lang.String r0 = "primary.prof"
            java.io.File r8 = new java.io.File
            r8.<init>(r1, r0)
            X.06c r5 = new X.06c
            r10 = r25
            r5.<init>(r6, r7, r8, r9, r10)
            boolean r0 = r5.A01()
            if (r0 == 0) goto L_0x04fb
            X.06c r5 = r5.A00()
            X.06d[] r4 = r5.A02
            byte[] r1 = r5.A08
            if (r4 == 0) goto L_0x047d
            if (r1 == 0) goto L_0x047d
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0503
            r19 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0469, IllegalStateException -> 0x0471 }
            r3.<init>()     // Catch:{ IOException -> 0x0469, IllegalStateException -> 0x0471 }
            byte[] r22 = X.C014506r.A00     // Catch:{ all -> 0x0464 }
            r0 = r22
            r3.write(r0)     // Catch:{ all -> 0x0464 }
            r3.write(r1)     // Catch:{ all -> 0x0464 }
            byte[] r21 = X.C014806w.A06     // Catch:{ all -> 0x0464 }
            r0 = r21
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x0464 }
            r13 = 1
            if (r0 == 0) goto L_0x02a3
            r1 = 3
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0464 }
            r15.<init>(r1)     // Catch:{ all -> 0x0464 }
            java.util.ArrayList r20 = new java.util.ArrayList     // Catch:{ all -> 0x0464 }
            r0 = r20
            r0.<init>(r1)     // Catch:{ all -> 0x0464 }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0464 }
            r6.<init>()     // Catch:{ all -> 0x0464 }
            int r2 = r4.length     // Catch:{ all -> 0x029e }
            long r0 = (long) r2     // Catch:{ all -> 0x029e }
            r7 = 2
            X.C013206e.A02(r6, r7, r0)     // Catch:{ all -> 0x029e }
            r7 = 0
            r11 = 2
        L_0x00ba:
            if (r7 >= r2) goto L_0x00f8
            r9 = r4[r7]     // Catch:{ all -> 0x029e }
            int r10 = r11 + 4
            long r0 = r9.A05     // Catch:{ all -> 0x029e }
            r8 = 4
            X.C013206e.A02(r6, r8, r0)     // Catch:{ all -> 0x029e }
            int r10 = r10 + 4
            long r0 = r9.A01     // Catch:{ all -> 0x029e }
            X.C013206e.A02(r6, r8, r0)     // Catch:{ all -> 0x029e }
            int r10 = r10 + 4
            int r0 = r9.A04     // Catch:{ all -> 0x029e }
            long r0 = (long) r0     // Catch:{ all -> 0x029e }
            X.C013206e.A02(r6, r8, r0)     // Catch:{ all -> 0x029e }
            java.lang.String r1 = r9.A06     // Catch:{ all -> 0x029e }
            java.lang.String r8 = r9.A07     // Catch:{ all -> 0x029e }
            r0 = r21
            java.lang.String r12 = X.C014506r.A00(r1, r8, r0)     // Catch:{ all -> 0x029e }
            int r11 = r10 + 2
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x029e }
            byte[] r0 = r12.getBytes(r10)     // Catch:{ all -> 0x029e }
            int r9 = r0.length     // Catch:{ all -> 0x029e }
            long r0 = (long) r9     // Catch:{ all -> 0x029e }
            r8 = 2
            X.C013206e.A02(r6, r8, r0)     // Catch:{ all -> 0x029e }
            int r11 = r11 + r9
            byte[] r0 = r12.getBytes(r10)     // Catch:{ all -> 0x029e }
            r6.write(r0)     // Catch:{ all -> 0x029e }
            int r7 = r7 + 1
            goto L_0x00ba
        L_0x00f8:
            byte[] r1 = r6.toByteArray()     // Catch:{ all -> 0x029e }
            int r7 = r1.length     // Catch:{ all -> 0x029e }
            if (r11 != r7) goto L_0x0290
            java.lang.Integer r8 = X.AnonymousClass006.A00     // Catch:{ all -> 0x029e }
            X.06x r7 = new X.06x     // Catch:{ all -> 0x029e }
            r0 = r16
            r7.<init>(r8, r1, r0)     // Catch:{ all -> 0x029e }
            r6.close()     // Catch:{ all -> 0x0464 }
            r15.add(r7)     // Catch:{ all -> 0x0464 }
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0464 }
            r8.<init>()     // Catch:{ all -> 0x0464 }
            r7 = 0
            r10 = 0
        L_0x0115:
            if (r7 >= r2) goto L_0x0149
            r9 = r4[r7]     // Catch:{ all -> 0x028b }
            int r10 = r10 + 2
            long r0 = (long) r7     // Catch:{ all -> 0x028b }
            r6 = 2
            X.C013206e.A02(r8, r6, r0)     // Catch:{ all -> 0x028b }
            int r10 = r10 + 2
            int r0 = r9.A00     // Catch:{ all -> 0x028b }
            long r0 = (long) r0     // Catch:{ all -> 0x028b }
            X.C013206e.A02(r8, r6, r0)     // Catch:{ all -> 0x028b }
            int r0 = r9.A00     // Catch:{ all -> 0x028b }
            int r0 = r0 << 1
            int r10 = r10 + r0
            int[] r12 = r9.A02     // Catch:{ all -> 0x028b }
            int r11 = r12.length     // Catch:{ all -> 0x028b }
            r9 = 0
            r1 = 0
        L_0x0132:
            if (r9 >= r11) goto L_0x0146
            r0 = r12[r9]     // Catch:{ all -> 0x028b }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x028b }
            int r0 = r0 - r1
            long r0 = (long) r0     // Catch:{ all -> 0x028b }
            X.C013206e.A02(r8, r6, r0)     // Catch:{ all -> 0x028b }
            int r1 = r14.intValue()     // Catch:{ all -> 0x028b }
            int r9 = r9 + 1
            goto L_0x0132
        L_0x0146:
            int r7 = r7 + 1
            goto L_0x0115
        L_0x0149:
            byte[] r1 = r8.toByteArray()     // Catch:{ all -> 0x028b }
            int r6 = r1.length     // Catch:{ all -> 0x028b }
            if (r10 != r6) goto L_0x027d
            java.lang.Integer r6 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x028b }
            X.06x r0 = new X.06x     // Catch:{ all -> 0x028b }
            r0.<init>(r6, r1, r13)     // Catch:{ all -> 0x028b }
            r8.close()     // Catch:{ all -> 0x0464 }
            r15.add(r0)     // Catch:{ all -> 0x0464 }
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0464 }
            r10.<init>()     // Catch:{ all -> 0x0464 }
            r9 = 0
            r6 = 0
        L_0x0164:
            if (r9 >= r2) goto L_0x01d0
            r1 = r4[r9]     // Catch:{ all -> 0x0278 }
            java.util.TreeMap r0 = r1.A08     // Catch:{ all -> 0x0278 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0278 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0278 }
            r12 = 0
        L_0x0173:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0278 }
            if (r0 == 0) goto L_0x018b
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0278 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0278 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0278 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0278 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0278 }
            r12 = r12 | r0
            goto L_0x0173
        L_0x018b:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0278 }
            r0.<init>()     // Catch:{ all -> 0x0278 }
            X.C014506r.A02(r1, r0)     // Catch:{ all -> 0x01cb }
            byte[] r8 = r0.toByteArray()     // Catch:{ all -> 0x01cb }
            r0.close()     // Catch:{ all -> 0x0278 }
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0278 }
            r0.<init>()     // Catch:{ all -> 0x0278 }
            X.C014506r.A03(r1, r0)     // Catch:{ all -> 0x01cb }
            byte[] r7 = r0.toByteArray()     // Catch:{ all -> 0x01cb }
            r0.close()     // Catch:{ all -> 0x0278 }
            int r14 = r6 + 2
            long r0 = (long) r9     // Catch:{ all -> 0x0278 }
            r6 = 2
            X.C013206e.A02(r10, r6, r0)     // Catch:{ all -> 0x0278 }
            int r0 = r8.length     // Catch:{ all -> 0x0278 }
            int r11 = r0 + 2
            int r0 = r7.length     // Catch:{ all -> 0x0278 }
            int r11 = r11 + r0
            int r6 = r14 + 4
            long r0 = (long) r11     // Catch:{ all -> 0x0278 }
            r14 = 4
            X.C013206e.A02(r10, r14, r0)     // Catch:{ all -> 0x0278 }
            long r0 = (long) r12     // Catch:{ all -> 0x0278 }
            r12 = 2
            X.C013206e.A02(r10, r12, r0)     // Catch:{ all -> 0x0278 }
            r10.write(r8)     // Catch:{ all -> 0x0278 }
            r10.write(r7)     // Catch:{ all -> 0x0278 }
            int r6 = r6 + r11
            int r9 = r9 + 1
            goto L_0x0164
        L_0x01cb:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x01cf }
        L_0x01cf:
            throw r1     // Catch:{ all -> 0x0278 }
        L_0x01d0:
            byte[] r4 = r10.toByteArray()     // Catch:{ all -> 0x0278 }
            int r2 = r4.length     // Catch:{ all -> 0x0278 }
            if (r6 != r2) goto L_0x026a
            java.lang.Integer r1 = X.AnonymousClass006.A0N     // Catch:{ all -> 0x0278 }
            X.06x r0 = new X.06x     // Catch:{ all -> 0x0278 }
            r0.<init>(r1, r4, r13)     // Catch:{ all -> 0x0278 }
            r10.close()     // Catch:{ all -> 0x0464 }
            r15.add(r0)     // Catch:{ all -> 0x0464 }
            r0 = r21
            int r0 = r0.length     // Catch:{ all -> 0x0464 }
            long r6 = (long) r0     // Catch:{ all -> 0x0464 }
            r0 = r22
            int r0 = r0.length     // Catch:{ all -> 0x0464 }
            long r0 = (long) r0     // Catch:{ all -> 0x0464 }
            long r6 = r6 + r0
            r0 = 4
            long r6 = r6 + r0
            int r0 = r15.size()     // Catch:{ all -> 0x0464 }
            int r0 = r0 << 4
            long r0 = (long) r0     // Catch:{ all -> 0x0464 }
            long r6 = r6 + r0
            int r0 = r15.size()     // Catch:{ all -> 0x0464 }
            long r0 = (long) r0     // Catch:{ all -> 0x0464 }
            r2 = 4
            X.C013206e.A02(r3, r2, r0)     // Catch:{ all -> 0x0464 }
            r4 = 0
            r2 = 0
        L_0x0203:
            int r0 = r15.size()     // Catch:{ all -> 0x0464 }
            if (r2 >= r0) goto L_0x0256
            java.lang.Object r8 = r15.get(r2)     // Catch:{ all -> 0x0464 }
            X.06x r8 = (X.C014906x) r8     // Catch:{ all -> 0x0464 }
            java.lang.Integer r0 = r8.A00     // Catch:{ all -> 0x0464 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0464 }
            switch(r0) {
                case 0: goto L_0x021b;
                case 1: goto L_0x0221;
                case 2: goto L_0x021e;
                default: goto L_0x0218;
            }     // Catch:{ all -> 0x0464 }
        L_0x0218:
            r0 = 3
            goto L_0x0223
        L_0x021b:
            r0 = 0
            goto L_0x0223
        L_0x021e:
            r0 = 2
            goto L_0x0223
        L_0x0221:
            r0 = 1
        L_0x0223:
            r10 = 4
            X.C013206e.A02(r3, r10, r0)     // Catch:{ all -> 0x0464 }
            X.C013206e.A02(r3, r10, r6)     // Catch:{ all -> 0x0464 }
            boolean r0 = r8.A01     // Catch:{ all -> 0x0464 }
            byte[] r8 = r8.A02     // Catch:{ all -> 0x0464 }
            if (r0 == 0) goto L_0x0244
            int r0 = r8.length     // Catch:{ all -> 0x0464 }
            long r0 = (long) r0     // Catch:{ all -> 0x0464 }
            byte[] r9 = X.C013206e.A05(r8)     // Catch:{ all -> 0x0464 }
            r8 = r20
            r8.add(r9)     // Catch:{ all -> 0x0464 }
            int r11 = r9.length     // Catch:{ all -> 0x0464 }
            long r8 = (long) r11     // Catch:{ all -> 0x0464 }
            X.C013206e.A02(r3, r10, r8)     // Catch:{ all -> 0x0464 }
        L_0x0240:
            X.C013206e.A02(r3, r10, r0)     // Catch:{ all -> 0x0464 }
            goto L_0x0251
        L_0x0244:
            r0 = r20
            r0.add(r8)     // Catch:{ all -> 0x0464 }
            int r11 = r8.length     // Catch:{ all -> 0x0464 }
            long r0 = (long) r11     // Catch:{ all -> 0x0464 }
            X.C013206e.A02(r3, r10, r0)     // Catch:{ all -> 0x0464 }
            r0 = 0
            goto L_0x0240
        L_0x0251:
            long r0 = (long) r11     // Catch:{ all -> 0x0464 }
            long r6 = r6 + r0
            int r2 = r2 + 1
            goto L_0x0203
        L_0x0256:
            int r0 = r20.size()     // Catch:{ all -> 0x0464 }
            if (r4 >= r0) goto L_0x0448
            r0 = r20
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0464 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0464 }
            r3.write(r0)     // Catch:{ all -> 0x0464 }
            int r4 = r4 + 1
            goto L_0x0256
        L_0x026a:
            java.lang.String r1 = "Expected size "
            java.lang.String r0 = ", does not match actual size "
            java.lang.String r1 = X.AnonymousClass00U.A01(r6, r2, r1, r0)     // Catch:{ all -> 0x0278 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0278 }
            r0.<init>(r1)     // Catch:{ all -> 0x0278 }
            throw r0     // Catch:{ all -> 0x0278 }
        L_0x0278:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x02a2 }
            goto L_0x02a2
        L_0x027d:
            java.lang.String r1 = "Expected size "
            java.lang.String r0 = ", does not match actual size "
            java.lang.String r1 = X.AnonymousClass00U.A01(r10, r6, r1, r0)     // Catch:{ all -> 0x028b }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x028b }
            r0.<init>(r1)     // Catch:{ all -> 0x028b }
            throw r0     // Catch:{ all -> 0x028b }
        L_0x028b:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x02a2 }
            goto L_0x02a2
        L_0x0290:
            java.lang.String r1 = "Expected size "
            java.lang.String r0 = ", does not match actual size "
            java.lang.String r1 = X.AnonymousClass00U.A01(r11, r7, r1, r0)     // Catch:{ all -> 0x029e }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x029e }
            r0.<init>(r1)     // Catch:{ all -> 0x029e }
            throw r0     // Catch:{ all -> 0x029e }
        L_0x029e:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x02a2 }
        L_0x02a2:
            throw r0     // Catch:{ all -> 0x0464 }
        L_0x02a3:
            byte[] r11 = X.C014806w.A05     // Catch:{ all -> 0x0464 }
            boolean r0 = java.util.Arrays.equals(r1, r11)     // Catch:{ all -> 0x0464 }
            if (r0 != 0) goto L_0x03b7
            byte[] r10 = X.C014806w.A03     // Catch:{ all -> 0x0464 }
            boolean r0 = java.util.Arrays.equals(r1, r10)     // Catch:{ all -> 0x0464 }
            if (r0 == 0) goto L_0x032a
            int r9 = r4.length     // Catch:{ all -> 0x0464 }
            long r0 = (long) r9     // Catch:{ all -> 0x0464 }
            X.C013206e.A02(r3, r13, r0)     // Catch:{ all -> 0x0464 }
            r6 = 0
        L_0x02b9:
            if (r6 >= r9) goto L_0x0448
            r2 = r4[r6]     // Catch:{ all -> 0x0464 }
            java.util.TreeMap r0 = r2.A08     // Catch:{ all -> 0x0464 }
            int r0 = r0.size()     // Catch:{ all -> 0x0464 }
            int r12 = r0 << 2
            java.lang.String r1 = r2.A06     // Catch:{ all -> 0x0464 }
            java.lang.String r0 = r2.A07     // Catch:{ all -> 0x0464 }
            java.lang.String r8 = X.C014506r.A00(r1, r0, r10)     // Catch:{ all -> 0x0464 }
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0464 }
            byte[] r0 = r8.getBytes(r7)     // Catch:{ all -> 0x0464 }
            int r0 = r0.length     // Catch:{ all -> 0x0464 }
            long r0 = (long) r0     // Catch:{ all -> 0x0464 }
            r11 = 2
            X.C013206e.A02(r3, r11, r0)     // Catch:{ all -> 0x0464 }
            int[] r0 = r2.A02     // Catch:{ all -> 0x0464 }
            int r0 = r0.length     // Catch:{ all -> 0x0464 }
            long r0 = (long) r0     // Catch:{ all -> 0x0464 }
            X.C013206e.A02(r3, r11, r0)     // Catch:{ all -> 0x0464 }
            long r0 = (long) r12     // Catch:{ all -> 0x0464 }
            r11 = 4
            X.C013206e.A02(r3, r11, r0)     // Catch:{ all -> 0x0464 }
            long r0 = r2.A05     // Catch:{ all -> 0x0464 }
            X.C013206e.A02(r3, r11, r0)     // Catch:{ all -> 0x0464 }
            byte[] r0 = r8.getBytes(r7)     // Catch:{ all -> 0x0464 }
            r3.write(r0)     // Catch:{ all -> 0x0464 }
            java.util.TreeMap r0 = r2.A08     // Catch:{ all -> 0x0464 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0464 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0464 }
        L_0x02fb:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0464 }
            if (r0 == 0) goto L_0x0317
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0464 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0464 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0464 }
            long r0 = (long) r0     // Catch:{ all -> 0x0464 }
            r7 = 2
            X.C013206e.A02(r3, r7, r0)     // Catch:{ all -> 0x0464 }
            r0 = r16
            long r0 = (long) r0     // Catch:{ all -> 0x0464 }
            X.C013206e.A02(r3, r7, r0)     // Catch:{ all -> 0x0464 }
            goto L_0x02fb
        L_0x0317:
            int[] r11 = r2.A02     // Catch:{ all -> 0x0464 }
            int r8 = r11.length     // Catch:{ all -> 0x0464 }
            r7 = 0
        L_0x031b:
            if (r7 >= r8) goto L_0x0327
            r0 = r11[r7]     // Catch:{ all -> 0x0464 }
            long r0 = (long) r0     // Catch:{ all -> 0x0464 }
            r2 = 2
            X.C013206e.A02(r3, r2, r0)     // Catch:{ all -> 0x0464 }
            int r7 = r7 + 1
            goto L_0x031b
        L_0x0327:
            int r6 = r6 + 1
            goto L_0x02b9
        L_0x032a:
            byte[] r11 = X.C014806w.A04     // Catch:{ all -> 0x0464 }
            boolean r0 = java.util.Arrays.equals(r1, r11)     // Catch:{ all -> 0x0464 }
            if (r0 != 0) goto L_0x03b7
            byte[] r11 = X.C014806w.A02     // Catch:{ all -> 0x0464 }
            boolean r0 = java.util.Arrays.equals(r1, r11)     // Catch:{ all -> 0x0464 }
            if (r0 == 0) goto L_0x03a8
            int r9 = r4.length     // Catch:{ all -> 0x0464 }
            long r0 = (long) r9     // Catch:{ all -> 0x0464 }
            r2 = 2
            X.C013206e.A02(r3, r2, r0)     // Catch:{ all -> 0x0464 }
            r2 = 0
        L_0x0341:
            if (r2 >= r9) goto L_0x0448
            r6 = r4[r2]     // Catch:{ all -> 0x0464 }
            java.lang.String r1 = r6.A06     // Catch:{ all -> 0x0464 }
            java.lang.String r0 = r6.A07     // Catch:{ all -> 0x0464 }
            java.lang.String r8 = X.C014506r.A00(r1, r0, r11)     // Catch:{ all -> 0x0464 }
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0464 }
            byte[] r0 = r8.getBytes(r7)     // Catch:{ all -> 0x0464 }
            int r0 = r0.length     // Catch:{ all -> 0x0464 }
            long r0 = (long) r0     // Catch:{ all -> 0x0464 }
            r10 = 2
            X.C013206e.A02(r3, r10, r0)     // Catch:{ all -> 0x0464 }
            java.util.TreeMap r12 = r6.A08     // Catch:{ all -> 0x0464 }
            int r0 = r12.size()     // Catch:{ all -> 0x0464 }
            long r0 = (long) r0     // Catch:{ all -> 0x0464 }
            X.C013206e.A02(r3, r10, r0)     // Catch:{ all -> 0x0464 }
            int[] r0 = r6.A02     // Catch:{ all -> 0x0464 }
            int r0 = r0.length     // Catch:{ all -> 0x0464 }
            long r0 = (long) r0     // Catch:{ all -> 0x0464 }
            X.C013206e.A02(r3, r10, r0)     // Catch:{ all -> 0x0464 }
            long r0 = r6.A05     // Catch:{ all -> 0x0464 }
            r10 = 4
            X.C013206e.A02(r3, r10, r0)     // Catch:{ all -> 0x0464 }
            byte[] r0 = r8.getBytes(r7)     // Catch:{ all -> 0x0464 }
            r3.write(r0)     // Catch:{ all -> 0x0464 }
            java.util.Set r0 = r12.keySet()     // Catch:{ all -> 0x0464 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0464 }
        L_0x037f:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0464 }
            if (r0 == 0) goto L_0x0395
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0464 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0464 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0464 }
            long r0 = (long) r0     // Catch:{ all -> 0x0464 }
            r7 = 2
            X.C013206e.A02(r3, r7, r0)     // Catch:{ all -> 0x0464 }
            goto L_0x037f
        L_0x0395:
            int[] r10 = r6.A02     // Catch:{ all -> 0x0464 }
            int r8 = r10.length     // Catch:{ all -> 0x0464 }
            r7 = 0
        L_0x0399:
            if (r7 >= r8) goto L_0x03a5
            r0 = r10[r7]     // Catch:{ all -> 0x0464 }
            long r0 = (long) r0     // Catch:{ all -> 0x0464 }
            r6 = 2
            X.C013206e.A02(r3, r6, r0)     // Catch:{ all -> 0x0464 }
            int r7 = r7 + 1
            goto L_0x0399
        L_0x03a5:
            int r2 = r2 + 1
            goto L_0x0341
        L_0x03a8:
            X.06i r2 = r5.A04     // Catch:{ all -> 0x0464 }
            r1 = 5
            r0 = r19
            r2.CHE(r1, r0)     // Catch:{ all -> 0x0464 }
            r5.A02 = r0     // Catch:{ all -> 0x0464 }
            r3.close()     // Catch:{ IOException -> 0x0469, IllegalStateException -> 0x0471 }
            goto L_0x047d
        L_0x03b7:
            int r8 = r4.length     // Catch:{ all -> 0x0464 }
            r10 = 0
            r1 = 0
            r6 = 0
        L_0x03bb:
            if (r1 >= r8) goto L_0x03e9
            r2 = r4[r1]     // Catch:{ all -> 0x0464 }
            java.lang.String r7 = r2.A06     // Catch:{ all -> 0x0464 }
            java.lang.String r0 = r2.A07     // Catch:{ all -> 0x0464 }
            java.lang.String r7 = X.C014506r.A00(r7, r0, r11)     // Catch:{ all -> 0x0464 }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0464 }
            byte[] r0 = r7.getBytes(r0)     // Catch:{ all -> 0x0464 }
            int r0 = r0.length     // Catch:{ all -> 0x0464 }
            int r7 = r0 + 16
            int r0 = r2.A00     // Catch:{ all -> 0x0464 }
            int r0 = r0 << 1
            int r7 = r7 + r0
            int r0 = r2.A03     // Catch:{ all -> 0x0464 }
            int r7 = r7 + r0
            int r0 = r2.A04     // Catch:{ all -> 0x0464 }
            int r0 = r0 << 1
            int r0 = r0 + 8
            int r0 = r0 + -1
            r0 = r0 & -8
            int r0 = r0 >> 3
            int r7 = r7 + r0
            int r6 = r6 + r7
            int r1 = r1 + 1
            goto L_0x03bb
        L_0x03e9:
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0464 }
            r7.<init>(r6)     // Catch:{ all -> 0x0464 }
            byte[] r0 = X.C014806w.A04     // Catch:{ all -> 0x0464 }
            boolean r0 = java.util.Arrays.equals(r11, r0)     // Catch:{ all -> 0x0464 }
            if (r0 != 0) goto L_0x0413
            r9 = 0
        L_0x03f7:
            if (r9 >= r8) goto L_0x0409
            r2 = r4[r9]     // Catch:{ all -> 0x0464 }
            java.lang.String r1 = r2.A06     // Catch:{ all -> 0x0464 }
            java.lang.String r0 = r2.A07     // Catch:{ all -> 0x0464 }
            java.lang.String r0 = X.C014506r.A00(r1, r0, r11)     // Catch:{ all -> 0x0464 }
            X.C014506r.A04(r2, r7, r0)     // Catch:{ all -> 0x0464 }
            int r9 = r9 + 1
            goto L_0x03f7
        L_0x0409:
            if (r10 >= r8) goto L_0x0428
            r0 = r4[r10]     // Catch:{ all -> 0x0464 }
            X.C014506r.A01(r0, r7)     // Catch:{ all -> 0x0464 }
            int r10 = r10 + 1
            goto L_0x0409
        L_0x0413:
            if (r10 >= r8) goto L_0x0428
            r1 = r4[r10]     // Catch:{ all -> 0x0464 }
            java.lang.String r2 = r1.A06     // Catch:{ all -> 0x0464 }
            java.lang.String r0 = r1.A07     // Catch:{ all -> 0x0464 }
            java.lang.String r0 = X.C014506r.A00(r2, r0, r11)     // Catch:{ all -> 0x0464 }
            X.C014506r.A04(r1, r7, r0)     // Catch:{ all -> 0x0464 }
            X.C014506r.A01(r1, r7)     // Catch:{ all -> 0x0464 }
            int r10 = r10 + 1
            goto L_0x0413
        L_0x0428:
            int r0 = r7.size()     // Catch:{ all -> 0x0464 }
            if (r0 != r6) goto L_0x0452
            byte[] r2 = r7.toByteArray()     // Catch:{ all -> 0x0464 }
            long r0 = (long) r8     // Catch:{ all -> 0x0464 }
            X.C013206e.A02(r3, r13, r0)     // Catch:{ all -> 0x0464 }
            int r0 = r2.length     // Catch:{ all -> 0x0464 }
            long r0 = (long) r0     // Catch:{ all -> 0x0464 }
            r4 = 4
            X.C013206e.A02(r3, r4, r0)     // Catch:{ all -> 0x0464 }
            byte[] r2 = X.C013206e.A05(r2)     // Catch:{ all -> 0x0464 }
            int r0 = r2.length     // Catch:{ all -> 0x0464 }
            long r0 = (long) r0     // Catch:{ all -> 0x0464 }
            X.C013206e.A02(r3, r4, r0)     // Catch:{ all -> 0x0464 }
            r3.write(r2)     // Catch:{ all -> 0x0464 }
        L_0x0448:
            byte[] r0 = r3.toByteArray()     // Catch:{ all -> 0x0464 }
            r5.A01 = r0     // Catch:{ all -> 0x0464 }
            r3.close()     // Catch:{ IOException -> 0x0469, IllegalStateException -> 0x0471 }
            goto L_0x0479
        L_0x0452:
            java.lang.String r2 = "The bytes saved do not match expectation. actual="
            int r1 = r7.size()     // Catch:{ all -> 0x0464 }
            java.lang.String r0 = " expected="
            java.lang.String r1 = X.AnonymousClass00U.A01(r1, r6, r2, r0)     // Catch:{ all -> 0x0464 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0464 }
            r0.<init>(r1)     // Catch:{ all -> 0x0464 }
            throw r0     // Catch:{ all -> 0x0464 }
        L_0x0464:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0468 }
        L_0x0468:
            throw r0     // Catch:{ IOException -> 0x0469, IllegalStateException -> 0x0471 }
        L_0x0469:
            r2 = move-exception
            X.06i r1 = r5.A04
            r0 = 7
            r1.CHE(r0, r2)
            goto L_0x0479
        L_0x0471:
            r2 = move-exception
            X.06i r1 = r5.A04
            r0 = 8
            r1.CHE(r0, r2)
        L_0x0479:
            r0 = r19
            r5.A02 = r0
        L_0x047d:
            byte[] r1 = r5.A01
            if (r1 == 0) goto L_0x04fb
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0511
            r4 = 0
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x04da, IOException -> 0x04cd }
            r6.<init>(r1)     // Catch:{ FileNotFoundException -> 0x04da, IOException -> 0x04cd }
            java.io.File r0 = r5.A05     // Catch:{ all -> 0x04c8 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x04c8 }
            r3.<init>(r0)     // Catch:{ all -> 0x04c8 }
            r0 = 512(0x200, float:7.175E-43)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x04c3 }
        L_0x0496:
            int r1 = r6.read(r2)     // Catch:{ all -> 0x04c3 }
            if (r1 <= 0) goto L_0x04a2
            r0 = r16
            r3.write(r2, r0, r1)     // Catch:{ all -> 0x04c3 }
            goto L_0x0496
        L_0x04a2:
            r2 = 1
            java.util.concurrent.Executor r1 = r5.A07     // Catch:{ all -> 0x04c3 }
            X.06b r0 = new X.06b     // Catch:{ all -> 0x04c3 }
            r0.<init>(r5, r4, r2)     // Catch:{ all -> 0x04c3 }
            r1.execute(r0)     // Catch:{ all -> 0x04c3 }
            r3.close()     // Catch:{ all -> 0x04c8 }
            r6.close()     // Catch:{ FileNotFoundException -> 0x04da, IOException -> 0x04cd }
            r5.A01 = r4
            r5.A02 = r4
            r1 = r18
            r0 = r17
            A01(r1, r0)
            if (r26 == 0) goto L_0x04fb
            r16 = 1
            goto L_0x04fb
        L_0x04c3:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x04c7 }
        L_0x04c7:
            throw r0     // Catch:{ all -> 0x04c8 }
        L_0x04c8:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x04cc }
        L_0x04cc:
            throw r0     // Catch:{ FileNotFoundException -> 0x04da, IOException -> 0x04cd }
        L_0x04cd:
            r3 = move-exception
            r2 = 7
            java.util.concurrent.Executor r1 = r5.A07     // Catch:{ all -> 0x050b }
            X.06b r0 = new X.06b     // Catch:{ all -> 0x050b }
            r0.<init>(r5, r3, r2)     // Catch:{ all -> 0x050b }
            r1.execute(r0)     // Catch:{ all -> 0x050b }
            goto L_0x04e6
        L_0x04da:
            r3 = move-exception
            r2 = 6
            java.util.concurrent.Executor r1 = r5.A07     // Catch:{ all -> 0x050b }
            X.06b r0 = new X.06b     // Catch:{ all -> 0x050b }
            r0.<init>(r5, r3, r2)     // Catch:{ all -> 0x050b }
            r1.execute(r0)     // Catch:{ all -> 0x050b }
        L_0x04e6:
            r5.A01 = r4
            r5.A02 = r4
            goto L_0x04fb
        L_0x04eb:
            r0 = r18
            long r1 = r0.lastUpdateTime
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0056
            r1 = 2
            r0 = 0
            r7.CHE(r1, r0)
            r23.getPackageName()
        L_0x04fb:
            r1 = r16
            r0 = r23
            X.C014706v.A01(r0, r1)
            return
        L_0x0503:
            java.lang.String r1 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x050b:
            r0 = move-exception
            r5.A01 = r4
            r5.A02 = r4
            throw r0
        L_0x0511:
            java.lang.String r1 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0519:
            r1 = move-exception
            r0 = 7
            r7.CHE(r0, r1)
            r1 = r16
            r0 = r23
            X.C014706v.A01(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C013706j.A00(android.content.Context, X.06i, java.util.concurrent.Executor, boolean):void");
    }
}
