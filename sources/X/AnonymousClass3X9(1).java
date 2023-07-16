package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.3X9  reason: invalid class name */
public final class AnonymousClass3X9 {
    public static final AnonymousClass3X9 A00 = new AnonymousClass3X9();

    public static /* synthetic */ void A00(C10300i6 r8, AnonymousClass3V1 r9, Boolean bool, String str, String str2, int i) {
        String str3 = null;
        if ((i & 8) != 0) {
            r9 = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r8), "facebook_sso_success"), 609);
        AnonymousClass269.A07(A0I, A002, A003);
        AnonymousClass0wJ.A1D(A0I, A003, A002);
        C18190wL.A1I(A0I, str);
        C63683i7.A08(A0I);
        A0I.A0T("instagram_id", str2);
        C63683i7.A09(A0I, r8);
        Boolean bool2 = null;
        if (r9 != null) {
            str3 = r9.A00.getString(C18240wQ.A0g("RECOVERY_TYPE"));
        }
        A0I.A0T("recovery_type", str3);
        if (r9 != null) {
            bool2 = C18210wN.A0Q(r9.A00, C18240wQ.A0g("WAS_FROM_RECOVERY_FLOW"));
        }
        A0I.A0Q("was_from_recovery_flow", bool2);
        A0I.A0Q("is_facebook_linking_flow", (Boolean) null);
        A0I.A0Q("found_unlinked_account", bool);
        A0I.A0Q("is_signup_with_confirmed_phone_flow", (Boolean) null);
        A0I.Bb4();
    }
}
