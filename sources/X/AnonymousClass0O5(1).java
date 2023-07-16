package X;

/* renamed from: X.0O5  reason: invalid class name */
public final class AnonymousClass0O5 {
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0072 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A00(android.content.Context r12, java.lang.String r13) {
        /*
            java.lang.String r1 = "minidumps"
            r0 = 0
            java.io.File r2 = r12.getDir(r1, r0)
            r1 = 3
            com.facebook.redex.IDxFFilterShape148S0000000_I2 r0 = new com.facebook.redex.IDxFFilterShape148S0000000_I2
            r0.<init>(r1)
            java.io.File[] r7 = r2.listFiles(r0)
            r12 = 0
            if (r7 == 0) goto L_0x003b
            r0 = 45
            int r0 = r13.indexOf(r0)
            int r0 = r0 + 1
            java.lang.String r6 = r13.substring(r0)
            int r5 = r7.length
            r4 = 0
        L_0x0022:
            if (r4 >= r5) goto L_0x003b
            r8 = r7[r4]
            java.lang.String r11 = r8.getName()
            long r9 = r8.length()
            r1 = 0
            java.lang.String r3 = "lacrima"
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "The minidump file is empty during matching!"
            X.AnonymousClass0LU.A0C(r3, r0)
        L_0x003b:
            return r12
        L_0x003c:
            boolean r0 = r11.contains(r6)
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "_"
            boolean r0 = r11.startsWith(r0)
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0073 }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x0073 }
            X.09U r1 = new X.09U     // Catch:{ all -> 0x006e }
            r1.<init>(r2)     // Catch:{ all -> 0x006e }
            X.0ON r0 = X.AnonymousClass0MU.A4A     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r1.A01(r0)     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x006a
            boolean r0 = r13.contains(r0)     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x006a
            r2.close()     // Catch:{ all -> 0x0073 }
            goto L_0x008b
        L_0x006a:
            r2.close()     // Catch:{ all -> 0x0073 }
            goto L_0x0088
        L_0x006e:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0072 }
        L_0x0072:
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r2 = move-exception
            X.C04790Pd.A00()
            long r0 = r8.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r2}
            java.lang.String r0 = "Could not read minidump, file size: %d."
            X.AnonymousClass0LU.A0N(r3, r0, r1)
        L_0x0088:
            int r4 = r4 + 1
            goto L_0x0022
        L_0x008b:
            return r8
        L_0x008c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0O5.A00(android.content.Context, java.lang.String):java.io.File");
    }
}
