package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.graphql.UpdateAutoCrossPostingSettingMutationResponseImpl;

/* renamed from: X.3U2  reason: invalid class name */
public final class AnonymousClass3U2 {
    public static final AnonymousClass3U2 A00 = new AnonymousClass3U2();

    public final void A00(UserSession userSession, C83834s4 r17, String str, String str2, boolean z) {
        String str3 = str2;
        UserSession userSession2 = userSession;
        C18190wL.A1S(userSession2, 3, str3);
        C31580Grx A01 = AnonymousClass3WK.A01(userSession2);
        GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
        GraphQlCallInput.A05(A002, "FB", "destination_app");
        GraphQlCallInput.A05(A002, str3, "destination_audience");
        String str4 = str;
        GraphQlCallInput.A05(A002, str4, "destination_surface");
        GraphQlCallInput.A05(A002, str4, "source_surface");
        GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
        A003.A0B(A002, "app_surface");
        GraphQlCallInput.A05(A003, Boolean.valueOf(z), "crosspost_setting");
        GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
        GraphQlCallInput.A05(A004, "IG", "source_app");
        A004.A0A("crosspost_app_surface_list", C18180wK.A0n(A003));
        GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000 = new GQLCallInputCInputShape1S0000000();
        gQLCallInputCInputShape1S0000000.A0B(A004, "config_request");
        C67463zb A005 = C67463zb.A00();
        C67463zb A006 = C67463zb.A00();
        A005.A02(gQLCallInputCInputShape1S0000000, "configs_request");
        C18250wR.A12(new PandoGraphQLRequest(C63233h2.A04(true), "UpdateAutoCrossPostingSettingMutation", GraphQlCallInput.A03(A005), GraphQlCallInput.A03(A006), UpdateAutoCrossPostingSettingMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 12, "configs_request", "xcxp_unified_crossposting_configs_mutation_root"), A01, r17, 12);
    }
}
