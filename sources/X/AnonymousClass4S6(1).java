package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxFCallbackShape113S0200000_1_I2;
import com.instagram.attribution.FetchAttributionEventComplianceActionResponseImpl;
import java.util.List;

/* renamed from: X.4S6  reason: invalid class name */
public final class AnonymousClass4S6 implements Runnable {
    public final /* synthetic */ List A00;
    public final /* synthetic */ AnonymousClass3YH A01;

    public AnonymousClass4S6(List list, AnonymousClass3YH r2) {
        this.A01 = r2;
        this.A00 = list;
    }

    public final void run() {
        AnonymousClass3YH r6 = this.A01;
        List list = this.A00;
        AnonymousClass3Y2 r2 = r6.A05;
        AnonymousClass3Y2.A01(AnonymousClass28H.INFO, AnonymousClass3Y2.A00("report_events_compliant", (String) null, (Throwable) null, list), r2);
        AnonymousClass37Q r4 = r6.A00;
        AnonymousClass39I r0 = new AnonymousClass39I(list, r6);
        r4.A00.AMB(new PandoGraphQLRequest(C63233h2.A01(), "FetchAttributionEventComplianceAction", GraphQlCallInput.A00().A07(), GraphQlCallInput.A00().A07(), FetchAttributionEventComplianceActionResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fetch_attribution_event_compliance_action").setMaxToleratedCacheAgeMs(0).setFreshCacheAgeMs(0), new IDxFCallbackShape113S0200000_1_I2(1, r4, r0), AnonymousClass4WF.A00);
    }
}
