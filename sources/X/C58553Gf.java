package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Gf  reason: invalid class name and case insensitive filesystem */
public final class C58553Gf {
    public final C13330nS A00;

    public final void A00(int i) {
        USLEBaseShape0S0000000 A0M = USLEBaseShape0S0000000.A0M(this.A00);
        C18220wO.A1E(C318529f.REMOVE_WORDS_TAPPED, A0M);
        A0M.A0S("word_count", C18230wP.A0f(1));
        A0M.A0S("word_list_size", C18230wP.A0f(i));
        A0M.Bb4();
    }

    public final void A01(int i, int i2) {
        USLEBaseShape0S0000000 A0M = USLEBaseShape0S0000000.A0M(this.A00);
        C18220wO.A1E(C318529f.ADD_WORDS_BUTTON_TAPPED, A0M);
        A0M.A0S("word_count", C18230wP.A0f(i));
        A0M.A0S("word_list_size", C18230wP.A0f(i2));
        A0M.Bb4();
    }

    public C58553Gf(C11630kW r2, UserSession userSession) {
        this.A00 = C13330nS.A01(r2, userSession);
    }
}
