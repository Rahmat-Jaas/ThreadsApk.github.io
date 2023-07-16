package X;

import com.facebook.graphql.impls.FBPayMerchantServicesEarningsDetailsQueryResponseImpl;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.7f4  reason: invalid class name */
public final class AnonymousClass7f4 implements C27604EqD {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;
    public boolean A03 = false;

    public final /* bridge */ /* synthetic */ C146418mD build() {
        AnonymousClass7Ko.A0B(this.A02);
        return new PandoGraphQLRequest(C63233h2.A04(this.A03), "FBPayMerchantServicesEarningsDetailsQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), FBPayMerchantServicesEarningsDetailsQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "pay_financial_entity_wrapper");
    }
}
