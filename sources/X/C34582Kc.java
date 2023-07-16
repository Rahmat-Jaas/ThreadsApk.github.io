package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.2Kc  reason: invalid class name and case insensitive filesystem */
public final class C34582Kc {
    public static final void A00(AnonymousClass28L r4, C10300i6 r5, String str, String str2, String str3, String str4, String str5, String str6) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r5), "caa_account_recovery_client_events_ig"), 117);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C09120et A0X = C18190wL.A0X();
            AnonymousClass14B r3 = new AnonymousClass14B();
            C18220wO.A1H(r3, str, str2, str4, str3);
            r3.A0A("logged_out_identifier", str5);
            r3.A0A("waterfall_id", A0X.A0D());
            r3.A0A("event_request_id", str6);
            A0I.A0P(r3, "core");
            AnonymousClass14A r1 = new AnonymousClass14A();
            r1.A04(r4, "event_source");
            A0I.A0P(r1, "account_recovery_params");
            A0I.Bb4();
        }
    }
}
