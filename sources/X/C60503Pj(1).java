package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Pj  reason: invalid class name and case insensitive filesystem */
public final class C60503Pj {
    public static final void A01(C11630kW r1, UserSession userSession, Integer num) {
        String str;
        C04220Ms.A0B(userSession, 1);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r1, userSession), "instagram_activity_center_bulk_action"), 1587);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18210wN.A1A(A0I, "feature_click");
            A0I.A0T("screen", "not_an_ac_screen");
            A0I.A0T("interface", "");
            A0I.A0T("useragent", "");
            AnonymousClass0ZV r12 = AnonymousClass0ZV.A00;
            A0I.A0U("content_fbids", r12);
            A0I.A0U("content_igids", r12);
            if (C18240wQ.A05(A0I, num, "action_target", "shared_activity") != 0) {
                str = "profile_see_more_menu";
            } else {
                str = "user_following_list";
            }
            A0I.A0T("entrypoint", str);
            A0I.Bb4();
        }
    }

    public static final void A00(C11630kW r1, UserSession userSession, AnonymousClass24E r3, String str) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r1, userSession), "instagram_activity_center_bulk_action"), 1587);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18210wN.A1A(A0I, "unlike");
            A0I.A0T("screen", r3.A00);
            A0I.A0T("interface", "");
            A0I.A0T("useragent", "");
            A0I.A0U("content_fbids", AnonymousClass0ZV.A00);
            A0I.A0U("content_igids", C18180wK.A0n(str));
            A0I.A0T("entrypoint", (String) null);
            A0I.Bb4();
        }
    }
}
