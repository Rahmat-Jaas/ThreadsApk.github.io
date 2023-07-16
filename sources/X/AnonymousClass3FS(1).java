package X;

import com.facebook.redex.IDxListenerShape793S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3FS  reason: invalid class name */
public final class AnonymousClass3FS {
    public boolean A00 = false;
    public boolean A01;
    public final UserSession A02;

    public final void A00() {
        AnonymousClass3HB r5 = new AnonymousClass3HB();
        C67493ze r0 = r5.A02;
        Boolean A0Y = C18180wK.A0Y();
        C67463zb r4 = r0.A00;
        r4.A03("ig_feed_xpost_upsell", A0Y);
        r5.A00.add("IG_FEED_CROSS_POSTING_UPSELL");
        r5.A01();
        UserSession userSession = this.A02;
        AnonymousClass0TJ r6 = AnonymousClass0TJ.A06;
        if (!C63803iN.A0E(r6, userSession, 2342159569041558699L) || C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36317341511847477L)) {
            r4.A03("impression_limit_check_enabled", C18180wK.A0X());
        }
        if (!C63803iN.A0E(r6, userSession, 2342159569041624236L) || C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36317341511847477L)) {
            r4.A03("recently_seen_check_enabled", C18180wK.A0X());
        }
        r5.A00().A00(new IDxListenerShape793S0100000_1_I2(this, 2), userSession);
    }

    public AnonymousClass3FS(UserSession userSession) {
        this.A02 = userSession;
        this.A01 = C62183Xq.A00(userSession);
    }
}
