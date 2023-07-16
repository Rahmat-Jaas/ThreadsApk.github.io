package X;

/* renamed from: X.6GZ  reason: invalid class name */
public final class AnonymousClass6GZ {
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b6 A[SYNTHETIC, Splitter:B:48:0x00b6] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[] A00(java.lang.String... r15) {
        /*
            int r10 = r15.length
            if (r10 != 0) goto L_0x0005
            r9 = 0
        L_0x0004:
            return r9
        L_0x0005:
            int[] r9 = new int[r10]
            r0 = 0
        L_0x0008:
            r8 = -1
            if (r0 >= r10) goto L_0x0010
            r9[r0] = r8
            int r0 = r0 + 1
            goto L_0x0008
        L_0x0010:
            java.lang.String r7 = "/proc/self/task/"
            java.io.File r0 = X.C86144wL.A0Z(r7)
            java.lang.String[] r6 = r0.list()
            X.C04220Ms.A06(r6)
            int r5 = r6.length
            r4 = 0
            r3 = 0
        L_0x0020:
            if (r4 >= r5) goto L_0x0004
            r2 = r6[r4]
            if (r10 <= r3) goto L_0x0004
            java.lang.String r0 = "/stat"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r7, r2, r0)     // Catch:{ IOException -> 0x00ba }
            java.io.File r0 = X.C86144wL.A0Z(r0)     // Catch:{ IOException -> 0x00ba }
            r1 = 0
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ all -> 0x00b3 }
            r11.<init>(r0)     // Catch:{ all -> 0x00b3 }
            java.nio.channels.FileChannel r0 = r11.getChannel()     // Catch:{ all -> 0x00b0 }
            long r0 = r0.size()     // Catch:{ all -> 0x00b0 }
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 > 0) goto L_0x009e
            r13 = 0
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 != 0) goto L_0x0050
            byte[] r1 = X.C116186wZ.A00(r11)     // Catch:{ all -> 0x00b0 }
            goto L_0x0055
        L_0x0050:
            int r12 = (int) r0     // Catch:{ all -> 0x00b0 }
            byte[] r1 = X.C116186wZ.A01(r11, r12)     // Catch:{ all -> 0x00b0 }
        L_0x0055:
            r11.close()     // Catch:{ IOException -> 0x00ba }
            X.C04220Ms.A06(r1)     // Catch:{ IOException -> 0x00ba }
            java.nio.charset.Charset r0 = X.AnonymousClass74V.A05     // Catch:{ IOException -> 0x00ba }
            java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x00ba }
            r11.<init>(r1, r0)     // Catch:{ IOException -> 0x00ba }
            java.lang.String r0 = " "
            X.7yC r1 = X.C18250wR.A0h(r0)     // Catch:{ IOException -> 0x00ba }
            r0 = 0
            java.util.List r1 = r1.A02(r11, r0)     // Catch:{ IOException -> 0x00ba }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ IOException -> 0x00ba }
            java.lang.Object[] r11 = r1.toArray(r0)     // Catch:{ IOException -> 0x00ba }
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch:{ IOException -> 0x00ba }
            int r1 = r11.length     // Catch:{ IOException -> 0x00ba }
            r0 = 2
            if (r1 < r0) goto L_0x007e
            r0 = 1
            r11 = r11[r0]     // Catch:{ IOException -> 0x00ba }
            if (r11 != 0) goto L_0x007f
        L_0x007e:
            r11 = 0
        L_0x007f:
            if (r11 == 0) goto L_0x00ba
            r1 = 0
        L_0x0082:
            if (r1 >= r10) goto L_0x00ba
            r0 = r9[r1]     // Catch:{ NumberFormatException -> 0x009b }
            if (r0 != r8) goto L_0x009b
            r0 = r15[r1]     // Catch:{ NumberFormatException -> 0x009b }
            boolean r0 = r11.equals(r0)     // Catch:{ NumberFormatException -> 0x009b }
            if (r0 == 0) goto L_0x009b
            X.C04220Ms.A03(r2)     // Catch:{ NumberFormatException -> 0x009b }
            int r0 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x009b }
            r9[r1] = r0     // Catch:{ NumberFormatException -> 0x009b }
            int r3 = r3 + 1
        L_0x009b:
            int r1 = r1 + 1
            goto L_0x0082
        L_0x009e:
            java.lang.String r12 = "file is too large to fit in a byte array: "
            r2 = 227(0xe3, float:3.18E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = X.AnonymousClass00U.A0T(r12, r2, r0)     // Catch:{ all -> 0x00b0 }
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x00b0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b0 }
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            r1 = r11
            goto L_0x00b4
        L_0x00b3:
            r0 = move-exception
        L_0x00b4:
            if (r1 == 0) goto L_0x00b9
            r1.close()     // Catch:{ IOException -> 0x00ba }
        L_0x00b9:
            throw r0     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            int r4 = r4 + 1
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6GZ.A00(java.lang.String[]):int[]");
    }
}
