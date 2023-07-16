package X;

import android.text.TextUtils;

/* renamed from: X.3YA  reason: invalid class name */
public final class AnonymousClass3YA {
    public final C10300i6 A00;
    public final String A01;
    public final String A02;

    public static void A00(AnonymousClass3YA r7, Throwable th) {
        r7.A02("client_reg_query_verifier_failed", "exception when getting enc verifier from feo2 client", "registration_flow", (String) null, th.getMessage(), TextUtils.join("\n", th.getStackTrace()), (String) null);
    }

    public static void A01(AnonymousClass3YA r8, Throwable th) {
        r8.A02("client_auth_response_not_found", "auto_conf_client_authenticate_failed", "optimistic_authentication_flow", (String) null, th.getMessage(), TextUtils.join("\n", th.getStackTrace()), "authenticate_exception_caught");
    }

    public final void A02(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C62323Yh.A00(this.A00, C18180wK.A0Y(), this.A01, str, str2, str3, str4, str5, str6, str7, this.A02);
    }

    public AnonymousClass3YA(C10300i6 r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }
}
