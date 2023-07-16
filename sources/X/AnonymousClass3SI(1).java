package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.graphql.instagramschema.IGAvatarStickersForKeysQueryResponseImpl;
import com.instagram.service.session.UserSession;

/* renamed from: X.3SI  reason: invalid class name */
public final class AnonymousClass3SI {
    public final C31580Grx A00;
    public final UserSession A01;

    public AnonymousClass3SI(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AnonymousClass3WK.A01(userSession);
    }

    public static /* synthetic */ C146418mD A00(AnonymousClass3SI r12, String str, long j) {
        C67463zb A002 = C67463zb.A00();
        C67463zb A003 = C67463zb.A00();
        String userId = r12.A01.getUserId();
        A002.A05("user_id", userId);
        boolean A1W = AnonymousClass0wJ.A1W(userId);
        GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
        A004.A0A("instruction_key_ids", C18180wK.A0n(str));
        GraphQlCallInput.A05(A004, false, "refresh_only");
        A002.A02(A004, "query_params");
        AnonymousClass7Ko.A0B(A1W);
        return new PandoGraphQLRequest(C63233h2.A03(true), "IGAvatarStickersForKeysQuery", GraphQlCallInput.A03(A002), GraphQlCallInput.A03(A003), IGAvatarStickersForKeysQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fetch__IGUser").setFreshCacheAgeMs(0).setMaxToleratedCacheAgeMs(j);
    }
}
