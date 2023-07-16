package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;

/* renamed from: X.49a  reason: invalid class name and case insensitive filesystem */
public final class C695449a implements AnonymousClass0i4, CallerContextable {
    public static final String __redex_internal_original_name = "FxAvatarsEditorUpsellHelper";
    public final UserSession A00;

    public C695449a(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final boolean A00() {
        UserSession userSession = this.A00;
        if (C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 2342160574063841102L) || !C35692Ol.A00(userSession).A05(CallerContext.A00(C695449a.class), "ig_avatar_editor_upsell")) {
            return false;
        }
        return true;
    }

    public final void onSessionWillEnd() {
        this.A00.A03(C695449a.class);
    }
}
