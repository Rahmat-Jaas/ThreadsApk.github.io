package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import com.facebook.login.LoginClient$Request;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.3zj  reason: invalid class name and case insensitive filesystem */
public final class C67543zj implements C83314rB {
    public String A00 = null;
    public String A01 = "";
    public final AnonymousClass3Z5 A02;
    public final AnonymousClass3Z5 A03;
    public final C10300i6 A04;
    public final String A05;

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Bja(android.content.Intent r12, int r13, int r14) {
        /*
            r11 = this;
            r7 = 0
            if (r12 == 0) goto L_0x0011
            java.lang.String r0 = "CustomTabMainActivity.no_activity_exception"
            boolean r0 = r12.getBooleanExtra(r0, r7)
            if (r0 == 0) goto L_0x0011
            X.3Z5 r0 = r11.A02
            r0.A02()
        L_0x0010:
            return r7
        L_0x0011:
            r5 = 1
            if (r13 != r5) goto L_0x0010
            X.3Z5 r2 = r11.A03
            com.facebook.login.LoginClient$Request r6 = r2.A01
            r4 = -1
            if (r14 != r4) goto L_0x0137
            if (r12 != 0) goto L_0x0049
            r1 = 0
        L_0x001e:
            r10 = 0
            if (r1 == 0) goto L_0x0117
            java.lang.String r0 = "fbconnect://cct."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = r11.A01
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0117
        L_0x0031:
            android.net.Uri r1 = X.C15430rJ.A01(r1)
            java.lang.String r0 = r1.getQuery()
            android.os.Bundle r3 = X.C62843aw.A01(r0)
            java.lang.String r0 = r1.getFragment()
            android.os.Bundle r0 = X.C62843aw.A01(r0)
            r3.putAll(r0)
            goto L_0x0050
        L_0x0049:
            java.lang.String r0 = "CustomTabMainActivity.extra_url"
            java.lang.String r1 = r12.getStringExtra(r0)
            goto L_0x001e
        L_0x0050:
            java.lang.String r0 = "state"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ JSONException -> 0x0129 }
            if (r0 == 0) goto L_0x0129
            org.json.JSONObject r1 = X.C18250wR.A0j(r0)     // Catch:{ JSONException -> 0x0129 }
            java.lang.String r0 = "7_challenge"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ JSONException -> 0x0129 }
            java.lang.String r0 = r11.A05     // Catch:{ JSONException -> 0x0129 }
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0129 }
            if (r0 == 0) goto L_0x0129
            java.lang.String r1 = "error"
            java.lang.String r9 = r3.getString(r1)
            if (r9 != 0) goto L_0x0078
            java.lang.String r0 = "error_type"
            java.lang.String r9 = r3.getString(r0)
        L_0x0078:
            java.lang.String r0 = "error_msg"
            java.lang.String r8 = r3.getString(r0)
            if (r8 != 0) goto L_0x008e
            java.lang.String r0 = "error_message"
            java.lang.String r8 = r3.getString(r0)
            if (r8 != 0) goto L_0x008e
            java.lang.String r0 = "error_description"
            java.lang.String r8 = r3.getString(r0)
        L_0x008e:
            java.lang.String r0 = "error_code"
            java.lang.String r7 = r3.getString(r0)
            boolean r0 = X.C62843aw.A04(r7)
            if (r0 != 0) goto L_0x009f
            int r2 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x009f }
            goto L_0x00a0
        L_0x009f:
            r2 = -1
        L_0x00a0:
            boolean r0 = X.C62843aw.A04(r9)
            if (r0 == 0) goto L_0x00ca
            boolean r0 = X.C62843aw.A04(r8)
            if (r0 == 0) goto L_0x00ca
            if (r2 != r4) goto L_0x00ca
            java.util.Set r2 = r6.A06
            java.lang.Integer r1 = X.AnonymousClass006.A0Y
            java.lang.String r0 = r6.A03
            com.facebook.AccessToken r4 = X.AnonymousClass3Z5.A00(r3, r1, r0, r2)
            X.0i6 r3 = r11.A04
            if (r3 == 0) goto L_0x00c5
            java.lang.String r2 = r6.A01
            boolean r1 = r6.A02
            java.lang.String r0 = "web_auth_success"
            X.C35772Ot.A00(r3, r0, r2, r10, r1)
        L_0x00c5:
            com.facebook.login.LoginClient$Result r1 = com.facebook.login.LoginClient$Result.A00(r4, r6)
            goto L_0x0131
        L_0x00ca:
            java.lang.String r4 = "User canceled log in."
            if (r9 == 0) goto L_0x00f0
            java.lang.String r0 = "access_denied"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00de
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00f0
        L_0x00de:
            X.0i6 r3 = r11.A04
            if (r3 == 0) goto L_0x00eb
            java.lang.String r2 = r6.A01
            boolean r1 = r6.A02
            java.lang.String r0 = "web_auth_cancel"
            X.C35772Ot.A00(r3, r0, r2, r10, r1)
        L_0x00eb:
            com.facebook.login.LoginClient$Result r1 = com.facebook.login.LoginClient$Result.A01(r6, r4)
            goto L_0x0131
        L_0x00f0:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r2 == r0) goto L_0x00de
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()
            r4.put(r1, r9)
            java.lang.String r0 = "errorCodeString"
            r4.put(r0, r7)
            java.lang.String r0 = "errorMessage"
            r4.put(r0, r8)
            X.0i6 r3 = r11.A04
            if (r3 == 0) goto L_0x0112
            java.lang.String r2 = r6.A01
            boolean r1 = r6.A02
            java.lang.String r0 = "web_auth_error"
            X.C35772Ot.A00(r3, r0, r2, r4, r1)
        L_0x0112:
            com.facebook.login.LoginClient$Result r1 = com.facebook.login.LoginClient$Result.A02(r6, r9, r7, r8)
            goto L_0x0131
        L_0x0117:
            X.0i6 r3 = r11.A04
            if (r3 == 0) goto L_0x0124
            java.lang.String r2 = r6.A01
            boolean r1 = r6.A02
            java.lang.String r0 = "web_auth_error"
            X.C35772Ot.A00(r3, r0, r2, r10, r1)
        L_0x0124:
            com.facebook.login.LoginClient$Result r1 = com.facebook.login.LoginClient$Result.A02(r6, r10, r10, r10)
            goto L_0x0131
        L_0x0129:
            com.facebook.login.LoginClient$Request r1 = r2.A01
            java.lang.String r0 = "Invalid state parameter"
            com.facebook.login.LoginClient$Result r1 = com.facebook.login.LoginClient$Result.A02(r1, r10, r0, r10)
        L_0x0131:
            X.3Z5 r0 = r11.A02
            r0.A04(r1)
            return r5
        L_0x0137:
            X.0i6 r5 = r11.A04
            if (r5 == 0) goto L_0x0145
            r4 = 0
            java.lang.String r3 = r6.A01
            boolean r1 = r6.A02
            java.lang.String r0 = "web_auth_cancel"
            X.C35772Ot.A00(r5, r0, r3, r4, r1)
        L_0x0145:
            com.facebook.login.LoginClient$Request r1 = r2.A01
            java.lang.String r0 = "User canceled log in."
            com.facebook.login.LoginClient$Result r1 = com.facebook.login.LoginClient$Result.A01(r1, r0)
            X.3Z5 r0 = r11.A02
            r0.A04(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67543zj.Bja(android.content.Intent, int, int):boolean");
    }

    public final void D7o(LoginClient$Request loginClient$Request) {
        List<ResolveInfo> queryIntentServices;
        String str = this.A01;
        if (str.isEmpty()) {
            this.A02.A02();
            return;
        }
        C10300i6 r5 = this.A04;
        if (r5 != null) {
            C35772Ot.A00(r5, "web_auth_attempted", loginClient$Request.A01, (HashMap) null, loginClient$Request.A02);
        }
        Bundle A06 = C18180wK.A06();
        Set set = loginClient$Request.A06;
        if (set.size() != 0) {
            A06.putString("scope", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, set));
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("0_auth_logger_id", loginClient$Request.A04);
        A0y.put("3_method", "custom_tab");
        A0y.put("7_challenge", this.A05);
        A06.putString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, new JSONObject(A0y).toString());
        A06.putString("cbt", String.valueOf(System.currentTimeMillis()));
        A06.putString("redirect_uri", str);
        A06.putString("app_id", loginClient$Request.A03);
        A06.putString("e2e", AnonymousClass3Z5.A01());
        A06.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        A06.putString("return_scopes", "true");
        A06.putString("sso", "chrome_custom_tab");
        if (loginClient$Request.A00 == AnonymousClass22w.PROMOTE_PRO2PRO) {
            A06.putString("is_promote_auth", "true");
        }
        C62843aw.A00(A06, String.format("m.%s", new Object[]{"facebook.com"}), AnonymousClass00U.A0d("v2.3", "/", "dialog/", "oauth"));
        Fragment fragment = this.A03.A06;
        Intent A042 = C18250wR.A04(fragment.getActivity(), CustomTabMainActivity.class);
        A042.putExtra("CustomTabMainActivity.extra_action", "oauth");
        A042.putExtra("CustomTabMainActivity.extra_params", A06);
        String str2 = this.A00;
        if (C62843aw.A04(str2)) {
            Context context = C60943Re.A00;
            Intent A052 = C18250wR.A05("android.support.customtabs.action.CustomTabsService");
            PackageManager packageManager = context.getPackageManager();
            str2 = null;
            if (packageManager != null && (queryIntentServices = packageManager.queryIntentServices(A052, 0)) != null) {
                HashSet hashSet = new HashSet(Arrays.asList(AnonymousClass307.A00));
                Iterator<ResolveInfo> it = queryIntentServices.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ServiceInfo serviceInfo = it.next().serviceInfo;
                        if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                            str2 = serviceInfo.packageName;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            this.A00 = str2;
        }
        A042.putExtra("CustomTabMainActivity.extra_chromePackage", str2);
        C18230wP.A0O().A0B(A042, fragment, 1);
    }

    public C67543zj(AnonymousClass3Z5 r4, String str) {
        C10300i6 r0 = null;
        this.A03 = r4;
        this.A02 = r4;
        this.A01 = AnonymousClass00U.A0L("fbconnect://cct.", C60943Re.A00.getPackageName());
        this.A05 = str;
        Bundle bundle = r4.A06.mArguments;
        this.A04 = bundle != null ? C18190wL.A0S(bundle) : r0;
    }
}
