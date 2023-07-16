package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.2Rf  reason: invalid class name and case insensitive filesystem */
public final class C36412Rf {
    public static final void A00(C13330nS r3, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        String str7;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r3, "ig_push_token_registration"), 1403);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T(AnonymousClass3Q5.A00(0, 9, 44), str4);
            A0I.A0T(AnonymousClass000.A00(60), str5);
            if (z) {
                str7 = "success";
            } else {
                str7 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            }
            A0I.A0T("result", str7);
            A0I.A0T("error", str2);
            A0I.A0T("error_class", str3);
            A0I.A0T("device_sub_type", str6);
            A0I.A0T("event", str);
            A0I.Bb4();
        }
    }
}
