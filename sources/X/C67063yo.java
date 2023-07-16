package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;

/* renamed from: X.3yo  reason: invalid class name and case insensitive filesystem */
public final class C67063yo implements CallerContextable {
    public static final String __redex_internal_original_name = "FxAcUpsellEligibilityFetcher";
    public final C31580Grx A00;
    public final UserSession A01;
    public final CallerContext A02 = CallerContext.A01(__redex_internal_original_name);

    public final void A00(Context context, C82564pu r5, String str) {
        if (!C35692Ol.A00(this.A01).A05(this.A02, "ig_android_linking_cache_fx_ac_eligibility_linkage_check")) {
            GQH.A03.CwT(new C25601nw(context, r5, this, str));
        }
    }

    public C67063yo(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AnonymousClass3WK.A01(userSession);
    }
}
