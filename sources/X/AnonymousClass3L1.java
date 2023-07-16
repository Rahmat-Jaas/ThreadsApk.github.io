package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.3L1  reason: invalid class name */
public final class AnonymousClass3L1 {
    public static final void A00(C10300i6 r3, String str, String str2, String str3, String str4) {
        C15730rn A01 = C15730rn.A01("instagram_shopping_onboarding_navigation_request_started", str);
        A01.A0D("entry_point", str2);
        A01.A0D("prior_module", str3);
        A01.A0D("waterfall_id", str4);
        A01.A0C("network_start_time", C18200wM.A0c());
        if (r3 != null) {
            C18180wK.A1K(A01, r3);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final void A01(C10300i6 r3, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        C15730rn A01 = C15730rn.A01("instagram_shopping_onboarding_navigation_request_completed", str);
        A01.A0D("entry_point", str2);
        A01.A0D("prior_module", str3);
        A01.A0D("waterfall_id", str4);
        A01.A0C("network_end_time", C18200wM.A0c());
        if (z) {
            str5 = "success";
        } else {
            str5 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
        }
        A01.A0D("network_result", str5);
        if (r3 != null) {
            C18180wK.A1K(A01, r3);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
