package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.269  reason: invalid class name */
public enum AnonymousClass269 {
    ChooseBusinessSignUp("choose_business_sign_up", "choose_business"),
    AccessDialogSwitchToSignUpNegativeButtonTapped("switch_to_signup_negative_tapped", "access_negative_tapped"),
    AccessDialogSwitchToSignUpPositiveButtonTapped("switch_to_signup_positive_tapped", "access_positive_tapped"),
    FacebookSsoSuccess("facebook_sso_success", "fb_sso_success"),
    RegisterAccountCreated("register_account_created", "reg_success"),
    LogIn("log_in", "log_in_success"),
    LogInSso("log_in_sso", "log_in_one_tap"),
    ContactsUpsellDeclined("contacts_upsell_declined", "ig_android_nux"),
    CpntactsImportOptIn("contacts_import_opt_in", "ig_android_nux");
    
    public final String A00;
    public final String A01;

    public static long A01() {
        return AnonymousClass1o2.A01("log_in").A02();
    }

    public static USLEBaseShape0S0000000 A02(AnonymousClass0A2 r5, String str, int i, long j) {
        USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = new USLEBaseShape0S0000000(r5, i);
        uSLEBaseShape0S0000000.A0T("waterfall_id", A04());
        uSLEBaseShape0S0000000.A0T("containermodule", "waterfall_log_in");
        uSLEBaseShape0S0000000.A0R("elapsed_time", Double.valueOf((double) (j - A01())));
        uSLEBaseShape0S0000000.A0R(TraceFieldType.StartTime, Double.valueOf((double) A01()));
        uSLEBaseShape0S0000000.A0T(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        return uSLEBaseShape0S0000000;
    }

    public static AnonymousClass269 A03(String str, String str2, int i) {
        return new AnonymousClass269(str, i, str2);
    }

    public static String A04() {
        return AnonymousClass1o2.A01("log_in").A04();
    }

    public static void A08(AnonymousClass0A3 r2, String str) {
        r2.A0T(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        r2.A0T("waterfall_id", A04());
    }

    public final C63313hF A0B(C10300i6 r4) {
        return new C63313hF(r4, this.A01, this.A00);
    }

    /* access modifiers changed from: public */
    AnonymousClass269(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public static double A00() {
        return (double) A01();
    }

    public static void A05(AnonymousClass0A3 r2) {
        r2.A0T("waterfall_id", A04());
    }

    public static void A06(AnonymousClass0A3 r2, double d) {
        r2.A0R(TraceFieldType.StartTime, Double.valueOf(d));
        r2.A0T("waterfall_id", A04());
    }

    public static void A07(AnonymousClass0A3 r2, double d, double d2) {
        r2.A0T("waterfall_id", A04());
        r2.A0T("containermodule", "waterfall_log_in");
        r2.A0R("elapsed_time", Double.valueOf(d - d2));
    }

    public static void A09(H1T h1t) {
        h1t.A0O("waterfall_id", A04());
    }

    public static void A0A(H1T h1t, String str, String str2) {
        h1t.A0O(str, str2);
        h1t.A0O("waterfall_id", A04());
    }

    /* access modifiers changed from: public */
    AnonymousClass269(String str) {
        this.A01 = str;
        this.A00 = str;
    }
}
