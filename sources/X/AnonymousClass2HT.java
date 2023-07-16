package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.graphql.instagramschema.BasicAdsOptInQueryResponseImpl;
import com.instagram.service.session.UserSession;

/* renamed from: X.2HT  reason: invalid class name */
public final class AnonymousClass2HT {
    public static final Object A00(AnonymousClass601 r13, C63893iY r14) {
        boolean A1Y = AnonymousClass0wJ.A1Y(r14, r13);
        Object A0B = C63893iY.A0B(r14, A1Y ? 1 : 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.Boolean");
        boolean A1X = AnonymousClass0wJ.A1X(A0B);
        C10300i6 A0F = C63913ic.A0F(r13);
        C18200wM.A1R(A0F);
        UserSession userSession = (UserSession) A0F;
        AnonymousClass0wJ.A13(C28161tl.A03(userSession), "basic_ads_opt_in_status", A1X);
        AnonymousClass3WK.A02(C18230wP.A0N(new PandoGraphQLRequest(C63233h2.A00(), "BasicAdsOptInQuery", GraphQlCallInput.A00().A07(), GraphQlCallInput.A00().A07(), BasicAdsOptInQueryResponseImpl.class, A1Y, (PandoRealtimeInfoJNI) null, A1Y ? 1 : 0, (String) null, "xfb_user_basic_ads_preferences")), new IDxACallbackShape111S0100000_1_I2(userSession, 3), userSession);
        return null;
    }
}
