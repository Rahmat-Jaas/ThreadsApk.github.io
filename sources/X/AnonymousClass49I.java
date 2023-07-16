package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.49I  reason: invalid class name */
public final class AnonymousClass49I implements AnonymousClass0i4 {
    public AnonymousClass3BS A00 = new AnonymousClass3BS();
    public final UserSession A01;

    public AnonymousClass49I(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public static final boolean A00(AnonymousClass49I r4, boolean z) {
        boolean A1W;
        UserSession userSession = r4.A01;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A06;
        if (C63803iN.A0E(r2, userSession, 36317405936356974L)) {
            A1W = false;
        } else {
            if (z) {
                r2 = AnonymousClass0TJ.A05;
            }
            A1W = C18210wN.A1W(C63803iN.A0E(r2, userSession, 36317405936553585L));
        }
        if (A1W || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 2342157812399933598L) || !C28161tl.A04(userSession).getBoolean("fx_cal_profile_pic_is_upsell_seen", false)) {
            return false;
        }
        return true;
    }

    public final boolean A01(boolean z) {
        UserSession userSession = this.A01;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (!C63803iN.A0E(r2, userSession, 2342157812399868061L) || !this.A00.A03 || A00(this, false)) {
            return false;
        }
        if (!z) {
            r2 = AnonymousClass0TJ.A06;
        }
        return C63803iN.A0E(r2, userSession, 36314798891206810L);
    }

    public final void onSessionWillEnd() {
        this.A01.A03(AnonymousClass49I.class);
    }
}
