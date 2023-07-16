package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.crossposting.feed.graphql.FBToIGFeedDefaultPrivacyOptInMutationResponseImpl;
import com.instagram.service.session.UserSession;

/* renamed from: X.2MI  reason: invalid class name */
public final class AnonymousClass2MI {
    public static final void A00(C83504rU r14, UserSession userSession) {
        C18250wR.A12(new PandoGraphQLRequest(C63233h2.A01(), "FBToIGFeedDefaultPrivacyOptInMutation", GraphQlCallInput.A00().A07(), GraphQlCallInput.A00().A07(), FBToIGFeedDefaultPrivacyOptInMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_set_ig_user_opt_in_default_audience_true"), AnonymousClass3WK.A01(userSession), r14, 4);
    }
}
