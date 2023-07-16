package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.graphql.instagramschema.IGAvatarPrivacySettingsIsPublicResponseImpl;
import com.instagram.service.session.UserSession;

/* renamed from: X.3EF  reason: invalid class name */
public final class AnonymousClass3EF {
    public final UserSession A00;

    public AnonymousClass3EF(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(C63873iU r18) {
        C63873iU r5 = r18;
        C04220Ms.A0B(r5, 0);
        C67463zb A002 = C67463zb.A00();
        C67463zb A003 = C67463zb.A00();
        UserSession userSession = this.A00;
        String userId = userSession.getUserId();
        A002.A05("user_id", userId);
        AnonymousClass3WK.A02(new PandoGraphQLRequest(C63233h2.A03(AnonymousClass0wJ.A1W(userId)), "IGAvatarPrivacySettingsIsPublic", GraphQlCallInput.A03(A002), GraphQlCallInput.A03(A003), IGAvatarPrivacySettingsIsPublicResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fetch__IGUser"), r5, userSession);
    }
}
