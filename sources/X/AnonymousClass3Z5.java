package X;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Z5  reason: invalid class name */
public final class AnonymousClass3Z5 {
    public int A00;
    public LoginClient$Request A01;
    public C19150zN A02;
    public String A03;
    public C83314rB[] A04;
    public C10300i6 A05;
    public final Fragment A06;
    public final String A07;

    public static AccessToken A00(Bundle bundle, Integer num, String str, Collection collection) {
        ArrayList arrayList;
        Collection collection2 = collection;
        Date A002 = AccessToken.A00(bundle, new Date());
        String string = bundle.getString("access_token");
        String string2 = bundle.getString("granted_scopes");
        if (!C62843aw.A04(string2)) {
            collection2 = C18200wM.A0s(Arrays.asList(string2.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)));
        }
        String string3 = bundle.getString("denied_scopes");
        if (!C62843aw.A04(string3)) {
            arrayList = C18200wM.A0s(Arrays.asList(string3.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)));
        } else {
            arrayList = null;
        }
        if (C62843aw.A04(string)) {
            return null;
        }
        String string4 = bundle.getString("userid");
        if (string4 == null) {
            String string5 = bundle.getString("signed_request");
            string4 = null;
            if (string5 != null && !string5.isEmpty()) {
                try {
                    String[] split = string5.split("\\.");
                    if (split.length == 2) {
                        string4 = C18250wR.A0j(new String(Base64.decode(split[1], 0), "UTF-8")).getString("user_id");
                    }
                } catch (Exception e) {
                    e.toString();
                }
            }
        }
        return new AccessToken(num, string, str, string4, collection2, arrayList, A002, new Date());
    }

    public final void A03(LoginClient$Result loginClient$Result) {
        AccessToken accessToken;
        this.A01 = null;
        C19150zN r2 = this.A02;
        if (r2 != null) {
            Integer num = loginClient$Result.A04;
            if (num == AnonymousClass006.A00 && (accessToken = loginClient$Result.A02) != null) {
                LoginClient$Request loginClient$Request = r2.A00;
                if (loginClient$Request == null || loginClient$Request.A00 != AnonymousClass22w.PROMOTE_PRO2PRO) {
                    C62603aO.A01(r2.A01).A02(accessToken);
                } else {
                    String str = r2.A01;
                    C04220Ms.A0B(str, 0);
                    long currentTimeMillis = System.currentTimeMillis() + AnonymousClass30U.A00;
                    AccessToken accessToken2 = new AccessToken(accessToken.A00, accessToken.A02, accessToken.A01, accessToken.A03, accessToken.A07, accessToken.A06, new Date(currentTimeMillis), accessToken.A05);
                    try {
                        C28161tl A012 = AnonymousClass3WS.A01(C18180wK.A0V(C18180wK.A09("IgSessionManager.SESSION_TOKEN_KEY", str)));
                        C18180wK.A0v(C28161tl.A02(A012), I17.A00(295), C18190wL.A0n(AnonymousClass3J8.A01(accessToken2)));
                    } catch (JSONException unused) {
                    }
                }
            }
            int i = -1;
            if (num == AnonymousClass006.A01) {
                i = 0;
            }
            Bundle A062 = C18180wK.A06();
            A062.putParcelable("com.facebook.LoginFragment:Result", loginClient$Result);
            Intent A0B = C18230wP.A0B();
            A0B.putExtras(A062);
            r2.requireActivity().setResult(i, A0B);
            C18190wL.A1A(r2);
        }
    }

    public final void A02() {
        C83314rB r1;
        int i = this.A00 + 1;
        this.A00 = i;
        C83314rB[] r12 = this.A04;
        if (i >= r12.length || (r1 = r12[i]) == null) {
            A03(LoginClient$Result.A02(this.A01, "Login attempt failed.", (String) null, (String) null));
        } else {
            r1.D7o(this.A01);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(com.facebook.login.LoginClient$Result r7) {
        /*
            r6 = this;
            com.facebook.AccessToken r5 = r7.A02
            if (r5 == 0) goto L_0x004c
            java.lang.String r1 = r6.A03
            com.facebook.AccessToken r0 = X.C62603aO.A00(r1)
            if (r0 == 0) goto L_0x004c
            if (r5 == 0) goto L_0x0044
            com.facebook.AccessToken r0 = X.C62603aO.A00(r1)
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = r0.A03     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = r5.A03     // Catch:{ Exception -> 0x0032 }
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0032 }
            if (r0 == 0) goto L_0x0025
            com.facebook.login.LoginClient$Request r0 = r6.A01     // Catch:{ Exception -> 0x0032 }
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A00(r5, r0)     // Catch:{ Exception -> 0x0032 }
            goto L_0x002e
        L_0x0025:
            com.facebook.login.LoginClient$Request r2 = r6.A01     // Catch:{ Exception -> 0x0032 }
            java.lang.String r1 = "User logged in as different Facebook user."
            r0 = 0
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A02(r2, r1, r0, r0)     // Catch:{ Exception -> 0x0032 }
        L_0x002e:
            r6.A03(r0)     // Catch:{ Exception -> 0x0032 }
            goto L_0x004f
        L_0x0032:
            r0 = move-exception
            com.facebook.login.LoginClient$Request r3 = r6.A01
            java.lang.String r2 = r0.getMessage()
            java.lang.String r1 = "Caught exception"
            r0 = 0
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A02(r3, r1, r2, r0)
            r6.A03(r0)
            goto L_0x004f
        L_0x0044:
            java.lang.String r1 = "Can't validate without a token"
            X.4VW r0 = new X.4VW
            r0.<init>(r1)
            throw r0
        L_0x004c:
            r6.A03(r7)
        L_0x004f:
            r4 = 0
            if (r5 == 0) goto L_0x0065
            java.lang.Integer r1 = r5.A00
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 != r0) goto L_0x0066
            X.0i6 r3 = r6.A05
            com.facebook.login.LoginClient$Request r0 = r7.A03
            java.lang.String r2 = r0.A01
            boolean r1 = r0.A02
            java.lang.String r0 = "native_auth_verification_success"
        L_0x0062:
            X.C35772Ot.A00(r3, r0, r2, r4, r1)
        L_0x0065:
            return
        L_0x0066:
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            if (r1 != r0) goto L_0x0065
            X.0i6 r3 = r6.A05
            com.facebook.login.LoginClient$Request r0 = r7.A03
            java.lang.String r2 = r0.A01
            boolean r1 = r0.A02
            java.lang.String r0 = "web_auth_verification_success"
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Z5.A04(com.facebook.login.LoginClient$Result):void");
    }

    public AnonymousClass3Z5(Fragment fragment, LoginClient$Request loginClient$Request, String str, int i) {
        C83314rB[] r0;
        this.A06 = fragment;
        C10300i6 A0S = C18190wL.A0S(fragment.mArguments);
        this.A05 = A0S;
        this.A03 = loginClient$Request.A05;
        this.A02 = (C19150zN) fragment;
        this.A01 = loginClient$Request;
        this.A00 = i;
        this.A07 = str;
        if (C67253zE.A03(A0S, loginClient$Request.A00)) {
            r0 = new C83314rB[]{new C67573zm(this, A0S)};
        } else {
            r0 = new C83314rB[]{new C67563zl(this, A0S), new C67543zj(this, this.A07), new C67553zk(this, this.A03)};
        }
        this.A04 = r0;
    }

    public static String A01() {
        JSONObject A0y = C18230wP.A0y();
        try {
            A0y.put("init", System.currentTimeMillis());
        } catch (JSONException e) {
            e.toString();
        }
        return A0y.toString();
    }
}
