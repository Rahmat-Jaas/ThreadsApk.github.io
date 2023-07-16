package X;

/* renamed from: X.2LM  reason: invalid class name */
public final class AnonymousClass2LM {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r0 != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File A00(android.content.Context r3, java.lang.String r4, boolean r5) {
        /*
            X.AnonymousClass0wJ.A1N(r3, r4)
            r2 = 0
            if (r5 == 0) goto L_0x001a
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001a
            java.io.File r0 = r3.getExternalCacheDir()     // Catch:{ NullPointerException -> 0x0017 }
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 != 0) goto L_0x0021
        L_0x001a:
            java.io.File r0 = r3.getCacheDir()
            if (r0 != 0) goto L_0x0021
            return r2
        L_0x0021:
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2LM.A00(android.content.Context, java.lang.String, boolean):java.io.File");
    }
}
