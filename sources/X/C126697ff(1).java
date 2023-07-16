package X;

import com.facebook.graphql.impls.ComponentDataMutationResponseImpl;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.7ff  reason: invalid class name and case insensitive filesystem */
public final class C126697ff implements C143358ga {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;
    public boolean A03 = false;

    public final /* bridge */ /* synthetic */ C85754vi AB4() {
        AnonymousClass7Ko.A0B(this.A02);
        return new PandoGraphQLRequest(C63233h2.A04(this.A03), "ComponentDataMutation", this.A00.getParamsCopy(), this.A01.getParamsCopy(), ComponentDataMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 12, "input", "fbpay_account_mutation");
    }
}
