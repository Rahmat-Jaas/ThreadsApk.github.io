package X;

import android.os.Bundle;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import java.util.HashMap;

/* renamed from: X.3zi  reason: invalid class name and case insensitive filesystem */
public final class C67533zi implements C81934oe {
    public final /* synthetic */ LoginClient$Request A00;
    public final /* synthetic */ C67553zk A01;

    public C67533zi(LoginClient$Request loginClient$Request, C67553zk r2) {
        this.A01 = r2;
        this.A00 = loginClient$Request;
    }

    public final void Br6(Bundle bundle, AnonymousClass32F r11) {
        LoginClient$Result loginClient$Result;
        C67553zk r6 = this.A01;
        LoginClient$Request loginClient$Request = this.A00;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                r6.A03 = bundle.getString("e2e");
            }
            try {
                C35772Ot.A00(r6.A02, "web_auth_success", loginClient$Request.A01, (HashMap) null, loginClient$Request.A02);
                AccessToken A002 = AnonymousClass3Z5.A00(bundle, AnonymousClass006.A0j, loginClient$Request.A03, loginClient$Request.A06);
                AnonymousClass3Z5 r2 = r6.A01;
                loginClient$Result = LoginClient$Result.A00(A002, r2.A01);
                CookieSyncManager.createInstance(r2.A06.getActivity()).sync();
                String str = r6.A04;
                if (!"fbsdk_logged_out_id".equals(str)) {
                    C18180wK.A0v(AnonymousClass3Zs.A02(str).edit(), "com.facebook.login.WebViewAuthHandler.TOKEN_KEY", A002.A02);
                }
            } catch (AnonymousClass4VW e) {
                HashMap A0y = AnonymousClass0wJ.A0y();
                A0y.put("exception", e.getMessage());
                C35772Ot.A00(r6.A02, "web_auth_error", loginClient$Request.A01, A0y, loginClient$Request.A02);
                loginClient$Result = LoginClient$Result.A02(r6.A01.A01, (String) null, e.getMessage(), (String) null);
            }
        } else if (r11.A00 == AnonymousClass006.A01) {
            C35772Ot.A00(r6.A02, "web_auth_cancel", loginClient$Request.A01, (HashMap) null, loginClient$Request.A02);
            loginClient$Result = LoginClient$Result.A01(r6.A01.A01, "User canceled log in.");
        } else {
            r6.A03 = null;
            loginClient$Result = LoginClient$Result.A02(r6.A01.A01, (String) null, (String) null, (String) null);
        }
        r6.A00.A04(loginClient$Result);
    }
}
