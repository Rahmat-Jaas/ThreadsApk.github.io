package X;

import com.facebook.graphql.impls.AREffectConsentStateQueryResponseImpl;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.7en  reason: invalid class name and case insensitive filesystem */
public final class C126217en implements C27604EqD {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();

    public final /* bridge */ /* synthetic */ C146418mD build() {
        return new PandoGraphQLRequest(C63233h2.A01(), "AREffectConsentStateQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), AREffectConsentStateQueryResponseImpl.class, false, PandoRealtimeInfoJNI.forLiveQuery("flm_ar_effect_consent_state"), 0, (String) null, "viewer");
    }
}
