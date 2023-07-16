package X;

import com.facebook.graphql.impls.MetaPayConnectQueryResponseImpl;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.7eo  reason: invalid class name and case insensitive filesystem */
public final class C126227eo implements C27604EqD {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();

    public final /* bridge */ /* synthetic */ C146418mD build() {
        return new PandoGraphQLRequest(C63233h2.A01(), "MetaPayConnectQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), MetaPayConnectQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "meta_pay_wallet_connect_payload");
    }
}
