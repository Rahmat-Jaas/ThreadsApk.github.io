package X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.login.LoginClient$Request;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3zl  reason: invalid class name and case insensitive filesystem */
public final class C67563zl implements C83314rB {
    public AnonymousClass3Z5 A00;
    public AnonymousClass3Z5 A01;
    public C10300i6 A02;

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Bja(android.content.Intent r9, int r10, int r11) {
        /*
            r8 = this;
            X.3Z5 r0 = r8.A01
            com.facebook.login.LoginClient$Request r4 = r0.A01
            java.lang.String r1 = "native_auth_cancel"
            r3 = 0
            if (r9 != 0) goto L_0x001d
            X.0i6 r0 = r8.A02
            A01(r4, r0, r3, r1)
            java.lang.String r0 = "Operation canceled"
        L_0x0010:
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A01(r4, r0)
        L_0x0014:
            if (r0 == 0) goto L_0x00ac
            X.3Z5 r1 = r8.A00
            r1.A04(r0)
        L_0x001b:
            r0 = 1
            return r0
        L_0x001d:
            if (r11 != 0) goto L_0x002b
            X.0i6 r0 = r8.A02
            A01(r4, r0, r3, r1)
            java.lang.String r0 = "error"
            java.lang.String r0 = r9.getStringExtra(r0)
            goto L_0x0010
        L_0x002b:
            r0 = -1
            if (r11 == r0) goto L_0x0044
            java.lang.String r7 = "Unexpected resultCode from authorization."
            X.0i6 r6 = r8.A02
            java.util.HashMap r5 = A00(r7)
            java.lang.String r2 = r4.A01
            boolean r1 = r4.A02
            java.lang.String r0 = "native_auth_error"
            X.C35772Ot.A00(r6, r0, r2, r5, r1)
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A02(r4, r7, r3, r3)
            goto L_0x0014
        L_0x0044:
            android.os.Bundle r6 = r9.getExtras()
            java.lang.String r0 = "error"
            java.lang.String r5 = r6.getString(r0)
            if (r5 != 0) goto L_0x0056
            java.lang.String r0 = "error_type"
            java.lang.String r5 = r6.getString(r0)
        L_0x0056:
            java.lang.String r0 = "error_code"
            java.lang.String r2 = r6.getString(r0)
            java.lang.String r0 = "error_message"
            java.lang.String r1 = r6.getString(r0)
            if (r1 != 0) goto L_0x006a
            java.lang.String r0 = "error_description"
            java.lang.String r1 = r6.getString(r0)
        L_0x006a:
            if (r5 != 0) goto L_0x0090
            if (r2 != 0) goto L_0x0090
            if (r1 != 0) goto L_0x0090
            X.0i6 r1 = r8.A02     // Catch:{ 4VW -> 0x0086 }
            java.lang.String r0 = "native_auth_success"
            A01(r4, r1, r3, r0)     // Catch:{ 4VW -> 0x0086 }
            java.util.Set r2 = r4.A06     // Catch:{ 4VW -> 0x0086 }
            java.lang.Integer r1 = X.AnonymousClass006.A01     // Catch:{ 4VW -> 0x0086 }
            java.lang.String r0 = r4.A03     // Catch:{ 4VW -> 0x0086 }
            com.facebook.AccessToken r0 = X.AnonymousClass3Z5.A00(r6, r1, r0, r2)     // Catch:{ 4VW -> 0x0086 }
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A00(r0, r4)     // Catch:{ 4VW -> 0x0086 }
            goto L_0x0014
        L_0x0086:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A02(r4, r3, r0, r3)
            goto L_0x0014
        L_0x0090:
            java.util.Collection r0 = X.AnonymousClass3RT.A00
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x00ac
            java.util.Collection r0 = X.AnonymousClass3RT.A01
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x00a6
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A01(r4, r3)
            goto L_0x0014
        L_0x00a6:
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A02(r4, r5, r1, r2)
            goto L_0x0014
        L_0x00ac:
            X.3Z5 r0 = r8.A00
            r0.A02()
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67563zl.Bja(android.content.Intent, int, int):boolean");
    }

    public final void D7o(LoginClient$Request loginClient$Request) {
        Intent intent;
        String str;
        String str2;
        C10300i6 r2 = this.A02;
        C35772Ot.A00(r2, "native_auth_attempted", loginClient$Request.A01, A00((String) null), loginClient$Request.A02);
        String A012 = AnonymousClass3Z5.A01();
        Fragment fragment = this.A01.A06;
        FragmentActivity activity = fragment.getActivity();
        String str3 = loginClient$Request.A03;
        Set set = loginClient$Request.A06;
        boolean z = loginClient$Request.A07;
        Iterator it = AnonymousClass3XO.A02.iterator();
        while (true) {
            if (!it.hasNext()) {
                intent = null;
                break;
            }
            C62023Wu r1 = (C62023Wu) it.next();
            Intent A0B = C18230wP.A0B();
            if (r1 instanceof C207816b) {
                str2 = "com.facebook.wakizashi";
            } else if (r1 instanceof C207716a) {
                str2 = "com.facebook.orca";
            } else {
                str2 = "com.facebook.katana";
            }
            intent = A0B.setClassName(str2, "com.facebook.katana.ProxyAuth").putExtra("client_id", str3);
            if (set.size() != 0) {
                intent.putExtra("scope", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, set));
            }
            if (!C62843aw.A04(A012)) {
                intent.putExtra("e2e", A012);
            }
            intent.putExtra("response_type", "token,signed_request");
            intent.putExtra("return_scopes", "true");
            intent.putExtra("default_audience", "friends");
            intent.putExtra("legacy_override", "v2.3");
            if (z) {
                intent.putExtra("auth_type", "rerequest");
            }
            ResolveInfo resolveActivity = activity.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity != null && C62023Wu.A00(activity, resolveActivity.activityInfo.packageName)) {
                intent.putExtra("is_cal", loginClient$Request.A02);
                intent.putExtra("location", loginClient$Request.A01);
                break;
            }
        }
        if (intent == null) {
            str = "Null native intent";
        } else {
            try {
                if (!C10650ih.A0D(intent, fragment, 64206)) {
                    str = "Native auth failed at launching";
                } else {
                    return;
                }
            } catch (ActivityNotFoundException e) {
                A01(loginClient$Request, r2, e.getMessage(), "native_auth_error");
                this.A00.A02();
                return;
            }
        }
        A01(loginClient$Request, r2, str, "native_auth_error");
        this.A00.A02();
    }

    public C67563zl(AnonymousClass3Z5 r1, C10300i6 r2) {
        this.A01 = r1;
        this.A00 = r1;
        this.A02 = r2;
    }

    public static HashMap A00(String str) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("fb4a_installed", String.valueOf(AnonymousClass0wJ.A1W(C63443hU.A00())));
        A0y.put("exception", str);
        return A0y;
    }

    public static void A01(LoginClient$Request loginClient$Request, C10300i6 r4, String str, String str2) {
        C35772Ot.A00(r4, str2, loginClient$Request.A01, A00(str), loginClient$Request.A02);
    }
}
