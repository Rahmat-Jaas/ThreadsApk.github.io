package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxFCallbackShape113S0200000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.brandedcontent.BrandedContentXPostingDestinationFBPageEligibilityQueryResponseImpl;

/* renamed from: X.2r8  reason: invalid class name and case insensitive filesystem */
public final class C49282r8 {
    public static final void A00(UserSession userSession, AnonymousClass0YY r15, AnonymousClass0YY r16) {
        C31580Grx A01 = AnonymousClass3WK.A01(userSession);
        C67463zb A00 = C67463zb.A00();
        C67463zb A002 = C67463zb.A00();
        String userId = userSession.getUserId();
        A00.A05("igid", userId);
        A01.AMA(new PandoGraphQLRequest(C63233h2.A04(AnonymousClass0wJ.A1W(userId)), "BrandedContentXPostingDestinationFBPageEligibilityQuery", GraphQlCallInput.A03(A00), GraphQlCallInput.A03(A002), BrandedContentXPostingDestinationFBPageEligibilityQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fetch__IGUser").setMaxToleratedCacheAgeMs(86400000).setFreshCacheAgeMs(0), new IDxFCallbackShape113S0200000_1_I2(5, r15, r16));
    }
}
