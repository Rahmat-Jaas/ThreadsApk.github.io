package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.495  reason: invalid class name */
public final class AnonymousClass495 implements AnonymousClass0i4 {
    public final C13330nS A00;
    public final UserSession A01;
    public final C11630kW A02;

    public final void A01(long j, String str, String str2, String str3) {
        C04220Ms.A0B(str, 0);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "ig_fan_club_promo_and_welcome_video_settings"), 1201);
        C18190wL.A1J(A0I, str, j);
        A0I.A0T("media_id", str2);
        C18210wN.A1A(A0I, str3);
        A0I.Bb4();
    }

    public final void A00(long j) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "ig_fan_club_exclusive_posts_icon_tapped"), 1194);
        C18250wR.A0x(A0I, Long.valueOf(j));
        C18230wP.A1H(A0I, "feed");
        C18250wR.A0z(A0I, "");
    }

    public final void onSessionWillEnd() {
        this.A01.A03(AnonymousClass495.class);
    }

    public AnonymousClass495(UserSession userSession) {
        this.A01 = userSession;
        C15720rm r0 = new C15720rm("FanClubLogger");
        this.A02 = r0;
        this.A00 = C13330nS.A01(r0, userSession);
    }
}
