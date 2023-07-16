package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxFCallbackShape78S0300000_1_I2;
import com.instagram.graphql.instagramschemagraphservices.FXSSOInfoQueryResponseImpl;
import com.instagram.service.session.UserSession;

/* renamed from: X.48y  reason: invalid class name and case insensitive filesystem */
public final class C695248y implements AnonymousClass0i4 {
    public boolean A00;
    public final UserSession A01;

    public C695248y(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void A00(C83854s6 r18) {
        AnonymousClass3WK.A01(this.A01).AMA(new PandoGraphQLRequest(C63233h2.A01(), "FXSSOInfoQuery", GraphQlCallInput.A00().A07(), GraphQlCallInput.A00().A07(), FXSSOInfoQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_fx_sso_info"), new IDxFCallbackShape78S0300000_1_I2(2, this, r18, new C04180Mo()));
    }

    public final void onSessionWillEnd() {
        this.A01.A03(C695248y.class);
    }
}
