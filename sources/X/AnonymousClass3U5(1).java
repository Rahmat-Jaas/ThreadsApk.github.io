package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.3U5  reason: invalid class name */
public final class AnonymousClass3U5 {
    public static final AnonymousClass3U5 A00 = new AnonymousClass3U5();

    public final void A00(C10300i6 r7, String str, String str2, String str3, String str4, int i) {
        C04220Ms.A0B(str2, 2);
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r7), "ig_aymh_password_input_result"), 809);
        AnonymousClass269.A07(A0I, A002, A003);
        A0I.A0T("originating_source", str2);
        A0I.A0T("outcome", str3);
        A0I.A0S(OptSvcAnalyticsStore.LOGGING_KEY_ATTEMPT_NUMBER, C18230wP.A0f(i));
        A0I.A0T("error", str4);
        C63683i7.A0B(A0I, str, A003);
        A0I.Bb4();
    }
}
