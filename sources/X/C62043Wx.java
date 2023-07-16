package X;

/* renamed from: X.3Wx  reason: invalid class name and case insensitive filesystem */
public final class C62043Wx {
    public static final C62043Wx A00 = new C62043Wx();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (X.C09650fs.A09(r2, r1) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.net.Uri r6, android.net.Uri r7, androidx.fragment.app.FragmentActivity r8, X.C11630kW r9, com.instagram.service.session.UserSession r10, boolean r11) {
        /*
            r3 = 278(0x116, float:3.9E-43)
            r4 = r8
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            java.lang.String r1 = "com.instagram.android"
            boolean r0 = X.C09650fs.A09(r2, r1)
            r5 = r10
            if (r0 != 0) goto L_0x001c
            r0 = 827(0x33b, float:1.159E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.C09650fs.A09(r2, r1)
            if (r0 == 0) goto L_0x0053
        L_0x001c:
            boolean r0 = X.C09650fs.A08(r8, r1, r3)
            if (r0 == 0) goto L_0x0053
            android.net.Uri$Builder r1 = X.C18220wO.A0D()
            java.lang.String r0 = "inter_app_redirect"
            android.net.Uri$Builder r2 = r1.authority(r0)
            java.lang.String r1 = r10.getUserId()
            java.lang.String r0 = "account_id"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            java.lang.String r1 = "profile_id"
            java.lang.String r0 = ""
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r1, r0)
            java.lang.String r1 = r6.toString()
            java.lang.String r0 = "destination_url"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r0, r1)
            java.lang.String r0 = r0.toString()
        L_0x004c:
            X.C04220Ms.A06(r0)
            X.C37412JrW.A01(r8, r0)
            return
        L_0x0053:
            if (r11 == 0) goto L_0x0064
            java.lang.String r8 = X.C18190wL.A0n(r7)
            X.9wF r6 = X.C171209wF.A0r
            java.lang.String r9 = X.C18230wP.A0n(r9)
            r7 = 0
            X.C37412JrW.A06(r4, r5, r6, r7, r8, r9)
            return
        L_0x0064:
            java.lang.String r0 = r7.toString()
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62043Wx.A00(android.net.Uri, android.net.Uri, androidx.fragment.app.FragmentActivity, X.0kW, com.instagram.service.session.UserSession, boolean):void");
    }
}
