package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Lv  reason: invalid class name and case insensitive filesystem */
public final class C59693Lv {
    public static final void A00(C320129v r3, UserSession userSession) {
        AnonymousClass0wJ.A1N(r3, userSession);
        USLEBaseShape0S0000000 A07 = USLEBaseShape0S0000000.A07(C13330nS.A02(userSession));
        if (AnonymousClass0wJ.A1U(A07)) {
            A07.A0O(r3, "action_name");
            A07.A0T("instagram_user_id", userSession.getUserId());
            A07.Bb4();
        }
    }

    public static final void A01(C320129v r3, UserSession userSession, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        AnonymousClass0wJ.A1N(r3, userSession);
        USLEBaseShape0S0000000 A07 = USLEBaseShape0S0000000.A07(C13330nS.A02(userSession));
        if (AnonymousClass0wJ.A1U(A07)) {
            A07.A0O(r3, "action_name");
            A07.A0Q("current_cross_posting_setting", Boolean.valueOf(z2));
            A07.A0T("default_audience_entry_point", str3);
            A07.A0T("default_audience", str2);
            A07.A0T("instagram_user_id", userSession.getUserId());
            A07.A0Q("is_old_crossposter", C18210wN.A0R(A07, C18190wL.A0Z(A07, "default_privacy_migration_phase", str, z), "has_opt_in_default_audience_migration", z3));
            A07.A0T("audience_cohort", str4);
            A07.Bb4();
        }
    }
}
