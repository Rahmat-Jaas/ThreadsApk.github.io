package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.7vE  reason: invalid class name and case insensitive filesystem */
public final class C133167vE implements C21754Bzf {
    public final C11630kW A00;
    public final C101486Rl A01;
    public final UserSession A02;

    public final boolean Cu6() {
        return true;
    }

    public final boolean Cu7() {
        return true;
    }

    public final void CPR() {
        UserSession userSession = this.A02;
        AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(userSession)), "seen_feed_quick_send_nux", true);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this.A00, userSession), I17.A00(98)), 538);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T("type", "quick_send");
            A0I.Bb4();
        }
    }

    public final boolean Ct8() {
        UserSession userSession = this.A02;
        if (C28161tl.A04(userSession).getBoolean("seen_feed_quick_send_nux", false) || C28161tl.A04(userSession).getBoolean("seen_feed_quick_send_window", false) || C28161tl.A04(userSession).getInt(AnonymousClass000.A00(884), 0) < 2) {
            return false;
        }
        return true;
    }

    public C133167vE(C11630kW r3, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = r3;
        this.A01 = (C101486Rl) userSession.A01(C101486Rl.class, C138418Hk.A00);
    }
}
