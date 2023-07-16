package X;

/* renamed from: X.2CD  reason: invalid class name */
public final class AnonymousClass2CD {
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r7 == 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r0 == null) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Intent r5, X.C83984sK r6, int r7) {
        /*
            X.3XS r0 = X.AnonymousClass3XS.A01()
            com.facebook.login.LoginClient$Request r4 = r0.A00
            if (r4 == 0) goto L_0x004e
            if (r5 == 0) goto L_0x004c
            java.lang.String r0 = "com.facebook.LoginFragment:Result"
            android.os.Parcelable r2 = r5.getParcelableExtra(r0)
            com.facebook.login.LoginClient$Result r2 = (com.facebook.login.LoginClient$Result) r2
            if (r2 == 0) goto L_0x0056
            r0 = -1
            if (r7 != r0) goto L_0x004c
            java.lang.Integer r1 = r2.A04
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r1 != r0) goto L_0x0052
            com.facebook.AccessToken r3 = r2.A02
            if (r3 == 0) goto L_0x0056
            java.util.Set r1 = r4.A06
            java.util.Set r0 = r3.A07
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r0)
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0031
            r2.retainAll(r1)
        L_0x0031:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r0.removeAll(r2)
            X.39Q r1 = new X.39Q
            r1.<init>(r3, r2, r0)
            java.util.Set r0 = r1.A01
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x004e
            r6.onSuccess(r1)
            return
        L_0x004c:
            if (r7 != 0) goto L_0x0056
        L_0x004e:
            r6.onCancel()
            return
        L_0x0052:
            java.lang.String r0 = r2.A01
            if (r0 != 0) goto L_0x0058
        L_0x0056:
            java.lang.String r0 = "Unexpected call to LoginManager.onActivityResult"
        L_0x0058:
            r6.onError(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2CD.A00(android.content.Intent, X.4sK, int):void");
    }
}
