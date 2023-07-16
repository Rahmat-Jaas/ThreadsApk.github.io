package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;

/* renamed from: X.49b  reason: invalid class name and case insensitive filesystem */
public final class C695549b implements AnonymousClass0i4, CallerContextable {
    public static final String __redex_internal_original_name = "FxLogoutSsoUpsellHelper";
    public final UserSession A00;

    public C695549b(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final boolean A00(Context context) {
        C04220Ms.A0B(context, 0);
        UserSession userSession = this.A00;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A06;
        if (!C63803iN.A0E(r2, userSession, 2342158748702739194L) && ((!C63803iN.A0E(r2, userSession, 2342158748702935805L) || !C28161tl.A04(userSession).getBoolean("fx_cal_right_before_logout_sso_upsell_seen", false)) && !C35692Ol.A00(userSession).A05(CallerContext.A00(C695549b.class), "ig_fx_right_before_logout_sso_upsell"))) {
            AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
            if (!C35662Oi.A00(userSession).A05(userSession, "IG_FB_RIGHT_BEFORE_LOGOUT_SSO_UPSELL", C63803iN.A0E(r3, userSession, 36321546285751192L)) || !C63803iN.A0E(r3, userSession, 36315739489110779L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void onSessionWillEnd() {
        this.A00.A03(C695549b.class);
    }
}
