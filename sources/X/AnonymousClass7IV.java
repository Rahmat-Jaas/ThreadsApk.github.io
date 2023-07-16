package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.7IV  reason: invalid class name */
public final class AnonymousClass7IV {
    public final long A00;
    public final C13330nS A01;
    public final String A02;
    public final String A03;

    public AnonymousClass7IV(C11630kW r3, UserSession userSession, String str, String str2) {
        C18180wK.A1P(userSession, 1, str);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = C13330nS.A01(r3, userSession);
        this.A00 = Long.parseLong(userSession.getUserId());
    }

    public final void A04(String str, String str2, String str3, String str4, String str5) {
        C04220Ms.A0B(str2, 1);
        AnonymousClass0wJ.A1Q(str3, str4);
        USLEBaseShape0S0000000 A002 = A00(this);
        C18190wL.A1I(A002, "update_action_button");
        A03(A002, this, "success", str, true);
        A002.A0S("partner_id", AnonymousClass0wJ.A0d(str2));
        C86114wI.A1F(A002, str3, str4);
        C86164wN.A1C(A002, str5);
    }

    public static USLEBaseShape0S0000000 A00(AnonymousClass7IV r3) {
        USLEBaseShape0S0000000 A0I = USLEBaseShape0S0000000.A0I(r3.A01);
        A0I.A0S("igid", Long.valueOf(r3.A00));
        return A0I;
    }

    public static void A02(AnonymousClass0A3 r4, AnonymousClass7IV r5, String str, String str2, boolean z) {
        r4.A0T(AnonymousClass3QD.A00(21, 10, 110), r5.A03);
        r4.A0Q("is_support_partner_enabled", Boolean.valueOf(z));
        r4.A0T("entry_point", r5.A02);
        r4.A0T("service_type", str);
        r4.A0S("partner_id", Long.valueOf(Long.parseLong(str2)));
    }

    public static void A03(AnonymousClass0A3 r4, AnonymousClass7IV r5, String str, String str2, boolean z) {
        r4.A0T("action", str);
        r4.A0T(C61933Wk.A00(21, 10, 47), r5.A03);
        r4.A0Q("is_support_partner_enabled", Boolean.valueOf(z));
        r4.A0T("entry_point", r5.A02);
        r4.A0T("service_type", str2);
    }

    public static void A01(AnonymousClass0A3 r2, AnonymousClass7IV r3, String str, String str2, boolean z) {
        r2.A0T(str, str2);
        r2.A0Q("is_support_partner_enabled", Boolean.valueOf(z));
        r2.A0T("entry_point", r3.A02);
    }

    public final void A05(boolean z) {
        USLEBaseShape0S0000000 A002 = A00(this);
        C18190wL.A1I(A002, "home_page");
        C18210wN.A1A(A002, "view");
        A01(A002, this, C61933Wk.A00(21, 10, 47), this.A03, z);
        A002.Bb4();
    }
}
