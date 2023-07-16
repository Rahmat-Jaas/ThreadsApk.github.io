package X;

import android.os.Bundle;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.service.session.UserSession;

/* renamed from: X.7w3  reason: invalid class name and case insensitive filesystem */
public final class C133637w3 implements C21342Bsn {
    public final long A00;
    public final C11630kW A01;
    public final UserSession A02;
    public final String A03;

    public final void BbA(Bundle bundle, String str, String str2, String str3, String str4) {
        Boolean bool;
        Boolean bool2;
        Long l;
        Long l2;
        Long l3;
        C04220Ms.A0B(str, 0);
        AnonymousClass0wJ.A1O(str2, str3);
        C04220Ms.A0B(str4, 3);
        UserSession userSession = this.A02;
        USLEBaseShape0S0000000 A0L = C86104wH.A0L(AnonymousClass0wJ.A0M(C13330nS.A01(this.A01, userSession), "ig_lead_gen_ads_business"), str2, str3, str4, 1253);
        C86124wJ.A1J(A0L, userSession, str);
        A0L.A0Q("is_from_organic", false);
        A0L.A0S("business_ig_user_fbidv2", Long.valueOf(this.A00));
        Long l4 = null;
        if (bundle != null) {
            bool = C18210wN.A0Q(bundle, "has_user_continue");
        } else {
            bool = null;
        }
        A0L.A0Q("has_continue", bool);
        if (bundle != null) {
            bool2 = C18210wN.A0Q(bundle, "has_seen_warning");
        } else {
            bool2 = null;
        }
        A0L.A0Q("has_seen_warning_msg", bool2);
        if (bundle != null) {
            l = Long.valueOf(bundle.getLong("total_budget_of_warning"));
        } else {
            l = null;
        }
        A0L.A0S("total_budget_of_warning", l);
        if (bundle != null) {
            l2 = Long.valueOf(bundle.getLong("duration_of_warning"));
        } else {
            l2 = null;
        }
        A0L.A0S("duration_in_days_of_warning_budget", l2);
        if (bundle != null) {
            l3 = Long.valueOf(bundle.getLong("total_budget"));
        } else {
            l3 = null;
        }
        A0L.A0S("total_budget_of_submit", l3);
        if (bundle != null) {
            l4 = Long.valueOf(bundle.getLong("duration"));
        }
        A0L.A0S("duration_in_days_of_submit_budget", l4);
        A0L.A0T(C18170wI.A00(138), this.A03);
        A0L.Bb4();
    }

    public static final USLEBaseShape0S0000000 A00(C133637w3 r4, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, String str, String str2, String str3) {
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        UserSession userSession = r4.A02;
        USLEBaseShape0S0000000 A0L = C86104wH.A0L(AnonymousClass0wJ.A0M(C13330nS.A01(r4.A01, userSession), "ig_lead_gen_ads_business"), str, str2, str3, 1253);
        C86124wJ.A1J(A0L, userSession, C86114wI.A0o(LeadGenEntryPoint.PROMOTE.A00));
        A0L.A0Q("is_from_organic", C18180wK.A0X());
        A0L.A0S("business_ig_user_fbidv2", Long.valueOf(C86134wK.A0C(l)));
        A0L.A0Q("has_continue", bool);
        A0L.A0Q("has_seen_warning_msg", bool2);
        Long l7 = null;
        if (num != null) {
            l2 = C86144wL.A0c(num);
        } else {
            l2 = null;
        }
        A0L.A0S("total_budget_of_warning", l2);
        if (num2 != null) {
            l3 = C86144wL.A0c(num2);
        } else {
            l3 = null;
        }
        A0L.A0S("duration_in_days_of_warning_budget", l3);
        if (num3 != null) {
            l4 = C86144wL.A0c(num3);
        } else {
            l4 = null;
        }
        A0L.A0S("total_budget_of_submit", l4);
        if (num4 != null) {
            l5 = C86144wL.A0c(num4);
        } else {
            l5 = null;
        }
        A0L.A0S("duration_in_days_of_submit_budget", l5);
        if (num5 != null) {
            l6 = C86144wL.A0c(num5);
        } else {
            l6 = null;
        }
        A0L.A0S(I17.A00(593), l6);
        if (num6 != null) {
            l7 = C86144wL.A0c(num6);
        }
        A0L.A0S(I17.A00(594), l7);
        A0L.A0T(C18170wI.A00(138), r4.A03);
        return A0L;
    }

    public C133637w3(PromoteData promoteData, C11630kW r4) {
        String str;
        this.A01 = r4;
        UserSession userSession = promoteData.A0v;
        this.A02 = userSession;
        if (promoteData.A2G) {
            str = promoteData.A12;
        } else {
            str = null;
        }
        this.A03 = str;
        C04220Ms.A05(userSession);
        this.A00 = C86144wL.A0D(C04620Ok.A00(userSession).A00.A14());
    }
}
