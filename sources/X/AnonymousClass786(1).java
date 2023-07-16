package X;

import android.os.SystemClock;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxFunctionShape362S0100000_2_I2;
import com.fbpay.logging.FBPayLoggerData;
import com.instagram.fbpay.auth.content.graphql.IGFBPayAuthFlowsContentQueryResponseImpl;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.786  reason: invalid class name */
public final class AnonymousClass786 {
    public static final long A04 = TimeUnit.DAYS.toMillis(30);
    public long A00 = 0;
    public final C143688h9 A01;
    public final C31580Grx A02;
    public final UserSession A03;

    public final C145388kQ A00(FBPayLoggerData fBPayLoggerData, Integer num, String str) {
        String str2;
        boolean A1Z = C18180wK.A1Z(num, AnonymousClass006.A0C);
        this.A00 = SystemClock.elapsedRealtime();
        if (A1Z) {
            str2 = "fetch_auth_flows_cached_content_init";
        } else {
            str2 = "fetch_auth_flows_content_init";
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        FBPayLoggerData fBPayLoggerData2 = fBPayLoggerData;
        A0y.put("logger_data", fBPayLoggerData2);
        String str3 = str;
        A0y.put("product", str3);
        this.A01.Bb8(str2, A0y);
        C67463zb A002 = C67463zb.A00();
        C67463zb A003 = C67463zb.A00();
        GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
        A0L.A0D("fixed_client_mutation_id", "client_mutation_id");
        A0L.A0D(this.A03.getUserId(), "actor_id");
        A0L.A0D(str3, "payment_type");
        A002.A02(A0L, "input");
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C63233h2.A01(), "IGFBPayAuthFlowsContentQuery", A002.getParamsCopy(), A003.getParamsCopy(), IGFBPayAuthFlowsContentQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 12, "input", (String) null);
        if (A1Z) {
            long j = A04;
            pandoGraphQLRequest.setMaxToleratedCacheAgeMs(j);
            pandoGraphQLRequest.setFreshCacheAgeMs(j);
        } else {
            pandoGraphQLRequest.setFreshCacheAgeMs(0).setMaxToleratedCacheAgeMs(0);
        }
        C92935kG r1 = new C92935kG(this.A02, pandoGraphQLRequest, new IDxFunctionShape362S0100000_2_I2(this, 7), AnonymousClass6BW.A01);
        r1.A6o(new C129037ku(fBPayLoggerData2, this, str3, A1Z));
        return r1;
    }

    public AnonymousClass786(C143688h9 r3, UserSession userSession) {
        this.A03 = userSession;
        this.A01 = r3;
        this.A02 = AnonymousClass3WK.A01(userSession);
    }
}
