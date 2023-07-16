package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.Locale;

/* renamed from: X.2Ov  reason: invalid class name and case insensitive filesystem */
public final class C35792Ov {
    public static final void A00(UserSession userSession, String str, String str2) {
        AnonymousClass0wJ.A1M(userSession, 0, str2);
        String obj = AnonymousClass2AF.A0f.toString();
        Locale locale = Locale.ROOT;
        String A0r = C18190wL.A0r(locale, obj);
        String A0g = C18200wM.A0g();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "fx_igpc_migration_upsell"), 686);
        A0I.A0T("event", A0r);
        A0I.A0T("linking_flow_entry_point", C18190wL.A0r(locale, str));
        Long l = null;
        String userId = userSession.getUserId();
        if (userId != null) {
            l = AnonymousClass0wJ.A0d(userId);
        }
        A0I.A0S("initiator_account_id", l);
        A0I.A0S("initiator_account_type", C18230wP.A0f(1));
        A0I.A0S("target_account_id", AnonymousClass0wJ.A0d(str2));
        A0I.A0T("app_device_id", A0g);
        A0I.A0T("debug_data", (String) null);
        A0I.Bb4();
    }
}
