package X;

import java.nio.ByteBuffer;

/* renamed from: X.3V0  reason: invalid class name */
public abstract class AnonymousClass3V0 {
    public static final byte[] A00 = {60, -15};

    public abstract ByteBuffer getJavaByteBuffer();

    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00d8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00dd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.nio.ByteBuffer A00(java.lang.String r19) {
        /*
            r18 = this;
            java.io.File r1 = new java.io.File
            r4 = r19
            r1.<init>(r4)
            r11 = 0
            r7 = 0
            r6 = 1
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00de }
            r3.<init>(r1)     // Catch:{ IOException -> 0x00de }
            java.nio.channels.FileChannel r12 = r3.getChannel()     // Catch:{ all -> 0x00d9 }
            java.nio.channels.FileChannel$MapMode r13 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x00d2 }
            r14 = 0
            long r16 = r12.size()     // Catch:{ all -> 0x00d2 }
            java.nio.MappedByteBuffer r5 = r12.map(r13, r14, r16)     // Catch:{ all -> 0x00d2 }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x00d2 }
            r5.order(r0)     // Catch:{ all -> 0x00d2 }
            long r0 = r1.length()     // Catch:{ all -> 0x00d2 }
            int r2 = (int) r0     // Catch:{ all -> 0x00d2 }
            r0 = 8
            if (r2 >= r0) goto L_0x0042
            java.lang.String r10 = "file size too small"
        L_0x002f:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x00cb
            java.lang.String r2 = "MobileConfigMmapHandle"
            java.lang.String r1 = "Cannot validate \"%s\", err:%s"
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r10}     // Catch:{ all -> 0x00d2 }
            X.AnonymousClass0LU.A0O(r2, r1, r0)     // Catch:{ all -> 0x00d2 }
            goto L_0x00c4
        L_0x0042:
            byte r1 = r5.get()     // Catch:{ all -> 0x00d2 }
            byte[] r9 = A00     // Catch:{ all -> 0x00d2 }
            byte r0 = r9[r7]     // Catch:{ all -> 0x00d2 }
            java.lang.String r10 = ""
            if (r1 != r0) goto L_0x00bf
            byte r1 = r5.get()     // Catch:{ all -> 0x00d2 }
            byte r0 = r9[r6]     // Catch:{ all -> 0x00d2 }
            if (r1 != r0) goto L_0x00bf
            byte r0 = r5.get()     // Catch:{ all -> 0x00d2 }
            if (r0 <= 0) goto L_0x00ab
            if (r0 > r6) goto L_0x00ab
            byte r8 = r5.get()     // Catch:{ all -> 0x00d2 }
            if (r8 <= 0) goto L_0x00a0
            int r0 = r9.length     // Catch:{ all -> 0x00d2 }
            int r1 = r2 - r0
            if (r8 >= r1) goto L_0x00a0
            int r0 = r5.getInt()     // Catch:{ all -> 0x00d2 }
            if (r0 == r2) goto L_0x007a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d2 }
            java.lang.Object[] r1 = X.C18210wN.A1Y(r0, r2)     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "Bad fileSize:%d, actual fileSize:%d"
            goto L_0x00b9
        L_0x007a:
            r5.position(r1)     // Catch:{ all -> 0x00d2 }
            byte r1 = r5.get()     // Catch:{ all -> 0x00d2 }
            byte r2 = r5.get()     // Catch:{ all -> 0x00d2 }
            byte r0 = r9[r7]     // Catch:{ all -> 0x00d2 }
            if (r1 != r0) goto L_0x0091
            byte r0 = r9[r6]     // Catch:{ all -> 0x00d2 }
            if (r2 != r0) goto L_0x0091
            r5.position(r8)     // Catch:{ all -> 0x00d2 }
            goto L_0x002f
        L_0x0091:
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r2)     // Catch:{ all -> 0x00d2 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "Bad footer magicHex:%02X %02X"
            goto L_0x00b9
        L_0x00a0:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r8)     // Catch:{ all -> 0x00d2 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "Bad bodyOffset:%d"
            goto L_0x00b9
        L_0x00ab:
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x00d2 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r6)     // Catch:{ all -> 0x00d2 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "Bad file ver:%d, current:%d"
        L_0x00b9:
            java.lang.String r10 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x00d2 }
            goto L_0x002f
        L_0x00bf:
            r5.position(r7)     // Catch:{ all -> 0x00d2 }
            goto L_0x002f
        L_0x00c4:
            r12.close()     // Catch:{ all -> 0x00d9 }
            r3.close()     // Catch:{ IOException -> 0x00de }
            return r11
        L_0x00cb:
            r12.close()     // Catch:{ all -> 0x00d9 }
            r3.close()     // Catch:{ IOException -> 0x00de }
            return r5
        L_0x00d2:
            r0 = move-exception
            if (r12 == 0) goto L_0x00d8
            r12.close()     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            throw r0     // Catch:{ IOException -> 0x00de }
        L_0x00de:
            r3 = move-exception
            java.lang.String r2 = "MobileConfigMmapHandle"
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r0 = "Cannot open \"%s\""
            X.AnonymousClass0LU.A0L(r2, r0, r3, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3V0.A00(java.lang.String):java.nio.ByteBuffer");
    }
}
