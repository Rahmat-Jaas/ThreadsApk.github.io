package X;

/* renamed from: X.09q  reason: invalid class name and case insensitive filesystem */
public final class C020709q {
    public static final int[] A03 = {288, 4384, 8224};
    public final long A00;
    public final long A01;
    public final long A02;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r2 == null) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0185 A[EDGE_INSN: B:155:0x0185->B:125:0x0185 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01a9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b A[LOOP:2: B:46:0x008b->B:128:0x0192, LOOP_START, PHI: r3 r5 r7 r12 r13 
      PHI: (r3v4 long) = (r3v1 long), (r3v6 long) binds: [B:45:0x0089, B:128:0x0192] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v4 long) = (r5v1 long), (r5v6 long) binds: [B:45:0x0089, B:128:0x0192] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r7v3 long) = (r7v0 long), (r7v4 long) binds: [B:45:0x0089, B:128:0x0192] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v1 int) = (r12v0 int), (r12v3 int) binds: [B:45:0x0089, B:128:0x0192] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r13v1 int) = (r13v0 int), (r13v2 int) binds: [B:45:0x0089, B:128:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0110 A[LOOP:7: B:82:0x0107->B:85:0x0110, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C020709q() {
        /*
            r30 = this;
            java.lang.String r4 = "/proc/zoneinfo"
            r29 = r30
            r29.<init>()
            r7 = 0
            android.os.StrictMode$ThreadPolicy r3 = android.os.StrictMode.allowThreadDiskReads()
            r1 = 0
            r2 = 0
            int r0 = android.system.OsConstants.O_RDONLY     // Catch:{ ErrnoException | NullPointerException -> 0x002a, all -> 0x001a }
            java.io.FileDescriptor r2 = android.system.Os.open(r4, r0, r1)     // Catch:{ ErrnoException | NullPointerException -> 0x002a, all -> 0x001a }
            boolean r1 = r2.valid()     // Catch:{ ErrnoException | NullPointerException -> 0x002a, all -> 0x001a }
            goto L_0x002c
        L_0x001a:
            r1 = move-exception
            if (r2 == 0) goto L_0x0026
            boolean r0 = r2.valid()
            if (r0 == 0) goto L_0x0026
            android.system.Os.close(r2)     // Catch:{ ErrnoException -> 0x0026 }
        L_0x0026:
            android.os.StrictMode.setThreadPolicy(r3)
            throw r1
        L_0x002a:
            if (r2 == 0) goto L_0x0035
        L_0x002c:
            boolean r0 = r2.valid()
            if (r0 == 0) goto L_0x0035
            android.system.Os.close(r2)     // Catch:{ ErrnoException -> 0x0035 }
        L_0x0035:
            android.os.StrictMode.setThreadPolicy(r3)
            if (r1 == 0) goto L_0x01c2
            r15 = 0
            android.os.StrictMode$ThreadPolicy r5 = android.os.StrictMode.allowThreadDiskReads()
            r27 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0075 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0075 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0075 }
            r2.<init>()     // Catch:{ IOException -> 0x0075 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r0]     // Catch:{ IOException -> 0x0075 }
            r14 = 0
        L_0x0050:
            int r14 = r3.read(r1)     // Catch:{ IOException -> 0x0073 }
            r0 = -1
            if (r14 != r0) goto L_0x0060
            byte[] r15 = r2.toByteArray()     // Catch:{ IOException -> 0x0073 }
            int r14 = r15.length     // Catch:{ IOException -> 0x0073 }
            r3.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x0066
        L_0x0060:
            r0 = r27
            r2.write(r1, r0, r14)     // Catch:{ IOException -> 0x0073 }
            goto L_0x0050
        L_0x0066:
            if (r14 <= 0) goto L_0x007e
            r1 = 0
        L_0x0069:
            byte r0 = r15[r1]     // Catch:{ IOException -> 0x0073 }
            if (r0 != 0) goto L_0x006e
            goto L_0x007d
        L_0x006e:
            int r1 = r1 + 1
            if (r1 >= r14) goto L_0x007e
            goto L_0x0069
        L_0x0073:
            r1 = move-exception
            goto L_0x0077
        L_0x0075:
            r1 = move-exception
            r14 = 0
        L_0x0077:
            java.lang.String r0 = "MemProcWatermarkReader"
            android.util.Log.e(r0, r4, r1)     // Catch:{ all -> 0x01bd }
            goto L_0x007e
        L_0x007d:
            r14 = r1
        L_0x007e:
            android.os.StrictMode.setThreadPolicy(r5)
            r26 = 1
            r5 = 0
            r3 = 0
            r13 = 1
            r12 = 0
            if (r15 == 0) goto L_0x01af
        L_0x008b:
            if (r13 >= r14) goto L_0x01af
            r2 = r12
        L_0x008e:
            if (r2 >= r14) goto L_0x009d
            byte r1 = r15[r2]
            r0 = 10
            if (r1 == r0) goto L_0x009d
            byte r0 = r15[r2]
            if (r0 == 0) goto L_0x009d
            int r2 = r2 + 1
            goto L_0x008e
        L_0x009d:
            int r13 = r2 + 1
            int[] r25 = A03
            r0 = r25
            int r11 = r0.length
            java.lang.String[] r0 = new java.lang.String[r11]
            r24 = r0
            long[] r0 = new long[r11]
            r23 = r0
            int r0 = r15.length
            r28 = r0
            r0 = r27
            int r0 = java.lang.Math.max(r11, r0)
            int r22 = java.lang.Math.max(r11, r0)
            r21 = r12
            r20 = 0
            r10 = 0
        L_0x00be:
            r0 = r20
            if (r0 >= r11) goto L_0x0185
            r9 = r25[r20]
            r0 = r9 & 512(0x200, float:7.175E-43)
            r16 = 34
            if (r0 != 0) goto L_0x016b
            r0 = r9 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00d6
            byte r1 = r15[r12]
            r0 = r16
            if (r1 == r0) goto L_0x016b
            r9 = r9 & -1025(0xfffffffffffffbff, float:NaN)
        L_0x00d6:
            r0 = r9 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            r17 = r0
            r0 = r21
            if (r0 >= r13) goto L_0x0185
            r2 = -1
            r0 = r9 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x00f1
            r2 = r21
        L_0x00e6:
            if (r2 >= r13) goto L_0x0102
            byte r0 = r15[r2]
            r1 = 41
            if (r0 == r1) goto L_0x0102
            int r2 = r2 + 1
            goto L_0x00e6
        L_0x00f1:
            r0 = r9 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0105
            r2 = r21
        L_0x00f7:
            byte r1 = r15[r2]
            r0 = r16
            if (r1 == r0) goto L_0x0102
            if (r2 >= r13) goto L_0x0102
            int r2 = r2 + 1
            goto L_0x00f7
        L_0x0102:
            int r12 = r2 + 1
            goto L_0x0107
        L_0x0105:
            r12 = r21
        L_0x0107:
            if (r12 >= r13) goto L_0x0113
            byte r0 = r15[r12]
            r1 = r0
            r0 = r17
            if (r1 == r0) goto L_0x0113
            int r12 = r12 + 1
            goto L_0x0107
        L_0x0113:
            if (r2 >= 0) goto L_0x0116
            r2 = r12
        L_0x0116:
            if (r12 >= r13) goto L_0x012a
            int r12 = r12 + 1
            r0 = r9 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x012a
        L_0x011e:
            if (r12 >= r13) goto L_0x012a
            byte r0 = r15[r12]
            r1 = r0
            r0 = r17
            if (r1 != r0) goto L_0x012a
            int r12 = r12 + 1
            goto L_0x011e
        L_0x012a:
            r0 = r9 & 28672(0x7000, float:4.0178E-41)
            if (r0 == 0) goto L_0x01a9
            r0 = r28
            if (r2 >= r0) goto L_0x0166
            r19 = 1
            byte r18 = r15[r2]
            r15[r2] = r27
        L_0x0138:
            r0 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0149
            if (r10 >= r11) goto L_0x0149
            r0 = r9 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x015f
            byte r0 = r15[r21]
            long r0 = (long) r0
            r16 = r0
        L_0x0147:
            r23[r10] = r16
        L_0x0149:
            r0 = r9 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x017b
            if (r10 >= r11) goto L_0x017b
            r1 = r21
        L_0x0151:
            r0 = r28
            if (r1 >= r0) goto L_0x016f
            byte r0 = r15[r1]
            r9 = r0
            r0 = r27
            if (r9 == r0) goto L_0x0170
            int r1 = r1 + 1
            goto L_0x0151
        L_0x015f:
            r0 = r21
            long r16 = X.AnonymousClass0KZ.A00(r15, r0)
            goto L_0x0147
        L_0x0166:
            r19 = 0
            r18 = 0
            goto L_0x0138
        L_0x016b:
            int r21 = r12 + 1
            goto L_0x00d6
        L_0x016f:
            r1 = r0
        L_0x0170:
            int r1 = r1 - r21
            java.lang.String r9 = new java.lang.String
            r0 = r21
            r9.<init>(r15, r0, r1)
            r24[r10] = r9
        L_0x017b:
            if (r19 == 0) goto L_0x017f
            r15[r2] = r18
        L_0x017f:
            int r10 = r10 + 1
            r0 = r22
            if (r10 < r0) goto L_0x01a9
        L_0x0185:
            r1 = r24[r27]
            r9 = r23[r26]
            java.lang.String r0 = "min"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0195
            long r7 = r7 + r9
        L_0x0192:
            r12 = r13
            goto L_0x008b
        L_0x0195:
            java.lang.String r0 = "low"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x019f
            long r5 = r5 + r9
            goto L_0x0192
        L_0x019f:
            java.lang.String r0 = "high"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0192
            long r3 = r3 + r9
            goto L_0x0192
        L_0x01a9:
            int r20 = r20 + 1
            r21 = r12
            goto L_0x00be
        L_0x01af:
            r1 = 4096(0x1000, double:2.0237E-320)
            long r7 = r7 * r1
            r0 = r29
            r0.A02 = r7
            long r5 = r5 * r1
            r0.A01 = r5
            long r3 = r3 * r1
            r0.A00 = r3
            return
        L_0x01bd:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r5)
            throw r0
        L_0x01c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C020709q.<init>():void");
    }
}
