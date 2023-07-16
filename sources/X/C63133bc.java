package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.service.session.UserSession;

/* renamed from: X.3bc  reason: invalid class name and case insensitive filesystem */
public final class C63133bc {
    public static long A00(AnonymousClass0A3 r1, String str, String str2, String str3, String str4) {
        r1.A0T("av_session_id", str);
        r1.A0T("flow", str2);
        r1.A0T(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str3);
        if (str4 != null) {
            return Long.parseLong(str4);
        }
        return 0;
    }

    public static final void A01(C11630kW r4, UserSession userSession, String str, String str2, String str3) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C18220wO.A0V(r4, userSession), "av_continue_tapped"), 56);
        if (AnonymousClass0wJ.A1U(A0I)) {
            if (str == null) {
                str = "";
            }
            A0I.A0S("flow_id", Long.valueOf(A00(A0I, str, "av_idv", str2, str3)));
            C18210wN.A1C(A0I, r4.getModuleName());
        }
    }

    public static final void A02(C11630kW r3, UserSession userSession, String str, String str2, String str3, String str4) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C18220wO.A0V(r3, userSession), "av_back_button_tapped"), 54);
        if (AnonymousClass0wJ.A1U(A0I)) {
            if (str == null) {
                str = "";
            }
            A0I.A0S("flow_id", Long.valueOf(A00(A0I, str, str2, str3, str4)));
            C18210wN.A1C(A0I, r3.getModuleName());
        }
    }

    public static final void A03(C11630kW r3, UserSession userSession, String str, String str2, String str3, String str4) {
        String str5;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C18220wO.A0V(r3, userSession), "av_cancel_tapped"), 55);
        if (AnonymousClass0wJ.A1U(A0I)) {
            if (str == null) {
                str = "";
            }
            A0I.A0S("flow_id", Long.valueOf(A00(A0I, str, str2, str3, str4)));
            if (r3 != null) {
                str5 = r3.getModuleName();
            } else {
                str5 = null;
            }
            C18210wN.A1C(A0I, str5);
        }
    }

    public static final void A04(C11630kW r3, UserSession userSession, String str, String str2, String str3, String str4) {
        String str5;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C18220wO.A0V(r3, userSession), "av_submit_tapped"), 60);
        if (AnonymousClass0wJ.A1U(A0I)) {
            if (str == null) {
                str = "";
            }
            A0I.A0S("flow_id", Long.valueOf(A00(A0I, str, str2, str3, str4)));
            if (r3 != null) {
                str5 = r3.getModuleName();
            } else {
                str5 = null;
            }
            C18210wN.A1C(A0I, str5);
        }
    }

    public static final void A05(C11630kW r3, UserSession userSession, String str, String str2, String str3, String str4) {
        String str5;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C18220wO.A0V(r3, userSession), "av_view_loaded"), 61);
        if (AnonymousClass0wJ.A1U(A0I)) {
            if (str == null) {
                str = "";
            }
            A0I.A0S("flow_id", Long.valueOf(A00(A0I, str, str2, str3, str4)));
            if (r3 != null) {
                str5 = r3.getModuleName();
            } else {
                str5 = null;
            }
            C18210wN.A1C(A0I, str5);
        }
    }
}
