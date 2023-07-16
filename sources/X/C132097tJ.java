package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.service.session.UserSession;

/* renamed from: X.7tJ  reason: invalid class name and case insensitive filesystem */
public final class C132097tJ implements AnonymousClass0i4 {
    public final C13330nS A00;
    public final C11630kW A01;
    public final UserSession A02;

    public C132097tJ(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A02 = userSession;
        C15720rm r0 = new C15720rm("CreatorMonetizationLogger");
        this.A01 = r0;
        this.A00 = C13330nS.A01(r0, userSession);
    }

    public final void A01(C35410Iuf iuf, C35424Iut iut, C35421Iuq iuq, String str, String str2, String str3) {
        String A002 = AnonymousClass000.A00(279);
        AnonymousClass0wJ.A1R(iuf, str);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "ig_user_pay_badges_supporters_list_supporter_tap"), 1474);
        C86134wK.A1E(iut, iuq, A0I, A002);
        A0I.A0O(iuf, "origin");
        A0I.A0T("supporter_id", str);
        A0I.A0T("media_id", str2);
        A0I.A0T(AnonymousClass000.A00(168), str3);
        A0I.Bb4();
    }

    public final void onSessionWillEnd() {
        this.A02.A03(C132097tJ.class);
    }

    public final void A00(C35410Iuf iuf, C35424Iut iut, C35421Iuq iuq, String str, String str2, String str3) {
        AnonymousClass0wJ.A1Q(str, iuf);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "ig_user_pay_badges_see_supporters"), 1473);
        C86134wK.A1E(iut, iuq, A0I, str);
        A0I.A0O(iuf, "origin");
        A0I.A0T("media_id", str2);
        A0I.A0T(AnonymousClass000.A00(168), str3);
        A0I.Bb4();
    }

    public final void A02(C35424Iut iut, C35421Iuq iuq, D38 d38, AnonymousClass6BH r7, String str, String str2, String str3) {
        AnonymousClass0wJ.A1N(iut, iuq);
        AnonymousClass0wJ.A1Q(d38, r7);
        C04220Ms.A0B(str, 4);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "ig_creator_monetization_onboarding_flow"), 1151);
        C86134wK.A1E(iut, iuq, A0I, str);
        A0I.A0O(r7, OptSvcAnalyticsStore.LOGGING_KEY_STEP);
        A0I.A0O(d38, "action");
        C35410Iuf iuf = null;
        if (str2 != null) {
            try {
                iuf = C35410Iuf.valueOf(str2);
            } catch (IllegalArgumentException unused) {
            }
        }
        A0I.A0O(iuf, "origin");
        A0I.A0T(C18170wI.A00(147), str3);
        A0I.Bb4();
    }
}
