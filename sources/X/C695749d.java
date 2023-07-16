package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;

/* renamed from: X.49d  reason: invalid class name and case insensitive filesystem */
public final class C695749d implements AnonymousClass0i4, CallerContextable {
    public static final String __redex_internal_original_name = "FxAcProfilePictureEligibility";
    public boolean A00;
    public final UserSession A01;

    public C695749d(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public static final boolean A00(C695749d r3) {
        UserSession userSession = r3.A01;
        if (!C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 36320524082681891L) || C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36317341511847477L)) {
            return false;
        }
        return C18190wL.A1X(C28161tl.A04(userSession), "fx_cal_profile_photo_chaining_ac_upsell_seen");
    }

    public final void onSessionWillEnd() {
        this.A01.A03(C695749d.class);
    }
}
