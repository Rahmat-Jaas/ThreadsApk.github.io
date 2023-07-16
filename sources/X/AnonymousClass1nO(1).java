package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.upsell.noticestate.graphql.SyncCXPNoticeStateMutationResponseImpl;
import com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateApi;
import com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape164S0100000_I2_19;

/* renamed from: X.1nO  reason: invalid class name */
public final class AnonymousClass1nO extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1nO(C697249u r7, int i) {
        super("syncCXPNoticeImpressionState", 1158112076, i, true, true);
        this.A00 = r7;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A06;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 2342168730207855827L)) {
            C04220Ms.A0B(userSession, 0);
            CXPNoticeStateRepository cXPNoticeStateRepository = new CXPNoticeStateRepository(userSession, AnonymousClass006.A00);
            Map A01 = AnonymousClass3P3.A01(userSession);
            if (!A01.isEmpty() && !cXPNoticeStateRepository.A02.A00.getBoolean("has_synced_notice_states", false)) {
                CXPNoticeStateApi cXPNoticeStateApi = cXPNoticeStateRepository.A01;
                KtLambdaShape164S0100000_I2_19 ktLambdaShape164S0100000_I2_19 = new KtLambdaShape164S0100000_I2_19(cXPNoticeStateRepository, 0);
                ImmutableList A002 = CXPNoticeStateApi.A00(A01);
                C31580Grx grx = cXPNoticeStateApi.A00;
                C67463zb A003 = C67463zb.A00();
                C67463zb A004 = C67463zb.A00();
                A003.A06("client_states", A002);
                C31155GhB.A05(new C32165H8c(grx.A05(new PandoGraphQLRequest(C63233h2.A04(true), "SyncCXPNoticeStateMutation", GraphQlCallInput.A03(A003), GraphQlCallInput.A03(A004), SyncCXPNoticeStateMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_sync_notice_state")).A02(new AnonymousClass4A0(cXPNoticeStateApi, A01, ktLambdaShape164S0100000_I2_19), 1158112076, 3, true, true)), 1158112076, 3, true, true);
            }
        }
    }
}
