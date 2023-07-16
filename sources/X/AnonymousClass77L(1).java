package X;

/* renamed from: X.77L  reason: invalid class name */
public final class AnonymousClass77L {
    public static final AnonymousClass77L A00 = new AnonymousClass77L();
    public static volatile C121997Jj A01;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.C102596Vu.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C121997Jj A00(android.content.Context r5) {
        /*
            r4 = this;
            X.7Jj r0 = A01
            if (r0 != 0) goto L_0x007f
            monitor-enter(r4)
            X.7Jj r0 = A01     // Catch:{ all -> 0x007b }
            if (r0 != 0) goto L_0x007e
            r3 = 0
            android.content.res.AssetManager r1 = r5.getAssets()     // Catch:{ IOException -> 0x0067 }
            java.lang.String r0 = "json/bloks_screen_template.json"
            java.io.InputStream r2 = r1.open(r0)     // Catch:{ IOException -> 0x0067 }
            X.C04220Ms.A06(r2)     // Catch:{ IOException -> 0x0067 }
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ IOException -> 0x0067 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0067 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0067 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0067 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0067 }
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
        L_0x0028:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0032
            r1.append(r0)     // Catch:{ all -> 0x0060 }
            goto L_0x0028
        L_0x0032:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0060 }
            r2.close()     // Catch:{ IOException -> 0x0067 }
            if (r1 == 0) goto L_0x006d
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ all -> 0x007b }
            r0.<init>(r1)     // Catch:{ all -> 0x007b }
            android.util.JsonReader r1 = new android.util.JsonReader     // Catch:{ all -> 0x007b }
            r1.<init>(r0)     // Catch:{ all -> 0x007b }
            X.7qq r0 = new X.7qq     // Catch:{ all -> 0x007b }
            r0.<init>(r1)     // Catch:{ all -> 0x007b }
            r0.Bhu()     // Catch:{ all -> 0x007b }
            X.6eA r0 = X.AnonymousClass6Q9.A00(r0)     // Catch:{ all -> 0x007b }
            X.6e9 r0 = r0.A00     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0074
            X.6n3 r0 = r0.A00     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0074
            X.7Jj r0 = X.C121997Jj.A02(r3, r0)     // Catch:{ all -> 0x007b }
            A01 = r0     // Catch:{ all -> 0x007b }
            goto L_0x007e
        L_0x0060:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            X.C102596Vu.A00(r2, r1)     // Catch:{ IOException -> 0x0067 }
            throw r0     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            r1 = move-exception
            java.lang.String r0 = "IgBloksScreenTemplateProvider"
            X.C30967GcS.A03(r0, r1)     // Catch:{ all -> 0x007b }
        L_0x006d:
            java.lang.String r0 = "Expected a valid screen template. Please ensure that your app provides a default Bloks screen template."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x007b }
            goto L_0x007a
        L_0x0074:
            java.lang.String r0 = "Screen template must contain a valid BloksResponse"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ all -> 0x007b }
        L_0x007a:
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x007e:
            monitor-exit(r4)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass77L.A00(android.content.Context):X.7Jj");
    }
}
