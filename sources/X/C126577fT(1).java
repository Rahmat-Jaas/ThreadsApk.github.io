package X;

import com.facebook.graphql.impls.FBPayLinkAccountMutationResponseImpl;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.7fT  reason: invalid class name and case insensitive filesystem */
public final class C126577fT implements C143358ga {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ C85754vi AB4() {
        return new PandoGraphQLRequest(C63233h2.A04(this.A02), "FBPayLinkAccountMutation", this.A00.getParamsCopy(), this.A01.getParamsCopy(), FBPayLinkAccountMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 12, "input", "fbpay_link_account");
    }
}
