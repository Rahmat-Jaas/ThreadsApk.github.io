package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxFCallbackShape78S0300000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3yt  reason: invalid class name and case insensitive filesystem */
public final class C67113yt implements CallerContextable {
    public static final CallerContext A03 = CallerContext.A00(C67113yt.class);
    public static final String __redex_internal_original_name = "FxIsUpsellEligibilityFetcher";
    public AnonymousClass3HB A00;
    public boolean A01;
    public String[] A02;

    public C67113yt(AnonymousClass3HB r1, String[] strArr, boolean z) {
        this.A00 = r1;
        this.A02 = strArr;
        this.A01 = z;
    }

    public final void A00(C82574pv r8, UserSession userSession) {
        if (C35692Ol.A00(userSession).A05(A03, "fx_growth_ig4a_is_eligibility_linkage_check") || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36316980734660034L)) {
            C566437z r1 = new C566437z(userSession);
            IDxFCallbackShape78S0300000_1_I2 iDxFCallbackShape78S0300000_1_I2 = new IDxFCallbackShape78S0300000_1_I2(1, r1, r8, this);
            String[] strArr = this.A02;
            boolean z = this.A01;
            C04220Ms.A0B(strArr, 0);
            AnonymousClass01V r2 = r1.A00;
            r2.markerStart(857806587);
            r2.markerAnnotate(857806587, "flows", strArr);
            r2.markerAnnotate(857806587, "use_server_impressions", z);
            AnonymousClass3WK.A01(userSession).AMA(C18230wP.A0N(this.A00.A02.build()), iDxFCallbackShape78S0300000_1_I2);
        }
    }
}
