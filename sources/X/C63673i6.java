package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3i6  reason: invalid class name and case insensitive filesystem */
public final class C63673i6 {
    public static final void A00(C11630kW r2, C10300i6 r3, String str, String str2) {
        AnonymousClass0wJ.A1M(r3, 0, str);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r2, r3), "external_share_clicked"), 595);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18180wK.A1C(A0I, r2);
            C18250wR.A10(A0I, "share_location", str2, str);
            A0I.Bb4();
        }
    }

    public static final void A01(C11630kW r2, C10300i6 r3, String str, String str2) {
        AnonymousClass0wJ.A1M(r3, 0, str);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r2, r3), "external_share_view_impression"), 603);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18180wK.A1C(A0I, r2);
            C18250wR.A10(A0I, "share_location", str2, str);
            A0I.Bb4();
        }
    }

    public static final void A03(C11630kW r3, C10300i6 r4, String str, String str2, String str3) {
        Long l;
        C04220Ms.A0B(str, 2);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r3, r4), "external_share_media_ufi_tooltip_impression"), 597);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T("media_id", str);
            if (str2 != null) {
                l = AnonymousClass0wJ.A0d(str2);
            } else {
                l = null;
            }
            A0I.A0S("media_owner_id", l);
            C18180wK.A1C(A0I, r3);
            A0I.A0T("share_location", str3);
            C18190wL.A1L(A0I);
            A0I.Bb4();
        }
    }

    public static final void A04(C11630kW r5, C10300i6 r6, String str, String str2, String str3) {
        AnonymousClass0wJ.A1N(r6, r5);
        C04220Ms.A0B(str3, 4);
        A06(r5, r6, str, (String) null, str2, str3);
    }

    public static final void A05(C11630kW r4, C10300i6 r5, String str, String str2, String str3) {
        C10300i6 r1 = r5;
        C18180wK.A1Q(r1, 0, str3);
        A08(r4, r1, str, (String) null, str2, str3);
    }

    public static final void A06(C11630kW r3, C10300i6 r4, String str, String str2, String str3, String str4) {
        Long l;
        C04220Ms.A0B(str4, 5);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r3, r4), "external_share_option_tapped"), 599);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18180wK.A1C(A0I, r3);
            A0I.A0T("media_id", str);
            if (str2 != null) {
                l = AnonymousClass0wJ.A0d(str2);
            } else {
                l = null;
            }
            A0I.A0S("media_owner_id", l);
            A0I.A0T("share_location", str3);
            A0I.A0T("share_option", str4);
            C18190wL.A1L(A0I);
            A0I.Bb4();
        }
    }

    public static final void A08(C11630kW r3, C10300i6 r4, String str, String str2, String str3, String str4) {
        Long l;
        C18190wL.A1S(r4, 0, str4);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r3, r4), "external_share_option_impression"), 598);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T("media_id", str);
            if (str2 != null) {
                l = AnonymousClass0wJ.A0d(str2);
            } else {
                l = null;
            }
            A0I.A0S("media_owner_id", l);
            C18180wK.A1C(A0I, r3);
            A0I.A0T("share_location", str3);
            A0I.A0T("share_option", str4);
            A0I.Bb4();
        }
    }

    public static final void A0A(C11630kW r1, UserSession userSession, String str, String str2, String str3, String str4) {
        C11630kW r0 = r1;
        UserSession userSession2 = userSession;
        AnonymousClass0wJ.A1N(userSession, r0);
        String str5 = str;
        String str6 = str2;
        AnonymousClass0wJ.A1Q(str5, str2);
        String str7 = str3;
        C18180wK.A1R(str7, str4);
        A0B(r0, userSession2, str5, str6, str7, str4, (String) null);
    }

    public static final void A02(C11630kW r3, C10300i6 r4, String str, String str2, String str3) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r3, r4), "external_share_failed"), 596);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18180wK.A1C(A0I, r3);
            A0I.A0T("share_option", str2);
            C18250wR.A10(A0I, "error", str3, str);
            A0I.A0T("share_location", "live_action_sheet");
            A0I.Bb4();
        }
    }

    public static final void A07(C11630kW r2, C10300i6 r3, String str, String str2, String str3, String str4) {
        AnonymousClass0wJ.A1R(str2, str3);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r2, r3), "external_share_option_tapped"), 599);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18180wK.A1C(A0I, r2);
            A0I.A0T("media_id", str);
            A0I.A0T("share_location", str2);
            A0I.A0T("share_option", str3);
            C18190wL.A1L(A0I);
            A0I.A1X(str4);
            A0I.Bb4();
        }
    }

    public static final void A09(C11630kW r3, C10300i6 r4, String str, String str2, String str3, Throwable th) {
        String str4;
        AnonymousClass0wJ.A1N(r4, r3);
        AnonymousClass0wJ.A1Q(str, str2);
        C04220Ms.A0B(str3, 4);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r3, r4), "external_share_failed"), 596);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18180wK.A1C(A0I, r3);
            A0I.A0T("share_option", str3);
            if (th != null) {
                str4 = th.getMessage();
            } else {
                str4 = null;
            }
            C18250wR.A10(A0I, "error", str4, str);
            A0I.A0T("share_location", str2);
            A0I.Bb4();
        }
    }

    public static final void A0B(C11630kW r3, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass0wJ.A1Q(str, str2);
        C18180wK.A1R(str3, str4);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r3, userSession), "external_share_succeeded"), 602);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T("media_id", str);
            C18180wK.A1C(A0I, r3);
            A0I.A1X(str5);
            A0I.A0T("share_location", str2);
            A0I.A0T("share_option", str3);
            C18190wL.A1L(A0I);
            A0I.A0T("url", str4);
            A0I.A0S("following_count", C18220wO.A0e(AnonymousClass0wJ.A0Y(userSession).A0o()));
            A0I.Bb4();
        }
    }
}
