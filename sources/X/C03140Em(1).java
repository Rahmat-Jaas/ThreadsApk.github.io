package X;

/* renamed from: X.0Em  reason: invalid class name and case insensitive filesystem */
public final class C03140Em extends AnonymousClass0FJ {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r1 == null) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(android.content.Context r4, byte[] r5) {
        /*
            r3 = this;
            java.io.File r0 = r3.A00
            X.AnonymousClass0SJ.A00(r0)
            boolean r1 = r0.exists()
            r0 = 1
            if (r1 == 0) goto L_0x0047
            android.content.res.AssetManager r2 = r4.getAssets()
            java.lang.String r1 = r3.A02
            r0 = 2
            java.io.InputStream r1 = r2.open(r1, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            byte[] r2 = X.AnonymousClass0FK.A02(r1, r5, r0)     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x0023
            r1.close()
        L_0x0023:
            java.io.File r0 = r3.A00
            X.AnonymousClass0SJ.A00(r0)
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r0)
            int r0 = r2.length     // Catch:{ all -> 0x003e }
            int r0 = r0 + 1
            byte[] r0 = X.AnonymousClass0FK.A02(r1, r5, r0)     // Catch:{ all -> 0x003e }
            r1.close()
            boolean r0 = java.util.Arrays.equals(r2, r0)
            r0 = r0 ^ 1
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0043
        L_0x0040:
            r0 = move-exception
            if (r1 == 0) goto L_0x0046
        L_0x0043:
            r1.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03140Em.A02(android.content.Context, byte[]):boolean");
    }

    public C03140Em(String str, String str2) {
        super(str, str2);
    }
}
