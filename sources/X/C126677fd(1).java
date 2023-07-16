package X;

import com.facebook.graphql.impls.SubmitPayContainerMutationResponseImpl;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.7fd  reason: invalid class name and case insensitive filesystem */
public final class C126677fd implements C143358ga {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ C85754vi AB4() {
        return new PandoGraphQLRequest(C63233h2.A04(this.A02), "SubmitPayContainerMutation", this.A00.getParamsCopy(), this.A01.getParamsCopy(), SubmitPayContainerMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 12, "input", "submit_payment_container");
    }
}
