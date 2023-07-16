package X;

/* renamed from: X.83M  reason: invalid class name */
public final class AnonymousClass83M implements Runnable {
    public static final C113826sD A02 = new C113826sD("RevokeAccessOperation", new String[0]);
    public final C93335lO A00 = new C93335lO((AnonymousClass7AL) null);
    public final String A01;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.A07
            r3 = 0
            java.lang.String r1 = r6.A01     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            java.lang.String r0 = "https://accounts.google.com/o/oauth2/revoke?token="
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r1)     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            java.net.URLConnection r2 = r0.openConnection()     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            r0 = 99
            java.lang.String r1 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            r0 = 448(0x1c0, float:6.28E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            r2.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            int r4 = r2.getResponseCode()     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 != r0) goto L_0x0041
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.A09     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
        L_0x002f:
            X.6sD r2 = A02     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            r0 = 723(0x2d3, float:1.013E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            java.lang.String r1 = X.AnonymousClass00U.A0J(r0, r4)     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            r2.A00(r1, r0)     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            goto L_0x0088
        L_0x0041:
            X.6sD r0 = A02     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            java.lang.String r2 = "Unable to revoke access!"
            java.lang.String r1 = "RevokeAccessOperation"
            java.lang.String r0 = r0.A02     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            java.lang.String r0 = r0.concat(r2)     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            android.util.Log.e(r1, r0)     // Catch:{ IOException -> 0x0051, Exception -> 0x0061 }
            goto L_0x002f
        L_0x0051:
            r0 = move-exception
            X.6sD r4 = A02
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = "IOException when revoking access: "
            goto L_0x0070
        L_0x0061:
            r0 = move-exception
            X.6sD r4 = A02
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = "Exception when revoking access: "
        L_0x0070:
            java.lang.String r2 = r0.concat(r1)
            java.lang.String r1 = "RevokeAccessOperation"
            int r0 = r3.length
            if (r0 <= 0) goto L_0x007f
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
        L_0x007f:
            java.lang.String r0 = r4.A02
            java.lang.String r0 = r0.concat(r2)
            android.util.Log.e(r1, r0)
        L_0x0088:
            X.5lO r0 = r6.A00
            r0.A07(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass83M.run():void");
    }

    public AnonymousClass83M(String str) {
        C13320nQ.A03(str);
        this.A01 = str;
    }
}
