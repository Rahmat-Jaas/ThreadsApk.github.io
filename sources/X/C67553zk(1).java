package X;

import android.content.Intent;

/* renamed from: X.3zk  reason: invalid class name and case insensitive filesystem */
public final class C67553zk implements C83314rB {
    public AnonymousClass3Z5 A00;
    public AnonymousClass3Z5 A01;
    public C10300i6 A02;
    public String A03;
    public String A04;
    public I1V A05;

    public final boolean Bja(Intent intent, int i, int i2) {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D7o(com.facebook.login.LoginClient$Request r11) {
        /*
            r10 = this;
            X.0i6 r3 = r10.A02
            java.lang.String r2 = r11.A01
            boolean r1 = r11.A02
            java.lang.String r0 = "web_auth_attempted"
            r6 = 0
            X.C35772Ot.A00(r3, r0, r2, r6, r1)
            android.os.Bundle r2 = X.C18180wK.A06()
            java.util.Set r1 = r11.A06
            int r0 = r1.size()
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = ","
            java.lang.String r1 = android.text.TextUtils.join(r0, r1)
            java.lang.String r0 = "scope"
            r2.putString(r0, r1)
        L_0x0023:
            X.22w r1 = r11.A00
            X.22w r0 = X.AnonymousClass22w.PROMOTE_PRO2PRO
            if (r1 != r0) goto L_0x0030
            java.lang.String r1 = "is_promote_auth"
            java.lang.String r0 = "true"
            r2.putString(r1, r0)
        L_0x0030:
            java.lang.String r1 = "default_audience"
            java.lang.String r0 = "friends"
            r2.putString(r1, r0)
            java.lang.String r3 = r10.A04
            com.facebook.AccessToken r0 = X.C62603aO.A00(r3)
            if (r0 == 0) goto L_0x0043
            java.lang.String r6 = r0.A02
            if (r6 != 0) goto L_0x0103
        L_0x0043:
            java.lang.String r0 = "fbsdk_logged_out_id"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0060
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            java.lang.String r4 = "com.facebook.login.WebViewAuthHandler.TOKEN_KEY"
            java.lang.String r1 = ""
            X.D2R r0 = X.D2R.A0v
            android.content.SharedPreferences r0 = X.AnonymousClass3Zs.A01(r0, r3)
            java.lang.String r6 = r0.getString(r4, r1)
            X.C04220Ms.A06(r6)
        L_0x0060:
            X.3Z5 r0 = r10.A01
            androidx.fragment.app.Fragment r5 = r0.A06
            androidx.fragment.app.FragmentActivity r4 = r5.getActivity()
            java.lang.String r1 = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"
            r0 = 0
            android.content.SharedPreferences r0 = r4.getSharedPreferences(r1, r0)
            if (r0 == 0) goto L_0x0074
            X.C18190wL.A11(r0)
        L_0x0074:
            if (r6 != 0) goto L_0x0103
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            java.lang.String r0 = "facebook.com"
            X.C62843aw.A03(r1, r0)
            r0 = 32
            java.lang.String r0 = X.I17.A00(r0)
            X.C62843aw.A03(r1, r0)
            java.lang.String r0 = "https://facebook.com"
            X.C62843aw.A03(r1, r0)
            java.lang.String r0 = "https://.facebook.com"
            X.C62843aw.A03(r1, r0)
        L_0x0092:
            X.3zi r6 = new X.3zi
            r6.<init>(r11, r10)
            java.lang.String r0 = X.AnonymousClass3Z5.A01()
            r10.A03 = r0
            X.3Z5 r0 = r10.A01
            androidx.fragment.app.Fragment r0 = r0.A06
            androidx.fragment.app.FragmentActivity r4 = r0.getActivity()
            java.lang.String r9 = r11.A03
            java.lang.String r5 = "oauth"
            if (r9 != 0) goto L_0x00ad
            java.lang.String r9 = X.C60943Re.A02
        L_0x00ad:
            java.lang.String r8 = r10.A03
            boolean r7 = r11.A07
            java.lang.String r1 = "redirect_uri"
            java.lang.String r0 = "fbconnect://success"
            r2.putString(r1, r0)
            java.lang.String r0 = "client_id"
            r2.putString(r0, r9)
            java.lang.String r0 = "e2e"
            r2.putString(r0, r8)
            java.lang.String r1 = "response_type"
            java.lang.String r0 = "token,signed_request"
            r2.putString(r1, r0)
            java.lang.String r1 = "return_scopes"
            java.lang.String r0 = "true"
            r2.putString(r1, r0)
            if (r7 == 0) goto L_0x00d9
            java.lang.String r1 = "auth_type"
            java.lang.String r0 = "rerequest"
            r2.putString(r1, r0)
        L_0x00d9:
            X.I1V r0 = new X.I1V
            r0.<init>(r4, r2, r6, r5)
            r10.A05 = r0
            X.0zM r2 = new X.0zM
            r2.<init>()
            r0 = 1
            r2.setRetainInstance(r0)
            X.I1V r0 = r10.A05
            r2.A00 = r0
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "arg_session_id"
            r1.putString(r0, r3)
            r2.setArguments(r1)
            X.0m7 r1 = r4.getSupportFragmentManager()
            java.lang.String r0 = "FacebookDialogFragment"
            r2.A0A(r1, r0)
            return
        L_0x0103:
            java.lang.String r0 = "access_token"
            r2.putString(r0, r6)
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67553zk.D7o(com.facebook.login.LoginClient$Request):void");
    }

    public C67553zk(AnonymousClass3Z5 r2, String str) {
        this.A01 = r2;
        this.A04 = str;
        this.A00 = r2;
        this.A02 = C18190wL.A0S(r2.A06.mArguments);
    }
}
