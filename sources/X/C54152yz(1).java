package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.2yz  reason: invalid class name and case insensitive filesystem */
public final class C54152yz {
    public static final void A00(C10300i6 r2, Boolean bool, Boolean bool2, String str, String str2) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r2), "igts_defaults"), 1544);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T("event_type", str2);
            A0I.A0T("client_userid", str);
            if (bool != null) {
                A0I.A0Q("is_set_to_private", Boolean.valueOf(bool.booleanValue()));
            }
            if (bool2 != null) {
                A0I.A0Q("should_set_teen_users_as_private", Boolean.valueOf(bool2.booleanValue()));
            }
            A0I.Bb4();
        }
    }
}
